package com.escuela.gce.exception;

import com.escuela.gce.helper.constants.ConstantsMessage;

public class ModelException extends Exception {

	public ModelException(String messageFriendly) {
		super(messageFriendly);
	}

	public ModelException() {
		super(ConstantsMessage.ERROR_DEFAULT);
	}

}
