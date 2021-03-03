package com.nextbasecrm.pages;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    //constructor
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //------Top side elements------

    //account username
    @FindBy(id = "user-name")
    public WebElement userName;

    //logout from dropdown menu
    @FindBy(linkText = "Log out")
    public WebElement logOut;

    //search bar
    @FindBy(id = "search-textbox-input")
    public WebElement searchTextboxInput;

    //CRM logo on top left
    @FindBy(id = "logo_24_text")
    public WebElement logo;

    //Site Map Menu on the top left
    @FindBy(css = "#sitemap-menu")
    public WebElement dropdownMenuNextToLogo;



    //------Dropdown menu elements when we click "dropdown Menu Next To Logo------

    //My Workspace from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'My Workspace')]")
    public WebElement myWorkspace;

    //Activity Stream from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Activity Stream')])[1]")
    public WebElement activityStreamFromDropdownMenu;

    //Tasks from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Tasks')])[1]")
    public WebElement tasksFromDropdownMenu;

    //Calendar under My workspace from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Calendar')])[1]")
    public WebElement calendarUnderMyWorkspaceFromDropdownMenu;

    //Drive under My Workspace from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "((//a[contains(text(), 'Drive')])[1]")
    public WebElement driveUnderMyWorkspaceFromDropdownMenu;

    //Conversations from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Conversations')]")
    public WebElement conversationsFromDropdownMenu;

    //Chat and Calls  from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Chat and Calls')]")
    public WebElement chatAndCallsFromDropdownMenu;

    //Mail from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Mail')]")
    public WebElement mailFromDropdownMenu;

    //Workflows under My Workspace from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Workflows')])[1]")
    public WebElement workflowsUnderMyWorkspaceFromDropdownMenu;

    //Calendar from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Calendar')])[2]")
    public WebElement calendarFromDropdownMenu;

    //My Calendar from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'My Calendar')]")
    public WebElement myCalendarFromDropdownMenu;

    //Company Calendar from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Company Calendar')]")
    public WebElement companyCalendarFromDropdownMenu;

    //Drive from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Drive')])[2]")
    public WebElement driveFromDropdownMenu;

    //My Drive from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'My Drive')]")
    public WebElement myDriveFromDropdownMenu;

    //All Documents from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'All Documents')]")
    public WebElement allDocumentsFromDropdownMenu;

    //Company Drive from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Company Drive')]")
    public WebElement companyDriveFromDropdownMenu;

    //Sales and Marketing  from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Sales and Marketing')]")
    public WebElement salesAndMarketingFromDropdownMenu;

    //Drive Cleanup from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Drive Cleanup')]")
    public WebElement driveCleanUpFromDropdownMenu;

    //Workgroups from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Workgroups')]")
    public WebElement workgroupsFromDropdownMenu;

    //New Corporate Identity project from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'New Corporate')]")
    public WebElement newCorporateIdentityProjectFromDropdownMenu;

    //Corporate Christmas Party from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Corporate Christmas')]")
    public WebElement corporateChristmasPartyFromDropdownMenu;

    //New company web site development from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'New company ')]")
    public WebElement newCompanyWebSiteDevelopmentFromDropdownMenu;

    //New product development from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'New product')]")
    public WebElement newProductDevelopmentFromDropdownMenu;

    //PR and advertising from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'PR')]")
    public WebElement prAndAdvertisingFromDropdownMenu;

    //Sales and marketing from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Sales')])[2]")
    public WebElement salesFromDropdownMenu;

    //Soccer team from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Soccer team')]")
    public WebElement soccerTeamFromDropdownMenu;

    //Technology from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Technology')]")
    public WebElement technologyFromDropdownMenu;

    //Workflows from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Workflows')])[2]")
    public WebElement workflowsFromDropdownMenu;

    //Workflow Tasks from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Workflow Tasks')]")
    public WebElement workflowTasksFromDropdownMenu;

    //My Request Tasks from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'My Request')]")
    public WebElement myRequestFromDropdownMenu;

    //Workflows in activity stream from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Workflows in')]")
    public WebElement workflowsInActivityStreamFromDropdownMenu;

    //Running Workflows from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Running')]")
    public WebElement runningWorkflowsFromDropdownMenu;

    //Employees from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Employees')])[1]")
    public WebElement employeesFromDropdownMenu;

    //Company Structure from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Company Structure')]")
    public WebElement companyStructureFromDropdownMenu;

    //Find Employee from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Find')]")
    public WebElement findEmployeeFromDropdownMenu;

    //Telephone Directory from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Telephone')]")
    public WebElement telephoneDirectoryFromDropdownMenu;

    //Staff Changes from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Staff')]")
    public WebElement staffChangesFromDropdownMenu;

    //Efficiency Report from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Efficiency')]")
    public WebElement efficiencyReportFromDropdownMenu;

    //Honored Employees from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Honored')]")
    public WebElement honoredEmployeesFromDropdownMenu;

    //Birthdays from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Birthdays')]")
    public WebElement birthdaysFromDropdownMenu;

    //Time and Reports from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Time and ')]")
    public WebElement timeAndReportsFromDropdownMenu;

    //Absence Chart from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Absence ')]")
    public WebElement absenceChartFromDropdownMenu;

    //Worktime from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Worktime')]")
    public WebElement worktimeFromDropdownMenu;

    //Bitrix24.Time from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Bitrix')]")
    public WebElement bitrix24TimeFromDropdownMenu;

    //Work Reports from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Work Reports')]")
    public WebElement workReportsFromDropdownMenu;

    //Meetings and Briefings from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Meetings')]")
    public WebElement meetingsAndBriefingsFromDropdownMenu;

    //Services from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Services')]")
    public WebElement servicesFromDropdownMenu;

    //Meeting Room Booking from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Meeting Room')]")
    public WebElement meetingRoomBookingFromDropdownMenu;

    //Ideas from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Ideas')]")
    public WebElement ideasFromDropdownMenu;

    //Lists from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Lists')]")
    public WebElement listsFromDropdownMenu;

    //e-Orders from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'e-Orders')]")
    public WebElement eOrdersFromDropdownMenu;

    //Training from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Training')]")
    public WebElement trainingFromDropdownMenu;

    //Wiki from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Wiki')]")
    public WebElement wikiFromDropdownMenu;

    //Contact Center under Services from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Contact Center')])[1]")
    public WebElement contactCenterUnderServicesFromDropdownMenu;

    //FAQ from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'FAQ')])[1]")
    public WebElement faqFromDropdownMenu;

    //Polls from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Polls')]")
    public WebElement pollsFromDropdownMenu;

    //Technical Support from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Technical')]")
    public WebElement technicalSupportFromDropdownMenu;

    //Link Directory from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Link')]")
    public WebElement linkDirectoryFromDropdownMenu;

    //Subscription from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Subscription')]")
    public WebElement subscriptionFromDropdownMenu;

    //Change Log from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Change Log')]")
    public WebElement changeLogFromDropdownMenu;

    //Classified from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Classifieds')]")
    public WebElement classifiedFromDropdownMenu;

    //Company from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "(//a[contains(text(), 'Company')])[4]")
    public WebElement companyFromDropdownMenu;

    //Official Information from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Official Information')]")
    public WebElement officialInformationFromDropdownMenu;

    //Our Life Information from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Our Life')]")
    public WebElement ourLifeFromDropdownMenu;

    //About Company Information from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'About Company')]")
    public WebElement aboutCompanyFromDropdownMenu;

    //Photo Gallery Information from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Photo')]")
    public WebElement photoGalleryFromDropdownMenu;

    //Video Information from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Video')]")
    public WebElement videoFromDropdownMenu;

    //Career from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Career')]")
    public WebElement careerFromDropdownMenu;

    //Business News (RSS) from the "dropdown Menu Next To Logo"
    @FindBy(xpath = "//a[contains(text(), 'Business')]")
    public WebElement businessNewsRssFromDropdownMenu;

    //------ Left side elements starting with Activity Stream-------

    //Activity Stream on the left side menu
    @FindBy(xpath = "(//span[contains(text(), 'Activity Stream')])[1]")
    public WebElement activityStream;

    //Tasks on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Tasks')]")
    public WebElement tasks;

    //Chat and Calls on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Chat')]")
    public WebElement chatAndCalls;

    //Workgroups on the left side menu
    @FindBy(xpath = "/span[contains(text(), 'Workgroups')]")
    public WebElement workGroups;

    //Drive on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Drive')]")
    public WebElement drive;

    //Calendar on the left side menu
    @FindBy(xpath = "/span[contains(text(), 'Calendar')]")
    public WebElement calendar;

    //Mail on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Mail')]")
    public WebElement mail;

    //Contact Center on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Contact Center')]")
    public WebElement contactCenter;

    //Time and Reports on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Time and Reports')]")
    public WebElement timeAndReports;

    //Employees on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Employees')]")
    public WebElement employees;

    //Services on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Services')]")
    public WebElement services;

    //Company on the left side menu
    @FindBy(xpath = "////span[contains(text(), 'Company')]")
    public WebElement company;

    //More on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'More')]")
    public WebElement more;

    //Hide on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Hide')]")
    public WebElement hide;

    //Hidden on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Hidden')]")
    public WebElement hidden;

    //Configure menu on the left side menu
    @FindBy(xpath = "//span[contains(text(), 'Configure menu')]")
    public WebElement configureMenu;

    //Applications on the left side menu
    @FindBy(xpath = "/span[contains(text(), 'Applications')]")
    public WebElement applications;

    //Workflows on the left side menu
    @FindBy(xpath = "(//span[contains(text(), 'Workflows')])[1]")
    public WebElement workflows;



    //------ Right side elements-------

    //Help Button  on the right side menu
    @FindBy(xpath = "#bx-help-block")
    public WebElement helpButton;

    //Notifications Button  on the right side menu
    @FindBy(xpath = "#bx-im-bar-notify")
    public WebElement notificationsButton;

    //Search Button  on the right side menu
    @FindBy(xpath = "#bx-im-bar-search")
    public WebElement searchButton;

    //Avatar Button  on the right side menu
    @FindBy(xpath = ".bx-messenger-cl-avatar")
    public WebElement avatarButton;

    //------ Username dropdown elements (right top) -------
    // user profile
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public static WebElement profileBtn;
    // my profile
    @FindBy(className = "menu-popup-item-text")
    public static WebElement myProfile;
    // profile edit
    @FindBy(xpath = "//span[contains(text(),\"Edit Profile\")]")
    public static WebElement editProfile;

}