package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val CPU_ARCHITECTURE_AMD64: CpuArchitecture = 9u

public val CPU_ARCHITECTURE_IA64: CpuArchitecture = 6u

public val CPU_ARCHITECTURE_INTEL: CpuArchitecture = 0u

public val EVT_WDSMCS_E_CP_CALLBACKS_NOT_REG: Hresult = 0xC1210254u.toInt()

public val EVT_WDSMCS_E_CP_CLOSE_INSTANCE_FAILED: Hresult = 0xC1210258u.toInt()

public val EVT_WDSMCS_E_CP_DLL_LOAD_FAILED: Hresult = 0xC1210250u.toInt()

public val EVT_WDSMCS_E_CP_DLL_LOAD_FAILED_CRITICAL: Hresult = 0xC121025Bu.toInt()

public val EVT_WDSMCS_E_CP_INCOMPATIBLE_SERVER_VERSION: Hresult = 0xC1210253u.toInt()

public val EVT_WDSMCS_E_CP_INIT_FUNC_FAILED: Hresult = 0xC1210252u.toInt()

public val EVT_WDSMCS_E_CP_INIT_FUNC_MISSING: Hresult = 0xC1210251u.toInt()

public val EVT_WDSMCS_E_CP_MEMORY_LEAK: Hresult = 0xC1210256u.toInt()

public val EVT_WDSMCS_E_CP_OPEN_CONTENT_FAILED: Hresult = 0xC1210259u.toInt()

public val EVT_WDSMCS_E_CP_OPEN_INSTANCE_FAILED: Hresult = 0xC1210257u.toInt()

public val EVT_WDSMCS_E_CP_SHUTDOWN_FUNC_FAILED: Hresult = 0xC1210255u.toInt()

public val EVT_WDSMCS_E_DUPLICATE_MULTICAST_ADDR: Hresult = 0xC1210202u.toInt()

public val EVT_WDSMCS_E_NON_WDS_DUPLICATE_MULTICAST_ADDR: Hresult = 0xC1210203u.toInt()

public val EVT_WDSMCS_E_NSREG_CONTENT_PROVIDER_NOT_REG: Hresult = 0xC1210301u.toInt()

public val EVT_WDSMCS_E_NSREG_FAILURE: Hresult = 0xC1210303u.toInt()

public val EVT_WDSMCS_E_NSREG_NAMESPACE_EXISTS: Hresult = 0xC1210302u.toInt()

public val EVT_WDSMCS_E_NSREG_START_TIME_IN_PAST: Hresult = 0xC1210300u.toInt()

public val EVT_WDSMCS_E_PARAMETERS_READ_FAILED: Hresult = 0xC1210201u.toInt()

public val EVT_WDSMCS_S_PARAMETERS_READ: Hresult = 0x41210200u.toInt()

public val EVT_WDSMCS_W_CP_DLL_LOAD_FAILED_NOT_CRITICAL: Hresult = 0x8121025Au.toInt()

public val FACILITY_WDSMCCLIENT: UInt = 290u

public val FACILITY_WDSMCSERVER: UInt = 289u

public val FACILITY_WDSTPTMGMT: UInt = 272u

public val MC_SERVER_CURRENT_VERSION: UInt = 1u

public val PXE_ADDR_BROADCAST: UInt = 1u

public val PXE_ADDR_USE_ADDR: UInt = 4u

public val PXE_ADDR_USE_DHCP_RULES: UInt = 8u

public val PXE_ADDR_USE_PORT: UInt = 2u

public val PXE_BA_CUSTOM: UInt = 2u

public val PXE_BA_IGNORE: UInt = 3u

public val PXE_BA_NBP: UInt = 1u

public val PXE_BA_REJECTED: UInt = 4u

public val PXE_CALLBACK_MAX: UInt = 3u

public val PXE_CALLBACK_RECV_REQUEST: UInt = 0u

public val PXE_CALLBACK_SERVICE_CONTROL: UInt = 2u

public val PXE_CALLBACK_SHUTDOWN: UInt = 1u

public val PXE_DHCPV6_CLIENT_PORT: UInt = 546u

public val PXE_DHCPV6_RELAY_HOP_COUNT_LIMIT: UInt = 32u

