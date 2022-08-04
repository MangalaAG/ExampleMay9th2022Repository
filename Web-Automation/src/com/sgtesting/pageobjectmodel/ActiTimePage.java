package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//WebElement for Login Page UserName text field
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}

	//WebElement for Login Page Password text field
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}

	//WebElement for Login Page Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getoLogin() {
		return oLogin;
	}

	//WebElement for Home Page Flyout Window 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}

	//WebElement for Home Page Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getoLogout() {
		return oLogout;
	}

	//WebElement for User Button
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement user;
	public WebElement getUser() {
		return user;
	}

	//WebElement for Add User Button
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUser;
	public WebElement getoAddUser() {
		return oAddUser;
	}

	//WebElement for Create Page firstname text field
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}


	//WebElement for Create Page lastname text field
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}


	//WebElement for Create Page email text field
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}


	//WebElement for Create Page username text field
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserDataLightBox_usernameField() {
		return userDataLightBox_usernameField;
	}

	//WebElement for Create Page password text field
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}


	//WebElement for Create Page Retypepassword text field
	private WebElement passwordCopy;

	public WebElement getPasswordCopy() {
		return passwordCopy;
	}


	//WebElement for create user Button
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oCreateUser;
	public WebElement getoCreateUser() {
		return oCreateUser;
	}
	//WebElement for select existing user
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement oSelectUserTOModify;
	public WebElement getoSelectUserTOModify() {
		return oSelectUserTOModify;
	}
	//WebElement for Create Page modifyfirstname text field
		private WebElement userDataLightBox_firstNameField;
		public WebElement getuserDataLightBox_firstNameField() {
			return userDataLightBox_firstNameField;
		}
	
	//WebElement for modify user Button
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement oModifyUser;
		public WebElement getoModifyUser() {
			return oModifyUser;
		}


	//WebElement for click on userlink button
	@FindBy(xpath="//span[text()='User1, demo']")
	private WebElement oUserLink;

	public WebElement getoUserLink() {
		return oUserLink;
	}

	//WebElement for Delete Button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getUserDataLightBox_deleteBtn() {
		return userDataLightBox_deleteBtn;
	}
	//WebElement for task page  on tasks button
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement oTasks;
	public WebElement getoTasks() {
		return oTasks;
	}

	//WebElement for task page  on AddNew button
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement Addnew;
	public WebElement getAddnew() {
		return Addnew;
	}


	//WebElement for task page  on newCustomer button
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newCustomer;
	public WebElement getNewCustomer() {
		return newCustomer;
	}

	//WebElement for Tasks Page Customer name text field
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerLightBox_nameField() {
		return customerLightBox_nameField;
	}

	//WebElement for Tasks Page Customer name text field
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustomerLightBox_descriptionField() {
		return customerLightBox_descriptionField;
	}

	//WebElement for task page  on CreatCustomer button
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomer;

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	//WebElement for task page  on viewCustomerSetting button
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement viewCustomerSetting;
	public WebElement getViewCustomerSetting() {
		return viewCustomerSetting;
	}

	//WebElement for task page  on Action button
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement cAction;
	public WebElement getcAction() {
		return cAction;
	}

	//WebElement for task page  on Delete button
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement oDeleteCustomer;
	public WebElement getoDeleteCustomer() {
		return oDeleteCustomer;
	}

	//WebElement for Tasks Page DeleteConform button
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getCustomerPanel_deleteConfirm_submitTitle() {
		return customerPanel_deleteConfirm_submitTitle;
	}

	//WebElement for task page  on newProject button
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newProject;
	public WebElement getNewProject() {
		return newProject;
	}


	//WebElement for Tasks Page Project name text field
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectPopup_projectNameField() {
		return projectPopup_projectNameField;
	}


	//WebElement for task page  on selectCustomer button
	@FindBy(xpath="//button[text()='-- New Customer --']")
	private WebElement selectCustomer;
	public WebElement getSelectCustomer() {
		return selectCustomer;
	}


	//WebElement for Tasks Page selectCustomer1 button
	@FindBy(xpath="//*[@id=\'ext-gen450\']")
	private WebElement selectCustomer1;
	public WebElement getSelectCustomer1() {
		return selectCustomer1;
	}

	//WebElement for Tasks Page Project description text field
	private WebElement projectDescriptionField;
	public WebElement getProjectDescriptionField() {
		return projectDescriptionField;
	}
	//WebElement for task page  on ceateProjrct button
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement oCeateProjrct;
	public WebElement getoCeateProjrct() {
		return oCeateProjrct;
	}

	//WebElement for task page  on viewProjectSetting button
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement viewProjectSetting;
	public WebElement getViewProjectSetting() {
		return viewProjectSetting;
	}

	//WebElement for task page  on Project Action button
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement pAction;
	public WebElement getpAction() {
		return pAction;
	}
	//WebElement for task page  on Delete button
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement oDeleteProject;
	public WebElement getoDeleteProject() {
		return oDeleteProject;
	}

	//WebElement for Tasks Page DeleteConform button
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getProjectPanel_deleteConfirm_submitTitle() {
		return projectPanel_deleteConfirm_submitTitle;
	}

	//WebElement for task page  on add new task button
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement oAddNewTask;
	public WebElement getoAddNewTask() {
		return oAddNewTask;
	}

	//WebElement for task page  on create new task button
	@FindBy(xpath="//*[@id=\'ext-gen199\']/div[13]/div[1]")
	private WebElement oCreateNewTask;
	public WebElement getoCreateNewTask() {
		return oCreateNewTask;
	}

	//WebElement for task page  task name field
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement oTaskName;
	public WebElement getoTaskName() {
		return oTaskName;
	}

	//WebElement for task page  on createTask button
	@FindBy(xpath="//span[text()='Create Tasks'")
	private WebElement oCreateTask;
	public WebElement getoCreateTask() {
		return oCreateTask;
	}

	//WebElement for task page  on selectTask button
	@FindBy(xpath="//div[text()='t']")
	private WebElement oSelectTask;
	public WebElement getoSelectTask() {
		return oSelectTask;
	}


	//WebElement for task page  on Task Action button
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement tAction;
	public WebElement gettAction() {
		return tAction;
	}

	//WebElement for task page  on Delete button
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement oDeleteTask;
	public WebElement getoDeleteTask() {
		return oDeleteTask;
	}

	//WebElement for Tasks Page DeleteConform button
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getTaskPanel_deleteConfirm_submitTitle() {
		return taskPanel_deleteConfirm_submitTitle;
	}

























































}
