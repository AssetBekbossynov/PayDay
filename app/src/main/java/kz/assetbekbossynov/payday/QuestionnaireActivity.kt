package kz.assetbekbossynov.payday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import kotlinx.android.synthetic.main.input_fields.*
import kotlinx.android.synthetic.main.input_fields.zip as zipInput
import kotlinx.android.synthetic.main.input_fields.state as stateInput
import kotlinx.android.synthetic.main.input_fields.city as cityInput
import kotlinx.android.synthetic.main.input_fields.address as addressInput
import kotlinx.android.synthetic.main.input_fields.email as emailInput
import kotlinx.android.synthetic.main.input_fields.military as militaryInput
import kotlinx.android.synthetic.main.input_fields.employer as employerInput
import kotlinx.android.synthetic.main.input_fields.ssn as ssnInput

class QuestionnaireActivity : AppCompatActivity() {

    internal lateinit var requestedAmount : TextInputLayout
    internal lateinit var firstName: TextInputLayout
    internal lateinit var lastName: TextInputLayout
    internal lateinit var zip: TextInputLayout
    internal lateinit var state: TextInputLayout
    internal lateinit var city: TextInputLayout
    internal lateinit var address: TextInputLayout
    internal lateinit var addressSince: TextInputLayout
    internal lateinit var birthDate: TextInputLayout
    internal lateinit var email : TextInputLayout
    internal lateinit var ownHome: TextInputLayout
    internal lateinit var homePhone: TextInputLayout
    internal lateinit var workPhone: TextInputLayout
    internal lateinit var military: TextInputLayout
    internal lateinit var timeToCall: TextInputLayout
    internal lateinit var employer: TextInputLayout
    internal lateinit var jobTitle: TextInputLayout
    internal lateinit var employedMonth: TextInputLayout
    internal lateinit var monthlyIncome: TextInputLayout
    internal lateinit var payDate1: TextInputLayout
    internal lateinit var payDate2: TextInputLayout
    internal lateinit var payFrequency: TextInputLayout
    internal lateinit var driversLicense: TextInputLayout
    internal lateinit var driversLicenseState: TextInputLayout
    internal lateinit var bankName: TextInputLayout
    internal lateinit var bankPhone: TextInputLayout
    internal lateinit var bankAba: TextInputLayout
    internal lateinit var bankAccount: TextInputLayout
    internal lateinit var bankAccountType: TextInputLayout
    internal lateinit var directDeposit: TextInputLayout
    internal lateinit var ssn: TextInputLayout
    internal lateinit var bankAccountSince: TextInputLayout
    internal lateinit var incomeType: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_fields)

        val intent = intent

        initializeViews()
    }

    fun initializeViews(){
        requestedAmount = requested_amount.findViewById(R.id.value)
        firstName = first_name.findViewById(R.id.value)
        lastName = last_name.findViewById(R.id.value)
        zip = zipInput.findViewById(R.id.value)
        state = stateInput.findViewById(R.id.value)
        city = cityInput.findViewById(R.id.value)
        address = addressInput.findViewById(R.id.value)
        addressSince = address_since.findViewById(R.id.value)
        birthDate = birth_date.findViewById(R.id.value)
        email  = emailInput.findViewById(R.id.value)
        ownHome = own_home.findViewById(R.id.value)
        homePhone = home_phone.findViewById(R.id.value)
        workPhone = work_phone.findViewById(R.id.value)
        military = militaryInput.findViewById(R.id.value)
        timeToCall = time_to_call.findViewById(R.id.value)
        employer = employerInput.findViewById(R.id.value)
        jobTitle = job_title.findViewById(R.id.value)
        employedMonth = employed_month.findViewById(R.id.value)
        monthlyIncome = monthly_income.findViewById(R.id.value)
        payDate1 = pay_date1.findViewById(R.id.value)
        payDate2 = pay_date2.findViewById(R.id.value)
        payFrequency = pay_frequency.findViewById(R.id.value)
        driversLicense = driver_license.findViewById(R.id.value)
        driversLicenseState = driver_license_state.findViewById(R.id.value)
        bankName = bank_name.findViewById(R.id.value)
        bankPhone = bank_phone.findViewById(R.id.value)
        bankAba = bank_aba.findViewById(R.id.value)
        bankAccount = bank_account.findViewById(R.id.value)
        bankAccountType = bank_account_type.findViewById(R.id.value)
        directDeposit = direct_deposit.findViewById(R.id.value)
        ssn = ssnInput.findViewById(R.id.value)
        bankAccountSince = bank_account_since.findViewById(R.id.value)
        incomeType = income_type.findViewById(R.id.value)

        requestedAmount.hint = "Requested amount"
        firstName.hint = "First name"
        lastName.hint = "Last name"
        zip.hint = "ZIP code"
        state.hint = "State"
        city.hint = "City"
        address.hint = "Address"
        addressSince.hint = "Address since"
        birthDate.hint = "Birth date"
        email .hint = "Email"
        ownHome.hint = "Residence status"
        homePhone.hint = "Home phone number"
        workPhone.hint = "Work phone number"
        military.hint = "Military status"
        timeToCall.hint = "Time to call"
        employer.hint = "Employer name"
        jobTitle.hint = "Job title"
        employedMonth.hint = "Employed since"
        monthlyIncome.hint = "Monthly income"
        payDate1.hint = "Pay date 1"
        payDate2.hint = "Pay date 2"
        payFrequency.hint = "Pay frequency"
        driversLicense.hint = "Drivers license number"
        driversLicenseState.hint = "Drivers license state"
        bankName.hint = "Bank name"
        bankPhone.hint = "Bank phone number"
        bankAba.hint = "Bank ABA"
        bankAccount.hint = "Bank account number"
        bankAccountType.hint = "Bank account type"
        directDeposit.hint = "Direct deposit?"
        ssn.hint = "Social security number"
        bankAccountSince.hint = "Bank account since"
        incomeType.hint = "Income type"

    }
}
