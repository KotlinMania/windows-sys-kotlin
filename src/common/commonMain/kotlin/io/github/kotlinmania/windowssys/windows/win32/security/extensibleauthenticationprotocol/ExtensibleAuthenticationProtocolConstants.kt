package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val CERTIFICATE_HASH_LENGTH: UInt = 20u

public val EAPACTION_Authenticate: PPP_EAP_ACTION = 1

public val EAPACTION_Done: PPP_EAP_ACTION = 2

public val EAPACTION_IndicateIdentity: PPP_EAP_ACTION = 8

public val EAPACTION_IndicateTLV: PPP_EAP_ACTION = 7

public val EAPACTION_NoAction: PPP_EAP_ACTION = 0

public val EAPACTION_Send: PPP_EAP_ACTION = 4

public val EAPACTION_SendAndDone: PPP_EAP_ACTION = 3

public val EAPACTION_SendWithTimeout: PPP_EAP_ACTION = 5

public val EAPACTION_SendWithTimeoutInteractive: PPP_EAP_ACTION = 6

public val EAPCODE_Failure: UInt = 4u

public val EAPCODE_Request: UInt = 1u

public val EAPCODE_Response: UInt = 2u

public val EAPCODE_Success: UInt = 3u

public val EAPHOST_METHOD_API_VERSION: UInt = 1u

public val EAPHOST_PEER_API_VERSION: UInt = 1u

public val EAP_AUTHENTICATOR_SEND_TIMEOUT_BASIC: EAP_AUTHENTICATOR_SEND_TIMEOUT = 1

public val EAP_AUTHENTICATOR_SEND_TIMEOUT_INTERACTIVE: EAP_AUTHENTICATOR_SEND_TIMEOUT = 2

public val EAP_AUTHENTICATOR_SEND_TIMEOUT_NONE: EAP_AUTHENTICATOR_SEND_TIMEOUT = 0

public val EAP_AUTHENTICATOR_VALUENAME_CONFIGUI: PCWSTR = w("AuthenticatorConfigUIPath")

public val EAP_AUTHENTICATOR_VALUENAME_DLL_PATH: PCWSTR = w("AuthenticatorDllPath")

public val EAP_AUTHENTICATOR_VALUENAME_FRIENDLY_NAME: PCWSTR = w("AuthenticatorFriendlyName")

public val EAP_AUTHENTICATOR_VALUENAME_PROPERTIES: PCWSTR = w("Properties")

public val EAP_CERTIFICATE_CREDENTIAL: EapCredentialType = 3

public val EAP_CONFIG_INPUT_FIELD_PROPS_DEFAULT: UInt = 0u

public val EAP_CONFIG_INPUT_FIELD_PROPS_NON_DISPLAYABLE: UInt = 1u

public val EAP_CONFIG_INPUT_FIELD_PROPS_NON_PERSIST: UInt = 2u

public val EAP_CREDENTIAL_VERSION: UInt = 1u

public val EAP_EMPTY_CREDENTIAL: EapCredentialType = 0

public val EAP_E_AUTHENTICATION_FAILED: UInt = 2151809045u

public val EAP_E_CERT_STORE_INACCESSIBLE: UInt = 2151809040u

public val EAP_E_EAPHOST_EAPQEC_INACCESSIBLE: UInt = 2151809043u

public val EAP_E_EAPHOST_FIRST: Int = -2143158272

public val EAP_E_EAPHOST_IDENTITY_UNKNOWN: UInt = 2151809044u

public val EAP_E_EAPHOST_LAST: Int = -2143158017

public val EAP_E_EAPHOST_METHOD_INVALID_PACKET: UInt = 2151809047u

public val EAP_E_EAPHOST_METHOD_NOT_INSTALLED: UInt = 2151809041u

public val EAP_E_EAPHOST_METHOD_OPERATION_NOT_SUPPORTED: UInt = 2151809056u

public val EAP_E_EAPHOST_REMOTE_INVALID_PACKET: UInt = 2151809048u

public val EAP_E_EAPHOST_THIRDPARTY_METHOD_HOST_RESET: UInt = 2151809042u

public val EAP_E_EAPHOST_XML_MALFORMED: UInt = 2151809049u

public val EAP_E_METHOD_CONFIG_DOES_NOT_SUPPORT_SSO: UInt = 2151809050u

public val EAP_E_NO_SMART_CARD_READER: UInt = 2151809299u

public val EAP_E_SERVER_CERT_EXPIRED: UInt = 2151809538u

public val EAP_E_SERVER_CERT_INVALID: UInt = 2151809537u

public val EAP_E_SERVER_CERT_NOT_FOUND: UInt = 2151809536u

public val EAP_E_SERVER_CERT_OTHER_ERROR: UInt = 2151809540u

public val EAP_E_SERVER_CERT_REVOKED: UInt = 2151809539u

public val EAP_E_SERVER_FIRST: Int = -2143157760

public val EAP_E_SERVER_LAST: Int = -2143157505

public val EAP_E_SERVER_ROOT_CERT_FIRST: Int = -2143157248

public val EAP_E_SERVER_ROOT_CERT_INVALID: UInt = 2151810049u

public val EAP_E_SERVER_ROOT_CERT_LAST: Int = -2143156993

public val EAP_E_SERVER_ROOT_CERT_NAME_REQUIRED: UInt = 2151810054u

public val EAP_E_SERVER_ROOT_CERT_NOT_FOUND: UInt = 2151810048u

public val EAP_E_SIM_NOT_VALID: UInt = 2151810304u

public val EAP_E_USER_CERT_EXPIRED: UInt = 2151809282u

public val EAP_E_USER_CERT_INVALID: UInt = 2151809281u

public val EAP_E_USER_CERT_NOT_FOUND: UInt = 2151809280u

public val EAP_E_USER_CERT_OTHER_ERROR: UInt = 2151809284u

public val EAP_E_USER_CERT_REJECTED: UInt = 2151809285u

public val EAP_E_USER_CERT_REVOKED: UInt = 2151809283u

public val EAP_E_USER_CREDENTIALS_REJECTED: UInt = 2151809297u

