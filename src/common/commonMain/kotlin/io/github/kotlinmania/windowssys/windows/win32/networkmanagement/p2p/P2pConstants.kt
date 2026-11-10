package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val DRT_ACTIVE: DrtStatus = 0

public val DRT_ADDRESS_FLAG_ACCEPTED: DrtAddressFlags = 1

public val DRT_ADDRESS_FLAG_BAD_VALIDATE_ID: DrtAddressFlags = 32

public val DRT_ADDRESS_FLAG_INQUIRE: DrtAddressFlags = 128

public val DRT_ADDRESS_FLAG_LOOP: DrtAddressFlags = 8

public val DRT_ADDRESS_FLAG_REJECTED: DrtAddressFlags = 2

public val DRT_ADDRESS_FLAG_SUSPECT_UNREGISTERED_ID: DrtAddressFlags = 64

public val DRT_ADDRESS_FLAG_TOO_BUSY: DrtAddressFlags = 16

public val DRT_ADDRESS_FLAG_UNREACHABLE: DrtAddressFlags = 4

public val DRT_ALONE: DrtStatus = 1

public val DRT_EVENT_LEAFSET_KEY_CHANGED: DrtEventType = 1

public val DRT_EVENT_REGISTRATION_STATE_CHANGED: DrtEventType = 2

public val DRT_EVENT_STATUS_CHANGED: DrtEventType = 0

public val DRT_E_BOOTSTRAPPROVIDER_IN_USE: Hresult = 0x8062200Eu.toInt()

public val DRT_E_BOOTSTRAPPROVIDER_NOT_ATTACHED: Hresult = 0x8062200Fu.toInt()

public val DRT_E_CAPABILITY_MISMATCH: Hresult = 0x8062210Fu.toInt()

public val DRT_E_DUPLICATE_KEY: Hresult = 0x80622009u.toInt()

public val DRT_E_FAULTED: Hresult = 0x8062210Au.toInt()

public val DRT_E_INSUFFICIENT_BUFFER: Hresult = 0x8062210Cu.toInt()

public val DRT_E_INVALID_ADDRESS: Hresult = 0x80622005u.toInt()

public val DRT_E_INVALID_BOOTSTRAP_PROVIDER: Hresult = 0x80622004u.toInt()

public val DRT_E_INVALID_CERT_CHAIN: Hresult = 0x80621004u.toInt()

public val DRT_E_INVALID_INSTANCE_PREFIX: Hresult = 0x8062210Du.toInt()

public val DRT_E_INVALID_KEY: Hresult = 0x80621009u.toInt()

public val DRT_E_INVALID_KEY_SIZE: Hresult = 0x80621002u.toInt()

public val DRT_E_INVALID_MAX_ADDRESSES: Hresult = 0x80621007u.toInt()

public val DRT_E_INVALID_MAX_ENDPOINTS: Hresult = 0x80621011u.toInt()

public val DRT_E_INVALID_MESSAGE: Hresult = 0x80621005u.toInt()

public val DRT_E_INVALID_PORT: Hresult = 0x80622000u.toInt()

public val DRT_E_INVALID_SCOPE: Hresult = 0x80622006u.toInt()

public val DRT_E_INVALID_SEARCH_INFO: Hresult = 0x80622109u.toInt()

public val DRT_E_INVALID_SEARCH_RANGE: Hresult = 0x80621012u.toInt()

public val DRT_E_INVALID_SECURITY_MODE: Hresult = 0x8062210Eu.toInt()

public val DRT_E_INVALID_SECURITY_PROVIDER: Hresult = 0x80622002u.toInt()

public val DRT_E_INVALID_SETTINGS: Hresult = 0x80622108u.toInt()

public val DRT_E_INVALID_TRANSPORT_PROVIDER: Hresult = 0x80622001u.toInt()

public val DRT_E_NO_ADDRESSES_AVAILABLE: Hresult = 0x80622008u.toInt()

public val DRT_E_NO_MORE: Hresult = 0x80621006u.toInt()

public val DRT_E_SEARCH_IN_PROGRESS: Hresult = 0x80621008u.toInt()

public val DRT_E_SECURITYPROVIDER_IN_USE: Hresult = 0x8062200Cu.toInt()

