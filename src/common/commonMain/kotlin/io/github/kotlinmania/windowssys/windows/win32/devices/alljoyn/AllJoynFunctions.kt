package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface FnCallback {
    public operator fun invoke(status: QStatus, sessionid: UInt, opts: alljoyn_sessionopts, context: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(member: Long, srcpath: PCSTR, message: alljoyn_message)
}

public fun interface FnCallback2 {
    public operator fun invoke(status: QStatus, timeout: UInt, context: Long)
}

public fun interface FnCallback3 {
    public operator fun invoke(bus: alljoyn_busobject, member: Long, message: alljoyn_message)
}

public fun interface FnCallback4 {
    public operator fun invoke(sourcelanguage: PCSTR, targetlanguage: PCSTR, sourcetext: PCSTR): PCSTR
}

public fun interface FnCallback5 {
    public operator fun invoke(status: QStatus, obj: alljoyn_proxybusobject, values: alljoyn_msgarg, context: Long)
}

public fun interface FnCallback6 {
    public operator fun invoke(status: QStatus, obj: alljoyn_proxybusobject, context: Long)
}

public fun interface FnCallback7 {
    public operator fun invoke(message: alljoyn_message, context: Long)
}

public fun interface FnCallback8 {
    public operator fun invoke(obj: alljoyn_proxybusobject, ifacename: PCSTR, changed: alljoyn_msgarg, invalidated: alljoyn_msgarg, context: Long)
}

public fun AllJoynAcceptBusConnection(serverbushandle: HANDLE, abortevent: HANDLE): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynAcceptBusConnection", longArrayOf(serverbushandle, abortevent)).toUInt()
}

public fun AllJoynCloseBusHandle(bushandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynCloseBusHandle", longArrayOf(bushandle)).toInt()
}

public fun AllJoynConnectToBus(connectionspec: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynConnectToBus", longArrayOf(connectionspec))
}

public fun AllJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: Long): HANDLE {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynCreateBus", longArrayOf(outbuffersize.toLong(), inbuffersize.toLong(), lpsecurityattributes))
}

public fun AllJoynEnumEvents(connectedbushandle: HANDLE, eventtoreset: HANDLE, eventtypes: Long): BOOL {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynEnumEvents", longArrayOf(connectedbushandle, eventtoreset, eventtypes)).toInt()
}

public fun AllJoynEventSelect(connectedbushandle: HANDLE, eventhandle: HANDLE, eventtypes: UInt): BOOL {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynEventSelect", longArrayOf(connectedbushandle, eventhandle, eventtypes.toLong())).toInt()
}

public fun AllJoynReceiveFromBus(connectedbushandle: HANDLE, buffer: Long, bytestoread: UInt, bytestransferred: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynReceiveFromBus", longArrayOf(connectedbushandle, buffer, bytestoread.toLong(), bytestransferred, reserved)).toInt()
}

public fun AllJoynSendToBus(connectedbushandle: HANDLE, buffer: Long, bytestowrite: UInt, bytestransferred: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("msajapi.dll", "AllJoynSendToBus", longArrayOf(connectedbushandle, buffer, bytestowrite.toLong(), bytestransferred, reserved)).toInt()
}

public fun QCC_StatusText(status: QStatus): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "QCC_StatusText", longArrayOf(status.toLong()))
}

public fun alljoyn_aboutdata_create(defaultlanguage: PCSTR): alljoyn_aboutdata {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_create", longArrayOf(defaultlanguage))
}

public fun alljoyn_aboutdata_create_empty(): alljoyn_aboutdata {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_create_empty", longArrayOf())
}

public fun alljoyn_aboutdata_create_full(arg: alljoyn_msgarg, language: PCSTR): alljoyn_aboutdata {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_create_full", longArrayOf(arg, language))
}

public fun alljoyn_aboutdata_createfrommsgarg(data: alljoyn_aboutdata, arg: alljoyn_msgarg, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_createfrommsgarg", longArrayOf(data, arg, language)).toInt()
}

public fun alljoyn_aboutdata_createfromxml(data: alljoyn_aboutdata, aboutdataxml: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_createfromxml", longArrayOf(data, aboutdataxml)).toInt()
}

public fun alljoyn_aboutdata_destroy(data: alljoyn_aboutdata) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_destroy", longArrayOf(data))
}

public fun alljoyn_aboutdata_getaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getaboutdata", longArrayOf(data, msgarg, language)).toInt()
}

public fun alljoyn_aboutdata_getajsoftwareversion(data: alljoyn_aboutdata, ajsoftwareversion: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getajsoftwareversion", longArrayOf(data, ajsoftwareversion)).toInt()
}

public fun alljoyn_aboutdata_getannouncedaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getannouncedaboutdata", longArrayOf(data, msgarg)).toInt()
}

public fun alljoyn_aboutdata_getappid(data: alljoyn_aboutdata, appid: Long, num: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getappid", longArrayOf(data, appid, num)).toInt()
}

public fun alljoyn_aboutdata_getappname(data: alljoyn_aboutdata, appname: Long, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getappname", longArrayOf(data, appname, language)).toInt()
}

public fun alljoyn_aboutdata_getdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getdateofmanufacture", longArrayOf(data, dateofmanufacture)).toInt()
}

public fun alljoyn_aboutdata_getdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getdefaultlanguage", longArrayOf(data, defaultlanguage)).toInt()
}

public fun alljoyn_aboutdata_getdescription(data: alljoyn_aboutdata, description: Long, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getdescription", longArrayOf(data, description, language)).toInt()
}

public fun alljoyn_aboutdata_getdeviceid(data: alljoyn_aboutdata, deviceid: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getdeviceid", longArrayOf(data, deviceid)).toInt()
}

public fun alljoyn_aboutdata_getdevicename(data: alljoyn_aboutdata, devicename: Long, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getdevicename", longArrayOf(data, devicename, language)).toInt()
}

public fun alljoyn_aboutdata_getfield(data: alljoyn_aboutdata, name: PCSTR, value: Long, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getfield", longArrayOf(data, name, value, language)).toInt()
}

public fun alljoyn_aboutdata_getfields(data: alljoyn_aboutdata, fields: Long, num_fields: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getfields", longArrayOf(data, fields, num_fields.toLong())).toULong()
}

public fun alljoyn_aboutdata_getfieldsignature(data: alljoyn_aboutdata, fieldname: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getfieldsignature", longArrayOf(data, fieldname))
}

public fun alljoyn_aboutdata_gethardwareversion(data: alljoyn_aboutdata, hardwareversion: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_gethardwareversion", longArrayOf(data, hardwareversion)).toInt()
}

public fun alljoyn_aboutdata_getmanufacturer(data: alljoyn_aboutdata, manufacturer: Long, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getmanufacturer", longArrayOf(data, manufacturer, language)).toInt()
}

public fun alljoyn_aboutdata_getmodelnumber(data: alljoyn_aboutdata, modelnumber: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getmodelnumber", longArrayOf(data, modelnumber)).toInt()
}

public fun alljoyn_aboutdata_getsoftwareversion(data: alljoyn_aboutdata, softwareversion: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getsoftwareversion", longArrayOf(data, softwareversion)).toInt()
}

public fun alljoyn_aboutdata_getsupportedlanguages(data: alljoyn_aboutdata, languagetags: Long, num: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getsupportedlanguages", longArrayOf(data, languagetags, num.toLong())).toULong()
}

public fun alljoyn_aboutdata_getsupporturl(data: alljoyn_aboutdata, supporturl: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_getsupporturl", longArrayOf(data, supporturl)).toInt()
}

public fun alljoyn_aboutdata_isfieldannounced(data: alljoyn_aboutdata, fieldname: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_isfieldannounced", longArrayOf(data, fieldname)).toUByte()
}

public fun alljoyn_aboutdata_isfieldlocalized(data: alljoyn_aboutdata, fieldname: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_isfieldlocalized", longArrayOf(data, fieldname)).toUByte()
}

public fun alljoyn_aboutdata_isfieldrequired(data: alljoyn_aboutdata, fieldname: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_isfieldrequired", longArrayOf(data, fieldname)).toUByte()
}

public fun alljoyn_aboutdata_isvalid(data: alljoyn_aboutdata, language: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_isvalid", longArrayOf(data, language)).toUByte()
}

public fun alljoyn_aboutdata_setappid(data: alljoyn_aboutdata, appid: Long, num: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setappid", longArrayOf(data, appid, num.toLong())).toInt()
}

public fun alljoyn_aboutdata_setappid_fromstring(data: alljoyn_aboutdata, appid: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setappid_fromstring", longArrayOf(data, appid)).toInt()
}

public fun alljoyn_aboutdata_setappname(data: alljoyn_aboutdata, appname: PCSTR, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setappname", longArrayOf(data, appname, language)).toInt()
}

public fun alljoyn_aboutdata_setdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setdateofmanufacture", longArrayOf(data, dateofmanufacture)).toInt()
}

public fun alljoyn_aboutdata_setdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setdefaultlanguage", longArrayOf(data, defaultlanguage)).toInt()
}

public fun alljoyn_aboutdata_setdescription(data: alljoyn_aboutdata, description: PCSTR, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setdescription", longArrayOf(data, description, language)).toInt()
}

public fun alljoyn_aboutdata_setdeviceid(data: alljoyn_aboutdata, deviceid: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setdeviceid", longArrayOf(data, deviceid)).toInt()
}

public fun alljoyn_aboutdata_setdevicename(data: alljoyn_aboutdata, devicename: PCSTR, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setdevicename", longArrayOf(data, devicename, language)).toInt()
}

public fun alljoyn_aboutdata_setfield(data: alljoyn_aboutdata, name: PCSTR, value: alljoyn_msgarg, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setfield", longArrayOf(data, name, value, language)).toInt()
}

public fun alljoyn_aboutdata_sethardwareversion(data: alljoyn_aboutdata, hardwareversion: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_sethardwareversion", longArrayOf(data, hardwareversion)).toInt()
}

public fun alljoyn_aboutdata_setmanufacturer(data: alljoyn_aboutdata, manufacturer: PCSTR, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setmanufacturer", longArrayOf(data, manufacturer, language)).toInt()
}

public fun alljoyn_aboutdata_setmodelnumber(data: alljoyn_aboutdata, modelnumber: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setmodelnumber", longArrayOf(data, modelnumber)).toInt()
}

public fun alljoyn_aboutdata_setsoftwareversion(data: alljoyn_aboutdata, softwareversion: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setsoftwareversion", longArrayOf(data, softwareversion)).toInt()
}

public fun alljoyn_aboutdata_setsupportedlanguage(data: alljoyn_aboutdata, language: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setsupportedlanguage", longArrayOf(data, language)).toInt()
}

public fun alljoyn_aboutdata_setsupporturl(data: alljoyn_aboutdata, supporturl: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdata_setsupporturl", longArrayOf(data, supporturl)).toInt()
}

public fun alljoyn_aboutdatalistener_create(callbacks: Long, context: Long): alljoyn_aboutdatalistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdatalistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_aboutdatalistener_destroy(listener: alljoyn_aboutdatalistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutdatalistener_destroy", longArrayOf(listener))
}

public fun alljoyn_abouticon_clear(icon: alljoyn_abouticon) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_clear", longArrayOf(icon))
}

public fun alljoyn_abouticon_create(): alljoyn_abouticon {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_create", longArrayOf())
}

public fun alljoyn_abouticon_destroy(icon: alljoyn_abouticon) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_destroy", longArrayOf(icon))
}

public fun alljoyn_abouticon_getcontent(icon: alljoyn_abouticon, data: Long, size: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_getcontent", longArrayOf(icon, data, size))
}

public fun alljoyn_abouticon_geturl(icon: alljoyn_abouticon, type: Long, url: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_geturl", longArrayOf(icon, type, url))
}

public fun alljoyn_abouticon_setcontent(icon: alljoyn_abouticon, type: PCSTR, data: Long, csize: ULong, ownsdata: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_setcontent", longArrayOf(icon, type, data, csize.toLong(), ownsdata.toLong())).toInt()
}

public fun alljoyn_abouticon_setcontent_frommsgarg(icon: alljoyn_abouticon, arg: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_setcontent_frommsgarg", longArrayOf(icon, arg)).toInt()
}

public fun alljoyn_abouticon_seturl(icon: alljoyn_abouticon, type: PCSTR, url: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticon_seturl", longArrayOf(icon, type, url)).toInt()
}

public fun alljoyn_abouticonobj_create(bus: alljoyn_busattachment, icon: alljoyn_abouticon): alljoyn_abouticonobj {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticonobj_create", longArrayOf(bus, icon))
}

public fun alljoyn_abouticonobj_destroy(icon: alljoyn_abouticonobj) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticonobj_destroy", longArrayOf(icon))
}

public fun alljoyn_abouticonproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_abouticonproxy {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticonproxy_create", longArrayOf(bus, busname, sessionid.toLong()))
}

public fun alljoyn_abouticonproxy_destroy(proxy: alljoyn_abouticonproxy) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticonproxy_destroy", longArrayOf(proxy))
}

public fun alljoyn_abouticonproxy_geticon(proxy: alljoyn_abouticonproxy, icon: alljoyn_abouticon): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticonproxy_geticon", longArrayOf(proxy, icon)).toInt()
}

public fun alljoyn_abouticonproxy_getversion(proxy: alljoyn_abouticonproxy, version: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_abouticonproxy_getversion", longArrayOf(proxy, version)).toInt()
}

public fun alljoyn_aboutlistener_create(callback: Long, context: Long): alljoyn_aboutlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutlistener_create", longArrayOf(callback, context))
}

public fun alljoyn_aboutlistener_destroy(listener: alljoyn_aboutlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutlistener_destroy", longArrayOf(listener))
}

public fun alljoyn_aboutobj_announce(obj: alljoyn_aboutobj, sessionport: UShort, aboutdata: alljoyn_aboutdata): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobj_announce", longArrayOf(obj, sessionport.toLong(), aboutdata)).toInt()
}