public val PXE_DHCPV6_SERVER_PORT: UInt = 547u

public val PXE_DHCP_CLIENT_PORT: UInt = 68u

public val PXE_DHCP_FILE_SIZE: UInt = 128u

public val PXE_DHCP_HWAADR_SIZE: UInt = 16u

public val PXE_DHCP_MAGIC_COOKIE_SIZE: UInt = 4u

public val PXE_DHCP_SERVER_PORT: UInt = 67u

public val PXE_DHCP_SERVER_SIZE: UInt = 64u

public val PXE_GSI_SERVER_DUID: UInt = 2u

public val PXE_GSI_TRACE_ENABLED: UInt = 1u

public val PXE_MAX_ADDRESS: UInt = 16u

public val PXE_PROV_ATTR_FILTER: UInt = 0u

public val PXE_PROV_ATTR_FILTER_IPV6: UInt = 1u

public val PXE_PROV_ATTR_IPV6_CAPABLE: UInt = 2u

public val PXE_PROV_FILTER_ALL: UInt = 0u

public val PXE_PROV_FILTER_DHCP_ONLY: UInt = 1u

public val PXE_PROV_FILTER_PXE_ONLY: UInt = 2u

public val PXE_REG_INDEX_BOTTOM: UInt = 4294967295u

public val PXE_REG_INDEX_TOP: UInt = 0u

public val PXE_SERVER_PORT: UInt = 4011u

public val PXE_TRACE_ERROR: UInt = 524288u

public val PXE_TRACE_FATAL: UInt = 1048576u

public val PXE_TRACE_INFO: UInt = 131072u

public val PXE_TRACE_VERBOSE: UInt = 65536u

public val PXE_TRACE_WARNING: UInt = 262144u

public val TRANSPORTPROVIDER_CURRENT_VERSION: UInt = 1u

public val WDSBP_OPTVAL_ACTION_ABORT: UInt = 5u

public val WDSBP_OPTVAL_ACTION_APPROVAL: UInt = 1u

public val WDSBP_OPTVAL_ACTION_REFERRAL: UInt = 3u

public val WDSBP_OPTVAL_NBP_VER_7: UInt = 1792u

public val WDSBP_OPTVAL_NBP_VER_8: UInt = 2048u

public val WDSBP_OPTVAL_PXE_PROMPT_NOPROMPT: UInt = 2u

public val WDSBP_OPTVAL_PXE_PROMPT_OPTIN: UInt = 1u

public val WDSBP_OPTVAL_PXE_PROMPT_OPTOUT: UInt = 3u

public val WDSBP_OPT_TYPE_BYTE: UInt = 1u

public val WDSBP_OPT_TYPE_IP4: UInt = 6u

public val WDSBP_OPT_TYPE_IP6: UInt = 7u

public val WDSBP_OPT_TYPE_NONE: UInt = 0u

public val WDSBP_OPT_TYPE_STR: UInt = 5u

public val WDSBP_OPT_TYPE_ULONG: UInt = 3u

public val WDSBP_OPT_TYPE_USHORT: UInt = 2u

public val WDSBP_OPT_TYPE_WSTR: UInt = 4u

public val WDSBP_PK_TYPE_BCD: UInt = 4u

public val WDSBP_PK_TYPE_DHCP: UInt = 1u

public val WDSBP_PK_TYPE_DHCPV6: UInt = 8u

public val WDSBP_PK_TYPE_WDSNBP: UInt = 2u

public val WDSMCCLIENT_CATEGORY: Hresult = 0x2u.toInt()

public val WDSMCSERVER_CATEGORY: Hresult = 0x1u.toInt()

public val WDSMCS_E_CLIENT_DOESNOT_SUPPORT_SECURITY_MODE: Hresult = 0xC1210110u.toInt()

public val WDSMCS_E_CLIENT_NOT_FOUND: Hresult = 0xC1210104u.toInt()

public val WDSMCS_E_CONTENT_NOT_FOUND: Hresult = 0xC1210103u.toInt()

public val WDSMCS_E_CONTENT_PROVIDER_NOT_FOUND: Hresult = 0xC1210106u.toInt()