public val DRT_E_SECURITYPROVIDER_NOT_ATTACHED: Hresult = 0x8062200Du.toInt()

public val DRT_E_STILL_IN_USE: Hresult = 0x80622003u.toInt()

public val DRT_E_TIMEOUT: Hresult = 0x80621001u.toInt()

public val DRT_E_TRANSPORTPROVIDER_IN_USE: Hresult = 0x8062200Au.toInt()

public val DRT_E_TRANSPORTPROVIDER_NOT_ATTACHED: Hresult = 0x8062200Bu.toInt()

public val DRT_E_TRANSPORT_ALREADY_BOUND: Hresult = 0x80622101u.toInt()

public val DRT_E_TRANSPORT_ALREADY_EXISTS_FOR_SCOPE: Hresult = 0x80622107u.toInt()

public val DRT_E_TRANSPORT_EXECUTING_CALLBACK: Hresult = 0x80622106u.toInt()

public val DRT_E_TRANSPORT_INVALID_ARGUMENT: Hresult = 0x80622104u.toInt()

public val DRT_E_TRANSPORT_NOT_BOUND: Hresult = 0x80622102u.toInt()

public val DRT_E_TRANSPORT_NO_DEST_ADDRESSES: Hresult = 0x80622105u.toInt()

public val DRT_E_TRANSPORT_SHUTTING_DOWN: Hresult = 0x80622007u.toInt()

public val DRT_E_TRANSPORT_STILL_BOUND: Hresult = 0x8062210Bu.toInt()

public val DRT_E_TRANSPORT_UNEXPECTED: Hresult = 0x80622103u.toInt()

public val DRT_FAULTED: DrtStatus = 20

public val DRT_GLOBAL_SCOPE: DrtScope = 1

public val DRT_LEAFSET_KEY_ADDED: DrtLeafsetKeyChangeType = 0

public val DRT_LEAFSET_KEY_DELETED: DrtLeafsetKeyChangeType = 1

public val DRT_LINK_LOCAL_ISATAP_SCOPEID: UInt = 4294967295u

public val DRT_LINK_LOCAL_SCOPE: DrtScope = 3

public val DRT_MATCH_EXACT: DrtMatchType = 0

public val DRT_MATCH_INTERMEDIATE: DrtMatchType = 2

public val DRT_MATCH_NEAR: DrtMatchType = 1

public val DRT_MAX_INSTANCE_PREFIX_LEN: UInt = 128u

public val DRT_MAX_PAYLOAD_SIZE: UInt = 5120u

public val DRT_MAX_ROUTING_ADDRESSES: UInt = 20u

public val DRT_MIN_ROUTING_ADDRESSES: UInt = 1u

public val DRT_NO_NETWORK: DrtStatus = 10

public val DRT_PAYLOAD_REVOKED: UInt = 1u

public val DRT_REGISTRATION_STATE_UNRESOLVEABLE: DrtRegistrationState = 1

public val DRT_SECURE_CONFIDENTIALPAYLOAD: DrtSecurityMode = 2

public val DRT_SECURE_MEMBERSHIP: DrtSecurityMode = 1

public val DRT_SECURE_RESOLVE: DrtSecurityMode = 0

public val DRT_SITE_LOCAL_SCOPE: DrtScope = 2

public val DRT_S_RETRY: Hresult = 0x621010u.toInt()

public val FACILITY_DRT: UInt = 98u

public val MAXIMUM_PEER_DIST_CLIENT_INFO_BY_HANDLES_CLASS: PeerdistClientInfoByHandleClass = 1

public val NS_PNRPCLOUD: UInt = 39u

public val NS_PNRPNAME: UInt = 38u

public val NS_PROVIDER_PNRPCLOUD: Guid = Guid.fromU128(U128(0x3fe89ce766d4976uL, 0xb9c1bb9bc42c7b4duL))

public val NS_PROVIDER_PNRPNAME: Guid = Guid.fromU128(U128(0x3fe89cd766d4976uL, 0xb9c1bb9bc42c7b4duL))

public val PEERDIST_PUBLICATION_OPTIONS_VERSION: Int = 2

