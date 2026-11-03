package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.PCSTR

public typealias QStatus = Int

public fun interface alljoyn_about_announced_ptrFn {
    public operator fun invoke(context: Long, busname: PCSTR, version: UShort, port: UShort, objectdescriptionarg: alljoyn_msgarg, aboutdataarg: alljoyn_msgarg)
}

public typealias alljoyn_about_announced_ptr = alljoyn_about_announced_ptrFn?

public typealias alljoyn_about_announceflag = Int

public typealias alljoyn_aboutdata = Long

public typealias alljoyn_aboutdatalistener = Long

public fun interface alljoyn_aboutdatalistener_getaboutdata_ptrFn {
    public operator fun invoke(context: Long, msgarg: alljoyn_msgarg, language: PCSTR): QStatus
}

public typealias alljoyn_aboutdatalistener_getaboutdata_ptr = alljoyn_aboutdatalistener_getaboutdata_ptrFn?

public fun interface alljoyn_aboutdatalistener_getannouncedaboutdata_ptrFn {
    public operator fun invoke(context: Long, msgarg: alljoyn_msgarg): QStatus
}

public typealias alljoyn_aboutdatalistener_getannouncedaboutdata_ptr = alljoyn_aboutdatalistener_getannouncedaboutdata_ptrFn?

public typealias alljoyn_abouticon = Long

public typealias alljoyn_abouticonobj = Long

public typealias alljoyn_abouticonproxy = Long

public typealias alljoyn_aboutlistener = Long

public typealias alljoyn_aboutobj = Long

public typealias alljoyn_aboutobjectdescription = Long

public typealias alljoyn_aboutproxy = Long

public typealias alljoyn_applicationstate = Int

public typealias alljoyn_applicationstatelistener = Long

public fun interface alljoyn_applicationstatelistener_state_ptrFn {
    public operator fun invoke(busname: Long, publickey: Long, applicationstate: alljoyn_applicationstate, context: Long)
}

public typealias alljoyn_applicationstatelistener_state_ptr = alljoyn_applicationstatelistener_state_ptrFn?

public typealias alljoyn_authlistener = Long

public fun interface alljoyn_authlistener_authenticationcomplete_ptrFn {
    public operator fun invoke(context: Long, authmechanism: PCSTR, peername: PCSTR, success: Int)
}

public typealias alljoyn_authlistener_authenticationcomplete_ptr = alljoyn_authlistener_authenticationcomplete_ptrFn?

public fun interface alljoyn_authlistener_requestcredentials_ptrFn {
    public operator fun invoke(context: Long, authmechanism: PCSTR, peername: PCSTR, authcount: UShort, username: PCSTR, credmask: UShort, credentials: alljoyn_credentials): Int
}

public typealias alljoyn_authlistener_requestcredentials_ptr = alljoyn_authlistener_requestcredentials_ptrFn?

public fun interface alljoyn_authlistener_requestcredentialsasync_ptrFn {
    public operator fun invoke(context: Long, listener: alljoyn_authlistener, authmechanism: PCSTR, peername: PCSTR, authcount: UShort, username: PCSTR, credmask: UShort, authcontext: Long): QStatus
}

public typealias alljoyn_authlistener_requestcredentialsasync_ptr = alljoyn_authlistener_requestcredentialsasync_ptrFn?

public fun interface alljoyn_authlistener_securityviolation_ptrFn {
    public operator fun invoke(context: Long, status: QStatus, msg: alljoyn_message)
}

public typealias alljoyn_authlistener_securityviolation_ptr = alljoyn_authlistener_securityviolation_ptrFn?

public fun interface alljoyn_authlistener_verifycredentials_ptrFn {
    public operator fun invoke(context: Long, authmechanism: PCSTR, peername: PCSTR, credentials: alljoyn_credentials): Int
}

public typealias alljoyn_authlistener_verifycredentials_ptr = alljoyn_authlistener_verifycredentials_ptrFn?

public fun interface alljoyn_authlistener_verifycredentialsasync_ptrFn {
    public operator fun invoke(context: Long, listener: alljoyn_authlistener, authmechanism: PCSTR, peername: PCSTR, credentials: alljoyn_credentials, authcontext: Long): QStatus
}

public typealias alljoyn_authlistener_verifycredentialsasync_ptr = alljoyn_authlistener_verifycredentialsasync_ptrFn?