public val WDSMCS_E_INCOMPATIBLE_VERSION: Hresult = 0xC1210102u.toInt()

public val WDSMCS_E_NAMESPACE_ALREADY_EXISTS: Hresult = 0xC1210107u.toInt()

public val WDSMCS_E_NAMESPACE_ALREADY_STARTED: Hresult = 0xC1210109u.toInt()

public val WDSMCS_E_NAMESPACE_NOT_FOUND: Hresult = 0xC1210105u.toInt()

public val WDSMCS_E_NAMESPACE_SHUTDOWN_IN_PROGRESS: Hresult = 0xC1210108u.toInt()

public val WDSMCS_E_NS_START_FAILED_NO_CLIENTS: Hresult = 0xC121010Au.toInt()

public val WDSMCS_E_PACKET_HAS_SECURITY: Hresult = 0xC121010Eu.toInt()

public val WDSMCS_E_PACKET_NOT_CHECKSUMED: Hresult = 0xC121010Fu.toInt()

public val WDSMCS_E_PACKET_NOT_HASHED: Hresult = 0xC121010Cu.toInt()

public val WDSMCS_E_PACKET_NOT_SIGNED: Hresult = 0xC121010Du.toInt()

public val WDSMCS_E_REQCALLBACKS_NOT_REG: Hresult = 0xC1210101u.toInt()

public val WDSMCS_E_SESSION_SHUTDOWN_IN_PROGRESS: Hresult = 0xC1210100u.toInt()

public val WDSMCS_E_START_TIME_IN_PAST: Hresult = 0xC121010Bu.toInt()

public val WDSTPC_E_ALREADY_COMPLETED: Hresult = 0xC1220301u.toInt()

public val WDSTPC_E_ALREADY_IN_LOWEST_SESSION: Hresult = 0xC122030Au.toInt()

public val WDSTPC_E_ALREADY_IN_PROGRESS: Hresult = 0xC1220302u.toInt()

public val WDSTPC_E_CALLBACKS_NOT_REG: Hresult = 0xC1220300u.toInt()

public val WDSTPC_E_CLIENT_DEMOTE_NOT_SUPPORTED: Hresult = 0xC122030Bu.toInt()

public val WDSTPC_E_KICKED_FAIL: Hresult = 0xC1220307u.toInt()

public val WDSTPC_E_KICKED_FALLBACK: Hresult = 0xC1220306u.toInt()

public val WDSTPC_E_KICKED_POLICY_NOT_MET: Hresult = 0xC1220305u.toInt()

public val WDSTPC_E_KICKED_UNKNOWN: Hresult = 0xC1220308u.toInt()

public val WDSTPC_E_MULTISTREAM_NOT_ENABLED: Hresult = 0xC1220309u.toInt()

public val WDSTPC_E_NOT_INITIALIZED: Hresult = 0xC1220304u.toInt()

public val WDSTPC_E_NO_IP4_INTERFACE: Hresult = 0xC122030Cu.toInt()

public val WDSTPC_E_UNKNOWN_ERROR: Hresult = 0xC1220303u.toInt()

public val WDSTPTC_E_WIM_APPLY_REQUIRES_REFERENCE_IMAGE: Hresult = 0xC122030Du.toInt()

public val WDSTPTMGMT_CATEGORY: Hresult = 0x1u.toInt()

public val WDSTPTMGMT_E_CANNOT_REFRESH_DIRTY_OBJECT: Hresult = 0xC110010Fu.toInt()

public val WDSTPTMGMT_E_CANNOT_REINITIALIZE_OBJECT: Hresult = 0xC1100109u.toInt()

public val WDSTPTMGMT_E_CONTENT_PROVIDER_ALREADY_REGISTERED: Hresult = 0xC1100103u.toInt()

public val WDSTPTMGMT_E_CONTENT_PROVIDER_NOT_REGISTERED: Hresult = 0xC1100104u.toInt()

public val WDSTPTMGMT_E_INVALID_AUTO_DISCONNECT_THRESHOLD: Hresult = 0xC110011Cu.toInt()

public val WDSTPTMGMT_E_INVALID_CLASS: Hresult = 0xC1100102u.toInt()