public val EAP_E_USER_FIRST: Int = -2143158016

public val EAP_E_USER_LAST: Int = -2143157761

public val EAP_E_USER_NAME_PASSWORD_REJECTED: UInt = 2151809298u

public val EAP_E_USER_ROOT_CERT_EXPIRED: UInt = 2151809794u

public val EAP_E_USER_ROOT_CERT_FIRST: Int = -2143157504

public val EAP_E_USER_ROOT_CERT_INVALID: UInt = 2151809793u

public val EAP_E_USER_ROOT_CERT_LAST: Int = -2143157249

public val EAP_E_USER_ROOT_CERT_NOT_FOUND: UInt = 2151809792u

public val EAP_FLAG_CONFG_READONLY: UInt = 524288u

public val EAP_FLAG_FULL_AUTH: UInt = 4096u

public val EAP_FLAG_GUEST_ACCESS: UInt = 64u

public val EAP_FLAG_LOGON: UInt = 4u

public val EAP_FLAG_MACHINE_AUTH: UInt = 32u

public val EAP_FLAG_NON_INTERACTIVE: UInt = 2u

public val EAP_FLAG_ONLY_EAP_TLS: UInt = 16777216u

public val EAP_FLAG_PREFER_ALT_CREDENTIALS: UInt = 8192u

public val EAP_FLAG_PREVIEW: UInt = 8u

public val EAP_FLAG_PRE_LOGON: UInt = 131072u

public val EAP_FLAG_RESUME_FROM_HIBERNATE: UInt = 512u

public val EAP_FLAG_Reserved1: UInt = 1u

public val EAP_FLAG_Reserved2: UInt = 16u

public val EAP_FLAG_Reserved3: UInt = 128u

public val EAP_FLAG_Reserved4: UInt = 256u

public val EAP_FLAG_Reserved5: UInt = 1024u

public val EAP_FLAG_Reserved6: UInt = 2048u

public val EAP_FLAG_Reserved7: UInt = 16384u

public val EAP_FLAG_Reserved8: UInt = 1048576u

public val EAP_FLAG_Reserved9: UInt = 4194304u

public val EAP_FLAG_SERVER_VALIDATION_REQUIRED: UInt = 33554432u

public val EAP_FLAG_SUPRESS_UI: UInt = 65536u

public val EAP_FLAG_USER_AUTH: UInt = 262144u

public val EAP_FLAG_VPN: UInt = 8388608u

public val EAP_GROUP_MASK: Int = 65280

public val EAP_INTERACTIVE_UI_DATA_VERSION: UInt = 1u

public val EAP_INVALID_PACKET: UInt = 2151809048u

public val EAP_I_EAPHOST_EAP_NEGOTIATION_FAILED: UInt = 1078067222u

public val EAP_I_EAPHOST_FIRST: Int = -2143158272

public val EAP_I_EAPHOST_LAST: Int = -2143158017

public val EAP_I_USER_ACCOUNT_OTHER_ERROR: UInt = 1078067472u

public val EAP_I_USER_FIRST: Int = 1078067456

public val EAP_I_USER_LAST: Int = 1078067711

public val EAP_METHOD_AUTHENTICATOR_CONFIG_IS_IDENTITY_PRIVACY: UInt = 1u

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_AUTHENTICATE: EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = 4

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_DISCARD: EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = 0

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_HANDLE_IDENTITY: EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = 5

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_RESPOND: EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = 3

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_RESULT: EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = 2

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_SEND: EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = 1

public val EAP_METHOD_INVALID_PACKET: UInt = 2151809047u

public val EAP_PEER_FLAG_GUEST_ACCESS: UInt = 64u

public val EAP_PEER_FLAG_HEALTH_STATE_CHANGE: UInt = 32768u

public val EAP_PEER_VALUENAME_CONFIGUI: PCWSTR = w("PeerConfigUIPath")

public val EAP_PEER_VALUENAME_DLL_PATH: PCWSTR = w("PeerDllPath")

public val EAP_PEER_VALUENAME_FRIENDLY_NAME: PCWSTR = w("PeerFriendlyName")

public val EAP_PEER_VALUENAME_IDENTITY: PCWSTR = w("PeerIdentityPath")

public val EAP_PEER_VALUENAME_INTERACTIVEUI: PCWSTR = w("PeerInteractiveUIPath")

public val EAP_PEER_VALUENAME_INVOKE_NAMEDLG: PCWSTR = w("PeerInvokeUsernameDialog")

public val EAP_PEER_VALUENAME_INVOKE_PWDDLG: PCWSTR = w("PeerInvokePasswordDialog")

public val EAP_PEER_VALUENAME_PROPERTIES: PCWSTR = w("Properties")

public val EAP_PEER_VALUENAME_REQUIRE_CONFIGUI: PCWSTR = w("PeerRequireConfigUI")

public val EAP_REGISTRY_LOCATION: PCWSTR = w("System\\CurrentControlSet\\Services\\EapHost\\Methods")

public val EAP_SIM_CREDENTIAL: EapCredentialType = 4

public val EAP_UI_INPUT_FIELD_PROPS_DEFAULT: UInt = 0u

public val EAP_UI_INPUT_FIELD_PROPS_NON_DISPLAYABLE: UInt = 1u

public val EAP_UI_INPUT_FIELD_PROPS_NON_PERSIST: UInt = 2u

public val EAP_UI_INPUT_FIELD_PROPS_READ_ONLY: UInt = 4u

public val EAP_USERNAME_PASSWORD_CREDENTIAL: EapCredentialType = 1

public val EAP_VALUENAME_PROPERTIES: PCWSTR = w("Properties")

public val EAP_WINLOGON_CREDENTIAL: EapCredentialType = 2

public val EapCodeFailure: EapCode = 4

public val EapCodeMaximum: EapCode = 4

public val EapCodeMinimum: EapCode = 1

public val EapCodeRequest: EapCode = 1

public val EapCodeResponse: EapCode = 2

public val EapCodeSuccess: EapCode = 3

public val EapConfigInputEdit: EAP_CONFIG_INPUT_FIELD_TYPE = 6

