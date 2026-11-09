@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AllJoynAcceptBusConnection(serverbushandle: HANDLE, abortevent: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection(serverbushandle.toCPointer<ByteVar>(), abortevent.toCPointer<ByteVar>())

public actual fun AllJoynCloseBusHandle(bushandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle(bushandle.toCPointer<ByteVar>())

public actual fun AllJoynConnectToBus(connectionspec: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus(connectionspec.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AllJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus(outbuffersize, inbuffersize, lpsecurityattributes.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AllJoynEnumEvents(connectedbushandle: HANDLE, eventtoreset: HANDLE, eventtypes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents(connectedbushandle.toCPointer<ByteVar>(), eventtoreset.toCPointer<ByteVar>(), eventtypes.toCPointer<ByteVar>())

public actual fun AllJoynEventSelect(connectedbushandle: HANDLE, eventhandle: HANDLE, eventtypes: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect(connectedbushandle.toCPointer<ByteVar>(), eventhandle.toCPointer<ByteVar>(), eventtypes)

public actual fun AllJoynReceiveFromBus(connectedbushandle: HANDLE, buffer: Long, bytestoread: UInt, bytestransferred: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus(connectedbushandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bytestoread, bytestransferred.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun AllJoynSendToBus(connectedbushandle: HANDLE, buffer: Long, bytestowrite: UInt, bytestransferred: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus(connectedbushandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bytestowrite, bytestransferred.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun QCC_StatusText(status: QStatus): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_QCC_StatusText(status)?.toLong() ?: 0L

public actual fun alljoyn_aboutdata_create(defaultlanguage: PCSTR): alljoyn_aboutdata =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create(defaultlanguage.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_create_empty(): alljoyn_aboutdata =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty()

public actual fun alljoyn_aboutdata_create_full(arg: alljoyn_msgarg, language: PCSTR): alljoyn_aboutdata =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full(arg, language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_createfrommsgarg(data: alljoyn_aboutdata, arg: alljoyn_msgarg, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg(data, arg, language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_createfromxml(data: alljoyn_aboutdata, aboutdataxml: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml(data, aboutdataxml.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_destroy(data: alljoyn_aboutdata) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy(data)
}

public actual fun alljoyn_aboutdata_getaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata(data, msgarg, language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getajsoftwareversion(data: alljoyn_aboutdata, ajsoftwareversion: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion(data, ajsoftwareversion.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getannouncedaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata(data, msgarg)

public actual fun alljoyn_aboutdata_getappid(data: alljoyn_aboutdata, appid: Long, num: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid(data, appid.toCPointer<ByteVar>(), num.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getappname(data: alljoyn_aboutdata, appname: Long, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname(data, appname.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture(data, dateofmanufacture.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage(data, defaultlanguage.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getdescription(data: alljoyn_aboutdata, description: Long, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription(data, description.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getdeviceid(data: alljoyn_aboutdata, deviceid: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid(data, deviceid.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getdevicename(data: alljoyn_aboutdata, devicename: Long, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename(data, devicename.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getfield(data: alljoyn_aboutdata, name: PCSTR, value: Long, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield(data, name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getfields(data: alljoyn_aboutdata, fields: Long, num_fields: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields(data, fields.toCPointer<ByteVar>(), num_fields)

public actual fun alljoyn_aboutdata_getfieldsignature(data: alljoyn_aboutdata, fieldname: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature(data, fieldname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun alljoyn_aboutdata_gethardwareversion(data: alljoyn_aboutdata, hardwareversion: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion(data, hardwareversion.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getmanufacturer(data: alljoyn_aboutdata, manufacturer: Long, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer(data, manufacturer.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getmodelnumber(data: alljoyn_aboutdata, modelnumber: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber(data, modelnumber.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getsoftwareversion(data: alljoyn_aboutdata, softwareversion: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion(data, softwareversion.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_getsupportedlanguages(data: alljoyn_aboutdata, languagetags: Long, num: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages(data, languagetags.toCPointer<ByteVar>(), num)

public actual fun alljoyn_aboutdata_getsupporturl(data: alljoyn_aboutdata, supporturl: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl(data, supporturl.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_isfieldannounced(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced(data, fieldname.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_isfieldlocalized(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized(data, fieldname.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_isfieldrequired(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired(data, fieldname.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_isvalid(data: alljoyn_aboutdata, language: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid(data, language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setappid(data: alljoyn_aboutdata, appid: Long, num: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid(data, appid.toCPointer<ByteVar>(), num)

public actual fun alljoyn_aboutdata_setappid_fromstring(data: alljoyn_aboutdata, appid: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring(data, appid.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setappname(data: alljoyn_aboutdata, appname: PCSTR, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname(data, appname.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture(data, dateofmanufacture.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage(data, defaultlanguage.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setdescription(data: alljoyn_aboutdata, description: PCSTR, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription(data, description.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setdeviceid(data: alljoyn_aboutdata, deviceid: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid(data, deviceid.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setdevicename(data: alljoyn_aboutdata, devicename: PCSTR, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename(data, devicename.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setfield(data: alljoyn_aboutdata, name: PCSTR, value: alljoyn_msgarg, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield(data, name.toCPointer<ByteVar>(), value, language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_sethardwareversion(data: alljoyn_aboutdata, hardwareversion: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion(data, hardwareversion.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setmanufacturer(data: alljoyn_aboutdata, manufacturer: PCSTR, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer(data, manufacturer.toCPointer<ByteVar>(), language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setmodelnumber(data: alljoyn_aboutdata, modelnumber: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber(data, modelnumber.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setsoftwareversion(data: alljoyn_aboutdata, softwareversion: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion(data, softwareversion.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setsupportedlanguage(data: alljoyn_aboutdata, language: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage(data, language.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdata_setsupporturl(data: alljoyn_aboutdata, supporturl: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl(data, supporturl.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdatalistener_create(callbacks: Long, context: Long): alljoyn_aboutdatalistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_aboutdatalistener_destroy(listener: alljoyn_aboutdatalistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy(listener)
}

public actual fun alljoyn_abouticon_clear(icon: alljoyn_abouticon) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear(icon)
}

public actual fun alljoyn_abouticon_create(): alljoyn_abouticon =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create()

public actual fun alljoyn_abouticon_destroy(icon: alljoyn_abouticon) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy(icon)
}

public actual fun alljoyn_abouticon_getcontent(icon: alljoyn_abouticon, data: Long, size: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent(icon, data.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())
}

public actual fun alljoyn_abouticon_geturl(icon: alljoyn_abouticon, type: Long, url: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl(icon, type.toCPointer<ByteVar>(), url.toCPointer<ByteVar>())
}

public actual fun alljoyn_abouticon_setcontent(icon: alljoyn_abouticon, type: PCSTR, data: Long, csize: ULong, ownsdata: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent(icon, type.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), csize, ownsdata)

public actual fun alljoyn_abouticon_setcontent_frommsgarg(icon: alljoyn_abouticon, arg: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg(icon, arg)

public actual fun alljoyn_abouticon_seturl(icon: alljoyn_abouticon, type: PCSTR, url: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl(icon, type.toCPointer<ByteVar>(), url.toCPointer<ByteVar>())

public actual fun alljoyn_abouticonobj_create(bus: alljoyn_busattachment, icon: alljoyn_abouticon): alljoyn_abouticonobj =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create(bus, icon)

public actual fun alljoyn_abouticonobj_destroy(icon: alljoyn_abouticonobj) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy(icon)
}

public actual fun alljoyn_abouticonproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_abouticonproxy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create(bus, busname.toCPointer<ByteVar>(), sessionid)

public actual fun alljoyn_abouticonproxy_destroy(proxy: alljoyn_abouticonproxy) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy(proxy)
}

public actual fun alljoyn_abouticonproxy_geticon(proxy: alljoyn_abouticonproxy, icon: alljoyn_abouticon): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon(proxy, icon)

public actual fun alljoyn_abouticonproxy_getversion(proxy: alljoyn_abouticonproxy, version: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion(proxy, version.toCPointer<ByteVar>())

public actual fun alljoyn_aboutlistener_create(callback: Long, context: Long): alljoyn_aboutlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create(callback.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_aboutlistener_destroy(listener: alljoyn_aboutlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy(listener)
}

public actual fun alljoyn_aboutobj_announce(obj: alljoyn_aboutobj, sessionport: UShort, aboutdata: alljoyn_aboutdata): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce(obj, sessionport, aboutdata)

public actual fun alljoyn_aboutobj_announce_using_datalistener(obj: alljoyn_aboutobj, sessionport: UShort, aboutlistener: alljoyn_aboutdatalistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener(obj, sessionport, aboutlistener)

public actual fun alljoyn_aboutobj_create(bus: alljoyn_busattachment, isannounced: alljoyn_about_announceflag): alljoyn_aboutobj =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create(bus, isannounced)

public actual fun alljoyn_aboutobj_destroy(obj: alljoyn_aboutobj) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy(obj)
}

public actual fun alljoyn_aboutobj_unannounce(obj: alljoyn_aboutobj): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce(obj)

public actual fun alljoyn_aboutobjectdescription_clear(description: alljoyn_aboutobjectdescription) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear(description)
}

public actual fun alljoyn_aboutobjectdescription_create(): alljoyn_aboutobjectdescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create()

public actual fun alljoyn_aboutobjectdescription_create_full(arg: alljoyn_msgarg): alljoyn_aboutobjectdescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full(arg)

public actual fun alljoyn_aboutobjectdescription_createfrommsgarg(description: alljoyn_aboutobjectdescription, arg: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg(description, arg)

public actual fun alljoyn_aboutobjectdescription_destroy(description: alljoyn_aboutobjectdescription) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy(description)
}

public actual fun alljoyn_aboutobjectdescription_getinterfacepaths(description: alljoyn_aboutobjectdescription, interfacename: PCSTR, paths: Long, numpaths: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths(description, interfacename.toCPointer<ByteVar>(), paths.toCPointer<ByteVar>(), numpaths)

public actual fun alljoyn_aboutobjectdescription_getinterfaces(description: alljoyn_aboutobjectdescription, path: PCSTR, interfaces: Long, numinterfaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces(description, path.toCPointer<ByteVar>(), interfaces.toCPointer<ByteVar>(), numinterfaces)

public actual fun alljoyn_aboutobjectdescription_getmsgarg(description: alljoyn_aboutobjectdescription, msgarg: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg(description, msgarg)

public actual fun alljoyn_aboutobjectdescription_getpaths(description: alljoyn_aboutobjectdescription, paths: Long, numpaths: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths(description, paths.toCPointer<ByteVar>(), numpaths)

public actual fun alljoyn_aboutobjectdescription_hasinterface(description: alljoyn_aboutobjectdescription, interfacename: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface(description, interfacename.toCPointer<ByteVar>())

public actual fun alljoyn_aboutobjectdescription_hasinterfaceatpath(description: alljoyn_aboutobjectdescription, path: PCSTR, interfacename: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath(description, path.toCPointer<ByteVar>(), interfacename.toCPointer<ByteVar>())

public actual fun alljoyn_aboutobjectdescription_haspath(description: alljoyn_aboutobjectdescription, path: PCSTR): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath(description, path.toCPointer<ByteVar>())

public actual fun alljoyn_aboutproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_aboutproxy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create(bus, busname.toCPointer<ByteVar>(), sessionid)

public actual fun alljoyn_aboutproxy_destroy(proxy: alljoyn_aboutproxy) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy(proxy)
}

public actual fun alljoyn_aboutproxy_getaboutdata(proxy: alljoyn_aboutproxy, language: PCSTR, data: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata(proxy, language.toCPointer<ByteVar>(), data)

public actual fun alljoyn_aboutproxy_getobjectdescription(proxy: alljoyn_aboutproxy, objectdesc: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription(proxy, objectdesc)

public actual fun alljoyn_aboutproxy_getversion(proxy: alljoyn_aboutproxy, version: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion(proxy, version.toCPointer<ByteVar>())

public actual fun alljoyn_applicationstatelistener_create(callbacks: Long, context: Long): alljoyn_applicationstatelistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_applicationstatelistener_destroy(listener: alljoyn_applicationstatelistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy(listener)
}

public actual fun alljoyn_authlistener_create(callbacks: Long, context: Long): alljoyn_authlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_authlistener_destroy(listener: alljoyn_authlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy(listener)
}

public actual fun alljoyn_authlistener_requestcredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int, credentials: alljoyn_credentials): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse(listener, authcontext.toCPointer<ByteVar>(), accept, credentials)

public actual fun alljoyn_authlistener_setsharedsecret(listener: alljoyn_authlistener, sharedsecret: Long, sharedsecretsize: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret(listener, sharedsecret.toCPointer<ByteVar>(), sharedsecretsize)

public actual fun alljoyn_authlistener_verifycredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse(listener, authcontext.toCPointer<ByteVar>(), accept)

public actual fun alljoyn_authlistenerasync_create(callbacks: Long, context: Long): alljoyn_authlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_authlistenerasync_destroy(listener: alljoyn_authlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy(listener)
}

public actual fun alljoyn_autopinger_adddestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination(autopinger, group.toCPointer<ByteVar>(), destination.toCPointer<ByteVar>())

public actual fun alljoyn_autopinger_addpinggroup(autopinger: alljoyn_autopinger, group: PCSTR, listener: alljoyn_pinglistener, pinginterval: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup(autopinger, group.toCPointer<ByteVar>(), listener, pinginterval)
}

public actual fun alljoyn_autopinger_create(bus: alljoyn_busattachment): alljoyn_autopinger =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create(bus)

public actual fun alljoyn_autopinger_destroy(autopinger: alljoyn_autopinger) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy(autopinger)
}

public actual fun alljoyn_autopinger_pause(autopinger: alljoyn_autopinger) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause(autopinger)
}

public actual fun alljoyn_autopinger_removedestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR, removeall: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination(autopinger, group.toCPointer<ByteVar>(), destination.toCPointer<ByteVar>(), removeall)

public actual fun alljoyn_autopinger_removepinggroup(autopinger: alljoyn_autopinger, group: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup(autopinger, group.toCPointer<ByteVar>())
}

public actual fun alljoyn_autopinger_resume(autopinger: alljoyn_autopinger) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume(autopinger)
}

public actual fun alljoyn_autopinger_setpinginterval(autopinger: alljoyn_autopinger, group: PCSTR, pinginterval: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval(autopinger, group.toCPointer<ByteVar>(), pinginterval)

public actual fun alljoyn_busattachment_addlogonentry(bus: alljoyn_busattachment, authmechanism: PCSTR, username: PCSTR, password: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry(bus, authmechanism.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), password.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_addmatch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch(bus, rule.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_advertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename(bus, name.toCPointer<ByteVar>(), transports)

public actual fun alljoyn_busattachment_bindsessionport(bus: alljoyn_busattachment, sessionport: Long, opts: alljoyn_sessionopts, listener: alljoyn_sessionportlistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport(bus, sessionport.toCPointer<ByteVar>(), opts, listener)

public actual fun alljoyn_busattachment_canceladvertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename(bus, name.toCPointer<ByteVar>(), transports)

public actual fun alljoyn_busattachment_cancelfindadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname(bus, nameprefix.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_cancelfindadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport(bus, nameprefix.toCPointer<ByteVar>(), transports)

public actual fun alljoyn_busattachment_cancelwhoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface(bus, implementsinterface.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_cancelwhoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces(bus, implementsinterfaces.toCPointer<ByteVar>(), numberinterfaces)

public actual fun alljoyn_busattachment_clearkeys(bus: alljoyn_busattachment, guid: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys(bus, guid.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_clearkeystore(bus: alljoyn_busattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore(bus)
}

public actual fun alljoyn_busattachment_connect(bus: alljoyn_busattachment, connectspec: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect(bus, connectspec.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_create(applicationname: PCSTR, allowremotemessages: Int): alljoyn_busattachment =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create(applicationname.toCPointer<ByteVar>(), allowremotemessages)

public actual fun alljoyn_busattachment_create_concurrency(applicationname: PCSTR, allowremotemessages: Int, concurrency: UInt): alljoyn_busattachment =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency(applicationname.toCPointer<ByteVar>(), allowremotemessages, concurrency)

public actual fun alljoyn_busattachment_createinterface(bus: alljoyn_busattachment, name: PCSTR, iface: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface(bus, name.toCPointer<ByteVar>(), iface.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_createinterface_secure(bus: alljoyn_busattachment, name: PCSTR, iface: Long, secpolicy: alljoyn_interfacedescription_securitypolicy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure(bus, name.toCPointer<ByteVar>(), iface.toCPointer<ByteVar>(), secpolicy)

public actual fun alljoyn_busattachment_createinterfacesfromxml(bus: alljoyn_busattachment, xml: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml(bus, xml.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_deletedefaultkeystore(applicationname: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore(applicationname.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_deleteinterface(bus: alljoyn_busattachment, iface: alljoyn_interfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface(bus, iface)

public actual fun alljoyn_busattachment_destroy(bus: alljoyn_busattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy(bus)
}

public actual fun alljoyn_busattachment_disconnect(bus: alljoyn_busattachment, unused: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect(bus, unused.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_enableconcurrentcallbacks(bus: alljoyn_busattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks(bus)
}

public actual fun alljoyn_busattachment_enablepeersecurity(bus: alljoyn_busattachment, authmechanisms: PCSTR, listener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity(bus, authmechanisms.toCPointer<ByteVar>(), listener, keystorefilename.toCPointer<ByteVar>(), isshared)

public actual fun alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus: alljoyn_busattachment, authmechanisms: PCSTR, authlistener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int, permissionconfigurationlistener: alljoyn_permissionconfigurationlistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus, authmechanisms.toCPointer<ByteVar>(), authlistener, keystorefilename.toCPointer<ByteVar>(), isshared, permissionconfigurationlistener)

public actual fun alljoyn_busattachment_findadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname(bus, nameprefix.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_findadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport(bus, nameprefix.toCPointer<ByteVar>(), transports)

public actual fun alljoyn_busattachment_getalljoyndebugobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj(bus)

public actual fun alljoyn_busattachment_getalljoynproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj(bus)

public actual fun alljoyn_busattachment_getconcurrency(bus: alljoyn_busattachment): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency(bus)

public actual fun alljoyn_busattachment_getconnectspec(bus: alljoyn_busattachment): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec(bus)?.toLong() ?: 0L

public actual fun alljoyn_busattachment_getdbusproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj(bus)

public actual fun alljoyn_busattachment_getglobalguidstring(bus: alljoyn_busattachment): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring(bus)?.toLong() ?: 0L

public actual fun alljoyn_busattachment_getinterface(bus: alljoyn_busattachment, name: PCSTR): alljoyn_interfacedescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface(bus, name.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_getinterfaces(bus: alljoyn_busattachment, ifaces: Long, numifaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces(bus, ifaces.toCPointer<ByteVar>(), numifaces)

public actual fun alljoyn_busattachment_getkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration(bus, guid.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_getpeerguid(bus: alljoyn_busattachment, name: PCSTR, guid: PCSTR, guidsz: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid(bus, name.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>(), guidsz.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_getpermissionconfigurator(bus: alljoyn_busattachment): alljoyn_permissionconfigurator =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator(bus)

public actual fun alljoyn_busattachment_gettimestamp(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp()

public actual fun alljoyn_busattachment_getuniquename(bus: alljoyn_busattachment): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename(bus)?.toLong() ?: 0L

public actual fun alljoyn_busattachment_isconnected(bus: alljoyn_busattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected(bus)

public actual fun alljoyn_busattachment_ispeersecurityenabled(bus: alljoyn_busattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled(bus)

public actual fun alljoyn_busattachment_isstarted(bus: alljoyn_busattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted(bus)

public actual fun alljoyn_busattachment_isstopping(bus: alljoyn_busattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping(bus)

public actual fun alljoyn_busattachment_join(bus: alljoyn_busattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join(bus)

public actual fun alljoyn_busattachment_joinsession(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, sessionid: Long, opts: alljoyn_sessionopts): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession(bus, sessionhost.toCPointer<ByteVar>(), sessionport, listener, sessionid.toCPointer<ByteVar>(), opts)

public actual fun alljoyn_busattachment_joinsessionasync(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, opts: alljoyn_sessionopts, callback: alljoyn_busattachment_joinsessioncb_ptr, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync(bus, sessionhost.toCPointer<ByteVar>(), sessionport, listener, opts, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_leavesession(bus: alljoyn_busattachment, sessionid: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession(bus, sessionid)

public actual fun alljoyn_busattachment_namehasowner(bus: alljoyn_busattachment, name: PCSTR, hasowner: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner(bus, name.toCPointer<ByteVar>(), hasowner.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_ping(bus: alljoyn_busattachment, name: PCSTR, timeout: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping(bus, name.toCPointer<ByteVar>(), timeout)

public actual fun alljoyn_busattachment_registeraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener(bus, aboutlistener)
}

public actual fun alljoyn_busattachment_registerapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener(bus, listener)

public actual fun alljoyn_busattachment_registerbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener(bus, listener)
}

public actual fun alljoyn_busattachment_registerbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject(bus, obj)

public actual fun alljoyn_busattachment_registerbusobject_secure(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure(bus, obj)

public actual fun alljoyn_busattachment_registerkeystorelistener(bus: alljoyn_busattachment, listener: alljoyn_keystorelistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener(bus, listener)

public actual fun alljoyn_busattachment_registersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_registersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_releasename(bus: alljoyn_busattachment, name: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename(bus, name.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_reloadkeystore(bus: alljoyn_busattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore(bus)

public actual fun alljoyn_busattachment_removematch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch(bus, rule.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_removesessionmember(bus: alljoyn_busattachment, sessionid: UInt, membername: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember(bus, sessionid, membername.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_requestname(bus: alljoyn_busattachment, requestedname: PCSTR, flags: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname(bus, requestedname.toCPointer<ByteVar>(), flags)

public actual fun alljoyn_busattachment_secureconnection(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection(bus, name.toCPointer<ByteVar>(), forceauth)

public actual fun alljoyn_busattachment_secureconnectionasync(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync(bus, name.toCPointer<ByteVar>(), forceauth)

public actual fun alljoyn_busattachment_setdaemondebug(bus: alljoyn_busattachment, module: PCSTR, level: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug(bus, module.toCPointer<ByteVar>(), level)

public actual fun alljoyn_busattachment_setkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration(bus, guid.toCPointer<ByteVar>(), timeout)

public actual fun alljoyn_busattachment_setlinktimeout(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout(bus, sessionid, linktimeout.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_setlinktimeoutasync(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: UInt, callback: alljoyn_busattachment_setlinktimeoutcb_ptr, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync(bus, sessionid, linktimeout, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_setsessionlistener(bus: alljoyn_busattachment, sessionid: UInt, listener: alljoyn_sessionlistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener(bus, sessionid, listener)

public actual fun alljoyn_busattachment_start(bus: alljoyn_busattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start(bus)

public actual fun alljoyn_busattachment_stop(bus: alljoyn_busattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop(bus)

public actual fun alljoyn_busattachment_unbindsessionport(bus: alljoyn_busattachment, sessionport: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport(bus, sessionport)

public actual fun alljoyn_busattachment_unregisteraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener(bus, aboutlistener)
}

public actual fun alljoyn_busattachment_unregisterallaboutlisteners(bus: alljoyn_busattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners(bus)
}

public actual fun alljoyn_busattachment_unregisterallhandlers(bus: alljoyn_busattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers(bus)

public actual fun alljoyn_busattachment_unregisterapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener(bus, listener)

public actual fun alljoyn_busattachment_unregisterbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener(bus, listener)
}

public actual fun alljoyn_busattachment_unregisterbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject(bus, obj)
}

public actual fun alljoyn_busattachment_unregistersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_unregistersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_whoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface(bus, implementsinterface.toCPointer<ByteVar>())

public actual fun alljoyn_busattachment_whoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces(bus, implementsinterfaces.toCPointer<ByteVar>(), numberinterfaces)

public actual fun alljoyn_buslistener_create(callbacks: Long, context: Long): alljoyn_buslistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_buslistener_destroy(listener: alljoyn_buslistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy(listener)
}

public actual fun alljoyn_busobject_addinterface(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface(bus, iface)

public actual fun alljoyn_busobject_addinterface_announced(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced(bus, iface)

public actual fun alljoyn_busobject_addmethodhandler(bus: alljoyn_busobject, member: alljoyn_interfacedescription_member, handler: alljoyn_messagereceiver_methodhandler_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_busobject_addmethodhandlers(bus: alljoyn_busobject, entries: Long, numentries: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers(bus, entries.toCPointer<ByteVar>(), numentries)

public actual fun alljoyn_busobject_cancelsessionlessmessage(bus: alljoyn_busobject, msg: alljoyn_message): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage(bus, msg)

public actual fun alljoyn_busobject_cancelsessionlessmessage_serial(bus: alljoyn_busobject, serialnumber: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial(bus, serialnumber)

public actual fun alljoyn_busobject_create(path: PCSTR, isplaceholder: Int, callbacks_in: Long, context_in: Long): alljoyn_busobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create(path.toCPointer<ByteVar>(), isplaceholder, callbacks_in.toCPointer<ByteVar>(), context_in.toCPointer<ByteVar>())

public actual fun alljoyn_busobject_destroy(bus: alljoyn_busobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy(bus)
}

public actual fun alljoyn_busobject_emitpropertieschanged(bus: alljoyn_busobject, ifcname: PCSTR, propnames: Long, numprops: ULong, id: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged(bus, ifcname.toCPointer<ByteVar>(), propnames.toCPointer<ByteVar>(), numprops, id)
}

public actual fun alljoyn_busobject_emitpropertychanged(bus: alljoyn_busobject, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg, id: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged(bus, ifcname.toCPointer<ByteVar>(), propname.toCPointer<ByteVar>(), value, id)
}

public actual fun alljoyn_busobject_getannouncedinterfacenames(bus: alljoyn_busobject, interfaces: Long, numinterfaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames(bus, interfaces.toCPointer<ByteVar>(), numinterfaces)

public actual fun alljoyn_busobject_getbusattachment(bus: alljoyn_busobject): alljoyn_busattachment =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment(bus)

public actual fun alljoyn_busobject_getname(bus: alljoyn_busobject, buffer: PCSTR, buffersz: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname(bus, buffer.toCPointer<ByteVar>(), buffersz)

public actual fun alljoyn_busobject_getpath(bus: alljoyn_busobject): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath(bus)?.toLong() ?: 0L

public actual fun alljoyn_busobject_issecure(bus: alljoyn_busobject): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure(bus)

public actual fun alljoyn_busobject_methodreply_args(bus: alljoyn_busobject, msg: alljoyn_message, args: alljoyn_msgarg, numargs: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args(bus, msg, args, numargs)

public actual fun alljoyn_busobject_methodreply_err(bus: alljoyn_busobject, msg: alljoyn_message, error: PCSTR, errormessage: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err(bus, msg, error.toCPointer<ByteVar>(), errormessage.toCPointer<ByteVar>())

public actual fun alljoyn_busobject_methodreply_status(bus: alljoyn_busobject, msg: alljoyn_message, status: QStatus): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status(bus, msg, status)

public actual fun alljoyn_busobject_setannounceflag(bus: alljoyn_busobject, iface: alljoyn_interfacedescription, isannounced: alljoyn_about_announceflag): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag(bus, iface, isannounced)

public actual fun alljoyn_busobject_signal(bus: alljoyn_busobject, destination: PCSTR, sessionid: UInt, signal: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: alljoyn_message): QStatus =
    0

public actual fun alljoyn_credentials_clear(cred: alljoyn_credentials) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear(cred)
}

public actual fun alljoyn_credentials_create(): alljoyn_credentials =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create()

public actual fun alljoyn_credentials_destroy(cred: alljoyn_credentials) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy(cred)
}

public actual fun alljoyn_credentials_getcertchain(cred: alljoyn_credentials): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain(cred)?.toLong() ?: 0L

public actual fun alljoyn_credentials_getexpiration(cred: alljoyn_credentials): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration(cred)

public actual fun alljoyn_credentials_getlogonentry(cred: alljoyn_credentials): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry(cred)?.toLong() ?: 0L

public actual fun alljoyn_credentials_getpassword(cred: alljoyn_credentials): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword(cred)?.toLong() ?: 0L

public actual fun alljoyn_credentials_getprivateKey(cred: alljoyn_credentials): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey(cred)?.toLong() ?: 0L

public actual fun alljoyn_credentials_getusername(cred: alljoyn_credentials): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername(cred)?.toLong() ?: 0L

public actual fun alljoyn_credentials_isset(cred: alljoyn_credentials, creds: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset(cred, creds)

public actual fun alljoyn_credentials_setcertchain(cred: alljoyn_credentials, certchain: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain(cred, certchain.toCPointer<ByteVar>())
}

public actual fun alljoyn_credentials_setexpiration(cred: alljoyn_credentials, expiration: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration(cred, expiration)
}

public actual fun alljoyn_credentials_setlogonentry(cred: alljoyn_credentials, logonentry: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry(cred, logonentry.toCPointer<ByteVar>())
}

public actual fun alljoyn_credentials_setpassword(cred: alljoyn_credentials, pwd: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword(cred, pwd.toCPointer<ByteVar>())
}

public actual fun alljoyn_credentials_setprivatekey(cred: alljoyn_credentials, pk: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey(cred, pk.toCPointer<ByteVar>())
}

public actual fun alljoyn_credentials_setusername(cred: alljoyn_credentials, username: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername(cred, username.toCPointer<ByteVar>())
}

public actual fun alljoyn_getbuildinfo(): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo()?.toLong() ?: 0L

public actual fun alljoyn_getnumericversion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion()

public actual fun alljoyn_getversion(): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_getversion()?.toLong() ?: 0L

public actual fun alljoyn_init(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_init()

public actual fun alljoyn_interfacedescription_activate(iface: alljoyn_interfacedescription) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate(iface)
}

public actual fun alljoyn_interfacedescription_addannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation(iface, name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_addargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation(iface, member.toCPointer<ByteVar>(), argname.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_addmember(iface: alljoyn_interfacedescription, type: alljoyn_messagetype, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember(iface, type, name.toCPointer<ByteVar>(), inputsig.toCPointer<ByteVar>(), outsig.toCPointer<ByteVar>(), argnames.toCPointer<ByteVar>(), annotation)

public actual fun alljoyn_interfacedescription_addmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation(iface, member.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_addmethod(iface: alljoyn_interfacedescription, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod(iface, name.toCPointer<ByteVar>(), inputsig.toCPointer<ByteVar>(), outsig.toCPointer<ByteVar>(), argnames.toCPointer<ByteVar>(), annotation, accessperms.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_addproperty(iface: alljoyn_interfacedescription, name: PCSTR, signature: PCSTR, access: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty(iface, name.toCPointer<ByteVar>(), signature.toCPointer<ByteVar>(), access)

public actual fun alljoyn_interfacedescription_addpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation(iface, property.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_addsignal(iface: alljoyn_interfacedescription, name: PCSTR, sig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal(iface, name.toCPointer<ByteVar>(), sig.toCPointer<ByteVar>(), argnames.toCPointer<ByteVar>(), annotation, accessperms.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_eql(one: alljoyn_interfacedescription, other: alljoyn_interfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql(one, other)

public actual fun alljoyn_interfacedescription_getannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR, value_size: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation(iface, name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), value_size.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getannotationatindex(iface: alljoyn_interfacedescription, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex(iface, index, name.toCPointer<ByteVar>(), name_size.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), value_size.toCPointer<ByteVar>())
}

public actual fun alljoyn_interfacedescription_getannotationscount(iface: alljoyn_interfacedescription): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount(iface)

public actual fun alljoyn_interfacedescription_getargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage(iface, member.toCPointer<ByteVar>(), arg.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), maxlanguagelength, languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage(iface, description.toCPointer<ByteVar>(), maxlanguagelength, languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getdescriptionlanguages(iface: alljoyn_interfacedescription, languages: Long, size: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages(iface, languages.toCPointer<ByteVar>(), size)

public actual fun alljoyn_interfacedescription_getdescriptionlanguages2(iface: alljoyn_interfacedescription, languages: PCSTR, languagessize: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2(iface, languages.toCPointer<ByteVar>(), languagessize)

public actual fun alljoyn_interfacedescription_getdescriptiontranslationcallback(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_translation_callback_ptr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback(iface)?.toLong() ?: 0L

public actual fun alljoyn_interfacedescription_getmember(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember(iface, name.toCPointer<ByteVar>(), member.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation(iface, member.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), value_size.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getmemberargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation(iface, member.toCPointer<ByteVar>(), argname.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), value_size.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface, member.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), maxlanguagelength, languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getmembers(iface: alljoyn_interfacedescription, members: Long, nummembers: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers(iface, members.toCPointer<ByteVar>(), nummembers)

public actual fun alljoyn_interfacedescription_getmethod(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod(iface, name.toCPointer<ByteVar>(), member.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getname(iface: alljoyn_interfacedescription): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname(iface)?.toLong() ?: 0L

public actual fun alljoyn_interfacedescription_getproperties(iface: alljoyn_interfacedescription, props: Long, numprops: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties(iface, props.toCPointer<ByteVar>(), numprops)

public actual fun alljoyn_interfacedescription_getproperty(iface: alljoyn_interfacedescription, name: PCSTR, property: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty(iface, name.toCPointer<ByteVar>(), property.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR, str_size: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation(iface, property.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), str_size.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, property: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface, property.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), maxlanguagelength, languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_getsecuritypolicy(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_securitypolicy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy(iface)

public actual fun alljoyn_interfacedescription_getsignal(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal(iface, name.toCPointer<ByteVar>(), member.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_hasdescription(iface: alljoyn_interfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription(iface)

public actual fun alljoyn_interfacedescription_hasmember(iface: alljoyn_interfacedescription, name: PCSTR, insig: PCSTR, outsig: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember(iface, name.toCPointer<ByteVar>(), insig.toCPointer<ByteVar>(), outsig.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_hasproperties(iface: alljoyn_interfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties(iface)

public actual fun alljoyn_interfacedescription_hasproperty(iface: alljoyn_interfacedescription, name: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty(iface, name.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_introspect(iface: alljoyn_interfacedescription, str: PCSTR, buf: ULong, indent: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect(iface, str.toCPointer<ByteVar>(), buf, indent)

public actual fun alljoyn_interfacedescription_issecure(iface: alljoyn_interfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure(iface)

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
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription(iface, member.toCPointer<ByteVar>(), argname.toCPointer<ByteVar>(), description.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_setargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage(iface, member.toCPointer<ByteVar>(), arg.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_setdescription(iface: alljoyn_interfacedescription, description: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription(iface, description.toCPointer<ByteVar>())
}

public actual fun alljoyn_interfacedescription_setdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, languagetag: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage(iface, description.toCPointer<ByteVar>(), languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_setdescriptionlanguage(iface: alljoyn_interfacedescription, language: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage(iface, language.toCPointer<ByteVar>())
}

public actual fun alljoyn_interfacedescription_setdescriptiontranslationcallback(iface: alljoyn_interfacedescription, translationcallback: alljoyn_interfacedescription_translation_callback_ptr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback(iface, translationcallback.toLong().toCPointer<ByteVar>())
}

public actual fun alljoyn_interfacedescription_setmemberdescription(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription(iface, member.toCPointer<ByteVar>(), description.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface, member.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_setpropertydescription(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription(iface, name.toCPointer<ByteVar>(), description.toCPointer<ByteVar>())

public actual fun alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface, name.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), languagetag.toCPointer<ByteVar>())

public actual fun alljoyn_keystorelistener_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_keystorelistener_destroy(listener: alljoyn_keystorelistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy(listener)
}

public actual fun alljoyn_keystorelistener_getkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, sink: PCSTR, sink_sz: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys(listener, keystore, sink.toCPointer<ByteVar>(), sink_sz.toCPointer<ByteVar>())

public actual fun alljoyn_keystorelistener_putkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, source: PCSTR, password: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys(listener, keystore, source.toCPointer<ByteVar>(), password.toCPointer<ByteVar>())

public actual fun alljoyn_keystorelistener_with_synchronization_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_message_create(bus: alljoyn_busattachment): alljoyn_message =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_create(bus)

public actual fun alljoyn_message_description(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_description(msg, str.toCPointer<ByteVar>(), buf)

public actual fun alljoyn_message_destroy(msg: alljoyn_message) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy(msg)
}

public actual fun alljoyn_message_eql(one: alljoyn_message, other: alljoyn_message): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql(one, other)

public actual fun alljoyn_message_getarg(msg: alljoyn_message, argn: ULong): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg(msg, argn)

public actual fun alljoyn_message_getargs(msg: alljoyn_message, numargs: Long, args: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs(msg, numargs.toCPointer<ByteVar>(), args.toCPointer<ByteVar>())
}

public actual fun alljoyn_message_getauthmechanism(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_getcallserial(msg: alljoyn_message): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial(msg)

public actual fun alljoyn_message_getcompressiontoken(msg: alljoyn_message): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken(msg)

public actual fun alljoyn_message_getdestination(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_geterrorname(msg: alljoyn_message, errormessage: PCSTR, errormessage_size: Long): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname(msg, errormessage.toCPointer<ByteVar>(), errormessage_size.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun alljoyn_message_getflags(msg: alljoyn_message): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags(msg)

public actual fun alljoyn_message_getinterface(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_getmembername(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_getobjectpath(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_getreceiveendpointname(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_getreplyserial(msg: alljoyn_message): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial(msg)

public actual fun alljoyn_message_getsender(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_getsessionid(msg: alljoyn_message): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid(msg)

public actual fun alljoyn_message_getsignature(msg: alljoyn_message): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature(msg)?.toLong() ?: 0L

public actual fun alljoyn_message_gettimestamp(msg: alljoyn_message): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp(msg)

public actual fun alljoyn_message_gettype(msg: alljoyn_message): alljoyn_messagetype =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype(msg)

public actual fun alljoyn_message_isbroadcastsignal(msg: alljoyn_message): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal(msg)

public actual fun alljoyn_message_isencrypted(msg: alljoyn_message): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted(msg)

public actual fun alljoyn_message_isexpired(msg: alljoyn_message, tillexpirems: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired(msg, tillexpirems.toCPointer<ByteVar>())

public actual fun alljoyn_message_isglobalbroadcast(msg: alljoyn_message): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast(msg)

public actual fun alljoyn_message_issessionless(msg: alljoyn_message): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless(msg)

public actual fun alljoyn_message_isunreliable(msg: alljoyn_message): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable(msg)

public actual fun alljoyn_message_parseargs(msg: alljoyn_message, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_message_setendianess(endian: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess(endian)
}

public actual fun alljoyn_message_tostring(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring(msg, str.toCPointer<ByteVar>(), buf)

public actual fun alljoyn_msgarg_array_create(size: ULong): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create(size)

public actual fun alljoyn_msgarg_array_element(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element(arg, index)

public actual fun alljoyn_msgarg_array_get(args: alljoyn_msgarg, numargs: ULong, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set(args: alljoyn_msgarg, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set_offset(args: alljoyn_msgarg, argoffset: ULong, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_signature(values: alljoyn_msgarg, numvalues: ULong, str: PCSTR, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature(values, numvalues, str.toCPointer<ByteVar>(), buf)

public actual fun alljoyn_msgarg_array_tostring(args: alljoyn_msgarg, numargs: ULong, str: PCSTR, buf: ULong, indent: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring(args, numargs, str.toCPointer<ByteVar>(), buf, indent)

public actual fun alljoyn_msgarg_clear(arg: alljoyn_msgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear(arg)
}

public actual fun alljoyn_msgarg_clone(destination: alljoyn_msgarg, source: alljoyn_msgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone(destination, source)
}

public actual fun alljoyn_msgarg_copy(source: alljoyn_msgarg): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy(source)

public actual fun alljoyn_msgarg_create(): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create()

public actual fun alljoyn_msgarg_create_and_set(signature: PCSTR): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_destroy(arg: alljoyn_msgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy(arg)
}

public actual fun alljoyn_msgarg_equal(lhv: alljoyn_msgarg, rhv: alljoyn_msgarg): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal(lhv, rhv)

public actual fun alljoyn_msgarg_get(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_get_array_element(arg: alljoyn_msgarg, index: ULong, element: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element(arg, index, element.toCPointer<ByteVar>())
}

public actual fun alljoyn_msgarg_get_array_elementsignature(arg: alljoyn_msgarg, index: ULong): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature(arg, index)?.toLong() ?: 0L

public actual fun alljoyn_msgarg_get_array_numberofelements(arg: alljoyn_msgarg): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements(arg)

public actual fun alljoyn_msgarg_get_bool(arg: alljoyn_msgarg, b: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool(arg, b.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_bool_array(arg: alljoyn_msgarg, length: Long, ab: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array(arg, length.toCPointer<ByteVar>(), ab.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_double(arg: alljoyn_msgarg, d: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double(arg, d.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_double_array(arg: alljoyn_msgarg, length: Long, ad: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array(arg, length.toCPointer<ByteVar>(), ad.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_int16(arg: alljoyn_msgarg, n: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16(arg, n.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_int16_array(arg: alljoyn_msgarg, length: Long, an: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array(arg, length.toCPointer<ByteVar>(), an.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_int32(arg: alljoyn_msgarg, i: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32(arg, i.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_int32_array(arg: alljoyn_msgarg, length: Long, ai: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array(arg, length.toCPointer<ByteVar>(), ai.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64(arg, x.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_int64_array(arg: alljoyn_msgarg, length: Long, ax: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array(arg, length.toCPointer<ByteVar>(), ax.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_objectpath(arg: alljoyn_msgarg, o: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath(arg, o.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_signature(arg: alljoyn_msgarg, g: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature(arg, g.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_string(arg: alljoyn_msgarg, s: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string(arg, s.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint16(arg: alljoyn_msgarg, q: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16(arg, q.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint16_array(arg: alljoyn_msgarg, length: Long, aq: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array(arg, length.toCPointer<ByteVar>(), aq.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint32(arg: alljoyn_msgarg, u: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32(arg, u.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint32_array(arg: alljoyn_msgarg, length: Long, au: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array(arg, length.toCPointer<ByteVar>(), au.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint64(arg: alljoyn_msgarg, t: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64(arg, t.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint64_array(arg: alljoyn_msgarg, length: Long, at: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array(arg, length.toCPointer<ByteVar>(), at.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint8(arg: alljoyn_msgarg, y: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8(arg, y.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_uint8_array(arg: alljoyn_msgarg, length: Long, ay: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array(arg, length.toCPointer<ByteVar>(), ay.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_get_variant(arg: alljoyn_msgarg, v: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant(arg, v)

public actual fun alljoyn_msgarg_get_variant_array(arg: alljoyn_msgarg, signature: PCSTR, length: Long, av: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array(arg, signature.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), av.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_getdictelement(arg: alljoyn_msgarg, elemsig: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_getkey(arg: alljoyn_msgarg): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey(arg)

public actual fun alljoyn_msgarg_getmember(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember(arg, index)

public actual fun alljoyn_msgarg_getnummembers(arg: alljoyn_msgarg): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers(arg)

public actual fun alljoyn_msgarg_gettype(arg: alljoyn_msgarg): alljoyn_typeid =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype(arg)

public actual fun alljoyn_msgarg_getvalue(arg: alljoyn_msgarg): alljoyn_msgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue(arg)

public actual fun alljoyn_msgarg_hassignature(arg: alljoyn_msgarg, signature: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature(arg, signature.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_and_stabilize(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_bool(arg: alljoyn_msgarg, b: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool(arg, b)

public actual fun alljoyn_msgarg_set_bool_array(arg: alljoyn_msgarg, length: ULong, ab: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array(arg, length, ab.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_double(arg: alljoyn_msgarg, d: Double): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double(arg, d)

public actual fun alljoyn_msgarg_set_double_array(arg: alljoyn_msgarg, length: ULong, ad: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array(arg, length, ad.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_int16(arg: alljoyn_msgarg, n: Short): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16(arg, n)

public actual fun alljoyn_msgarg_set_int16_array(arg: alljoyn_msgarg, length: ULong, an: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array(arg, length, an.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_int32(arg: alljoyn_msgarg, i: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32(arg, i)

public actual fun alljoyn_msgarg_set_int32_array(arg: alljoyn_msgarg, length: ULong, ai: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array(arg, length, ai.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64(arg, x)

public actual fun alljoyn_msgarg_set_int64_array(arg: alljoyn_msgarg, length: ULong, ax: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array(arg, length, ax.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_objectpath(arg: alljoyn_msgarg, o: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath(arg, o.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_objectpath_array(arg: alljoyn_msgarg, length: ULong, ao: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array(arg, length, ao.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_signature(arg: alljoyn_msgarg, g: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature(arg, g.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_signature_array(arg: alljoyn_msgarg, length: ULong, ag: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array(arg, length, ag.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_string(arg: alljoyn_msgarg, s: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string(arg, s.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_string_array(arg: alljoyn_msgarg, length: ULong, asTarget: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array(arg, length, asTarget.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_uint16(arg: alljoyn_msgarg, q: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16(arg, q)

public actual fun alljoyn_msgarg_set_uint16_array(arg: alljoyn_msgarg, length: ULong, aq: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array(arg, length, aq.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_uint32(arg: alljoyn_msgarg, u: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32(arg, u)

public actual fun alljoyn_msgarg_set_uint32_array(arg: alljoyn_msgarg, length: ULong, au: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array(arg, length, au.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_uint64(arg: alljoyn_msgarg, t: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64(arg, t)

public actual fun alljoyn_msgarg_set_uint64_array(arg: alljoyn_msgarg, length: ULong, at: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array(arg, length, at.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_set_uint8(arg: alljoyn_msgarg, y: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8(arg, y)

public actual fun alljoyn_msgarg_set_uint8_array(arg: alljoyn_msgarg, length: ULong, ay: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array(arg, length, ay.toCPointer<ByteVar>())

public actual fun alljoyn_msgarg_setdictentry(arg: alljoyn_msgarg, key: alljoyn_msgarg, value: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry(arg, key, value)

public actual fun alljoyn_msgarg_setstruct(arg: alljoyn_msgarg, struct_members: alljoyn_msgarg, num_members: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct(arg, struct_members, num_members)

public actual fun alljoyn_msgarg_signature(arg: alljoyn_msgarg, str: PCSTR, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature(arg, str.toCPointer<ByteVar>(), buf)

public actual fun alljoyn_msgarg_stabilize(arg: alljoyn_msgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize(arg)
}

public actual fun alljoyn_msgarg_tostring(arg: alljoyn_msgarg, str: PCSTR, buf: ULong, indent: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring(arg, str.toCPointer<ByteVar>(), buf, indent)

public actual fun alljoyn_observer_create(bus: alljoyn_busattachment, mandatoryinterfaces: Long, nummandatoryinterfaces: ULong): alljoyn_observer =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create(bus, mandatoryinterfaces.toCPointer<ByteVar>(), nummandatoryinterfaces)

public actual fun alljoyn_observer_destroy(observer: alljoyn_observer) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy(observer)
}

public actual fun alljoyn_observer_get(observer: alljoyn_observer, uniquebusname: PCSTR, objectpath: PCSTR): alljoyn_proxybusobject_ref =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get(observer, uniquebusname.toCPointer<ByteVar>(), objectpath.toCPointer<ByteVar>())

public actual fun alljoyn_observer_getfirst(observer: alljoyn_observer): alljoyn_proxybusobject_ref =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst(observer)

public actual fun alljoyn_observer_getnext(observer: alljoyn_observer, proxyref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject_ref =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext(observer, proxyref)

public actual fun alljoyn_observer_registerlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener, triggeronexisting: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener(observer, listener, triggeronexisting)
}

public actual fun alljoyn_observer_unregisteralllisteners(observer: alljoyn_observer) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners(observer)
}

public actual fun alljoyn_observer_unregisterlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener(observer, listener)
}

public actual fun alljoyn_observerlistener_create(callback: Long, context: Long): alljoyn_observerlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create(callback.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_observerlistener_destroy(listener: alljoyn_observerlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy(listener)
}

public actual fun alljoyn_passwordmanager_setcredentials(authmechanism: PCSTR, password: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials(authmechanism.toCPointer<ByteVar>(), password.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurationlistener_create(callbacks: Long, context: Long): alljoyn_permissionconfigurationlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurationlistener_destroy(listener: alljoyn_permissionconfigurationlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy(listener)
}

public actual fun alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_certificateid_cleanup(certificateid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup(certificateid.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_claim(configurator: alljoyn_permissionconfigurator, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim(configurator, cakey.toCPointer<ByteVar>(), identitycertificatechain.toCPointer<ByteVar>(), groupid.toCPointer<ByteVar>(), groupsize, groupauthority.toCPointer<ByteVar>(), manifestsxmls.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoyn_permissionconfigurator_endmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement(configurator)

public actual fun alljoyn_permissionconfigurator_getapplicationstate(configurator: alljoyn_permissionconfigurator, state: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate(configurator, state.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities(configurator, claimcapabilities.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator, additionalinfo.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getdefaultclaimcapabilities(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities()

public actual fun alljoyn_permissionconfigurator_getdefaultpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy(configurator, policyxml.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity(configurator, identitycertificatechain.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getidentitycertificateid(configurator: alljoyn_permissionconfigurator, certificateid: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid(configurator, certificateid.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getmanifests(configurator: alljoyn_permissionconfigurator, manifestarray: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests(configurator, manifestarray.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getmanifesttemplate(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate(configurator, manifesttemplatexml.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getmembershipsummaries(configurator: alljoyn_permissionconfigurator, certificateids: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries(configurator, certificateids.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy(configurator, policyxml.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_getpublickey(configurator: alljoyn_permissionconfigurator, publickey: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey(configurator, publickey.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_installmanifests(configurator: alljoyn_permissionconfigurator, manifestsxmls: Long, manifestscount: ULong, append: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests(configurator, manifestsxmls.toCPointer<ByteVar>(), manifestscount, append)

public actual fun alljoyn_permissionconfigurator_installmembership(configurator: alljoyn_permissionconfigurator, membershipcertificatechain: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership(configurator, membershipcertificatechain.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_policy_destroy(policyxml: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy(policyxml.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_publickey_destroy(publickey: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy(publickey.toCPointer<ByteVar>())
}

public actual fun alljoyn_permissionconfigurator_removemembership(configurator: alljoyn_permissionconfigurator, serial: Long, seriallen: ULong, issuerpublickey: Long, issueraki: Long, issuerakilen: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership(configurator, serial.toCPointer<ByteVar>(), seriallen, issuerpublickey.toCPointer<ByteVar>(), issueraki.toCPointer<ByteVar>(), issuerakilen)

public actual fun alljoyn_permissionconfigurator_reset(configurator: alljoyn_permissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset(configurator)

public actual fun alljoyn_permissionconfigurator_resetpolicy(configurator: alljoyn_permissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy(configurator)

public actual fun alljoyn_permissionconfigurator_setapplicationstate(configurator: alljoyn_permissionconfigurator, state: alljoyn_applicationstate): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate(configurator, state)

public actual fun alljoyn_permissionconfigurator_setclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities(configurator, claimcapabilities)

public actual fun alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator, additionalinfo)

public actual fun alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator, manifesttemplatexml.toCPointer<ByteVar>())

public actual fun alljoyn_permissionconfigurator_startmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement(configurator)

public actual fun alljoyn_permissionconfigurator_updateidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity(configurator, identitycertificatechain.toCPointer<ByteVar>(), manifestsxmls.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoyn_permissionconfigurator_updatepolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy(configurator, policyxml.toCPointer<ByteVar>())

public actual fun alljoyn_pinglistener_create(callback: Long, context: Long): alljoyn_pinglistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create(callback.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_pinglistener_destroy(listener: alljoyn_pinglistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy(listener)
}

public actual fun alljoyn_proxybusobject_addchild(proxyobj: alljoyn_proxybusobject, child: alljoyn_proxybusobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild(proxyobj, child)

public actual fun alljoyn_proxybusobject_addinterface(proxyobj: alljoyn_proxybusobject, iface: alljoyn_interfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface(proxyobj, iface)

public actual fun alljoyn_proxybusobject_addinterface_by_name(proxyobj: alljoyn_proxybusobject, name: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name(proxyobj, name.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_copy(source: alljoyn_proxybusobject): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy(source)

public actual fun alljoyn_proxybusobject_create(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create(bus, service.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), sessionid)

public actual fun alljoyn_proxybusobject_create_secure(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure(bus, service.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), sessionid)

public actual fun alljoyn_proxybusobject_destroy(proxyobj: alljoyn_proxybusobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy(proxyobj)
}

public actual fun alljoyn_proxybusobject_enablepropertycaching(proxyobj: alljoyn_proxybusobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching(proxyobj)
}

public actual fun alljoyn_proxybusobject_getallproperties(proxyobj: alljoyn_proxybusobject, iface: PCSTR, values: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties(proxyobj, iface.toCPointer<ByteVar>(), values)

public actual fun alljoyn_proxybusobject_getallpropertiesasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_getallpropertiescb_ptr, timeout: UInt, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync(proxyobj, iface.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), timeout, context.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_getchild(proxyobj: alljoyn_proxybusobject, path: PCSTR): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild(proxyobj, path.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_getchildren(proxyobj: alljoyn_proxybusobject, children: Long, numchildren: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren(proxyobj, children.toCPointer<ByteVar>(), numchildren)

public actual fun alljoyn_proxybusobject_getinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): alljoyn_interfacedescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface(proxyobj, iface.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_getinterfaces(proxyobj: alljoyn_proxybusobject, ifaces: Long, numifaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces(proxyobj, ifaces.toCPointer<ByteVar>(), numifaces)

public actual fun alljoyn_proxybusobject_getpath(proxyobj: alljoyn_proxybusobject): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath(proxyobj)?.toLong() ?: 0L

public actual fun alljoyn_proxybusobject_getproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty(proxyobj, iface.toCPointer<ByteVar>(), property.toCPointer<ByteVar>(), value)

public actual fun alljoyn_proxybusobject_getpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, callback: alljoyn_proxybusobject_listener_getpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync(proxyobj, iface.toCPointer<ByteVar>(), property.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), timeout, context.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_getservicename(proxyobj: alljoyn_proxybusobject): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename(proxyobj)?.toLong() ?: 0L

public actual fun alljoyn_proxybusobject_getsessionid(proxyobj: alljoyn_proxybusobject): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid(proxyobj)

public actual fun alljoyn_proxybusobject_getuniquename(proxyobj: alljoyn_proxybusobject): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename(proxyobj)?.toLong() ?: 0L

public actual fun alljoyn_proxybusobject_implementsinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface(proxyobj, iface.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_introspectremoteobject(proxyobj: alljoyn_proxybusobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject(proxyobj)

public actual fun alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj: alljoyn_proxybusobject, callback: alljoyn_proxybusobject_listener_introspectcb_ptr, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_issecure(proxyobj: alljoyn_proxybusobject): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure(proxyobj)

public actual fun alljoyn_proxybusobject_isvalid(proxyobj: alljoyn_proxybusobject): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid(proxyobj)

public actual fun alljoyn_proxybusobject_methodcall(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall(proxyobj, ifacename.toCPointer<ByteVar>(), methodname.toCPointer<ByteVar>(), args, numargs, replymsg, timeout, flags)

public actual fun alljoyn_proxybusobject_methodcall_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_member_noreply(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_noreply(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply(proxyobj, ifacename.toCPointer<ByteVar>(), methodname.toCPointer<ByteVar>(), args, numargs, flags)

public actual fun alljoyn_proxybusobject_methodcallasync(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync(proxyobj, ifacename.toCPointer<ByteVar>(), methodname.toCPointer<ByteVar>(), replyfunc.toLong().toCPointer<ByteVar>(), args, numargs, context.toCPointer<ByteVar>(), timeout, flags)

public actual fun alljoyn_proxybusobject_methodcallasync_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_parsexml(proxyobj: alljoyn_proxybusobject, xml: PCSTR, identifier: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml(proxyobj, xml.toCPointer<ByteVar>(), identifier.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_ref_create(proxy: alljoyn_proxybusobject): alljoyn_proxybusobject_ref =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create(proxy)

public actual fun alljoyn_proxybusobject_ref_decref(ref: alljoyn_proxybusobject_ref) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref(ref)
}

public actual fun alljoyn_proxybusobject_ref_get(ref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get(ref)

public actual fun alljoyn_proxybusobject_ref_incref(ref: alljoyn_proxybusobject_ref) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref(ref)
}

public actual fun alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, properties: Long, numproperties: ULong, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj, iface.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), numproperties, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_removechild(proxyobj: alljoyn_proxybusobject, path: PCSTR): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild(proxyobj, path.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_secureconnection(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection(proxyobj, forceauth)

public actual fun alljoyn_proxybusobject_secureconnectionasync(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync(proxyobj, forceauth)

public actual fun alljoyn_proxybusobject_setproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty(proxyobj, iface.toCPointer<ByteVar>(), property.toCPointer<ByteVar>(), value)

public actual fun alljoyn_proxybusobject_setpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg, callback: alljoyn_proxybusobject_listener_setpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync(proxyobj, iface.toCPointer<ByteVar>(), property.toCPointer<ByteVar>(), value, callback.toLong().toCPointer<ByteVar>(), timeout, context.toCPointer<ByteVar>())

public actual fun alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj, iface.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())

public actual fun alljoyn_routerinit(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit()

public actual fun alljoyn_routerinitwithconfig(configxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig(configxml.toCPointer<ByteVar>())

public actual fun alljoyn_routershutdown(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown()

public actual fun alljoyn_securityapplicationproxy_claim(proxy: alljoyn_securityapplicationproxy, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim(proxy, cakey.toCPointer<ByteVar>(), identitycertificatechain.toCPointer<ByteVar>(), groupid.toCPointer<ByteVar>(), groupsize, groupauthority.toCPointer<ByteVar>(), manifestsxmls.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml.toCPointer<ByteVar>(), identitycertificatepem.toCPointer<ByteVar>(), digest.toCPointer<ByteVar>(), digestsize.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_create(bus: alljoyn_busattachment, appbusname: Long, sessionid: UInt): alljoyn_securityapplicationproxy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create(bus, appbusname.toCPointer<ByteVar>(), sessionid)

public actual fun alljoyn_securityapplicationproxy_destroy(proxy: alljoyn_securityapplicationproxy) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy(proxy)
}

public actual fun alljoyn_securityapplicationproxy_digest_destroy(digest: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy(digest.toCPointer<ByteVar>())
}

public actual fun alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey.toCPointer<ByteVar>())
}

public actual fun alljoyn_securityapplicationproxy_endmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement(proxy)

public actual fun alljoyn_securityapplicationproxy_getapplicationstate(proxy: alljoyn_securityapplicationproxy, applicationstate: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate(proxy, applicationstate.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: alljoyn_securityapplicationproxy, capabilities: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities(proxy, capabilities.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: alljoyn_securityapplicationproxy, additionalinfo: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy, additionalinfo.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy(proxy, policyxml.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_geteccpublickey(proxy: alljoyn_securityapplicationproxy, eccpublickey: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey(proxy, eccpublickey.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: alljoyn_securityapplicationproxy, manifesttemplatexml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate(proxy, manifesttemplatexml.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport()

public actual fun alljoyn_securityapplicationproxy_getpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy(proxy, policyxml.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_installmembership(proxy: alljoyn_securityapplicationproxy, membershipcertificatechain: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership(proxy, membershipcertificatechain.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml.toCPointer<ByteVar>())
}

public actual fun alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml.toCPointer<ByteVar>())
}

public actual fun alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy(policyxml.toCPointer<ByteVar>())
}

public actual fun alljoyn_securityapplicationproxy_reset(proxy: alljoyn_securityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset(proxy)

public actual fun alljoyn_securityapplicationproxy_resetpolicy(proxy: alljoyn_securityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy(proxy)

public actual fun alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: ULong, signedmanifestxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml.toCPointer<ByteVar>(), identitycertificatepem.toCPointer<ByteVar>(), signature.toCPointer<ByteVar>(), signaturesize, signedmanifestxml.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml.toCPointer<ByteVar>(), identitycertificatepem.toCPointer<ByteVar>(), signingprivatekeypem.toCPointer<ByteVar>(), signedmanifestxml.toCPointer<ByteVar>())

public actual fun alljoyn_securityapplicationproxy_startmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement(proxy)

public actual fun alljoyn_securityapplicationproxy_updateidentity(proxy: alljoyn_securityapplicationproxy, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity(proxy, identitycertificatechain.toCPointer<ByteVar>(), manifestsxmls.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoyn_securityapplicationproxy_updatepolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy(proxy, policyxml.toCPointer<ByteVar>())

public actual fun alljoyn_sessionlistener_create(callbacks: Long, context: Long): alljoyn_sessionlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_sessionlistener_destroy(listener: alljoyn_sessionlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy(listener)
}

public actual fun alljoyn_sessionopts_cmp(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp(one, other)

public actual fun alljoyn_sessionopts_create(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): alljoyn_sessionopts =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create(traffic, ismultipoint, proximity, transports)

public actual fun alljoyn_sessionopts_destroy(opts: alljoyn_sessionopts) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy(opts)
}

public actual fun alljoyn_sessionopts_get_multipoint(opts: alljoyn_sessionopts): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint(opts)

public actual fun alljoyn_sessionopts_get_proximity(opts: alljoyn_sessionopts): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity(opts)

public actual fun alljoyn_sessionopts_get_traffic(opts: alljoyn_sessionopts): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic(opts)

public actual fun alljoyn_sessionopts_get_transports(opts: alljoyn_sessionopts): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports(opts)

public actual fun alljoyn_sessionopts_iscompatible(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible(one, other)

public actual fun alljoyn_sessionopts_set_multipoint(opts: alljoyn_sessionopts, ismultipoint: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint(opts, ismultipoint)
}

public actual fun alljoyn_sessionopts_set_proximity(opts: alljoyn_sessionopts, proximity: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity(opts, proximity)
}

public actual fun alljoyn_sessionopts_set_traffic(opts: alljoyn_sessionopts, traffic: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic(opts, traffic)
}

public actual fun alljoyn_sessionopts_set_transports(opts: alljoyn_sessionopts, transports: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports(opts, transports)
}

public actual fun alljoyn_sessionportlistener_create(callbacks: Long, context: Long): alljoyn_sessionportlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create(callbacks.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun alljoyn_sessionportlistener_destroy(listener: alljoyn_sessionportlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy(listener)
}

public actual fun alljoyn_shutdown(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown()

public actual fun alljoyn_unity_deferred_callbacks_process(): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process()

public actual fun alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only)
}