public val WDSTPTMGMT_E_INVALID_CONTENT_PROVIDER_NAME: Hresult = 0xC1100105u.toInt()

public val WDSTPTMGMT_E_INVALID_DIAGNOSTICS_COMPONENTS: Hresult = 0xC110010Eu.toInt()

public val WDSTPTMGMT_E_INVALID_IPV4_MULTICAST_ADDRESS: Hresult = 0xC1100117u.toInt()

public val WDSTPTMGMT_E_INVALID_IPV6_MULTICAST_ADDRESS: Hresult = 0xC1100118u.toInt()

public val WDSTPTMGMT_E_INVALID_IPV6_MULTICAST_ADDRESS_SOURCE: Hresult = 0xC110011Au.toInt()

public val WDSTPTMGMT_E_INVALID_IP_ADDRESS: Hresult = 0xC1100116u.toInt()

public val WDSTPTMGMT_E_INVALID_MULTISTREAM_STREAM_COUNT: Hresult = 0xC110011Bu.toInt()

public val WDSTPTMGMT_E_INVALID_NAMESPACE_DATA: Hresult = 0xC110010Bu.toInt()

public val WDSTPTMGMT_E_INVALID_NAMESPACE_NAME: Hresult = 0xC110010Au.toInt()

public val WDSTPTMGMT_E_INVALID_NAMESPACE_START_PARAMETERS: Hresult = 0xC1100112u.toInt()

public val WDSTPTMGMT_E_INVALID_NAMESPACE_START_TIME: Hresult = 0xC110010Du.toInt()

public val WDSTPTMGMT_E_INVALID_OPERATION: Hresult = 0xC1100101u.toInt()

public val WDSTPTMGMT_E_INVALID_PROPERTY: Hresult = 0xC1100100u.toInt()

public val WDSTPTMGMT_E_INVALID_SERVICE_IP_ADDRESS_RANGE: Hresult = 0xC1100110u.toInt()

public val WDSTPTMGMT_E_INVALID_SERVICE_PORT_RANGE: Hresult = 0xC1100111u.toInt()

public val WDSTPTMGMT_E_INVALID_SLOW_CLIENT_HANDLING_TYPE: Hresult = 0xC110011Eu.toInt()

public val WDSTPTMGMT_E_INVALID_TFTP_MAX_BLOCKSIZE: Hresult = 0xC1100123u.toInt()

public val WDSTPTMGMT_E_IPV6_NOT_SUPPORTED: Hresult = 0xC1100119u.toInt()

public val WDSTPTMGMT_E_MULTICAST_SESSION_POLICY_NOT_SUPPORTED: Hresult = 0xC110011Du.toInt()

public val WDSTPTMGMT_E_NAMESPACE_ALREADY_REGISTERED: Hresult = 0xC1100107u.toInt()

public val WDSTPTMGMT_E_NAMESPACE_NOT_ON_SERVER: Hresult = 0xC1100114u.toInt()

public val WDSTPTMGMT_E_NAMESPACE_NOT_REGISTERED: Hresult = 0xC1100108u.toInt()

public val WDSTPTMGMT_E_NAMESPACE_READ_ONLY: Hresult = 0xC110010Cu.toInt()

public val WDSTPTMGMT_E_NAMESPACE_REMOVED_FROM_SERVER: Hresult = 0xC1100115u.toInt()

public val WDSTPTMGMT_E_NETWORK_PROFILES_NOT_SUPPORTED: Hresult = 0xC110011Fu.toInt()

public val WDSTPTMGMT_E_TFTP_MAX_BLOCKSIZE_NOT_SUPPORTED: Hresult = 0xC1100121u.toInt()

public val WDSTPTMGMT_E_TFTP_VAR_WINDOW_NOT_SUPPORTED: Hresult = 0xC1100122u.toInt()

public val WDSTPTMGMT_E_TRANSPORT_SERVER_ROLE_NOT_CONFIGURED: Hresult = 0xC1100106u.toInt()

public val WDSTPTMGMT_E_TRANSPORT_SERVER_UNAVAILABLE: Hresult = 0xC1100113u.toInt()