public val EapConfigInputNetworkPassword: EAP_CONFIG_INPUT_FIELD_TYPE = 3

public val EapConfigInputNetworkUsername: EAP_CONFIG_INPUT_FIELD_TYPE = 2

public val EapConfigInputPSK: EAP_CONFIG_INPUT_FIELD_TYPE = 5

public val EapConfigInputPassword: EAP_CONFIG_INPUT_FIELD_TYPE = 1

public val EapConfigInputPin: EAP_CONFIG_INPUT_FIELD_TYPE = 4

public val EapConfigInputUsername: EAP_CONFIG_INPUT_FIELD_TYPE = 0

public val EapConfigSmartCardError: EAP_CONFIG_INPUT_FIELD_TYPE = 8

public val EapConfigSmartCardUsername: EAP_CONFIG_INPUT_FIELD_TYPE = 7

public val EapCredExpiryReq: EAP_INTERACTIVE_UI_DATA_TYPE = 2

public val EapCredExpiryResp: EAP_INTERACTIVE_UI_DATA_TYPE = 3

public val EapCredLogonReq: EAP_INTERACTIVE_UI_DATA_TYPE = 4

public val EapCredLogonResp: EAP_INTERACTIVE_UI_DATA_TYPE = 5

public val EapCredReq: EAP_INTERACTIVE_UI_DATA_TYPE = 0

public val EapCredResp: EAP_INTERACTIVE_UI_DATA_TYPE = 1

public val EapHostAuthFailed: EAPHOST_AUTH_STATUS = 6

public val EapHostAuthIdentityExchange: EAPHOST_AUTH_STATUS = 2

public val EapHostAuthInProgress: EAPHOST_AUTH_STATUS = 4

public val EapHostAuthNegotiatingType: EAPHOST_AUTH_STATUS = 3

public val EapHostAuthNotStarted: EAPHOST_AUTH_STATUS = 1

public val EapHostAuthSucceeded: EAPHOST_AUTH_STATUS = 5

public val EapHostInvalidSession: EAPHOST_AUTH_STATUS = 0

public val EapHostNapInfo: EapHostPeerAuthParams = 4

public val EapHostPeerAuthStatus: EapHostPeerAuthParams = 1

public val EapHostPeerIdentity: EapHostPeerAuthParams = 2

public val EapHostPeerIdentityExtendedInfo: EapHostPeerAuthParams = 3

public val EapHostPeerMethodResultAltSuccessReceived: EapHostPeerMethodResultReason = 1

public val EapHostPeerMethodResultFromMethod: EapHostPeerMethodResultReason = 3

public val EapHostPeerMethodResultTimeout: EapHostPeerMethodResultReason = 2

public val EapHostPeerResponseDiscard: EapHostPeerResponseAction = 0

public val EapHostPeerResponseInvokeUi: EapHostPeerResponseAction = 3

public val EapHostPeerResponseNone: EapHostPeerResponseAction = 6

public val EapHostPeerResponseRespond: EapHostPeerResponseAction = 4

public val EapHostPeerResponseResult: EapHostPeerResponseAction = 2

public val EapHostPeerResponseSend: EapHostPeerResponseAction = 1

public val EapHostPeerResponseStartAuthentication: EapHostPeerResponseAction = 5

public val EapPeerMethodResponseActionDiscard: EapPeerMethodResponseAction = 0

public val EapPeerMethodResponseActionInvokeUI: EapPeerMethodResponseAction = 3

public val EapPeerMethodResponseActionNone: EapPeerMethodResponseAction = 5

public val EapPeerMethodResponseActionRespond: EapPeerMethodResponseAction = 4

public val EapPeerMethodResponseActionResult: EapPeerMethodResponseAction = 2

public val EapPeerMethodResponseActionSend: EapPeerMethodResponseAction = 1

public val EapPeerMethodResultFailure: EapPeerMethodResultReason = 3

public val EapPeerMethodResultSuccess: EapPeerMethodResultReason = 2

public val EapPeerMethodResultUnknown: EapPeerMethodResultReason = 1

public val FACILITY_EAP_MESSAGE: UInt = 2114u

public val GUID_EapHost_Cause_CertStoreInaccessible: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000004uL))

public val GUID_EapHost_Cause_EapNegotiationFailed: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001cuL))

public val GUID_EapHost_Cause_EapQecInaccessible: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000312uL))

public val GUID_EapHost_Cause_Generic_AuthFailure: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000104uL))

public val GUID_EapHost_Cause_IdentityUnknown: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000204uL))

public val GUID_EapHost_Cause_MethodDLLNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000001uL))

public val GUID_EapHost_Cause_MethodDoesNotSupportOperation: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001euL))

public val GUID_EapHost_Cause_Method_Config_Does_Not_Support_Sso: GUID = GUID.from_u128(U128(0xda18bd32004f41fauL, 0xae080bc85e5845acuL))

public val GUID_EapHost_Cause_No_SmartCardReader_Found: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002buL))

public val GUID_EapHost_Cause_Server_CertExpired: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000005uL))

public val GUID_EapHost_Cause_Server_CertInvalid: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000006uL))

public val GUID_EapHost_Cause_Server_CertNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000007uL))

public val GUID_EapHost_Cause_Server_CertOtherError: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000108uL))

public val GUID_EapHost_Cause_Server_CertRevoked: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000008uL))

public val GUID_EapHost_Cause_Server_Root_CertNameRequired: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000012uL))

public val GUID_EapHost_Cause_Server_Root_CertNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000112uL))

public val GUID_EapHost_Cause_SimNotValid: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000304uL))

public val GUID_EapHost_Cause_ThirdPartyMethod_Host_Reset: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000212uL))

public val GUID_EapHost_Cause_User_Account_OtherProblem: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000010euL))

public val GUID_EapHost_Cause_User_CertExpired: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000009uL))

public val GUID_EapHost_Cause_User_CertInvalid: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000auL))

public val GUID_EapHost_Cause_User_CertNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000buL))

public val GUID_EapHost_Cause_User_CertOtherError: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000cuL))

public val GUID_EapHost_Cause_User_CertRejected: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000duL))

public val GUID_EapHost_Cause_User_CertRevoked: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000euL))