public typealias alljoyn_autopinger = Long

public fun interface alljoyn_autopinger_destination_found_ptrFn {
    public operator fun invoke(context: Long, group: PCSTR, destination: PCSTR)
}

public typealias alljoyn_autopinger_destination_found_ptr = alljoyn_autopinger_destination_found_ptrFn?

public fun interface alljoyn_autopinger_destination_lost_ptrFn {
    public operator fun invoke(context: Long, group: PCSTR, destination: PCSTR)
}

public typealias alljoyn_autopinger_destination_lost_ptr = alljoyn_autopinger_destination_lost_ptrFn?

public typealias alljoyn_busattachment = Long

public fun interface alljoyn_busattachment_joinsessioncb_ptrFn {
    public operator fun invoke(status: QStatus, sessionid: UInt, opts: alljoyn_sessionopts, context: Long)
}

public typealias alljoyn_busattachment_joinsessioncb_ptr = alljoyn_busattachment_joinsessioncb_ptrFn?

public fun interface alljoyn_busattachment_setlinktimeoutcb_ptrFn {
    public operator fun invoke(status: QStatus, timeout: UInt, context: Long)
}

public typealias alljoyn_busattachment_setlinktimeoutcb_ptr = alljoyn_busattachment_setlinktimeoutcb_ptrFn?

public typealias alljoyn_buslistener = Long

public fun interface alljoyn_buslistener_bus_disconnected_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_buslistener_bus_disconnected_ptr = alljoyn_buslistener_bus_disconnected_ptrFn?

public fun interface alljoyn_buslistener_bus_prop_changed_ptrFn {
    public operator fun invoke(context: Long, prop_name: PCSTR, prop_value: alljoyn_msgarg)
}

public typealias alljoyn_buslistener_bus_prop_changed_ptr = alljoyn_buslistener_bus_prop_changed_ptrFn?

public fun interface alljoyn_buslistener_bus_stopping_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_buslistener_bus_stopping_ptr = alljoyn_buslistener_bus_stopping_ptrFn?

public fun interface alljoyn_buslistener_found_advertised_name_ptrFn {
    public operator fun invoke(context: Long, name: PCSTR, transport: UShort, nameprefix: PCSTR)
}

public typealias alljoyn_buslistener_found_advertised_name_ptr = alljoyn_buslistener_found_advertised_name_ptrFn?

public fun interface alljoyn_buslistener_listener_registered_ptrFn {
    public operator fun invoke(context: Long, bus: alljoyn_busattachment)
}

public typealias alljoyn_buslistener_listener_registered_ptr = alljoyn_buslistener_listener_registered_ptrFn?

public fun interface alljoyn_buslistener_listener_unregistered_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_buslistener_listener_unregistered_ptr = alljoyn_buslistener_listener_unregistered_ptrFn?

public fun interface alljoyn_buslistener_lost_advertised_name_ptrFn {
    public operator fun invoke(context: Long, name: PCSTR, transport: UShort, nameprefix: PCSTR)
}

public typealias alljoyn_buslistener_lost_advertised_name_ptr = alljoyn_buslistener_lost_advertised_name_ptrFn?

public fun interface alljoyn_buslistener_name_owner_changed_ptrFn {
    public operator fun invoke(context: Long, busname: PCSTR, previousowner: PCSTR, newowner: PCSTR)
}

public typealias alljoyn_buslistener_name_owner_changed_ptr = alljoyn_buslistener_name_owner_changed_ptrFn?

public typealias alljoyn_busobject = Long

public fun interface alljoyn_busobject_object_registration_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_busobject_object_registration_ptr = alljoyn_busobject_object_registration_ptrFn?

public fun interface alljoyn_busobject_prop_get_ptrFn {
    public operator fun invoke(context: Long, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg): QStatus
}

public typealias alljoyn_busobject_prop_get_ptr = alljoyn_busobject_prop_get_ptrFn?

public fun interface alljoyn_busobject_prop_set_ptrFn {
    public operator fun invoke(context: Long, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg): QStatus
}

public typealias alljoyn_busobject_prop_set_ptr = alljoyn_busobject_prop_set_ptrFn?

public typealias alljoyn_claimcapability_masks = Int

public typealias alljoyn_claimcapabilityadditionalinfo_masks = Int

public typealias alljoyn_credentials = Long

public typealias alljoyn_interfacedescription = Long