public val WDSTPTMGMT_E_UDP_PORT_POLICY_NOT_SUPPORTED: Hresult = 0xC1100120u.toInt()

public val WDSTRANSPORT_RESOURCE_UTILIZATION_UNKNOWN: UInt = 255u

public val WDS_CLI_FIRMWARE_BIOS: WdsCliFirmwareType = 1

public val WDS_CLI_FIRMWARE_EFI: WdsCliFirmwareType = 2

public val WDS_CLI_FIRMWARE_UNKNOWN: WdsCliFirmwareType = 0

public val WDS_CLI_IMAGE_PARAM_SPARSE_FILE: WdsCliImageParamType = 1

public val WDS_CLI_IMAGE_PARAM_SUPPORTED_FIRMWARES: WdsCliImageParamType = 2

public val WDS_CLI_IMAGE_PARAM_UNKNOWN: WdsCliImageParamType = 0

public val WDS_CLI_IMAGE_TYPE_UNKNOWN: WdsCliImageType = 0

public val WDS_CLI_IMAGE_TYPE_VHD: WdsCliImageType = 2

public val WDS_CLI_IMAGE_TYPE_VHDX: WdsCliImageType = 3

public val WDS_CLI_IMAGE_TYPE_WIM: WdsCliImageType = 1

public val WDS_CLI_MSG_COMPLETE: PfnWdsCliCallbackMessageId = 1u

public val WDS_CLI_MSG_PROGRESS: PfnWdsCliCallbackMessageId = 2u

public val WDS_CLI_MSG_START: PfnWdsCliCallbackMessageId = 0u

public val WDS_CLI_MSG_TEXT: PfnWdsCliCallbackMessageId = 3u

public val WDS_CLI_NO_SPARSE_FILE: UInt = 2u

public val WDS_CLI_TRANSFER_ASYNCHRONOUS: UInt = 1u

public val WDS_LOG_LEVEL_DISABLED: Int = 0

public val WDS_LOG_LEVEL_ERROR: Int = 1

public val WDS_LOG_LEVEL_INFO: Int = 3

public val WDS_LOG_LEVEL_WARNING: Int = 2

public val WDS_LOG_TYPE_CLIENT_APPLY_FINISHED: Int = 6

public val WDS_LOG_TYPE_CLIENT_APPLY_FINISHED_2: Int = 16

public val WDS_LOG_TYPE_CLIENT_APPLY_STARTED: Int = 5

public val WDS_LOG_TYPE_CLIENT_APPLY_STARTED_2: Int = 15

public val WDS_LOG_TYPE_CLIENT_DOMAINJOINERROR: Int = 12

public val WDS_LOG_TYPE_CLIENT_DOMAINJOINERROR_2: Int = 17

public val WDS_LOG_TYPE_CLIENT_DRIVER_PACKAGE_NOT_ACCESSIBLE: Int = 18

public val WDS_LOG_TYPE_CLIENT_ERROR: Int = 1

public val WDS_LOG_TYPE_CLIENT_FINISHED: Int = 3

public val WDS_LOG_TYPE_CLIENT_GENERIC_MESSAGE: Int = 7

public val WDS_LOG_TYPE_CLIENT_IMAGE_SELECTED: Int = 4

public val WDS_LOG_TYPE_CLIENT_IMAGE_SELECTED2: Int = 22

public val WDS_LOG_TYPE_CLIENT_IMAGE_SELECTED3: Int = 23

public val WDS_LOG_TYPE_CLIENT_MAX_CODE: Int = 24

public val WDS_LOG_TYPE_CLIENT_OFFLINE_DRIVER_INJECTION_END: Int = 20

public val WDS_LOG_TYPE_CLIENT_OFFLINE_DRIVER_INJECTION_FAILURE: Int = 21

public val WDS_LOG_TYPE_CLIENT_OFFLINE_DRIVER_INJECTION_START: Int = 19

public val WDS_LOG_TYPE_CLIENT_POST_ACTIONS_END: Int = 14

public val WDS_LOG_TYPE_CLIENT_POST_ACTIONS_START: Int = 13

public val WDS_LOG_TYPE_CLIENT_STARTED: Int = 2

