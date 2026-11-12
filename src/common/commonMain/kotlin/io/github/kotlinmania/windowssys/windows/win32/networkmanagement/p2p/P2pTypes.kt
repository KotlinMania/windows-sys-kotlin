package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddressList

public typealias DrtAddressFlags = Int

public fun interface DrtBootstrapResolveCallbackFn {
    public operator fun invoke(hr: Hresult, pvcontext: MutPtr<CVoid>, paddresses: MutPtr<SocketAddressList>, ffatalerror: Bool)
}

public typealias DrtBootstrapResolveCallback = DrtBootstrapResolveCallbackFn?

public typealias DrtEventType = Int

public typealias DrtLeafsetKeyChangeType = Int

public typealias DrtMatchType = Int

public typealias DrtRegistrationState = Int

public typealias DrtScope = Int

public typealias DrtSecurityMode = Int

public typealias DrtStatus = Int

public typealias PeerdistClientInfoByHandleClass = Int

public typealias PeerdistRetrievalOptionsContentinfoVersionValue = UInt

public typealias PeerdistStatus = Int

public typealias PeerApplicationRegistrationType = Int

public typealias PeerChangeType = Int

public typealias PeerCollabEventType = Int

public typealias PeerConnectionFlags = Int

public typealias PeerConnectionStatus = Int

public typealias PeerGraphEventType = Int

public typealias PeerGraphPropertyFlags = Int

public typealias PeerGraphScope = Int

public typealias PeerGraphStatusFlags = Int

public typealias PeerGroupAuthenticationScheme = Int

public typealias PeerGroupEventType = Int

public typealias PeerGroupIssueCredentialFlags = Int

public typealias PeerGroupPropertyFlags = Int

public typealias PeerGroupStatus = Int

public typealias PeerInvitationResponseType = Int

public typealias PeerMemberChangeType = Int

public typealias PeerMemberFlags = Int

public typealias PeerNodeChangeType = Int

public typealias PeerPresenceStatus = Int

public typealias PeerPublicationScope = Int

public typealias PeerRecordChangeType = Int

public typealias PeerRecordFlags = Int

public typealias PeerSigninFlags = Int

public typealias PeerWatchPermission = Int

public fun interface PfnpeerFreeSecurityDataFn {
    public operator fun invoke(hgraph: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>, psecuritydata: ConstPtr<PeerData>): Hresult
}

public typealias PfnpeerFreeSecurityData = PfnpeerFreeSecurityDataFn?

public fun interface PfnpeerOnPasswordAuthFailedFn {
    public operator fun invoke(hgraph: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): Hresult
}

public typealias PfnpeerOnPasswordAuthFailed = PfnpeerOnPasswordAuthFailedFn?

public fun interface PfnpeerSecureRecordFn {
    public operator fun invoke(hgraph: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, changetype: PeerRecordChangeType, ppsecuritydata: MutPtr<MutPtr<PeerData>>): Hresult
}

public typealias PfnpeerSecureRecord = PfnpeerSecureRecordFn?

public fun interface PfnpeerValidateRecordFn {
    public operator fun invoke(hgraph: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, changetype: PeerRecordChangeType): Hresult
}

public typealias PfnpeerValidateRecord = PfnpeerValidateRecordFn?

public typealias PnrpCloudFlags = Int

public typealias PnrpCloudState = Int

public typealias PnrpExtendedPayloadType = Int

public typealias PnrpRegisteredIdState = Int

public typealias PnrpResolveCriteria = Int

public typealias PnrpScope = Int
