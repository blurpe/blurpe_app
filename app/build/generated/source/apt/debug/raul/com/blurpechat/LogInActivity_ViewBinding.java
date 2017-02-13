
  private View view2131296276;

  @UiThread
  public LogInActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mUserEmail = Utils.findRequiredViewAsType(source, R.id.edit_text_email_login, "field 'mUserEmail'", EditText.class);
    target.mUserPassWord = Utils.findRequiredViewAsType(source, R.id.edit_text_password_log_in, "field 'mUserPassWord'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_login, "method 'logInClickListener'");
    view2131296275 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.logInClickListener(Utils.<Button>castParam(p0, "doClick", 0, "logInClickListener", 0));
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_register, "method 'registerClickListener'");
    view2131296276 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.registerClickListener(Utils.<Button>castParam(p0, "doClick", 0, "registerClickListener", 0));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mUserEmail = null;
    target.mUserPassWord = null;

    view2131296275.setOnClickListener(null);
    view2131296275 = null;
    view2131296276.setOnClickListener(null);
    view2131296276 = null;

    this.target = null;
  }
}