public val PEERDIST_PUBLICATION_OPTIONS_VERSION_1: Int = 1

public val PEERDIST_PUBLICATION_OPTIONS_VERSION_2: Int = 2

public val PEERDIST_READ_TIMEOUT_DEFAULT: UInt = 4294967294u

public val PEERDIST_READ_TIMEOUT_LOCAL_CACHE_ONLY: UInt = 0u

public val PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION: PeerdistRetrievalOptionsContentinfoVersionValue = 2u

public val PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_1: PeerdistRetrievalOptionsContentinfoVersionValue = 1u

public val PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_2: PeerdistRetrievalOptionsContentinfoVersionValue = 2u

public val PEERDIST_STATUS_AVAILABLE: PeerdistStatus = 2

public val PEERDIST_STATUS_DISABLED: PeerdistStatus = 0

public val PEERDIST_STATUS_UNAVAILABLE: PeerdistStatus = 1

public val PEER_APPLICATION_ALL_USERS: PeerApplicationRegistrationType = 1

public val PEER_APPLICATION_CURRENT_USER: PeerApplicationRegistrationType = 0

public val PEER_CHANGE_ADDED: PeerChangeType = 0

public val PEER_CHANGE_DELETED: PeerChangeType = 1

public val PEER_CHANGE_UPDATED: PeerChangeType = 2

public val PEER_COLLAB_OBJECTID_USER_PICTURE: Guid = Guid.fromU128(U128(0xdd15f41ffc4e4922uL, 0xb0354c06a754d01duL))

public val PEER_CONNECTED: PeerConnectionStatus = 1

public val PEER_CONNECTION_DIRECT: PeerConnectionFlags = 2

public val PEER_CONNECTION_FAILED: PeerConnectionStatus = 3

public val PEER_CONNECTION_NEIGHBOR: PeerConnectionFlags = 1

public val PEER_DEFER_EXPIRATION: PeerGroupPropertyFlags = 4

public val PEER_DISABLE_PRESENCE: PeerGroupPropertyFlags = 2

public val PEER_DISCONNECTED: PeerConnectionStatus = 2

public val PEER_EVENT_ENDPOINT_APPLICATION_CHANGED: PeerCollabEventType = 4

public val PEER_EVENT_ENDPOINT_CHANGED: PeerCollabEventType = 2

public val PEER_EVENT_ENDPOINT_OBJECT_CHANGED: PeerCollabEventType = 5

public val PEER_EVENT_ENDPOINT_PRESENCE_CHANGED: PeerCollabEventType = 3

public val PEER_EVENT_MY_APPLICATION_CHANGED: PeerCollabEventType = 8

public val PEER_EVENT_MY_ENDPOINT_CHANGED: PeerCollabEventType = 6

public val PEER_EVENT_MY_OBJECT_CHANGED: PeerCollabEventType = 9

public val PEER_EVENT_MY_PRESENCE_CHANGED: PeerCollabEventType = 7

public val PEER_EVENT_PEOPLE_NEAR_ME_CHANGED: PeerCollabEventType = 10

public val PEER_EVENT_REQUEST_STATUS_CHANGED: PeerCollabEventType = 11

public val PEER_EVENT_WATCHLIST_CHANGED: PeerCollabEventType = 1

public val PEER_E_ALREADY_EXISTS: Hresult = 0x800700B7u.toInt()

public val PEER_E_CLIENT_INVALID_COMPARTMENT_ID: Hresult = 0x80072CF2u.toInt()

public val PEER_E_CLOUD_DISABLED: Hresult = 0x80072CEEu.toInt()

public val PEER_E_CLOUD_IS_DEAD: Hresult = 0x80072CF5u.toInt()

public val PEER_E_CLOUD_IS_SEARCH_ONLY: Hresult = 0x80072CF1u.toInt()

public val PEER_E_CLOUD_NOT_FOUND: Hresult = 0x80072CEDu.toInt()

public val PEER_E_DISK_FULL: Hresult = 0x80070070u.toInt()

public val PEER_E_DUPLICATE_PEER_NAME: Hresult = 0x80072CF4u.toInt()

public val PEER_E_INVALID_IDENTITY: Hresult = 0x80072CEFu.toInt()