public fun alljoyn_aboutobj_announce_using_datalistener(obj: alljoyn_aboutobj, sessionport: UShort, aboutlistener: alljoyn_aboutdatalistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobj_announce_using_datalistener", longArrayOf(obj, sessionport.toLong(), aboutlistener)).toInt()
}

public fun alljoyn_aboutobj_create(bus: alljoyn_busattachment, isannounced: alljoyn_about_announceflag): alljoyn_aboutobj {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobj_create", longArrayOf(bus, isannounced.toLong()))
}

public fun alljoyn_aboutobj_destroy(obj: alljoyn_aboutobj) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobj_destroy", longArrayOf(obj))
}

public fun alljoyn_aboutobj_unannounce(obj: alljoyn_aboutobj): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobj_unannounce", longArrayOf(obj)).toInt()
}

public fun alljoyn_aboutobjectdescription_clear(description: alljoyn_aboutobjectdescription) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_clear", longArrayOf(description))
}

public fun alljoyn_aboutobjectdescription_create(): alljoyn_aboutobjectdescription {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_create", longArrayOf())
}

public fun alljoyn_aboutobjectdescription_create_full(arg: alljoyn_msgarg): alljoyn_aboutobjectdescription {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_create_full", longArrayOf(arg))
}

public fun alljoyn_aboutobjectdescription_createfrommsgarg(description: alljoyn_aboutobjectdescription, arg: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_createfrommsgarg", longArrayOf(description, arg)).toInt()
}

public fun alljoyn_aboutobjectdescription_destroy(description: alljoyn_aboutobjectdescription) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_destroy", longArrayOf(description))
}

public fun alljoyn_aboutobjectdescription_getinterfacepaths(description: alljoyn_aboutobjectdescription, interfacename: PCSTR, paths: Long, numpaths: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_getinterfacepaths", longArrayOf(description, interfacename, paths, numpaths.toLong())).toULong()
}

public fun alljoyn_aboutobjectdescription_getinterfaces(description: alljoyn_aboutobjectdescription, path: PCSTR, interfaces: Long, numinterfaces: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_getinterfaces", longArrayOf(description, path, interfaces, numinterfaces.toLong())).toULong()
}

public fun alljoyn_aboutobjectdescription_getmsgarg(description: alljoyn_aboutobjectdescription, msgarg: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_getmsgarg", longArrayOf(description, msgarg)).toInt()
}

public fun alljoyn_aboutobjectdescription_getpaths(description: alljoyn_aboutobjectdescription, paths: Long, numpaths: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_getpaths", longArrayOf(description, paths, numpaths.toLong())).toULong()
}

public fun alljoyn_aboutobjectdescription_hasinterface(description: alljoyn_aboutobjectdescription, interfacename: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_hasinterface", longArrayOf(description, interfacename)).toUByte()
}

public fun alljoyn_aboutobjectdescription_hasinterfaceatpath(description: alljoyn_aboutobjectdescription, path: PCSTR, interfacename: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_hasinterfaceatpath", longArrayOf(description, path, interfacename)).toUByte()
}

public fun alljoyn_aboutobjectdescription_haspath(description: alljoyn_aboutobjectdescription, path: PCSTR): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutobjectdescription_haspath", longArrayOf(description, path)).toUByte()
}

public fun alljoyn_aboutproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_aboutproxy {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutproxy_create", longArrayOf(bus, busname, sessionid.toLong()))
}

public fun alljoyn_aboutproxy_destroy(proxy: alljoyn_aboutproxy) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutproxy_destroy", longArrayOf(proxy))
}

public fun alljoyn_aboutproxy_getaboutdata(proxy: alljoyn_aboutproxy, language: PCSTR, data: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutproxy_getaboutdata", longArrayOf(proxy, language, data)).toInt()
}

public fun alljoyn_aboutproxy_getobjectdescription(proxy: alljoyn_aboutproxy, objectdesc: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutproxy_getobjectdescription", longArrayOf(proxy, objectdesc)).toInt()
}

public fun alljoyn_aboutproxy_getversion(proxy: alljoyn_aboutproxy, version: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_aboutproxy_getversion", longArrayOf(proxy, version)).toInt()
}

public fun alljoyn_applicationstatelistener_create(callbacks: Long, context: Long): alljoyn_applicationstatelistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_applicationstatelistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_applicationstatelistener_destroy(listener: alljoyn_applicationstatelistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_applicationstatelistener_destroy", longArrayOf(listener))
}

public fun alljoyn_authlistener_create(callbacks: Long, context: Long): alljoyn_authlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_authlistener_destroy(listener: alljoyn_authlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistener_destroy", longArrayOf(listener))
}

public fun alljoyn_authlistener_requestcredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int, credentials: alljoyn_credentials): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistener_requestcredentialsresponse", longArrayOf(listener, authcontext, accept.toLong(), credentials)).toInt()
}

public fun alljoyn_authlistener_setsharedsecret(listener: alljoyn_authlistener, sharedsecret: Long, sharedsecretsize: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistener_setsharedsecret", longArrayOf(listener, sharedsecret, sharedsecretsize.toLong())).toInt()
}

public fun alljoyn_authlistener_verifycredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistener_verifycredentialsresponse", longArrayOf(listener, authcontext, accept.toLong())).toInt()
}

public fun alljoyn_authlistenerasync_create(callbacks: Long, context: Long): alljoyn_authlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistenerasync_create", longArrayOf(callbacks, context))
}

public fun alljoyn_authlistenerasync_destroy(listener: alljoyn_authlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_authlistenerasync_destroy", longArrayOf(listener))
}

public fun alljoyn_autopinger_adddestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_adddestination", longArrayOf(autopinger, group, destination)).toInt()
}

public fun alljoyn_autopinger_addpinggroup(autopinger: alljoyn_autopinger, group: PCSTR, listener: alljoyn_pinglistener, pinginterval: UInt) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_addpinggroup", longArrayOf(autopinger, group, listener, pinginterval.toLong()))
}

public fun alljoyn_autopinger_create(bus: alljoyn_busattachment): alljoyn_autopinger {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_create", longArrayOf(bus))
}

public fun alljoyn_autopinger_destroy(autopinger: alljoyn_autopinger) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_destroy", longArrayOf(autopinger))
}

public fun alljoyn_autopinger_pause(autopinger: alljoyn_autopinger) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_pause", longArrayOf(autopinger))
}

public fun alljoyn_autopinger_removedestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR, removeall: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_removedestination", longArrayOf(autopinger, group, destination, removeall.toLong())).toInt()
}

public fun alljoyn_autopinger_removepinggroup(autopinger: alljoyn_autopinger, group: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_removepinggroup", longArrayOf(autopinger, group))
}

public fun alljoyn_autopinger_resume(autopinger: alljoyn_autopinger) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_resume", longArrayOf(autopinger))
}

public fun alljoyn_autopinger_setpinginterval(autopinger: alljoyn_autopinger, group: PCSTR, pinginterval: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_autopinger_setpinginterval", longArrayOf(autopinger, group, pinginterval.toLong())).toInt()
}

public fun alljoyn_busattachment_addlogonentry(bus: alljoyn_busattachment, authmechanism: PCSTR, username: PCSTR, password: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_addlogonentry", longArrayOf(bus, authmechanism, username, password)).toInt()
}

public fun alljoyn_busattachment_addmatch(bus: alljoyn_busattachment, rule: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_addmatch", longArrayOf(bus, rule)).toInt()
}

public fun alljoyn_busattachment_advertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_advertisename", longArrayOf(bus, name, transports.toLong())).toInt()
}

public fun alljoyn_busattachment_bindsessionport(bus: alljoyn_busattachment, sessionport: Long, opts: alljoyn_sessionopts, listener: alljoyn_sessionportlistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_bindsessionport", longArrayOf(bus, sessionport, opts, listener)).toInt()
}

public fun alljoyn_busattachment_canceladvertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_canceladvertisename", longArrayOf(bus, name, transports.toLong())).toInt()
}

public fun alljoyn_busattachment_cancelfindadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_cancelfindadvertisedname", longArrayOf(bus, nameprefix)).toInt()
}

public fun alljoyn_busattachment_cancelfindadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_cancelfindadvertisednamebytransport", longArrayOf(bus, nameprefix, transports.toLong())).toInt()
}

public fun alljoyn_busattachment_cancelwhoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_cancelwhoimplements_interface", longArrayOf(bus, implementsinterface)).toInt()
}

public fun alljoyn_busattachment_cancelwhoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_cancelwhoimplements_interfaces", longArrayOf(bus, implementsinterfaces, numberinterfaces.toLong())).toInt()
}

public fun alljoyn_busattachment_clearkeys(bus: alljoyn_busattachment, guid: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_clearkeys", longArrayOf(bus, guid)).toInt()
}

public fun alljoyn_busattachment_clearkeystore(bus: alljoyn_busattachment) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_clearkeystore", longArrayOf(bus))
}

public fun alljoyn_busattachment_connect(bus: alljoyn_busattachment, connectspec: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_connect", longArrayOf(bus, connectspec)).toInt()
}

public fun alljoyn_busattachment_create(applicationname: PCSTR, allowremotemessages: Int): alljoyn_busattachment {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_create", longArrayOf(applicationname, allowremotemessages.toLong()))
}

public fun alljoyn_busattachment_create_concurrency(applicationname: PCSTR, allowremotemessages: Int, concurrency: UInt): alljoyn_busattachment {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_create_concurrency", longArrayOf(applicationname, allowremotemessages.toLong(), concurrency.toLong()))
}

public fun alljoyn_busattachment_createinterface(bus: alljoyn_busattachment, name: PCSTR, iface: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_createinterface", longArrayOf(bus, name, iface)).toInt()
}

public fun alljoyn_busattachment_createinterface_secure(bus: alljoyn_busattachment, name: PCSTR, iface: Long, secpolicy: alljoyn_interfacedescription_securitypolicy): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_createinterface_secure", longArrayOf(bus, name, iface, secpolicy.toLong())).toInt()
}

public fun alljoyn_busattachment_createinterfacesfromxml(bus: alljoyn_busattachment, xml: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_createinterfacesfromxml", longArrayOf(bus, xml)).toInt()
}

public fun alljoyn_busattachment_deletedefaultkeystore(applicationname: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_deletedefaultkeystore", longArrayOf(applicationname)).toInt()
}

public fun alljoyn_busattachment_deleteinterface(bus: alljoyn_busattachment, iface: alljoyn_interfacedescription): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_deleteinterface", longArrayOf(bus, iface)).toInt()
}

public fun alljoyn_busattachment_destroy(bus: alljoyn_busattachment) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_destroy", longArrayOf(bus))
}

public fun alljoyn_busattachment_disconnect(bus: alljoyn_busattachment, unused: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_disconnect", longArrayOf(bus, unused)).toInt()
}

public fun alljoyn_busattachment_enableconcurrentcallbacks(bus: alljoyn_busattachment) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_enableconcurrentcallbacks", longArrayOf(bus))
}

public fun alljoyn_busattachment_enablepeersecurity(bus: alljoyn_busattachment, authmechanisms: PCSTR, listener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_enablepeersecurity", longArrayOf(bus, authmechanisms, listener, keystorefilename, isshared.toLong())).toInt()
}

public fun alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus: alljoyn_busattachment, authmechanisms: PCSTR, authlistener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int, permissionconfigurationlistener: alljoyn_permissionconfigurationlistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener", longArrayOf(bus, authmechanisms, authlistener, keystorefilename, isshared.toLong(), permissionconfigurationlistener)).toInt()
}

public fun alljoyn_busattachment_findadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_findadvertisedname", longArrayOf(bus, nameprefix)).toInt()
}

public fun alljoyn_busattachment_findadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_findadvertisednamebytransport", longArrayOf(bus, nameprefix, transports.toLong())).toInt()
}

public fun alljoyn_busattachment_getalljoyndebugobj(bus: alljoyn_busattachment): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getalljoyndebugobj", longArrayOf(bus))
}

public fun alljoyn_busattachment_getalljoynproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getalljoynproxyobj", longArrayOf(bus))
}

public fun alljoyn_busattachment_getconcurrency(bus: alljoyn_busattachment): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getconcurrency", longArrayOf(bus)).toUInt()
}

public fun alljoyn_busattachment_getconnectspec(bus: alljoyn_busattachment): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getconnectspec", longArrayOf(bus))
}

public fun alljoyn_busattachment_getdbusproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getdbusproxyobj", longArrayOf(bus))
}

public fun alljoyn_busattachment_getglobalguidstring(bus: alljoyn_busattachment): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getglobalguidstring", longArrayOf(bus))
}

public fun alljoyn_busattachment_getinterface(bus: alljoyn_busattachment, name: PCSTR): alljoyn_interfacedescription {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getinterface", longArrayOf(bus, name))
}

public fun alljoyn_busattachment_getinterfaces(bus: alljoyn_busattachment, ifaces: Long, numifaces: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getinterfaces", longArrayOf(bus, ifaces, numifaces.toLong())).toULong()
}

public fun alljoyn_busattachment_getkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getkeyexpiration", longArrayOf(bus, guid, timeout)).toInt()
}

public fun alljoyn_busattachment_getpeerguid(bus: alljoyn_busattachment, name: PCSTR, guid: PCSTR, guidsz: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getpeerguid", longArrayOf(bus, name, guid, guidsz)).toInt()
}

public fun alljoyn_busattachment_getpermissionconfigurator(bus: alljoyn_busattachment): alljoyn_permissionconfigurator {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getpermissionconfigurator", longArrayOf(bus))
}

public fun alljoyn_busattachment_gettimestamp(): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_gettimestamp", longArrayOf()).toUInt()
}

public fun alljoyn_busattachment_getuniquename(bus: alljoyn_busattachment): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_getuniquename", longArrayOf(bus))
}

