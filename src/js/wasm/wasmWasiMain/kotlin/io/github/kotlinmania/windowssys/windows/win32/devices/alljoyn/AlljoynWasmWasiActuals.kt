@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun AllJoynAcceptBusConnection(serverbushandle: HANDLE, abortevent: HANDLE): UInt =
    0u

public actual fun AllJoynCloseBusHandle(bushandle: HANDLE): BOOL =
    0

public actual fun AllJoynConnectToBus(connectionspec: PCWSTR): HANDLE =
    0L

public actual fun AllJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: Long): HANDLE =
    0L

public actual fun AllJoynEnumEvents(connectedbushandle: HANDLE, eventtoreset: HANDLE, eventtypes: Long): BOOL =
    0

public actual fun AllJoynEventSelect(connectedbushandle: HANDLE, eventhandle: HANDLE, eventtypes: UInt): BOOL =
    0

public actual fun AllJoynReceiveFromBus(connectedbushandle: HANDLE, buffer: Long, bytestoread: UInt, bytestransferred: Long, reserved: Long): BOOL =
    0

public actual fun AllJoynSendToBus(connectedbushandle: HANDLE, buffer: Long, bytestowrite: UInt, bytestransferred: Long, reserved: Long): BOOL =
    0

public actual fun QCC_StatusText(status: QStatus): PCSTR =
    0L

public actual fun alljoyn_aboutdata_create(defaultlanguage: PCSTR): alljoyn_aboutdata =
    0L

public actual fun alljoyn_aboutdata_create_empty(): alljoyn_aboutdata =
    0L

public actual fun alljoyn_aboutdata_create_full(arg: alljoyn_msgarg, language: PCSTR): alljoyn_aboutdata =
    0L

