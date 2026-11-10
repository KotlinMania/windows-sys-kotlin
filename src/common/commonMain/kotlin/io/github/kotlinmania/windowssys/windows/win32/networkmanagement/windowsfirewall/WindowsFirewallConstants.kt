package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS_ALL: FwDynamicKeywordAddressEnumFlags = 3

public val FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS_AUTO_RESOLVE: FwDynamicKeywordAddressEnumFlags = 1

public val FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS_NON_AUTO_RESOLVE: FwDynamicKeywordAddressEnumFlags = 2

public val FW_DYNAMIC_KEYWORD_ADDRESS_FLAGS_AUTO_RESOLVE: FwDynamicKeywordAddressFlags = 1

public val FW_DYNAMIC_KEYWORD_ORIGIN_INVALID: FwDynamicKeywordOriginType = 0

public val FW_DYNAMIC_KEYWORD_ORIGIN_LOCAL: FwDynamicKeywordOriginType = 1

public val FW_DYNAMIC_KEYWORD_ORIGIN_MDM: FwDynamicKeywordOriginType = 2

public val ICSSC_DEFAULT: SharingconnectionEnumFlags = 0

public val ICSSC_ENABLED: SharingconnectionEnumFlags = 1

public val ICSSHARINGTYPE_PRIVATE: Sharingconnectiontype = 1

public val ICSSHARINGTYPE_PUBLIC: Sharingconnectiontype = 0

public val ICSTT_IPADDRESS: IcsTargettype = 1

public val ICSTT_NAME: IcsTargettype = 0

public val INET_FIREWALL_AC_BINARY: InetFirewallAcCreationType = 2

public val INET_FIREWALL_AC_CHANGE_CREATE: InetFirewallAcChangeType = 1

public val INET_FIREWALL_AC_CHANGE_DELETE: InetFirewallAcChangeType = 2

public val INET_FIREWALL_AC_CHANGE_INVALID: InetFirewallAcChangeType = 0

public val INET_FIREWALL_AC_CHANGE_MAX: InetFirewallAcChangeType = 3

public val INET_FIREWALL_AC_MAX: InetFirewallAcCreationType = 4

public val INET_FIREWALL_AC_NONE: InetFirewallAcCreationType = 0

public val INET_FIREWALL_AC_PACKAGE_ID_ONLY: InetFirewallAcCreationType = 1

public val NCCF_ALLOW_DUPLICATION: NetconCharacteristicFlags = 2

public val NCCF_ALLOW_REMOVAL: NetconCharacteristicFlags = 4

public val NCCF_ALLOW_RENAME: NetconCharacteristicFlags = 8

public val NCCF_ALL_USERS: NetconCharacteristicFlags = 1

public val NCCF_BLUETOOTH_MASK: NetconCharacteristicFlags = 983040

public val NCCF_BRANDED: NetconCharacteristicFlags = 128

public val NCCF_BRIDGED: NetconCharacteristicFlags = 512

public val NCCF_DEFAULT: NetconCharacteristicFlags = 2048

public val NCCF_FIREWALLED: NetconCharacteristicFlags = 1024

public val NCCF_HOMENET_CAPABLE: NetconCharacteristicFlags = 4096

public val NCCF_HOSTED_NETWORK: NetconCharacteristicFlags = 65536

public val NCCF_INCOMING_ONLY: NetconCharacteristicFlags = 32

public val NCCF_LAN_MASK: NetconCharacteristicFlags = 15728640

public val NCCF_NONE: NetconCharacteristicFlags = 0

public val NCCF_OUTGOING_ONLY: NetconCharacteristicFlags = 64

public val NCCF_QUARANTINED: NetconCharacteristicFlags = 16384

public val NCCF_RESERVED: NetconCharacteristicFlags = 32768

public val NCCF_SHARED: NetconCharacteristicFlags = 256

public val NCCF_SHARED_PRIVATE: NetconCharacteristicFlags = 8192

public val NCCF_VIRTUAL_STATION: NetconCharacteristicFlags = 131072

public val NCCF_WIFI_DIRECT: NetconCharacteristicFlags = 262144

public val NCME_DEFAULT: NetconmgrEnumFlags = 0

public val NCME_HIDDEN: NetconmgrEnumFlags = 1

public val NCM_BRIDGE: NetconMediatype = 7

public val NCM_DIRECT: NetconMediatype = 1

public val NCM_ISDN: NetconMediatype = 2

public val NCM_LAN: NetconMediatype = 3

public val NCM_NONE: NetconMediatype = 0

public val NCM_PHONE: NetconMediatype = 4

