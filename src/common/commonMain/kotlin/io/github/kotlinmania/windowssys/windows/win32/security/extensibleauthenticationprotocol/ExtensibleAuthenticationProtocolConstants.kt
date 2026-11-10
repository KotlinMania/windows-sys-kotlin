package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val CERTIFICATE_HASH_LENGTH: UInt = 20u

public val EAPACTION_AUTHENTICATE: PppEapAction = 1

public val EAPACTION_DONE: PppEapAction = 2

public val EAPACTION_INDICATE_IDENTITY: PppEapAction = 8

public val EAPACTION_INDICATE_TLV: PppEapAction = 7

public val EAPACTION_NO_ACTION: PppEapAction = 0

public val EAPACTION_SEND: PppEapAction = 4

public val EAPACTION_SEND_AND_DONE: PppEapAction = 3

public val EAPACTION_SEND_WITH_TIMEOUT: PppEapAction = 5

public val EAPACTION_SEND_WITH_TIMEOUT_INTERACTIVE: PppEapAction = 6

public val EAPCODE_FAILURE: UInt = 4u

public val EAPCODE_REQUEST: UInt = 1u

public val EAPCODE_RESPONSE: UInt = 2u

public val EAPCODE_SUCCESS: UInt = 3u

public val EAPHOST_METHOD_API_VERSION: UInt = 1u

public val EAPHOST_PEER_API_VERSION: UInt = 1u

public val EAP_AUTHENTICATOR_SEND_TIMEOUT_BASIC: EapAuthenticatorSendTimeout = 1

public val EAP_AUTHENTICATOR_SEND_TIMEOUT_INTERACTIVE: EapAuthenticatorSendTimeout = 2

public val EAP_AUTHENTICATOR_SEND_TIMEOUT_NONE: EapAuthenticatorSendTimeout = 0

public val EAP_AUTHENTICATOR_VALUENAME_CONFIGUI: Pcwstr = w("AuthenticatorConfigUIPath")

public val EAP_AUTHENTICATOR_VALUENAME_DLL_PATH: Pcwstr = w("AuthenticatorDllPath")

public val EAP_AUTHENTICATOR_VALUENAME_FRIENDLY_NAME: Pcwstr = w("AuthenticatorFriendlyName")

public val EAP_AUTHENTICATOR_VALUENAME_PROPERTIES: Pcwstr = w("Properties")

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

public val EAP_FLAG_RESERVED1: UInt = 1u

public val EAP_FLAG_RESERVED2: UInt = 16u

public val EAP_FLAG_RESERVED3: UInt = 128u

public val EAP_FLAG_RESERVED4: UInt = 256u

public val EAP_FLAG_RESERVED5: UInt = 1024u

public val EAP_FLAG_RESERVED6: UInt = 2048u

public val EAP_FLAG_RESERVED7: UInt = 16384u

public val EAP_FLAG_RESERVED8: UInt = 1048576u

public val EAP_FLAG_RESERVED9: UInt = 4194304u

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

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_AUTHENTICATE: EapMethodAuthenticatorResponseAction = 4

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_DISCARD: EapMethodAuthenticatorResponseAction = 0

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_HANDLE_IDENTITY: EapMethodAuthenticatorResponseAction = 5

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_RESPOND: EapMethodAuthenticatorResponseAction = 3

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_RESULT: EapMethodAuthenticatorResponseAction = 2

public val EAP_METHOD_AUTHENTICATOR_RESPONSE_SEND: EapMethodAuthenticatorResponseAction = 1

public val EAP_METHOD_INVALID_PACKET: UInt = 2151809047u

public val EAP_PEER_FLAG_GUEST_ACCESS: UInt = 64u

public val EAP_PEER_FLAG_HEALTH_STATE_CHANGE: UInt = 32768u

public val EAP_PEER_VALUENAME_CONFIGUI: Pcwstr = w("PeerConfigUIPath")

public val EAP_PEER_VALUENAME_DLL_PATH: Pcwstr = w("PeerDllPath")

public val EAP_PEER_VALUENAME_FRIENDLY_NAME: Pcwstr = w("PeerFriendlyName")

public val EAP_PEER_VALUENAME_IDENTITY: Pcwstr = w("PeerIdentityPath")

public val EAP_PEER_VALUENAME_INTERACTIVEUI: Pcwstr = w("PeerInteractiveUIPath")

public val EAP_PEER_VALUENAME_INVOKE_NAMEDLG: Pcwstr = w("PeerInvokeUsernameDialog")

public val EAP_PEER_VALUENAME_INVOKE_PWDDLG: Pcwstr = w("PeerInvokePasswordDialog")

public val EAP_PEER_VALUENAME_PROPERTIES: Pcwstr = w("Properties")

public val EAP_PEER_VALUENAME_REQUIRE_CONFIGUI: Pcwstr = w("PeerRequireConfigUI")

public val EAP_REGISTRY_LOCATION: Pcwstr = w("System\\CurrentControlSet\\Services\\EapHost\\Methods")

public val EAP_SIM_CREDENTIAL: EapCredentialType = 4

