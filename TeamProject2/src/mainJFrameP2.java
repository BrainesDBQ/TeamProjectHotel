//Peter Goodmann & Brandon Raines
//CIS 315-01 Team Project 2
//The purpose of this project is to allow users to select and reserve a hotel room based on its size and features. 

//There is a fairly consistent format for font and size, all Century Gothic at either 15 or 17 pt. size


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;

public class mainJFrameP2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCheckInDate;
	private JTextField textFieldCheckOutDate;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldEmailAddress;
	private JTextField textFieldCreditCardNumber;
	private JTextField textFieldExpirationDate;
	private JTextField textFieldCCV;

	/**
	 * Launch the application.
	 */
	//build the outline of the JFrame
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainJFrameP2 frame = new mainJFrameP2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainJFrameP2() {
		//title of the JFrame
		setTitle("UD Hotels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//size of the JFrame
		setBounds(100, 100, 938, 942);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//include a Slide Bar element to selelct the number of guests
		JSlider sliderNumberOfGuests = new JSlider();
		sliderNumberOfGuests.setForeground(Color.BLUE);
		sliderNumberOfGuests.setValue(1);
		sliderNumberOfGuests.setBounds(285, 214, 352, 50);
		//5 is the maximum number of guests per room
		sliderNumberOfGuests.setMaximum(5);
		sliderNumberOfGuests.setMajorTickSpacing(1);
		//Snap to ticks keeps users from entering anything but a whole number for guest head-count
		sliderNumberOfGuests.setSnapToTicks(true);
		sliderNumberOfGuests.setPaintTicks(true);
		sliderNumberOfGuests.setPaintLabels(true);
		contentPane.add(sliderNumberOfGuests);
		
		//label to show where to enter check in date
		JLabel labelCheckInDate = new JLabel("Check-In Date:");
		labelCheckInDate.setForeground(Color.BLUE);
		labelCheckInDate.setBounds(159, 109, 140, 14);
		labelCheckInDate.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		contentPane.add(labelCheckInDate);
		
		//text field to enter check in date
		textFieldCheckInDate = new JTextField();
		textFieldCheckInDate.setBounds(153, 134, 128, 20);
		contentPane.add(textFieldCheckInDate);
		textFieldCheckInDate.setColumns(10);
		
		//label to show where to enter check out date
		JLabel labelCheckoutDate = new JLabel("Check-Out Date:");
		labelCheckoutDate.setForeground(Color.BLUE);
		labelCheckoutDate.setBounds(583, 109, 152, 14);
		labelCheckoutDate.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		contentPane.add(labelCheckoutDate);
		
		//text field to enter check out date
		textFieldCheckOutDate = new JTextField();
		textFieldCheckOutDate.setBounds(583, 134, 128, 20);
		textFieldCheckOutDate.setColumns(10);
		contentPane.add(textFieldCheckOutDate);
		
		//label for the slide bar, used to select number of guests
		JLabel labelNumberOfGuests = new JLabel("Please Select the Number of Guests");
		labelNumberOfGuests.setForeground(Color.BLUE);
		labelNumberOfGuests.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumberOfGuests.setBounds(288, 189, 345, 14);
		labelNumberOfGuests.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		contentPane.add(labelNumberOfGuests);
		
		//label to show example of proper input format
		JLabel labelMDYin = new JLabel("(MM/DD/YYYY)");
		labelMDYin.setForeground(Color.BLUE);
		labelMDYin.setFont(new Font("Century Gothic", Font.BOLD, 11));
		labelMDYin.setBounds(291, 136, 84, 14);
		contentPane.add(labelMDYin);
		
		//label to show example of proper input format
		JLabel labelMDYout = new JLabel("(MM/DD/YYYY)");
		labelMDYout.setForeground(Color.BLUE);
		labelMDYout.setFont(new Font("Century Gothic", Font.BOLD, 11));
		labelMDYout.setBounds(721, 136, 84, 14);
		contentPane.add(labelMDYout);
		
		//University of Dubuque Hotels title bar
		JLabel labelWelcomeTitle = new JLabel("Welcome to University of Dubuque Hotels");
		labelWelcomeTitle.setForeground(Color.BLUE);
		labelWelcomeTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelWelcomeTitle.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelWelcomeTitle.setBounds(254, 31, 413, 37);
		contentPane.add(labelWelcomeTitle);
		
		//label over radio buttons, used for selecting room size
		JLabel labelTypeOfRoom = new JLabel("Please Select the Type of Room:");
		labelTypeOfRoom.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		labelTypeOfRoom.setHorizontalAlignment(SwingConstants.CENTER);
		labelTypeOfRoom.setBounds(153, 294, 296, 28);
		contentPane.add(labelTypeOfRoom);
		
		//radio button to select single queen room 
		JRadioButton rdbtnSingleQueenBed = new JRadioButton("Single Queen Budget");
		rdbtnSingleQueenBed.setForeground(Color.BLUE);
		rdbtnSingleQueenBed.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnSingleQueenBed.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnSingleQueenBed.setBounds(230, 341, 207, 23);
		contentPane.add(rdbtnSingleQueenBed);
		
		//radio button to select double queen room 
		JRadioButton rdbtnDoubleQueenBed = new JRadioButton("Double Queen Budget");
		rdbtnDoubleQueenBed.setForeground(Color.BLUE);
		rdbtnDoubleQueenBed.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDoubleQueenBed.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnDoubleQueenBed.setBounds(230, 367, 207, 23);
		contentPane.add(rdbtnDoubleQueenBed);
		
		//radio button to select deluxe queen room 
		JRadioButton rdbtnDeluxeQueen = new JRadioButton("Deluxe Queen");
		rdbtnDeluxeQueen.setForeground(Color.BLUE);
		rdbtnDeluxeQueen.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDeluxeQueen.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnDeluxeQueen.setBounds(230, 393, 207, 23);
		contentPane.add(rdbtnDeluxeQueen);
		
		//radio button to select deluxe king room 
		JRadioButton rdbtnDeluxeKing = new JRadioButton("Deluxe King");
		rdbtnDeluxeKing.setForeground(Color.BLUE);
		rdbtnDeluxeKing.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnDeluxeKing.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnDeluxeKing.setBounds(230, 419, 207, 23);
		contentPane.add(rdbtnDeluxeKing);
		
		//radio button to select Executive Suite
		JRadioButton rdbtnExecutiveSuite = new JRadioButton("Executive Suite");
		rdbtnExecutiveSuite.setForeground(Color.BLUE);
		rdbtnExecutiveSuite.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnExecutiveSuite.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnExecutiveSuite.setBounds(230, 445, 207, 23);
		contentPane.add(rdbtnExecutiveSuite);
		
		//radio button to select Honeymoon Suite
		JRadioButton rdbtnHoneymoonSuite = new JRadioButton("Honeymoon Suite");
		rdbtnHoneymoonSuite.setForeground(Color.BLUE);
		rdbtnHoneymoonSuite.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnHoneymoonSuite.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnHoneymoonSuite.setBounds(230, 471, 207, 23);
		contentPane.add(rdbtnHoneymoonSuite);
		
		//radio button to select presidential suite
		JRadioButton rdbtnPresidentialSuite = new JRadioButton("Presidential Suite");
		rdbtnPresidentialSuite.setForeground(Color.BLUE);
		rdbtnPresidentialSuite.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnPresidentialSuite.setFont(new Font("Century Gothic", Font.BOLD, 15));
		rdbtnPresidentialSuite.setBounds(230, 497, 207, 23);
		contentPane.add(rdbtnPresidentialSuite);
		
		//checkbox to indicate smoking friendly room 
		JCheckBox chckbxSmoking = new JCheckBox("Smoking ");
		chckbxSmoking.setForeground(Color.BLUE);
		chckbxSmoking.setFont(new Font("Century Gothic", Font.BOLD, 15));
		chckbxSmoking.setBounds(570, 341, 134, 23);
		contentPane.add(chckbxSmoking);
		
		//label over checkboxes, used to select any special requirments of the room 
		JLabel labelSpecialRequirements = new JLabel("Please Select Any Special Requirements:");
		labelSpecialRequirements.setHorizontalAlignment(SwingConstants.LEFT);
		labelSpecialRequirements.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		labelSpecialRequirements.setBounds(469, 294, 336, 28);
		contentPane.add(labelSpecialRequirements);
		
		//checkbox to indicate a non-smoking room 
		JCheckBox chckbxNonsmoking = new JCheckBox("Non-Smoking ");
		chckbxNonsmoking.setForeground(Color.BLUE);
		chckbxNonsmoking.setFont(new Font("Century Gothic", Font.BOLD, 15));
		chckbxNonsmoking.setBounds(570, 367, 134, 23);
		contentPane.add(chckbxNonsmoking);
		
		//checkbox to indicate if the guest will bring a pet
		JCheckBox chckbxPetfriendly = new JCheckBox("Pet-Friendly");
		chckbxPetfriendly.setForeground(Color.BLUE);
		chckbxPetfriendly.setFont(new Font("Century Gothic", Font.BOLD, 15));
		chckbxPetfriendly.setBounds(570, 393, 134, 23);
		contentPane.add(chckbxPetfriendly);
		
		//checkbox for users to select a room on the ground floor
		JCheckBox chckbxGroundFloor = new JCheckBox("Ground Floor");
		chckbxGroundFloor.setForeground(Color.BLUE);
		chckbxGroundFloor.setFont(new Font("Century Gothic", Font.BOLD, 15));
		chckbxGroundFloor.setBounds(570, 420, 134, 23);
		contentPane.add(chckbxGroundFloor);
		
		//checkbox used to choose a room with a balcony
		JCheckBox chckbxBalcony = new JCheckBox("Balcony");
		chckbxBalcony.setForeground(Color.BLUE);
		chckbxBalcony.setFont(new Font("Century Gothic", Font.BOLD, 15));
		chckbxBalcony.setBounds(570, 446, 134, 23);
		contentPane.add(chckbxBalcony);
		
		//This button will submit the form and all data entered
		JButton btnSubmitForm = new JButton("Submit Form");
		btnSubmitForm.setForeground(Color.BLUE);
		btnSubmitForm.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnSubmitForm.setBounds(469, 869, 128, 23);
		contentPane.add(btnSubmitForm);
		
		//This button resets all fields to default
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnReset.setBounds(316, 869, 128, 23);
		contentPane.add(btnReset);
		
		//Title to indicate where users will enter their personal information
		JLabel labelGuestInformation = new JLabel("Guest Information");
		labelGuestInformation.setForeground(Color.BLUE);
		labelGuestInformation.setHorizontalAlignment(SwingConstants.CENTER);
		labelGuestInformation.setFont(new Font("Century Gothic", Font.BOLD, 17));
		labelGuestInformation.setBounds(375, 581, 171, 28);
		contentPane.add(labelGuestInformation);
		
		//stylistic separator used to divide the page
		JSeparator separator = new JSeparator();
		separator.setBounds(106, 555, 710, 14);
		contentPane.add(separator);
		
		//label shows where to enter users phone number
		JLabel labelPhoneNumber = new JLabel("Phone Number:");
		labelPhoneNumber.setForeground(Color.BLUE);
		labelPhoneNumber.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelPhoneNumber.setBounds(135, 792, 128, 28);
		contentPane.add(labelPhoneNumber);
		
		//text field used to enter users phone number
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setBounds(135, 822, 146, 20);
		contentPane.add(textFieldPhoneNumber);
		textFieldPhoneNumber.setColumns(10);
		
		//label shows where to enter the users first name
		JLabel labelFirstName = new JLabel("First Name:");
		labelFirstName.setForeground(Color.BLUE);
		labelFirstName.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelFirstName.setBounds(136, 617, 105, 28);
		contentPane.add(labelFirstName);
		
		//text field used to enter the users first name
		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(136, 643, 145, 20);
		contentPane.add(textFieldFirstName);
		
		//label indicates where to enter the users last name
		JLabel labelLastName = new JLabel("Last Name:");
		labelLastName.setForeground(Color.BLUE);
		labelLastName.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelLastName.setBounds(136, 674, 105, 28);
		contentPane.add(labelLastName);
		
		//text field used to enter the users last name
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(136, 701, 145, 20);
		contentPane.add(textFieldLastName);
		
		//this label is used to show an example of how the users phone number should be inputed 
		JLabel labelExamplePhone = new JLabel("(XXX) XXX-XXXX");
		labelExamplePhone.setForeground(Color.BLUE);
		labelExamplePhone.setFont(new Font("Century Gothic", Font.BOLD, 11));
		labelExamplePhone.setBounds(285, 824, 95, 14);
		contentPane.add(labelExamplePhone);
		
		//this indicates where users should enter their email address
		JLabel labelEmailAddress = new JLabel("Email Address:");
		labelEmailAddress.setForeground(Color.BLUE);
		labelEmailAddress.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelEmailAddress.setBounds(135, 732, 128, 28);
		contentPane.add(labelEmailAddress);
		
		//text field used to enter the users email address
		textFieldEmailAddress = new JTextField();
		textFieldEmailAddress.setColumns(10);
		textFieldEmailAddress.setBounds(135, 761, 145, 20);
		contentPane.add(textFieldEmailAddress);
		
		//label over radio buttons, used to select a credit card type
		JLabel labelCreditCardType = new JLabel("Credit Card Type:");
		labelCreditCardType.setForeground(Color.BLUE);
		labelCreditCardType.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCreditCardType.setBounds(657, 617, 130, 28);
		contentPane.add(labelCreditCardType);
		
		//radio button used to select a visa card
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnVisa.setBounds(602, 640, 157, 23);
		contentPane.add(rdbtnVisa);
		
		//radio button used to select a mastercard
		JRadioButton rdbtnMastercard = new JRadioButton("MasterCard");
		rdbtnMastercard.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnMastercard.setBounds(761, 640, 128, 23);
		contentPane.add(rdbtnMastercard);
		
		//radio button used to select an american express card
		JRadioButton rdbtnAmericanExpress = new JRadioButton("American Express");
		rdbtnAmericanExpress.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnAmericanExpress.setBounds(602, 663, 157, 23);
		contentPane.add(rdbtnAmericanExpress);
		
		//radio button used to select discover card
		JRadioButton rdbtnDiscover = new JRadioButton("Discover");
		rdbtnDiscover.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnDiscover.setBounds(761, 665, 128, 23);
		contentPane.add(rdbtnDiscover);
		
		//this label shows users where to enter their credit card number
		JLabel labelCreditCardNumber = new JLabel("Credit Card Number:");
		labelCreditCardNumber.setForeground(Color.BLUE);
		labelCreditCardNumber.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCreditCardNumber.setBounds(657, 695, 171, 28);
		contentPane.add(labelCreditCardNumber);
		
		//text field used to enter the users credit card number
		textFieldCreditCardNumber = new JTextField();
		textFieldCreditCardNumber.setBounds(625, 722, 219, 20);
		contentPane.add(textFieldCreditCardNumber);
		textFieldCreditCardNumber.setColumns(10);
		
		//this label indicates where to enter the credit card's expiration date
		JLabel labelExpirationDate = new JLabel("Expiration Date:");
		labelExpirationDate.setForeground(Color.BLUE);
		labelExpirationDate.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelExpirationDate.setBounds(625, 755, 121, 28);
		contentPane.add(labelExpirationDate);
		
		//this is where users will enter their credit cards expiration date
		textFieldExpirationDate = new JTextField();
		textFieldExpirationDate.setBounds(758, 761, 86, 20);
		contentPane.add(textFieldExpirationDate);
		textFieldExpirationDate.setColumns(10);
		
		//this label indicates where users should enter the CCV code on their credit card
		JLabel labelCcvCode = new JLabel("CCV Code:");
		labelCcvCode.setForeground(Color.BLUE);
		labelCcvCode.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCcvCode.setBounds(625, 792, 121, 28);
		contentPane.add(labelCcvCode);
		
		//text field used to enter the CCV code
		textFieldCCV = new JTextField();
		textFieldCCV.setBounds(758, 798, 86, 20);
		contentPane.add(textFieldCCV);
		textFieldCCV.setColumns(10);
	}
}