public val GUID_EapHost_Cause_User_CredsRejected: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000020euL))

public val GUID_EapHost_Cause_User_Root_CertExpired: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000fuL))

public val GUID_EapHost_Cause_User_Root_CertInvalid: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000010uL))

public val GUID_EapHost_Cause_User_Root_CertNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000011uL))

public val GUID_EapHost_Cause_XmlMalformed: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001duL))

public val GUID_EapHost_Default: GUID = GUID.from_u128(U128(0x0uL, 0x0uL))

public val GUID_EapHost_Help_ObtainingCerts: GUID = GUID.from_u128(U128(0xf535eea31bdd46cauL, 0xa2fca6655939b7e8uL))

public val GUID_EapHost_Help_Troubleshooting: GUID = GUID.from_u128(U128(0x33307acf069841bauL, 0xb014ea0a2eb8d0a8uL))

public val GUID_EapHost_Repair_ContactAdmin_AuthFailure: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001fuL))

public val GUID_EapHost_Repair_ContactAdmin_CertNameAbsent: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000029uL))

public val GUID_EapHost_Repair_ContactAdmin_CertStoreInaccessible: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000024uL))

public val GUID_EapHost_Repair_ContactAdmin_IdentityUnknown: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000020uL))

public val GUID_EapHost_Repair_ContactAdmin_InvalidUserAccount: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000025uL))

public val GUID_EapHost_Repair_ContactAdmin_InvalidUserCert: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002cuL))

public val GUID_EapHost_Repair_ContactAdmin_MethodNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000022uL))

public val GUID_EapHost_Repair_ContactAdmin_NegotiationFailed: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000021uL))

public val GUID_EapHost_Repair_ContactAdmin_NoSmartCardReader: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002auL))

public val GUID_EapHost_Repair_ContactAdmin_RootCertInvalid: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000026uL))

public val GUID_EapHost_Repair_ContactAdmin_RootCertNotFound: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000027uL))

public val GUID_EapHost_Repair_ContactAdmin_RootExpired: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000028uL))

public val GUID_EapHost_Repair_ContactSysadmin: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000002uL))

public val GUID_EapHost_Repair_Method_Not_Support_Sso: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002duL))

public val GUID_EapHost_Repair_No_ValidSim_Found: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002euL))

public val GUID_EapHost_Repair_RestartNap: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000023uL))

public val GUID_EapHost_Repair_Retry_Authentication: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000011buL))

public val GUID_EapHost_Repair_Server_ClientSelectServerCert: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000018uL))

public val GUID_EapHost_Repair_User_AuthFailure: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d800000019uL))

public val GUID_EapHost_Repair_User_GetNewCert: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001auL))

public val GUID_EapHost_Repair_User_SelectValidCert: GUID = GUID.from_u128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001buL))

public val ISOLATION_STATE_IN_PROBATION: ISOLATION_STATE = 2

public val ISOLATION_STATE_NOT_RESTRICTED: ISOLATION_STATE = 1

public val ISOLATION_STATE_RESTRICTED_ACCESS: ISOLATION_STATE = 3

public val ISOLATION_STATE_UNKNOWN: ISOLATION_STATE = 0

public val MAXEAPCODE: UInt = 4u

public val MAX_EAP_CONFIG_INPUT_FIELD_LENGTH: UInt = 256u

public val MAX_EAP_CONFIG_INPUT_FIELD_VALUE_LENGTH: UInt = 1024u

public val NCRYPT_PIN_CACHE_PIN_BYTE_LENGTH: UInt = 90u

public val RAS_EAP_FLAG_8021X_AUTH: UInt = 128u

public val RAS_EAP_FLAG_ALTERNATIVE_USER_DB: UInt = 2048u

public val RAS_EAP_FLAG_CONFG_READONLY: UInt = 524288u

public val RAS_EAP_FLAG_FIRST_LINK: UInt = 16u

public val RAS_EAP_FLAG_GUEST_ACCESS: UInt = 64u

public val RAS_EAP_FLAG_HOSTED_IN_PEAP: UInt = 256u

public val RAS_EAP_FLAG_LOGON: UInt = 4u

public val RAS_EAP_FLAG_MACHINE_AUTH: UInt = 32u

public val RAS_EAP_FLAG_NON_INTERACTIVE: UInt = 2u

public val RAS_EAP_FLAG_PEAP_FORCE_FULL_AUTH: UInt = 4096u

public val RAS_EAP_FLAG_PEAP_UPFRONT: UInt = 1024u

public val RAS_EAP_FLAG_PREVIEW: UInt = 8u

public val RAS_EAP_FLAG_PRE_LOGON: UInt = 131072u

public val RAS_EAP_FLAG_RESERVED: UInt = 1048576u

public val RAS_EAP_FLAG_RESUME_FROM_HIBERNATE: UInt = 512u

public val RAS_EAP_FLAG_ROUTER: UInt = 1u

public val RAS_EAP_FLAG_SAVE_CREDMAN: UInt = 2097152u

public val RAS_EAP_FLAG_SERVER_VALIDATION_REQUIRED: UInt = 33554432u

public val RAS_EAP_REGISTRY_LOCATION: PCWSTR = w("System\\CurrentControlSet\\Services\\Rasman\\PPP\\EAP")

public val RAS_EAP_ROLE_AUTHENTICATEE: UInt = 2u

public val RAS_EAP_ROLE_AUTHENTICATOR: UInt = 1u

public val RAS_EAP_ROLE_EXCLUDE_IN_EAP: UInt = 4u

public val RAS_EAP_ROLE_EXCLUDE_IN_PEAP: UInt = 8u

public val RAS_EAP_ROLE_EXCLUDE_IN_VPN: UInt = 16u

public val RAS_EAP_VALUENAME_CONFIGUI: PCWSTR = w("ConfigUIPath")

public val RAS_EAP_VALUENAME_CONFIG_CLSID: PCWSTR = w("ConfigCLSID")

public val RAS_EAP_VALUENAME_DEFAULT_DATA: PCWSTR = w("ConfigData")

public val RAS_EAP_VALUENAME_ENCRYPTION: PCWSTR = w("MPPEEncryptionSupported")