public val EAP_UI_INPUT_FIELD_PROPS_DEFAULT: UInt = 0u

public val EAP_UI_INPUT_FIELD_PROPS_NON_DISPLAYABLE: UInt = 1u

public val EAP_UI_INPUT_FIELD_PROPS_NON_PERSIST: UInt = 2u

public val EAP_UI_INPUT_FIELD_PROPS_READ_ONLY: UInt = 4u

public val EAP_USERNAME_PASSWORD_CREDENTIAL: EapCredentialType = 1

public val EAP_VALUENAME_PROPERTIES: Pcwstr = w("Properties")

public val EAP_WINLOGON_CREDENTIAL: EapCredentialType = 2

public val EAP_CODE_FAILURE: EapCode = 4

public val EAP_CODE_MAXIMUM: EapCode = 4

public val EAP_CODE_MINIMUM: EapCode = 1

public val EAP_CODE_REQUEST: EapCode = 1

public val EAP_CODE_RESPONSE: EapCode = 2

public val EAP_CODE_SUCCESS: EapCode = 3

public val EAP_CONFIG_INPUT_EDIT: EapConfigInputFieldType = 6

public val EAP_CONFIG_INPUT_NETWORK_PASSWORD: EapConfigInputFieldType = 3

public val EAP_CONFIG_INPUT_NETWORK_USERNAME: EapConfigInputFieldType = 2

public val EAP_CONFIG_INPUT_PSK: EapConfigInputFieldType = 5

public val EAP_CONFIG_INPUT_PASSWORD: EapConfigInputFieldType = 1

public val EAP_CONFIG_INPUT_PIN: EapConfigInputFieldType = 4

public val EAP_CONFIG_INPUT_USERNAME: EapConfigInputFieldType = 0

public val EAP_CONFIG_SMART_CARD_ERROR: EapConfigInputFieldType = 8

public val EAP_CONFIG_SMART_CARD_USERNAME: EapConfigInputFieldType = 7

public val EAP_CRED_EXPIRY_REQ: EapInteractiveUiDataType = 2

public val EAP_CRED_EXPIRY_RESP: EapInteractiveUiDataType = 3

public val EAP_CRED_LOGON_REQ: EapInteractiveUiDataType = 4

public val EAP_CRED_LOGON_RESP: EapInteractiveUiDataType = 5

public val EAP_CRED_REQ: EapInteractiveUiDataType = 0

public val EAP_CRED_RESP: EapInteractiveUiDataType = 1

public val EAP_HOST_AUTH_FAILED: EaphostAuthStatus = 6

public val EAP_HOST_AUTH_IDENTITY_EXCHANGE: EaphostAuthStatus = 2

public val EAP_HOST_AUTH_IN_PROGRESS: EaphostAuthStatus = 4

public val EAP_HOST_AUTH_NEGOTIATING_TYPE: EaphostAuthStatus = 3

public val EAP_HOST_AUTH_NOT_STARTED: EaphostAuthStatus = 1

public val EAP_HOST_AUTH_SUCCEEDED: EaphostAuthStatus = 5

public val EAP_HOST_INVALID_SESSION: EaphostAuthStatus = 0

public val EAP_HOST_NAP_INFO: EapHostPeerAuthParams = 4

public val EAP_HOST_PEER_AUTH_STATUS: EapHostPeerAuthParams = 1

public val EAP_HOST_PEER_IDENTITY: EapHostPeerAuthParams = 2

public val EAP_HOST_PEER_IDENTITY_EXTENDED_INFO: EapHostPeerAuthParams = 3

public val EAP_HOST_PEER_METHOD_RESULT_ALT_SUCCESS_RECEIVED: EapHostPeerMethodResultReason = 1

public val EAP_HOST_PEER_METHOD_RESULT_FROM_METHOD: EapHostPeerMethodResultReason = 3

public val EAP_HOST_PEER_METHOD_RESULT_TIMEOUT: EapHostPeerMethodResultReason = 2

public val EAP_HOST_PEER_RESPONSE_DISCARD: EapHostPeerResponseAction = 0

public val EAP_HOST_PEER_RESPONSE_INVOKE_UI: EapHostPeerResponseAction = 3

public val EAP_HOST_PEER_RESPONSE_NONE: EapHostPeerResponseAction = 6

public val EAP_HOST_PEER_RESPONSE_RESPOND: EapHostPeerResponseAction = 4

public val EAP_HOST_PEER_RESPONSE_RESULT: EapHostPeerResponseAction = 2

public val EAP_HOST_PEER_RESPONSE_SEND: EapHostPeerResponseAction = 1

public val EAP_HOST_PEER_RESPONSE_START_AUTHENTICATION: EapHostPeerResponseAction = 5

public val EAP_PEER_METHOD_RESPONSE_ACTION_DISCARD: EapPeerMethodResponseAction = 0

public val EAP_PEER_METHOD_RESPONSE_ACTION_INVOKE_UI: EapPeerMethodResponseAction = 3

public val EAP_PEER_METHOD_RESPONSE_ACTION_NONE: EapPeerMethodResponseAction = 5

