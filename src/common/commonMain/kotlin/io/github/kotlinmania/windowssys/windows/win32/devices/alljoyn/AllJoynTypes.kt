package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public typealias QStatus = Int

public fun interface AlljoynAboutAnnouncedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, busname: Pcstr, version: UShort, port: UShort, objectdescriptionarg: AlljoynMsgarg, aboutdataarg: AlljoynMsgarg)
}

public typealias AlljoynAboutAnnouncedPtr = AlljoynAboutAnnouncedPtrFn?

public typealias AlljoynAboutAnnounceflag = Int

public typealias AlljoynAboutdata = Long

public typealias AlljoynAboutdatalistener = Long

public fun interface AlljoynAboutdatalistenerGetaboutdataPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, msgarg: AlljoynMsgarg, language: Pcstr): QStatus
}

public typealias AlljoynAboutdatalistenerGetaboutdataPtr = AlljoynAboutdatalistenerGetaboutdataPtrFn?

public fun interface AlljoynAboutdatalistenerGetannouncedaboutdataPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, msgarg: AlljoynMsgarg): QStatus
}

public typealias AlljoynAboutdatalistenerGetannouncedaboutdataPtr = AlljoynAboutdatalistenerGetannouncedaboutdataPtrFn?

public typealias AlljoynAbouticon = Long

public typealias AlljoynAbouticonobj = Long

public typealias AlljoynAbouticonproxy = Long

public typealias AlljoynAboutlistener = Long

public typealias AlljoynAboutobj = Long

public typealias AlljoynAboutobjectdescription = Long

public typealias AlljoynAboutproxy = Long

public typealias AlljoynApplicationstate = Int

public typealias AlljoynApplicationstatelistener = Long

public fun interface AlljoynApplicationstatelistenerStatePtrFn {
    public operator fun invoke(busname: MutPtr<Byte>, publickey: MutPtr<Byte>, applicationstate: AlljoynApplicationstate, context: MutPtr<CVoid>)
}

public typealias AlljoynApplicationstatelistenerStatePtr = AlljoynApplicationstatelistenerStatePtrFn?

public typealias AlljoynAuthlistener = Long

public fun interface AlljoynAuthlistenerAuthenticationcompletePtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, authmechanism: Pcstr, peername: Pcstr, success: Int)
}

public typealias AlljoynAuthlistenerAuthenticationcompletePtr = AlljoynAuthlistenerAuthenticationcompletePtrFn?

public fun interface AlljoynAuthlistenerRequestcredentialsPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, authmechanism: Pcstr, peername: Pcstr, authcount: UShort, username: Pcstr, credmask: UShort, credentials: AlljoynCredentials): Int
}

public typealias AlljoynAuthlistenerRequestcredentialsPtr = AlljoynAuthlistenerRequestcredentialsPtrFn?

public fun interface AlljoynAuthlistenerRequestcredentialsasyncPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, listener: AlljoynAuthlistener, authmechanism: Pcstr, peername: Pcstr, authcount: UShort, username: Pcstr, credmask: UShort, authcontext: MutPtr<CVoid>): QStatus
}

public typealias AlljoynAuthlistenerRequestcredentialsasyncPtr = AlljoynAuthlistenerRequestcredentialsasyncPtrFn?

public fun interface AlljoynAuthlistenerSecurityviolationPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, status: QStatus, msg: AlljoynMessage)
}

public typealias AlljoynAuthlistenerSecurityviolationPtr = AlljoynAuthlistenerSecurityviolationPtrFn?

public fun interface AlljoynAuthlistenerVerifycredentialsPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, authmechanism: Pcstr, peername: Pcstr, credentials: AlljoynCredentials): Int
}

public typealias AlljoynAuthlistenerVerifycredentialsPtr = AlljoynAuthlistenerVerifycredentialsPtrFn?

public fun interface AlljoynAuthlistenerVerifycredentialsasyncPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, listener: AlljoynAuthlistener, authmechanism: Pcstr, peername: Pcstr, credentials: AlljoynCredentials, authcontext: MutPtr<CVoid>): QStatus
}

public typealias AlljoynAuthlistenerVerifycredentialsasyncPtr = AlljoynAuthlistenerVerifycredentialsasyncPtrFn?