public val WDS_LOG_TYPE_CLIENT_TRANSFER_DOWNGRADE: Int = 11

public val WDS_LOG_TYPE_CLIENT_TRANSFER_END: Int = 10

public val WDS_LOG_TYPE_CLIENT_TRANSFER_START: Int = 9

public val WDS_LOG_TYPE_CLIENT_UNATTEND_MODE: Int = 8

public val WDS_MC_TRACE_ERROR: UInt = 524288u

public val WDS_MC_TRACE_FATAL: UInt = 1048576u

public val WDS_MC_TRACE_INFO: UInt = 131072u

public val WDS_MC_TRACE_VERBOSE: UInt = 65536u

public val WDS_MC_TRACE_WARNING: UInt = 262144u

public val WDS_TRANSPORTCLIENT_AUTH: WdsTransportclientRequestAuthLevel = 1u

public val WDS_TRANSPORTCLIENT_CURRENT_API_VERSION: UInt = 1u

public val WDS_TRANSPORTCLIENT_MAX_CALLBACKS: TransportclientCallbackId = 6

public val WDS_TRANSPORTCLIENT_NO_AUTH: WdsTransportclientRequestAuthLevel = 2u

public val WDS_TRANSPORTCLIENT_NO_CACHE: UInt = 0u

public val WDS_TRANSPORTCLIENT_PROTOCOL_MULTICAST: UInt = 1u

public val WDS_TRANSPORTCLIENT_RECEIVE_CONTENTS: TransportclientCallbackId = 1

public val WDS_TRANSPORTCLIENT_RECEIVE_METADATA: TransportclientCallbackId = 3

public val WDS_TRANSPORTCLIENT_SESSION_COMPLETE: TransportclientCallbackId = 2

public val WDS_TRANSPORTCLIENT_SESSION_NEGOTIATE: TransportclientCallbackId = 5

public val WDS_TRANSPORTCLIENT_SESSION_START: TransportclientCallbackId = 0

public val WDS_TRANSPORTCLIENT_SESSION_STARTEX: TransportclientCallbackId = 4

public val WDS_TRANSPORTCLIENT_STATUS_FAILURE: UInt = 3u

public val WDS_TRANSPORTCLIENT_STATUS_IN_PROGRESS: UInt = 1u

public val WDS_TRANSPORTCLIENT_STATUS_SUCCESS: UInt = 2u

public val WDS_TRANSPORTPROVIDER_CLOSE_CONTENT: TransportproviderCallbackId = 6

public val WDS_TRANSPORTPROVIDER_CLOSE_INSTANCE: TransportproviderCallbackId = 7

public val WDS_TRANSPORTPROVIDER_COMPARE_CONTENT: TransportproviderCallbackId = 1

public val WDS_TRANSPORTPROVIDER_CREATE_INSTANCE: TransportproviderCallbackId = 0

public val WDS_TRANSPORTPROVIDER_DUMP_STATE: TransportproviderCallbackId = 9

public val WDS_TRANSPORTPROVIDER_GET_CONTENT_METADATA: TransportproviderCallbackId = 11

public val WDS_TRANSPORTPROVIDER_GET_CONTENT_SIZE: TransportproviderCallbackId = 4

public val WDS_TRANSPORTPROVIDER_MAX_CALLBACKS: TransportproviderCallbackId = 12

public val WDS_TRANSPORTPROVIDER_OPEN_CONTENT: TransportproviderCallbackId = 2

public val WDS_TRANSPORTPROVIDER_READ_CONTENT: TransportproviderCallbackId = 5

public val WDS_TRANSPORTPROVIDER_REFRESH_SETTINGS: TransportproviderCallbackId = 10

public val WDS_TRANSPORTPROVIDER_SHUTDOWN: TransportproviderCallbackId = 8

public val WDS_TRANSPORTPROVIDER_USER_ACCESS_CHECK: TransportproviderCallbackId = 3

public val WDS_CLI_FLAG_ENUM_FILTER_FIRMWARE: Int = 2

public val WDS_CLI_FLAG_ENUM_FILTER_VERSION: Int = 1

public val WDS_TPT_DIAGNOSTICS_COMPONENT_IMAGE_SERVER: WdstransportDiagnosticsComponentFlags = 4