public val EAP_PEER_METHOD_RESPONSE_ACTION_RESPOND: EapPeerMethodResponseAction = 4

public val EAP_PEER_METHOD_RESPONSE_ACTION_RESULT: EapPeerMethodResponseAction = 2

public val EAP_PEER_METHOD_RESPONSE_ACTION_SEND: EapPeerMethodResponseAction = 1

public val EAP_PEER_METHOD_RESULT_FAILURE: EapPeerMethodResultReason = 3

public val EAP_PEER_METHOD_RESULT_SUCCESS: EapPeerMethodResultReason = 2

public val EAP_PEER_METHOD_RESULT_UNKNOWN: EapPeerMethodResultReason = 1

public val FACILITY_EAP_MESSAGE: UInt = 2114u

public val GUID_EAP_HOST_CAUSE_CERT_STORE_INACCESSIBLE: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000004uL))

public val GUID_EAP_HOST_CAUSE_EAP_NEGOTIATION_FAILED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001cuL))

public val GUID_EAP_HOST_CAUSE_EAP_QEC_INACCESSIBLE: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000312uL))

public val GUID_EAP_HOST_CAUSE_GENERIC_AUTH_FAILURE: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000104uL))

public val GUID_EAP_HOST_CAUSE_IDENTITY_UNKNOWN: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000204uL))

public val GUID_EAP_HOST_CAUSE_METHOD_DLL_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000001uL))

public val GUID_EAP_HOST_CAUSE_METHOD_DOES_NOT_SUPPORT_OPERATION: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001euL))

public val GUID_EAP_HOST_CAUSE_METHOD_CONFIG_DOES_NOT_SUPPORT_SSO: Guid = Guid.fromU128(U128(0xda18bd32004f41fauL, 0xae080bc85e5845acuL))

public val GUID_EAP_HOST_CAUSE_NO_SMART_CARD_READER_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002buL))

public val GUID_EAP_HOST_CAUSE_SERVER_CERT_EXPIRED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000005uL))

public val GUID_EAP_HOST_CAUSE_SERVER_CERT_INVALID: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000006uL))

public val GUID_EAP_HOST_CAUSE_SERVER_CERT_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000007uL))

public val GUID_EAP_HOST_CAUSE_SERVER_CERT_OTHER_ERROR: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000108uL))

public val GUID_EAP_HOST_CAUSE_SERVER_CERT_REVOKED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000008uL))

public val GUID_EAP_HOST_CAUSE_SERVER_ROOT_CERT_NAME_REQUIRED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000012uL))

public val GUID_EAP_HOST_CAUSE_SERVER_ROOT_CERT_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000112uL))

public val GUID_EAP_HOST_CAUSE_SIM_NOT_VALID: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000304uL))

public val GUID_EAP_HOST_CAUSE_THIRD_PARTY_METHOD_HOST_RESET: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000212uL))

public val GUID_EAP_HOST_CAUSE_USER_ACCOUNT_OTHER_PROBLEM: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000010euL))

public val GUID_EAP_HOST_CAUSE_USER_CERT_EXPIRED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000009uL))

public val GUID_EAP_HOST_CAUSE_USER_CERT_INVALID: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000auL))

public val GUID_EAP_HOST_CAUSE_USER_CERT_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000buL))

public val GUID_EAP_HOST_CAUSE_USER_CERT_OTHER_ERROR: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000cuL))

public val GUID_EAP_HOST_CAUSE_USER_CERT_REJECTED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000duL))

public val GUID_EAP_HOST_CAUSE_USER_CERT_REVOKED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000euL))

public val GUID_EAP_HOST_CAUSE_USER_CREDS_REJECTED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000020euL))

public val GUID_EAP_HOST_CAUSE_USER_ROOT_CERT_EXPIRED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000000fuL))

public val GUID_EAP_HOST_CAUSE_USER_ROOT_CERT_INVALID: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000010uL))

public val GUID_EAP_HOST_CAUSE_USER_ROOT_CERT_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000011uL))

public val GUID_EAP_HOST_CAUSE_XML_MALFORMED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001duL))

public val GUID_EAP_HOST_DEFAULT: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))

public val GUID_EAP_HOST_HELP_OBTAINING_CERTS: Guid = Guid.fromU128(U128(0xf535eea31bdd46cauL, 0xa2fca6655939b7e8uL))

public val GUID_EAP_HOST_HELP_TROUBLESHOOTING: Guid = Guid.fromU128(U128(0x33307acf069841bauL, 0xb014ea0a2eb8d0a8uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_AUTH_FAILURE: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001fuL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_CERT_NAME_ABSENT: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000029uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_CERT_STORE_INACCESSIBLE: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000024uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_IDENTITY_UNKNOWN: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000020uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_INVALID_USER_ACCOUNT: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000025uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_INVALID_USER_CERT: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002cuL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_METHOD_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000022uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_NEGOTIATION_FAILED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000021uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_NO_SMART_CARD_READER: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002auL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_ROOT_CERT_INVALID: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000026uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_ROOT_CERT_NOT_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000027uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_ADMIN_ROOT_EXPIRED: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000028uL))