public typealias AlljoynAutopinger = Long

public fun interface AlljoynAutopingerDestinationFoundPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, group: Pcstr, destination: Pcstr)
}

public typealias AlljoynAutopingerDestinationFoundPtr = AlljoynAutopingerDestinationFoundPtrFn?

public fun interface AlljoynAutopingerDestinationLostPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, group: Pcstr, destination: Pcstr)
}

public typealias AlljoynAutopingerDestinationLostPtr = AlljoynAutopingerDestinationLostPtrFn?

public typealias AlljoynBusattachment = Long

public fun interface AlljoynBusattachmentJoinsessioncbPtrFn {
    public operator fun invoke(status: QStatus, sessionid: UInt, opts: AlljoynSessionopts, context: MutPtr<CVoid>)
}

public typealias AlljoynBusattachmentJoinsessioncbPtr = AlljoynBusattachmentJoinsessioncbPtrFn?

public fun interface AlljoynBusattachmentSetlinktimeoutcbPtrFn {
    public operator fun invoke(status: QStatus, timeout: UInt, context: MutPtr<CVoid>)
}

public typealias AlljoynBusattachmentSetlinktimeoutcbPtr = AlljoynBusattachmentSetlinktimeoutcbPtrFn?

public typealias AlljoynBuslistener = Long

public fun interface AlljoynBuslistenerBusDisconnectedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynBuslistenerBusDisconnectedPtr = AlljoynBuslistenerBusDisconnectedPtrFn?

public fun interface AlljoynBuslistenerBusPropChangedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, propName: Pcstr, propValue: AlljoynMsgarg)
}

public typealias AlljoynBuslistenerBusPropChangedPtr = AlljoynBuslistenerBusPropChangedPtrFn?

public fun interface AlljoynBuslistenerBusStoppingPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynBuslistenerBusStoppingPtr = AlljoynBuslistenerBusStoppingPtrFn?

public fun interface AlljoynBuslistenerFoundAdvertisedNamePtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, name: Pcstr, transport: UShort, nameprefix: Pcstr)
}

public typealias AlljoynBuslistenerFoundAdvertisedNamePtr = AlljoynBuslistenerFoundAdvertisedNamePtrFn?

public fun interface AlljoynBuslistenerListenerRegisteredPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, bus: AlljoynBusattachment)
}

public typealias AlljoynBuslistenerListenerRegisteredPtr = AlljoynBuslistenerListenerRegisteredPtrFn?

public fun interface AlljoynBuslistenerListenerUnregisteredPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynBuslistenerListenerUnregisteredPtr = AlljoynBuslistenerListenerUnregisteredPtrFn?

public fun interface AlljoynBuslistenerLostAdvertisedNamePtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, name: Pcstr, transport: UShort, nameprefix: Pcstr)
}

public typealias AlljoynBuslistenerLostAdvertisedNamePtr = AlljoynBuslistenerLostAdvertisedNamePtrFn?

public fun interface AlljoynBuslistenerNameOwnerChangedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, busname: Pcstr, previousowner: Pcstr, newowner: Pcstr)
}

public typealias AlljoynBuslistenerNameOwnerChangedPtr = AlljoynBuslistenerNameOwnerChangedPtrFn?

public typealias AlljoynBusobject = Long

public fun interface AlljoynBusobjectObjectRegistrationPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynBusobjectObjectRegistrationPtr = AlljoynBusobjectObjectRegistrationPtrFn?

public fun interface AlljoynBusobjectPropGetPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg): QStatus
}

public typealias AlljoynBusobjectPropGetPtr = AlljoynBusobjectPropGetPtrFn?

public fun interface AlljoynBusobjectPropSetPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg): QStatus
}

public typealias AlljoynBusobjectPropSetPtr = AlljoynBusobjectPropSetPtrFn?

public typealias AlljoynClaimcapabilityMasks = Int

public typealias AlljoynClaimcapabilityadditionalinfoMasks = Int

public typealias AlljoynCredentials = Long

public typealias AlljoynInterfacedescription = Long

public typealias AlljoynInterfacedescriptionSecuritypolicy = Int