public val NCM_PPPOE: NetconMediatype = 6

public val NCM_SHAREDACCESSHOST_LAN: NetconMediatype = 8

public val NCM_SHAREDACCESSHOST_RAS: NetconMediatype = 9

public val NCM_TUNNEL: NetconMediatype = 5

public val NCS_ACTION_REQUIRED: NetconStatus = 13

public val NCS_ACTION_REQUIRED_RETRY: NetconStatus = 14

public val NCS_AUTHENTICATING: NetconStatus = 8

public val NCS_AUTHENTICATION_FAILED: NetconStatus = 10

public val NCS_AUTHENTICATION_SUCCEEDED: NetconStatus = 9

public val NCS_CONNECTED: NetconStatus = 2

public val NCS_CONNECTING: NetconStatus = 1

public val NCS_CONNECT_FAILED: NetconStatus = 15

public val NCS_CREDENTIALS_REQUIRED: NetconStatus = 12

public val NCS_DISCONNECTED: NetconStatus = 0

public val NCS_DISCONNECTING: NetconStatus = 3

public val NCS_HARDWARE_DISABLED: NetconStatus = 5

public val NCS_HARDWARE_MALFUNCTION: NetconStatus = 6

public val NCS_HARDWARE_NOT_PRESENT: NetconStatus = 4

public val NCS_INVALID_ADDRESS: NetconStatus = 11

public val NCS_MEDIA_DISCONNECTED: NetconStatus = 7

public val NCT_BRIDGE: NetconType = 6

public val NCT_DIRECT_CONNECT: NetconType = 0

public val NCT_INBOUND: NetconType = 1

public val NCT_INTERNET: NetconType = 2

public val NCT_LAN: NetconType = 3

public val NCT_PHONE: NetconType = 4

public val NCT_TUNNEL: NetconType = 5

public val NCUC_DEFAULT: NetconuiConnectFlags = 0

public val NCUC_ENABLE_DISABLE: NetconuiConnectFlags = 2

public val NCUC_NO_UI: NetconuiConnectFlags = 1

public val NETCON_MAX_NAME_LEN: UInt = 256u

public val NETISO_ERROR_TYPE_INTERNET_CLIENT: NetisoErrorType = 2

public val NETISO_ERROR_TYPE_INTERNET_CLIENT_SERVER: NetisoErrorType = 3

public val NETISO_ERROR_TYPE_MAX: NetisoErrorType = 4

public val NETISO_ERROR_TYPE_NONE: NetisoErrorType = 0

public val NETISO_ERROR_TYPE_PRIVATE_NETWORK: NetisoErrorType = 1

public val NETISO_FLAG_FORCE_COMPUTE_BINARIES: NetisoFlag = 1

public val NETISO_FLAG_MAX: NetisoFlag = 2

public val NETISO_GEID_FOR_NEUTRAL_AWARE: UInt = 2u

public val NETISO_GEID_FOR_WDAG: UInt = 1u

public val NET_FW_ACTION_ALLOW: NetFwAction = 1

public val NET_FW_ACTION_BLOCK: NetFwAction = 0

public val NET_FW_ACTION_MAX: NetFwAction = 2

public val NET_FW_AUTHENTICATE_AND_ENCRYPT: NetFwAuthenticateType = 4

public val NET_FW_AUTHENTICATE_AND_NEGOTIATE_ENCRYPTION: NetFwAuthenticateType = 3

public val NET_FW_AUTHENTICATE_NONE: NetFwAuthenticateType = 0

public val NET_FW_AUTHENTICATE_NO_ENCAPSULATION: NetFwAuthenticateType = 1

public val NET_FW_AUTHENTICATE_WITH_INTEGRITY: NetFwAuthenticateType = 2

public val NET_FW_EDGE_TRAVERSAL_TYPE_ALLOW: NetFwEdgeTraversalType = 1

public val NET_FW_EDGE_TRAVERSAL_TYPE_DEFER_TO_APP: NetFwEdgeTraversalType = 2

public val NET_FW_EDGE_TRAVERSAL_TYPE_DEFER_TO_USER: NetFwEdgeTraversalType = 3

public val NET_FW_EDGE_TRAVERSAL_TYPE_DENY: NetFwEdgeTraversalType = 0

public val NET_FW_IP_PROTOCOL_ANY: NetFwIpProtocol = 256

public val NET_FW_IP_PROTOCOL_TCP: NetFwIpProtocol = 6

public val NET_FW_IP_PROTOCOL_UDP: NetFwIpProtocol = 17

public val NET_FW_IP_VERSION_ANY: NetFwIpVersion = 2

