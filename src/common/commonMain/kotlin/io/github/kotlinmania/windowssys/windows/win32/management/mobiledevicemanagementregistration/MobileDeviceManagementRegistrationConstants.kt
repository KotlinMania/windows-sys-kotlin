package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.Hresult

public val DEVICEREGISTRATIONTYPE_MAM: UInt = 5u

public val DEVICEREGISTRATIONTYPE_MDM_DEVICEWIDE_WITH_AAD: UInt = 6u

public val DEVICEREGISTRATIONTYPE_MDM_ONLY: UInt = 0u

public val DEVICEREGISTRATIONTYPE_MDM_USERSPECIFIC_WITH_AAD: UInt = 13u

public val DEVICE_ENROLLER_FACILITY_CODE: UInt = 24u

public val DEVICE_REGISTRATION_BASIC_INFO: RegistrationInformationClass = 1

public val MDM_REGISTRATION_FACILITY_CODE: UInt = 25u

public val MENROLL_E_CERTAUTH_FAILED_TO_FIND_CERT: Hresult = 0x80180028u.toInt()

public val MENROLL_E_CERTPOLICY_PRIVATEKEYCREATION_FAILED: Hresult = 0x80180027u.toInt()

public val MENROLL_E_CONNECTIVITY: Hresult = 0x80180010u.toInt()

public val MENROLL_E_CUSTOMSERVERERROR: Hresult = 0x80180032u.toInt()

public val MENROLL_E_DEVICECAPREACHED: Hresult = 0x80180013u.toInt()

public val MENROLL_E_DEVICENOTSUPPORTED: Hresult = 0x80180014u.toInt()

public val MENROLL_E_DEVICE_ALREADY_ENROLLED: Hresult = 0x8018000Au.toInt()

public val MENROLL_E_DEVICE_AUTHENTICATION_ERROR: Hresult = 0x80180002u.toInt()

public val MENROLL_E_DEVICE_AUTHORIZATION_ERROR: Hresult = 0x80180003u.toInt()

public val MENROLL_E_DEVICE_CERTIFCATEREQUEST_ERROR: Hresult = 0x80180004u.toInt()

public val MENROLL_E_DEVICE_CERTIFICATEREQUEST_ERROR: Hresult = 0x80180004u.toInt()

public val MENROLL_E_DEVICE_CONFIGMGRSERVER_ERROR: Hresult = 0x80180005u.toInt()

public val MENROLL_E_DEVICE_INTERNALSERVICE_ERROR: Hresult = 0x80180006u.toInt()

public val MENROLL_E_DEVICE_INVALIDSECURITY_ERROR: Hresult = 0x80180007u.toInt()

public val MENROLL_E_DEVICE_MANAGEMENT_BLOCKED: Hresult = 0x80180026u.toInt()

public val MENROLL_E_DEVICE_MESSAGE_FORMAT_ERROR: Hresult = 0x80180001u.toInt()

public val MENROLL_E_DEVICE_NOT_ENROLLED: Hresult = 0x8018000Bu.toInt()

public val MENROLL_E_DEVICE_UNKNOWN_ERROR: Hresult = 0x80180008u.toInt()

public val MENROLL_E_DISCOVERY_SEC_CERT_DATE_INVALID: Hresult = 0x8018000Du.toInt()

public val MENROLL_E_EMPTY_MESSAGE: Hresult = 0x80180029u.toInt()

public val MENROLL_E_ENROLLMENTDATAINVALID: Hresult = 0x80180019u.toInt()

public val MENROLL_E_ENROLLMENT_IN_PROGRESS: Hresult = 0x80180009u.toInt()

public val MENROLL_E_INMAINTENANCE: Hresult = 0x80180017u.toInt()

public val MENROLL_E_INSECUREREDIRECT: Hresult = 0x8018001Au.toInt()

public val MENROLL_E_INVALIDSSLCERT: Hresult = 0x80180012u.toInt()

public val MENROLL_E_MDM_NOT_CONFIGURED: Hresult = 0x80180031u.toInt()

