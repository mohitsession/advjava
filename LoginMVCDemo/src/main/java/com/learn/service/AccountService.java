package com.learn.service;

import com.learn.bean.AccountBean;
import com.learn.dao.AccountDAO;

public class AccountService {

	AccountDAO accountDAO = new AccountDAO();

	public String authenticateAndPopulateAccountBean(AccountBean accountBean) {

		String error = null;
		accountBean = accountDAO.getAccountBean(accountBean);

		if (accountBean.getEmail() == null) {
			error = "Invalid username or password";
		}

		return error;
	}

}