public val PEER_E_NOT_FOUND: Hresult = 0x80070490u.toInt()

public val PEER_E_TOO_MUCH_LOAD: Hresult = 0x80072CF0u.toInt()

public val PEER_GRAPH_EVENT_CONNECTION_REQUIRED: PeerGraphEventType = 7

public val PEER_GRAPH_EVENT_DIRECT_CONNECTION: PeerGraphEventType = 4

public val PEER_GRAPH_EVENT_INCOMING_DATA: PeerGraphEventType = 6

public val PEER_GRAPH_EVENT_NEIGHBOR_CONNECTION: PeerGraphEventType = 5

public val PEER_GRAPH_EVENT_NODE_CHANGED: PeerGraphEventType = 8

public val PEER_GRAPH_EVENT_PROPERTY_CHANGED: PeerGraphEventType = 2

public val PEER_GRAPH_EVENT_RECORD_CHANGED: PeerGraphEventType = 3

public val PEER_GRAPH_EVENT_STATUS_CHANGED: PeerGraphEventType = 1

public val PEER_GRAPH_EVENT_SYNCHRONIZED: PeerGraphEventType = 9

public val PEER_GRAPH_PROPERTY_DEFER_EXPIRATION: PeerGraphPropertyFlags = 2

public val PEER_GRAPH_PROPERTY_HEARTBEATS: PeerGraphPropertyFlags = 1

public val PEER_GRAPH_SCOPE_ANY: PeerGraphScope = 0

public val PEER_GRAPH_SCOPE_GLOBAL: PeerGraphScope = 1

public val PEER_GRAPH_SCOPE_LINKLOCAL: PeerGraphScope = 3

public val PEER_GRAPH_SCOPE_LOOPBACK: PeerGraphScope = 4

public val PEER_GRAPH_SCOPE_SITELOCAL: PeerGraphScope = 2

public val PEER_GRAPH_STATUS_HAS_CONNECTIONS: PeerGraphStatusFlags = 2

public val PEER_GRAPH_STATUS_LISTENING: PeerGraphStatusFlags = 1

public val PEER_GRAPH_STATUS_SYNCHRONIZED: PeerGraphStatusFlags = 4

public val PEER_GROUP_EVENT_AUTHENTICATION_FAILED: PeerGroupEventType = 11

public val PEER_GROUP_EVENT_CONNECTION_FAILED: PeerGroupEventType = 10

public val PEER_GROUP_EVENT_DIRECT_CONNECTION: PeerGroupEventType = 4

public val PEER_GROUP_EVENT_INCOMING_DATA: PeerGroupEventType = 6

public val PEER_GROUP_EVENT_MEMBER_CHANGED: PeerGroupEventType = 8

public val PEER_GROUP_EVENT_NEIGHBOR_CONNECTION: PeerGroupEventType = 5

public val PEER_GROUP_EVENT_PROPERTY_CHANGED: PeerGroupEventType = 2

public val PEER_GROUP_EVENT_RECORD_CHANGED: PeerGroupEventType = 3

public val PEER_GROUP_EVENT_STATUS_CHANGED: PeerGroupEventType = 1

public val PEER_GROUP_GMC_AUTHENTICATION: PeerGroupAuthenticationScheme = 1

public val PEER_GROUP_PASSWORD_AUTHENTICATION: PeerGroupAuthenticationScheme = 2

public val PEER_GROUP_ROLE_ADMIN: Guid = Guid.fromU128(U128(0x4387127aa56450auL, 0x8ce54f565c6790f4uL))

public val PEER_GROUP_ROLE_INVITING_MEMBER: Guid = Guid.fromU128(U128(0x4370fd89dc184cfbuL, 0x8dbf9853a8a9f905uL))

public val PEER_GROUP_ROLE_MEMBER: Guid = Guid.fromU128(U128(0xf12dc4c708574ca0uL, 0x93fcb1bb19a3d8c2uL))

public val PEER_GROUP_STATUS_HAS_CONNECTIONS: PeerGroupStatus = 2

public val PEER_GROUP_STATUS_LISTENING: PeerGroupStatus = 1

