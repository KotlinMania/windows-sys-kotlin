@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn6
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertPublicKeyInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob

public data class DrtAddress(
    public var socketAddress: SockaddrStorage = SockaddrStorage(),
    public var flags: UInt = 0u,
    public var nearness: Int = 0,
    public var latency: UInt = 0u,
)

public data class DrtAddressList(
    public var addressCount: UInt = 0u,
    public var addressList: List<DrtAddress> = List(1) { DrtAddress() },
)

public data class DrtBootstrapProvider(
    public var pvContext: COpaquePointer? = null,
    public var attach: Int = 0,
    public var detach: Int = 0,
    public var initResolve: Int = 0,
    public var issueResolve: Int = 0,
    public var endResolve: Int = 0,
    public var register: Int = 0,
    public var unregister: Int = 0,
)

public data class DrtData(
    public var cb: UInt = 0u,
    public var pb: COpaquePointer? = null,
)

public data class DrtEventData(
    public var type: DrtEventType = 0,
    public var hr: Hresult = 0,
    public var pvContext: COpaquePointer? = null,
    public var anonymous: DrtEventData0 = DrtEventData0(),
)

public data class DrtEventData0(
    public var leafsetKeyChange: DrtEventData00 = DrtEventData00(),
    public var registrationStateChange: DrtEventData01 = DrtEventData01(),
    public var statusChange: DrtEventData02 = DrtEventData02(),
)

public data class DrtEventData00(
    public var change: DrtLeafsetKeyChangeType = 0,
    public var localKey: DrtData = DrtData(),
    public var remoteKey: DrtData = DrtData(),
)

public data class DrtEventData01(
    public var state: DrtRegistrationState = 0,
    public var localKey: DrtData = DrtData(),
)

public data class DrtEventData02(
    public var status: DrtStatus = 0,
    public var bootstrapAddresses: DrtEventData020 = DrtEventData020(),
)

public data class DrtEventData020(
    public var cntAddress: UInt = 0u,
    public var pAddresses: SockaddrStorage? = null,
)

public data class DrtRegistration(
    public var key: DrtData = DrtData(),
    public var appData: DrtData = DrtData(),
)

public data class DrtSearchInfo(
    public var dwSize: UInt = 0u,
    public var fIterative: Bool = 0,
    public var fAllowCurrentInstanceMatch: Bool = 0,
    public var fAnyMatchInRange: Bool = 0,
    public var cMaxEndpoints: UInt = 0u,
    public var pMaximumKey: DrtData? = null,
    public var pMinimumKey: DrtData? = null,
)

public data class DrtSearchResult(
    public var dwSize: UInt = 0u,
    public var type: DrtMatchType = 0,
    public var pvContext: COpaquePointer? = null,
    public var registration: DrtRegistration = DrtRegistration(),
)

public data class DrtSecurityProvider(
    public var pvContext: COpaquePointer? = null,
    public var attach: Int = 0,
    public var detach: Int = 0,
    public var registerKey: Int = 0,
    public var unregisterKey: Int = 0,
    public var validateAndUnpackPayload: Int = 0,
    public var secureAndPackPayload: Int = 0,
    public var freeData: Int = 0,
    public var encryptData: Int = 0,
    public var decryptData: Int = 0,
    public var getSerializedCredential: Int = 0,
    public var validateRemoteCredential: Int = 0,
    public var signData: Int = 0,
    public var verifyData: Int = 0,
)

public data class DrtSettings(
    public var dwSize: UInt = 0u,
    public var cbKey: UInt = 0u,
    public var bProtocolMajorVersion: UByte = 0u,
    public var bProtocolMinorVersion: UByte = 0u,
    public var ulMaxRoutingAddresses: UInt = 0u,
    public var pwzDrtInstancePrefix: Pwstr = null,
    public var hTransport: COpaquePointer? = null,
    public var pSecurityProvider: DrtSecurityProvider? = null,
    public var pBootstrapProvider: DrtBootstrapProvider? = null,
    public var eSecurityMode: DrtSecurityMode = 0,
)