public val RAS_EAP_VALUENAME_FILTER_INNERMETHODS: PCWSTR = w("FilterInnerMethods")

public val RAS_EAP_VALUENAME_FRIENDLY_NAME: PCWSTR = w("FriendlyName")

public val RAS_EAP_VALUENAME_IDENTITY: PCWSTR = w("IdentityPath")

public val RAS_EAP_VALUENAME_INTERACTIVEUI: PCWSTR = w("InteractiveUIPath")

public val RAS_EAP_VALUENAME_INVOKE_NAMEDLG: PCWSTR = w("InvokeUsernameDialog")

public val RAS_EAP_VALUENAME_INVOKE_PWDDLG: PCWSTR = w("InvokePasswordDialog")

public val RAS_EAP_VALUENAME_ISTUNNEL_METHOD: PCWSTR = w("IsTunnelMethod")

public val RAS_EAP_VALUENAME_PATH: PCWSTR = w("Path")

public val RAS_EAP_VALUENAME_PER_POLICY_CONFIG: PCWSTR = w("PerPolicyConfig")

public val RAS_EAP_VALUENAME_REQUIRE_CONFIGUI: PCWSTR = w("RequireConfigUI")

public val RAS_EAP_VALUENAME_ROLES_SUPPORTED: PCWSTR = w("RolesSupported")

public val RAS_EAP_VALUENAME_STANDALONE_SUPPORTED: PCWSTR = w("StandaloneSupported")

public val eapPropCertifiedMethod: UInt = 4194304u

public val eapPropChannelBinding: UInt = 65536u

public val eapPropCipherSuiteNegotiation: UInt = 1u

public val eapPropConfidentiality: UInt = 16u

public val eapPropCryptoBinding: UInt = 8192u

public val eapPropDictionaryAttackResistance: UInt = 2048u

public val eapPropFastReconnect: UInt = 4096u

public val eapPropFragmentation: UInt = 32768u

public val eapPropHiddenMethod: UInt = 8388608u

public val eapPropIdentityPrivacy: UInt = 67108864u

public val eapPropIntegrity: UInt = 4u

public val eapPropKeyDerivation: UInt = 32u

public val eapPropKeyStrength1024: UInt = 1024u

public val eapPropKeyStrength128: UInt = 128u

public val eapPropKeyStrength256: UInt = 256u

public val eapPropKeyStrength512: UInt = 512u

public val eapPropKeyStrength64: UInt = 64u

public val eapPropMachineAuth: UInt = 16777216u

public val eapPropMethodChaining: UInt = 134217728u

public val eapPropMppeEncryption: UInt = 524288u

public val eapPropMutualAuth: UInt = 2u

public val eapPropNap: UInt = 131072u

public val eapPropReplayProtection: UInt = 8u

public val eapPropReserved: UInt = 2147483648u

public val eapPropSessionIndependence: UInt = 16384u

public val eapPropSharedStateEquivalence: UInt = 268435456u

public val eapPropStandalone: UInt = 262144u

public val eapPropSupportsConfig: UInt = 2097152u

public val eapPropTunnelMethod: UInt = 1048576u

public val eapPropUserAuth: UInt = 33554432u

public val eatARAPChallengeResponse: EAP_ATTRIBUTE_TYPE = 84

public val eatARAPFeatures: EAP_ATTRIBUTE_TYPE = 71

public val eatARAPGuestLogon: EAP_ATTRIBUTE_TYPE = 8096

public val eatARAPPassword: EAP_ATTRIBUTE_TYPE = 70

public val eatARAPSecurity: EAP_ATTRIBUTE_TYPE = 73

public val eatARAPSecurityData: EAP_ATTRIBUTE_TYPE = 74

public val eatARAPZoneAccess: EAP_ATTRIBUTE_TYPE = 72

public val eatAcctAuthentic: EAP_ATTRIBUTE_TYPE = 45

public val eatAcctDelayTime: EAP_ATTRIBUTE_TYPE = 41

public val eatAcctEventTimeStamp: EAP_ATTRIBUTE_TYPE = 55

public val eatAcctInputOctets: EAP_ATTRIBUTE_TYPE = 42

public val eatAcctInputPackets: EAP_ATTRIBUTE_TYPE = 47

public val eatAcctInterimInterval: EAP_ATTRIBUTE_TYPE = 85

public val eatAcctLinkCount: EAP_ATTRIBUTE_TYPE = 51

public val eatAcctMultiSessionId: EAP_ATTRIBUTE_TYPE = 50

public val eatAcctOutputOctets: EAP_ATTRIBUTE_TYPE = 43

public val eatAcctOutputPackets: EAP_ATTRIBUTE_TYPE = 48

public val eatAcctSessionId: EAP_ATTRIBUTE_TYPE = 44

public val eatAcctSessionTime: EAP_ATTRIBUTE_TYPE = 46

public val eatAcctStatusType: EAP_ATTRIBUTE_TYPE = 40

public val eatAcctTerminateCause: EAP_ATTRIBUTE_TYPE = 49

public val eatCallbackId: EAP_ATTRIBUTE_TYPE = 20

public val eatCallbackNumber: EAP_ATTRIBUTE_TYPE = 19

public val eatCalledStationId: EAP_ATTRIBUTE_TYPE = 30

public val eatCallingStationId: EAP_ATTRIBUTE_TYPE = 31

public val eatCertificateOID: EAP_ATTRIBUTE_TYPE = 8097

public val eatCertificateThumbprint: EAP_ATTRIBUTE_TYPE = 8250

public val eatClass: EAP_ATTRIBUTE_TYPE = 25

public val eatClearTextPassword: EAP_ATTRIBUTE_TYPE = 8107

public val eatConfigurationToken: EAP_ATTRIBUTE_TYPE = 78

public val eatConnectInfo: EAP_ATTRIBUTE_TYPE = 77

public val eatCredentialsChanged: EAP_ATTRIBUTE_TYPE = 8103

public val eatEAPConfiguration: EAP_ATTRIBUTE_TYPE = 8098

public val eatEAPMessage: EAP_ATTRIBUTE_TYPE = 79