public actual fun alljoyn_aboutdata_createfrommsgarg(data: alljoyn_aboutdata, arg: alljoyn_msgarg, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_createfromxml(data: alljoyn_aboutdata, aboutdataxml: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_destroy(data: alljoyn_aboutdata) {
}

public actual fun alljoyn_aboutdata_getaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_getajsoftwareversion(data: alljoyn_aboutdata, ajsoftwareversion: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getannouncedaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_aboutdata_getappid(data: alljoyn_aboutdata, appid: Long, num: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getappname(data: alljoyn_aboutdata, appname: Long, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_getdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getdescription(data: alljoyn_aboutdata, description: Long, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_getdeviceid(data: alljoyn_aboutdata, deviceid: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getdevicename(data: alljoyn_aboutdata, devicename: Long, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_getfield(data: alljoyn_aboutdata, name: PCSTR, value: Long, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_getfields(data: alljoyn_aboutdata, fields: Long, num_fields: ULong): ULong =
    0uL

public actual fun alljoyn_aboutdata_getfieldsignature(data: alljoyn_aboutdata, fieldname: PCSTR): PCSTR =
    0L

public actual fun alljoyn_aboutdata_gethardwareversion(data: alljoyn_aboutdata, hardwareversion: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getmanufacturer(data: alljoyn_aboutdata, manufacturer: Long, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_getmodelnumber(data: alljoyn_aboutdata, modelnumber: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getsoftwareversion(data: alljoyn_aboutdata, softwareversion: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_getsupportedlanguages(data: alljoyn_aboutdata, languagetags: Long, num: ULong): ULong =
    0uL

public actual fun alljoyn_aboutdata_getsupporturl(data: alljoyn_aboutdata, supporturl: Long): QStatus =
    0

public actual fun alljoyn_aboutdata_isfieldannounced(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutdata_isfieldlocalized(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutdata_isfieldrequired(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutdata_isvalid(data: alljoyn_aboutdata, language: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutdata_setappid(data: alljoyn_aboutdata, appid: Long, num: ULong): QStatus =
    0

public actual fun alljoyn_aboutdata_setappid_fromstring(data: alljoyn_aboutdata, appid: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setappname(data: alljoyn_aboutdata, appname: PCSTR, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setdescription(data: alljoyn_aboutdata, description: PCSTR, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setdeviceid(data: alljoyn_aboutdata, deviceid: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setdevicename(data: alljoyn_aboutdata, devicename: PCSTR, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setfield(data: alljoyn_aboutdata, name: PCSTR, value: alljoyn_msgarg, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_sethardwareversion(data: alljoyn_aboutdata, hardwareversion: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setmanufacturer(data: alljoyn_aboutdata, manufacturer: PCSTR, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setmodelnumber(data: alljoyn_aboutdata, modelnumber: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setsoftwareversion(data: alljoyn_aboutdata, softwareversion: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setsupportedlanguage(data: alljoyn_aboutdata, language: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdata_setsupporturl(data: alljoyn_aboutdata, supporturl: PCSTR): QStatus =
    0

public actual fun alljoyn_aboutdatalistener_create(callbacks: Long, context: Long): alljoyn_aboutdatalistener =
    0L

public actual fun alljoyn_aboutdatalistener_destroy(listener: alljoyn_aboutdatalistener) {
}

public actual fun alljoyn_abouticon_clear(icon: alljoyn_abouticon) {
}

public actual fun alljoyn_abouticon_create(): alljoyn_abouticon =
    0L

public actual fun alljoyn_abouticon_destroy(icon: alljoyn_abouticon) {
}

public actual fun alljoyn_abouticon_getcontent(icon: alljoyn_abouticon, data: Long, size: Long) {
}

public actual fun alljoyn_abouticon_geturl(icon: alljoyn_abouticon, type: Long, url: Long) {
}

public actual fun alljoyn_abouticon_setcontent(icon: alljoyn_abouticon, type: PCSTR, data: Long, csize: ULong, ownsdata: UByte): QStatus =
    0

public actual fun alljoyn_abouticon_setcontent_frommsgarg(icon: alljoyn_abouticon, arg: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_abouticon_seturl(icon: alljoyn_abouticon, type: PCSTR, url: PCSTR): QStatus =
    0

public actual fun alljoyn_abouticonobj_create(bus: alljoyn_busattachment, icon: alljoyn_abouticon): alljoyn_abouticonobj =
    0L

public actual fun alljoyn_abouticonobj_destroy(icon: alljoyn_abouticonobj) {
}

public actual fun alljoyn_abouticonproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_abouticonproxy =
    0L

public actual fun alljoyn_abouticonproxy_destroy(proxy: alljoyn_abouticonproxy) {
}

public actual fun alljoyn_abouticonproxy_geticon(proxy: alljoyn_abouticonproxy, icon: alljoyn_abouticon): QStatus =
    0

public actual fun alljoyn_abouticonproxy_getversion(proxy: alljoyn_abouticonproxy, version: Long): QStatus =
    0

public actual fun alljoyn_aboutlistener_create(callback: Long, context: Long): alljoyn_aboutlistener =
    0L

public actual fun alljoyn_aboutlistener_destroy(listener: alljoyn_aboutlistener) {
}

public actual fun alljoyn_aboutobj_announce(obj: alljoyn_aboutobj, sessionport: UShort, aboutdata: alljoyn_aboutdata): QStatus =
    0

public actual fun alljoyn_aboutobj_announce_using_datalistener(obj: alljoyn_aboutobj, sessionport: UShort, aboutlistener: alljoyn_aboutdatalistener): QStatus =
    0

public actual fun alljoyn_aboutobj_create(bus: alljoyn_busattachment, isannounced: alljoyn_about_announceflag): alljoyn_aboutobj =
    0L

public actual fun alljoyn_aboutobj_destroy(obj: alljoyn_aboutobj) {
}

public actual fun alljoyn_aboutobj_unannounce(obj: alljoyn_aboutobj): QStatus =
    0

public actual fun alljoyn_aboutobjectdescription_clear(description: alljoyn_aboutobjectdescription) {
}

public actual fun alljoyn_aboutobjectdescription_create(): alljoyn_aboutobjectdescription =
    0L

public actual fun alljoyn_aboutobjectdescription_create_full(arg: alljoyn_msgarg): alljoyn_aboutobjectdescription =
    0L

public actual fun alljoyn_aboutobjectdescription_createfrommsgarg(description: alljoyn_aboutobjectdescription, arg: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_aboutobjectdescription_destroy(description: alljoyn_aboutobjectdescription) {
}

public actual fun alljoyn_aboutobjectdescription_getinterfacepaths(description: alljoyn_aboutobjectdescription, interfacename: PCSTR, paths: Long, numpaths: ULong): ULong =
    0uL

public actual fun alljoyn_aboutobjectdescription_getinterfaces(description: alljoyn_aboutobjectdescription, path: PCSTR, interfaces: Long, numinterfaces: ULong): ULong =
    0uL

public actual fun alljoyn_aboutobjectdescription_getmsgarg(description: alljoyn_aboutobjectdescription, msgarg: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_aboutobjectdescription_getpaths(description: alljoyn_aboutobjectdescription, paths: Long, numpaths: ULong): ULong =
    0uL

public actual fun alljoyn_aboutobjectdescription_hasinterface(description: alljoyn_aboutobjectdescription, interfacename: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutobjectdescription_hasinterfaceatpath(description: alljoyn_aboutobjectdescription, path: PCSTR, interfacename: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutobjectdescription_haspath(description: alljoyn_aboutobjectdescription, path: PCSTR): UByte =
    0u

public actual fun alljoyn_aboutproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_aboutproxy =
    0L

public actual fun alljoyn_aboutproxy_destroy(proxy: alljoyn_aboutproxy) {
}

public actual fun alljoyn_aboutproxy_getaboutdata(proxy: alljoyn_aboutproxy, language: PCSTR, data: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_aboutproxy_getobjectdescription(proxy: alljoyn_aboutproxy, objectdesc: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_aboutproxy_getversion(proxy: alljoyn_aboutproxy, version: Long): QStatus =
    0

public actual fun alljoyn_applicationstatelistener_create(callbacks: Long, context: Long): alljoyn_applicationstatelistener =
    0L

public actual fun alljoyn_applicationstatelistener_destroy(listener: alljoyn_applicationstatelistener) {
}

public actual fun alljoyn_authlistener_create(callbacks: Long, context: Long): alljoyn_authlistener =
    0L

public actual fun alljoyn_authlistener_destroy(listener: alljoyn_authlistener) {
}

public actual fun alljoyn_authlistener_requestcredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int, credentials: alljoyn_credentials): QStatus =
    0

public actual fun alljoyn_authlistener_setsharedsecret(listener: alljoyn_authlistener, sharedsecret: Long, sharedsecretsize: ULong): QStatus =
    0

public actual fun alljoyn_authlistener_verifycredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int): QStatus =
    0

public actual fun alljoyn_authlistenerasync_create(callbacks: Long, context: Long): alljoyn_authlistener =
    0L

public actual fun alljoyn_authlistenerasync_destroy(listener: alljoyn_authlistener) {
}

public actual fun alljoyn_autopinger_adddestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR): QStatus =
    0

public actual fun alljoyn_autopinger_addpinggroup(autopinger: alljoyn_autopinger, group: PCSTR, listener: alljoyn_pinglistener, pinginterval: UInt) {
}

public actual fun alljoyn_autopinger_create(bus: alljoyn_busattachment): alljoyn_autopinger =
    0L

public actual fun alljoyn_autopinger_destroy(autopinger: alljoyn_autopinger) {
}

public actual fun alljoyn_autopinger_pause(autopinger: alljoyn_autopinger) {
}

public actual fun alljoyn_autopinger_removedestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR, removeall: Int): QStatus =
    0

public actual fun alljoyn_autopinger_removepinggroup(autopinger: alljoyn_autopinger, group: PCSTR) {
}

public actual fun alljoyn_autopinger_resume(autopinger: alljoyn_autopinger) {
}

public actual fun alljoyn_autopinger_setpinginterval(autopinger: alljoyn_autopinger, group: PCSTR, pinginterval: UInt): QStatus =
    0

public actual fun alljoyn_busattachment_addlogonentry(bus: alljoyn_busattachment, authmechanism: PCSTR, username: PCSTR, password: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_addmatch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_advertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    0

public actual fun alljoyn_busattachment_bindsessionport(bus: alljoyn_busattachment, sessionport: Long, opts: alljoyn_sessionopts, listener: alljoyn_sessionportlistener): QStatus =
    0

public actual fun alljoyn_busattachment_canceladvertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    0

public actual fun alljoyn_busattachment_cancelfindadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_cancelfindadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    0

public actual fun alljoyn_busattachment_cancelwhoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_cancelwhoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    0

public actual fun alljoyn_busattachment_clearkeys(bus: alljoyn_busattachment, guid: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_clearkeystore(bus: alljoyn_busattachment) {
}

public actual fun alljoyn_busattachment_connect(bus: alljoyn_busattachment, connectspec: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_create(applicationname: PCSTR, allowremotemessages: Int): alljoyn_busattachment =
    0L

public actual fun alljoyn_busattachment_create_concurrency(applicationname: PCSTR, allowremotemessages: Int, concurrency: UInt): alljoyn_busattachment =
    0L

public actual fun alljoyn_busattachment_createinterface(bus: alljoyn_busattachment, name: PCSTR, iface: Long): QStatus =
    0

public actual fun alljoyn_busattachment_createinterface_secure(bus: alljoyn_busattachment, name: PCSTR, iface: Long, secpolicy: alljoyn_interfacedescription_securitypolicy): QStatus =
    0

public actual fun alljoyn_busattachment_createinterfacesfromxml(bus: alljoyn_busattachment, xml: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_deletedefaultkeystore(applicationname: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_deleteinterface(bus: alljoyn_busattachment, iface: alljoyn_interfacedescription): QStatus =
    0

public actual fun alljoyn_busattachment_destroy(bus: alljoyn_busattachment) {
}

public actual fun alljoyn_busattachment_disconnect(bus: alljoyn_busattachment, unused: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_enableconcurrentcallbacks(bus: alljoyn_busattachment) {
}

public actual fun alljoyn_busattachment_enablepeersecurity(bus: alljoyn_busattachment, authmechanisms: PCSTR, listener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int): QStatus =
    0

public actual fun alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus: alljoyn_busattachment, authmechanisms: PCSTR, authlistener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int, permissionconfigurationlistener: alljoyn_permissionconfigurationlistener): QStatus =
    0

public actual fun alljoyn_busattachment_findadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_findadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    0

public actual fun alljoyn_busattachment_getalljoyndebugobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_busattachment_getalljoynproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_busattachment_getconcurrency(bus: alljoyn_busattachment): UInt =
    0u

public actual fun alljoyn_busattachment_getconnectspec(bus: alljoyn_busattachment): PCSTR =
    0L

public actual fun alljoyn_busattachment_getdbusproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_busattachment_getglobalguidstring(bus: alljoyn_busattachment): PCSTR =
    0L

public actual fun alljoyn_busattachment_getinterface(bus: alljoyn_busattachment, name: PCSTR): alljoyn_interfacedescription =
    0L

public actual fun alljoyn_busattachment_getinterfaces(bus: alljoyn_busattachment, ifaces: Long, numifaces: ULong): ULong =
    0uL

public actual fun alljoyn_busattachment_getkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: Long): QStatus =
    0

public actual fun alljoyn_busattachment_getpeerguid(bus: alljoyn_busattachment, name: PCSTR, guid: PCSTR, guidsz: Long): QStatus =
    0

public actual fun alljoyn_busattachment_getpermissionconfigurator(bus: alljoyn_busattachment): alljoyn_permissionconfigurator =
    0L

public actual fun alljoyn_busattachment_gettimestamp(): UInt =
    0u

public actual fun alljoyn_busattachment_getuniquename(bus: alljoyn_busattachment): PCSTR =
    0L

public actual fun alljoyn_busattachment_isconnected(bus: alljoyn_busattachment): Int =
    0

public actual fun alljoyn_busattachment_ispeersecurityenabled(bus: alljoyn_busattachment): Int =
    0

public actual fun alljoyn_busattachment_isstarted(bus: alljoyn_busattachment): Int =
    0

public actual fun alljoyn_busattachment_isstopping(bus: alljoyn_busattachment): Int =
    0

public actual fun alljoyn_busattachment_join(bus: alljoyn_busattachment): QStatus =
    0

public actual fun alljoyn_busattachment_joinsession(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, sessionid: Long, opts: alljoyn_sessionopts): QStatus =
    0

public actual fun alljoyn_busattachment_joinsessionasync(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, opts: alljoyn_sessionopts, callback: alljoyn_busattachment_joinsessioncb_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_busattachment_leavesession(bus: alljoyn_busattachment, sessionid: UInt): QStatus =
    0

public actual fun alljoyn_busattachment_namehasowner(bus: alljoyn_busattachment, name: PCSTR, hasowner: Long): QStatus =
    0

public actual fun alljoyn_busattachment_ping(bus: alljoyn_busattachment, name: PCSTR, timeout: UInt): QStatus =
    0

public actual fun alljoyn_busattachment_registeraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
}

public actual fun alljoyn_busattachment_registerapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    0

public actual fun alljoyn_busattachment_registerbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
}

public actual fun alljoyn_busattachment_registerbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    0

public actual fun alljoyn_busattachment_registerbusobject_secure(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    0

public actual fun alljoyn_busattachment_registerkeystorelistener(bus: alljoyn_busattachment, listener: alljoyn_keystorelistener): QStatus =
    0

public actual fun alljoyn_busattachment_registersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_registersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_releasename(bus: alljoyn_busattachment, name: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_reloadkeystore(bus: alljoyn_busattachment): QStatus =
    0

public actual fun alljoyn_busattachment_removematch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_removesessionmember(bus: alljoyn_busattachment, sessionid: UInt, membername: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_requestname(bus: alljoyn_busattachment, requestedname: PCSTR, flags: UInt): QStatus =
    0

public actual fun alljoyn_busattachment_secureconnection(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    0

public actual fun alljoyn_busattachment_secureconnectionasync(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    0

public actual fun alljoyn_busattachment_setdaemondebug(bus: alljoyn_busattachment, module: PCSTR, level: UInt): QStatus =
    0

public actual fun alljoyn_busattachment_setkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: UInt): QStatus =
    0

public actual fun alljoyn_busattachment_setlinktimeout(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: Long): QStatus =
    0

public actual fun alljoyn_busattachment_setlinktimeoutasync(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: UInt, callback: alljoyn_busattachment_setlinktimeoutcb_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_busattachment_setsessionlistener(bus: alljoyn_busattachment, sessionid: UInt, listener: alljoyn_sessionlistener): QStatus =
    0

public actual fun alljoyn_busattachment_start(bus: alljoyn_busattachment): QStatus =
    0

public actual fun alljoyn_busattachment_stop(bus: alljoyn_busattachment): QStatus =
    0

public actual fun alljoyn_busattachment_unbindsessionport(bus: alljoyn_busattachment, sessionport: UShort): QStatus =
    0

public actual fun alljoyn_busattachment_unregisteraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
}

public actual fun alljoyn_busattachment_unregisterallaboutlisteners(bus: alljoyn_busattachment) {
}

public actual fun alljoyn_busattachment_unregisterallhandlers(bus: alljoyn_busattachment): QStatus =
    0

public actual fun alljoyn_busattachment_unregisterapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    0

public actual fun alljoyn_busattachment_unregisterbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
}

public actual fun alljoyn_busattachment_unregisterbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject) {
}

public actual fun alljoyn_busattachment_unregistersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_unregistersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_whoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_whoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    0

public actual fun alljoyn_buslistener_create(callbacks: Long, context: Long): alljoyn_buslistener =
    0L

public actual fun alljoyn_buslistener_destroy(listener: alljoyn_buslistener) {
}

public actual fun alljoyn_busobject_addinterface(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    0

public actual fun alljoyn_busobject_addinterface_announced(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    0

public actual fun alljoyn_busobject_addmethodhandler(bus: alljoyn_busobject, member: alljoyn_interfacedescription_member, handler: alljoyn_messagereceiver_methodhandler_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_busobject_addmethodhandlers(bus: alljoyn_busobject, entries: Long, numentries: ULong): QStatus =
    0

public actual fun alljoyn_busobject_cancelsessionlessmessage(bus: alljoyn_busobject, msg: alljoyn_message): QStatus =
    0

public actual fun alljoyn_busobject_cancelsessionlessmessage_serial(bus: alljoyn_busobject, serialnumber: UInt): QStatus =
    0

public actual fun alljoyn_busobject_create(path: PCSTR, isplaceholder: Int, callbacks_in: Long, context_in: Long): alljoyn_busobject =
    0L

public actual fun alljoyn_busobject_destroy(bus: alljoyn_busobject) {
}

public actual fun alljoyn_busobject_emitpropertieschanged(bus: alljoyn_busobject, ifcname: PCSTR, propnames: Long, numprops: ULong, id: UInt) {
}

public actual fun alljoyn_busobject_emitpropertychanged(bus: alljoyn_busobject, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg, id: UInt) {
}

public actual fun alljoyn_busobject_getannouncedinterfacenames(bus: alljoyn_busobject, interfaces: Long, numinterfaces: ULong): ULong =
    0uL

public actual fun alljoyn_busobject_getbusattachment(bus: alljoyn_busobject): alljoyn_busattachment =
    0L

public actual fun alljoyn_busobject_getname(bus: alljoyn_busobject, buffer: PCSTR, buffersz: ULong): ULong =
    0uL

public actual fun alljoyn_busobject_getpath(bus: alljoyn_busobject): PCSTR =
    0L

public actual fun alljoyn_busobject_issecure(bus: alljoyn_busobject): Int =
    0

public actual fun alljoyn_busobject_methodreply_args(bus: alljoyn_busobject, msg: alljoyn_message, args: alljoyn_msgarg, numargs: ULong): QStatus =
    0

public actual fun alljoyn_busobject_methodreply_err(bus: alljoyn_busobject, msg: alljoyn_message, error: PCSTR, errormessage: PCSTR): QStatus =
    0

public actual fun alljoyn_busobject_methodreply_status(bus: alljoyn_busobject, msg: alljoyn_message, status: QStatus): QStatus =
    0

public actual fun alljoyn_busobject_setannounceflag(bus: alljoyn_busobject, iface: alljoyn_interfacedescription, isannounced: alljoyn_about_announceflag): QStatus =
    0

public actual fun alljoyn_busobject_signal(bus: alljoyn_busobject, destination: PCSTR, sessionid: UInt, signal: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: alljoyn_message): QStatus =
    0

public actual fun alljoyn_credentials_clear(cred: alljoyn_credentials) {
}

public actual fun alljoyn_credentials_create(): alljoyn_credentials =
    0L

public actual fun alljoyn_credentials_destroy(cred: alljoyn_credentials) {
}

public actual fun alljoyn_credentials_getcertchain(cred: alljoyn_credentials): PCSTR =
    0L

public actual fun alljoyn_credentials_getexpiration(cred: alljoyn_credentials): UInt =
    0u

public actual fun alljoyn_credentials_getlogonentry(cred: alljoyn_credentials): PCSTR =
    0L

public actual fun alljoyn_credentials_getpassword(cred: alljoyn_credentials): PCSTR =
    0L

public actual fun alljoyn_credentials_getprivateKey(cred: alljoyn_credentials): PCSTR =
    0L

public actual fun alljoyn_credentials_getusername(cred: alljoyn_credentials): PCSTR =
    0L

public actual fun alljoyn_credentials_isset(cred: alljoyn_credentials, creds: UShort): Int =
    0

public actual fun alljoyn_credentials_setcertchain(cred: alljoyn_credentials, certchain: PCSTR) {
}

public actual fun alljoyn_credentials_setexpiration(cred: alljoyn_credentials, expiration: UInt) {
}

public actual fun alljoyn_credentials_setlogonentry(cred: alljoyn_credentials, logonentry: PCSTR) {
}

public actual fun alljoyn_credentials_setpassword(cred: alljoyn_credentials, pwd: PCSTR) {
}

public actual fun alljoyn_credentials_setprivatekey(cred: alljoyn_credentials, pk: PCSTR) {
}

public actual fun alljoyn_credentials_setusername(cred: alljoyn_credentials, username: PCSTR) {
}

public actual fun alljoyn_getbuildinfo(): PCSTR =
    0L

public actual fun alljoyn_getnumericversion(): UInt =
    0u

public actual fun alljoyn_getversion(): PCSTR =
    0L

public actual fun alljoyn_init(): QStatus =
    0

public actual fun alljoyn_interfacedescription_activate(iface: alljoyn_interfacedescription) {
}

public actual fun alljoyn_interfacedescription_addannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_addargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_addmember(iface: alljoyn_interfacedescription, type: alljoyn_messagetype, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte): QStatus =
    0

public actual fun alljoyn_interfacedescription_addmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_addmethod(iface: alljoyn_interfacedescription, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_addproperty(iface: alljoyn_interfacedescription, name: PCSTR, signature: PCSTR, access: UByte): QStatus =
    0

public actual fun alljoyn_interfacedescription_addpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_addsignal(iface: alljoyn_interfacedescription, name: PCSTR, sig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_eql(one: alljoyn_interfacedescription, other: alljoyn_interfacedescription): Int =
    0

public actual fun alljoyn_interfacedescription_getannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR, value_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getannotationatindex(iface: alljoyn_interfacedescription, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
}

public actual fun alljoyn_interfacedescription_getannotationscount(iface: alljoyn_interfacedescription): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getdescriptionlanguages(iface: alljoyn_interfacedescription, languages: Long, size: ULong): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getdescriptionlanguages2(iface: alljoyn_interfacedescription, languages: PCSTR, languagessize: ULong): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getdescriptiontranslationcallback(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_translation_callback_ptr =
    null

public actual fun alljoyn_interfacedescription_getmember(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getmemberargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getmembers(iface: alljoyn_interfacedescription, members: Long, nummembers: ULong): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getmethod(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getname(iface: alljoyn_interfacedescription): PCSTR =
    0L

public actual fun alljoyn_interfacedescription_getproperties(iface: alljoyn_interfacedescription, props: Long, numprops: ULong): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getproperty(iface: alljoyn_interfacedescription, name: PCSTR, property: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR, str_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, property: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    0uL

public actual fun alljoyn_interfacedescription_getsecuritypolicy(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_securitypolicy =
    0

public actual fun alljoyn_interfacedescription_getsignal(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    0

public actual fun alljoyn_interfacedescription_hasdescription(iface: alljoyn_interfacedescription): Int =
    0

public actual fun alljoyn_interfacedescription_hasmember(iface: alljoyn_interfacedescription, name: PCSTR, insig: PCSTR, outsig: PCSTR): Int =
    0

public actual fun alljoyn_interfacedescription_hasproperties(iface: alljoyn_interfacedescription): Int =
    0

public actual fun alljoyn_interfacedescription_hasproperty(iface: alljoyn_interfacedescription, name: PCSTR): Int =
    0

public actual fun alljoyn_interfacedescription_introspect(iface: alljoyn_interfacedescription, str: PCSTR, buf: ULong, indent: ULong): ULong =
    0uL

public actual fun alljoyn_interfacedescription_issecure(iface: alljoyn_interfacedescription): Int =
    0

public actual fun alljoyn_interfacedescription_member_eql(one: alljoyn_interfacedescription_member, other: alljoyn_interfacedescription_member): Int =
    0

public actual fun alljoyn_interfacedescription_member_getannotation(member: alljoyn_interfacedescription_member, name: PCSTR, value: PCSTR, value_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_member_getannotationatindex(member: alljoyn_interfacedescription_member, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
}

public actual fun alljoyn_interfacedescription_member_getannotationscount(member: alljoyn_interfacedescription_member): ULong =
    0uL

public actual fun alljoyn_interfacedescription_member_getargannotation(member: alljoyn_interfacedescription_member, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_member_getargannotationatindex(member: alljoyn_interfacedescription_member, argname: PCSTR, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
}

public actual fun alljoyn_interfacedescription_member_getargannotationscount(member: alljoyn_interfacedescription_member, argname: PCSTR): ULong =
    0uL

public actual fun alljoyn_interfacedescription_property_eql(one: alljoyn_interfacedescription_property, other: alljoyn_interfacedescription_property): Int =
    0

public actual fun alljoyn_interfacedescription_property_getannotation(property: alljoyn_interfacedescription_property, name: PCSTR, value: PCSTR, value_size: Long): Int =
    0

public actual fun alljoyn_interfacedescription_property_getannotationatindex(property: alljoyn_interfacedescription_property, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
}

public actual fun alljoyn_interfacedescription_property_getannotationscount(property: alljoyn_interfacedescription_property): ULong =
    0uL

public actual fun alljoyn_interfacedescription_setargdescription(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, description: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_setargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_setdescription(iface: alljoyn_interfacedescription, description: PCSTR) {
}

public actual fun alljoyn_interfacedescription_setdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, languagetag: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_setdescriptionlanguage(iface: alljoyn_interfacedescription, language: PCSTR) {
}

public actual fun alljoyn_interfacedescription_setdescriptiontranslationcallback(iface: alljoyn_interfacedescription, translationcallback: alljoyn_interfacedescription_translation_callback_ptr) {
}

public actual fun alljoyn_interfacedescription_setmemberdescription(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_setpropertydescription(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR): QStatus =
    0

public actual fun alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    0

public actual fun alljoyn_keystorelistener_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    0L

public actual fun alljoyn_keystorelistener_destroy(listener: alljoyn_keystorelistener) {
}

public actual fun alljoyn_keystorelistener_getkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, sink: PCSTR, sink_sz: Long): QStatus =
    0

public actual fun alljoyn_keystorelistener_putkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, source: PCSTR, password: PCSTR): QStatus =
    0

public actual fun alljoyn_keystorelistener_with_synchronization_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    0L

public actual fun alljoyn_message_create(bus: alljoyn_busattachment): alljoyn_message =
    0L

public actual fun alljoyn_message_description(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    0uL

public actual fun alljoyn_message_destroy(msg: alljoyn_message) {
}

public actual fun alljoyn_message_eql(one: alljoyn_message, other: alljoyn_message): Int =
    0

public actual fun alljoyn_message_getarg(msg: alljoyn_message, argn: ULong): alljoyn_msgarg =
    0L

public actual fun alljoyn_message_getargs(msg: alljoyn_message, numargs: Long, args: Long) {
}

public actual fun alljoyn_message_getauthmechanism(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_getcallserial(msg: alljoyn_message): UInt =
    0u

public actual fun alljoyn_message_getcompressiontoken(msg: alljoyn_message): UInt =
    0u

public actual fun alljoyn_message_getdestination(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_geterrorname(msg: alljoyn_message, errormessage: PCSTR, errormessage_size: Long): PCSTR =
    0L

public actual fun alljoyn_message_getflags(msg: alljoyn_message): UByte =
    0u

public actual fun alljoyn_message_getinterface(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_getmembername(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_getobjectpath(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_getreceiveendpointname(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_getreplyserial(msg: alljoyn_message): UInt =
    0u

public actual fun alljoyn_message_getsender(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_getsessionid(msg: alljoyn_message): UInt =
    0u

public actual fun alljoyn_message_getsignature(msg: alljoyn_message): PCSTR =
    0L

public actual fun alljoyn_message_gettimestamp(msg: alljoyn_message): UInt =
    0u

public actual fun alljoyn_message_gettype(msg: alljoyn_message): alljoyn_messagetype =
    0

public actual fun alljoyn_message_isbroadcastsignal(msg: alljoyn_message): Int =
    0

public actual fun alljoyn_message_isencrypted(msg: alljoyn_message): Int =
    0

public actual fun alljoyn_message_isexpired(msg: alljoyn_message, tillexpirems: Long): Int =
    0

public actual fun alljoyn_message_isglobalbroadcast(msg: alljoyn_message): Int =
    0

public actual fun alljoyn_message_issessionless(msg: alljoyn_message): Int =
    0

public actual fun alljoyn_message_isunreliable(msg: alljoyn_message): Int =
    0

public actual fun alljoyn_message_parseargs(msg: alljoyn_message, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_message_setendianess(endian: Byte) {
}

public actual fun alljoyn_message_tostring(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    0uL

public actual fun alljoyn_msgarg_array_create(size: ULong): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_array_element(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_array_get(args: alljoyn_msgarg, numargs: ULong, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set(args: alljoyn_msgarg, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set_offset(args: alljoyn_msgarg, argoffset: ULong, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_signature(values: alljoyn_msgarg, numvalues: ULong, str: PCSTR, buf: ULong): ULong =
    0uL

public actual fun alljoyn_msgarg_array_tostring(args: alljoyn_msgarg, numargs: ULong, str: PCSTR, buf: ULong, indent: ULong): ULong =
    0uL

public actual fun alljoyn_msgarg_clear(arg: alljoyn_msgarg) {
}

public actual fun alljoyn_msgarg_clone(destination: alljoyn_msgarg, source: alljoyn_msgarg) {
}

public actual fun alljoyn_msgarg_copy(source: alljoyn_msgarg): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_create(): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_create_and_set(signature: PCSTR): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_destroy(arg: alljoyn_msgarg) {
}

public actual fun alljoyn_msgarg_equal(lhv: alljoyn_msgarg, rhv: alljoyn_msgarg): Int =
    0

public actual fun alljoyn_msgarg_get(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_get_array_element(arg: alljoyn_msgarg, index: ULong, element: Long) {
}

public actual fun alljoyn_msgarg_get_array_elementsignature(arg: alljoyn_msgarg, index: ULong): PCSTR =
    0L

public actual fun alljoyn_msgarg_get_array_numberofelements(arg: alljoyn_msgarg): ULong =
    0uL

public actual fun alljoyn_msgarg_get_bool(arg: alljoyn_msgarg, b: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_bool_array(arg: alljoyn_msgarg, length: Long, ab: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_double(arg: alljoyn_msgarg, d: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_double_array(arg: alljoyn_msgarg, length: Long, ad: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_int16(arg: alljoyn_msgarg, n: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_int16_array(arg: alljoyn_msgarg, length: Long, an: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_int32(arg: alljoyn_msgarg, i: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_int32_array(arg: alljoyn_msgarg, length: Long, ai: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_int64_array(arg: alljoyn_msgarg, length: Long, ax: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_objectpath(arg: alljoyn_msgarg, o: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_signature(arg: alljoyn_msgarg, g: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_string(arg: alljoyn_msgarg, s: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint16(arg: alljoyn_msgarg, q: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint16_array(arg: alljoyn_msgarg, length: Long, aq: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint32(arg: alljoyn_msgarg, u: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint32_array(arg: alljoyn_msgarg, length: Long, au: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint64(arg: alljoyn_msgarg, t: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint64_array(arg: alljoyn_msgarg, length: Long, at: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint8(arg: alljoyn_msgarg, y: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_uint8_array(arg: alljoyn_msgarg, length: Long, ay: Long): QStatus =
    0

public actual fun alljoyn_msgarg_get_variant(arg: alljoyn_msgarg, v: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_msgarg_get_variant_array(arg: alljoyn_msgarg, signature: PCSTR, length: Long, av: Long): QStatus =
    0

public actual fun alljoyn_msgarg_getdictelement(arg: alljoyn_msgarg, elemsig: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_getkey(arg: alljoyn_msgarg): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_getmember(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_getnummembers(arg: alljoyn_msgarg): ULong =
    0uL

public actual fun alljoyn_msgarg_gettype(arg: alljoyn_msgarg): alljoyn_typeid =
    0

public actual fun alljoyn_msgarg_getvalue(arg: alljoyn_msgarg): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_hassignature(arg: alljoyn_msgarg, signature: PCSTR): Int =
    0

public actual fun alljoyn_msgarg_set(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_and_stabilize(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_bool(arg: alljoyn_msgarg, b: Int): QStatus =
    0

public actual fun alljoyn_msgarg_set_bool_array(arg: alljoyn_msgarg, length: ULong, ab: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_double(arg: alljoyn_msgarg, d: Double): QStatus =
    0

public actual fun alljoyn_msgarg_set_double_array(arg: alljoyn_msgarg, length: ULong, ad: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_int16(arg: alljoyn_msgarg, n: Short): QStatus =
    0

public actual fun alljoyn_msgarg_set_int16_array(arg: alljoyn_msgarg, length: ULong, an: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_int32(arg: alljoyn_msgarg, i: Int): QStatus =
    0

public actual fun alljoyn_msgarg_set_int32_array(arg: alljoyn_msgarg, length: ULong, ai: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_int64_array(arg: alljoyn_msgarg, length: ULong, ax: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_objectpath(arg: alljoyn_msgarg, o: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_objectpath_array(arg: alljoyn_msgarg, length: ULong, ao: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_signature(arg: alljoyn_msgarg, g: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_signature_array(arg: alljoyn_msgarg, length: ULong, ag: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_string(arg: alljoyn_msgarg, s: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_string_array(arg: alljoyn_msgarg, length: ULong, asTarget: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint16(arg: alljoyn_msgarg, q: UShort): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint16_array(arg: alljoyn_msgarg, length: ULong, aq: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint32(arg: alljoyn_msgarg, u: UInt): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint32_array(arg: alljoyn_msgarg, length: ULong, au: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint64(arg: alljoyn_msgarg, t: ULong): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint64_array(arg: alljoyn_msgarg, length: ULong, at: Long): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint8(arg: alljoyn_msgarg, y: UByte): QStatus =
    0

public actual fun alljoyn_msgarg_set_uint8_array(arg: alljoyn_msgarg, length: ULong, ay: Long): QStatus =
    0

public actual fun alljoyn_msgarg_setdictentry(arg: alljoyn_msgarg, key: alljoyn_msgarg, value: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_msgarg_setstruct(arg: alljoyn_msgarg, struct_members: alljoyn_msgarg, num_members: ULong): QStatus =
    0

public actual fun alljoyn_msgarg_signature(arg: alljoyn_msgarg, str: PCSTR, buf: ULong): ULong =
    0uL

public actual fun alljoyn_msgarg_stabilize(arg: alljoyn_msgarg) {
}

public actual fun alljoyn_msgarg_tostring(arg: alljoyn_msgarg, str: PCSTR, buf: ULong, indent: ULong): ULong =
    0uL

public actual fun alljoyn_observer_create(bus: alljoyn_busattachment, mandatoryinterfaces: Long, nummandatoryinterfaces: ULong): alljoyn_observer =
    0L

public actual fun alljoyn_observer_destroy(observer: alljoyn_observer) {
}

public actual fun alljoyn_observer_get(observer: alljoyn_observer, uniquebusname: PCSTR, objectpath: PCSTR): alljoyn_proxybusobject_ref =
    0L

public actual fun alljoyn_observer_getfirst(observer: alljoyn_observer): alljoyn_proxybusobject_ref =
    0L

public actual fun alljoyn_observer_getnext(observer: alljoyn_observer, proxyref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject_ref =
    0L

public actual fun alljoyn_observer_registerlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener, triggeronexisting: Int) {
}

public actual fun alljoyn_observer_unregisteralllisteners(observer: alljoyn_observer) {
}

public actual fun alljoyn_observer_unregisterlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener) {
}

public actual fun alljoyn_observerlistener_create(callback: Long, context: Long): alljoyn_observerlistener =
    0L

public actual fun alljoyn_observerlistener_destroy(listener: alljoyn_observerlistener) {
}

public actual fun alljoyn_passwordmanager_setcredentials(authmechanism: PCSTR, password: PCSTR): QStatus =
    0

public actual fun alljoyn_permissionconfigurationlistener_create(callbacks: Long, context: Long): alljoyn_permissionconfigurationlistener =
    0L

public actual fun alljoyn_permissionconfigurationlistener_destroy(listener: alljoyn_permissionconfigurationlistener) {
}

public actual fun alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain: Long) {
}

public actual fun alljoyn_permissionconfigurator_certificateid_cleanup(certificateid: Long) {
}

public actual fun alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray: Long) {
}

public actual fun alljoyn_permissionconfigurator_claim(configurator: alljoyn_permissionconfigurator, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_endmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getapplicationstate(configurator: alljoyn_permissionconfigurator, state: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getdefaultclaimcapabilities(): UShort =
    0u

public actual fun alljoyn_permissionconfigurator_getdefaultpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getidentitycertificateid(configurator: alljoyn_permissionconfigurator, certificateid: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getmanifests(configurator: alljoyn_permissionconfigurator, manifestarray: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getmanifesttemplate(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getmembershipsummaries(configurator: alljoyn_permissionconfigurator, certificateids: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_getpublickey(configurator: alljoyn_permissionconfigurator, publickey: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_installmanifests(configurator: alljoyn_permissionconfigurator, manifestsxmls: Long, manifestscount: ULong, append: Int): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_installmembership(configurator: alljoyn_permissionconfigurator, membershipcertificatechain: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray: Long) {
}

public actual fun alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml: Long) {
}

public actual fun alljoyn_permissionconfigurator_policy_destroy(policyxml: Long) {
}

public actual fun alljoyn_permissionconfigurator_publickey_destroy(publickey: Long) {
}

public actual fun alljoyn_permissionconfigurator_removemembership(configurator: alljoyn_permissionconfigurator, serial: Long, seriallen: ULong, issuerpublickey: Long, issueraki: Long, issuerakilen: ULong): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_reset(configurator: alljoyn_permissionconfigurator): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_resetpolicy(configurator: alljoyn_permissionconfigurator): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_setapplicationstate(configurator: alljoyn_permissionconfigurator, state: alljoyn_applicationstate): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_setclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: UShort): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: UShort): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_startmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_updateidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    0

public actual fun alljoyn_permissionconfigurator_updatepolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    0

public actual fun alljoyn_pinglistener_create(callback: Long, context: Long): alljoyn_pinglistener =
    0L

public actual fun alljoyn_pinglistener_destroy(listener: alljoyn_pinglistener) {
}

public actual fun alljoyn_proxybusobject_addchild(proxyobj: alljoyn_proxybusobject, child: alljoyn_proxybusobject): QStatus =
    0

public actual fun alljoyn_proxybusobject_addinterface(proxyobj: alljoyn_proxybusobject, iface: alljoyn_interfacedescription): QStatus =
    0

public actual fun alljoyn_proxybusobject_addinterface_by_name(proxyobj: alljoyn_proxybusobject, name: PCSTR): QStatus =
    0

public actual fun alljoyn_proxybusobject_copy(source: alljoyn_proxybusobject): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_proxybusobject_create(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_proxybusobject_create_secure(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_proxybusobject_destroy(proxyobj: alljoyn_proxybusobject) {
}

public actual fun alljoyn_proxybusobject_enablepropertycaching(proxyobj: alljoyn_proxybusobject) {
}

public actual fun alljoyn_proxybusobject_getallproperties(proxyobj: alljoyn_proxybusobject, iface: PCSTR, values: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_proxybusobject_getallpropertiesasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_getallpropertiescb_ptr, timeout: UInt, context: Long): QStatus =
    0

public actual fun alljoyn_proxybusobject_getchild(proxyobj: alljoyn_proxybusobject, path: PCSTR): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_proxybusobject_getchildren(proxyobj: alljoyn_proxybusobject, children: Long, numchildren: ULong): ULong =
    0uL

public actual fun alljoyn_proxybusobject_getinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): alljoyn_interfacedescription =
    0L

public actual fun alljoyn_proxybusobject_getinterfaces(proxyobj: alljoyn_proxybusobject, ifaces: Long, numifaces: ULong): ULong =
    0uL

public actual fun alljoyn_proxybusobject_getpath(proxyobj: alljoyn_proxybusobject): PCSTR =
    0L

public actual fun alljoyn_proxybusobject_getproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_proxybusobject_getpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, callback: alljoyn_proxybusobject_listener_getpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    0

public actual fun alljoyn_proxybusobject_getservicename(proxyobj: alljoyn_proxybusobject): PCSTR =
    0L

public actual fun alljoyn_proxybusobject_getsessionid(proxyobj: alljoyn_proxybusobject): UInt =
    0u

public actual fun alljoyn_proxybusobject_getuniquename(proxyobj: alljoyn_proxybusobject): PCSTR =
    0L

public actual fun alljoyn_proxybusobject_implementsinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): Int =
    0

public actual fun alljoyn_proxybusobject_introspectremoteobject(proxyobj: alljoyn_proxybusobject): QStatus =
    0

public actual fun alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj: alljoyn_proxybusobject, callback: alljoyn_proxybusobject_listener_introspectcb_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_proxybusobject_issecure(proxyobj: alljoyn_proxybusobject): Int =
    0

public actual fun alljoyn_proxybusobject_isvalid(proxyobj: alljoyn_proxybusobject): Int =
    0

public actual fun alljoyn_proxybusobject_methodcall(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_member_noreply(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_noreply(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcallasync(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcallasync_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_parsexml(proxyobj: alljoyn_proxybusobject, xml: PCSTR, identifier: PCSTR): QStatus =
    0

public actual fun alljoyn_proxybusobject_ref_create(proxy: alljoyn_proxybusobject): alljoyn_proxybusobject_ref =
    0L

public actual fun alljoyn_proxybusobject_ref_decref(ref: alljoyn_proxybusobject_ref) {
}

public actual fun alljoyn_proxybusobject_ref_get(ref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject =
    0L

public actual fun alljoyn_proxybusobject_ref_incref(ref: alljoyn_proxybusobject_ref) {
}

public actual fun alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, properties: Long, numproperties: ULong, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_proxybusobject_removechild(proxyobj: alljoyn_proxybusobject, path: PCSTR): QStatus =
    0

public actual fun alljoyn_proxybusobject_secureconnection(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    0

public actual fun alljoyn_proxybusobject_secureconnectionasync(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    0

public actual fun alljoyn_proxybusobject_setproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    0

public actual fun alljoyn_proxybusobject_setpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg, callback: alljoyn_proxybusobject_listener_setpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    0

public actual fun alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr): QStatus =
    0

public actual fun alljoyn_routerinit(): QStatus =
    0

public actual fun alljoyn_routerinitwithconfig(configxml: Long): QStatus =
    0

public actual fun alljoyn_routershutdown(): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_claim(proxy: alljoyn_securityapplicationproxy, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_create(bus: alljoyn_busattachment, appbusname: Long, sessionid: UInt): alljoyn_securityapplicationproxy =
    0L

public actual fun alljoyn_securityapplicationproxy_destroy(proxy: alljoyn_securityapplicationproxy) {
}

public actual fun alljoyn_securityapplicationproxy_digest_destroy(digest: Long) {
}

public actual fun alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long) {
}

public actual fun alljoyn_securityapplicationproxy_endmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_getapplicationstate(proxy: alljoyn_securityapplicationproxy, applicationstate: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: alljoyn_securityapplicationproxy, capabilities: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: alljoyn_securityapplicationproxy, additionalinfo: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_geteccpublickey(proxy: alljoyn_securityapplicationproxy, eccpublickey: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: alljoyn_securityapplicationproxy, manifesttemplatexml: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): UShort =
    0u

public actual fun alljoyn_securityapplicationproxy_getpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_installmembership(proxy: alljoyn_securityapplicationproxy, membershipcertificatechain: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long) {
}

public actual fun alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long) {
}

public actual fun alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long) {
}

public actual fun alljoyn_securityapplicationproxy_reset(proxy: alljoyn_securityapplicationproxy): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_resetpolicy(proxy: alljoyn_securityapplicationproxy): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: ULong, signedmanifestxml: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_startmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_updateidentity(proxy: alljoyn_securityapplicationproxy, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    0

public actual fun alljoyn_securityapplicationproxy_updatepolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    0

public actual fun alljoyn_sessionlistener_create(callbacks: Long, context: Long): alljoyn_sessionlistener =
    0L

public actual fun alljoyn_sessionlistener_destroy(listener: alljoyn_sessionlistener) {
}

public actual fun alljoyn_sessionopts_cmp(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    0

public actual fun alljoyn_sessionopts_create(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): alljoyn_sessionopts =
    0L

public actual fun alljoyn_sessionopts_destroy(opts: alljoyn_sessionopts) {
}

public actual fun alljoyn_sessionopts_get_multipoint(opts: alljoyn_sessionopts): Int =
    0

public actual fun alljoyn_sessionopts_get_proximity(opts: alljoyn_sessionopts): UByte =
    0u

public actual fun alljoyn_sessionopts_get_traffic(opts: alljoyn_sessionopts): UByte =
    0u

public actual fun alljoyn_sessionopts_get_transports(opts: alljoyn_sessionopts): UShort =
    0u

public actual fun alljoyn_sessionopts_iscompatible(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    0

public actual fun alljoyn_sessionopts_set_multipoint(opts: alljoyn_sessionopts, ismultipoint: Int) {
}

public actual fun alljoyn_sessionopts_set_proximity(opts: alljoyn_sessionopts, proximity: UByte) {
}

public actual fun alljoyn_sessionopts_set_traffic(opts: alljoyn_sessionopts, traffic: UByte) {
}

public actual fun alljoyn_sessionopts_set_transports(opts: alljoyn_sessionopts, transports: UShort) {
}

public actual fun alljoyn_sessionportlistener_create(callbacks: Long, context: Long): alljoyn_sessionportlistener =
    0L

public actual fun alljoyn_sessionportlistener_destroy(listener: alljoyn_sessionportlistener) {
}

public actual fun alljoyn_shutdown(): QStatus =
    0

public actual fun alljoyn_unity_deferred_callbacks_process(): Int =
    0

public actual fun alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int) {
}