public fun interface AlljoynInterfacedescriptionTranslationCallbackPtrFn {
    public operator fun invoke(sourcelanguage: Pcstr, targetlanguage: Pcstr, sourcetext: Pcstr): Pcstr
}

public typealias AlljoynInterfacedescriptionTranslationCallbackPtr = AlljoynInterfacedescriptionTranslationCallbackPtrFn?

public typealias AlljoynKeystore = Long

public typealias AlljoynKeystorelistener = Long

public fun interface AlljoynKeystorelistenerAcquireexclusivelockPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, listener: AlljoynKeystorelistener): QStatus
}

public typealias AlljoynKeystorelistenerAcquireexclusivelockPtr = AlljoynKeystorelistenerAcquireexclusivelockPtrFn?

public fun interface AlljoynKeystorelistenerLoadrequestPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, listener: AlljoynKeystorelistener, keystore: AlljoynKeystore): QStatus
}

public typealias AlljoynKeystorelistenerLoadrequestPtr = AlljoynKeystorelistenerLoadrequestPtrFn?

public fun interface AlljoynKeystorelistenerReleaseexclusivelockPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, listener: AlljoynKeystorelistener)
}

public typealias AlljoynKeystorelistenerReleaseexclusivelockPtr = AlljoynKeystorelistenerReleaseexclusivelockPtrFn?

public fun interface AlljoynKeystorelistenerStorerequestPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, listener: AlljoynKeystorelistener, keystore: AlljoynKeystore): QStatus
}

public typealias AlljoynKeystorelistenerStorerequestPtr = AlljoynKeystorelistenerStorerequestPtrFn?

public typealias AlljoynMessage = Long

public fun interface AlljoynMessagereceiverMethodhandlerPtrFn {
    public operator fun invoke(bus: AlljoynBusobject, member: ConstPtr<AlljoynInterfacedescriptionMember>, message: AlljoynMessage)
}

public typealias AlljoynMessagereceiverMethodhandlerPtr = AlljoynMessagereceiverMethodhandlerPtrFn?

public fun interface AlljoynMessagereceiverReplyhandlerPtrFn {
    public operator fun invoke(message: AlljoynMessage, context: MutPtr<CVoid>)
}

public typealias AlljoynMessagereceiverReplyhandlerPtr = AlljoynMessagereceiverReplyhandlerPtrFn?

public fun interface AlljoynMessagereceiverSignalhandlerPtrFn {
    public operator fun invoke(member: ConstPtr<AlljoynInterfacedescriptionMember>, srcpath: Pcstr, message: AlljoynMessage)
}

public typealias AlljoynMessagereceiverSignalhandlerPtr = AlljoynMessagereceiverSignalhandlerPtrFn?

public typealias AlljoynMessagetype = Int

public typealias AlljoynMsgarg = Long

public typealias AlljoynObserver = Long

public fun interface AlljoynObserverObjectDiscoveredPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, proxyref: AlljoynProxybusobjectRef)
}

public typealias AlljoynObserverObjectDiscoveredPtr = AlljoynObserverObjectDiscoveredPtrFn?

public fun interface AlljoynObserverObjectLostPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, proxyref: AlljoynProxybusobjectRef)
}

public typealias AlljoynObserverObjectLostPtr = AlljoynObserverObjectLostPtrFn?

public typealias AlljoynObserverlistener = Long

public typealias AlljoynPermissionconfigurationlistener = Long

public fun interface AlljoynPermissionconfigurationlistenerEndmanagementPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynPermissionconfigurationlistenerEndmanagementPtr = AlljoynPermissionconfigurationlistenerEndmanagementPtrFn?

public fun interface AlljoynPermissionconfigurationlistenerFactoryresetPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>): QStatus
}

public typealias AlljoynPermissionconfigurationlistenerFactoryresetPtr = AlljoynPermissionconfigurationlistenerFactoryresetPtrFn?

public fun interface AlljoynPermissionconfigurationlistenerPolicychangedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynPermissionconfigurationlistenerPolicychangedPtr = AlljoynPermissionconfigurationlistenerPolicychangedPtrFn?