public val GUID_EAP_HOST_REPAIR_CONTACT_SYSADMIN: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000002uL))

public val GUID_EAP_HOST_REPAIR_METHOD_NOT_SUPPORT_SSO: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002duL))

public val GUID_EAP_HOST_REPAIR_NO_VALID_SIM_FOUND: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000002euL))

public val GUID_EAP_HOST_REPAIR_RESTART_NAP: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000023uL))

public val GUID_EAP_HOST_REPAIR_RETRY_AUTHENTICATION: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000011buL))

public val GUID_EAP_HOST_REPAIR_SERVER_CLIENT_SELECT_SERVER_CERT: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000018uL))

public val GUID_EAP_HOST_REPAIR_USER_AUTH_FAILURE: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d800000019uL))

public val GUID_EAP_HOST_REPAIR_USER_GET_NEW_CERT: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001auL))

public val GUID_EAP_HOST_REPAIR_USER_SELECT_VALID_CERT: Guid = Guid.fromU128(U128(0x9612fc6761504209uL, 0xa85ea8d80000001buL))

public val ISOLATION_STATE_IN_PROBATION: IsolationState = 2

public val ISOLATION_STATE_NOT_RESTRICTED: IsolationState = 1

public val ISOLATION_STATE_RESTRICTED_ACCESS: IsolationState = 3

public val ISOLATION_STATE_UNKNOWN: IsolationState = 0

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

public val RAS_EAP_REGISTRY_LOCATION: Pcwstr = w("System\\CurrentControlSet\\Services\\Rasman\\PPP\\EAP")

public val RAS_EAP_ROLE_AUTHENTICATEE: UInt = 2u

public val RAS_EAP_ROLE_AUTHENTICATOR: UInt = 1u

public val RAS_EAP_ROLE_EXCLUDE_IN_EAP: UInt = 4u

public val RAS_EAP_ROLE_EXCLUDE_IN_PEAP: UInt = 8u

public val RAS_EAP_ROLE_EXCLUDE_IN_VPN: UInt = 16u

public val RAS_EAP_VALUENAME_CONFIGUI: Pcwstr = w("ConfigUIPath")

public val RAS_EAP_VALUENAME_CONFIG_CLSID: Pcwstr = w("ConfigCLSID")

public val RAS_EAP_VALUENAME_DEFAULT_DATA: Pcwstr = w("ConfigData")

public val RAS_EAP_VALUENAME_ENCRYPTION: Pcwstr = w("MPPEEncryptionSupported")

public val RAS_EAP_VALUENAME_FILTER_INNERMETHODS: Pcwstr = w("FilterInnerMethods")

public val RAS_EAP_VALUENAME_FRIENDLY_NAME: Pcwstr = w("FriendlyName")

public val RAS_EAP_VALUENAME_IDENTITY: Pcwstr = w("IdentityPath")

public val RAS_EAP_VALUENAME_INTERACTIVEUI: Pcwstr = w("InteractiveUIPath")

public val RAS_EAP_VALUENAME_INVOKE_NAMEDLG: Pcwstr = w("InvokeUsernameDialog")

public val RAS_EAP_VALUENAME_INVOKE_PWDDLG: Pcwstr = w("InvokePasswordDialog")

public val RAS_EAP_VALUENAME_ISTUNNEL_METHOD: Pcwstr = w("IsTunnelMethod")

public val RAS_EAP_VALUENAME_PATH: Pcwstr = w("Path")

public val RAS_EAP_VALUENAME_PER_POLICY_CONFIG: Pcwstr = w("PerPolicyConfig")

public val RAS_EAP_VALUENAME_REQUIRE_CONFIGUI: Pcwstr = w("RequireConfigUI")

public val RAS_EAP_VALUENAME_ROLES_SUPPORTED: Pcwstr = w("RolesSupported")

public val RAS_EAP_VALUENAME_STANDALONE_SUPPORTED: Pcwstr = w("StandaloneSupported")

public val EAP_PROP_CERTIFIED_METHOD: UInt = 4194304u

public val EAP_PROP_CHANNEL_BINDING: UInt = 65536u

public val EAP_PROP_CIPHER_SUITE_NEGOTIATION: UInt = 1u

public val EAP_PROP_CONFIDENTIALITY: UInt = 16u

public val EAP_PROP_CRYPTO_BINDING: UInt = 8192u

public val EAP_PROP_DICTIONARY_ATTACK_RESISTANCE: UInt = 2048u

public val EAP_PROP_FAST_RECONNECT: UInt = 4096u

public val EAP_PROP_FRAGMENTATION: UInt = 32768u

public val EAP_PROP_HIDDEN_METHOD: UInt = 8388608u

public val EAP_PROP_IDENTITY_PRIVACY: UInt = 67108864u

public val EAP_PROP_INTEGRITY: UInt = 4u

public val EAP_PROP_KEY_DERIVATION: UInt = 32u

public val EAP_PROP_KEY_STRENGTH1024: UInt = 1024u

public val EAP_PROP_KEY_STRENGTH128: UInt = 128u

public val EAP_PROP_KEY_STRENGTH256: UInt = 256u