public fun alljoyn_busattachment_isconnected(bus: alljoyn_busattachment): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_isconnected", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_ispeersecurityenabled(bus: alljoyn_busattachment): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_ispeersecurityenabled", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_isstarted(bus: alljoyn_busattachment): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_isstarted", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_isstopping(bus: alljoyn_busattachment): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_isstopping", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_join(bus: alljoyn_busattachment): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_join", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_joinsession(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, sessionid: Long, opts: alljoyn_sessionopts): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_joinsession", longArrayOf(bus, sessionhost, sessionport.toLong(), listener, sessionid, opts)).toInt()
}

public fun alljoyn_busattachment_joinsessionasync(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, opts: alljoyn_sessionopts, callback: alljoyn_busattachment_joinsessioncb_ptr, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_joinsessionasync", longArrayOf(bus, sessionhost, sessionport.toLong(), listener, opts, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun alljoyn_busattachment_leavesession(bus: alljoyn_busattachment, sessionid: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_leavesession", longArrayOf(bus, sessionid.toLong())).toInt()
}

public fun alljoyn_busattachment_namehasowner(bus: alljoyn_busattachment, name: PCSTR, hasowner: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_namehasowner", longArrayOf(bus, name, hasowner)).toInt()
}

public fun alljoyn_busattachment_ping(bus: alljoyn_busattachment, name: PCSTR, timeout: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_ping", longArrayOf(bus, name, timeout.toLong())).toInt()
}

public fun alljoyn_busattachment_registeraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registeraboutlistener", longArrayOf(bus, aboutlistener))
}

public fun alljoyn_busattachment_registerapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registerapplicationstatelistener", longArrayOf(bus, listener)).toInt()
}

public fun alljoyn_busattachment_registerbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registerbuslistener", longArrayOf(bus, listener))
}

public fun alljoyn_busattachment_registerbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registerbusobject", longArrayOf(bus, obj)).toInt()
}

public fun alljoyn_busattachment_registerbusobject_secure(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registerbusobject_secure", longArrayOf(bus, obj)).toInt()
}

public fun alljoyn_busattachment_registerkeystorelistener(bus: alljoyn_busattachment, listener: alljoyn_keystorelistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registerkeystorelistener", longArrayOf(bus, listener)).toInt()
}

public fun alljoyn_busattachment_registersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registersignalhandler", longArrayOf(bus, Win32DynamicFfi.objectSlot(signal_handler), run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, srcpath)).toInt()
}

public fun alljoyn_busattachment_registersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_registersignalhandlerwithrule", longArrayOf(bus, Win32DynamicFfi.objectSlot(signal_handler), run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, matchrule)).toInt()
}

public fun alljoyn_busattachment_releasename(bus: alljoyn_busattachment, name: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_releasename", longArrayOf(bus, name)).toInt()
}

public fun alljoyn_busattachment_reloadkeystore(bus: alljoyn_busattachment): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_reloadkeystore", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_removematch(bus: alljoyn_busattachment, rule: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_removematch", longArrayOf(bus, rule)).toInt()
}

public fun alljoyn_busattachment_removesessionmember(bus: alljoyn_busattachment, sessionid: UInt, membername: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_removesessionmember", longArrayOf(bus, sessionid.toLong(), membername)).toInt()
}

public fun alljoyn_busattachment_requestname(bus: alljoyn_busattachment, requestedname: PCSTR, flags: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_requestname", longArrayOf(bus, requestedname, flags.toLong())).toInt()
}

public fun alljoyn_busattachment_secureconnection(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_secureconnection", longArrayOf(bus, name, forceauth.toLong())).toInt()
}

public fun alljoyn_busattachment_secureconnectionasync(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_secureconnectionasync", longArrayOf(bus, name, forceauth.toLong())).toInt()
}

public fun alljoyn_busattachment_setdaemondebug(bus: alljoyn_busattachment, module: PCSTR, level: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_setdaemondebug", longArrayOf(bus, module, level.toLong())).toInt()
}

public fun alljoyn_busattachment_setkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_setkeyexpiration", longArrayOf(bus, guid, timeout.toLong())).toInt()
}

public fun alljoyn_busattachment_setlinktimeout(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_setlinktimeout", longArrayOf(bus, sessionid.toLong(), linktimeout)).toInt()
}

public fun alljoyn_busattachment_setlinktimeoutasync(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: UInt, callback: alljoyn_busattachment_setlinktimeoutcb_ptr, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_setlinktimeoutasync", longArrayOf(bus, sessionid.toLong(), linktimeout.toLong(), Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun alljoyn_busattachment_setsessionlistener(bus: alljoyn_busattachment, sessionid: UInt, listener: alljoyn_sessionlistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_setsessionlistener", longArrayOf(bus, sessionid.toLong(), listener)).toInt()
}

public fun alljoyn_busattachment_start(bus: alljoyn_busattachment): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_start", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_stop(bus: alljoyn_busattachment): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_stop", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_unbindsessionport(bus: alljoyn_busattachment, sessionport: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unbindsessionport", longArrayOf(bus, sessionport.toLong())).toInt()
}

public fun alljoyn_busattachment_unregisteraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregisteraboutlistener", longArrayOf(bus, aboutlistener))
}

public fun alljoyn_busattachment_unregisterallaboutlisteners(bus: alljoyn_busattachment) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregisterallaboutlisteners", longArrayOf(bus))
}

public fun alljoyn_busattachment_unregisterallhandlers(bus: alljoyn_busattachment): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregisterallhandlers", longArrayOf(bus)).toInt()
}

public fun alljoyn_busattachment_unregisterapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregisterapplicationstatelistener", longArrayOf(bus, listener)).toInt()
}

public fun alljoyn_busattachment_unregisterbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregisterbuslistener", longArrayOf(bus, listener))
}

public fun alljoyn_busattachment_unregisterbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregisterbusobject", longArrayOf(bus, obj))
}

public fun alljoyn_busattachment_unregistersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregistersignalhandler", longArrayOf(bus, Win32DynamicFfi.objectSlot(signal_handler), run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, srcpath)).toInt()
}

public fun alljoyn_busattachment_unregistersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_unregistersignalhandlerwithrule", longArrayOf(bus, Win32DynamicFfi.objectSlot(signal_handler), run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, matchrule)).toInt()
}

public fun alljoyn_busattachment_whoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_whoimplements_interface", longArrayOf(bus, implementsinterface)).toInt()
}

public fun alljoyn_busattachment_whoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busattachment_whoimplements_interfaces", longArrayOf(bus, implementsinterfaces, numberinterfaces.toLong())).toInt()
}

public fun alljoyn_buslistener_create(callbacks: Long, context: Long): alljoyn_buslistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_buslistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_buslistener_destroy(listener: alljoyn_buslistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_buslistener_destroy", longArrayOf(listener))
}

public fun alljoyn_busobject_addinterface(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_addinterface", longArrayOf(bus, iface)).toInt()
}

public fun alljoyn_busobject_addinterface_announced(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_addinterface_announced", longArrayOf(bus, iface)).toInt()
}

public fun alljoyn_busobject_addmethodhandler(bus: alljoyn_busobject, member: alljoyn_interfacedescription_member, handler: alljoyn_messagereceiver_methodhandler_ptr, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_addmethodhandler", longArrayOf(bus, run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, Win32DynamicFfi.objectSlot(handler), context)).toInt()
}

public fun alljoyn_busobject_addmethodhandlers(bus: alljoyn_busobject, entries: Long, numentries: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_addmethodhandlers", longArrayOf(bus, entries, numentries.toLong())).toInt()
}

public fun alljoyn_busobject_cancelsessionlessmessage(bus: alljoyn_busobject, msg: alljoyn_message): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_cancelsessionlessmessage", longArrayOf(bus, msg)).toInt()
}

public fun alljoyn_busobject_cancelsessionlessmessage_serial(bus: alljoyn_busobject, serialnumber: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_cancelsessionlessmessage_serial", longArrayOf(bus, serialnumber.toLong())).toInt()
}

public fun alljoyn_busobject_create(path: PCSTR, isplaceholder: Int, callbacks_in: Long, context_in: Long): alljoyn_busobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_create", longArrayOf(path, isplaceholder.toLong(), callbacks_in, context_in))
}

public fun alljoyn_busobject_destroy(bus: alljoyn_busobject) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_destroy", longArrayOf(bus))
}

public fun alljoyn_busobject_emitpropertieschanged(bus: alljoyn_busobject, ifcname: PCSTR, propnames: Long, numprops: ULong, id: UInt) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_emitpropertieschanged", longArrayOf(bus, ifcname, propnames, numprops.toLong(), id.toLong()))
}

public fun alljoyn_busobject_emitpropertychanged(bus: alljoyn_busobject, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg, id: UInt) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_emitpropertychanged", longArrayOf(bus, ifcname, propname, value, id.toLong()))
}

public fun alljoyn_busobject_getannouncedinterfacenames(bus: alljoyn_busobject, interfaces: Long, numinterfaces: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_getannouncedinterfacenames", longArrayOf(bus, interfaces, numinterfaces.toLong())).toULong()
}

public fun alljoyn_busobject_getbusattachment(bus: alljoyn_busobject): alljoyn_busattachment {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_getbusattachment", longArrayOf(bus))
}

public fun alljoyn_busobject_getname(bus: alljoyn_busobject, buffer: PCSTR, buffersz: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_getname", longArrayOf(bus, buffer, buffersz.toLong())).toULong()
}

public fun alljoyn_busobject_getpath(bus: alljoyn_busobject): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_getpath", longArrayOf(bus))
}

public fun alljoyn_busobject_issecure(bus: alljoyn_busobject): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_issecure", longArrayOf(bus)).toInt()
}

public fun alljoyn_busobject_methodreply_args(bus: alljoyn_busobject, msg: alljoyn_message, args: alljoyn_msgarg, numargs: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_methodreply_args", longArrayOf(bus, msg, args, numargs.toLong())).toInt()
}

public fun alljoyn_busobject_methodreply_err(bus: alljoyn_busobject, msg: alljoyn_message, error: PCSTR, errormessage: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_methodreply_err", longArrayOf(bus, msg, error, errormessage)).toInt()
}

public fun alljoyn_busobject_methodreply_status(bus: alljoyn_busobject, msg: alljoyn_message, status: QStatus): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_methodreply_status", longArrayOf(bus, msg, status.toLong())).toInt()
}

public fun alljoyn_busobject_setannounceflag(bus: alljoyn_busobject, iface: alljoyn_interfacedescription, isannounced: alljoyn_about_announceflag): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_setannounceflag", longArrayOf(bus, iface, isannounced.toLong())).toInt()
}

public fun alljoyn_busobject_signal(bus: alljoyn_busobject, destination: PCSTR, sessionid: UInt, signal: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: alljoyn_message): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_busobject_signal", longArrayOf(bus, destination, sessionid.toLong(), run { val buf = ByteArray(56); buf[0] = (signal.iface and 0xFF).toByte(); buf[1] = ((signal.iface ushr 8) and 0xFF).toByte(); buf[2] = ((signal.iface ushr 16) and 0xFF).toByte(); buf[3] = ((signal.iface ushr 24) and 0xFF).toByte(); buf[4] = ((signal.iface ushr 32) and 0xFF).toByte(); buf[5] = ((signal.iface ushr 40) and 0xFF).toByte(); buf[6] = ((signal.iface ushr 48) and 0xFF).toByte(); buf[7] = ((signal.iface ushr 56) and 0xFF).toByte(); buf[8] = (signal.memberType and 0xFF).toByte(); buf[9] = ((signal.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((signal.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((signal.memberType ushr 24) and 0xFF).toByte(); buf[16] = (signal.name and 0xFF).toByte(); buf[17] = ((signal.name ushr 8) and 0xFF).toByte(); buf[18] = ((signal.name ushr 16) and 0xFF).toByte(); buf[19] = ((signal.name ushr 24) and 0xFF).toByte(); buf[20] = ((signal.name ushr 32) and 0xFF).toByte(); buf[21] = ((signal.name ushr 40) and 0xFF).toByte(); buf[22] = ((signal.name ushr 48) and 0xFF).toByte(); buf[23] = ((signal.name ushr 56) and 0xFF).toByte(); buf[24] = (signal.signature and 0xFF).toByte(); buf[25] = ((signal.signature ushr 8) and 0xFF).toByte(); buf[26] = ((signal.signature ushr 16) and 0xFF).toByte(); buf[27] = ((signal.signature ushr 24) and 0xFF).toByte(); buf[28] = ((signal.signature ushr 32) and 0xFF).toByte(); buf[29] = ((signal.signature ushr 40) and 0xFF).toByte(); buf[30] = ((signal.signature ushr 48) and 0xFF).toByte(); buf[31] = ((signal.signature ushr 56) and 0xFF).toByte(); buf[32] = (signal.returnSignature and 0xFF).toByte(); buf[33] = ((signal.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((signal.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((signal.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((signal.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((signal.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((signal.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((signal.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (signal.argNames and 0xFF).toByte(); buf[41] = ((signal.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((signal.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((signal.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((signal.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((signal.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((signal.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((signal.argNames ushr 56) and 0xFF).toByte(); buf[48] = (signal.internal_member and 0xFF).toByte(); buf[49] = ((signal.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((signal.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((signal.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((signal.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((signal.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((signal.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((signal.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, args, numargs.toLong(), timetolive.toLong(), flags.toLong(), msg)).toInt()
}

public fun alljoyn_credentials_clear(cred: alljoyn_credentials) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_clear", longArrayOf(cred))
}

public fun alljoyn_credentials_create(): alljoyn_credentials {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_create", longArrayOf())
}

public fun alljoyn_credentials_destroy(cred: alljoyn_credentials) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_destroy", longArrayOf(cred))
}

public fun alljoyn_credentials_getcertchain(cred: alljoyn_credentials): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_getcertchain", longArrayOf(cred))
}

public fun alljoyn_credentials_getexpiration(cred: alljoyn_credentials): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_getexpiration", longArrayOf(cred)).toUInt()
}

public fun alljoyn_credentials_getlogonentry(cred: alljoyn_credentials): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_getlogonentry", longArrayOf(cred))
}

public fun alljoyn_credentials_getpassword(cred: alljoyn_credentials): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_getpassword", longArrayOf(cred))
}