public typealias alljoyn_interfacedescription_securitypolicy = Int

public fun interface alljoyn_interfacedescription_translation_callback_ptrFn {
    public operator fun invoke(sourcelanguage: PCSTR, targetlanguage: PCSTR, sourcetext: PCSTR): PCSTR
}

public typealias alljoyn_interfacedescription_translation_callback_ptr = alljoyn_interfacedescription_translation_callback_ptrFn?

public typealias alljoyn_keystore = Long

public typealias alljoyn_keystorelistener = Long

public fun interface alljoyn_keystorelistener_acquireexclusivelock_ptrFn {
    public operator fun invoke(context: Long, listener: alljoyn_keystorelistener): QStatus
}

public typealias alljoyn_keystorelistener_acquireexclusivelock_ptr = alljoyn_keystorelistener_acquireexclusivelock_ptrFn?

public fun interface alljoyn_keystorelistener_loadrequest_ptrFn {
    public operator fun invoke(context: Long, listener: alljoyn_keystorelistener, keystore: alljoyn_keystore): QStatus
}

public typealias alljoyn_keystorelistener_loadrequest_ptr = alljoyn_keystorelistener_loadrequest_ptrFn?

public fun interface alljoyn_keystorelistener_releaseexclusivelock_ptrFn {
    public operator fun invoke(context: Long, listener: alljoyn_keystorelistener)
}

public typealias alljoyn_keystorelistener_releaseexclusivelock_ptr = alljoyn_keystorelistener_releaseexclusivelock_ptrFn?

public fun interface alljoyn_keystorelistener_storerequest_ptrFn {
    public operator fun invoke(context: Long, listener: alljoyn_keystorelistener, keystore: alljoyn_keystore): QStatus
}

public typealias alljoyn_keystorelistener_storerequest_ptr = alljoyn_keystorelistener_storerequest_ptrFn?

public typealias alljoyn_message = Long

public fun interface alljoyn_messagereceiver_methodhandler_ptrFn {
    public operator fun invoke(bus: alljoyn_busobject, member: Long, message: alljoyn_message)
}

public typealias alljoyn_messagereceiver_methodhandler_ptr = alljoyn_messagereceiver_methodhandler_ptrFn?

public fun interface alljoyn_messagereceiver_replyhandler_ptrFn {
    public operator fun invoke(message: alljoyn_message, context: Long)
}

public typealias alljoyn_messagereceiver_replyhandler_ptr = alljoyn_messagereceiver_replyhandler_ptrFn?

public fun interface alljoyn_messagereceiver_signalhandler_ptrFn {
    public operator fun invoke(member: Long, srcpath: PCSTR, message: alljoyn_message)
}

public typealias alljoyn_messagereceiver_signalhandler_ptr = alljoyn_messagereceiver_signalhandler_ptrFn?

public typealias alljoyn_messagetype = Int

public typealias alljoyn_msgarg = Long

public typealias alljoyn_observer = Long

public fun interface alljoyn_observer_object_discovered_ptrFn {
    public operator fun invoke(context: Long, proxyref: alljoyn_proxybusobject_ref)
}

public typealias alljoyn_observer_object_discovered_ptr = alljoyn_observer_object_discovered_ptrFn?

public fun interface alljoyn_observer_object_lost_ptrFn {
    public operator fun invoke(context: Long, proxyref: alljoyn_proxybusobject_ref)
}

public typealias alljoyn_observer_object_lost_ptr = alljoyn_observer_object_lost_ptrFn?

public typealias alljoyn_observerlistener = Long

public typealias alljoyn_permissionconfigurationlistener = Long

public fun interface alljoyn_permissionconfigurationlistener_endmanagement_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_permissionconfigurationlistener_endmanagement_ptr = alljoyn_permissionconfigurationlistener_endmanagement_ptrFn?

public fun interface alljoyn_permissionconfigurationlistener_factoryreset_ptrFn {
    public operator fun invoke(context: Long): QStatus
}

public typealias alljoyn_permissionconfigurationlistener_factoryreset_ptr = alljoyn_permissionconfigurationlistener_factoryreset_ptrFn?

public fun interface alljoyn_permissionconfigurationlistener_policychanged_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_permissionconfigurationlistener_policychanged_ptr = alljoyn_permissionconfigurationlistener_policychanged_ptrFn?