public fun interface AlljoynPermissionconfigurationlistenerStartmanagementPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
}

public typealias AlljoynPermissionconfigurationlistenerStartmanagementPtr = AlljoynPermissionconfigurationlistenerStartmanagementPtrFn?

public typealias AlljoynPermissionconfigurator = Long

public typealias AlljoynPinglistener = Long

public typealias AlljoynProxybusobject = Long

public fun interface AlljoynProxybusobjectListenerGetallpropertiescbPtrFn {
    public operator fun invoke(status: QStatus, obj: AlljoynProxybusobject, values: AlljoynMsgarg, context: MutPtr<CVoid>)
}

public typealias AlljoynProxybusobjectListenerGetallpropertiescbPtr = AlljoynProxybusobjectListenerGetallpropertiescbPtrFn?

public fun interface AlljoynProxybusobjectListenerGetpropertycbPtrFn {
    public operator fun invoke(status: QStatus, obj: AlljoynProxybusobject, value: AlljoynMsgarg, context: MutPtr<CVoid>)
}

public typealias AlljoynProxybusobjectListenerGetpropertycbPtr = AlljoynProxybusobjectListenerGetpropertycbPtrFn?

public fun interface AlljoynProxybusobjectListenerIntrospectcbPtrFn {
    public operator fun invoke(status: QStatus, obj: AlljoynProxybusobject, context: MutPtr<CVoid>)
}

public typealias AlljoynProxybusobjectListenerIntrospectcbPtr = AlljoynProxybusobjectListenerIntrospectcbPtrFn?

public fun interface AlljoynProxybusobjectListenerPropertieschangedPtrFn {
    public operator fun invoke(obj: AlljoynProxybusobject, ifacename: Pcstr, changed: AlljoynMsgarg, invalidated: AlljoynMsgarg, context: MutPtr<CVoid>)
}

public typealias AlljoynProxybusobjectListenerPropertieschangedPtr = AlljoynProxybusobjectListenerPropertieschangedPtrFn?

public fun interface AlljoynProxybusobjectListenerSetpropertycbPtrFn {
    public operator fun invoke(status: QStatus, obj: AlljoynProxybusobject, context: MutPtr<CVoid>)
}

public typealias AlljoynProxybusobjectListenerSetpropertycbPtr = AlljoynProxybusobjectListenerSetpropertycbPtrFn?

public typealias AlljoynProxybusobjectRef = Long

public typealias AlljoynSecurityapplicationproxy = Long

public typealias AlljoynSessionlistener = Long

public fun interface AlljoynSessionlistenerSessionlostPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, sessionid: UInt, reason: AlljoynSessionlostreason)
}

public typealias AlljoynSessionlistenerSessionlostPtr = AlljoynSessionlistenerSessionlostPtrFn?

public fun interface AlljoynSessionlistenerSessionmemberaddedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, sessionid: UInt, uniquename: Pcstr)
}

public typealias AlljoynSessionlistenerSessionmemberaddedPtr = AlljoynSessionlistenerSessionmemberaddedPtrFn?

public fun interface AlljoynSessionlistenerSessionmemberremovedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, sessionid: UInt, uniquename: Pcstr)
}

public typealias AlljoynSessionlistenerSessionmemberremovedPtr = AlljoynSessionlistenerSessionmemberremovedPtrFn?

public typealias AlljoynSessionlostreason = Int

public typealias AlljoynSessionopts = Long

public typealias AlljoynSessionportlistener = Long

public fun interface AlljoynSessionportlistenerAcceptsessionjoinerPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, sessionport: UShort, joiner: Pcstr, opts: AlljoynSessionopts): Int
}

public typealias AlljoynSessionportlistenerAcceptsessionjoinerPtr = AlljoynSessionportlistenerAcceptsessionjoinerPtrFn?

public fun interface AlljoynSessionportlistenerSessionjoinedPtrFn {
    public operator fun invoke(context: ConstPtr<CVoid>, sessionport: UShort, id: UInt, joiner: Pcstr)
}

public typealias AlljoynSessionportlistenerSessionjoinedPtr = AlljoynSessionportlistenerSessionjoinedPtrFn?

public typealias AlljoynTypeid = Int