public fun alljoyn_credentials_getprivateKey(cred: alljoyn_credentials): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_getprivateKey", longArrayOf(cred))
}

public fun alljoyn_credentials_getusername(cred: alljoyn_credentials): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_getusername", longArrayOf(cred))
}

public fun alljoyn_credentials_isset(cred: alljoyn_credentials, creds: UShort): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_isset", longArrayOf(cred, creds.toLong())).toInt()
}

public fun alljoyn_credentials_setcertchain(cred: alljoyn_credentials, certchain: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_setcertchain", longArrayOf(cred, certchain))
}

public fun alljoyn_credentials_setexpiration(cred: alljoyn_credentials, expiration: UInt) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_setexpiration", longArrayOf(cred, expiration.toLong()))
}

public fun alljoyn_credentials_setlogonentry(cred: alljoyn_credentials, logonentry: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_setlogonentry", longArrayOf(cred, logonentry))
}

public fun alljoyn_credentials_setpassword(cred: alljoyn_credentials, pwd: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_setpassword", longArrayOf(cred, pwd))
}

public fun alljoyn_credentials_setprivatekey(cred: alljoyn_credentials, pk: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_setprivatekey", longArrayOf(cred, pk))
}

public fun alljoyn_credentials_setusername(cred: alljoyn_credentials, username: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_credentials_setusername", longArrayOf(cred, username))
}

public fun alljoyn_getbuildinfo(): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_getbuildinfo", longArrayOf())
}

public fun alljoyn_getnumericversion(): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_getnumericversion", longArrayOf()).toUInt()
}

public fun alljoyn_getversion(): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_getversion", longArrayOf())
}

public fun alljoyn_init(): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_init", longArrayOf()).toInt()
}

public fun alljoyn_interfacedescription_activate(iface: alljoyn_interfacedescription) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_activate", longArrayOf(iface))
}

public fun alljoyn_interfacedescription_addannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addannotation", longArrayOf(iface, name, value)).toInt()
}

public fun alljoyn_interfacedescription_addargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addargannotation", longArrayOf(iface, member, argname, name, value)).toInt()
}

public fun alljoyn_interfacedescription_addmember(iface: alljoyn_interfacedescription, type: alljoyn_messagetype, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addmember", longArrayOf(iface, type.toLong(), name, inputsig, outsig, argnames, annotation.toLong())).toInt()
}

public fun alljoyn_interfacedescription_addmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addmemberannotation", longArrayOf(iface, member, name, value)).toInt()
}

public fun alljoyn_interfacedescription_addmethod(iface: alljoyn_interfacedescription, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addmethod", longArrayOf(iface, name, inputsig, outsig, argnames, annotation.toLong(), accessperms)).toInt()
}

public fun alljoyn_interfacedescription_addproperty(iface: alljoyn_interfacedescription, name: PCSTR, signature: PCSTR, access: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addproperty", longArrayOf(iface, name, signature, access.toLong())).toInt()
}

public fun alljoyn_interfacedescription_addpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addpropertyannotation", longArrayOf(iface, property, name, value)).toInt()
}

public fun alljoyn_interfacedescription_addsignal(iface: alljoyn_interfacedescription, name: PCSTR, sig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_addsignal", longArrayOf(iface, name, sig, argnames, annotation.toLong(), accessperms)).toInt()
}

public fun alljoyn_interfacedescription_eql(one: alljoyn_interfacedescription, other: alljoyn_interfacedescription): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_eql", longArrayOf(one, other)).toInt()
}

public fun alljoyn_interfacedescription_getannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR, value_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getannotation", longArrayOf(iface, name, value, value_size)).toInt()
}

public fun alljoyn_interfacedescription_getannotationatindex(iface: alljoyn_interfacedescription, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getannotationatindex", longArrayOf(iface, index.toLong(), name, name_size, value, value_size))
}

public fun alljoyn_interfacedescription_getannotationscount(iface: alljoyn_interfacedescription): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getannotationscount", longArrayOf(iface)).toULong()
}

public fun alljoyn_interfacedescription_getargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getargdescriptionforlanguage", longArrayOf(iface, member, arg, description, maxlanguagelength.toLong(), languagetag)).toULong()
}

public fun alljoyn_interfacedescription_getdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getdescriptionforlanguage", longArrayOf(iface, description, maxlanguagelength.toLong(), languagetag)).toULong()
}

public fun alljoyn_interfacedescription_getdescriptionlanguages(iface: alljoyn_interfacedescription, languages: Long, size: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getdescriptionlanguages", longArrayOf(iface, languages, size.toLong())).toULong()
}

public fun alljoyn_interfacedescription_getdescriptionlanguages2(iface: alljoyn_interfacedescription, languages: PCSTR, languagessize: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getdescriptionlanguages2", longArrayOf(iface, languages, languagessize.toLong())).toULong()
}

public fun alljoyn_interfacedescription_getdescriptiontranslationcallback(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_translation_callback_ptr {
    val rawRet = Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getdescriptiontranslationcallback", longArrayOf(iface))
    return if (rawRet == 0L) null else alljoyn_interfacedescription_translation_callback_ptrFn { p0, p1, p2 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1, p2)) }
}

public fun alljoyn_interfacedescription_getmember(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getmember", longArrayOf(iface, name, member)).toInt()
}

public fun alljoyn_interfacedescription_getmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getmemberannotation", longArrayOf(iface, member, name, value, value_size)).toInt()
}

public fun alljoyn_interfacedescription_getmemberargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getmemberargannotation", longArrayOf(iface, member, argname, name, value, value_size)).toInt()
}

public fun alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getmemberdescriptionforlanguage", longArrayOf(iface, member, description, maxlanguagelength.toLong(), languagetag)).toULong()
}

public fun alljoyn_interfacedescription_getmembers(iface: alljoyn_interfacedescription, members: Long, nummembers: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getmembers", longArrayOf(iface, members, nummembers.toLong())).toULong()
}

public fun alljoyn_interfacedescription_getmethod(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getmethod", longArrayOf(iface, name, member)).toInt()
}

public fun alljoyn_interfacedescription_getname(iface: alljoyn_interfacedescription): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getname", longArrayOf(iface))
}

public fun alljoyn_interfacedescription_getproperties(iface: alljoyn_interfacedescription, props: Long, numprops: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getproperties", longArrayOf(iface, props, numprops.toLong())).toULong()
}

public fun alljoyn_interfacedescription_getproperty(iface: alljoyn_interfacedescription, name: PCSTR, property: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getproperty", longArrayOf(iface, name, property)).toInt()
}

public fun alljoyn_interfacedescription_getpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR, str_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getpropertyannotation", longArrayOf(iface, property, name, value, str_size)).toInt()
}

public fun alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, property: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getpropertydescriptionforlanguage", longArrayOf(iface, property, description, maxlanguagelength.toLong(), languagetag)).toULong()
}

public fun alljoyn_interfacedescription_getsecuritypolicy(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_securitypolicy {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getsecuritypolicy", longArrayOf(iface)).toInt()
}

public fun alljoyn_interfacedescription_getsignal(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_getsignal", longArrayOf(iface, name, member)).toInt()
}

public fun alljoyn_interfacedescription_hasdescription(iface: alljoyn_interfacedescription): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_hasdescription", longArrayOf(iface)).toInt()
}

public fun alljoyn_interfacedescription_hasmember(iface: alljoyn_interfacedescription, name: PCSTR, insig: PCSTR, outsig: PCSTR): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_hasmember", longArrayOf(iface, name, insig, outsig)).toInt()
}

public fun alljoyn_interfacedescription_hasproperties(iface: alljoyn_interfacedescription): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_hasproperties", longArrayOf(iface)).toInt()
}

public fun alljoyn_interfacedescription_hasproperty(iface: alljoyn_interfacedescription, name: PCSTR): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_hasproperty", longArrayOf(iface, name)).toInt()
}

public fun alljoyn_interfacedescription_introspect(iface: alljoyn_interfacedescription, str: PCSTR, buf: ULong, indent: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_introspect", longArrayOf(iface, str, buf.toLong(), indent.toLong())).toULong()
}

public fun alljoyn_interfacedescription_issecure(iface: alljoyn_interfacedescription): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_issecure", longArrayOf(iface)).toInt()
}

public fun alljoyn_interfacedescription_member_eql(one: alljoyn_interfacedescription_member, other: alljoyn_interfacedescription_member): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_eql", longArrayOf(run { val buf = ByteArray(56); buf[0] = (one.iface and 0xFF).toByte(); buf[1] = ((one.iface ushr 8) and 0xFF).toByte(); buf[2] = ((one.iface ushr 16) and 0xFF).toByte(); buf[3] = ((one.iface ushr 24) and 0xFF).toByte(); buf[4] = ((one.iface ushr 32) and 0xFF).toByte(); buf[5] = ((one.iface ushr 40) and 0xFF).toByte(); buf[6] = ((one.iface ushr 48) and 0xFF).toByte(); buf[7] = ((one.iface ushr 56) and 0xFF).toByte(); buf[8] = (one.memberType and 0xFF).toByte(); buf[9] = ((one.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((one.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((one.memberType ushr 24) and 0xFF).toByte(); buf[16] = (one.name and 0xFF).toByte(); buf[17] = ((one.name ushr 8) and 0xFF).toByte(); buf[18] = ((one.name ushr 16) and 0xFF).toByte(); buf[19] = ((one.name ushr 24) and 0xFF).toByte(); buf[20] = ((one.name ushr 32) and 0xFF).toByte(); buf[21] = ((one.name ushr 40) and 0xFF).toByte(); buf[22] = ((one.name ushr 48) and 0xFF).toByte(); buf[23] = ((one.name ushr 56) and 0xFF).toByte(); buf[24] = (one.signature and 0xFF).toByte(); buf[25] = ((one.signature ushr 8) and 0xFF).toByte(); buf[26] = ((one.signature ushr 16) and 0xFF).toByte(); buf[27] = ((one.signature ushr 24) and 0xFF).toByte(); buf[28] = ((one.signature ushr 32) and 0xFF).toByte(); buf[29] = ((one.signature ushr 40) and 0xFF).toByte(); buf[30] = ((one.signature ushr 48) and 0xFF).toByte(); buf[31] = ((one.signature ushr 56) and 0xFF).toByte(); buf[32] = (one.returnSignature and 0xFF).toByte(); buf[33] = ((one.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((one.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((one.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((one.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((one.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((one.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((one.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (one.argNames and 0xFF).toByte(); buf[41] = ((one.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((one.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((one.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((one.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((one.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((one.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((one.argNames ushr 56) and 0xFF).toByte(); buf[48] = (one.internal_member and 0xFF).toByte(); buf[49] = ((one.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((one.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((one.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((one.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((one.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((one.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((one.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, run { val buf = ByteArray(56); buf[0] = (other.iface and 0xFF).toByte(); buf[1] = ((other.iface ushr 8) and 0xFF).toByte(); buf[2] = ((other.iface ushr 16) and 0xFF).toByte(); buf[3] = ((other.iface ushr 24) and 0xFF).toByte(); buf[4] = ((other.iface ushr 32) and 0xFF).toByte(); buf[5] = ((other.iface ushr 40) and 0xFF).toByte(); buf[6] = ((other.iface ushr 48) and 0xFF).toByte(); buf[7] = ((other.iface ushr 56) and 0xFF).toByte(); buf[8] = (other.memberType and 0xFF).toByte(); buf[9] = ((other.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((other.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((other.memberType ushr 24) and 0xFF).toByte(); buf[16] = (other.name and 0xFF).toByte(); buf[17] = ((other.name ushr 8) and 0xFF).toByte(); buf[18] = ((other.name ushr 16) and 0xFF).toByte(); buf[19] = ((other.name ushr 24) and 0xFF).toByte(); buf[20] = ((other.name ushr 32) and 0xFF).toByte(); buf[21] = ((other.name ushr 40) and 0xFF).toByte(); buf[22] = ((other.name ushr 48) and 0xFF).toByte(); buf[23] = ((other.name ushr 56) and 0xFF).toByte(); buf[24] = (other.signature and 0xFF).toByte(); buf[25] = ((other.signature ushr 8) and 0xFF).toByte(); buf[26] = ((other.signature ushr 16) and 0xFF).toByte(); buf[27] = ((other.signature ushr 24) and 0xFF).toByte(); buf[28] = ((other.signature ushr 32) and 0xFF).toByte(); buf[29] = ((other.signature ushr 40) and 0xFF).toByte(); buf[30] = ((other.signature ushr 48) and 0xFF).toByte(); buf[31] = ((other.signature ushr 56) and 0xFF).toByte(); buf[32] = (other.returnSignature and 0xFF).toByte(); buf[33] = ((other.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((other.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((other.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((other.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((other.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((other.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((other.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (other.argNames and 0xFF).toByte(); buf[41] = ((other.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((other.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((other.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((other.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((other.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((other.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((other.argNames ushr 56) and 0xFF).toByte(); buf[48] = (other.internal_member and 0xFF).toByte(); buf[49] = ((other.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((other.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((other.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((other.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((other.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((other.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((other.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toInt()
}

public fun alljoyn_interfacedescription_member_getannotation(member: alljoyn_interfacedescription_member, name: PCSTR, value: PCSTR, value_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_getannotation", longArrayOf(run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, name, value, value_size)).toInt()
}

public fun alljoyn_interfacedescription_member_getannotationatindex(member: alljoyn_interfacedescription_member, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_getannotationatindex", longArrayOf(run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, index.toLong(), name, name_size, value, value_size))
}

public fun alljoyn_interfacedescription_member_getannotationscount(member: alljoyn_interfacedescription_member): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_getannotationscount", longArrayOf(run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toULong()
}

public fun alljoyn_interfacedescription_member_getargannotation(member: alljoyn_interfacedescription_member, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_getargannotation", longArrayOf(run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, argname, name, value, value_size)).toInt()
}

public fun alljoyn_interfacedescription_member_getargannotationatindex(member: alljoyn_interfacedescription_member, argname: PCSTR, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_getargannotationatindex", longArrayOf(run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, argname, index.toLong(), name, name_size, value, value_size))
}

