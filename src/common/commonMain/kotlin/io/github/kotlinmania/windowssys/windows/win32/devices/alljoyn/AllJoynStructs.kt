package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.PCSTR

public data class alljoyn_aboutdatalistener_callbacks(public var about_datalistener_getaboutdata: alljoyn_aboutdatalistener_getaboutdata_ptr = null, public var about_datalistener_getannouncedaboutdata: alljoyn_aboutdatalistener_getannouncedaboutdata_ptr = null)

public data class alljoyn_aboutlistener_callback(public var about_listener_announced: alljoyn_about_announced_ptr = null)

public data class alljoyn_applicationstatelistener_callbacks(public var state: alljoyn_applicationstatelistener_state_ptr = null)

public data class alljoyn_authlistener_callbacks(
    public var request_credentials: alljoyn_authlistener_requestcredentials_ptr = null,
    public var verify_credentials: alljoyn_authlistener_verifycredentials_ptr = null,
    public var security_violation: alljoyn_authlistener_securityviolation_ptr = null,
    public var authentication_complete: alljoyn_authlistener_authenticationcomplete_ptr = null,
)

public data class alljoyn_authlistenerasync_callbacks(
    public var request_credentials: alljoyn_authlistener_requestcredentialsasync_ptr = null,
    public var verify_credentials: alljoyn_authlistener_verifycredentialsasync_ptr = null,
    public var security_violation: alljoyn_authlistener_securityviolation_ptr = null,
    public var authentication_complete: alljoyn_authlistener_authenticationcomplete_ptr = null,
)

public data class alljoyn_buslistener_callbacks(
    public var listener_registered: alljoyn_buslistener_listener_registered_ptr = null,
    public var listener_unregistered: alljoyn_buslistener_listener_unregistered_ptr = null,
    public var found_advertised_name: alljoyn_buslistener_found_advertised_name_ptr = null,
    public var lost_advertised_name: alljoyn_buslistener_lost_advertised_name_ptr = null,
    public var name_owner_changed: alljoyn_buslistener_name_owner_changed_ptr = null,
    public var bus_stopping: alljoyn_buslistener_bus_stopping_ptr = null,
    public var bus_disconnected: alljoyn_buslistener_bus_disconnected_ptr = null,
    public var property_changed: alljoyn_buslistener_bus_prop_changed_ptr = null,
)

public data class alljoyn_busobject_callbacks(
    public var property_get: alljoyn_busobject_prop_get_ptr = null,
    public var property_set: alljoyn_busobject_prop_set_ptr = null,
    public var object_registered: alljoyn_busobject_object_registration_ptr = null,
    public var object_unregistered: alljoyn_busobject_object_registration_ptr = null,
)

public data class alljoyn_busobject_methodentry(public var member: Long = 0L, public var method_handler: alljoyn_messagereceiver_methodhandler_ptr = null)

public data class alljoyn_certificateid(
    public var serial: Long = 0L,
    public var serialLen: ULong = 0uL,
    public var issuerPublicKey: Long = 0L,
    public var issuerAki: Long = 0L,
    public var issuerAkiLen: ULong = 0uL,
)

public data class alljoyn_certificateidarray(public var count: ULong = 0uL, public var ids: Long = 0L)

public data class alljoyn_interfacedescription_member(
    public var iface: alljoyn_interfacedescription = 0L,
    public var memberType: alljoyn_messagetype = 0,
    public var name: PCSTR = 0L,
    public var signature: PCSTR = 0L,
    public var returnSignature: PCSTR = 0L,
    public var argNames: PCSTR = 0L,
    public var internal_member: Long = 0L,
)

public data class alljoyn_interfacedescription_property(
    public var name: PCSTR = 0L,
    public var signature: PCSTR = 0L,
    public var access: UByte = 0u,
    public var internal_property: Long = 0L,
)

public data class alljoyn_keystorelistener_callbacks(public var load_request: alljoyn_keystorelistener_loadrequest_ptr = null, public var store_request: alljoyn_keystorelistener_storerequest_ptr = null)

public data class alljoyn_keystorelistener_with_synchronization_callbacks(
    public var load_request: alljoyn_keystorelistener_loadrequest_ptr = null,
    public var store_request: alljoyn_keystorelistener_storerequest_ptr = null,
    public var acquire_exclusive_lock: alljoyn_keystorelistener_acquireexclusivelock_ptr = null,
    public var release_exclusive_lock: alljoyn_keystorelistener_releaseexclusivelock_ptr = null,
)

public data class alljoyn_manifestarray(public var count: ULong = 0uL, public var xmls: Long = 0L)

public data class alljoyn_observerlistener_callback(public var object_discovered: alljoyn_observer_object_discovered_ptr = null, public var object_lost: alljoyn_observer_object_lost_ptr = null)

public data class alljoyn_permissionconfigurationlistener_callbacks(
    public var factory_reset: alljoyn_permissionconfigurationlistener_factoryreset_ptr = null,
    public var policy_changed: alljoyn_permissionconfigurationlistener_policychanged_ptr = null,
    public var start_management: alljoyn_permissionconfigurationlistener_startmanagement_ptr = null,
    public var end_management: alljoyn_permissionconfigurationlistener_endmanagement_ptr = null,
)

public data class alljoyn_pinglistener_callback(public var destination_found: alljoyn_autopinger_destination_found_ptr = null, public var destination_lost: alljoyn_autopinger_destination_lost_ptr = null)

public data class alljoyn_sessionlistener_callbacks(
    public var session_lost: alljoyn_sessionlistener_sessionlost_ptr = null,
    public var session_member_added: alljoyn_sessionlistener_sessionmemberadded_ptr = null,
    public var session_member_removed: alljoyn_sessionlistener_sessionmemberremoved_ptr = null,
)

public data class alljoyn_sessionportlistener_callbacks(public var accept_session_joiner: alljoyn_sessionportlistener_acceptsessionjoiner_ptr = null, public var session_joined: alljoyn_sessionportlistener_sessionjoined_ptr = null)