public val EAP_PROP_KEY_STRENGTH512: UInt = 512u

public val EAP_PROP_KEY_STRENGTH64: UInt = 64u

public val EAP_PROP_MACHINE_AUTH: UInt = 16777216u

public val EAP_PROP_METHOD_CHAINING: UInt = 134217728u

public val EAP_PROP_MPPE_ENCRYPTION: UInt = 524288u

public val EAP_PROP_MUTUAL_AUTH: UInt = 2u

public val EAP_PROP_NAP: UInt = 131072u

public val EAP_PROP_REPLAY_PROTECTION: UInt = 8u

public val EAP_PROP_RESERVED: UInt = 2147483648u

public val EAP_PROP_SESSION_INDEPENDENCE: UInt = 16384u

public val EAP_PROP_SHARED_STATE_EQUIVALENCE: UInt = 268435456u

public val EAP_PROP_STANDALONE: UInt = 262144u

public val EAP_PROP_SUPPORTS_CONFIG: UInt = 2097152u

public val EAP_PROP_TUNNEL_METHOD: UInt = 1048576u

public val EAP_PROP_USER_AUTH: UInt = 33554432u

public val EAT_ARAP_CHALLENGE_RESPONSE: EapAttributeType = 84

public val EAT_ARAP_FEATURES: EapAttributeType = 71

public val EAT_ARAP_GUEST_LOGON: EapAttributeType = 8096

public val EAT_ARAP_PASSWORD: EapAttributeType = 70

public val EAT_ARAP_SECURITY: EapAttributeType = 73

public val EAT_ARAP_SECURITY_DATA: EapAttributeType = 74

public val EAT_ARAP_ZONE_ACCESS: EapAttributeType = 72

public val EAT_ACCT_AUTHENTIC: EapAttributeType = 45

public val EAT_ACCT_DELAY_TIME: EapAttributeType = 41

public val EAT_ACCT_EVENT_TIME_STAMP: EapAttributeType = 55

public val EAT_ACCT_INPUT_OCTETS: EapAttributeType = 42

public val EAT_ACCT_INPUT_PACKETS: EapAttributeType = 47

public val EAT_ACCT_INTERIM_INTERVAL: EapAttributeType = 85

public val EAT_ACCT_LINK_COUNT: EapAttributeType = 51

public val EAT_ACCT_MULTI_SESSION_ID: EapAttributeType = 50

public val EAT_ACCT_OUTPUT_OCTETS: EapAttributeType = 43

public val EAT_ACCT_OUTPUT_PACKETS: EapAttributeType = 48

public val EAT_ACCT_SESSION_ID: EapAttributeType = 44

public val EAT_ACCT_SESSION_TIME: EapAttributeType = 46

public val EAT_ACCT_STATUS_TYPE: EapAttributeType = 40

public val EAT_ACCT_TERMINATE_CAUSE: EapAttributeType = 49

public val EAT_CALLBACK_ID: EapAttributeType = 20

public val EAT_CALLBACK_NUMBER: EapAttributeType = 19

public val EAT_CALLED_STATION_ID: EapAttributeType = 30

public val EAT_CALLING_STATION_ID: EapAttributeType = 31

public val EAT_CERTIFICATE_OID: EapAttributeType = 8097

public val EAT_CERTIFICATE_THUMBPRINT: EapAttributeType = 8250

public val EAT_CLASS: EapAttributeType = 25

public val EAT_CLEAR_TEXT_PASSWORD: EapAttributeType = 8107

public val EAT_CONFIGURATION_TOKEN: EapAttributeType = 78

public val EAT_CONNECT_INFO: EapAttributeType = 77

public val EAT_CREDENTIALS_CHANGED: EapAttributeType = 8103

public val EAT_EAP_CONFIGURATION: EapAttributeType = 8098

public val EAT_EAP_MESSAGE: EapAttributeType = 79

public val EAT_EAPTLV: EapAttributeType = 8102

public val EAT_EMSK: EapAttributeType = 9003

public val EAT_FAST_ROAMED_SESSION: EapAttributeType = 8100

public val EAT_FILTER_ID: EapAttributeType = 11

public val EAT_FRAMED_APPLE_TALK_LINK: EapAttributeType = 37

public val EAT_FRAMED_APPLE_TALK_NETWORK: EapAttributeType = 38

public val EAT_FRAMED_APPLE_TALK_ZONE: EapAttributeType = 39

public val EAT_FRAMED_COMPRESSION: EapAttributeType = 13

public val EAT_FRAMED_IP_ADDRESS: EapAttributeType = 8

public val EAT_FRAMED_IP_NETMASK: EapAttributeType = 9

public val EAT_FRAMED_IPX_NETWORK: EapAttributeType = 23

public val EAT_FRAMED_I_PV6POOL: EapAttributeType = 100

public val EAT_FRAMED_I_PV6PREFIX: EapAttributeType = 97

public val EAT_FRAMED_I_PV6ROUTE: EapAttributeType = 99

public val EAT_FRAMED_INTERFACE_ID: EapAttributeType = 96

public val EAT_FRAMED_MTU: EapAttributeType = 12