public val NET_FW_IP_VERSION_MAX: NetFwIpVersion = 3

public val NET_FW_IP_VERSION_V4: NetFwIpVersion = 0

public val NET_FW_IP_VERSION_V6: NetFwIpVersion = 1

public val NET_FW_MODIFY_STATE_GP_OVERRIDE: NetFwModifyState = 1

public val NET_FW_MODIFY_STATE_INBOUND_BLOCKED: NetFwModifyState = 2

public val NET_FW_MODIFY_STATE_OK: NetFwModifyState = 0

public val NET_FW_POLICY_EFFECTIVE: NetFwPolicyType = 2

public val NET_FW_POLICY_GROUP: NetFwPolicyType = 0

public val NET_FW_POLICY_LOCAL: NetFwPolicyType = 1

public val NET_FW_POLICY_TYPE_MAX: NetFwPolicyType = 3

public val NET_FW_PROFILE2_ALL: NetFwProfileType2 = 2147483647

public val NET_FW_PROFILE2_DOMAIN: NetFwProfileType2 = 1

public val NET_FW_PROFILE2_PRIVATE: NetFwProfileType2 = 2

public val NET_FW_PROFILE2_PUBLIC: NetFwProfileType2 = 4

public val NET_FW_PROFILE_CURRENT: NetFwProfileType = 2

public val NET_FW_PROFILE_DOMAIN: NetFwProfileType = 0

public val NET_FW_PROFILE_STANDARD: NetFwProfileType = 1

public val NET_FW_PROFILE_TYPE_MAX: NetFwProfileType = 3

public val NET_FW_RULE_CATEGORY_BOOT: NetFwRuleCategory = 0

public val NET_FW_RULE_CATEGORY_CONSEC: NetFwRuleCategory = 3

public val NET_FW_RULE_CATEGORY_FIREWALL: NetFwRuleCategory = 2

public val NET_FW_RULE_CATEGORY_MAX: NetFwRuleCategory = 4

public val NET_FW_RULE_CATEGORY_STEALTH: NetFwRuleCategory = 1

public val NET_FW_RULE_DIR_IN: NetFwRuleDirection = 1

public val NET_FW_RULE_DIR_MAX: NetFwRuleDirection = 3

public val NET_FW_RULE_DIR_OUT: NetFwRuleDirection = 2

public val NET_FW_SCOPE_ALL: NetFwScope = 0

public val NET_FW_SCOPE_CUSTOM: NetFwScope = 2

public val NET_FW_SCOPE_LOCAL_SUBNET: NetFwScope = 1

public val NET_FW_SCOPE_MAX: NetFwScope = 3

public val NET_FW_SERVICE_FILE_AND_PRINT: NetFwServiceType = 0

public val NET_FW_SERVICE_NONE: NetFwServiceType = 3

public val NET_FW_SERVICE_REMOTE_DESKTOP: NetFwServiceType = 2

public val NET_FW_SERVICE_TYPE_MAX: NetFwServiceType = 4

public val NET_FW_SERVICE_UPNP: NetFwServiceType = 1

public val NET_FW_AUTHORIZED_APPLICATION: Guid = Guid.fromU128(U128(0xec9846b327624a6buL, 0xa2146acb603462d2uL))

public val NET_FW_MGR: Guid = Guid.fromU128(U128(0x304ce9426e3940d8uL, 0x943ab913c40c9cd4uL))

public val NET_FW_OPEN_PORT: Guid = Guid.fromU128(U128(0xca545c637ad4a6cuL, 0xbf929f7610067ef5uL))

public val NET_FW_POLICY2: Guid = Guid.fromU128(U128(0xe2b3c97f6ae141acuL, 0x817af6f92166d7dduL))

public val NET_FW_PRODUCT: Guid = Guid.fromU128(U128(0x9d745ed8c5144d1duL, 0xbf42751fed2d5ac7uL))

public val NET_FW_PRODUCTS: Guid = Guid.fromU128(U128(0xcc19079b82724d73uL, 0xbb70cdb533527b61uL))

public val NET_FW_RULE: Guid = Guid.fromU128(U128(0x2c5bc43e33694c33uL, 0xab0cbe9469677af4uL))

public val NET_SHARING_MANAGER: Guid = Guid.fromU128(U128(0x5c63c1ad39564ff8uL, 0x848640034758315buL))

public val S_OBJECT_NO_LONGER_VALID: Hresult = 0x2u.toInt()

public val U_PN_PNAT: Guid = Guid.fromU128(U128(0xae1e00aa3fd5403cuL, 0x8a272bbdc30cd0e1uL))
