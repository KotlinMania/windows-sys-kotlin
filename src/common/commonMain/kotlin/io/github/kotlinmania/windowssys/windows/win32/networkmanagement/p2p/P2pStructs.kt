@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR

public data class DRT_ADDRESS(
    public var socketAddress: Networking.WinSock.SOCKADDR_STORAGE = Networking.WinSock.SOCKADDR_STORAGE(),
    public var flags: UInt = 0u,
    public var nearness: Int = 0,
    public var latency: UInt = 0u,
)

public data class DRT_ADDRESS_LIST(public var AddressCount: UInt = 0u, public var AddressList: List<DRT_ADDRESS> = List(1) { DRT_ADDRESS() })

public data class DRT_BOOTSTRAP_PROVIDER(
    public var pvContext: Long = 0L,
    public var Attach: Long = 0L,
    public var Detach: Long = 0L,
    public var InitResolve: Long = 0L,
    public var IssueResolve: Long = 0L,
    public var EndResolve: Long = 0L,
    public var Register: Long = 0L,
    public var Unregister: Long = 0L,
)

public data class DRT_DATA(public var cb: UInt = 0u, public var pb: Long = 0L)

public data class DRT_EVENT_DATA(
    public var type: DRT_EVENT_TYPE = 0,
    public var hr: HRESULT = 0,
    public var pvContext: Long = 0L,
    public var Anonymous: DRT_EVENT_DATA_0 = DRT_EVENT_DATA_0(),
)

public data class DRT_EVENT_DATA_0(
    public var leafsetKeyChange: DRT_EVENT_DATA_0_0 = DRT_EVENT_DATA_0_0(),
    public var registrationStateChange: DRT_EVENT_DATA_0_1 = DRT_EVENT_DATA_0_1(),
    public var statusChange: DRT_EVENT_DATA_0_2 = DRT_EVENT_DATA_0_2(),
)

public data class DRT_EVENT_DATA_0_0(
    public var change: DRT_LEAFSET_KEY_CHANGE_TYPE = 0,
    public var localKey: DRT_DATA = DRT_DATA(),
    public var remoteKey: DRT_DATA = DRT_DATA(),
)

public data class DRT_EVENT_DATA_0_1(public var state: DRT_REGISTRATION_STATE = 0, public var localKey: DRT_DATA = DRT_DATA())

public data class DRT_EVENT_DATA_0_2(public var status: DRT_STATUS = 0, public var bootstrapAddresses: DRT_EVENT_DATA_0_2_0 = DRT_EVENT_DATA_0_2_0())

public data class DRT_EVENT_DATA_0_2_0(public var cntAddress: UInt = 0u, public var pAddresses: Long = 0L)

public data class DRT_REGISTRATION(public var key: DRT_DATA = DRT_DATA(), public var appData: DRT_DATA = DRT_DATA())

public data class DRT_SEARCH_INFO(
    public var dwSize: UInt = 0u,
    public var fIterative: BOOL = 0,
    public var fAllowCurrentInstanceMatch: BOOL = 0,
    public var fAnyMatchInRange: BOOL = 0,
    public var cMaxEndpoints: UInt = 0u,
    public var pMaximumKey: Long = 0L,
    public var pMinimumKey: Long = 0L,
)

public data class DRT_SEARCH_RESULT(
    public var dwSize: UInt = 0u,
    public var type: DRT_MATCH_TYPE = 0,
    public var pvContext: Long = 0L,
    public var registration: DRT_REGISTRATION = DRT_REGISTRATION(),
)

public data class DRT_SECURITY_PROVIDER(
    public var pvContext: Long = 0L,
    public var Attach: Long = 0L,
    public var Detach: Long = 0L,
    public var RegisterKey: Long = 0L,
    public var UnregisterKey: Long = 0L,
    public var ValidateAndUnpackPayload: Long = 0L,
    public var SecureAndPackPayload: Long = 0L,
    public var FreeData: Long = 0L,
    public var EncryptData: Long = 0L,
    public var DecryptData: Long = 0L,
    public var GetSerializedCredential: Long = 0L,
    public var ValidateRemoteCredential: Long = 0L,
    public var SignData: Long = 0L,
    public var VerifyData: Long = 0L,
)