public val PEER_GROUP_STORE_CREDENTIALS: PeerGroupIssueCredentialFlags = 1

public val PEER_INVITATION_RESPONSE_ACCEPTED: PeerInvitationResponseType = 1

public val PEER_INVITATION_RESPONSE_DECLINED: PeerInvitationResponseType = 0

public val PEER_INVITATION_RESPONSE_ERROR: PeerInvitationResponseType = 3

public val PEER_INVITATION_RESPONSE_EXPIRED: PeerInvitationResponseType = 2

public val PEER_MEMBER_CONNECTED: PeerMemberChangeType = 1

public val PEER_MEMBER_DATA_OPTIONAL: PeerGroupPropertyFlags = 1

public val PEER_MEMBER_DISCONNECTED: PeerMemberChangeType = 2

public val PEER_MEMBER_JOINED: PeerMemberChangeType = 4

public val PEER_MEMBER_LEFT: PeerMemberChangeType = 5

public val PEER_MEMBER_PRESENT: PeerMemberFlags = 1

public val PEER_MEMBER_UPDATED: PeerMemberChangeType = 3

public val PEER_NODE_CHANGE_CONNECTED: PeerNodeChangeType = 1

public val PEER_NODE_CHANGE_DISCONNECTED: PeerNodeChangeType = 2

public val PEER_NODE_CHANGE_UPDATED: PeerNodeChangeType = 3

public val PEER_PNRP_ALL_LINK_CLOUDS: Pcwstr = w("PEER_PNRP_ALL_LINKS")

public val PEER_PRESENCE_AWAY: PeerPresenceStatus = 2

public val PEER_PRESENCE_BE_RIGHT_BACK: PeerPresenceStatus = 3

public val PEER_PRESENCE_BUSY: PeerPresenceStatus = 5

public val PEER_PRESENCE_IDLE: PeerPresenceStatus = 4

public val PEER_PRESENCE_OFFLINE: PeerPresenceStatus = 0

public val PEER_PRESENCE_ONLINE: PeerPresenceStatus = 7

public val PEER_PRESENCE_ON_THE_PHONE: PeerPresenceStatus = 6

public val PEER_PRESENCE_OUT_TO_LUNCH: PeerPresenceStatus = 1

public val PEER_PUBLICATION_SCOPE_ALL: PeerPublicationScope = 3

public val PEER_PUBLICATION_SCOPE_INTERNET: PeerPublicationScope = 2

public val PEER_PUBLICATION_SCOPE_NEAR_ME: PeerPublicationScope = 1

public val PEER_PUBLICATION_SCOPE_NONE: PeerPublicationScope = 0

public val PEER_RECORD_ADDED: PeerRecordChangeType = 1

public val PEER_RECORD_DELETED: PeerRecordChangeType = 3

public val PEER_RECORD_EXPIRED: PeerRecordChangeType = 4

public val PEER_RECORD_FLAG_AUTOREFRESH: PeerRecordFlags = 1

public val PEER_RECORD_FLAG_DELETED: PeerRecordFlags = 2

public val PEER_RECORD_UPDATED: PeerRecordChangeType = 2

public val PEER_SIGNIN_ALL: PeerSigninFlags = 3

public val PEER_SIGNIN_INTERNET: PeerSigninFlags = 2

public val PEER_SIGNIN_NEAR_ME: PeerSigninFlags = 1

public val PEER_SIGNIN_NONE: PeerSigninFlags = 0

public val PEER_WATCH_ALLOWED: PeerWatchPermission = 1

public val PEER_WATCH_BLOCKED: PeerWatchPermission = 0

public val PNRPINFO_HINT: UInt = 1u

public val PNRP_CLOUD_FULL_PARTICIPANT: PnrpCloudFlags = 4

public val PNRP_CLOUD_NAME_LOCAL: PnrpCloudFlags = 1

public val PNRP_CLOUD_NO_FLAGS: PnrpCloudFlags = 0

public val PNRP_CLOUD_RESOLVE_ONLY: PnrpCloudFlags = 2

public val PNRP_CLOUD_STATE_ACTIVE: PnrpCloudState = 2

public val PNRP_CLOUD_STATE_ALONE: PnrpCloudState = 6