public data class PeerdistClientBasicInfo(
    public var fFlashCrowd: Bool = 0,
)

public data class PeerdistContentTag(
    public var data: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PeerdistContentTag) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()
}

public data class PeerdistPublicationOptions(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class PeerdistRetrievalOptions(
    public var cbSize: UInt = 0u,
    public var dwContentInfoMinVersion: UInt = 0u,
    public var dwContentInfoMaxVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class PeerdistStatusInfo(
    public var cbSize: UInt = 0u,
    public var status: PeerdistStatus = 0,
    public var dwMinVer: PeerdistRetrievalOptionsContentinfoVersionValue = 0u,
    public var dwMaxVer: PeerdistRetrievalOptionsContentinfoVersionValue = 0u,
)

public data class PeerAddress(
    public var dwSize: UInt = 0u,
    public var sin6: SockaddrIn6 = SockaddrIn6(),
)

public data class PeerApplication(
    public var id: Guid = Guid(),
    public var data: PeerData = PeerData(),
    public var pwzDescription: Pwstr = null,
)

public data class PeerApplicationRegistrationInfo(
    public var application: PeerApplication = PeerApplication(),
    public var pwzApplicationToLaunch: Pwstr = null,
    public var pwzApplicationArguments: Pwstr = null,
    public var dwPublicationScope: UInt = 0u,
)

public data class PeerAppLaunchInfo(
    public var pContact: PeerContact? = null,
    public var pEndpoint: PeerEndpoint? = null,
    public var pInvitation: PeerInvitation? = null,
)

public data class PeerCollabEventData(
    public var eventType: PeerCollabEventType = 0,
    public var anonymous: PeerCollabEventData0 = PeerCollabEventData0(),
)

public data class PeerCollabEventData0(
    public var watchListChangedData: PeerEventWatchlistChangedData = PeerEventWatchlistChangedData(),
    public var presenceChangedData: PeerEventPresenceChangedData = PeerEventPresenceChangedData(),
    public var applicationChangedData: PeerEventApplicationChangedData = PeerEventApplicationChangedData(),
    public var objectChangedData: PeerEventObjectChangedData = PeerEventObjectChangedData(),
    public var endpointChangedData: PeerEventEndpointChangedData = PeerEventEndpointChangedData(),
    public var peopleNearMeChangedData: PeerEventPeopleNearMeChangedData = PeerEventPeopleNearMeChangedData(),
    public var requestStatusChangedData: PeerEventRequestStatusChangedData = PeerEventRequestStatusChangedData(),
)

public data class PeerCollabEventRegistration(
    public var eventType: PeerCollabEventType = 0,
    public var pInstance: Guid? = null,
)

public data class PeerConnectionInfo(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var ullConnectionId: ULong = 0uL,
    public var ullNodeId: ULong = 0uL,
    public var pwzPeerId: Pwstr = null,
    public var address: PeerAddress = PeerAddress(),
)

public data class PeerContact(
    public var pwzPeerName: Pwstr = null,
    public var pwzNickName: Pwstr = null,
    public var pwzDisplayName: Pwstr = null,
    public var pwzEmailAddress: Pwstr = null,
    public var fWatch: Bool = 0,
    public var watcherPermissions: PeerWatchPermission = 0,
    public var credentials: PeerData = PeerData(),
)

public data class PeerCredentialInfo(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzFriendlyName: Pwstr = null,
    public var pPublicKey: CertPublicKeyInfo? = null,
    public var pwzIssuerPeerName: Pwstr = null,
    public var pwzIssuerFriendlyName: Pwstr = null,
    public var ftValidityStart: Filetime = Filetime(),
    public var ftValidityEnd: Filetime = Filetime(),
    public var cRoles: UInt = 0u,
    public var pRoles: Guid? = null,
)

public data class PeerData(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class PeerEndpoint(
    public var address: PeerAddress = PeerAddress(),
    public var pwzEndpointName: Pwstr = null,
)

public data class PeerEventApplicationChangedData(
    public var pContact: PeerContact? = null,
    public var pEndpoint: PeerEndpoint? = null,
    public var changeType: PeerChangeType = 0,
    public var pApplication: PeerApplication? = null,
)

public data class PeerEventConnectionChangeData(
    public var dwSize: UInt = 0u,
    public var status: PeerConnectionStatus = 0,
    public var ullConnectionId: ULong = 0uL,
    public var ullNodeId: ULong = 0uL,
    public var ullNextConnectionId: ULong = 0uL,
    public var hrConnectionFailedReason: Hresult = 0,
)

public data class PeerEventEndpointChangedData(
    public var pContact: PeerContact? = null,
    public var pEndpoint: PeerEndpoint? = null,
)

public data class PeerEventIncomingData(
    public var dwSize: UInt = 0u,
    public var ullConnectionId: ULong = 0uL,
    public var type: Guid = Guid(),
    public var data: PeerData = PeerData(),
)

public data class PeerEventMemberChangeData(
    public var dwSize: UInt = 0u,
    public var changeType: PeerMemberChangeType = 0,
    public var pwzIdentity: Pwstr = null,
)

public data class PeerEventNodeChangeData(
    public var dwSize: UInt = 0u,
    public var changeType: PeerNodeChangeType = 0,
    public var ullNodeId: ULong = 0uL,
    public var pwzPeerId: Pwstr = null,
)

public data class PeerEventObjectChangedData(
    public var pContact: PeerContact? = null,
    public var pEndpoint: PeerEndpoint? = null,
    public var changeType: PeerChangeType = 0,
    public var pObject: PeerObject? = null,
)

public data class PeerEventPeopleNearMeChangedData(
    public var changeType: PeerChangeType = 0,
    public var pPeopleNearMe: PeerPeopleNearMe? = null,
)

public data class PeerEventPresenceChangedData(
    public var pContact: PeerContact? = null,
    public var pEndpoint: PeerEndpoint? = null,
    public var changeType: PeerChangeType = 0,
    public var pPresenceInfo: PeerPresenceInfo? = null,
)

public data class PeerEventRecordChangeData(
    public var dwSize: UInt = 0u,
    public var changeType: PeerRecordChangeType = 0,
    public var recordId: Guid = Guid(),
    public var recordType: Guid = Guid(),
)

public data class PeerEventRequestStatusChangedData(
    public var pEndpoint: PeerEndpoint? = null,
    public var hrChange: Hresult = 0,
)

public data class PeerEventSynchronizedData(
    public var dwSize: UInt = 0u,
    public var recordType: Guid = Guid(),
)

public data class PeerEventWatchlistChangedData(
    public var pContact: PeerContact? = null,
    public var changeType: PeerChangeType = 0,
)

public data class PeerGraphEventData(
    public var eventType: PeerGraphEventType = 0,
    public var anonymous: PeerGraphEventData0 = PeerGraphEventData0(),
)

public data class PeerGraphEventData0(
    public var dwStatus: PeerGraphStatusFlags = 0,
    public var incomingData: PeerEventIncomingData = PeerEventIncomingData(),
    public var recordChangeData: PeerEventRecordChangeData = PeerEventRecordChangeData(),
    public var connectionChangeData: PeerEventConnectionChangeData = PeerEventConnectionChangeData(),
    public var nodeChangeData: PeerEventNodeChangeData = PeerEventNodeChangeData(),
    public var synchronizedData: PeerEventSynchronizedData = PeerEventSynchronizedData(),
)

public data class PeerGraphEventRegistration(
    public var eventType: PeerGraphEventType = 0,
    public var pType: Guid? = null,
)

public data class PeerGraphProperties(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwScope: UInt = 0u,
    public var dwMaxRecordSize: UInt = 0u,
    public var pwzGraphId: Pwstr = null,
    public var pwzCreatorId: Pwstr = null,
    public var pwzFriendlyName: Pwstr = null,
    public var pwzComment: Pwstr = null,
    public var ulPresenceLifetime: UInt = 0u,
    public var cPresenceMax: UInt = 0u,
)

public data class PeerGroupEventData(
    public var eventType: PeerGroupEventType = 0,
    public var anonymous: PeerGroupEventData0 = PeerGroupEventData0(),
)

public data class PeerGroupEventData0(
    public var dwStatus: PeerGroupStatus = 0,
    public var incomingData: PeerEventIncomingData = PeerEventIncomingData(),
    public var recordChangeData: PeerEventRecordChangeData = PeerEventRecordChangeData(),
    public var connectionChangeData: PeerEventConnectionChangeData = PeerEventConnectionChangeData(),
    public var memberChangeData: PeerEventMemberChangeData = PeerEventMemberChangeData(),
    public var hrConnectionFailedReason: Hresult = 0,
)

public data class PeerGroupEventRegistration(
    public var eventType: PeerGroupEventType = 0,
    public var pType: Guid? = null,
)

public data class PeerGroupProperties(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzCloud: Pwstr = null,
    public var pwzClassifier: Pwstr = null,
    public var pwzGroupPeerName: Pwstr = null,
    public var pwzCreatorPeerName: Pwstr = null,
    public var pwzFriendlyName: Pwstr = null,
    public var pwzComment: Pwstr = null,
    public var ulMemberDataLifetime: UInt = 0u,
    public var ulPresenceLifetime: UInt = 0u,
    public var dwAuthenticationSchemes: UInt = 0u,
    public var pwzGroupPassword: Pwstr = null,
    public var groupPasswordRole: Guid = Guid(),
)

public data class PeerInvitation(
    public var applicationId: Guid = Guid(),
    public var applicationData: PeerData = PeerData(),
    public var pwzMessage: Pwstr = null,
)

public class PeerInvitationInfo(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzCloudName: Pwstr = null,
    public var dwScope: UInt = 0u,
    public var dwCloudFlags: UInt = 0u,
    public var pwzGroupPeerName: Pwstr = null,
    public var pwzIssuerPeerName: Pwstr = null,
    public var pwzSubjectPeerName: Pwstr = null,
    public var pwzGroupFriendlyName: Pwstr = null,
    public var pwzIssuerFriendlyName: Pwstr = null,
    public var pwzSubjectFriendlyName: Pwstr = null,
    public var ftValidityStart: Filetime = Filetime(),
    public var ftValidityEnd: Filetime = Filetime(),
    public var cRoles: UInt = 0u,
    public var pRoles: Guid? = null,
    public var cClassifiers: UInt = 0u,
    public var ppwzClassifiers: Pwstr? = null,
    public var pSubjectPublicKey: CertPublicKeyInfo? = null,
    public var authScheme: PeerGroupAuthenticationScheme = 0,
)

public data class PeerInvitationResponse(
    public var action: PeerInvitationResponseType = 0,
    public var pwzMessage: Pwstr = null,
    public var hrExtendedInfo: Hresult = 0,
)

public data class PeerMember(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzIdentity: Pwstr = null,
    public var pwzAttributes: Pwstr = null,
    public var ullNodeId: ULong = 0uL,
    public var cAddresses: UInt = 0u,
    public var pAddresses: PeerAddress? = null,
    public var pCredentialInfo: PeerCredentialInfo? = null,
)

public data class PeerNamePair(
    public var dwSize: UInt = 0u,
    public var pwzPeerName: Pwstr = null,
    public var pwzFriendlyName: Pwstr = null,
)

public data class PeerNodeInfo(
    public var dwSize: UInt = 0u,
    public var ullNodeId: ULong = 0uL,
    public var pwzPeerId: Pwstr = null,
    public var cAddresses: UInt = 0u,
    public var pAddresses: PeerAddress? = null,
    public var pwzAttributes: Pwstr = null,
)

public data class PeerObject(
    public var id: Guid = Guid(),
    public var data: PeerData = PeerData(),
    public var dwPublicationScope: UInt = 0u,
)

public data class PeerPeopleNearMe(
    public var pwzNickName: Pwstr = null,
    public var endpoint: PeerEndpoint = PeerEndpoint(),
    public var id: Guid = Guid(),
)

public data class PeerPnrpCloudInfo(
    public var pwzCloudName: Pwstr = null,
    public var dwScope: PnrpScope = 0,
    public var dwScopeId: UInt = 0u,
)

public data class PeerPnrpEndpointInfo(
    public var pwzPeerName: Pwstr = null,
    public var cAddresses: UInt = 0u,
    public var ppAddresses: COpaquePointer? = null,
    public var pwzComment: Pwstr = null,
    public var payload: PeerData = PeerData(),
)

public data class PeerPnrpRegistrationInfo(
    public var pwzCloudName: Pwstr = null,
    public var pwzPublishingIdentity: Pwstr = null,
    public var cAddresses: UInt = 0u,
    public var ppAddresses: COpaquePointer? = null,
    public var wPort: UShort = 0u,
    public var pwzComment: Pwstr = null,
    public var payload: PeerData = PeerData(),
)

public data class PeerPresenceInfo(
    public var status: PeerPresenceStatus = 0,
    public var pwzDescriptiveText: Pwstr = null,
)

public data class PeerRecord(
    public var dwSize: UInt = 0u,
    public var type: Guid = Guid(),
    public var id: Guid = Guid(),
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwzCreatorId: Pwstr = null,
    public var pwzModifiedById: Pwstr = null,
    public var pwzAttributes: Pwstr = null,
    public var ftCreation: Filetime = Filetime(),
    public var ftExpiration: Filetime = Filetime(),
    public var ftLastModified: Filetime = Filetime(),
    public var securityData: PeerData = PeerData(),
    public var data: PeerData = PeerData(),
)

public data class PeerSecurityInterface(
    public var dwSize: UInt = 0u,
    public var pwzSspFilename: Pwstr = null,
    public var pwzPackageName: Pwstr = null,
    public var cbSecurityInfo: UInt = 0u,
    public var pbSecurityInfo: COpaquePointer? = null,
    public var pvContext: COpaquePointer? = null,
    public var pfnValidateRecord: PfnpeerValidateRecord = null,
    public var pfnSecureRecord: PfnpeerSecureRecord = null,
    public var pfnFreeSecurityData: PfnpeerFreeSecurityData = null,
    public var pfnAuthFailed: PfnpeerOnPasswordAuthFailed = null,
)

public data class PeerVersionData(
    public var wVersion: UShort = 0u,
    public var wHighestVersion: UShort = 0u,
)

public data class Pnrpcloudinfo(
    public var dwSize: UInt = 0u,
    public var cloud: PnrpCloudId = PnrpCloudId(),
    public var enCloudState: PnrpCloudState = 0,
    public var enCloudFlags: PnrpCloudFlags = 0,
)

public data class PnrpinfoV1(
    public var dwSize: UInt = 0u,
    public var lpwszIdentity: Pwstr = null,
    public var nMaxResolve: UInt = 0u,
    public var dwTimeout: UInt = 0u,
    public var dwLifetime: UInt = 0u,
    public var enResolveCriteria: PnrpResolveCriteria = 0,
    public var dwFlags: UInt = 0u,
    public var saHint: SocketAddress = SocketAddress(),
    public var enNameState: PnrpRegisteredIdState = 0,
)

public data class PnrpinfoV2(
    public var dwSize: UInt = 0u,
    public var lpwszIdentity: Pwstr = null,
    public var nMaxResolve: UInt = 0u,
    public var dwTimeout: UInt = 0u,
    public var dwLifetime: UInt = 0u,
    public var enResolveCriteria: PnrpResolveCriteria = 0,
    public var dwFlags: UInt = 0u,
    public var saHint: SocketAddress = SocketAddress(),
    public var enNameState: PnrpRegisteredIdState = 0,
    public var enExtendedPayloadType: PnrpExtendedPayloadType = 0,
    public var anonymous: PnrpinfoV20 = PnrpinfoV20(),
)

public data class PnrpinfoV20(
    public var blobPayload: Blob = Blob(),
    public var pwszPayload: Pwstr = null,
)

public data class PnrpCloudId(
    public var addressFamily: Int = 0,
    public var scope: PnrpScope = 0,
    public var scopeId: UInt = 0u,
)