public val eatEAPTLV: EAP_ATTRIBUTE_TYPE = 8102

public val eatEMSK: EAP_ATTRIBUTE_TYPE = 9003

public val eatFastRoamedSession: EAP_ATTRIBUTE_TYPE = 8100

public val eatFilterId: EAP_ATTRIBUTE_TYPE = 11

public val eatFramedAppleTalkLink: EAP_ATTRIBUTE_TYPE = 37

public val eatFramedAppleTalkNetwork: EAP_ATTRIBUTE_TYPE = 38

public val eatFramedAppleTalkZone: EAP_ATTRIBUTE_TYPE = 39

public val eatFramedCompression: EAP_ATTRIBUTE_TYPE = 13

public val eatFramedIPAddress: EAP_ATTRIBUTE_TYPE = 8

public val eatFramedIPNetmask: EAP_ATTRIBUTE_TYPE = 9

public val eatFramedIPXNetwork: EAP_ATTRIBUTE_TYPE = 23

public val eatFramedIPv6Pool: EAP_ATTRIBUTE_TYPE = 100

public val eatFramedIPv6Prefix: EAP_ATTRIBUTE_TYPE = 97

public val eatFramedIPv6Route: EAP_ATTRIBUTE_TYPE = 99

public val eatFramedInterfaceId: EAP_ATTRIBUTE_TYPE = 96

public val eatFramedMTU: EAP_ATTRIBUTE_TYPE = 12

public val eatFramedProtocol: EAP_ATTRIBUTE_TYPE = 7

public val eatFramedRoute: EAP_ATTRIBUTE_TYPE = 22

public val eatFramedRouting: EAP_ATTRIBUTE_TYPE = 10

public val eatIdleTimeout: EAP_ATTRIBUTE_TYPE = 28

public val eatInnerEapMethodType: EAP_ATTRIBUTE_TYPE = 8104

public val eatLoginIPHost: EAP_ATTRIBUTE_TYPE = 14

public val eatLoginIPv6Host: EAP_ATTRIBUTE_TYPE = 98

public val eatLoginLATGroup: EAP_ATTRIBUTE_TYPE = 36

public val eatLoginLATNode: EAP_ATTRIBUTE_TYPE = 35

public val eatLoginLATPort: EAP_ATTRIBUTE_TYPE = 63

public val eatLoginLATService: EAP_ATTRIBUTE_TYPE = 34

public val eatLoginService: EAP_ATTRIBUTE_TYPE = 15

public val eatLoginTCPPort: EAP_ATTRIBUTE_TYPE = 16

public val eatMD5CHAPChallenge: EAP_ATTRIBUTE_TYPE = 60

public val eatMD5CHAPPassword: EAP_ATTRIBUTE_TYPE = 3

public val eatMethodId: EAP_ATTRIBUTE_TYPE = 9002

public val eatMinimum: EAP_ATTRIBUTE_TYPE = 0

public val eatNASIPAddress: EAP_ATTRIBUTE_TYPE = 4

public val eatNASIPv6Address: EAP_ATTRIBUTE_TYPE = 95

public val eatNASIdentifier: EAP_ATTRIBUTE_TYPE = 32

public val eatNASPort: EAP_ATTRIBUTE_TYPE = 5

public val eatNASPortType: EAP_ATTRIBUTE_TYPE = 61

public val eatPEAPEmbeddedEAPTypeId: EAP_ATTRIBUTE_TYPE = 8099

public val eatPEAPFastRoamedSession: EAP_ATTRIBUTE_TYPE = 8100

public val eatPasswordRetry: EAP_ATTRIBUTE_TYPE = 75

public val eatPeerId: EAP_ATTRIBUTE_TYPE = 9000

public val eatPortLimit: EAP_ATTRIBUTE_TYPE = 62

public val eatPrompt: EAP_ATTRIBUTE_TYPE = 76

public val eatProxyState: EAP_ATTRIBUTE_TYPE = 33

public val eatQuarantineSoH: EAP_ATTRIBUTE_TYPE = 8150

public val eatReplyMessage: EAP_ATTRIBUTE_TYPE = 18

public val eatReserved: EAP_ATTRIBUTE_TYPE = -1

public val eatServerId: EAP_ATTRIBUTE_TYPE = 9001

public val eatServiceType: EAP_ATTRIBUTE_TYPE = 6

public val eatSessionId: EAP_ATTRIBUTE_TYPE = 9004

public val eatSessionTimeout: EAP_ATTRIBUTE_TYPE = 27

public val eatSignature: EAP_ATTRIBUTE_TYPE = 80

public val eatState: EAP_ATTRIBUTE_TYPE = 24

public val eatTerminationAction: EAP_ATTRIBUTE_TYPE = 29

public val eatTunnelClientEndpoint: EAP_ATTRIBUTE_TYPE = 66

public val eatTunnelMediumType: EAP_ATTRIBUTE_TYPE = 65

public val eatTunnelServerEndpoint: EAP_ATTRIBUTE_TYPE = 67

public val eatTunnelType: EAP_ATTRIBUTE_TYPE = 64

public val eatUnassigned17: EAP_ATTRIBUTE_TYPE = 17

public val eatUnassigned21: EAP_ATTRIBUTE_TYPE = 21

public val eatUserName: EAP_ATTRIBUTE_TYPE = 1

public val eatUserPassword: EAP_ATTRIBUTE_TYPE = 2

public val eatVendorSpecific: EAP_ATTRIBUTE_TYPE = 26

public val emptLegacyMethodPropertyFlag: EAP_METHOD_PROPERTY_TYPE = 31

public val emptPropCertifiedMethod: EAP_METHOD_PROPERTY_TYPE = 22

public val emptPropChannelBinding: EAP_METHOD_PROPERTY_TYPE = 16

public val emptPropCipherSuiteNegotiation: EAP_METHOD_PROPERTY_TYPE = 0

public val emptPropConfidentiality: EAP_METHOD_PROPERTY_TYPE = 4

public val emptPropCryptoBinding: EAP_METHOD_PROPERTY_TYPE = 13

