
    
        
        

        package com.example.hairelementsapp;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.widget.Button;
        import android.widget.EditText;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.TextView;
        import android.widget.Toast;
        import com.parse.ParseUser;
        import com.parse.ParseException;
        import com.parse.LogInCallback;
        import android.app.ProgressDialog;
        import android.view.KeyEvent;
        import android.view.inputmethod.EditorInfo;

public class UserLoginScreen extends Activity {
    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.user_login_screen);

        // Set up the login form.
        usernameEditText = (EditText) findViewById(R.id.username);
        passwordEditText = (EditText) findViewById(R.id.passwordText);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == R.id.edittext_action_login ||
                        actionId == EditorInfo.IME_ACTION_UNSPECIFIED) {
                    login();
                    return true;
                }
                return false;
            }
        });

        // Set up the submit button click handler
        Button actionButton = (Button) findViewById(R.id.buttonUserLogin);
        actionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                login();
            }
        });


        Button buttonTwo = (Button) findViewById(R.id.buttonUserRegistration);

        buttonTwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), UserRegistration.class);
                startActivity(intent);
            }
        });
    }

    private void login() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Validate the log in data
        boolean validationError = false;
        StringBuilder validationErrorMessage = new StringBuilder(getString(R.string.error_intro));
        if (username.length() == 0) {
            validationError = true;
            validationErrorMessage.append(getString(R.string.error_blank_username));
        }
        if (password.length() == 0) {
            if (validationError) {
                validationErrorMessage.append(getString(R.string.error_join));
            }
            validationError = true;
            validationErrorMessage.append(getString(R.string.error_blank_password));
        }
        validationErrorMessage.append(getString(R.string.error_end));

        // If there is a validation error, display the error
        if (validationError) {
            Toast.makeText(UserLoginScreen.this, validationErrorMessage.toString(), Toast.LENGTH_LONG)
                    .show();
            return;
        }

        // Set up a progress dialog
        final ProgressDialog dialog = new ProgressDialog(UserLoginScreen.this);
        dialog.setMessage(getString(R.string.progress_login));
        dialog.show();


        // Call the Parse login method
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                dialog.dismiss();
                if (e != null) {
                    // Show the error message
                    Toast.makeText(UserLoginScreen.this, e.getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    // Start an intent for the dispatch activity
                    Intent intent = new Intent(UserLoginScreen.this, DispatchActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}