public val EAT_FRAMED_PROTOCOL: EapAttributeType = 7

public val EAT_FRAMED_ROUTE: EapAttributeType = 22

public val EAT_FRAMED_ROUTING: EapAttributeType = 10

public val EAT_IDLE_TIMEOUT: EapAttributeType = 28

public val EAT_INNER_EAP_METHOD_TYPE: EapAttributeType = 8104

public val EAT_LOGIN_IP_HOST: EapAttributeType = 14

public val EAT_LOGIN_I_PV6HOST: EapAttributeType = 98

public val EAT_LOGIN_LAT_GROUP: EapAttributeType = 36

public val EAT_LOGIN_LAT_NODE: EapAttributeType = 35

public val EAT_LOGIN_LAT_PORT: EapAttributeType = 63

public val EAT_LOGIN_LAT_SERVICE: EapAttributeType = 34

public val EAT_LOGIN_SERVICE: EapAttributeType = 15

public val EAT_LOGIN_TCP_PORT: EapAttributeType = 16

public val EAT_MD5CHAP_CHALLENGE: EapAttributeType = 60

public val EAT_MD5CHAP_PASSWORD: EapAttributeType = 3

public val EAT_METHOD_ID: EapAttributeType = 9002

public val EAT_MINIMUM: EapAttributeType = 0

public val EAT_NASIP_ADDRESS: EapAttributeType = 4

public val EAT_NASI_PV6ADDRESS: EapAttributeType = 95

public val EAT_NAS_IDENTIFIER: EapAttributeType = 32

public val EAT_NAS_PORT: EapAttributeType = 5

public val EAT_NAS_PORT_TYPE: EapAttributeType = 61

public val EAT_PEAP_EMBEDDED_EAP_TYPE_ID: EapAttributeType = 8099

public val EAT_PEAP_FAST_ROAMED_SESSION: EapAttributeType = 8100

public val EAT_PASSWORD_RETRY: EapAttributeType = 75

public val EAT_PEER_ID: EapAttributeType = 9000

public val EAT_PORT_LIMIT: EapAttributeType = 62

public val EAT_PROMPT: EapAttributeType = 76

public val EAT_PROXY_STATE: EapAttributeType = 33

public val EAT_QUARANTINE_SO_H: EapAttributeType = 8150

public val EAT_REPLY_MESSAGE: EapAttributeType = 18

public val EAT_RESERVED: EapAttributeType = -1

public val EAT_SERVER_ID: EapAttributeType = 9001

public val EAT_SERVICE_TYPE: EapAttributeType = 6

public val EAT_SESSION_ID: EapAttributeType = 9004

public val EAT_SESSION_TIMEOUT: EapAttributeType = 27

public val EAT_SIGNATURE: EapAttributeType = 80

public val EAT_STATE: EapAttributeType = 24

public val EAT_TERMINATION_ACTION: EapAttributeType = 29

public val EAT_TUNNEL_CLIENT_ENDPOINT: EapAttributeType = 66

public val EAT_TUNNEL_MEDIUM_TYPE: EapAttributeType = 65

public val EAT_TUNNEL_SERVER_ENDPOINT: EapAttributeType = 67

public val EAT_TUNNEL_TYPE: EapAttributeType = 64

public val EAT_UNASSIGNED17: EapAttributeType = 17

public val EAT_UNASSIGNED21: EapAttributeType = 21

public val EAT_USER_NAME: EapAttributeType = 1

public val EAT_USER_PASSWORD: EapAttributeType = 2

public val EAT_VENDOR_SPECIFIC: EapAttributeType = 26

public val EMPT_LEGACY_METHOD_PROPERTY_FLAG: EapMethodPropertyType = 31

public val EMPT_PROP_CERTIFIED_METHOD: EapMethodPropertyType = 22

public val EMPT_PROP_CHANNEL_BINDING: EapMethodPropertyType = 16

public val EMPT_PROP_CIPHER_SUITE_NEGOTIATION: EapMethodPropertyType = 0

public val EMPT_PROP_CONFIDENTIALITY: EapMethodPropertyType = 4

public val EMPT_PROP_CRYPTO_BINDING: EapMethodPropertyType = 13

public val EMPT_PROP_DICTIONARY_ATTACK_RESISTANCE: EapMethodPropertyType = 11

public val EMPT_PROP_FAST_RECONNECT: EapMethodPropertyType = 12

public val EMPT_PROP_FRAGMENTATION: EapMethodPropertyType = 15

public val EMPT_PROP_HIDDEN_METHOD: EapMethodPropertyType = 23

public val EMPT_PROP_IDENTITY_PRIVACY: EapMethodPropertyType = 26

public val EMPT_PROP_INTEGRITY: EapMethodPropertyType = 2

public val EMPT_PROP_KEY_DERIVATION: EapMethodPropertyType = 5

public val EMPT_PROP_KEY_STRENGTH1024: EapMethodPropertyType = 10

public val EMPT_PROP_KEY_STRENGTH128: EapMethodPropertyType = 7

public val EMPT_PROP_KEY_STRENGTH256: EapMethodPropertyType = 8

