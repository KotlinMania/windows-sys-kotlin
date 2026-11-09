@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32DevicesAlljoynJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection(serverbushandle: Long, abortevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle(bushandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus(connectionspec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus(outbuffersize: Int, inbuffersize: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents(connectedbushandle: Long, eventtoreset: Long, eventtypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect(connectedbushandle: Long, eventhandle: Long, eventtypes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus(connectedbushandle: Long, buffer: Long, bytestoread: Int, bytestransferred: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus(connectedbushandle: Long, buffer: Long, bytestowrite: Int, bytestransferred: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_QCC_StatusText(status: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create(defaultlanguage: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full(arg: Long, language: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg(data: Long, arg: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml(data: Long, aboutdataxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy(data: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata(data: Long, msgarg: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion(data: Long, ajsoftwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata(data: Long, msgarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid(data: Long, appid: Long, num: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname(data: Long, appname: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture(data: Long, dateofmanufacture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage(data: Long, defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription(data: Long, description: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid(data: Long, deviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename(data: Long, devicename: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield(data: Long, name: Long, value: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields(data: Long, fields: Long, num_fields: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature(data: Long, fieldname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion(data: Long, hardwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer(data: Long, manufacturer: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber(data: Long, modelnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion(data: Long, softwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages(data: Long, languagetags: Long, num: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl(data: Long, supporturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid(data: Long, language: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid(data: Long, appid: Long, num: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring(data: Long, appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname(data: Long, appname: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture(data: Long, dateofmanufacture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage(data: Long, defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription(data: Long, description: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid(data: Long, deviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename(data: Long, devicename: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield(data: Long, name: Long, value: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion(data: Long, hardwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer(data: Long, manufacturer: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber(data: Long, modelnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion(data: Long, softwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage(data: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl(data: Long, supporturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear(icon: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy(icon: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent(icon: Long, data: Long, size: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl(icon: Long, type: Long, url: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent(icon: Long, type: Long, data: Long, csize: Long, ownsdata: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg(icon: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl(icon: Long, type: Long, url: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create(bus: Long, icon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy(icon: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create(bus: Long, busname: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy(proxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon(proxy: Long, icon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion(proxy: Long, version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create(callback: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce(obj: Long, sessionport: Short, aboutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener(obj: Long, sessionport: Short, aboutlistener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create(bus: Long, isannounced: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy(obj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear(description: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg(description: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy(description: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths(description: Long, interfacename: Long, paths: Long, numpaths: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces(description: Long, path: Long, interfaces: Long, numinterfaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg(description: Long, msgarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths(description: Long, paths: Long, numpaths: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface(description: Long, interfacename: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath(description: Long, path: Long, interfacename: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath(description: Long, path: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create(bus: Long, busname: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy(proxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata(proxy: Long, language: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription(proxy: Long, objectdesc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion(proxy: Long, version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse(listener: Long, authcontext: Long, accept: Int, credentials: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret(listener: Long, sharedsecret: Long, sharedsecretsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse(listener: Long, authcontext: Long, accept: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination(autopinger: Long, group: Long, destination: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup(autopinger: Long, group: Long, listener: Long, pinginterval: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy(autopinger: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause(autopinger: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination(autopinger: Long, group: Long, destination: Long, removeall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup(autopinger: Long, group: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume(autopinger: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval(autopinger: Long, group: Long, pinginterval: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry(bus: Long, authmechanism: Long, username: Long, password: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch(bus: Long, rule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename(bus: Long, name: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport(bus: Long, sessionport: Long, opts: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename(bus: Long, name: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname(bus: Long, nameprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport(bus: Long, nameprefix: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface(bus: Long, implementsinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces(bus: Long, implementsinterfaces: Long, numberinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys(bus: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect(bus: Long, connectspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create(applicationname: Long, allowremotemessages: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency(applicationname: Long, allowremotemessages: Int, concurrency: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface(bus: Long, name: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure(bus: Long, name: Long, iface: Long, secpolicy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml(bus: Long, xml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore(applicationname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect(bus: Long, unused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity(bus: Long, authmechanisms: Long, listener: Long, keystorefilename: Long, isshared: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus: Long, authmechanisms: Long, authlistener: Long, keystorefilename: Long, isshared: Int, permissionconfigurationlistener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname(bus: Long, nameprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport(bus: Long, nameprefix: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface(bus: Long, name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces(bus: Long, ifaces: Long, numifaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration(bus: Long, guid: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid(bus: Long, name: Long, guid: Long, guidsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession(bus: Long, sessionhost: Long, sessionport: Short, listener: Long, sessionid: Long, opts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync(bus: Long, sessionhost: Long, sessionport: Short, listener: Long, opts: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession(bus: Long, sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner(bus: Long, name: Long, hasowner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping(bus: Long, name: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener(bus: Long, aboutlistener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener(bus: Long, listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject(bus: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure(bus: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename(bus: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch(bus: Long, rule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember(bus: Long, sessionid: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname(bus: Long, requestedname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection(bus: Long, name: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync(bus: Long, name: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug(bus: Long, module: Long, level: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration(bus: Long, guid: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout(bus: Long, sessionid: Int, linktimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync(bus: Long, sessionid: Int, linktimeout: Int, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener(bus: Long, sessionid: Int, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport(bus: Long, sessionport: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener(bus: Long, aboutlistener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener(bus: Long, listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject(bus: Long, obj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface(bus: Long, implementsinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces(bus: Long, implementsinterfaces: Long, numberinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers(bus: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage(bus: Long, msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial(bus: Long, serialnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create(path: Long, isplaceholder: Int, callbacks_in: Long, context_in: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged(bus: Long, ifcname: Long, propnames: Long, numprops: Long, id: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged(bus: Long, ifcname: Long, propname: Long, value: Long, id: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames(bus: Long, interfaces: Long, numinterfaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname(bus: Long, buffer: Long, buffersz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args(bus: Long, msg: Long, args: Long, numargs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err(bus: Long, msg: Long, error: Long, errormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status(bus: Long, msg: Long, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag(bus: Long, iface: Long, isannounced: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear(cred: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy(cred: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration(cred: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset(cred: Long, creds: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain(cred: Long, certchain: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration(cred: Long, expiration: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry(cred: Long, logonentry: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword(cred: Long, pwd: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey(cred: Long, pk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername(cred: Long, username: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_getversion(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_init(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate(iface: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation(iface: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation(iface: Long, member: Long, argname: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember(iface: Long, type: Int, name: Long, inputsig: Long, outsig: Long, argnames: Long, annotation: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation(iface: Long, member: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod(iface: Long, name: Long, inputsig: Long, outsig: Long, argnames: Long, annotation: Byte, accessperms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty(iface: Long, name: Long, signature: Long, access: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation(iface: Long, property: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal(iface: Long, name: Long, sig: Long, argnames: Long, annotation: Byte, accessperms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation(iface: Long, name: Long, value: Long, value_size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex(iface: Long, index: Long, name: Long, name_size: Long, value: Long, value_size: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount(iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage(iface: Long, member: Long, arg: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage(iface: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages(iface: Long, languages: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2(iface: Long, languages: Long, languagessize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback(iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation(iface: Long, member: Long, name: Long, value: Long, value_size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation(iface: Long, member: Long, argname: Long, name: Long, value: Long, value_size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface: Long, member: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers(iface: Long, members: Long, nummembers: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname(iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties(iface: Long, props: Long, numprops: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty(iface: Long, name: Long, property: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation(iface: Long, property: Long, name: Long, value: Long, str_size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface: Long, property: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember(iface: Long, name: Long, insig: Long, outsig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty(iface: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect(iface: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription(iface: Long, member: Long, argname: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage(iface: Long, member: Long, arg: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription(iface: Long, description: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage(iface: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage(iface: Long, language: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback(iface: Long, translationcallback: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription(iface: Long, member: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface: Long, member: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription(iface: Long, name: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface: Long, name: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys(listener: Long, keystore: Long, sink: Long, sink_sz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys(listener: Long, keystore: Long, source: Long, password: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_create(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_description(msg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy(msg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg(msg: Long, argn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs(msg: Long, numargs: Long, args: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname(msg: Long, errormessage: Long, errormessage_size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags(msg: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired(msg: Long, tillexpirems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess(endian: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring(msg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature(values: Long, numvalues: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring(args: Long, numargs: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear(arg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone(destination: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy(source: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy(arg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal(lhv: Long, rhv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element(arg: Long, index: Long, element: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool(arg: Long, b: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array(arg: Long, length: Long, ab: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double(arg: Long, d: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array(arg: Long, length: Long, ad: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16(arg: Long, n: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array(arg: Long, length: Long, an: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32(arg: Long, i: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array(arg: Long, length: Long, ai: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64(arg: Long, x: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array(arg: Long, length: Long, ax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath(arg: Long, o: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature(arg: Long, g: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string(arg: Long, s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16(arg: Long, q: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array(arg: Long, length: Long, aq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32(arg: Long, u: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array(arg: Long, length: Long, au: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64(arg: Long, t: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array(arg: Long, length: Long, at: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8(arg: Long, y: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array(arg: Long, length: Long, ay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant(arg: Long, v: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array(arg: Long, signature: Long, length: Long, av: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype(arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature(arg: Long, signature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool(arg: Long, b: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array(arg: Long, length: Long, ab: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double(arg: Long, d: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array(arg: Long, length: Long, ad: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16(arg: Long, n: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array(arg: Long, length: Long, an: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32(arg: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array(arg: Long, length: Long, ai: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64(arg: Long, x: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array(arg: Long, length: Long, ax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath(arg: Long, o: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array(arg: Long, length: Long, ao: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature(arg: Long, g: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array(arg: Long, length: Long, ag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string(arg: Long, s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array(arg: Long, length: Long, asTarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16(arg: Long, q: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array(arg: Long, length: Long, aq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32(arg: Long, u: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array(arg: Long, length: Long, au: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64(arg: Long, t: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array(arg: Long, length: Long, at: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8(arg: Long, y: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array(arg: Long, length: Long, ay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry(arg: Long, key: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct(arg: Long, struct_members: Long, num_members: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature(arg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize(arg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring(arg: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create(bus: Long, mandatoryinterfaces: Long, nummandatoryinterfaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy(observer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get(observer: Long, uniquebusname: Long, objectpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst(observer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext(observer: Long, proxyref: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener(observer: Long, listener: Long, triggeronexisting: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners(observer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener(observer: Long, listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create(callback: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials(authmechanism: Long, password: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup(certificateid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim(configurator: Long, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: Long, groupauthority: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate(configurator: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities(configurator: Long, claimcapabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities(): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity(configurator: Long, identitycertificatechain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid(configurator: Long, certificateid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests(configurator: Long, manifestarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate(configurator: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries(configurator: Long, certificateids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey(configurator: Long, publickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests(configurator: Long, manifestsxmls: Long, manifestscount: Long, append: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership(configurator: Long, membershipcertificatechain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy(policyxml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy(publickey: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership(configurator: Long, serial: Long, seriallen: Long, issuerpublickey: Long, issueraki: Long, issuerakilen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate(configurator: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities(configurator: Long, claimcapabilities: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity(configurator: Long, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create(callback: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild(proxyobj: Long, child: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name(proxyobj: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy(source: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create(bus: Long, service: Long, path: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure(bus: Long, service: Long, path: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy(proxyobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching(proxyobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties(proxyobj: Long, iface: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync(proxyobj: Long, iface: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild(proxyobj: Long, path: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren(proxyobj: Long, children: Long, numchildren: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface(proxyobj: Long, iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces(proxyobj: Long, ifaces: Long, numifaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath(proxyobj: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty(proxyobj: Long, iface: Long, property: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync(proxyobj: Long, iface: Long, property: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename(proxyobj: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename(proxyobj: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall(proxyobj: Long, ifacename: Long, methodname: Long, args: Long, numargs: Long, replymsg: Long, timeout: Int, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply(proxyobj: Long, ifacename: Long, methodname: Long, args: Long, numargs: Long, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync(proxyobj: Long, ifacename: Long, methodname: Long, replyfunc: Long, args: Long, numargs: Long, context: Long, timeout: Int, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml(proxyobj: Long, xml: Long, identifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create(proxy: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref(ref: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get(ref: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref(ref: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj: Long, iface: Long, properties: Long, numproperties: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild(proxyobj: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection(proxyobj: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync(proxyobj: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty(proxyobj: Long, iface: Long, property: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync(proxyobj: Long, iface: Long, property: Long, value: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj: Long, iface: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig(configxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim(proxy: Long, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: Long, groupauthority: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create(bus: Long, appbusname: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy(proxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy(digest: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate(proxy: Long, applicationstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: Long, capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: Long, additionalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey(proxy: Long, eccpublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership(proxy: Long, membershipcertificatechain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: Long, signedmanifestxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity(proxy: Long, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create(traffic: Byte, ismultipoint: Int, proximity: Byte, transports: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy(opts: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint(opts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity(opts: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic(opts: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports(opts: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint(opts: Long, ismultipoint: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity(opts: Long, proximity: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic(opts: Long, traffic: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports(opts: Long, transports: Short)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int)
}

public actual fun AllJoynAcceptBusConnection(serverbushandle: HANDLE, abortevent: HANDLE): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection(serverbushandle, abortevent).toUInt()

public actual fun AllJoynCloseBusHandle(bushandle: HANDLE): BOOL =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle(bushandle)

public actual fun AllJoynConnectToBus(connectionspec: PCWSTR): HANDLE =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus(connectionspec)

public actual fun AllJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: Long): HANDLE =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), lpsecurityattributes)

public actual fun AllJoynEnumEvents(connectedbushandle: HANDLE, eventtoreset: HANDLE, eventtypes: Long): BOOL =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents(connectedbushandle, eventtoreset, eventtypes)

public actual fun AllJoynEventSelect(connectedbushandle: HANDLE, eventhandle: HANDLE, eventtypes: UInt): BOOL =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect(connectedbushandle, eventhandle, eventtypes.toInt())

public actual fun AllJoynReceiveFromBus(connectedbushandle: HANDLE, buffer: Long, bytestoread: UInt, bytestransferred: Long, reserved: Long): BOOL =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus(connectedbushandle, buffer, bytestoread.toInt(), bytestransferred, reserved)

public actual fun AllJoynSendToBus(connectedbushandle: HANDLE, buffer: Long, bytestowrite: UInt, bytestransferred: Long, reserved: Long): BOOL =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus(connectedbushandle, buffer, bytestowrite.toInt(), bytestransferred, reserved)

public actual fun QCC_StatusText(status: QStatus): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_QCC_StatusText(status)

public actual fun alljoyn_aboutdata_create(defaultlanguage: PCSTR): alljoyn_aboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create(defaultlanguage)

public actual fun alljoyn_aboutdata_create_empty(): alljoyn_aboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty()

public actual fun alljoyn_aboutdata_create_full(arg: alljoyn_msgarg, language: PCSTR): alljoyn_aboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full(arg, language)

public actual fun alljoyn_aboutdata_createfrommsgarg(data: alljoyn_aboutdata, arg: alljoyn_msgarg, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg(data, arg, language)

public actual fun alljoyn_aboutdata_createfromxml(data: alljoyn_aboutdata, aboutdataxml: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml(data, aboutdataxml)

public actual fun alljoyn_aboutdata_destroy(data: alljoyn_aboutdata) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy(data)
}

public actual fun alljoyn_aboutdata_getaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata(data, msgarg, language)

public actual fun alljoyn_aboutdata_getajsoftwareversion(data: alljoyn_aboutdata, ajsoftwareversion: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion(data, ajsoftwareversion)

public actual fun alljoyn_aboutdata_getannouncedaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata(data, msgarg)

public actual fun alljoyn_aboutdata_getappid(data: alljoyn_aboutdata, appid: Long, num: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid(data, appid, num)

public actual fun alljoyn_aboutdata_getappname(data: alljoyn_aboutdata, appname: Long, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname(data, appname, language)

public actual fun alljoyn_aboutdata_getdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture(data, dateofmanufacture)

public actual fun alljoyn_aboutdata_getdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage(data, defaultlanguage)

public actual fun alljoyn_aboutdata_getdescription(data: alljoyn_aboutdata, description: Long, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription(data, description, language)

public actual fun alljoyn_aboutdata_getdeviceid(data: alljoyn_aboutdata, deviceid: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid(data, deviceid)

public actual fun alljoyn_aboutdata_getdevicename(data: alljoyn_aboutdata, devicename: Long, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename(data, devicename, language)

public actual fun alljoyn_aboutdata_getfield(data: alljoyn_aboutdata, name: PCSTR, value: Long, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield(data, name, value, language)

public actual fun alljoyn_aboutdata_getfields(data: alljoyn_aboutdata, fields: Long, num_fields: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields(data, fields, num_fields.toLong()).toULong()

public actual fun alljoyn_aboutdata_getfieldsignature(data: alljoyn_aboutdata, fieldname: PCSTR): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature(data, fieldname)

public actual fun alljoyn_aboutdata_gethardwareversion(data: alljoyn_aboutdata, hardwareversion: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion(data, hardwareversion)

public actual fun alljoyn_aboutdata_getmanufacturer(data: alljoyn_aboutdata, manufacturer: Long, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer(data, manufacturer, language)

public actual fun alljoyn_aboutdata_getmodelnumber(data: alljoyn_aboutdata, modelnumber: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber(data, modelnumber)

public actual fun alljoyn_aboutdata_getsoftwareversion(data: alljoyn_aboutdata, softwareversion: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion(data, softwareversion)

public actual fun alljoyn_aboutdata_getsupportedlanguages(data: alljoyn_aboutdata, languagetags: Long, num: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages(data, languagetags, num.toLong()).toULong()

public actual fun alljoyn_aboutdata_getsupporturl(data: alljoyn_aboutdata, supporturl: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl(data, supporturl)

public actual fun alljoyn_aboutdata_isfieldannounced(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced(data, fieldname).toUByte()

public actual fun alljoyn_aboutdata_isfieldlocalized(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized(data, fieldname).toUByte()

public actual fun alljoyn_aboutdata_isfieldrequired(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired(data, fieldname).toUByte()

public actual fun alljoyn_aboutdata_isvalid(data: alljoyn_aboutdata, language: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid(data, language).toUByte()

public actual fun alljoyn_aboutdata_setappid(data: alljoyn_aboutdata, appid: Long, num: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid(data, appid, num.toLong())

public actual fun alljoyn_aboutdata_setappid_fromstring(data: alljoyn_aboutdata, appid: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring(data, appid)

public actual fun alljoyn_aboutdata_setappname(data: alljoyn_aboutdata, appname: PCSTR, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname(data, appname, language)

public actual fun alljoyn_aboutdata_setdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture(data, dateofmanufacture)

public actual fun alljoyn_aboutdata_setdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage(data, defaultlanguage)

public actual fun alljoyn_aboutdata_setdescription(data: alljoyn_aboutdata, description: PCSTR, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription(data, description, language)

public actual fun alljoyn_aboutdata_setdeviceid(data: alljoyn_aboutdata, deviceid: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid(data, deviceid)

public actual fun alljoyn_aboutdata_setdevicename(data: alljoyn_aboutdata, devicename: PCSTR, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename(data, devicename, language)

public actual fun alljoyn_aboutdata_setfield(data: alljoyn_aboutdata, name: PCSTR, value: alljoyn_msgarg, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield(data, name, value, language)

public actual fun alljoyn_aboutdata_sethardwareversion(data: alljoyn_aboutdata, hardwareversion: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion(data, hardwareversion)

public actual fun alljoyn_aboutdata_setmanufacturer(data: alljoyn_aboutdata, manufacturer: PCSTR, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer(data, manufacturer, language)

public actual fun alljoyn_aboutdata_setmodelnumber(data: alljoyn_aboutdata, modelnumber: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber(data, modelnumber)

public actual fun alljoyn_aboutdata_setsoftwareversion(data: alljoyn_aboutdata, softwareversion: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion(data, softwareversion)

public actual fun alljoyn_aboutdata_setsupportedlanguage(data: alljoyn_aboutdata, language: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage(data, language)

public actual fun alljoyn_aboutdata_setsupporturl(data: alljoyn_aboutdata, supporturl: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl(data, supporturl)

public actual fun alljoyn_aboutdatalistener_create(callbacks: Long, context: Long): alljoyn_aboutdatalistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create(callbacks, context)

public actual fun alljoyn_aboutdatalistener_destroy(listener: alljoyn_aboutdatalistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy(listener)
}

public actual fun alljoyn_abouticon_clear(icon: alljoyn_abouticon) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear(icon)
}

public actual fun alljoyn_abouticon_create(): alljoyn_abouticon =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create()

public actual fun alljoyn_abouticon_destroy(icon: alljoyn_abouticon) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy(icon)
}

public actual fun alljoyn_abouticon_getcontent(icon: alljoyn_abouticon, data: Long, size: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent(icon, data, size)
}

public actual fun alljoyn_abouticon_geturl(icon: alljoyn_abouticon, type: Long, url: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl(icon, type, url)
}

public actual fun alljoyn_abouticon_setcontent(icon: alljoyn_abouticon, type: PCSTR, data: Long, csize: ULong, ownsdata: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent(icon, type, data, csize.toLong(), ownsdata.toByte())

public actual fun alljoyn_abouticon_setcontent_frommsgarg(icon: alljoyn_abouticon, arg: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg(icon, arg)

public actual fun alljoyn_abouticon_seturl(icon: alljoyn_abouticon, type: PCSTR, url: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl(icon, type, url)

public actual fun alljoyn_abouticonobj_create(bus: alljoyn_busattachment, icon: alljoyn_abouticon): alljoyn_abouticonobj =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create(bus, icon)

public actual fun alljoyn_abouticonobj_destroy(icon: alljoyn_abouticonobj) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy(icon)
}

public actual fun alljoyn_abouticonproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_abouticonproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create(bus, busname, sessionid.toInt())

public actual fun alljoyn_abouticonproxy_destroy(proxy: alljoyn_abouticonproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy(proxy)
}

public actual fun alljoyn_abouticonproxy_geticon(proxy: alljoyn_abouticonproxy, icon: alljoyn_abouticon): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon(proxy, icon)

public actual fun alljoyn_abouticonproxy_getversion(proxy: alljoyn_abouticonproxy, version: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion(proxy, version)

public actual fun alljoyn_aboutlistener_create(callback: Long, context: Long): alljoyn_aboutlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create(callback, context)

public actual fun alljoyn_aboutlistener_destroy(listener: alljoyn_aboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy(listener)
}

public actual fun alljoyn_aboutobj_announce(obj: alljoyn_aboutobj, sessionport: UShort, aboutdata: alljoyn_aboutdata): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce(obj, sessionport.toShort(), aboutdata)

public actual fun alljoyn_aboutobj_announce_using_datalistener(obj: alljoyn_aboutobj, sessionport: UShort, aboutlistener: alljoyn_aboutdatalistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener(obj, sessionport.toShort(), aboutlistener)

public actual fun alljoyn_aboutobj_create(bus: alljoyn_busattachment, isannounced: alljoyn_about_announceflag): alljoyn_aboutobj =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create(bus, isannounced)

public actual fun alljoyn_aboutobj_destroy(obj: alljoyn_aboutobj) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy(obj)
}

public actual fun alljoyn_aboutobj_unannounce(obj: alljoyn_aboutobj): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce(obj)

public actual fun alljoyn_aboutobjectdescription_clear(description: alljoyn_aboutobjectdescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear(description)
}

public actual fun alljoyn_aboutobjectdescription_create(): alljoyn_aboutobjectdescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create()

public actual fun alljoyn_aboutobjectdescription_create_full(arg: alljoyn_msgarg): alljoyn_aboutobjectdescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full(arg)

public actual fun alljoyn_aboutobjectdescription_createfrommsgarg(description: alljoyn_aboutobjectdescription, arg: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg(description, arg)

public actual fun alljoyn_aboutobjectdescription_destroy(description: alljoyn_aboutobjectdescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy(description)
}

public actual fun alljoyn_aboutobjectdescription_getinterfacepaths(description: alljoyn_aboutobjectdescription, interfacename: PCSTR, paths: Long, numpaths: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths(description, interfacename, paths, numpaths.toLong()).toULong()

public actual fun alljoyn_aboutobjectdescription_getinterfaces(description: alljoyn_aboutobjectdescription, path: PCSTR, interfaces: Long, numinterfaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces(description, path, interfaces, numinterfaces.toLong()).toULong()

public actual fun alljoyn_aboutobjectdescription_getmsgarg(description: alljoyn_aboutobjectdescription, msgarg: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg(description, msgarg)

public actual fun alljoyn_aboutobjectdescription_getpaths(description: alljoyn_aboutobjectdescription, paths: Long, numpaths: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths(description, paths, numpaths.toLong()).toULong()

public actual fun alljoyn_aboutobjectdescription_hasinterface(description: alljoyn_aboutobjectdescription, interfacename: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface(description, interfacename).toUByte()

public actual fun alljoyn_aboutobjectdescription_hasinterfaceatpath(description: alljoyn_aboutobjectdescription, path: PCSTR, interfacename: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath(description, path, interfacename).toUByte()

public actual fun alljoyn_aboutobjectdescription_haspath(description: alljoyn_aboutobjectdescription, path: PCSTR): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath(description, path).toUByte()

public actual fun alljoyn_aboutproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_aboutproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create(bus, busname, sessionid.toInt())

public actual fun alljoyn_aboutproxy_destroy(proxy: alljoyn_aboutproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy(proxy)
}

public actual fun alljoyn_aboutproxy_getaboutdata(proxy: alljoyn_aboutproxy, language: PCSTR, data: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata(proxy, language, data)

public actual fun alljoyn_aboutproxy_getobjectdescription(proxy: alljoyn_aboutproxy, objectdesc: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription(proxy, objectdesc)

public actual fun alljoyn_aboutproxy_getversion(proxy: alljoyn_aboutproxy, version: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion(proxy, version)

public actual fun alljoyn_applicationstatelistener_create(callbacks: Long, context: Long): alljoyn_applicationstatelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create(callbacks, context)

public actual fun alljoyn_applicationstatelistener_destroy(listener: alljoyn_applicationstatelistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy(listener)
}

public actual fun alljoyn_authlistener_create(callbacks: Long, context: Long): alljoyn_authlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create(callbacks, context)

public actual fun alljoyn_authlistener_destroy(listener: alljoyn_authlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy(listener)
}

public actual fun alljoyn_authlistener_requestcredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int, credentials: alljoyn_credentials): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse(listener, authcontext, accept, credentials)

public actual fun alljoyn_authlistener_setsharedsecret(listener: alljoyn_authlistener, sharedsecret: Long, sharedsecretsize: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret(listener, sharedsecret, sharedsecretsize.toLong())

public actual fun alljoyn_authlistener_verifycredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse(listener, authcontext, accept)

public actual fun alljoyn_authlistenerasync_create(callbacks: Long, context: Long): alljoyn_authlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create(callbacks, context)

public actual fun alljoyn_authlistenerasync_destroy(listener: alljoyn_authlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy(listener)
}

public actual fun alljoyn_autopinger_adddestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination(autopinger, group, destination)

public actual fun alljoyn_autopinger_addpinggroup(autopinger: alljoyn_autopinger, group: PCSTR, listener: alljoyn_pinglistener, pinginterval: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup(autopinger, group, listener, pinginterval.toInt())
}

public actual fun alljoyn_autopinger_create(bus: alljoyn_busattachment): alljoyn_autopinger =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create(bus)

public actual fun alljoyn_autopinger_destroy(autopinger: alljoyn_autopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy(autopinger)
}

public actual fun alljoyn_autopinger_pause(autopinger: alljoyn_autopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause(autopinger)
}

public actual fun alljoyn_autopinger_removedestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR, removeall: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination(autopinger, group, destination, removeall)

public actual fun alljoyn_autopinger_removepinggroup(autopinger: alljoyn_autopinger, group: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup(autopinger, group)
}

public actual fun alljoyn_autopinger_resume(autopinger: alljoyn_autopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume(autopinger)
}

public actual fun alljoyn_autopinger_setpinginterval(autopinger: alljoyn_autopinger, group: PCSTR, pinginterval: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval(autopinger, group, pinginterval.toInt())

public actual fun alljoyn_busattachment_addlogonentry(bus: alljoyn_busattachment, authmechanism: PCSTR, username: PCSTR, password: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry(bus, authmechanism, username, password)

public actual fun alljoyn_busattachment_addmatch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch(bus, rule)

public actual fun alljoyn_busattachment_advertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename(bus, name, transports.toShort())

public actual fun alljoyn_busattachment_bindsessionport(bus: alljoyn_busattachment, sessionport: Long, opts: alljoyn_sessionopts, listener: alljoyn_sessionportlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport(bus, sessionport, opts, listener)

public actual fun alljoyn_busattachment_canceladvertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename(bus, name, transports.toShort())

public actual fun alljoyn_busattachment_cancelfindadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname(bus, nameprefix)

public actual fun alljoyn_busattachment_cancelfindadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport(bus, nameprefix, transports.toShort())

public actual fun alljoyn_busattachment_cancelwhoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface(bus, implementsinterface)

public actual fun alljoyn_busattachment_cancelwhoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces(bus, implementsinterfaces, numberinterfaces.toLong())

public actual fun alljoyn_busattachment_clearkeys(bus: alljoyn_busattachment, guid: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys(bus, guid)

public actual fun alljoyn_busattachment_clearkeystore(bus: alljoyn_busattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore(bus)
}

public actual fun alljoyn_busattachment_connect(bus: alljoyn_busattachment, connectspec: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect(bus, connectspec)

public actual fun alljoyn_busattachment_create(applicationname: PCSTR, allowremotemessages: Int): alljoyn_busattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create(applicationname, allowremotemessages)

public actual fun alljoyn_busattachment_create_concurrency(applicationname: PCSTR, allowremotemessages: Int, concurrency: UInt): alljoyn_busattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency(applicationname, allowremotemessages, concurrency.toInt())

public actual fun alljoyn_busattachment_createinterface(bus: alljoyn_busattachment, name: PCSTR, iface: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface(bus, name, iface)

public actual fun alljoyn_busattachment_createinterface_secure(bus: alljoyn_busattachment, name: PCSTR, iface: Long, secpolicy: alljoyn_interfacedescription_securitypolicy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure(bus, name, iface, secpolicy)

public actual fun alljoyn_busattachment_createinterfacesfromxml(bus: alljoyn_busattachment, xml: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml(bus, xml)

public actual fun alljoyn_busattachment_deletedefaultkeystore(applicationname: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore(applicationname)

public actual fun alljoyn_busattachment_deleteinterface(bus: alljoyn_busattachment, iface: alljoyn_interfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface(bus, iface)

public actual fun alljoyn_busattachment_destroy(bus: alljoyn_busattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy(bus)
}

public actual fun alljoyn_busattachment_disconnect(bus: alljoyn_busattachment, unused: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect(bus, unused)

public actual fun alljoyn_busattachment_enableconcurrentcallbacks(bus: alljoyn_busattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks(bus)
}

public actual fun alljoyn_busattachment_enablepeersecurity(bus: alljoyn_busattachment, authmechanisms: PCSTR, listener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity(bus, authmechanisms, listener, keystorefilename, isshared)

public actual fun alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus: alljoyn_busattachment, authmechanisms: PCSTR, authlistener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int, permissionconfigurationlistener: alljoyn_permissionconfigurationlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus, authmechanisms, authlistener, keystorefilename, isshared, permissionconfigurationlistener)

public actual fun alljoyn_busattachment_findadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname(bus, nameprefix)

public actual fun alljoyn_busattachment_findadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport(bus, nameprefix, transports.toShort())

public actual fun alljoyn_busattachment_getalljoyndebugobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj(bus)

public actual fun alljoyn_busattachment_getalljoynproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj(bus)

public actual fun alljoyn_busattachment_getconcurrency(bus: alljoyn_busattachment): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency(bus).toUInt()

public actual fun alljoyn_busattachment_getconnectspec(bus: alljoyn_busattachment): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec(bus)

public actual fun alljoyn_busattachment_getdbusproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj(bus)

public actual fun alljoyn_busattachment_getglobalguidstring(bus: alljoyn_busattachment): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring(bus)

public actual fun alljoyn_busattachment_getinterface(bus: alljoyn_busattachment, name: PCSTR): alljoyn_interfacedescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface(bus, name)

public actual fun alljoyn_busattachment_getinterfaces(bus: alljoyn_busattachment, ifaces: Long, numifaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces(bus, ifaces, numifaces.toLong()).toULong()

public actual fun alljoyn_busattachment_getkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration(bus, guid, timeout)

public actual fun alljoyn_busattachment_getpeerguid(bus: alljoyn_busattachment, name: PCSTR, guid: PCSTR, guidsz: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid(bus, name, guid, guidsz)

public actual fun alljoyn_busattachment_getpermissionconfigurator(bus: alljoyn_busattachment): alljoyn_permissionconfigurator =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator(bus)

public actual fun alljoyn_busattachment_gettimestamp(): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp().toUInt()

public actual fun alljoyn_busattachment_getuniquename(bus: alljoyn_busattachment): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename(bus)

public actual fun alljoyn_busattachment_isconnected(bus: alljoyn_busattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected(bus)

public actual fun alljoyn_busattachment_ispeersecurityenabled(bus: alljoyn_busattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled(bus)

public actual fun alljoyn_busattachment_isstarted(bus: alljoyn_busattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted(bus)

public actual fun alljoyn_busattachment_isstopping(bus: alljoyn_busattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping(bus)

public actual fun alljoyn_busattachment_join(bus: alljoyn_busattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join(bus)

public actual fun alljoyn_busattachment_joinsession(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, sessionid: Long, opts: alljoyn_sessionopts): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession(bus, sessionhost, sessionport.toShort(), listener, sessionid, opts)

public actual fun alljoyn_busattachment_joinsessionasync(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, opts: alljoyn_sessionopts, callback: alljoyn_busattachment_joinsessioncb_ptr, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync(bus, sessionhost, sessionport.toShort(), listener, opts, callback.toLong(), context)

public actual fun alljoyn_busattachment_leavesession(bus: alljoyn_busattachment, sessionid: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession(bus, sessionid.toInt())

public actual fun alljoyn_busattachment_namehasowner(bus: alljoyn_busattachment, name: PCSTR, hasowner: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner(bus, name, hasowner)

public actual fun alljoyn_busattachment_ping(bus: alljoyn_busattachment, name: PCSTR, timeout: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping(bus, name, timeout.toInt())

public actual fun alljoyn_busattachment_registeraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener(bus, aboutlistener)
}

public actual fun alljoyn_busattachment_registerapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener(bus, listener)

public actual fun alljoyn_busattachment_registerbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener(bus, listener)
}

public actual fun alljoyn_busattachment_registerbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject(bus, obj)

public actual fun alljoyn_busattachment_registerbusobject_secure(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure(bus, obj)

public actual fun alljoyn_busattachment_registerkeystorelistener(bus: alljoyn_busattachment, listener: alljoyn_keystorelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener(bus, listener)

public actual fun alljoyn_busattachment_registersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_registersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_releasename(bus: alljoyn_busattachment, name: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename(bus, name)

public actual fun alljoyn_busattachment_reloadkeystore(bus: alljoyn_busattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore(bus)

public actual fun alljoyn_busattachment_removematch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch(bus, rule)

public actual fun alljoyn_busattachment_removesessionmember(bus: alljoyn_busattachment, sessionid: UInt, membername: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember(bus, sessionid.toInt(), membername)

public actual fun alljoyn_busattachment_requestname(bus: alljoyn_busattachment, requestedname: PCSTR, flags: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname(bus, requestedname, flags.toInt())

public actual fun alljoyn_busattachment_secureconnection(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection(bus, name, forceauth)

public actual fun alljoyn_busattachment_secureconnectionasync(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync(bus, name, forceauth)

public actual fun alljoyn_busattachment_setdaemondebug(bus: alljoyn_busattachment, module: PCSTR, level: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug(bus, module, level.toInt())

public actual fun alljoyn_busattachment_setkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration(bus, guid, timeout.toInt())

public actual fun alljoyn_busattachment_setlinktimeout(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout(bus, sessionid.toInt(), linktimeout)

public actual fun alljoyn_busattachment_setlinktimeoutasync(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: UInt, callback: alljoyn_busattachment_setlinktimeoutcb_ptr, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync(bus, sessionid.toInt(), linktimeout.toInt(), callback.toLong(), context)

public actual fun alljoyn_busattachment_setsessionlistener(bus: alljoyn_busattachment, sessionid: UInt, listener: alljoyn_sessionlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener(bus, sessionid.toInt(), listener)

public actual fun alljoyn_busattachment_start(bus: alljoyn_busattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start(bus)

public actual fun alljoyn_busattachment_stop(bus: alljoyn_busattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop(bus)

public actual fun alljoyn_busattachment_unbindsessionport(bus: alljoyn_busattachment, sessionport: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport(bus, sessionport.toShort())

public actual fun alljoyn_busattachment_unregisteraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener(bus, aboutlistener)
}

public actual fun alljoyn_busattachment_unregisterallaboutlisteners(bus: alljoyn_busattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners(bus)
}

public actual fun alljoyn_busattachment_unregisterallhandlers(bus: alljoyn_busattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers(bus)

public actual fun alljoyn_busattachment_unregisterapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener(bus, listener)

public actual fun alljoyn_busattachment_unregisterbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener(bus, listener)
}

public actual fun alljoyn_busattachment_unregisterbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject(bus, obj)
}

public actual fun alljoyn_busattachment_unregistersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_unregistersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_whoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface(bus, implementsinterface)

public actual fun alljoyn_busattachment_whoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces(bus, implementsinterfaces, numberinterfaces.toLong())

public actual fun alljoyn_buslistener_create(callbacks: Long, context: Long): alljoyn_buslistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create(callbacks, context)

public actual fun alljoyn_buslistener_destroy(listener: alljoyn_buslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy(listener)
}

public actual fun alljoyn_busobject_addinterface(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface(bus, iface)

public actual fun alljoyn_busobject_addinterface_announced(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced(bus, iface)

public actual fun alljoyn_busobject_addmethodhandler(bus: alljoyn_busobject, member: alljoyn_interfacedescription_member, handler: alljoyn_messagereceiver_methodhandler_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_busobject_addmethodhandlers(bus: alljoyn_busobject, entries: Long, numentries: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers(bus, entries, numentries.toLong())

public actual fun alljoyn_busobject_cancelsessionlessmessage(bus: alljoyn_busobject, msg: alljoyn_message): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage(bus, msg)

public actual fun alljoyn_busobject_cancelsessionlessmessage_serial(bus: alljoyn_busobject, serialnumber: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial(bus, serialnumber.toInt())

public actual fun alljoyn_busobject_create(path: PCSTR, isplaceholder: Int, callbacks_in: Long, context_in: Long): alljoyn_busobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create(path, isplaceholder, callbacks_in, context_in)

public actual fun alljoyn_busobject_destroy(bus: alljoyn_busobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy(bus)
}

public actual fun alljoyn_busobject_emitpropertieschanged(bus: alljoyn_busobject, ifcname: PCSTR, propnames: Long, numprops: ULong, id: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged(bus, ifcname, propnames, numprops.toLong(), id.toInt())
}

public actual fun alljoyn_busobject_emitpropertychanged(bus: alljoyn_busobject, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg, id: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged(bus, ifcname, propname, value, id.toInt())
}

public actual fun alljoyn_busobject_getannouncedinterfacenames(bus: alljoyn_busobject, interfaces: Long, numinterfaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames(bus, interfaces, numinterfaces.toLong()).toULong()

public actual fun alljoyn_busobject_getbusattachment(bus: alljoyn_busobject): alljoyn_busattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment(bus)

public actual fun alljoyn_busobject_getname(bus: alljoyn_busobject, buffer: PCSTR, buffersz: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname(bus, buffer, buffersz.toLong()).toULong()

public actual fun alljoyn_busobject_getpath(bus: alljoyn_busobject): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath(bus)

public actual fun alljoyn_busobject_issecure(bus: alljoyn_busobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure(bus)

public actual fun alljoyn_busobject_methodreply_args(bus: alljoyn_busobject, msg: alljoyn_message, args: alljoyn_msgarg, numargs: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args(bus, msg, args, numargs.toLong())

public actual fun alljoyn_busobject_methodreply_err(bus: alljoyn_busobject, msg: alljoyn_message, error: PCSTR, errormessage: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err(bus, msg, error, errormessage)

public actual fun alljoyn_busobject_methodreply_status(bus: alljoyn_busobject, msg: alljoyn_message, status: QStatus): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status(bus, msg, status)

public actual fun alljoyn_busobject_setannounceflag(bus: alljoyn_busobject, iface: alljoyn_interfacedescription, isannounced: alljoyn_about_announceflag): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag(bus, iface, isannounced)

public actual fun alljoyn_busobject_signal(bus: alljoyn_busobject, destination: PCSTR, sessionid: UInt, signal: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: alljoyn_message): QStatus =
    0

public actual fun alljoyn_credentials_clear(cred: alljoyn_credentials) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear(cred)
}

public actual fun alljoyn_credentials_create(): alljoyn_credentials =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create()

public actual fun alljoyn_credentials_destroy(cred: alljoyn_credentials) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy(cred)
}

public actual fun alljoyn_credentials_getcertchain(cred: alljoyn_credentials): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain(cred)

public actual fun alljoyn_credentials_getexpiration(cred: alljoyn_credentials): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration(cred).toUInt()

public actual fun alljoyn_credentials_getlogonentry(cred: alljoyn_credentials): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry(cred)

public actual fun alljoyn_credentials_getpassword(cred: alljoyn_credentials): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword(cred)

public actual fun alljoyn_credentials_getprivateKey(cred: alljoyn_credentials): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey(cred)

public actual fun alljoyn_credentials_getusername(cred: alljoyn_credentials): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername(cred)

public actual fun alljoyn_credentials_isset(cred: alljoyn_credentials, creds: UShort): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset(cred, creds.toShort())

public actual fun alljoyn_credentials_setcertchain(cred: alljoyn_credentials, certchain: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain(cred, certchain)
}

public actual fun alljoyn_credentials_setexpiration(cred: alljoyn_credentials, expiration: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration(cred, expiration.toInt())
}

public actual fun alljoyn_credentials_setlogonentry(cred: alljoyn_credentials, logonentry: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry(cred, logonentry)
}

public actual fun alljoyn_credentials_setpassword(cred: alljoyn_credentials, pwd: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword(cred, pwd)
}

public actual fun alljoyn_credentials_setprivatekey(cred: alljoyn_credentials, pk: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey(cred, pk)
}

public actual fun alljoyn_credentials_setusername(cred: alljoyn_credentials, username: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername(cred, username)
}

public actual fun alljoyn_getbuildinfo(): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo()

public actual fun alljoyn_getnumericversion(): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion().toUInt()

public actual fun alljoyn_getversion(): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_getversion()

public actual fun alljoyn_init(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_init()

public actual fun alljoyn_interfacedescription_activate(iface: alljoyn_interfacedescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate(iface)
}

public actual fun alljoyn_interfacedescription_addannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation(iface, name, value)

public actual fun alljoyn_interfacedescription_addargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation(iface, member, argname, name, value)

public actual fun alljoyn_interfacedescription_addmember(iface: alljoyn_interfacedescription, type: alljoyn_messagetype, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember(iface, type, name, inputsig, outsig, argnames, annotation.toByte())

public actual fun alljoyn_interfacedescription_addmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation(iface, member, name, value)

public actual fun alljoyn_interfacedescription_addmethod(iface: alljoyn_interfacedescription, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod(iface, name, inputsig, outsig, argnames, annotation.toByte(), accessperms)

public actual fun alljoyn_interfacedescription_addproperty(iface: alljoyn_interfacedescription, name: PCSTR, signature: PCSTR, access: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty(iface, name, signature, access.toByte())

public actual fun alljoyn_interfacedescription_addpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation(iface, property, name, value)

public actual fun alljoyn_interfacedescription_addsignal(iface: alljoyn_interfacedescription, name: PCSTR, sig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal(iface, name, sig, argnames, annotation.toByte(), accessperms)

public actual fun alljoyn_interfacedescription_eql(one: alljoyn_interfacedescription, other: alljoyn_interfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql(one, other)

public actual fun alljoyn_interfacedescription_getannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR, value_size: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation(iface, name, value, value_size)

public actual fun alljoyn_interfacedescription_getannotationatindex(iface: alljoyn_interfacedescription, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex(iface, index.toLong(), name, name_size, value, value_size)
}

public actual fun alljoyn_interfacedescription_getannotationscount(iface: alljoyn_interfacedescription): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount(iface).toULong()

public actual fun alljoyn_interfacedescription_getargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage(iface, member, arg, description, maxlanguagelength.toLong(), languagetag).toULong()

public actual fun alljoyn_interfacedescription_getdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage(iface, description, maxlanguagelength.toLong(), languagetag).toULong()

public actual fun alljoyn_interfacedescription_getdescriptionlanguages(iface: alljoyn_interfacedescription, languages: Long, size: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages(iface, languages, size.toLong()).toULong()

public actual fun alljoyn_interfacedescription_getdescriptionlanguages2(iface: alljoyn_interfacedescription, languages: PCSTR, languagessize: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2(iface, languages, languagessize.toLong()).toULong()

public actual fun alljoyn_interfacedescription_getdescriptiontranslationcallback(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_translation_callback_ptr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback(iface)

public actual fun alljoyn_interfacedescription_getmember(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember(iface, name, member)

public actual fun alljoyn_interfacedescription_getmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation(iface, member, name, value, value_size)

public actual fun alljoyn_interfacedescription_getmemberargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation(iface, member, argname, name, value, value_size)

public actual fun alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface, member, description, maxlanguagelength.toLong(), languagetag).toULong()

public actual fun alljoyn_interfacedescription_getmembers(iface: alljoyn_interfacedescription, members: Long, nummembers: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers(iface, members, nummembers.toLong()).toULong()

public actual fun alljoyn_interfacedescription_getmethod(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod(iface, name, member)

public actual fun alljoyn_interfacedescription_getname(iface: alljoyn_interfacedescription): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname(iface)

public actual fun alljoyn_interfacedescription_getproperties(iface: alljoyn_interfacedescription, props: Long, numprops: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties(iface, props, numprops.toLong()).toULong()

public actual fun alljoyn_interfacedescription_getproperty(iface: alljoyn_interfacedescription, name: PCSTR, property: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty(iface, name, property)

public actual fun alljoyn_interfacedescription_getpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR, str_size: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation(iface, property, name, value, str_size)

public actual fun alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, property: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface, property, description, maxlanguagelength.toLong(), languagetag).toULong()

public actual fun alljoyn_interfacedescription_getsecuritypolicy(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_securitypolicy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy(iface)

public actual fun alljoyn_interfacedescription_getsignal(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal(iface, name, member)

public actual fun alljoyn_interfacedescription_hasdescription(iface: alljoyn_interfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription(iface)

public actual fun alljoyn_interfacedescription_hasmember(iface: alljoyn_interfacedescription, name: PCSTR, insig: PCSTR, outsig: PCSTR): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember(iface, name, insig, outsig)

public actual fun alljoyn_interfacedescription_hasproperties(iface: alljoyn_interfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties(iface)

public actual fun alljoyn_interfacedescription_hasproperty(iface: alljoyn_interfacedescription, name: PCSTR): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty(iface, name)

public actual fun alljoyn_interfacedescription_introspect(iface: alljoyn_interfacedescription, str: PCSTR, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect(iface, str, buf.toLong(), indent.toLong()).toULong()

public actual fun alljoyn_interfacedescription_issecure(iface: alljoyn_interfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure(iface)

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
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription(iface, member, argname, description)

public actual fun alljoyn_interfacedescription_setargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage(iface, member, arg, description, languagetag)

public actual fun alljoyn_interfacedescription_setdescription(iface: alljoyn_interfacedescription, description: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription(iface, description)
}

public actual fun alljoyn_interfacedescription_setdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, languagetag: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage(iface, description, languagetag)

public actual fun alljoyn_interfacedescription_setdescriptionlanguage(iface: alljoyn_interfacedescription, language: PCSTR) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage(iface, language)
}

public actual fun alljoyn_interfacedescription_setdescriptiontranslationcallback(iface: alljoyn_interfacedescription, translationcallback: alljoyn_interfacedescription_translation_callback_ptr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback(iface, translationcallback.toLong())
}

public actual fun alljoyn_interfacedescription_setmemberdescription(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription(iface, member, description)

public actual fun alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface, member, description, languagetag)

public actual fun alljoyn_interfacedescription_setpropertydescription(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription(iface, name, description)

public actual fun alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface, name, description, languagetag)

public actual fun alljoyn_keystorelistener_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create(callbacks, context)

public actual fun alljoyn_keystorelistener_destroy(listener: alljoyn_keystorelistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy(listener)
}

public actual fun alljoyn_keystorelistener_getkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, sink: PCSTR, sink_sz: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys(listener, keystore, sink, sink_sz)

public actual fun alljoyn_keystorelistener_putkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, source: PCSTR, password: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys(listener, keystore, source, password)

public actual fun alljoyn_keystorelistener_with_synchronization_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create(callbacks, context)

public actual fun alljoyn_message_create(bus: alljoyn_busattachment): alljoyn_message =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_create(bus)

public actual fun alljoyn_message_description(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_description(msg, str, buf.toLong()).toULong()

public actual fun alljoyn_message_destroy(msg: alljoyn_message) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy(msg)
}

public actual fun alljoyn_message_eql(one: alljoyn_message, other: alljoyn_message): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql(one, other)

public actual fun alljoyn_message_getarg(msg: alljoyn_message, argn: ULong): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg(msg, argn.toLong())

public actual fun alljoyn_message_getargs(msg: alljoyn_message, numargs: Long, args: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs(msg, numargs, args)
}

public actual fun alljoyn_message_getauthmechanism(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism(msg)

public actual fun alljoyn_message_getcallserial(msg: alljoyn_message): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial(msg).toUInt()

public actual fun alljoyn_message_getcompressiontoken(msg: alljoyn_message): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken(msg).toUInt()

public actual fun alljoyn_message_getdestination(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination(msg)

public actual fun alljoyn_message_geterrorname(msg: alljoyn_message, errormessage: PCSTR, errormessage_size: Long): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname(msg, errormessage, errormessage_size)

public actual fun alljoyn_message_getflags(msg: alljoyn_message): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags(msg).toUByte()

public actual fun alljoyn_message_getinterface(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface(msg)

public actual fun alljoyn_message_getmembername(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername(msg)

public actual fun alljoyn_message_getobjectpath(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath(msg)

public actual fun alljoyn_message_getreceiveendpointname(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname(msg)

public actual fun alljoyn_message_getreplyserial(msg: alljoyn_message): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial(msg).toUInt()

public actual fun alljoyn_message_getsender(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender(msg)

public actual fun alljoyn_message_getsessionid(msg: alljoyn_message): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid(msg).toUInt()

public actual fun alljoyn_message_getsignature(msg: alljoyn_message): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature(msg)

public actual fun alljoyn_message_gettimestamp(msg: alljoyn_message): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp(msg).toUInt()

public actual fun alljoyn_message_gettype(msg: alljoyn_message): alljoyn_messagetype =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype(msg)

public actual fun alljoyn_message_isbroadcastsignal(msg: alljoyn_message): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal(msg)

public actual fun alljoyn_message_isencrypted(msg: alljoyn_message): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted(msg)

public actual fun alljoyn_message_isexpired(msg: alljoyn_message, tillexpirems: Long): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired(msg, tillexpirems)

public actual fun alljoyn_message_isglobalbroadcast(msg: alljoyn_message): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast(msg)

public actual fun alljoyn_message_issessionless(msg: alljoyn_message): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless(msg)

public actual fun alljoyn_message_isunreliable(msg: alljoyn_message): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable(msg)

public actual fun alljoyn_message_parseargs(msg: alljoyn_message, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_message_setendianess(endian: Byte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess(endian)
}

public actual fun alljoyn_message_tostring(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring(msg, str, buf.toLong()).toULong()

public actual fun alljoyn_msgarg_array_create(size: ULong): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create(size.toLong())

public actual fun alljoyn_msgarg_array_element(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element(arg, index.toLong())

public actual fun alljoyn_msgarg_array_get(args: alljoyn_msgarg, numargs: ULong, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set(args: alljoyn_msgarg, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set_offset(args: alljoyn_msgarg, argoffset: ULong, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_signature(values: alljoyn_msgarg, numvalues: ULong, str: PCSTR, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature(values, numvalues.toLong(), str, buf.toLong()).toULong()

public actual fun alljoyn_msgarg_array_tostring(args: alljoyn_msgarg, numargs: ULong, str: PCSTR, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring(args, numargs.toLong(), str, buf.toLong(), indent.toLong()).toULong()

public actual fun alljoyn_msgarg_clear(arg: alljoyn_msgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear(arg)
}

public actual fun alljoyn_msgarg_clone(destination: alljoyn_msgarg, source: alljoyn_msgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone(destination, source)
}

public actual fun alljoyn_msgarg_copy(source: alljoyn_msgarg): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy(source)

public actual fun alljoyn_msgarg_create(): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create()

public actual fun alljoyn_msgarg_create_and_set(signature: PCSTR): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_destroy(arg: alljoyn_msgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy(arg)
}

public actual fun alljoyn_msgarg_equal(lhv: alljoyn_msgarg, rhv: alljoyn_msgarg): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal(lhv, rhv)

public actual fun alljoyn_msgarg_get(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_get_array_element(arg: alljoyn_msgarg, index: ULong, element: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element(arg, index.toLong(), element)
}

public actual fun alljoyn_msgarg_get_array_elementsignature(arg: alljoyn_msgarg, index: ULong): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature(arg, index.toLong())

public actual fun alljoyn_msgarg_get_array_numberofelements(arg: alljoyn_msgarg): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements(arg).toULong()

public actual fun alljoyn_msgarg_get_bool(arg: alljoyn_msgarg, b: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool(arg, b)

public actual fun alljoyn_msgarg_get_bool_array(arg: alljoyn_msgarg, length: Long, ab: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array(arg, length, ab)

public actual fun alljoyn_msgarg_get_double(arg: alljoyn_msgarg, d: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double(arg, d)

public actual fun alljoyn_msgarg_get_double_array(arg: alljoyn_msgarg, length: Long, ad: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array(arg, length, ad)

public actual fun alljoyn_msgarg_get_int16(arg: alljoyn_msgarg, n: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16(arg, n)

public actual fun alljoyn_msgarg_get_int16_array(arg: alljoyn_msgarg, length: Long, an: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array(arg, length, an)

public actual fun alljoyn_msgarg_get_int32(arg: alljoyn_msgarg, i: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32(arg, i)

public actual fun alljoyn_msgarg_get_int32_array(arg: alljoyn_msgarg, length: Long, ai: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array(arg, length, ai)

public actual fun alljoyn_msgarg_get_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64(arg, x)

public actual fun alljoyn_msgarg_get_int64_array(arg: alljoyn_msgarg, length: Long, ax: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array(arg, length, ax)

public actual fun alljoyn_msgarg_get_objectpath(arg: alljoyn_msgarg, o: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath(arg, o)

public actual fun alljoyn_msgarg_get_signature(arg: alljoyn_msgarg, g: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature(arg, g)

public actual fun alljoyn_msgarg_get_string(arg: alljoyn_msgarg, s: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string(arg, s)

public actual fun alljoyn_msgarg_get_uint16(arg: alljoyn_msgarg, q: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16(arg, q)

public actual fun alljoyn_msgarg_get_uint16_array(arg: alljoyn_msgarg, length: Long, aq: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array(arg, length, aq)

public actual fun alljoyn_msgarg_get_uint32(arg: alljoyn_msgarg, u: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32(arg, u)

public actual fun alljoyn_msgarg_get_uint32_array(arg: alljoyn_msgarg, length: Long, au: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array(arg, length, au)

public actual fun alljoyn_msgarg_get_uint64(arg: alljoyn_msgarg, t: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64(arg, t)

public actual fun alljoyn_msgarg_get_uint64_array(arg: alljoyn_msgarg, length: Long, at: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array(arg, length, at)

public actual fun alljoyn_msgarg_get_uint8(arg: alljoyn_msgarg, y: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8(arg, y)

public actual fun alljoyn_msgarg_get_uint8_array(arg: alljoyn_msgarg, length: Long, ay: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array(arg, length, ay)

public actual fun alljoyn_msgarg_get_variant(arg: alljoyn_msgarg, v: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant(arg, v)

public actual fun alljoyn_msgarg_get_variant_array(arg: alljoyn_msgarg, signature: PCSTR, length: Long, av: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array(arg, signature, length, av)

public actual fun alljoyn_msgarg_getdictelement(arg: alljoyn_msgarg, elemsig: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_getkey(arg: alljoyn_msgarg): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey(arg)

public actual fun alljoyn_msgarg_getmember(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember(arg, index.toLong())

public actual fun alljoyn_msgarg_getnummembers(arg: alljoyn_msgarg): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers(arg).toULong()

public actual fun alljoyn_msgarg_gettype(arg: alljoyn_msgarg): alljoyn_typeid =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype(arg)

public actual fun alljoyn_msgarg_getvalue(arg: alljoyn_msgarg): alljoyn_msgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue(arg)

public actual fun alljoyn_msgarg_hassignature(arg: alljoyn_msgarg, signature: PCSTR): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature(arg, signature)

public actual fun alljoyn_msgarg_set(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_and_stabilize(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_bool(arg: alljoyn_msgarg, b: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool(arg, b)

public actual fun alljoyn_msgarg_set_bool_array(arg: alljoyn_msgarg, length: ULong, ab: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array(arg, length.toLong(), ab)

public actual fun alljoyn_msgarg_set_double(arg: alljoyn_msgarg, d: Double): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double(arg, d)

public actual fun alljoyn_msgarg_set_double_array(arg: alljoyn_msgarg, length: ULong, ad: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array(arg, length.toLong(), ad)

public actual fun alljoyn_msgarg_set_int16(arg: alljoyn_msgarg, n: Short): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16(arg, n)

public actual fun alljoyn_msgarg_set_int16_array(arg: alljoyn_msgarg, length: ULong, an: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array(arg, length.toLong(), an)

public actual fun alljoyn_msgarg_set_int32(arg: alljoyn_msgarg, i: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32(arg, i)

public actual fun alljoyn_msgarg_set_int32_array(arg: alljoyn_msgarg, length: ULong, ai: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array(arg, length.toLong(), ai)

public actual fun alljoyn_msgarg_set_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64(arg, x)

public actual fun alljoyn_msgarg_set_int64_array(arg: alljoyn_msgarg, length: ULong, ax: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array(arg, length.toLong(), ax)

public actual fun alljoyn_msgarg_set_objectpath(arg: alljoyn_msgarg, o: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath(arg, o)

public actual fun alljoyn_msgarg_set_objectpath_array(arg: alljoyn_msgarg, length: ULong, ao: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array(arg, length.toLong(), ao)

public actual fun alljoyn_msgarg_set_signature(arg: alljoyn_msgarg, g: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature(arg, g)

public actual fun alljoyn_msgarg_set_signature_array(arg: alljoyn_msgarg, length: ULong, ag: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array(arg, length.toLong(), ag)

public actual fun alljoyn_msgarg_set_string(arg: alljoyn_msgarg, s: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string(arg, s)

public actual fun alljoyn_msgarg_set_string_array(arg: alljoyn_msgarg, length: ULong, asTarget: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array(arg, length.toLong(), asTarget)

public actual fun alljoyn_msgarg_set_uint16(arg: alljoyn_msgarg, q: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16(arg, q.toShort())

public actual fun alljoyn_msgarg_set_uint16_array(arg: alljoyn_msgarg, length: ULong, aq: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array(arg, length.toLong(), aq)

public actual fun alljoyn_msgarg_set_uint32(arg: alljoyn_msgarg, u: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32(arg, u.toInt())

public actual fun alljoyn_msgarg_set_uint32_array(arg: alljoyn_msgarg, length: ULong, au: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array(arg, length.toLong(), au)

public actual fun alljoyn_msgarg_set_uint64(arg: alljoyn_msgarg, t: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64(arg, t.toLong())

public actual fun alljoyn_msgarg_set_uint64_array(arg: alljoyn_msgarg, length: ULong, at: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array(arg, length.toLong(), at)

public actual fun alljoyn_msgarg_set_uint8(arg: alljoyn_msgarg, y: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8(arg, y.toByte())

public actual fun alljoyn_msgarg_set_uint8_array(arg: alljoyn_msgarg, length: ULong, ay: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array(arg, length.toLong(), ay)

public actual fun alljoyn_msgarg_setdictentry(arg: alljoyn_msgarg, key: alljoyn_msgarg, value: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry(arg, key, value)

public actual fun alljoyn_msgarg_setstruct(arg: alljoyn_msgarg, struct_members: alljoyn_msgarg, num_members: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct(arg, struct_members, num_members.toLong())

public actual fun alljoyn_msgarg_signature(arg: alljoyn_msgarg, str: PCSTR, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature(arg, str, buf.toLong()).toULong()

public actual fun alljoyn_msgarg_stabilize(arg: alljoyn_msgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize(arg)
}

public actual fun alljoyn_msgarg_tostring(arg: alljoyn_msgarg, str: PCSTR, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring(arg, str, buf.toLong(), indent.toLong()).toULong()

public actual fun alljoyn_observer_create(bus: alljoyn_busattachment, mandatoryinterfaces: Long, nummandatoryinterfaces: ULong): alljoyn_observer =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create(bus, mandatoryinterfaces, nummandatoryinterfaces.toLong())

public actual fun alljoyn_observer_destroy(observer: alljoyn_observer) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy(observer)
}

public actual fun alljoyn_observer_get(observer: alljoyn_observer, uniquebusname: PCSTR, objectpath: PCSTR): alljoyn_proxybusobject_ref =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get(observer, uniquebusname, objectpath)

public actual fun alljoyn_observer_getfirst(observer: alljoyn_observer): alljoyn_proxybusobject_ref =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst(observer)

public actual fun alljoyn_observer_getnext(observer: alljoyn_observer, proxyref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject_ref =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext(observer, proxyref)

public actual fun alljoyn_observer_registerlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener, triggeronexisting: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener(observer, listener, triggeronexisting)
}

public actual fun alljoyn_observer_unregisteralllisteners(observer: alljoyn_observer) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners(observer)
}

public actual fun alljoyn_observer_unregisterlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener(observer, listener)
}

public actual fun alljoyn_observerlistener_create(callback: Long, context: Long): alljoyn_observerlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create(callback, context)

public actual fun alljoyn_observerlistener_destroy(listener: alljoyn_observerlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy(listener)
}

public actual fun alljoyn_passwordmanager_setcredentials(authmechanism: PCSTR, password: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials(authmechanism, password)

public actual fun alljoyn_permissionconfigurationlistener_create(callbacks: Long, context: Long): alljoyn_permissionconfigurationlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create(callbacks, context)

public actual fun alljoyn_permissionconfigurationlistener_destroy(listener: alljoyn_permissionconfigurationlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy(listener)
}

public actual fun alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain)
}

public actual fun alljoyn_permissionconfigurator_certificateid_cleanup(certificateid: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup(certificateid)
}

public actual fun alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray)
}

public actual fun alljoyn_permissionconfigurator_claim(configurator: alljoyn_permissionconfigurator, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim(configurator, cakey, identitycertificatechain, groupid, groupsize.toLong(), groupauthority, manifestsxmls, manifestscount.toLong())

public actual fun alljoyn_permissionconfigurator_endmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement(configurator)

public actual fun alljoyn_permissionconfigurator_getapplicationstate(configurator: alljoyn_permissionconfigurator, state: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate(configurator, state)

public actual fun alljoyn_permissionconfigurator_getclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities(configurator, claimcapabilities)

public actual fun alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator, additionalinfo)

public actual fun alljoyn_permissionconfigurator_getdefaultclaimcapabilities(): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities().toUShort()

public actual fun alljoyn_permissionconfigurator_getdefaultpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy(configurator, policyxml)

public actual fun alljoyn_permissionconfigurator_getidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity(configurator, identitycertificatechain)

public actual fun alljoyn_permissionconfigurator_getidentitycertificateid(configurator: alljoyn_permissionconfigurator, certificateid: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid(configurator, certificateid)

public actual fun alljoyn_permissionconfigurator_getmanifests(configurator: alljoyn_permissionconfigurator, manifestarray: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests(configurator, manifestarray)

public actual fun alljoyn_permissionconfigurator_getmanifesttemplate(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate(configurator, manifesttemplatexml)

public actual fun alljoyn_permissionconfigurator_getmembershipsummaries(configurator: alljoyn_permissionconfigurator, certificateids: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries(configurator, certificateids)

public actual fun alljoyn_permissionconfigurator_getpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy(configurator, policyxml)

public actual fun alljoyn_permissionconfigurator_getpublickey(configurator: alljoyn_permissionconfigurator, publickey: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey(configurator, publickey)

public actual fun alljoyn_permissionconfigurator_installmanifests(configurator: alljoyn_permissionconfigurator, manifestsxmls: Long, manifestscount: ULong, append: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests(configurator, manifestsxmls, manifestscount.toLong(), append)

public actual fun alljoyn_permissionconfigurator_installmembership(configurator: alljoyn_permissionconfigurator, membershipcertificatechain: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership(configurator, membershipcertificatechain)

public actual fun alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray)
}

public actual fun alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml)
}

public actual fun alljoyn_permissionconfigurator_policy_destroy(policyxml: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy(policyxml)
}

public actual fun alljoyn_permissionconfigurator_publickey_destroy(publickey: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy(publickey)
}

public actual fun alljoyn_permissionconfigurator_removemembership(configurator: alljoyn_permissionconfigurator, serial: Long, seriallen: ULong, issuerpublickey: Long, issueraki: Long, issuerakilen: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership(configurator, serial, seriallen.toLong(), issuerpublickey, issueraki, issuerakilen.toLong())

public actual fun alljoyn_permissionconfigurator_reset(configurator: alljoyn_permissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset(configurator)

public actual fun alljoyn_permissionconfigurator_resetpolicy(configurator: alljoyn_permissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy(configurator)

public actual fun alljoyn_permissionconfigurator_setapplicationstate(configurator: alljoyn_permissionconfigurator, state: alljoyn_applicationstate): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate(configurator, state)

public actual fun alljoyn_permissionconfigurator_setclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities(configurator, claimcapabilities.toShort())

public actual fun alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator, additionalinfo.toShort())

public actual fun alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator, manifesttemplatexml)

public actual fun alljoyn_permissionconfigurator_startmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement(configurator)

public actual fun alljoyn_permissionconfigurator_updateidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity(configurator, identitycertificatechain, manifestsxmls, manifestscount.toLong())

public actual fun alljoyn_permissionconfigurator_updatepolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy(configurator, policyxml)

public actual fun alljoyn_pinglistener_create(callback: Long, context: Long): alljoyn_pinglistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create(callback, context)

public actual fun alljoyn_pinglistener_destroy(listener: alljoyn_pinglistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy(listener)
}

public actual fun alljoyn_proxybusobject_addchild(proxyobj: alljoyn_proxybusobject, child: alljoyn_proxybusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild(proxyobj, child)

public actual fun alljoyn_proxybusobject_addinterface(proxyobj: alljoyn_proxybusobject, iface: alljoyn_interfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface(proxyobj, iface)

public actual fun alljoyn_proxybusobject_addinterface_by_name(proxyobj: alljoyn_proxybusobject, name: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name(proxyobj, name)

public actual fun alljoyn_proxybusobject_copy(source: alljoyn_proxybusobject): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy(source)

public actual fun alljoyn_proxybusobject_create(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create(bus, service, path, sessionid.toInt())

public actual fun alljoyn_proxybusobject_create_secure(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure(bus, service, path, sessionid.toInt())

public actual fun alljoyn_proxybusobject_destroy(proxyobj: alljoyn_proxybusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy(proxyobj)
}

public actual fun alljoyn_proxybusobject_enablepropertycaching(proxyobj: alljoyn_proxybusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching(proxyobj)
}

public actual fun alljoyn_proxybusobject_getallproperties(proxyobj: alljoyn_proxybusobject, iface: PCSTR, values: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties(proxyobj, iface, values)

public actual fun alljoyn_proxybusobject_getallpropertiesasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_getallpropertiescb_ptr, timeout: UInt, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync(proxyobj, iface, callback.toLong(), timeout.toInt(), context)

public actual fun alljoyn_proxybusobject_getchild(proxyobj: alljoyn_proxybusobject, path: PCSTR): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild(proxyobj, path)

public actual fun alljoyn_proxybusobject_getchildren(proxyobj: alljoyn_proxybusobject, children: Long, numchildren: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren(proxyobj, children, numchildren.toLong()).toULong()

public actual fun alljoyn_proxybusobject_getinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): alljoyn_interfacedescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface(proxyobj, iface)

public actual fun alljoyn_proxybusobject_getinterfaces(proxyobj: alljoyn_proxybusobject, ifaces: Long, numifaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces(proxyobj, ifaces, numifaces.toLong()).toULong()

public actual fun alljoyn_proxybusobject_getpath(proxyobj: alljoyn_proxybusobject): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath(proxyobj)

public actual fun alljoyn_proxybusobject_getproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty(proxyobj, iface, property, value)

public actual fun alljoyn_proxybusobject_getpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, callback: alljoyn_proxybusobject_listener_getpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync(proxyobj, iface, property, callback.toLong(), timeout.toInt(), context)

public actual fun alljoyn_proxybusobject_getservicename(proxyobj: alljoyn_proxybusobject): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename(proxyobj)

public actual fun alljoyn_proxybusobject_getsessionid(proxyobj: alljoyn_proxybusobject): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid(proxyobj).toUInt()

public actual fun alljoyn_proxybusobject_getuniquename(proxyobj: alljoyn_proxybusobject): PCSTR =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename(proxyobj)

public actual fun alljoyn_proxybusobject_implementsinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface(proxyobj, iface)

public actual fun alljoyn_proxybusobject_introspectremoteobject(proxyobj: alljoyn_proxybusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject(proxyobj)

public actual fun alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj: alljoyn_proxybusobject, callback: alljoyn_proxybusobject_listener_introspectcb_ptr, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj, callback.toLong(), context)

public actual fun alljoyn_proxybusobject_issecure(proxyobj: alljoyn_proxybusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure(proxyobj)

public actual fun alljoyn_proxybusobject_isvalid(proxyobj: alljoyn_proxybusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid(proxyobj)

public actual fun alljoyn_proxybusobject_methodcall(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall(proxyobj, ifacename, methodname, args, numargs.toLong(), replymsg, timeout.toInt(), flags.toByte())

public actual fun alljoyn_proxybusobject_methodcall_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_member_noreply(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_noreply(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply(proxyobj, ifacename, methodname, args, numargs.toLong(), flags.toByte())

public actual fun alljoyn_proxybusobject_methodcallasync(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync(proxyobj, ifacename, methodname, replyfunc.toLong(), args, numargs.toLong(), context, timeout.toInt(), flags.toByte())

public actual fun alljoyn_proxybusobject_methodcallasync_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_parsexml(proxyobj: alljoyn_proxybusobject, xml: PCSTR, identifier: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml(proxyobj, xml, identifier)

public actual fun alljoyn_proxybusobject_ref_create(proxy: alljoyn_proxybusobject): alljoyn_proxybusobject_ref =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create(proxy)

public actual fun alljoyn_proxybusobject_ref_decref(ref: alljoyn_proxybusobject_ref) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref(ref)
}

public actual fun alljoyn_proxybusobject_ref_get(ref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get(ref)

public actual fun alljoyn_proxybusobject_ref_incref(ref: alljoyn_proxybusobject_ref) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref(ref)
}

public actual fun alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, properties: Long, numproperties: ULong, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj, iface, properties, numproperties.toLong(), callback.toLong(), context)

public actual fun alljoyn_proxybusobject_removechild(proxyobj: alljoyn_proxybusobject, path: PCSTR): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild(proxyobj, path)

public actual fun alljoyn_proxybusobject_secureconnection(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection(proxyobj, forceauth)

public actual fun alljoyn_proxybusobject_secureconnectionasync(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync(proxyobj, forceauth)

public actual fun alljoyn_proxybusobject_setproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty(proxyobj, iface, property, value)

public actual fun alljoyn_proxybusobject_setpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg, callback: alljoyn_proxybusobject_listener_setpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync(proxyobj, iface, property, value, callback.toLong(), timeout.toInt(), context)

public actual fun alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj, iface, callback.toLong())

public actual fun alljoyn_routerinit(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit()

public actual fun alljoyn_routerinitwithconfig(configxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig(configxml)

public actual fun alljoyn_routershutdown(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown()

public actual fun alljoyn_securityapplicationproxy_claim(proxy: alljoyn_securityapplicationproxy, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim(proxy, cakey, identitycertificatechain, groupid, groupsize.toLong(), groupauthority, manifestsxmls, manifestscount.toLong())

public actual fun alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml, identitycertificatepem, digest, digestsize)

public actual fun alljoyn_securityapplicationproxy_create(bus: alljoyn_busattachment, appbusname: Long, sessionid: UInt): alljoyn_securityapplicationproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create(bus, appbusname, sessionid.toInt())

public actual fun alljoyn_securityapplicationproxy_destroy(proxy: alljoyn_securityapplicationproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy(proxy)
}

public actual fun alljoyn_securityapplicationproxy_digest_destroy(digest: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy(digest)
}

public actual fun alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey)
}

public actual fun alljoyn_securityapplicationproxy_endmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement(proxy)

public actual fun alljoyn_securityapplicationproxy_getapplicationstate(proxy: alljoyn_securityapplicationproxy, applicationstate: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate(proxy, applicationstate)

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: alljoyn_securityapplicationproxy, capabilities: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities(proxy, capabilities)

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: alljoyn_securityapplicationproxy, additionalinfo: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy, additionalinfo)

public actual fun alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy(proxy, policyxml)

public actual fun alljoyn_securityapplicationproxy_geteccpublickey(proxy: alljoyn_securityapplicationproxy, eccpublickey: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey(proxy, eccpublickey)

public actual fun alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: alljoyn_securityapplicationproxy, manifesttemplatexml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate(proxy, manifesttemplatexml)

public actual fun alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport().toUShort()

public actual fun alljoyn_securityapplicationproxy_getpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy(proxy, policyxml)

public actual fun alljoyn_securityapplicationproxy_installmembership(proxy: alljoyn_securityapplicationproxy, membershipcertificatechain: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership(proxy, membershipcertificatechain)

public actual fun alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml)
}

public actual fun alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml)
}

public actual fun alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy(policyxml)
}

public actual fun alljoyn_securityapplicationproxy_reset(proxy: alljoyn_securityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset(proxy)

public actual fun alljoyn_securityapplicationproxy_resetpolicy(proxy: alljoyn_securityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy(proxy)

public actual fun alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: ULong, signedmanifestxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml, identitycertificatepem, signature, signaturesize.toLong(), signedmanifestxml)

public actual fun alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml, identitycertificatepem, signingprivatekeypem, signedmanifestxml)

public actual fun alljoyn_securityapplicationproxy_startmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement(proxy)

public actual fun alljoyn_securityapplicationproxy_updateidentity(proxy: alljoyn_securityapplicationproxy, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity(proxy, identitycertificatechain, manifestsxmls, manifestscount.toLong())

public actual fun alljoyn_securityapplicationproxy_updatepolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy(proxy, policyxml)

public actual fun alljoyn_sessionlistener_create(callbacks: Long, context: Long): alljoyn_sessionlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create(callbacks, context)

public actual fun alljoyn_sessionlistener_destroy(listener: alljoyn_sessionlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy(listener)
}

public actual fun alljoyn_sessionopts_cmp(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp(one, other)

public actual fun alljoyn_sessionopts_create(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): alljoyn_sessionopts =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create(traffic.toByte(), ismultipoint, proximity.toByte(), transports.toShort())

public actual fun alljoyn_sessionopts_destroy(opts: alljoyn_sessionopts) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy(opts)
}

public actual fun alljoyn_sessionopts_get_multipoint(opts: alljoyn_sessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint(opts)

public actual fun alljoyn_sessionopts_get_proximity(opts: alljoyn_sessionopts): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity(opts).toUByte()

public actual fun alljoyn_sessionopts_get_traffic(opts: alljoyn_sessionopts): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic(opts).toUByte()

public actual fun alljoyn_sessionopts_get_transports(opts: alljoyn_sessionopts): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports(opts).toUShort()

public actual fun alljoyn_sessionopts_iscompatible(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible(one, other)

public actual fun alljoyn_sessionopts_set_multipoint(opts: alljoyn_sessionopts, ismultipoint: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint(opts, ismultipoint)
}

public actual fun alljoyn_sessionopts_set_proximity(opts: alljoyn_sessionopts, proximity: UByte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity(opts, proximity.toByte())
}

public actual fun alljoyn_sessionopts_set_traffic(opts: alljoyn_sessionopts, traffic: UByte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic(opts, traffic.toByte())
}

public actual fun alljoyn_sessionopts_set_transports(opts: alljoyn_sessionopts, transports: UShort) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports(opts, transports.toShort())
}

public actual fun alljoyn_sessionportlistener_create(callbacks: Long, context: Long): alljoyn_sessionportlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create(callbacks, context)

public actual fun alljoyn_sessionportlistener_destroy(listener: alljoyn_sessionportlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy(listener)
}

public actual fun alljoyn_shutdown(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown()

public actual fun alljoyn_unity_deferred_callbacks_process(): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process()

public actual fun alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only)
}