public fun interface alljoyn_permissionconfigurationlistener_startmanagement_ptrFn {
    public operator fun invoke(context: Long)
}

public typealias alljoyn_permissionconfigurationlistener_startmanagement_ptr = alljoyn_permissionconfigurationlistener_startmanagement_ptrFn?

public typealias alljoyn_permissionconfigurator = Long

public typealias alljoyn_pinglistener = Long

public typealias alljoyn_proxybusobject = Long

public fun interface alljoyn_proxybusobject_listener_getallpropertiescb_ptrFn {
    public operator fun invoke(status: QStatus, obj: alljoyn_proxybusobject, values: alljoyn_msgarg, context: Long)
}

public typealias alljoyn_proxybusobject_listener_getallpropertiescb_ptr = alljoyn_proxybusobject_listener_getallpropertiescb_ptrFn?

public fun interface alljoyn_proxybusobject_listener_getpropertycb_ptrFn {
    public operator fun invoke(status: QStatus, obj: alljoyn_proxybusobject, value: alljoyn_msgarg, context: Long)
}

public typealias alljoyn_proxybusobject_listener_getpropertycb_ptr = alljoyn_proxybusobject_listener_getpropertycb_ptrFn?

public fun interface alljoyn_proxybusobject_listener_introspectcb_ptrFn {
    public operator fun invoke(status: QStatus, obj: alljoyn_proxybusobject, context: Long)
}

public typealias alljoyn_proxybusobject_listener_introspectcb_ptr = alljoyn_proxybusobject_listener_introspectcb_ptrFn?

public fun interface alljoyn_proxybusobject_listener_propertieschanged_ptrFn {
    public operator fun invoke(obj: alljoyn_proxybusobject, ifacename: PCSTR, changed: alljoyn_msgarg, invalidated: alljoyn_msgarg, context: Long)
}

public typealias alljoyn_proxybusobject_listener_propertieschanged_ptr = alljoyn_proxybusobject_listener_propertieschanged_ptrFn?

public fun interface alljoyn_proxybusobject_listener_setpropertycb_ptrFn {
    public operator fun invoke(status: QStatus, obj: alljoyn_proxybusobject, context: Long)
}

public typealias alljoyn_proxybusobject_listener_setpropertycb_ptr = alljoyn_proxybusobject_listener_setpropertycb_ptrFn?

public typealias alljoyn_proxybusobject_ref = Long

public typealias alljoyn_securityapplicationproxy = Long

public typealias alljoyn_sessionlistener = Long

public fun interface alljoyn_sessionlistener_sessionlost_ptrFn {
    public operator fun invoke(context: Long, sessionid: UInt, reason: alljoyn_sessionlostreason)
}

public typealias alljoyn_sessionlistener_sessionlost_ptr = alljoyn_sessionlistener_sessionlost_ptrFn?

public fun interface alljoyn_sessionlistener_sessionmemberadded_ptrFn {
    public operator fun invoke(context: Long, sessionid: UInt, uniquename: PCSTR)
}

public typealias alljoyn_sessionlistener_sessionmemberadded_ptr = alljoyn_sessionlistener_sessionmemberadded_ptrFn?

public fun interface alljoyn_sessionlistener_sessionmemberremoved_ptrFn {
    public operator fun invoke(context: Long, sessionid: UInt, uniquename: PCSTR)
}

public typealias alljoyn_sessionlistener_sessionmemberremoved_ptr = alljoyn_sessionlistener_sessionmemberremoved_ptrFn?

public typealias alljoyn_sessionlostreason = Int

public typealias alljoyn_sessionopts = Long

public typealias alljoyn_sessionportlistener = Long

public fun interface alljoyn_sessionportlistener_acceptsessionjoiner_ptrFn {
    public operator fun invoke(context: Long, sessionport: UShort, joiner: PCSTR, opts: alljoyn_sessionopts): Int
}

public typealias alljoyn_sessionportlistener_acceptsessionjoiner_ptr = alljoyn_sessionportlistener_acceptsessionjoiner_ptrFn?

public fun interface alljoyn_sessionportlistener_sessionjoined_ptrFn {
    public operator fun invoke(context: Long, sessionport: UShort, id: UInt, joiner: PCSTR)
}

public typealias alljoyn_sessionportlistener_sessionjoined_ptr = alljoyn_sessionportlistener_sessionjoined_ptrFn?

public typealias alljoyn_typeid = Int