public fun alljoyn_interfacedescription_member_getargannotationscount(member: alljoyn_interfacedescription_member, argname: PCSTR): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_member_getargannotationscount", longArrayOf(run { val buf = ByteArray(56); buf[0] = (member.iface and 0xFF).toByte(); buf[1] = ((member.iface ushr 8) and 0xFF).toByte(); buf[2] = ((member.iface ushr 16) and 0xFF).toByte(); buf[3] = ((member.iface ushr 24) and 0xFF).toByte(); buf[4] = ((member.iface ushr 32) and 0xFF).toByte(); buf[5] = ((member.iface ushr 40) and 0xFF).toByte(); buf[6] = ((member.iface ushr 48) and 0xFF).toByte(); buf[7] = ((member.iface ushr 56) and 0xFF).toByte(); buf[8] = (member.memberType and 0xFF).toByte(); buf[9] = ((member.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((member.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((member.memberType ushr 24) and 0xFF).toByte(); buf[16] = (member.name and 0xFF).toByte(); buf[17] = ((member.name ushr 8) and 0xFF).toByte(); buf[18] = ((member.name ushr 16) and 0xFF).toByte(); buf[19] = ((member.name ushr 24) and 0xFF).toByte(); buf[20] = ((member.name ushr 32) and 0xFF).toByte(); buf[21] = ((member.name ushr 40) and 0xFF).toByte(); buf[22] = ((member.name ushr 48) and 0xFF).toByte(); buf[23] = ((member.name ushr 56) and 0xFF).toByte(); buf[24] = (member.signature and 0xFF).toByte(); buf[25] = ((member.signature ushr 8) and 0xFF).toByte(); buf[26] = ((member.signature ushr 16) and 0xFF).toByte(); buf[27] = ((member.signature ushr 24) and 0xFF).toByte(); buf[28] = ((member.signature ushr 32) and 0xFF).toByte(); buf[29] = ((member.signature ushr 40) and 0xFF).toByte(); buf[30] = ((member.signature ushr 48) and 0xFF).toByte(); buf[31] = ((member.signature ushr 56) and 0xFF).toByte(); buf[32] = (member.returnSignature and 0xFF).toByte(); buf[33] = ((member.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((member.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((member.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((member.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((member.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((member.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((member.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (member.argNames and 0xFF).toByte(); buf[41] = ((member.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((member.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((member.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((member.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((member.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((member.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((member.argNames ushr 56) and 0xFF).toByte(); buf[48] = (member.internal_member and 0xFF).toByte(); buf[49] = ((member.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((member.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((member.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((member.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((member.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((member.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((member.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, argname)).toULong()
}

public fun alljoyn_interfacedescription_property_eql(one: alljoyn_interfacedescription_property, other: alljoyn_interfacedescription_property): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_property_eql", longArrayOf(run { val buf = ByteArray(32); buf[0] = (one.name and 0xFF).toByte(); buf[1] = ((one.name ushr 8) and 0xFF).toByte(); buf[2] = ((one.name ushr 16) and 0xFF).toByte(); buf[3] = ((one.name ushr 24) and 0xFF).toByte(); buf[4] = ((one.name ushr 32) and 0xFF).toByte(); buf[5] = ((one.name ushr 40) and 0xFF).toByte(); buf[6] = ((one.name ushr 48) and 0xFF).toByte(); buf[7] = ((one.name ushr 56) and 0xFF).toByte(); buf[8] = (one.signature and 0xFF).toByte(); buf[9] = ((one.signature ushr 8) and 0xFF).toByte(); buf[10] = ((one.signature ushr 16) and 0xFF).toByte(); buf[11] = ((one.signature ushr 24) and 0xFF).toByte(); buf[12] = ((one.signature ushr 32) and 0xFF).toByte(); buf[13] = ((one.signature ushr 40) and 0xFF).toByte(); buf[14] = ((one.signature ushr 48) and 0xFF).toByte(); buf[15] = ((one.signature ushr 56) and 0xFF).toByte(); buf[16] = one.access.toByte(); buf[24] = (one.internal_property and 0xFF).toByte(); buf[25] = ((one.internal_property ushr 8) and 0xFF).toByte(); buf[26] = ((one.internal_property ushr 16) and 0xFF).toByte(); buf[27] = ((one.internal_property ushr 24) and 0xFF).toByte(); buf[28] = ((one.internal_property ushr 32) and 0xFF).toByte(); buf[29] = ((one.internal_property ushr 40) and 0xFF).toByte(); buf[30] = ((one.internal_property ushr 48) and 0xFF).toByte(); buf[31] = ((one.internal_property ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(32); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, run { val buf = ByteArray(32); buf[0] = (other.name and 0xFF).toByte(); buf[1] = ((other.name ushr 8) and 0xFF).toByte(); buf[2] = ((other.name ushr 16) and 0xFF).toByte(); buf[3] = ((other.name ushr 24) and 0xFF).toByte(); buf[4] = ((other.name ushr 32) and 0xFF).toByte(); buf[5] = ((other.name ushr 40) and 0xFF).toByte(); buf[6] = ((other.name ushr 48) and 0xFF).toByte(); buf[7] = ((other.name ushr 56) and 0xFF).toByte(); buf[8] = (other.signature and 0xFF).toByte(); buf[9] = ((other.signature ushr 8) and 0xFF).toByte(); buf[10] = ((other.signature ushr 16) and 0xFF).toByte(); buf[11] = ((other.signature ushr 24) and 0xFF).toByte(); buf[12] = ((other.signature ushr 32) and 0xFF).toByte(); buf[13] = ((other.signature ushr 40) and 0xFF).toByte(); buf[14] = ((other.signature ushr 48) and 0xFF).toByte(); buf[15] = ((other.signature ushr 56) and 0xFF).toByte(); buf[16] = other.access.toByte(); buf[24] = (other.internal_property and 0xFF).toByte(); buf[25] = ((other.internal_property ushr 8) and 0xFF).toByte(); buf[26] = ((other.internal_property ushr 16) and 0xFF).toByte(); buf[27] = ((other.internal_property ushr 24) and 0xFF).toByte(); buf[28] = ((other.internal_property ushr 32) and 0xFF).toByte(); buf[29] = ((other.internal_property ushr 40) and 0xFF).toByte(); buf[30] = ((other.internal_property ushr 48) and 0xFF).toByte(); buf[31] = ((other.internal_property ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(32); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toInt()
}

public fun alljoyn_interfacedescription_property_getannotation(property: alljoyn_interfacedescription_property, name: PCSTR, value: PCSTR, value_size: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_property_getannotation", longArrayOf(run { val buf = ByteArray(32); buf[0] = (property.name and 0xFF).toByte(); buf[1] = ((property.name ushr 8) and 0xFF).toByte(); buf[2] = ((property.name ushr 16) and 0xFF).toByte(); buf[3] = ((property.name ushr 24) and 0xFF).toByte(); buf[4] = ((property.name ushr 32) and 0xFF).toByte(); buf[5] = ((property.name ushr 40) and 0xFF).toByte(); buf[6] = ((property.name ushr 48) and 0xFF).toByte(); buf[7] = ((property.name ushr 56) and 0xFF).toByte(); buf[8] = (property.signature and 0xFF).toByte(); buf[9] = ((property.signature ushr 8) and 0xFF).toByte(); buf[10] = ((property.signature ushr 16) and 0xFF).toByte(); buf[11] = ((property.signature ushr 24) and 0xFF).toByte(); buf[12] = ((property.signature ushr 32) and 0xFF).toByte(); buf[13] = ((property.signature ushr 40) and 0xFF).toByte(); buf[14] = ((property.signature ushr 48) and 0xFF).toByte(); buf[15] = ((property.signature ushr 56) and 0xFF).toByte(); buf[16] = property.access.toByte(); buf[24] = (property.internal_property and 0xFF).toByte(); buf[25] = ((property.internal_property ushr 8) and 0xFF).toByte(); buf[26] = ((property.internal_property ushr 16) and 0xFF).toByte(); buf[27] = ((property.internal_property ushr 24) and 0xFF).toByte(); buf[28] = ((property.internal_property ushr 32) and 0xFF).toByte(); buf[29] = ((property.internal_property ushr 40) and 0xFF).toByte(); buf[30] = ((property.internal_property ushr 48) and 0xFF).toByte(); buf[31] = ((property.internal_property ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(32); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, name, value, value_size)).toInt()
}

public fun alljoyn_interfacedescription_property_getannotationatindex(property: alljoyn_interfacedescription_property, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_property_getannotationatindex", longArrayOf(run { val buf = ByteArray(32); buf[0] = (property.name and 0xFF).toByte(); buf[1] = ((property.name ushr 8) and 0xFF).toByte(); buf[2] = ((property.name ushr 16) and 0xFF).toByte(); buf[3] = ((property.name ushr 24) and 0xFF).toByte(); buf[4] = ((property.name ushr 32) and 0xFF).toByte(); buf[5] = ((property.name ushr 40) and 0xFF).toByte(); buf[6] = ((property.name ushr 48) and 0xFF).toByte(); buf[7] = ((property.name ushr 56) and 0xFF).toByte(); buf[8] = (property.signature and 0xFF).toByte(); buf[9] = ((property.signature ushr 8) and 0xFF).toByte(); buf[10] = ((property.signature ushr 16) and 0xFF).toByte(); buf[11] = ((property.signature ushr 24) and 0xFF).toByte(); buf[12] = ((property.signature ushr 32) and 0xFF).toByte(); buf[13] = ((property.signature ushr 40) and 0xFF).toByte(); buf[14] = ((property.signature ushr 48) and 0xFF).toByte(); buf[15] = ((property.signature ushr 56) and 0xFF).toByte(); buf[16] = property.access.toByte(); buf[24] = (property.internal_property and 0xFF).toByte(); buf[25] = ((property.internal_property ushr 8) and 0xFF).toByte(); buf[26] = ((property.internal_property ushr 16) and 0xFF).toByte(); buf[27] = ((property.internal_property ushr 24) and 0xFF).toByte(); buf[28] = ((property.internal_property ushr 32) and 0xFF).toByte(); buf[29] = ((property.internal_property ushr 40) and 0xFF).toByte(); buf[30] = ((property.internal_property ushr 48) and 0xFF).toByte(); buf[31] = ((property.internal_property ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(32); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, index.toLong(), name, name_size, value, value_size))
}

public fun alljoyn_interfacedescription_property_getannotationscount(property: alljoyn_interfacedescription_property): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_property_getannotationscount", longArrayOf(run { val buf = ByteArray(32); buf[0] = (property.name and 0xFF).toByte(); buf[1] = ((property.name ushr 8) and 0xFF).toByte(); buf[2] = ((property.name ushr 16) and 0xFF).toByte(); buf[3] = ((property.name ushr 24) and 0xFF).toByte(); buf[4] = ((property.name ushr 32) and 0xFF).toByte(); buf[5] = ((property.name ushr 40) and 0xFF).toByte(); buf[6] = ((property.name ushr 48) and 0xFF).toByte(); buf[7] = ((property.name ushr 56) and 0xFF).toByte(); buf[8] = (property.signature and 0xFF).toByte(); buf[9] = ((property.signature ushr 8) and 0xFF).toByte(); buf[10] = ((property.signature ushr 16) and 0xFF).toByte(); buf[11] = ((property.signature ushr 24) and 0xFF).toByte(); buf[12] = ((property.signature ushr 32) and 0xFF).toByte(); buf[13] = ((property.signature ushr 40) and 0xFF).toByte(); buf[14] = ((property.signature ushr 48) and 0xFF).toByte(); buf[15] = ((property.signature ushr 56) and 0xFF).toByte(); buf[16] = property.access.toByte(); buf[24] = (property.internal_property and 0xFF).toByte(); buf[25] = ((property.internal_property ushr 8) and 0xFF).toByte(); buf[26] = ((property.internal_property ushr 16) and 0xFF).toByte(); buf[27] = ((property.internal_property ushr 24) and 0xFF).toByte(); buf[28] = ((property.internal_property ushr 32) and 0xFF).toByte(); buf[29] = ((property.internal_property ushr 40) and 0xFF).toByte(); buf[30] = ((property.internal_property ushr 48) and 0xFF).toByte(); buf[31] = ((property.internal_property ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(32); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toULong()
}

public fun alljoyn_interfacedescription_setargdescription(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, description: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setargdescription", longArrayOf(iface, member, argname, description)).toInt()
}

public fun alljoyn_interfacedescription_setargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setargdescriptionforlanguage", longArrayOf(iface, member, arg, description, languagetag)).toInt()
}

public fun alljoyn_interfacedescription_setdescription(iface: alljoyn_interfacedescription, description: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setdescription", longArrayOf(iface, description))
}

public fun alljoyn_interfacedescription_setdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, languagetag: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setdescriptionforlanguage", longArrayOf(iface, description, languagetag)).toInt()
}

public fun alljoyn_interfacedescription_setdescriptionlanguage(iface: alljoyn_interfacedescription, language: PCSTR) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setdescriptionlanguage", longArrayOf(iface, language))
}

public fun alljoyn_interfacedescription_setdescriptiontranslationcallback(iface: alljoyn_interfacedescription, translationcallback: alljoyn_interfacedescription_translation_callback_ptr) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setdescriptiontranslationcallback", longArrayOf(iface, Win32DynamicFfi.objectSlot(translationcallback)))
}

public fun alljoyn_interfacedescription_setmemberdescription(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setmemberdescription", longArrayOf(iface, member, description)).toInt()
}

public fun alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setmemberdescriptionforlanguage", longArrayOf(iface, member, description, languagetag)).toInt()
}

public fun alljoyn_interfacedescription_setpropertydescription(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setpropertydescription", longArrayOf(iface, name, description)).toInt()
}

public fun alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_interfacedescription_setpropertydescriptionforlanguage", longArrayOf(iface, name, description, languagetag)).toInt()
}