public val emptPropDictionaryAttackResistance: EAP_METHOD_PROPERTY_TYPE = 11

public val emptPropFastReconnect: EAP_METHOD_PROPERTY_TYPE = 12

public val emptPropFragmentation: EAP_METHOD_PROPERTY_TYPE = 15

public val emptPropHiddenMethod: EAP_METHOD_PROPERTY_TYPE = 23

public val emptPropIdentityPrivacy: EAP_METHOD_PROPERTY_TYPE = 26

public val emptPropIntegrity: EAP_METHOD_PROPERTY_TYPE = 2

public val emptPropKeyDerivation: EAP_METHOD_PROPERTY_TYPE = 5

public val emptPropKeyStrength1024: EAP_METHOD_PROPERTY_TYPE = 10

public val emptPropKeyStrength128: EAP_METHOD_PROPERTY_TYPE = 7

public val emptPropKeyStrength256: EAP_METHOD_PROPERTY_TYPE = 8

public val emptPropKeyStrength512: EAP_METHOD_PROPERTY_TYPE = 9

public val emptPropKeyStrength64: EAP_METHOD_PROPERTY_TYPE = 6

public val emptPropMachineAuth: EAP_METHOD_PROPERTY_TYPE = 24

public val emptPropMethodChaining: EAP_METHOD_PROPERTY_TYPE = 27

public val emptPropMppeEncryption: EAP_METHOD_PROPERTY_TYPE = 19

public val emptPropMutualAuth: EAP_METHOD_PROPERTY_TYPE = 1

public val emptPropNap: EAP_METHOD_PROPERTY_TYPE = 17

public val emptPropReplayProtection: EAP_METHOD_PROPERTY_TYPE = 3

public val emptPropSessionIndependence: EAP_METHOD_PROPERTY_TYPE = 14

public val emptPropSharedStateEquivalence: EAP_METHOD_PROPERTY_TYPE = 28

public val emptPropStandalone: EAP_METHOD_PROPERTY_TYPE = 18

public val emptPropSupportsConfig: EAP_METHOD_PROPERTY_TYPE = 21

public val emptPropTunnelMethod: EAP_METHOD_PROPERTY_TYPE = 20

public val emptPropUserAuth: EAP_METHOD_PROPERTY_TYPE = 25

public val emptPropVendorSpecific: EAP_METHOD_PROPERTY_TYPE = 255

public val empvtBool: EAP_METHOD_PROPERTY_VALUE_TYPE = 0

public val empvtDword: EAP_METHOD_PROPERTY_VALUE_TYPE = 1

public val empvtString: EAP_METHOD_PROPERTY_VALUE_TYPE = 2

public val raatARAPChallenge: UInt = 33u

public val raatARAPChallengeResponse: RAS_AUTH_ATTRIBUTE_TYPE = 84

public val raatARAPFeatures: RAS_AUTH_ATTRIBUTE_TYPE = 71

public val raatARAPGuestLogon: RAS_AUTH_ATTRIBUTE_TYPE = 8096

public val raatARAPNewPassword: UInt = 20u

public val raatARAPOldPassword: UInt = 19u

public val raatARAPPassword: RAS_AUTH_ATTRIBUTE_TYPE = 70

public val raatARAPPasswordChangeReason: UInt = 21u

public val raatARAPSecurity: RAS_AUTH_ATTRIBUTE_TYPE = 73

public val raatARAPSecurityData: RAS_AUTH_ATTRIBUTE_TYPE = 74

public val raatARAPZoneAccess: RAS_AUTH_ATTRIBUTE_TYPE = 72

public val raatAcctAuthentic: RAS_AUTH_ATTRIBUTE_TYPE = 45

public val raatAcctDelayTime: RAS_AUTH_ATTRIBUTE_TYPE = 41

public val raatAcctEventTimeStamp: RAS_AUTH_ATTRIBUTE_TYPE = 55

public val raatAcctInputOctets: RAS_AUTH_ATTRIBUTE_TYPE = 42

public val raatAcctInputPackets: RAS_AUTH_ATTRIBUTE_TYPE = 47

public val raatAcctInterimInterval: RAS_AUTH_ATTRIBUTE_TYPE = 85

public val raatAcctLinkCount: RAS_AUTH_ATTRIBUTE_TYPE = 51

public val raatAcctMultiSessionId: RAS_AUTH_ATTRIBUTE_TYPE = 50

public val raatAcctOutputOctets: RAS_AUTH_ATTRIBUTE_TYPE = 43

public val raatAcctOutputPackets: RAS_AUTH_ATTRIBUTE_TYPE = 48

public val raatAcctSessionId: RAS_AUTH_ATTRIBUTE_TYPE = 44

public val raatAcctSessionTime: RAS_AUTH_ATTRIBUTE_TYPE = 46

public val raatAcctStatusType: RAS_AUTH_ATTRIBUTE_TYPE = 40

public val raatAcctTerminateCause: RAS_AUTH_ATTRIBUTE_TYPE = 49

public val raatCallbackId: RAS_AUTH_ATTRIBUTE_TYPE = 20

public val raatCallbackNumber: RAS_AUTH_ATTRIBUTE_TYPE = 19

public val raatCalledStationId: RAS_AUTH_ATTRIBUTE_TYPE = 30

public val raatCallingStationId: RAS_AUTH_ATTRIBUTE_TYPE = 31

public val raatCertificateOID: RAS_AUTH_ATTRIBUTE_TYPE = 8097

public val raatCertificateThumbprint: RAS_AUTH_ATTRIBUTE_TYPE = 8250

public val raatClass: RAS_AUTH_ATTRIBUTE_TYPE = 25

public val raatConfigurationToken: RAS_AUTH_ATTRIBUTE_TYPE = 78

public val raatConnectInfo: RAS_AUTH_ATTRIBUTE_TYPE = 77

public val raatCredentialsChanged: RAS_AUTH_ATTRIBUTE_TYPE = 8103

public val raatEAPConfiguration: RAS_AUTH_ATTRIBUTE_TYPE = 8098

public val raatEAPMessage: RAS_AUTH_ATTRIBUTE_TYPE = 79

