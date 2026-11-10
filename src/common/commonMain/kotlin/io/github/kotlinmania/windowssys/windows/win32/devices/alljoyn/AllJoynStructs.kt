package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr

public data class AlljoynAboutdatalistenerCallbacks(
    public var aboutDatalistenerGetaboutdata: AlljoynAboutdatalistenerGetaboutdataPtr = null,
    public var aboutDatalistenerGetannouncedaboutdata: AlljoynAboutdatalistenerGetannouncedaboutdataPtr = null,
)

public data class AlljoynAboutlistenerCallback(
    public var aboutListenerAnnounced: AlljoynAboutAnnouncedPtr = null,
)

public data class AlljoynApplicationstatelistenerCallbacks(
    public var state: AlljoynApplicationstatelistenerStatePtr = null,
)

public data class AlljoynAuthlistenerCallbacks(
    public var requestCredentials: AlljoynAuthlistenerRequestcredentialsPtr = null,
    public var verifyCredentials: AlljoynAuthlistenerVerifycredentialsPtr = null,
    public var securityViolation: AlljoynAuthlistenerSecurityviolationPtr = null,
    public var authenticationComplete: AlljoynAuthlistenerAuthenticationcompletePtr = null,
)

public data class AlljoynAuthlistenerasyncCallbacks(
    public var requestCredentials: AlljoynAuthlistenerRequestcredentialsasyncPtr = null,
    public var verifyCredentials: AlljoynAuthlistenerVerifycredentialsasyncPtr = null,
    public var securityViolation: AlljoynAuthlistenerSecurityviolationPtr = null,
    public var authenticationComplete: AlljoynAuthlistenerAuthenticationcompletePtr = null,
)

public data class AlljoynBuslistenerCallbacks(
    public var listenerRegistered: AlljoynBuslistenerListenerRegisteredPtr = null,
    public var listenerUnregistered: AlljoynBuslistenerListenerUnregisteredPtr = null,
    public var foundAdvertisedName: AlljoynBuslistenerFoundAdvertisedNamePtr = null,
    public var lostAdvertisedName: AlljoynBuslistenerLostAdvertisedNamePtr = null,
    public var nameOwnerChanged: AlljoynBuslistenerNameOwnerChangedPtr = null,
    public var busStopping: AlljoynBuslistenerBusStoppingPtr = null,
    public var busDisconnected: AlljoynBuslistenerBusDisconnectedPtr = null,
    public var propertyChanged: AlljoynBuslistenerBusPropChangedPtr = null,
)

public data class AlljoynBusobjectCallbacks(
    public var propertyGet: AlljoynBusobjectPropGetPtr = null,
    public var propertySet: AlljoynBusobjectPropSetPtr = null,
    public var objectRegistered: AlljoynBusobjectObjectRegistrationPtr = null,
    public var objectUnregistered: AlljoynBusobjectObjectRegistrationPtr = null,
)

public data class AlljoynBusobjectMethodentry(
    public var member: AlljoynInterfacedescriptionMember? = null,
    public var methodHandler: AlljoynMessagereceiverMethodhandlerPtr = null,
)

public data class AlljoynCertificateid(
    public var serial: COpaquePointer? = null,
    public var serialLen: Int = 0,
    public var issuerPublicKey: COpaquePointer? = null,
    public var issuerAki: COpaquePointer? = null,
    public var issuerAkiLen: Int = 0,
)

public data class AlljoynCertificateidarray(
    public var count: Int = 0,
    public var ids: AlljoynCertificateid? = null,
)

public data class AlljoynInterfacedescriptionMember(
    public var iface: AlljoynInterfacedescription = 0L,
    public var memberType: AlljoynMessagetype = 0,
    public var name: Pcstr = null,
    public var signature: Pcstr = null,
    public var returnSignature: Pcstr = null,
    public var argNames: Pcstr = null,
    public var internalMember: COpaquePointer? = null,
)

public data class AlljoynInterfacedescriptionProperty(
    public var name: Pcstr = null,
    public var signature: Pcstr = null,
    public var access: UByte = 0u,
    public var internalProperty: COpaquePointer? = null,
)

public data class AlljoynKeystorelistenerCallbacks(
    public var loadRequest: AlljoynKeystorelistenerLoadrequestPtr = null,
    public var storeRequest: AlljoynKeystorelistenerStorerequestPtr = null,
)

public data class AlljoynKeystorelistenerWithSynchronizationCallbacks(
    public var loadRequest: AlljoynKeystorelistenerLoadrequestPtr = null,
    public var storeRequest: AlljoynKeystorelistenerStorerequestPtr = null,
    public var acquireExclusiveLock: AlljoynKeystorelistenerAcquireexclusivelockPtr = null,
    public var releaseExclusiveLock: AlljoynKeystorelistenerReleaseexclusivelockPtr = null,
)

public data class AlljoynManifestarray(
    public var count: Int = 0,
    public var xmls: COpaquePointer? = null,
)

public data class AlljoynObserverlistenerCallback(
    public var objectDiscovered: AlljoynObserverObjectDiscoveredPtr = null,
    public var objectLost: AlljoynObserverObjectLostPtr = null,
)

public data class AlljoynPermissionconfigurationlistenerCallbacks(
    public var factoryReset: AlljoynPermissionconfigurationlistenerFactoryresetPtr = null,
    public var policyChanged: AlljoynPermissionconfigurationlistenerPolicychangedPtr = null,
    public var startManagement: AlljoynPermissionconfigurationlistenerStartmanagementPtr = null,
    public var endManagement: AlljoynPermissionconfigurationlistenerEndmanagementPtr = null,
)

public data class AlljoynPinglistenerCallback(
    public var destinationFound: AlljoynAutopingerDestinationFoundPtr = null,
    public var destinationLost: AlljoynAutopingerDestinationLostPtr = null,
)

public data class AlljoynSessionlistenerCallbacks(
    public var sessionLost: AlljoynSessionlistenerSessionlostPtr = null,
    public var sessionMemberAdded: AlljoynSessionlistenerSessionmemberaddedPtr = null,
    public var sessionMemberRemoved: AlljoynSessionlistenerSessionmemberremovedPtr = null,
)

public data class AlljoynSessionportlistenerCallbacks(
    public var acceptSessionJoiner: AlljoynSessionportlistenerAcceptsessionjoinerPtr = null,
    public var sessionJoined: AlljoynSessionportlistenerSessionjoinedPtr = null,
)
