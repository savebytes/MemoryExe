// Generated by view binder compiler. Do not edit!
package com.example.memoryexe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.memoryexe.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView LoginTitle;

  @NonNull
  public final TextInputEditText emailEt;

  @NonNull
  public final TextInputLayout emailLayout;

  @NonNull
  public final AppCompatButton loginBtn;

  @NonNull
  public final TextView loginDescription;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextInputEditText passET;

  @NonNull
  public final TextInputLayout passwordLayout;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull TextView LoginTitle,
      @NonNull TextInputEditText emailEt, @NonNull TextInputLayout emailLayout,
      @NonNull AppCompatButton loginBtn, @NonNull TextView loginDescription,
      @NonNull ImageView logo, @NonNull ConstraintLayout main, @NonNull TextInputEditText passET,
      @NonNull TextInputLayout passwordLayout) {
    this.rootView = rootView;
    this.LoginTitle = LoginTitle;
    this.emailEt = emailEt;
    this.emailLayout = emailLayout;
    this.loginBtn = loginBtn;
    this.loginDescription = loginDescription;
    this.logo = logo;
    this.main = main;
    this.passET = passET;
    this.passwordLayout = passwordLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Login_title;
      TextView LoginTitle = ViewBindings.findChildViewById(rootView, id);
      if (LoginTitle == null) {
        break missingId;
      }

      id = R.id.emailEt;
      TextInputEditText emailEt = ViewBindings.findChildViewById(rootView, id);
      if (emailEt == null) {
        break missingId;
      }

      id = R.id.emailLayout;
      TextInputLayout emailLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailLayout == null) {
        break missingId;
      }

      id = R.id.login_btn;
      AppCompatButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.login_description;
      TextView loginDescription = ViewBindings.findChildViewById(rootView, id);
      if (loginDescription == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.passET;
      TextInputEditText passET = ViewBindings.findChildViewById(rootView, id);
      if (passET == null) {
        break missingId;
      }

      id = R.id.passwordLayout;
      TextInputLayout passwordLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordLayout == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, LoginTitle, emailEt,
          emailLayout, loginBtn, loginDescription, logo, main, passET, passwordLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}