public val MENROLL_E_NOTELIGIBLETORENEW: Hresult = 0x80180016u.toInt()

public val MENROLL_E_NOTSUPPORTED: Hresult = 0x80180015u.toInt()

public val MENROLL_E_NOT_SUPPORTED: Hresult = 0x80180015u.toInt()

public val MENROLL_E_PASSWORD_NEEDED: Hresult = 0x8018000Eu.toInt()

public val MENROLL_E_PLATFORM_LICENSE_ERROR: Hresult = 0x8018001Cu.toInt()

public val MENROLL_E_PLATFORM_UNKNOWN_ERROR: Hresult = 0x8018001Du.toInt()

public val MENROLL_E_PLATFORM_WRONG_STATE: Hresult = 0x8018001Bu.toInt()

public val MENROLL_E_PROV_CSP_APPMGMT: Hresult = 0x80180025u.toInt()

public val MENROLL_E_PROV_CSP_CERTSTORE: Hresult = 0x8018001Eu.toInt()

public val MENROLL_E_PROV_CSP_DMCLIENT: Hresult = 0x80180020u.toInt()

public val MENROLL_E_PROV_CSP_MISC: Hresult = 0x80180022u.toInt()

public val MENROLL_E_PROV_CSP_PFW: Hresult = 0x80180021u.toInt()

public val MENROLL_E_PROV_CSP_W7: Hresult = 0x8018001Fu.toInt()

public val MENROLL_E_PROV_SSLCERTNOTFOUND: Hresult = 0x80180024u.toInt()

public val MENROLL_E_PROV_UNKNOWN: Hresult = 0x80180023u.toInt()

public val MENROLL_E_USERLICENSE: Hresult = 0x80180018u.toInt()

public val MENROLL_E_USER_CANCELED: Hresult = 0x8018002Au.toInt()

public val MENROLL_E_USER_CANCELLED: Hresult = 0x80180030u.toInt()

public val MENROLL_E_USER_LICENSE: Hresult = 0x80180018u.toInt()

public val MENROLL_E_WAB_ERROR: Hresult = 0x8018000Fu.toInt()

public val MREGISTER_E_DEVICE_ALREADY_REGISTERED: Hresult = 0x8019000Au.toInt()

public val MREGISTER_E_DEVICE_AUTHENTICATION_ERROR: Hresult = 0x80190002u.toInt()

public val MREGISTER_E_DEVICE_AUTHORIZATION_ERROR: Hresult = 0x80190003u.toInt()

public val MREGISTER_E_DEVICE_CERTIFCATEREQUEST_ERROR: Hresult = 0x80190004u.toInt()

public val MREGISTER_E_DEVICE_CONFIGMGRSERVER_ERROR: Hresult = 0x80190005u.toInt()

public val MREGISTER_E_DEVICE_INTERNALSERVICE_ERROR: Hresult = 0x80190006u.toInt()

public val MREGISTER_E_DEVICE_INVALIDSECURITY_ERROR: Hresult = 0x80190007u.toInt()

public val MREGISTER_E_DEVICE_MESSAGE_FORMAT_ERROR: Hresult = 0x80190001u.toInt()

public val MREGISTER_E_DEVICE_NOT_AD_REGISTERED_ERROR: Hresult = 0x8019000Du.toInt()

public val MREGISTER_E_DEVICE_NOT_REGISTERED: Hresult = 0x8019000Bu.toInt()

public val MREGISTER_E_DEVICE_UNKNOWN_ERROR: Hresult = 0x80190008u.toInt()

public val MREGISTER_E_DISCOVERY_FAILED: Hresult = 0x8019000Eu.toInt()

public val MREGISTER_E_DISCOVERY_REDIRECTED: Hresult = 0x8019000Cu.toInt()

public val MREGISTER_E_REGISTRATION_IN_PROGRESS: Hresult = 0x80190009u.toInt()

public val MAX_DEVICE_INFO_CLASS: RegistrationInformationClass = 2