public val EMPT_PROP_KEY_STRENGTH512: EapMethodPropertyType = 9

public val EMPT_PROP_KEY_STRENGTH64: EapMethodPropertyType = 6

public val EMPT_PROP_MACHINE_AUTH: EapMethodPropertyType = 24

public val EMPT_PROP_METHOD_CHAINING: EapMethodPropertyType = 27

public val EMPT_PROP_MPPE_ENCRYPTION: EapMethodPropertyType = 19

public val EMPT_PROP_MUTUAL_AUTH: EapMethodPropertyType = 1

public val EMPT_PROP_NAP: EapMethodPropertyType = 17

public val EMPT_PROP_REPLAY_PROTECTION: EapMethodPropertyType = 3

public val EMPT_PROP_SESSION_INDEPENDENCE: EapMethodPropertyType = 14

public val EMPT_PROP_SHARED_STATE_EQUIVALENCE: EapMethodPropertyType = 28

public val EMPT_PROP_STANDALONE: EapMethodPropertyType = 18

public val EMPT_PROP_SUPPORTS_CONFIG: EapMethodPropertyType = 21

public val EMPT_PROP_TUNNEL_METHOD: EapMethodPropertyType = 20

public val EMPT_PROP_USER_AUTH: EapMethodPropertyType = 25

public val EMPT_PROP_VENDOR_SPECIFIC: EapMethodPropertyType = 255

public val EMPVT_BOOL: EapMethodPropertyValueType = 0

public val EMPVT_DWORD: EapMethodPropertyValueType = 1

public val EMPVT_STRING: EapMethodPropertyValueType = 2

public val RAAT_ARAP_CHALLENGE: UInt = 33u

public val RAAT_ARAP_CHALLENGE_RESPONSE: RasAuthAttributeType = 84

public val RAAT_ARAP_FEATURES: RasAuthAttributeType = 71

public val RAAT_ARAP_GUEST_LOGON: RasAuthAttributeType = 8096

public val RAAT_ARAP_NEW_PASSWORD: UInt = 20u

public val RAAT_ARAP_OLD_PASSWORD: UInt = 19u

public val RAAT_ARAP_PASSWORD: RasAuthAttributeType = 70

public val RAAT_ARAP_PASSWORD_CHANGE_REASON: UInt = 21u

public val RAAT_ARAP_SECURITY: RasAuthAttributeType = 73

public val RAAT_ARAP_SECURITY_DATA: RasAuthAttributeType = 74

public val RAAT_ARAP_ZONE_ACCESS: RasAuthAttributeType = 72

public val RAAT_ACCT_AUTHENTIC: RasAuthAttributeType = 45

public val RAAT_ACCT_DELAY_TIME: RasAuthAttributeType = 41

public val RAAT_ACCT_EVENT_TIME_STAMP: RasAuthAttributeType = 55

public val RAAT_ACCT_INPUT_OCTETS: RasAuthAttributeType = 42

public val RAAT_ACCT_INPUT_PACKETS: RasAuthAttributeType = 47

public val RAAT_ACCT_INTERIM_INTERVAL: RasAuthAttributeType = 85

public val RAAT_ACCT_LINK_COUNT: RasAuthAttributeType = 51

public val RAAT_ACCT_MULTI_SESSION_ID: RasAuthAttributeType = 50

public val RAAT_ACCT_OUTPUT_OCTETS: RasAuthAttributeType = 43

public val RAAT_ACCT_OUTPUT_PACKETS: RasAuthAttributeType = 48

public val RAAT_ACCT_SESSION_ID: RasAuthAttributeType = 44

public val RAAT_ACCT_SESSION_TIME: RasAuthAttributeType = 46

public val RAAT_ACCT_STATUS_TYPE: RasAuthAttributeType = 40

public val RAAT_ACCT_TERMINATE_CAUSE: RasAuthAttributeType = 49

public val RAAT_CALLBACK_ID: RasAuthAttributeType = 20

public val RAAT_CALLBACK_NUMBER: RasAuthAttributeType = 19

public val RAAT_CALLED_STATION_ID: RasAuthAttributeType = 30

public val RAAT_CALLING_STATION_ID: RasAuthAttributeType = 31

public val RAAT_CERTIFICATE_OID: RasAuthAttributeType = 8097

public val RAAT_CERTIFICATE_THUMBPRINT: RasAuthAttributeType = 8250

public val RAAT_CLASS: RasAuthAttributeType = 25

public val RAAT_CONFIGURATION_TOKEN: RasAuthAttributeType = 78

public val RAAT_CONNECT_INFO: RasAuthAttributeType = 77

public val RAAT_CREDENTIALS_CHANGED: RasAuthAttributeType = 8103

public val RAAT_EAP_CONFIGURATION: RasAuthAttributeType = 8098

public val RAAT_EAP_MESSAGE: RasAuthAttributeType = 79

public val RAAT_EAPTLV: RasAuthAttributeType = 8102

public val RAAT_EMSK: RasAuthAttributeType = 9003

public val RAAT_FAST_ROAMED_SESSION: RasAuthAttributeType = 8100

public val RAAT_FILTER_ID: RasAuthAttributeType = 11