public fun alljoyn_keystorelistener_create(callbacks: Long, context: Long): alljoyn_keystorelistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_keystorelistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_keystorelistener_destroy(listener: alljoyn_keystorelistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_keystorelistener_destroy", longArrayOf(listener))
}

public fun alljoyn_keystorelistener_getkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, sink: PCSTR, sink_sz: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_keystorelistener_getkeys", longArrayOf(listener, keystore, sink, sink_sz)).toInt()
}

public fun alljoyn_keystorelistener_putkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, source: PCSTR, password: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_keystorelistener_putkeys", longArrayOf(listener, keystore, source, password)).toInt()
}

public fun alljoyn_keystorelistener_with_synchronization_create(callbacks: Long, context: Long): alljoyn_keystorelistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_keystorelistener_with_synchronization_create", longArrayOf(callbacks, context))
}

public fun alljoyn_message_create(bus: alljoyn_busattachment): alljoyn_message {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_create", longArrayOf(bus))
}

public fun alljoyn_message_description(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_description", longArrayOf(msg, str, buf.toLong())).toULong()
}

public fun alljoyn_message_destroy(msg: alljoyn_message) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_destroy", longArrayOf(msg))
}

public fun alljoyn_message_eql(one: alljoyn_message, other: alljoyn_message): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_eql", longArrayOf(one, other)).toInt()
}

public fun alljoyn_message_getarg(msg: alljoyn_message, argn: ULong): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getarg", longArrayOf(msg, argn.toLong()))
}

public fun alljoyn_message_getargs(msg: alljoyn_message, numargs: Long, args: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getargs", longArrayOf(msg, numargs, args))
}

public fun alljoyn_message_getauthmechanism(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getauthmechanism", longArrayOf(msg))
}

public fun alljoyn_message_getcallserial(msg: alljoyn_message): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getcallserial", longArrayOf(msg)).toUInt()
}

public fun alljoyn_message_getcompressiontoken(msg: alljoyn_message): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getcompressiontoken", longArrayOf(msg)).toUInt()
}

public fun alljoyn_message_getdestination(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getdestination", longArrayOf(msg))
}

public fun alljoyn_message_geterrorname(msg: alljoyn_message, errormessage: PCSTR, errormessage_size: Long): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_geterrorname", longArrayOf(msg, errormessage, errormessage_size))
}

public fun alljoyn_message_getflags(msg: alljoyn_message): UByte {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getflags", longArrayOf(msg)).toUByte()
}

public fun alljoyn_message_getinterface(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getinterface", longArrayOf(msg))
}

public fun alljoyn_message_getmembername(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getmembername", longArrayOf(msg))
}

public fun alljoyn_message_getobjectpath(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getobjectpath", longArrayOf(msg))
}

public fun alljoyn_message_getreceiveendpointname(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getreceiveendpointname", longArrayOf(msg))
}

public fun alljoyn_message_getreplyserial(msg: alljoyn_message): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getreplyserial", longArrayOf(msg)).toUInt()
}

public fun alljoyn_message_getsender(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getsender", longArrayOf(msg))
}

public fun alljoyn_message_getsessionid(msg: alljoyn_message): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getsessionid", longArrayOf(msg)).toUInt()
}

public fun alljoyn_message_getsignature(msg: alljoyn_message): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_getsignature", longArrayOf(msg))
}

public fun alljoyn_message_gettimestamp(msg: alljoyn_message): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_gettimestamp", longArrayOf(msg)).toUInt()
}

public fun alljoyn_message_gettype(msg: alljoyn_message): alljoyn_messagetype {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_gettype", longArrayOf(msg)).toInt()
}

public fun alljoyn_message_isbroadcastsignal(msg: alljoyn_message): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_isbroadcastsignal", longArrayOf(msg)).toInt()
}

public fun alljoyn_message_isencrypted(msg: alljoyn_message): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_isencrypted", longArrayOf(msg)).toInt()
}

public fun alljoyn_message_isexpired(msg: alljoyn_message, tillexpirems: Long): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_isexpired", longArrayOf(msg, tillexpirems)).toInt()
}

public fun alljoyn_message_isglobalbroadcast(msg: alljoyn_message): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_isglobalbroadcast", longArrayOf(msg)).toInt()
}

public fun alljoyn_message_issessionless(msg: alljoyn_message): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_issessionless", longArrayOf(msg)).toInt()
}

public fun alljoyn_message_isunreliable(msg: alljoyn_message): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_isunreliable", longArrayOf(msg)).toInt()
}

public fun alljoyn_message_parseargs(msg: alljoyn_message, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_parseargs", longArrayOf(msg, signature) + variadicArgs).toInt()
}

public fun alljoyn_message_setendianess(endian: Byte) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_setendianess", longArrayOf(endian.toLong()))
}

public fun alljoyn_message_tostring(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_message_tostring", longArrayOf(msg, str, buf.toLong())).toULong()
}

public fun alljoyn_msgarg_array_create(size: ULong): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_create", longArrayOf(size.toLong()))
}

public fun alljoyn_msgarg_array_element(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_element", longArrayOf(arg, index.toLong()))
}

public fun alljoyn_msgarg_array_get(args: alljoyn_msgarg, numargs: ULong, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_get", longArrayOf(args, numargs.toLong(), signature) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_array_set(args: alljoyn_msgarg, numargs: Long, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_set", longArrayOf(args, numargs, signature) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_array_set_offset(args: alljoyn_msgarg, argoffset: ULong, numargs: Long, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_set_offset", longArrayOf(args, argoffset.toLong(), numargs, signature) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_array_signature(values: alljoyn_msgarg, numvalues: ULong, str: PCSTR, buf: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_signature", longArrayOf(values, numvalues.toLong(), str, buf.toLong())).toULong()
}

public fun alljoyn_msgarg_array_tostring(args: alljoyn_msgarg, numargs: ULong, str: PCSTR, buf: ULong, indent: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_array_tostring", longArrayOf(args, numargs.toLong(), str, buf.toLong(), indent.toLong())).toULong()
}

public fun alljoyn_msgarg_clear(arg: alljoyn_msgarg) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_clear", longArrayOf(arg))
}

public fun alljoyn_msgarg_clone(destination: alljoyn_msgarg, source: alljoyn_msgarg) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_clone", longArrayOf(destination, source))
}

public fun alljoyn_msgarg_copy(source: alljoyn_msgarg): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_copy", longArrayOf(source))
}

public fun alljoyn_msgarg_create(): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_create", longArrayOf())
}

public fun alljoyn_msgarg_create_and_set(signature: PCSTR, vararg variadicArgs: Long): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_create_and_set", longArrayOf(signature) + variadicArgs)
}

public fun alljoyn_msgarg_destroy(arg: alljoyn_msgarg) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_destroy", longArrayOf(arg))
}

public fun alljoyn_msgarg_equal(lhv: alljoyn_msgarg, rhv: alljoyn_msgarg): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_equal", longArrayOf(lhv, rhv)).toInt()
}

public fun alljoyn_msgarg_get(arg: alljoyn_msgarg, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get", longArrayOf(arg, signature) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_get_array_element(arg: alljoyn_msgarg, index: ULong, element: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_array_element", longArrayOf(arg, index.toLong(), element))
}

public fun alljoyn_msgarg_get_array_elementsignature(arg: alljoyn_msgarg, index: ULong): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_array_elementsignature", longArrayOf(arg, index.toLong()))
}

public fun alljoyn_msgarg_get_array_numberofelements(arg: alljoyn_msgarg): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_array_numberofelements", longArrayOf(arg)).toULong()
}

public fun alljoyn_msgarg_get_bool(arg: alljoyn_msgarg, b: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_bool", longArrayOf(arg, b)).toInt()
}

public fun alljoyn_msgarg_get_bool_array(arg: alljoyn_msgarg, length: Long, ab: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_bool_array", longArrayOf(arg, length, ab)).toInt()
}

public fun alljoyn_msgarg_get_double(arg: alljoyn_msgarg, d: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_double", longArrayOf(arg, d)).toInt()
}

public fun alljoyn_msgarg_get_double_array(arg: alljoyn_msgarg, length: Long, ad: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_double_array", longArrayOf(arg, length, ad)).toInt()
}

public fun alljoyn_msgarg_get_int16(arg: alljoyn_msgarg, n: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_int16", longArrayOf(arg, n)).toInt()
}

public fun alljoyn_msgarg_get_int16_array(arg: alljoyn_msgarg, length: Long, an: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_int16_array", longArrayOf(arg, length, an)).toInt()
}

public fun alljoyn_msgarg_get_int32(arg: alljoyn_msgarg, i: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_int32", longArrayOf(arg, i)).toInt()
}

public fun alljoyn_msgarg_get_int32_array(arg: alljoyn_msgarg, length: Long, ai: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_int32_array", longArrayOf(arg, length, ai)).toInt()
}

public fun alljoyn_msgarg_get_int64(arg: alljoyn_msgarg, x: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_int64", longArrayOf(arg, x)).toInt()
}

public fun alljoyn_msgarg_get_int64_array(arg: alljoyn_msgarg, length: Long, ax: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_int64_array", longArrayOf(arg, length, ax)).toInt()
}

public fun alljoyn_msgarg_get_objectpath(arg: alljoyn_msgarg, o: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_objectpath", longArrayOf(arg, o)).toInt()
}

public fun alljoyn_msgarg_get_signature(arg: alljoyn_msgarg, g: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_signature", longArrayOf(arg, g)).toInt()
}

public fun alljoyn_msgarg_get_string(arg: alljoyn_msgarg, s: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_string", longArrayOf(arg, s)).toInt()
}

public fun alljoyn_msgarg_get_uint16(arg: alljoyn_msgarg, q: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint16", longArrayOf(arg, q)).toInt()
}

public fun alljoyn_msgarg_get_uint16_array(arg: alljoyn_msgarg, length: Long, aq: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint16_array", longArrayOf(arg, length, aq)).toInt()
}

public fun alljoyn_msgarg_get_uint32(arg: alljoyn_msgarg, u: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint32", longArrayOf(arg, u)).toInt()
}

public fun alljoyn_msgarg_get_uint32_array(arg: alljoyn_msgarg, length: Long, au: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint32_array", longArrayOf(arg, length, au)).toInt()
}

public fun alljoyn_msgarg_get_uint64(arg: alljoyn_msgarg, t: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint64", longArrayOf(arg, t)).toInt()
}

public fun alljoyn_msgarg_get_uint64_array(arg: alljoyn_msgarg, length: Long, at: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint64_array", longArrayOf(arg, length, at)).toInt()
}

public fun alljoyn_msgarg_get_uint8(arg: alljoyn_msgarg, y: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint8", longArrayOf(arg, y)).toInt()
}

public fun alljoyn_msgarg_get_uint8_array(arg: alljoyn_msgarg, length: Long, ay: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_uint8_array", longArrayOf(arg, length, ay)).toInt()
}

public fun alljoyn_msgarg_get_variant(arg: alljoyn_msgarg, v: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_variant", longArrayOf(arg, v)).toInt()
}

public fun alljoyn_msgarg_get_variant_array(arg: alljoyn_msgarg, signature: PCSTR, length: Long, av: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_get_variant_array", longArrayOf(arg, signature, length, av)).toInt()
}

public fun alljoyn_msgarg_getdictelement(arg: alljoyn_msgarg, elemsig: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_getdictelement", longArrayOf(arg, elemsig) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_getkey(arg: alljoyn_msgarg): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_getkey", longArrayOf(arg))
}

public fun alljoyn_msgarg_getmember(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_getmember", longArrayOf(arg, index.toLong()))
}

public fun alljoyn_msgarg_getnummembers(arg: alljoyn_msgarg): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_getnummembers", longArrayOf(arg)).toULong()
}

public fun alljoyn_msgarg_gettype(arg: alljoyn_msgarg): alljoyn_typeid {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_gettype", longArrayOf(arg)).toInt()
}

public fun alljoyn_msgarg_getvalue(arg: alljoyn_msgarg): alljoyn_msgarg {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_getvalue", longArrayOf(arg))
}

public fun alljoyn_msgarg_hassignature(arg: alljoyn_msgarg, signature: PCSTR): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_hassignature", longArrayOf(arg, signature)).toInt()
}

public fun alljoyn_msgarg_set(arg: alljoyn_msgarg, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set", longArrayOf(arg, signature) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_set_and_stabilize(arg: alljoyn_msgarg, signature: PCSTR, vararg variadicArgs: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_and_stabilize", longArrayOf(arg, signature) + variadicArgs).toInt()
}

public fun alljoyn_msgarg_set_bool(arg: alljoyn_msgarg, b: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_bool", longArrayOf(arg, b.toLong())).toInt()
}

public fun alljoyn_msgarg_set_bool_array(arg: alljoyn_msgarg, length: ULong, ab: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_bool_array", longArrayOf(arg, length.toLong(), ab)).toInt()
}

public fun alljoyn_msgarg_set_double(arg: alljoyn_msgarg, d: Double): QStatus {
    return Win32DynamicFfi.invokeFp("msajapi.dll", "alljoyn_msgarg_set_double", 8, false, longArrayOf(arg, d.toRawBits())).toLong().toInt()
}

public fun alljoyn_msgarg_set_double_array(arg: alljoyn_msgarg, length: ULong, ad: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_double_array", longArrayOf(arg, length.toLong(), ad)).toInt()
}

public fun alljoyn_msgarg_set_int16(arg: alljoyn_msgarg, n: Short): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_int16", longArrayOf(arg, n.toLong())).toInt()
}

public fun alljoyn_msgarg_set_int16_array(arg: alljoyn_msgarg, length: ULong, an: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_int16_array", longArrayOf(arg, length.toLong(), an)).toInt()
}

public fun alljoyn_msgarg_set_int32(arg: alljoyn_msgarg, i: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_int32", longArrayOf(arg, i.toLong())).toInt()
}

public fun alljoyn_msgarg_set_int32_array(arg: alljoyn_msgarg, length: ULong, ai: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_int32_array", longArrayOf(arg, length.toLong(), ai)).toInt()
}