public val WDS_TPT_DIAGNOSTICS_COMPONENT_MULTICAST: WdstransportDiagnosticsComponentFlags = 8

public val WDS_TPT_DIAGNOSTICS_COMPONENT_PXE: WdstransportDiagnosticsComponentFlags = 1

public val WDS_TPT_DIAGNOSTICS_COMPONENT_TFTP: WdstransportDiagnosticsComponentFlags = 2

public val WDS_TPT_DISCONNECT_ABORT: WdstransportDisconnectType = 2

public val WDS_TPT_DISCONNECT_FALLBACK: WdstransportDisconnectType = 1

public val WDS_TPT_DISCONNECT_UNKNOWN: WdstransportDisconnectType = 0

public val WDS_TPT_FEATURE_ADMIN_PACK: WdstransportFeatureFlags = 1

public val WDS_TPT_FEATURE_DEPLOYMENT_SERVER: WdstransportFeatureFlags = 4

public val WDS_TPT_FEATURE_TRANSPORT_SERVER: WdstransportFeatureFlags = 2

public val WDS_TPT_IP_ADDRESS_IPV4: WdstransportIpAddressType = 1

public val WDS_TPT_IP_ADDRESS_IPV6: WdstransportIpAddressType = 2

public val WDS_TPT_IP_ADDRESS_SOURCE_DHCP: WdstransportIpAddressSourceType = 1

public val WDS_TPT_IP_ADDRESS_SOURCE_RANGE: WdstransportIpAddressSourceType = 2

public val WDS_TPT_IP_ADDRESS_SOURCE_UNKNOWN: WdstransportIpAddressSourceType = 0

public val WDS_TPT_IP_ADDRESS_UNKNOWN: WdstransportIpAddressType = 0

public val WDS_TPT_NAMESPACE_TYPE_AUTO_CAST: WdstransportNamespaceType = 1

public val WDS_TPT_NAMESPACE_TYPE_SCHEDULED_CAST_AUTO_START: WdstransportNamespaceType = 3

public val WDS_TPT_NAMESPACE_TYPE_SCHEDULED_CAST_MANUAL_START: WdstransportNamespaceType = 2

public val WDS_TPT_NAMESPACE_TYPE_UNKNOWN: WdstransportNamespaceType = 0

public val WDS_TPT_NETWORK_PROFILE100MBPS: WdstransportNetworkProfileType = 3

public val WDS_TPT_NETWORK_PROFILE10MBPS: WdstransportNetworkProfileType = 2

public val WDS_TPT_NETWORK_PROFILE1GBPS: WdstransportNetworkProfileType = 4

public val WDS_TPT_NETWORK_PROFILE_CUSTOM: WdstransportNetworkProfileType = 1

public val WDS_TPT_NETWORK_PROFILE_UNKNOWN: WdstransportNetworkProfileType = 0

public val WDS_TPT_PROTOCOL_MULTICAST: WdstransportProtocolFlags = 2

public val WDS_TPT_PROTOCOL_UNICAST: WdstransportProtocolFlags = 1

public val WDS_TPT_SERVICE_NOTIFY_READ_SETTINGS: WdstransportServiceNotification = 1

public val WDS_TPT_SERVICE_NOTIFY_UNKNOWN: WdstransportServiceNotification = 0

public val WDS_TPT_SLOW_CLIENT_HANDLING_AUTO_DISCONNECT: WdstransportSlowClientHandlingType = 2

public val WDS_TPT_SLOW_CLIENT_HANDLING_MULTISTREAM: WdstransportSlowClientHandlingType = 3

public val WDS_TPT_SLOW_CLIENT_HANDLING_NONE: WdstransportSlowClientHandlingType = 1

public val WDS_TPT_SLOW_CLIENT_HANDLING_UNKNOWN: WdstransportSlowClientHandlingType = 0

public val WDS_TPT_TFTP_CAP_MAXIMUM_BLOCK_SIZE: WdstransportTftpCapability = 1

public val WDS_TPT_TFTP_CAP_VARIABLE_WINDOW: WdstransportTftpCapability = 2