public val RAAT_FRAMED_APPLE_TALK_LINK: RasAuthAttributeType = 37

public val RAAT_FRAMED_APPLE_TALK_NETWORK: RasAuthAttributeType = 38

public val RAAT_FRAMED_APPLE_TALK_ZONE: RasAuthAttributeType = 39

public val RAAT_FRAMED_COMPRESSION: RasAuthAttributeType = 13

public val RAAT_FRAMED_IP_ADDRESS: RasAuthAttributeType = 8

public val RAAT_FRAMED_IP_NETMASK: RasAuthAttributeType = 9

public val RAAT_FRAMED_IPX_NETWORK: RasAuthAttributeType = 23

public val RAAT_FRAMED_I_PV6POOL: RasAuthAttributeType = 100

public val RAAT_FRAMED_I_PV6PREFIX: RasAuthAttributeType = 97

public val RAAT_FRAMED_I_PV6ROUTE: RasAuthAttributeType = 99

public val RAAT_FRAMED_INTERFACE_ID: RasAuthAttributeType = 96

public val RAAT_FRAMED_MTU: RasAuthAttributeType = 12

public val RAAT_FRAMED_PROTOCOL: RasAuthAttributeType = 7

public val RAAT_FRAMED_ROUTE: RasAuthAttributeType = 22

public val RAAT_FRAMED_ROUTING: RasAuthAttributeType = 10

public val RAAT_IDLE_TIMEOUT: RasAuthAttributeType = 28

public val RAAT_INNER_EAP_TYPE_ID: RasAuthAttributeType = 8099

public val RAAT_LOGIN_IP_HOST: RasAuthAttributeType = 14

public val RAAT_LOGIN_I_PV6HOST: RasAuthAttributeType = 98

public val RAAT_LOGIN_LAT_GROUP: RasAuthAttributeType = 36

public val RAAT_LOGIN_LAT_NODE: RasAuthAttributeType = 35

public val RAAT_LOGIN_LAT_PORT: RasAuthAttributeType = 63

public val RAAT_LOGIN_LAT_SERVICE: RasAuthAttributeType = 34

public val RAAT_LOGIN_SERVICE: RasAuthAttributeType = 15

public val RAAT_LOGIN_TCP_PORT: RasAuthAttributeType = 16

public val RAAT_MD5CHAP_CHALLENGE: RasAuthAttributeType = 60

public val RAAT_MD5CHAP_PASSWORD: RasAuthAttributeType = 3

public val RAAT_METHOD_ID: RasAuthAttributeType = 9002

public val RAAT_MINIMUM: RasAuthAttributeType = 0

public val RAAT_NASIP_ADDRESS: RasAuthAttributeType = 4

public val RAAT_NASI_PV6ADDRESS: RasAuthAttributeType = 95

public val RAAT_NAS_IDENTIFIER: RasAuthAttributeType = 32

public val RAAT_NAS_PORT: RasAuthAttributeType = 5

public val RAAT_NAS_PORT_TYPE: RasAuthAttributeType = 61

public val RAAT_PEAP_EMBEDDED_EAP_TYPE_ID: RasAuthAttributeType = 8099

public val RAAT_PEAP_FAST_ROAMED_SESSION: RasAuthAttributeType = 8100

public val RAAT_PASSWORD_RETRY: RasAuthAttributeType = 75

public val RAAT_PEER_ID: RasAuthAttributeType = 9000

public val RAAT_PORT_LIMIT: RasAuthAttributeType = 62

public val RAAT_PROMPT: RasAuthAttributeType = 76

public val RAAT_PROXY_STATE: RasAuthAttributeType = 33

public val RAAT_REPLY_MESSAGE: RasAuthAttributeType = 18

public val RAAT_RESERVED: RasAuthAttributeType = -1

public val RAAT_SERVER_ID: RasAuthAttributeType = 9001

public val RAAT_SERVICE_TYPE: RasAuthAttributeType = 6

public val RAAT_SESSION_ID: RasAuthAttributeType = 9004

public val RAAT_SESSION_TIMEOUT: RasAuthAttributeType = 27

public val RAAT_SIGNATURE: RasAuthAttributeType = 80

public val RAAT_STATE: RasAuthAttributeType = 24

public val RAAT_TERMINATION_ACTION: RasAuthAttributeType = 29

public val RAAT_TUNNEL_CLIENT_ENDPOINT: RasAuthAttributeType = 66

public val RAAT_TUNNEL_MEDIUM_TYPE: RasAuthAttributeType = 65

public val RAAT_TUNNEL_SERVER_ENDPOINT: RasAuthAttributeType = 67

public val RAAT_TUNNEL_TYPE: RasAuthAttributeType = 64

public val RAAT_UNASSIGNED17: RasAuthAttributeType = 17

public val RAAT_UNASSIGNED21: RasAuthAttributeType = 21

public val RAAT_USER_NAME: RasAuthAttributeType = 1

public val RAAT_USER_PASSWORD: RasAuthAttributeType = 2

public val RAAT_VENDOR_SPECIFIC: RasAuthAttributeType = 26