public fun alljoyn_msgarg_set_int64(arg: alljoyn_msgarg, x: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_int64", longArrayOf(arg, x)).toInt()
}

public fun alljoyn_msgarg_set_int64_array(arg: alljoyn_msgarg, length: ULong, ax: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_int64_array", longArrayOf(arg, length.toLong(), ax)).toInt()
}

public fun alljoyn_msgarg_set_objectpath(arg: alljoyn_msgarg, o: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_objectpath", longArrayOf(arg, o)).toInt()
}

public fun alljoyn_msgarg_set_objectpath_array(arg: alljoyn_msgarg, length: ULong, ao: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_objectpath_array", longArrayOf(arg, length.toLong(), ao)).toInt()
}

public fun alljoyn_msgarg_set_signature(arg: alljoyn_msgarg, g: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_signature", longArrayOf(arg, g)).toInt()
}

public fun alljoyn_msgarg_set_signature_array(arg: alljoyn_msgarg, length: ULong, ag: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_signature_array", longArrayOf(arg, length.toLong(), ag)).toInt()
}

public fun alljoyn_msgarg_set_string(arg: alljoyn_msgarg, s: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_string", longArrayOf(arg, s)).toInt()
}

public fun alljoyn_msgarg_set_string_array(arg: alljoyn_msgarg, length: ULong, asTarget: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_string_array", longArrayOf(arg, length.toLong(), asTarget)).toInt()
}

public fun alljoyn_msgarg_set_uint16(arg: alljoyn_msgarg, q: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint16", longArrayOf(arg, q.toLong())).toInt()
}

public fun alljoyn_msgarg_set_uint16_array(arg: alljoyn_msgarg, length: ULong, aq: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint16_array", longArrayOf(arg, length.toLong(), aq)).toInt()
}

public fun alljoyn_msgarg_set_uint32(arg: alljoyn_msgarg, u: UInt): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint32", longArrayOf(arg, u.toLong())).toInt()
}

public fun alljoyn_msgarg_set_uint32_array(arg: alljoyn_msgarg, length: ULong, au: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint32_array", longArrayOf(arg, length.toLong(), au)).toInt()
}

public fun alljoyn_msgarg_set_uint64(arg: alljoyn_msgarg, t: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint64", longArrayOf(arg, t.toLong())).toInt()
}

public fun alljoyn_msgarg_set_uint64_array(arg: alljoyn_msgarg, length: ULong, at: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint64_array", longArrayOf(arg, length.toLong(), at)).toInt()
}

public fun alljoyn_msgarg_set_uint8(arg: alljoyn_msgarg, y: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint8", longArrayOf(arg, y.toLong())).toInt()
}

public fun alljoyn_msgarg_set_uint8_array(arg: alljoyn_msgarg, length: ULong, ay: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_set_uint8_array", longArrayOf(arg, length.toLong(), ay)).toInt()
}

public fun alljoyn_msgarg_setdictentry(arg: alljoyn_msgarg, key: alljoyn_msgarg, value: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_setdictentry", longArrayOf(arg, key, value)).toInt()
}

public fun alljoyn_msgarg_setstruct(arg: alljoyn_msgarg, struct_members: alljoyn_msgarg, num_members: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_setstruct", longArrayOf(arg, struct_members, num_members.toLong())).toInt()
}

public fun alljoyn_msgarg_signature(arg: alljoyn_msgarg, str: PCSTR, buf: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_signature", longArrayOf(arg, str, buf.toLong())).toULong()
}

public fun alljoyn_msgarg_stabilize(arg: alljoyn_msgarg) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_stabilize", longArrayOf(arg))
}

public fun alljoyn_msgarg_tostring(arg: alljoyn_msgarg, str: PCSTR, buf: ULong, indent: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_msgarg_tostring", longArrayOf(arg, str, buf.toLong(), indent.toLong())).toULong()
}

public fun alljoyn_observer_create(bus: alljoyn_busattachment, mandatoryinterfaces: Long, nummandatoryinterfaces: ULong): alljoyn_observer {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_create", longArrayOf(bus, mandatoryinterfaces, nummandatoryinterfaces.toLong()))
}

public fun alljoyn_observer_destroy(observer: alljoyn_observer) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_destroy", longArrayOf(observer))
}

public fun alljoyn_observer_get(observer: alljoyn_observer, uniquebusname: PCSTR, objectpath: PCSTR): alljoyn_proxybusobject_ref {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_get", longArrayOf(observer, uniquebusname, objectpath))
}

public fun alljoyn_observer_getfirst(observer: alljoyn_observer): alljoyn_proxybusobject_ref {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_getfirst", longArrayOf(observer))
}

public fun alljoyn_observer_getnext(observer: alljoyn_observer, proxyref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject_ref {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_getnext", longArrayOf(observer, proxyref))
}

public fun alljoyn_observer_registerlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener, triggeronexisting: Int) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_registerlistener", longArrayOf(observer, listener, triggeronexisting.toLong()))
}

public fun alljoyn_observer_unregisteralllisteners(observer: alljoyn_observer) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_unregisteralllisteners", longArrayOf(observer))
}

public fun alljoyn_observer_unregisterlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observer_unregisterlistener", longArrayOf(observer, listener))
}

public fun alljoyn_observerlistener_create(callback: Long, context: Long): alljoyn_observerlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observerlistener_create", longArrayOf(callback, context))
}

public fun alljoyn_observerlistener_destroy(listener: alljoyn_observerlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_observerlistener_destroy", longArrayOf(listener))
}

public fun alljoyn_passwordmanager_setcredentials(authmechanism: PCSTR, password: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_passwordmanager_setcredentials", longArrayOf(authmechanism, password)).toInt()
}

public fun alljoyn_permissionconfigurationlistener_create(callbacks: Long, context: Long): alljoyn_permissionconfigurationlistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurationlistener_create", longArrayOf(callbacks, context))
}

public fun alljoyn_permissionconfigurationlistener_destroy(listener: alljoyn_permissionconfigurationlistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurationlistener_destroy", longArrayOf(listener))
}

public fun alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_certificatechain_destroy", longArrayOf(certificatechain))
}

public fun alljoyn_permissionconfigurator_certificateid_cleanup(certificateid: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_certificateid_cleanup", longArrayOf(certificateid))
}

public fun alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_certificateidarray_cleanup", longArrayOf(certificateidarray))
}

public fun alljoyn_permissionconfigurator_claim(configurator: alljoyn_permissionconfigurator, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_claim", longArrayOf(configurator, cakey, identitycertificatechain, groupid, groupsize.toLong(), groupauthority, manifestsxmls, manifestscount.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_endmanagement(configurator: alljoyn_permissionconfigurator): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_endmanagement", longArrayOf(configurator)).toInt()
}

public fun alljoyn_permissionconfigurator_getapplicationstate(configurator: alljoyn_permissionconfigurator, state: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getapplicationstate", longArrayOf(configurator, state)).toInt()
}

public fun alljoyn_permissionconfigurator_getclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getclaimcapabilities", longArrayOf(configurator, claimcapabilities)).toInt()
}

public fun alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo", longArrayOf(configurator, additionalinfo)).toInt()
}

public fun alljoyn_permissionconfigurator_getdefaultclaimcapabilities(): UShort {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getdefaultclaimcapabilities", longArrayOf()).toUShort()
}

public fun alljoyn_permissionconfigurator_getdefaultpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getdefaultpolicy", longArrayOf(configurator, policyxml)).toInt()
}

public fun alljoyn_permissionconfigurator_getidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getidentity", longArrayOf(configurator, identitycertificatechain)).toInt()
}

public fun alljoyn_permissionconfigurator_getidentitycertificateid(configurator: alljoyn_permissionconfigurator, certificateid: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getidentitycertificateid", longArrayOf(configurator, certificateid)).toInt()
}

public fun alljoyn_permissionconfigurator_getmanifests(configurator: alljoyn_permissionconfigurator, manifestarray: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getmanifests", longArrayOf(configurator, manifestarray)).toInt()
}

public fun alljoyn_permissionconfigurator_getmanifesttemplate(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getmanifesttemplate", longArrayOf(configurator, manifesttemplatexml)).toInt()
}

public fun alljoyn_permissionconfigurator_getmembershipsummaries(configurator: alljoyn_permissionconfigurator, certificateids: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getmembershipsummaries", longArrayOf(configurator, certificateids)).toInt()
}

public fun alljoyn_permissionconfigurator_getpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getpolicy", longArrayOf(configurator, policyxml)).toInt()
}

public fun alljoyn_permissionconfigurator_getpublickey(configurator: alljoyn_permissionconfigurator, publickey: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_getpublickey", longArrayOf(configurator, publickey)).toInt()
}

public fun alljoyn_permissionconfigurator_installmanifests(configurator: alljoyn_permissionconfigurator, manifestsxmls: Long, manifestscount: ULong, append: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_installmanifests", longArrayOf(configurator, manifestsxmls, manifestscount.toLong(), append.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_installmembership(configurator: alljoyn_permissionconfigurator, membershipcertificatechain: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_installmembership", longArrayOf(configurator, membershipcertificatechain)).toInt()
}

public fun alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_manifestarray_cleanup", longArrayOf(manifestarray))
}

public fun alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_manifesttemplate_destroy", longArrayOf(manifesttemplatexml))
}

public fun alljoyn_permissionconfigurator_policy_destroy(policyxml: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_policy_destroy", longArrayOf(policyxml))
}

public fun alljoyn_permissionconfigurator_publickey_destroy(publickey: Long) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_publickey_destroy", longArrayOf(publickey))
}

public fun alljoyn_permissionconfigurator_removemembership(configurator: alljoyn_permissionconfigurator, serial: Long, seriallen: ULong, issuerpublickey: Long, issueraki: Long, issuerakilen: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_removemembership", longArrayOf(configurator, serial, seriallen.toLong(), issuerpublickey, issueraki, issuerakilen.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_reset(configurator: alljoyn_permissionconfigurator): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_reset", longArrayOf(configurator)).toInt()
}

public fun alljoyn_permissionconfigurator_resetpolicy(configurator: alljoyn_permissionconfigurator): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_resetpolicy", longArrayOf(configurator)).toInt()
}

public fun alljoyn_permissionconfigurator_setapplicationstate(configurator: alljoyn_permissionconfigurator, state: alljoyn_applicationstate): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_setapplicationstate", longArrayOf(configurator, state.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_setclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_setclaimcapabilities", longArrayOf(configurator, claimcapabilities.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: UShort): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo", longArrayOf(configurator, additionalinfo.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_setmanifesttemplatefromxml", longArrayOf(configurator, manifesttemplatexml)).toInt()
}

public fun alljoyn_permissionconfigurator_startmanagement(configurator: alljoyn_permissionconfigurator): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_startmanagement", longArrayOf(configurator)).toInt()
}

public fun alljoyn_permissionconfigurator_updateidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_updateidentity", longArrayOf(configurator, identitycertificatechain, manifestsxmls, manifestscount.toLong())).toInt()
}

public fun alljoyn_permissionconfigurator_updatepolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_permissionconfigurator_updatepolicy", longArrayOf(configurator, policyxml)).toInt()
}

public fun alljoyn_pinglistener_create(callback: Long, context: Long): alljoyn_pinglistener {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_pinglistener_create", longArrayOf(callback, context))
}

public fun alljoyn_pinglistener_destroy(listener: alljoyn_pinglistener) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_pinglistener_destroy", longArrayOf(listener))
}

public fun alljoyn_proxybusobject_addchild(proxyobj: alljoyn_proxybusobject, child: alljoyn_proxybusobject): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_addchild", longArrayOf(proxyobj, child)).toInt()
}

public fun alljoyn_proxybusobject_addinterface(proxyobj: alljoyn_proxybusobject, iface: alljoyn_interfacedescription): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_addinterface", longArrayOf(proxyobj, iface)).toInt()
}

public fun alljoyn_proxybusobject_addinterface_by_name(proxyobj: alljoyn_proxybusobject, name: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_addinterface_by_name", longArrayOf(proxyobj, name)).toInt()
}

public fun alljoyn_proxybusobject_copy(source: alljoyn_proxybusobject): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_copy", longArrayOf(source))
}

public fun alljoyn_proxybusobject_create(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_create", longArrayOf(bus, service, path, sessionid.toLong()))
}

public fun alljoyn_proxybusobject_create_secure(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_create_secure", longArrayOf(bus, service, path, sessionid.toLong()))
}

public fun alljoyn_proxybusobject_destroy(proxyobj: alljoyn_proxybusobject) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_destroy", longArrayOf(proxyobj))
}

public fun alljoyn_proxybusobject_enablepropertycaching(proxyobj: alljoyn_proxybusobject) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_enablepropertycaching", longArrayOf(proxyobj))
}

public fun alljoyn_proxybusobject_getallproperties(proxyobj: alljoyn_proxybusobject, iface: PCSTR, values: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getallproperties", longArrayOf(proxyobj, iface, values)).toInt()
}

public fun alljoyn_proxybusobject_getallpropertiesasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_getallpropertiescb_ptr, timeout: UInt, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getallpropertiesasync", longArrayOf(proxyobj, iface, Win32DynamicFfi.objectSlot(callback), timeout.toLong(), context)).toInt()
}

public fun alljoyn_proxybusobject_getchild(proxyobj: alljoyn_proxybusobject, path: PCSTR): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getchild", longArrayOf(proxyobj, path))
}

public fun alljoyn_proxybusobject_getchildren(proxyobj: alljoyn_proxybusobject, children: Long, numchildren: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getchildren", longArrayOf(proxyobj, children, numchildren.toLong())).toULong()
}

public fun alljoyn_proxybusobject_getinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): alljoyn_interfacedescription {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getinterface", longArrayOf(proxyobj, iface))
}

public fun alljoyn_proxybusobject_getinterfaces(proxyobj: alljoyn_proxybusobject, ifaces: Long, numifaces: ULong): ULong {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getinterfaces", longArrayOf(proxyobj, ifaces, numifaces.toLong())).toULong()
}