public val raatEAPTLV: RAS_AUTH_ATTRIBUTE_TYPE = 8102

public val raatEMSK: RAS_AUTH_ATTRIBUTE_TYPE = 9003

public val raatFastRoamedSession: RAS_AUTH_ATTRIBUTE_TYPE = 8100

public val raatFilterId: RAS_AUTH_ATTRIBUTE_TYPE = 11

public val raatFramedAppleTalkLink: RAS_AUTH_ATTRIBUTE_TYPE = 37

public val raatFramedAppleTalkNetwork: RAS_AUTH_ATTRIBUTE_TYPE = 38

public val raatFramedAppleTalkZone: RAS_AUTH_ATTRIBUTE_TYPE = 39

public val raatFramedCompression: RAS_AUTH_ATTRIBUTE_TYPE = 13

public val raatFramedIPAddress: RAS_AUTH_ATTRIBUTE_TYPE = 8

public val raatFramedIPNetmask: RAS_AUTH_ATTRIBUTE_TYPE = 9

public val raatFramedIPXNetwork: RAS_AUTH_ATTRIBUTE_TYPE = 23

public val raatFramedIPv6Pool: RAS_AUTH_ATTRIBUTE_TYPE = 100

public val raatFramedIPv6Prefix: RAS_AUTH_ATTRIBUTE_TYPE = 97

public val raatFramedIPv6Route: RAS_AUTH_ATTRIBUTE_TYPE = 99

public val raatFramedInterfaceId: RAS_AUTH_ATTRIBUTE_TYPE = 96

public val raatFramedMTU: RAS_AUTH_ATTRIBUTE_TYPE = 12

public val raatFramedProtocol: RAS_AUTH_ATTRIBUTE_TYPE = 7

public val raatFramedRoute: RAS_AUTH_ATTRIBUTE_TYPE = 22

public val raatFramedRouting: RAS_AUTH_ATTRIBUTE_TYPE = 10

public val raatIdleTimeout: RAS_AUTH_ATTRIBUTE_TYPE = 28

public val raatInnerEAPTypeId: RAS_AUTH_ATTRIBUTE_TYPE = 8099

public val raatLoginIPHost: RAS_AUTH_ATTRIBUTE_TYPE = 14

public val raatLoginIPv6Host: RAS_AUTH_ATTRIBUTE_TYPE = 98

public val raatLoginLATGroup: RAS_AUTH_ATTRIBUTE_TYPE = 36

public val raatLoginLATNode: RAS_AUTH_ATTRIBUTE_TYPE = 35

public val raatLoginLATPort: RAS_AUTH_ATTRIBUTE_TYPE = 63

public val raatLoginLATService: RAS_AUTH_ATTRIBUTE_TYPE = 34

public val raatLoginService: RAS_AUTH_ATTRIBUTE_TYPE = 15

public val raatLoginTCPPort: RAS_AUTH_ATTRIBUTE_TYPE = 16

public val raatMD5CHAPChallenge: RAS_AUTH_ATTRIBUTE_TYPE = 60

public val raatMD5CHAPPassword: RAS_AUTH_ATTRIBUTE_TYPE = 3

public val raatMethodId: RAS_AUTH_ATTRIBUTE_TYPE = 9002

public val raatMinimum: RAS_AUTH_ATTRIBUTE_TYPE = 0

public val raatNASIPAddress: RAS_AUTH_ATTRIBUTE_TYPE = 4

public val raatNASIPv6Address: RAS_AUTH_ATTRIBUTE_TYPE = 95

public val raatNASIdentifier: RAS_AUTH_ATTRIBUTE_TYPE = 32

public val raatNASPort: RAS_AUTH_ATTRIBUTE_TYPE = 5

public val raatNASPortType: RAS_AUTH_ATTRIBUTE_TYPE = 61

public val raatPEAPEmbeddedEAPTypeId: RAS_AUTH_ATTRIBUTE_TYPE = 8099

public val raatPEAPFastRoamedSession: RAS_AUTH_ATTRIBUTE_TYPE = 8100

public val raatPasswordRetry: RAS_AUTH_ATTRIBUTE_TYPE = 75

public val raatPeerId: RAS_AUTH_ATTRIBUTE_TYPE = 9000

public val raatPortLimit: RAS_AUTH_ATTRIBUTE_TYPE = 62

public val raatPrompt: RAS_AUTH_ATTRIBUTE_TYPE = 76

public val raatProxyState: RAS_AUTH_ATTRIBUTE_TYPE = 33

public val raatReplyMessage: RAS_AUTH_ATTRIBUTE_TYPE = 18

public val raatReserved: RAS_AUTH_ATTRIBUTE_TYPE = -1

public val raatServerId: RAS_AUTH_ATTRIBUTE_TYPE = 9001

public val raatServiceType: RAS_AUTH_ATTRIBUTE_TYPE = 6

public val raatSessionId: RAS_AUTH_ATTRIBUTE_TYPE = 9004

public val raatSessionTimeout: RAS_AUTH_ATTRIBUTE_TYPE = 27

public val raatSignature: RAS_AUTH_ATTRIBUTE_TYPE = 80

public val raatState: RAS_AUTH_ATTRIBUTE_TYPE = 24

public val raatTerminationAction: RAS_AUTH_ATTRIBUTE_TYPE = 29

public val raatTunnelClientEndpoint: RAS_AUTH_ATTRIBUTE_TYPE = 66

public val raatTunnelMediumType: RAS_AUTH_ATTRIBUTE_TYPE = 65

public val raatTunnelServerEndpoint: RAS_AUTH_ATTRIBUTE_TYPE = 67

public val raatTunnelType: RAS_AUTH_ATTRIBUTE_TYPE = 64

public val raatUnassigned17: RAS_AUTH_ATTRIBUTE_TYPE = 17

public val raatUnassigned21: RAS_AUTH_ATTRIBUTE_TYPE = 21

public val raatUserName: RAS_AUTH_ATTRIBUTE_TYPE = 1

public val raatUserPassword: RAS_AUTH_ATTRIBUTE_TYPE = 2

public val raatVendorSpecific: RAS_AUTH_ATTRIBUTE_TYPE = 26