public val WDS_TPT_UDP_PORT_POLICY_DYNAMIC: WdstransportUdpPortPolicy = 0

public val WDS_TPT_UDP_PORT_POLICY_FIXED: WdstransportUdpPortPolicy = 1

public val WDS_TRANSPORT_CACHEABLE: Guid = Guid.fromU128(U128(0x70590b16f14646bduL, 0xbd9d4aaa90084bf5uL))

public val WDS_TRANSPORT_CLIENT: Guid = Guid.fromU128(U128(0x66d2c5e90ff649ecuL, 0x9733dafb1e01df1cuL))

public val WDS_TRANSPORT_COLLECTION: Guid = Guid.fromU128(U128(0xc7f18b09391e436euL, 0xb10bc3ef46f2c34fuL))

public val WDS_TRANSPORT_CONFIGURATION_MANAGER: Guid = Guid.fromU128(U128(0x8743f674904c47cauL, 0x851235fe98f6b0acuL))

public val WDS_TRANSPORT_CONTENT: Guid = Guid.fromU128(U128(0xa891fe74a3f4c65uL, 0xb6f21467619679eauL))

public val WDS_TRANSPORT_CONTENT_PROVIDER: Guid = Guid.fromU128(U128(0xe0be741f5a754eb9uL, 0x8a2d5e189b45f327uL))

public val WDS_TRANSPORT_DIAGNOSTICS_POLICY: Guid = Guid.fromU128(U128(0xeb3333e1a7ad46f5uL, 0x80d66b740204e509uL))

public val WDS_TRANSPORT_MANAGER: Guid = Guid.fromU128(U128(0xf21523f6837c4a58uL, 0xaf998a7e27f8ff59uL))

public val WDS_TRANSPORT_MULTICAST_SESSION_POLICY: Guid = Guid.fromU128(U128(0x3c6bc3f46418472auL, 0xb6f152d457195437uL))

public val WDS_TRANSPORT_NAMESPACE: Guid = Guid.fromU128(U128(0xd838576807324ec1uL, 0x95ea16da581908a1uL))

public val WDS_TRANSPORT_NAMESPACE_AUTO_CAST: Guid = Guid.fromU128(U128(0xb091f5a86a99478duL, 0xb23b09e8fee04574uL))

public val WDS_TRANSPORT_NAMESPACE_MANAGER: Guid = Guid.fromU128(U128(0xf08cdb6385de4a28uL, 0xa1a95ca3e7efda73uL))

public val WDS_TRANSPORT_NAMESPACE_SCHEDULED_CAST: Guid = Guid.fromU128(U128(0xbadc1897702544ebuL, 0x9108fb61c4055792uL))

public val WDS_TRANSPORT_NAMESPACE_SCHEDULED_CAST_AUTO_START: Guid = Guid.fromU128(U128(0xa1107052122c4b81uL, 0x9b7c386e6855383fuL))

public val WDS_TRANSPORT_NAMESPACE_SCHEDULED_CAST_MANUAL_START: Guid = Guid.fromU128(U128(0xd3e1a2aacaac460euL, 0xb98a47f9f318a1fauL))

public val WDS_TRANSPORT_SERVER: Guid = Guid.fromU128(U128(0xea19b6434adf4413uL, 0x942c14f379118760uL))

public val WDS_TRANSPORT_SERVICE_POLICY: Guid = Guid.fromU128(U128(0x65aceadc2f0b4f43uL, 0x9f4d811865d8ceaduL))

public val WDS_TRANSPORT_SESSION: Guid = Guid.fromU128(U128(0x749ac4e067bc4743uL, 0xbfe5cacb1f26f57fuL))

public val WDS_TRANSPORT_SETUP_MANAGER: Guid = Guid.fromU128(U128(0xc7beeaad9f044923uL, 0x9f0cfbf52bc7590fuL))

public val WDS_TRANSPORT_TFTP_CLIENT: Guid = Guid.fromU128(U128(0x503439257c5c4c8cuL, 0x96c4ad9fa5005fbauL))

public val WDS_TRANSPORT_TFTP_MANAGER: Guid = Guid.fromU128(U128(0xc8e9dca232414e4duL, 0xb806bc74019dfedauL))
