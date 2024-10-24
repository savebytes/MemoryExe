// Generated by view binder compiler. Do not edit!
package com.example.memoryexe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.memoryexe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogDownloadBoardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText etDownloadGame;

  private DialogDownloadBoardBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText etDownloadGame) {
    this.rootView = rootView;
    this.etDownloadGame = etDownloadGame;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogDownloadBoardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogDownloadBoardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_download_board, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogDownloadBoardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etDownloadGame;
      EditText etDownloadGame = ViewBindings.findChildViewById(rootView, id);
      if (etDownloadGame == null) {
        break missingId;
      }

      return new DialogDownloadBoardBinding((ConstraintLayout) rootView, etDownloadGame);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