public data class DRT_SETTINGS(
    public var dwSize: UInt = 0u,
    public var cbKey: UInt = 0u,
    public var bProtocolMajorVersion: UByte = 0u,
    public var bProtocolMinorVersion: UByte = 0u,
    public var ulMaxRoutingAddresses: UInt = 0u,
    public var pwzDrtInstancePrefix: PWSTR = 0L,
    public var hTransport: Long = 0L,
    public var pSecurityProvider: Long = 0L,
    public var pBootstrapProvider: Long = 0L,
    public var eSecurityMode: DRT_SECURITY_MODE = 0,
)

public data class PEERDIST_CLIENT_BASIC_INFO(public var fFlashCrowd: BOOL = 0)

public data class PEERDIST_CONTENT_TAG(public var Data: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PEERDIST_CONTENT_TAG) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class PEERDIST_PUBLICATION_OPTIONS(public var dwVersion: UInt = 0u, public var dwFlags: UInt = 0u)

public data class PEERDIST_RETRIEVAL_OPTIONS(
    public var cbSize: UInt = 0u,
    public var dwContentInfoMinVersion: UInt = 0u,
    public var dwContentInfoMaxVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class PEERDIST_STATUS_INFO(
    public var cbSize: UInt = 0u,
    public var status: PEERDIST_STATUS = 0,
    public var dwMinVer: PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE = 0u,
    public var dwMaxVer: PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE = 0u,
)

public data class PEER_ADDRESS(public var dwSize: UInt = 0u, public var sin6: Networking.WinSock.SOCKADDR_IN6 = Networking.WinSock.SOCKADDR_IN6())

public data class PEER_APPLICATION(
    public var id: GUID = GUID(),
    public var data: PEER_DATA = PEER_DATA(),
    public var pwzDescription: PWSTR = 0L,
)

public data class PEER_APPLICATION_REGISTRATION_INFO(
    public var application: PEER_APPLICATION = PEER_APPLICATION(),
    public var pwzApplicationToLaunch: PWSTR = 0L,
    public var pwzApplicationArguments: PWSTR = 0L,
    public var dwPublicationScope: UInt = 0u,
)

public data class PEER_APP_LAUNCH_INFO(
    public var pContact: Long = 0L,
    public var pEndpoint: Long = 0L,
    public var pInvitation: Long = 0L,
)

public data class PEER_COLLAB_EVENT_DATA(public var eventType: PEER_COLLAB_EVENT_TYPE = 0, public var Anonymous: PEER_COLLAB_EVENT_DATA_0 = PEER_COLLAB_EVENT_DATA_0())

public data class PEER_COLLAB_EVENT_DATA_0(
    public var watchListChangedData: PEER_EVENT_WATCHLIST_CHANGED_DATA = PEER_EVENT_WATCHLIST_CHANGED_DATA(),
    public var presenceChangedData: PEER_EVENT_PRESENCE_CHANGED_DATA = PEER_EVENT_PRESENCE_CHANGED_DATA(),
    public var applicationChangedData: PEER_EVENT_APPLICATION_CHANGED_DATA = PEER_EVENT_APPLICATION_CHANGED_DATA(),
    public var objectChangedData: PEER_EVENT_OBJECT_CHANGED_DATA = PEER_EVENT_OBJECT_CHANGED_DATA(),
    public var endpointChangedData: PEER_EVENT_ENDPOINT_CHANGED_DATA = PEER_EVENT_ENDPOINT_CHANGED_DATA(),
    public var peopleNearMeChangedData: PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA = PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA(),
    public var requestStatusChangedData: PEER_EVENT_REQUEST_STATUS_CHANGED_DATA = PEER_EVENT_REQUEST_STATUS_CHANGED_DATA(),
)

public data class PEER_COLLAB_EVENT_REGISTRATION(public var eventType: PEER_COLLAB_EVENT_TYPE = 0, public var pInstance: Long = 0L)

public data class PEER_CONNECTION_INFO(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var ullConnectionId: ULong = 0uL,
    public var ullNodeId: ULong = 0uL,
    public var pwzPeerId: PWSTR = 0L,
    public var address: PEER_ADDRESS = PEER_ADDRESS(),
)

public data class PEER_CONTACT(
    public var pwzPeerName: PWSTR = 0L,
    public var pwzNickName: PWSTR = 0L,
    public var pwzDisplayName: PWSTR = 0L,
    public var pwzEmailAddress: PWSTR = 0L,
    public var fWatch: BOOL = 0,
    public var WatcherPermissions: PEER_WATCH_PERMISSION = 0,
    public var credentials: PEER_DATA = PEER_DATA(),
)

public data class PEER_CREDENTIAL_INFO(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzFriendlyName: PWSTR = 0L,
    public var pPublicKey: Long = 0L,
    public var pwzIssuerPeerName: PWSTR = 0L,
    public var pwzIssuerFriendlyName: PWSTR = 0L,
    public var ftValidityStart: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftValidityEnd: Foundation.FILETIME = Foundation.FILETIME(),
    public var cRoles: UInt = 0u,
    public var pRoles: Long = 0L,
)

public data class PEER_DATA(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class PEER_ENDPOINT(public var address: PEER_ADDRESS = PEER_ADDRESS(), public var pwzEndpointName: PWSTR = 0L)

public data class PEER_EVENT_APPLICATION_CHANGED_DATA(
    public var pContact: Long = 0L,
    public var pEndpoint: Long = 0L,
    public var changeType: PEER_CHANGE_TYPE = 0,
    public var pApplication: Long = 0L,
)

public data class PEER_EVENT_CONNECTION_CHANGE_DATA(
    public var dwSize: UInt = 0u,
    public var status: PEER_CONNECTION_STATUS = 0,
    public var ullConnectionId: ULong = 0uL,
    public var ullNodeId: ULong = 0uL,
    public var ullNextConnectionId: ULong = 0uL,
    public var hrConnectionFailedReason: HRESULT = 0,
)

public data class PEER_EVENT_ENDPOINT_CHANGED_DATA(public var pContact: Long = 0L, public var pEndpoint: Long = 0L)

public data class PEER_EVENT_INCOMING_DATA(
    public var dwSize: UInt = 0u,
    public var ullConnectionId: ULong = 0uL,
    public var type: GUID = GUID(),
    public var data: PEER_DATA = PEER_DATA(),
)

public data class PEER_EVENT_MEMBER_CHANGE_DATA(
    public var dwSize: UInt = 0u,
    public var changeType: PEER_MEMBER_CHANGE_TYPE = 0,
    public var pwzIdentity: PWSTR = 0L,
)

public data class PEER_EVENT_NODE_CHANGE_DATA(
    public var dwSize: UInt = 0u,
    public var changeType: PEER_NODE_CHANGE_TYPE = 0,
    public var ullNodeId: ULong = 0uL,
    public var pwzPeerId: PWSTR = 0L,
)

public data class PEER_EVENT_OBJECT_CHANGED_DATA(
    public var pContact: Long = 0L,
    public var pEndpoint: Long = 0L,
    public var changeType: PEER_CHANGE_TYPE = 0,
    public var pObject: Long = 0L,
)

public data class PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA(public var changeType: PEER_CHANGE_TYPE = 0, public var pPeopleNearMe: Long = 0L)

public data class PEER_EVENT_PRESENCE_CHANGED_DATA(
    public var pContact: Long = 0L,
    public var pEndpoint: Long = 0L,
    public var changeType: PEER_CHANGE_TYPE = 0,
    public var pPresenceInfo: Long = 0L,
)

public data class PEER_EVENT_RECORD_CHANGE_DATA(
    public var dwSize: UInt = 0u,
    public var changeType: PEER_RECORD_CHANGE_TYPE = 0,
    public var recordId: GUID = GUID(),
    public var recordType: GUID = GUID(),
)

public data class PEER_EVENT_REQUEST_STATUS_CHANGED_DATA(public var pEndpoint: Long = 0L, public var hrChange: HRESULT = 0)

public data class PEER_EVENT_SYNCHRONIZED_DATA(public var dwSize: UInt = 0u, public var recordType: GUID = GUID())

public data class PEER_EVENT_WATCHLIST_CHANGED_DATA(public var pContact: Long = 0L, public var changeType: PEER_CHANGE_TYPE = 0)

public data class PEER_GRAPH_EVENT_DATA(public var eventType: PEER_GRAPH_EVENT_TYPE = 0, public var Anonymous: PEER_GRAPH_EVENT_DATA_0 = PEER_GRAPH_EVENT_DATA_0())

public data class PEER_GRAPH_EVENT_DATA_0(
    public var dwStatus: PEER_GRAPH_STATUS_FLAGS = 0,
    public var incomingData: PEER_EVENT_INCOMING_DATA = PEER_EVENT_INCOMING_DATA(),
    public var recordChangeData: PEER_EVENT_RECORD_CHANGE_DATA = PEER_EVENT_RECORD_CHANGE_DATA(),
    public var connectionChangeData: PEER_EVENT_CONNECTION_CHANGE_DATA = PEER_EVENT_CONNECTION_CHANGE_DATA(),
    public var nodeChangeData: PEER_EVENT_NODE_CHANGE_DATA = PEER_EVENT_NODE_CHANGE_DATA(),
    public var synchronizedData: PEER_EVENT_SYNCHRONIZED_DATA = PEER_EVENT_SYNCHRONIZED_DATA(),
)

public data class PEER_GRAPH_EVENT_REGISTRATION(public var eventType: PEER_GRAPH_EVENT_TYPE = 0, public var pType: Long = 0L)

public data class PEER_GRAPH_PROPERTIES(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwScope: UInt = 0u,
    public var dwMaxRecordSize: UInt = 0u,
    public var pwzGraphId: PWSTR = 0L,
    public var pwzCreatorId: PWSTR = 0L,
    public var pwzFriendlyName: PWSTR = 0L,
    public var pwzComment: PWSTR = 0L,
    public var ulPresenceLifetime: UInt = 0u,
    public var cPresenceMax: UInt = 0u,
)

public data class PEER_GROUP_EVENT_DATA(public var eventType: PEER_GROUP_EVENT_TYPE = 0, public var Anonymous: PEER_GROUP_EVENT_DATA_0 = PEER_GROUP_EVENT_DATA_0())

public data class PEER_GROUP_EVENT_DATA_0(
    public var dwStatus: PEER_GROUP_STATUS = 0,
    public var incomingData: PEER_EVENT_INCOMING_DATA = PEER_EVENT_INCOMING_DATA(),
    public var recordChangeData: PEER_EVENT_RECORD_CHANGE_DATA = PEER_EVENT_RECORD_CHANGE_DATA(),
    public var connectionChangeData: PEER_EVENT_CONNECTION_CHANGE_DATA = PEER_EVENT_CONNECTION_CHANGE_DATA(),
    public var memberChangeData: PEER_EVENT_MEMBER_CHANGE_DATA = PEER_EVENT_MEMBER_CHANGE_DATA(),
    public var hrConnectionFailedReason: HRESULT = 0,
)

public data class PEER_GROUP_EVENT_REGISTRATION(public var eventType: PEER_GROUP_EVENT_TYPE = 0, public var pType: Long = 0L)

public data class PEER_GROUP_PROPERTIES(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzCloud: PWSTR = 0L,
    public var pwzClassifier: PWSTR = 0L,
    public var pwzGroupPeerName: PWSTR = 0L,
    public var pwzCreatorPeerName: PWSTR = 0L,
    public var pwzFriendlyName: PWSTR = 0L,
    public var pwzComment: PWSTR = 0L,
    public var ulMemberDataLifetime: UInt = 0u,
    public var ulPresenceLifetime: UInt = 0u,
    public var dwAuthenticationSchemes: UInt = 0u,
    public var pwzGroupPassword: PWSTR = 0L,
    public var groupPasswordRole: GUID = GUID(),
)

public data class PEER_INVITATION(
    public var applicationId: GUID = GUID(),
    public var applicationData: PEER_DATA = PEER_DATA(),
    public var pwzMessage: PWSTR = 0L,
)

public class PEER_INVITATION_INFO(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzCloudName: PWSTR = 0L,
    public var dwScope: UInt = 0u,
    public var dwCloudFlags: UInt = 0u,
    public var pwzGroupPeerName: PWSTR = 0L,
    public var pwzIssuerPeerName: PWSTR = 0L,
    public var pwzSubjectPeerName: PWSTR = 0L,
    public var pwzGroupFriendlyName: PWSTR = 0L,
    public var pwzIssuerFriendlyName: PWSTR = 0L,
    public var pwzSubjectFriendlyName: PWSTR = 0L,
    public var ftValidityStart: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftValidityEnd: Foundation.FILETIME = Foundation.FILETIME(),
    public var cRoles: UInt = 0u,
    public var pRoles: Long = 0L,
    public var cClassifiers: UInt = 0u,
    public var ppwzClassifiers: Long = 0L,
    public var pSubjectPublicKey: Long = 0L,
    public var authScheme: PEER_GROUP_AUTHENTICATION_SCHEME = 0,
)

public data class PEER_INVITATION_RESPONSE(
    public var action: PEER_INVITATION_RESPONSE_TYPE = 0,
    public var pwzMessage: PWSTR = 0L,
    public var hrExtendedInfo: HRESULT = 0,
)

public data class PEER_MEMBER(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzIdentity: PWSTR = 0L,
    public var pwzAttributes: PWSTR = 0L,
    public var ullNodeId: ULong = 0uL,
    public var cAddresses: UInt = 0u,
    public var pAddresses: Long = 0L,
    public var pCredentialInfo: Long = 0L,
)

public data class PEER_NAME_PAIR(
    public var dwSize: UInt = 0u,
    public var pwzPeerName: PWSTR = 0L,
    public var pwzFriendlyName: PWSTR = 0L,
)

public data class PEER_NODE_INFO(
    public var dwSize: UInt = 0u,
    public var ullNodeId: ULong = 0uL,
    public var pwzPeerId: PWSTR = 0L,
    public var cAddresses: UInt = 0u,
    public var pAddresses: Long = 0L,
    public var pwzAttributes: PWSTR = 0L,
)

public data class PEER_OBJECT(
    public var id: GUID = GUID(),
    public var data: PEER_DATA = PEER_DATA(),
    public var dwPublicationScope: UInt = 0u,
)

public data class PEER_PEOPLE_NEAR_ME(
    public var pwzNickName: PWSTR = 0L,
    public var endpoint: PEER_ENDPOINT = PEER_ENDPOINT(),
    public var id: GUID = GUID(),
)

public data class PEER_PNRP_CLOUD_INFO(
    public var pwzCloudName: PWSTR = 0L,
    public var dwScope: PNRP_SCOPE = 0,
    public var dwScopeId: UInt = 0u,
)

public data class PEER_PNRP_ENDPOINT_INFO(
    public var pwzPeerName: PWSTR = 0L,
    public var cAddresses: UInt = 0u,
    public var ppAddresses: Long = 0L,
    public var pwzComment: PWSTR = 0L,
    public var payload: PEER_DATA = PEER_DATA(),
)

public data class PEER_PNRP_REGISTRATION_INFO(
    public var pwzCloudName: PWSTR = 0L,
    public var pwzPublishingIdentity: PWSTR = 0L,
    public var cAddresses: UInt = 0u,
    public var ppAddresses: Long = 0L,
    public var wPort: UShort = 0u,
    public var pwzComment: PWSTR = 0L,
    public var payload: PEER_DATA = PEER_DATA(),
)

public data class PEER_PRESENCE_INFO(public var status: PEER_PRESENCE_STATUS = 0, public var pwzDescriptiveText: PWSTR = 0L)

public data class PEER_RECORD(
    public var dwSize: UInt = 0u,
    public var type: GUID = GUID(),
    public var id: GUID = GUID(),
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzCreatorId: PWSTR = 0L,
    public var pwzModifiedById: PWSTR = 0L,
    public var pwzAttributes: PWSTR = 0L,
    public var ftCreation: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftExpiration: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastModified: Foundation.FILETIME = Foundation.FILETIME(),
    public var securityData: PEER_DATA = PEER_DATA(),
    public var data: PEER_DATA = PEER_DATA(),
)

public data class PEER_SECURITY_INTERFACE(
    public var dwSize: UInt = 0u,
    public var pwzSspFilename: PWSTR = 0L,
    public var pwzPackageName: PWSTR = 0L,
    public var cbSecurityInfo: UInt = 0u,
    public var pbSecurityInfo: Long = 0L,
    public var pvContext: Long = 0L,
    public var pfnValidateRecord: PFNPEER_VALIDATE_RECORD = null,
    public var pfnSecureRecord: PFNPEER_SECURE_RECORD = null,
    public var pfnFreeSecurityData: PFNPEER_FREE_SECURITY_DATA = null,
    public var pfnAuthFailed: PFNPEER_ON_PASSWORD_AUTH_FAILED = null,
)

public data class PEER_VERSION_DATA(public var wVersion: UShort = 0u, public var wHighestVersion: UShort = 0u)

public data class PNRPCLOUDINFO(
    public var dwSize: UInt = 0u,
    public var Cloud: PNRP_CLOUD_ID = PNRP_CLOUD_ID(),
    public var enCloudState: PNRP_CLOUD_STATE = 0,
    public var enCloudFlags: PNRP_CLOUD_FLAGS = 0,
)

public data class PNRPINFO_V1(
    public var dwSize: UInt = 0u,
    public var lpwszIdentity: PWSTR = 0L,
    public var nMaxResolve: UInt = 0u,
    public var dwTimeout: UInt = 0u,
    public var dwLifetime: UInt = 0u,
    public var enResolveCriteria: PNRP_RESOLVE_CRITERIA = 0,
    public var dwFlags: UInt = 0u,
    public var saHint: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var enNameState: PNRP_REGISTERED_ID_STATE = 0,
)

public data class PNRPINFO_V2(
    public var dwSize: UInt = 0u,
    public var lpwszIdentity: PWSTR = 0L,
    public var nMaxResolve: UInt = 0u,
    public var dwTimeout: UInt = 0u,
    public var dwLifetime: UInt = 0u,
    public var enResolveCriteria: PNRP_RESOLVE_CRITERIA = 0,
    public var dwFlags: UInt = 0u,
    public var saHint: Networking.WinSock.SOCKET_ADDRESS = Networking.WinSock.SOCKET_ADDRESS(),
    public var enNameState: PNRP_REGISTERED_ID_STATE = 0,
    public var enExtendedPayloadType: PNRP_EXTENDED_PAYLOAD_TYPE = 0,
    public var Anonymous: PNRPINFO_V2_0 = PNRPINFO_V2_0(),
)

public data class PNRPINFO_V2_0(public var blobPayload: System.Com.BLOB = System.Com.BLOB(), public var pwszPayload: PWSTR = 0L)

public data class PNRP_CLOUD_ID(
    public var AddressFamily: Int = 0,
    public var Scope: PNRP_SCOPE = 0,
    public var ScopeId: UInt = 0u,
)