public val PNRP_CLOUD_STATE_DEAD: PnrpCloudState = 3

public val PNRP_CLOUD_STATE_DISABLED: PnrpCloudState = 4

public val PNRP_CLOUD_STATE_NO_NET: PnrpCloudState = 5

public val PNRP_CLOUD_STATE_SYNCHRONISING: PnrpCloudState = 1

public val PNRP_CLOUD_STATE_VIRTUAL: PnrpCloudState = 0

public val PNRP_EXTENDED_PAYLOAD_TYPE_BINARY: PnrpExtendedPayloadType = 1

public val PNRP_EXTENDED_PAYLOAD_TYPE_NONE: PnrpExtendedPayloadType = 0

public val PNRP_EXTENDED_PAYLOAD_TYPE_STRING: PnrpExtendedPayloadType = 2

public val PNRP_GLOBAL_SCOPE: PnrpScope = 1

public val PNRP_LINK_LOCAL_SCOPE: PnrpScope = 3

public val PNRP_MAX_ENDPOINT_ADDRESSES: UInt = 10u

public val PNRP_MAX_EXTENDED_PAYLOAD_BYTES: UInt = 4096u

public val PNRP_REGISTERED_ID_STATE_OK: PnrpRegisteredIdState = 1

public val PNRP_REGISTERED_ID_STATE_PROBLEM: PnrpRegisteredIdState = 2

public val PNRP_RESOLVE_CRITERIA_ANY_PEER_NAME: PnrpResolveCriteria = 5

public val PNRP_RESOLVE_CRITERIA_DEFAULT: PnrpResolveCriteria = 0

public val PNRP_RESOLVE_CRITERIA_NEAREST_NON_CURRENT_PROCESS_PEER_NAME: PnrpResolveCriteria = 4

public val PNRP_RESOLVE_CRITERIA_NEAREST_PEER_NAME: PnrpResolveCriteria = 6

public val PNRP_RESOLVE_CRITERIA_NEAREST_REMOTE_PEER_NAME: PnrpResolveCriteria = 2

public val PNRP_RESOLVE_CRITERIA_NON_CURRENT_PROCESS_PEER_NAME: PnrpResolveCriteria = 3

public val PNRP_RESOLVE_CRITERIA_REMOTE_PEER_NAME: PnrpResolveCriteria = 1

public val PNRP_SCOPE_ANY: PnrpScope = 0

public val PNRP_SITE_LOCAL_SCOPE: PnrpScope = 2

public val PEER_DIST_CLIENT_BASIC_INFO: PeerdistClientInfoByHandleClass = 0

public val SVCID_PNRPCLOUD: Guid = Guid.fromU128(U128(0xc2239ce600c04fbfuL, 0xbad618139385a49auL))

public val SVCID_PNRPNAME_V1: Guid = Guid.fromU128(U128(0xc2239ce500c04fbfuL, 0xbad618139385a49auL))

public val SVCID_PNRPNAME_V2: Guid = Guid.fromU128(U128(0xc2239ce700c04fbfuL, 0xbad618139385a49auL))

public val WSA_PNRP_CLIENT_INVALID_COMPARTMENT_ID: UInt = 11506u

public val WSA_PNRP_CLOUD_DISABLED: UInt = 11502u

public val WSA_PNRP_CLOUD_IS_DEAD: UInt = 11509u

public val WSA_PNRP_CLOUD_IS_SEARCH_ONLY: UInt = 11505u

public val WSA_PNRP_CLOUD_NOT_FOUND: UInt = 11501u

public val WSA_PNRP_DUPLICATE_PEER_NAME: UInt = 11508u

public val WSA_PNRP_ERROR_BASE: UInt = 11500u

public val WSA_PNRP_INVALID_IDENTITY: UInt = 11503u

public val WSA_PNRP_TOO_MUCH_LOAD: UInt = 11504u

public val WSZ_SCOPE_GLOBAL: Pcwstr = w("GLOBAL")

public val WSZ_SCOPE_LINKLOCAL: Pcwstr = w("LINKLOCAL")

public val WSZ_SCOPE_SITELOCAL: Pcwstr = w("SITELOCAL")