public fun alljoyn_proxybusobject_getpath(proxyobj: alljoyn_proxybusobject): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getpath", longArrayOf(proxyobj))
}

public fun alljoyn_proxybusobject_getproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getproperty", longArrayOf(proxyobj, iface, property, value)).toInt()
}

public fun alljoyn_proxybusobject_getpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, callback: alljoyn_proxybusobject_listener_getpropertycb_ptr, timeout: UInt, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getpropertyasync", longArrayOf(proxyobj, iface, property, Win32DynamicFfi.objectSlot(callback), timeout.toLong(), context)).toInt()
}

public fun alljoyn_proxybusobject_getservicename(proxyobj: alljoyn_proxybusobject): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getservicename", longArrayOf(proxyobj))
}

public fun alljoyn_proxybusobject_getsessionid(proxyobj: alljoyn_proxybusobject): UInt {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getsessionid", longArrayOf(proxyobj)).toUInt()
}

public fun alljoyn_proxybusobject_getuniquename(proxyobj: alljoyn_proxybusobject): PCSTR {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_getuniquename", longArrayOf(proxyobj))
}

public fun alljoyn_proxybusobject_implementsinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_implementsinterface", longArrayOf(proxyobj, iface)).toInt()
}

public fun alljoyn_proxybusobject_introspectremoteobject(proxyobj: alljoyn_proxybusobject): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_introspectremoteobject", longArrayOf(proxyobj)).toInt()
}

public fun alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj: alljoyn_proxybusobject, callback: alljoyn_proxybusobject_listener_introspectcb_ptr, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_introspectremoteobjectasync", longArrayOf(proxyobj, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun alljoyn_proxybusobject_issecure(proxyobj: alljoyn_proxybusobject): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_issecure", longArrayOf(proxyobj)).toInt()
}

public fun alljoyn_proxybusobject_isvalid(proxyobj: alljoyn_proxybusobject): Int {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_isvalid", longArrayOf(proxyobj)).toInt()
}

public fun alljoyn_proxybusobject_methodcall(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_methodcall", longArrayOf(proxyobj, ifacename, methodname, args, numargs.toLong(), replymsg, timeout.toLong(), flags.toLong())).toInt()
}

public fun alljoyn_proxybusobject_methodcall_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_methodcall_member", longArrayOf(proxyobj, run { val buf = ByteArray(56); buf[0] = (method.iface and 0xFF).toByte(); buf[1] = ((method.iface ushr 8) and 0xFF).toByte(); buf[2] = ((method.iface ushr 16) and 0xFF).toByte(); buf[3] = ((method.iface ushr 24) and 0xFF).toByte(); buf[4] = ((method.iface ushr 32) and 0xFF).toByte(); buf[5] = ((method.iface ushr 40) and 0xFF).toByte(); buf[6] = ((method.iface ushr 48) and 0xFF).toByte(); buf[7] = ((method.iface ushr 56) and 0xFF).toByte(); buf[8] = (method.memberType and 0xFF).toByte(); buf[9] = ((method.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((method.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((method.memberType ushr 24) and 0xFF).toByte(); buf[16] = (method.name and 0xFF).toByte(); buf[17] = ((method.name ushr 8) and 0xFF).toByte(); buf[18] = ((method.name ushr 16) and 0xFF).toByte(); buf[19] = ((method.name ushr 24) and 0xFF).toByte(); buf[20] = ((method.name ushr 32) and 0xFF).toByte(); buf[21] = ((method.name ushr 40) and 0xFF).toByte(); buf[22] = ((method.name ushr 48) and 0xFF).toByte(); buf[23] = ((method.name ushr 56) and 0xFF).toByte(); buf[24] = (method.signature and 0xFF).toByte(); buf[25] = ((method.signature ushr 8) and 0xFF).toByte(); buf[26] = ((method.signature ushr 16) and 0xFF).toByte(); buf[27] = ((method.signature ushr 24) and 0xFF).toByte(); buf[28] = ((method.signature ushr 32) and 0xFF).toByte(); buf[29] = ((method.signature ushr 40) and 0xFF).toByte(); buf[30] = ((method.signature ushr 48) and 0xFF).toByte(); buf[31] = ((method.signature ushr 56) and 0xFF).toByte(); buf[32] = (method.returnSignature and 0xFF).toByte(); buf[33] = ((method.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((method.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((method.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((method.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((method.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((method.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((method.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (method.argNames and 0xFF).toByte(); buf[41] = ((method.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((method.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((method.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((method.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((method.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((method.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((method.argNames ushr 56) and 0xFF).toByte(); buf[48] = (method.internal_member and 0xFF).toByte(); buf[49] = ((method.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((method.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((method.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((method.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((method.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((method.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((method.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, args, numargs.toLong(), replymsg, timeout.toLong(), flags.toLong())).toInt()
}

public fun alljoyn_proxybusobject_methodcall_member_noreply(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_methodcall_member_noreply", longArrayOf(proxyobj, run { val buf = ByteArray(56); buf[0] = (method.iface and 0xFF).toByte(); buf[1] = ((method.iface ushr 8) and 0xFF).toByte(); buf[2] = ((method.iface ushr 16) and 0xFF).toByte(); buf[3] = ((method.iface ushr 24) and 0xFF).toByte(); buf[4] = ((method.iface ushr 32) and 0xFF).toByte(); buf[5] = ((method.iface ushr 40) and 0xFF).toByte(); buf[6] = ((method.iface ushr 48) and 0xFF).toByte(); buf[7] = ((method.iface ushr 56) and 0xFF).toByte(); buf[8] = (method.memberType and 0xFF).toByte(); buf[9] = ((method.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((method.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((method.memberType ushr 24) and 0xFF).toByte(); buf[16] = (method.name and 0xFF).toByte(); buf[17] = ((method.name ushr 8) and 0xFF).toByte(); buf[18] = ((method.name ushr 16) and 0xFF).toByte(); buf[19] = ((method.name ushr 24) and 0xFF).toByte(); buf[20] = ((method.name ushr 32) and 0xFF).toByte(); buf[21] = ((method.name ushr 40) and 0xFF).toByte(); buf[22] = ((method.name ushr 48) and 0xFF).toByte(); buf[23] = ((method.name ushr 56) and 0xFF).toByte(); buf[24] = (method.signature and 0xFF).toByte(); buf[25] = ((method.signature ushr 8) and 0xFF).toByte(); buf[26] = ((method.signature ushr 16) and 0xFF).toByte(); buf[27] = ((method.signature ushr 24) and 0xFF).toByte(); buf[28] = ((method.signature ushr 32) and 0xFF).toByte(); buf[29] = ((method.signature ushr 40) and 0xFF).toByte(); buf[30] = ((method.signature ushr 48) and 0xFF).toByte(); buf[31] = ((method.signature ushr 56) and 0xFF).toByte(); buf[32] = (method.returnSignature and 0xFF).toByte(); buf[33] = ((method.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((method.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((method.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((method.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((method.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((method.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((method.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (method.argNames and 0xFF).toByte(); buf[41] = ((method.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((method.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((method.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((method.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((method.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((method.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((method.argNames ushr 56) and 0xFF).toByte(); buf[48] = (method.internal_member and 0xFF).toByte(); buf[49] = ((method.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((method.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((method.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((method.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((method.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((method.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((method.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, args, numargs.toLong(), flags.toLong())).toInt()
}

public fun alljoyn_proxybusobject_methodcall_noreply(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_methodcall_noreply", longArrayOf(proxyobj, ifacename, methodname, args, numargs.toLong(), flags.toLong())).toInt()
}

public fun alljoyn_proxybusobject_methodcallasync(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_methodcallasync", longArrayOf(proxyobj, ifacename, methodname, Win32DynamicFfi.objectSlot(replyfunc), args, numargs.toLong(), context, timeout.toLong(), flags.toLong())).toInt()
}

public fun alljoyn_proxybusobject_methodcallasync_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_methodcallasync_member", longArrayOf(proxyobj, run { val buf = ByteArray(56); buf[0] = (method.iface and 0xFF).toByte(); buf[1] = ((method.iface ushr 8) and 0xFF).toByte(); buf[2] = ((method.iface ushr 16) and 0xFF).toByte(); buf[3] = ((method.iface ushr 24) and 0xFF).toByte(); buf[4] = ((method.iface ushr 32) and 0xFF).toByte(); buf[5] = ((method.iface ushr 40) and 0xFF).toByte(); buf[6] = ((method.iface ushr 48) and 0xFF).toByte(); buf[7] = ((method.iface ushr 56) and 0xFF).toByte(); buf[8] = (method.memberType and 0xFF).toByte(); buf[9] = ((method.memberType ushr 8) and 0xFF).toByte(); buf[10] = ((method.memberType ushr 16) and 0xFF).toByte(); buf[11] = ((method.memberType ushr 24) and 0xFF).toByte(); buf[16] = (method.name and 0xFF).toByte(); buf[17] = ((method.name ushr 8) and 0xFF).toByte(); buf[18] = ((method.name ushr 16) and 0xFF).toByte(); buf[19] = ((method.name ushr 24) and 0xFF).toByte(); buf[20] = ((method.name ushr 32) and 0xFF).toByte(); buf[21] = ((method.name ushr 40) and 0xFF).toByte(); buf[22] = ((method.name ushr 48) and 0xFF).toByte(); buf[23] = ((method.name ushr 56) and 0xFF).toByte(); buf[24] = (method.signature and 0xFF).toByte(); buf[25] = ((method.signature ushr 8) and 0xFF).toByte(); buf[26] = ((method.signature ushr 16) and 0xFF).toByte(); buf[27] = ((method.signature ushr 24) and 0xFF).toByte(); buf[28] = ((method.signature ushr 32) and 0xFF).toByte(); buf[29] = ((method.signature ushr 40) and 0xFF).toByte(); buf[30] = ((method.signature ushr 48) and 0xFF).toByte(); buf[31] = ((method.signature ushr 56) and 0xFF).toByte(); buf[32] = (method.returnSignature and 0xFF).toByte(); buf[33] = ((method.returnSignature ushr 8) and 0xFF).toByte(); buf[34] = ((method.returnSignature ushr 16) and 0xFF).toByte(); buf[35] = ((method.returnSignature ushr 24) and 0xFF).toByte(); buf[36] = ((method.returnSignature ushr 32) and 0xFF).toByte(); buf[37] = ((method.returnSignature ushr 40) and 0xFF).toByte(); buf[38] = ((method.returnSignature ushr 48) and 0xFF).toByte(); buf[39] = ((method.returnSignature ushr 56) and 0xFF).toByte(); buf[40] = (method.argNames and 0xFF).toByte(); buf[41] = ((method.argNames ushr 8) and 0xFF).toByte(); buf[42] = ((method.argNames ushr 16) and 0xFF).toByte(); buf[43] = ((method.argNames ushr 24) and 0xFF).toByte(); buf[44] = ((method.argNames ushr 32) and 0xFF).toByte(); buf[45] = ((method.argNames ushr 40) and 0xFF).toByte(); buf[46] = ((method.argNames ushr 48) and 0xFF).toByte(); buf[47] = ((method.argNames ushr 56) and 0xFF).toByte(); buf[48] = (method.internal_member and 0xFF).toByte(); buf[49] = ((method.internal_member ushr 8) and 0xFF).toByte(); buf[50] = ((method.internal_member ushr 16) and 0xFF).toByte(); buf[51] = ((method.internal_member ushr 24) and 0xFF).toByte(); buf[52] = ((method.internal_member ushr 32) and 0xFF).toByte(); buf[53] = ((method.internal_member ushr 40) and 0xFF).toByte(); buf[54] = ((method.internal_member ushr 48) and 0xFF).toByte(); buf[55] = ((method.internal_member ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(56); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, Win32DynamicFfi.objectSlot(replyfunc), args, numargs.toLong(), context, timeout.toLong(), flags.toLong())).toInt()
}

public fun alljoyn_proxybusobject_parsexml(proxyobj: alljoyn_proxybusobject, xml: PCSTR, identifier: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_parsexml", longArrayOf(proxyobj, xml, identifier)).toInt()
}

public fun alljoyn_proxybusobject_ref_create(proxy: alljoyn_proxybusobject): alljoyn_proxybusobject_ref {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_ref_create", longArrayOf(proxy))
}

public fun alljoyn_proxybusobject_ref_decref(ref: alljoyn_proxybusobject_ref) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_ref_decref", longArrayOf(ref))
}

public fun alljoyn_proxybusobject_ref_get(ref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_ref_get", longArrayOf(ref))
}

public fun alljoyn_proxybusobject_ref_incref(ref: alljoyn_proxybusobject_ref) {
    Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_ref_incref", longArrayOf(ref))
}

public fun alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, properties: Long, numproperties: ULong, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_registerpropertieschangedlistener", longArrayOf(proxyobj, iface, properties, numproperties.toLong(), Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun alljoyn_proxybusobject_removechild(proxyobj: alljoyn_proxybusobject, path: PCSTR): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_removechild", longArrayOf(proxyobj, path)).toInt()
}

public fun alljoyn_proxybusobject_secureconnection(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_secureconnection", longArrayOf(proxyobj, forceauth.toLong())).toInt()
}

public fun alljoyn_proxybusobject_secureconnectionasync(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_secureconnectionasync", longArrayOf(proxyobj, forceauth.toLong())).toInt()
}

public fun alljoyn_proxybusobject_setproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_setproperty", longArrayOf(proxyobj, iface, property, value)).toInt()
}

public fun alljoyn_proxybusobject_setpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg, callback: alljoyn_proxybusobject_listener_setpropertycb_ptr, timeout: UInt, context: Long): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_setpropertyasync", longArrayOf(proxyobj, iface, property, value, Win32DynamicFfi.objectSlot(callback), timeout.toLong(), context)).toInt()
}

public fun alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_proxybusobject_unregisterpropertieschangedlistener", longArrayOf(proxyobj, iface, Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun alljoyn_routerinit(): QStatus {
    return Win32DynamicFfi.invoke("msajapi.dll", "alljoyn_routerinit", longArrayOf()).toInt()
}
