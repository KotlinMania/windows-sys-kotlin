@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32DevicesAlljoynNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AllJoynAcceptBusConnection(serverbushandle: HANDLE, abortevent: HANDLE): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynAcceptBusConnection(serverbushandle.toString(), abortevent.toString()) as Int).toUInt() else 0u

public actual fun AllJoynCloseBusHandle(bushandle: HANDLE): BOOL =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynCloseBusHandle(bushandle.toString()) as Int) else 0

public actual fun AllJoynConnectToBus(connectionspec: PCWSTR): HANDLE =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynConnectToBus(connectionspec.toString()) as String).toLong() else 0L

public actual fun AllJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: Long): HANDLE =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), lpsecurityattributes.toString()) as String).toLong() else 0L

public actual fun AllJoynEnumEvents(connectedbushandle: HANDLE, eventtoreset: HANDLE, eventtypes: Long): BOOL =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynEnumEvents(connectedbushandle.toString(), eventtoreset.toString(), eventtypes.toString()) as Int) else 0

public actual fun AllJoynEventSelect(connectedbushandle: HANDLE, eventhandle: HANDLE, eventtypes: UInt): BOOL =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynEventSelect(connectedbushandle.toString(), eventhandle.toString(), eventtypes.toInt()) as Int) else 0

public actual fun AllJoynReceiveFromBus(connectedbushandle: HANDLE, buffer: Long, bytestoread: UInt, bytestransferred: Long, reserved: Long): BOOL =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynReceiveFromBus(connectedbushandle.toString(), buffer.toString(), bytestoread.toInt(), bytestransferred.toString(), reserved.toString()) as Int) else 0

public actual fun AllJoynSendToBus(connectedbushandle: HANDLE, buffer: Long, bytestowrite: UInt, bytestransferred: Long, reserved: Long): BOOL =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_AllJoynSendToBus(connectedbushandle.toString(), buffer.toString(), bytestowrite.toInt(), bytestransferred.toString(), reserved.toString()) as Int) else 0

public actual fun QCC_StatusText(status: QStatus): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_QCC_StatusText(status) as String).toLong() else 0L

public actual fun alljoyn_aboutdata_create(defaultlanguage: PCSTR): alljoyn_aboutdata =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create(defaultlanguage.toString()) as String).toLong() else 0L

public actual fun alljoyn_aboutdata_create_empty(): alljoyn_aboutdata =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_empty() as String).toLong() else 0L

public actual fun alljoyn_aboutdata_create_full(arg: alljoyn_msgarg, language: PCSTR): alljoyn_aboutdata =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_create_full(arg.toString(), language.toString()) as String).toLong() else 0L

public actual fun alljoyn_aboutdata_createfrommsgarg(data: alljoyn_aboutdata, arg: alljoyn_msgarg, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfrommsgarg(data.toString(), arg.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_createfromxml(data: alljoyn_aboutdata, aboutdataxml: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_createfromxml(data.toString(), aboutdataxml.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_destroy(data: alljoyn_aboutdata) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_destroy(data.toString())
    }
}

public actual fun alljoyn_aboutdata_getaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getaboutdata(data.toString(), msgarg.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getajsoftwareversion(data: alljoyn_aboutdata, ajsoftwareversion: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getajsoftwareversion(data.toString(), ajsoftwareversion.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getannouncedaboutdata(data: alljoyn_aboutdata, msgarg: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getannouncedaboutdata(data.toString(), msgarg.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getappid(data: alljoyn_aboutdata, appid: Long, num: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappid(data.toString(), appid.toString(), num.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getappname(data: alljoyn_aboutdata, appname: Long, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getappname(data.toString(), appname.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdateofmanufacture(data.toString(), dateofmanufacture.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdefaultlanguage(data.toString(), defaultlanguage.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getdescription(data: alljoyn_aboutdata, description: Long, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdescription(data.toString(), description.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getdeviceid(data: alljoyn_aboutdata, deviceid: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdeviceid(data.toString(), deviceid.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getdevicename(data: alljoyn_aboutdata, devicename: Long, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getdevicename(data.toString(), devicename.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getfield(data: alljoyn_aboutdata, name: PCSTR, value: Long, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfield(data.toString(), name.toString(), value.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getfields(data: alljoyn_aboutdata, fields: Long, num_fields: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfields(data.toString(), fields.toString(), num_fields.toString()) as String).toULong() else 0uL

public actual fun alljoyn_aboutdata_getfieldsignature(data: alljoyn_aboutdata, fieldname: PCSTR): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getfieldsignature(data.toString(), fieldname.toString()) as String).toLong() else 0L

public actual fun alljoyn_aboutdata_gethardwareversion(data: alljoyn_aboutdata, hardwareversion: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_gethardwareversion(data.toString(), hardwareversion.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getmanufacturer(data: alljoyn_aboutdata, manufacturer: Long, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmanufacturer(data.toString(), manufacturer.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getmodelnumber(data: alljoyn_aboutdata, modelnumber: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getmodelnumber(data.toString(), modelnumber.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getsoftwareversion(data: alljoyn_aboutdata, softwareversion: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsoftwareversion(data.toString(), softwareversion.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_getsupportedlanguages(data: alljoyn_aboutdata, languagetags: Long, num: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupportedlanguages(data.toString(), languagetags.toString(), num.toString()) as String).toULong() else 0uL

public actual fun alljoyn_aboutdata_getsupporturl(data: alljoyn_aboutdata, supporturl: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_getsupporturl(data.toString(), supporturl.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_isfieldannounced(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldannounced(data.toString(), fieldname.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutdata_isfieldlocalized(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldlocalized(data.toString(), fieldname.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutdata_isfieldrequired(data: alljoyn_aboutdata, fieldname: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isfieldrequired(data.toString(), fieldname.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutdata_isvalid(data: alljoyn_aboutdata, language: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_isvalid(data.toString(), language.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutdata_setappid(data: alljoyn_aboutdata, appid: Long, num: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid(data.toString(), appid.toString(), num.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setappid_fromstring(data: alljoyn_aboutdata, appid: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappid_fromstring(data.toString(), appid.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setappname(data: alljoyn_aboutdata, appname: PCSTR, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setappname(data.toString(), appname.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setdateofmanufacture(data: alljoyn_aboutdata, dateofmanufacture: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdateofmanufacture(data.toString(), dateofmanufacture.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setdefaultlanguage(data: alljoyn_aboutdata, defaultlanguage: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdefaultlanguage(data.toString(), defaultlanguage.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setdescription(data: alljoyn_aboutdata, description: PCSTR, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdescription(data.toString(), description.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setdeviceid(data: alljoyn_aboutdata, deviceid: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdeviceid(data.toString(), deviceid.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setdevicename(data: alljoyn_aboutdata, devicename: PCSTR, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setdevicename(data.toString(), devicename.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setfield(data: alljoyn_aboutdata, name: PCSTR, value: alljoyn_msgarg, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setfield(data.toString(), name.toString(), value.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_sethardwareversion(data: alljoyn_aboutdata, hardwareversion: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_sethardwareversion(data.toString(), hardwareversion.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setmanufacturer(data: alljoyn_aboutdata, manufacturer: PCSTR, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmanufacturer(data.toString(), manufacturer.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setmodelnumber(data: alljoyn_aboutdata, modelnumber: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setmodelnumber(data.toString(), modelnumber.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setsoftwareversion(data: alljoyn_aboutdata, softwareversion: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsoftwareversion(data.toString(), softwareversion.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setsupportedlanguage(data: alljoyn_aboutdata, language: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupportedlanguage(data.toString(), language.toString()) as Int) else 0

public actual fun alljoyn_aboutdata_setsupporturl(data: alljoyn_aboutdata, supporturl: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdata_setsupporturl(data.toString(), supporturl.toString()) as Int) else 0

public actual fun alljoyn_aboutdatalistener_create(callbacks: Long, context: Long): alljoyn_aboutdatalistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_aboutdatalistener_destroy(listener: alljoyn_aboutdatalistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutdatalistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_abouticon_clear(icon: alljoyn_abouticon) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_clear(icon.toString())
    }
}

public actual fun alljoyn_abouticon_create(): alljoyn_abouticon =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_create() as String).toLong() else 0L

public actual fun alljoyn_abouticon_destroy(icon: alljoyn_abouticon) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_destroy(icon.toString())
    }
}

public actual fun alljoyn_abouticon_getcontent(icon: alljoyn_abouticon, data: Long, size: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_getcontent(icon.toString(), data.toString(), size.toString())
    }
}

public actual fun alljoyn_abouticon_geturl(icon: alljoyn_abouticon, type: Long, url: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_geturl(icon.toString(), type.toString(), url.toString())
    }
}

public actual fun alljoyn_abouticon_setcontent(icon: alljoyn_abouticon, type: PCSTR, data: Long, csize: ULong, ownsdata: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent(icon.toString(), type.toString(), data.toString(), csize.toString(), ownsdata.toInt()) as Int) else 0

public actual fun alljoyn_abouticon_setcontent_frommsgarg(icon: alljoyn_abouticon, arg: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_setcontent_frommsgarg(icon.toString(), arg.toString()) as Int) else 0

public actual fun alljoyn_abouticon_seturl(icon: alljoyn_abouticon, type: PCSTR, url: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticon_seturl(icon.toString(), type.toString(), url.toString()) as Int) else 0

public actual fun alljoyn_abouticonobj_create(bus: alljoyn_busattachment, icon: alljoyn_abouticon): alljoyn_abouticonobj =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_create(bus.toString(), icon.toString()) as String).toLong() else 0L

public actual fun alljoyn_abouticonobj_destroy(icon: alljoyn_abouticonobj) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonobj_destroy(icon.toString())
    }
}

public actual fun alljoyn_abouticonproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_abouticonproxy =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_create(bus.toString(), busname.toString(), sessionid.toInt()) as String).toLong() else 0L

public actual fun alljoyn_abouticonproxy_destroy(proxy: alljoyn_abouticonproxy) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_destroy(proxy.toString())
    }
}

public actual fun alljoyn_abouticonproxy_geticon(proxy: alljoyn_abouticonproxy, icon: alljoyn_abouticon): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_geticon(proxy.toString(), icon.toString()) as Int) else 0

public actual fun alljoyn_abouticonproxy_getversion(proxy: alljoyn_abouticonproxy, version: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_abouticonproxy_getversion(proxy.toString(), version.toString()) as Int) else 0

public actual fun alljoyn_aboutlistener_create(callback: Long, context: Long): alljoyn_aboutlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_create(callback.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_aboutlistener_destroy(listener: alljoyn_aboutlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutlistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_aboutobj_announce(obj: alljoyn_aboutobj, sessionport: UShort, aboutdata: alljoyn_aboutdata): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce(obj.toString(), sessionport.toInt(), aboutdata.toString()) as Int) else 0

public actual fun alljoyn_aboutobj_announce_using_datalistener(obj: alljoyn_aboutobj, sessionport: UShort, aboutlistener: alljoyn_aboutdatalistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_announce_using_datalistener(obj.toString(), sessionport.toInt(), aboutlistener.toString()) as Int) else 0

public actual fun alljoyn_aboutobj_create(bus: alljoyn_busattachment, isannounced: alljoyn_about_announceflag): alljoyn_aboutobj =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_create(bus.toString(), isannounced) as String).toLong() else 0L

public actual fun alljoyn_aboutobj_destroy(obj: alljoyn_aboutobj) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_destroy(obj.toString())
    }
}

public actual fun alljoyn_aboutobj_unannounce(obj: alljoyn_aboutobj): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobj_unannounce(obj.toString()) as Int) else 0

public actual fun alljoyn_aboutobjectdescription_clear(description: alljoyn_aboutobjectdescription) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_clear(description.toString())
    }
}

public actual fun alljoyn_aboutobjectdescription_create(): alljoyn_aboutobjectdescription =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create() as String).toLong() else 0L

public actual fun alljoyn_aboutobjectdescription_create_full(arg: alljoyn_msgarg): alljoyn_aboutobjectdescription =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_create_full(arg.toString()) as String).toLong() else 0L

public actual fun alljoyn_aboutobjectdescription_createfrommsgarg(description: alljoyn_aboutobjectdescription, arg: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_createfrommsgarg(description.toString(), arg.toString()) as Int) else 0

public actual fun alljoyn_aboutobjectdescription_destroy(description: alljoyn_aboutobjectdescription) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_destroy(description.toString())
    }
}

public actual fun alljoyn_aboutobjectdescription_getinterfacepaths(description: alljoyn_aboutobjectdescription, interfacename: PCSTR, paths: Long, numpaths: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfacepaths(description.toString(), interfacename.toString(), paths.toString(), numpaths.toString()) as String).toULong() else 0uL

public actual fun alljoyn_aboutobjectdescription_getinterfaces(description: alljoyn_aboutobjectdescription, path: PCSTR, interfaces: Long, numinterfaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getinterfaces(description.toString(), path.toString(), interfaces.toString(), numinterfaces.toString()) as String).toULong() else 0uL

public actual fun alljoyn_aboutobjectdescription_getmsgarg(description: alljoyn_aboutobjectdescription, msgarg: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getmsgarg(description.toString(), msgarg.toString()) as Int) else 0

public actual fun alljoyn_aboutobjectdescription_getpaths(description: alljoyn_aboutobjectdescription, paths: Long, numpaths: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_getpaths(description.toString(), paths.toString(), numpaths.toString()) as String).toULong() else 0uL

public actual fun alljoyn_aboutobjectdescription_hasinterface(description: alljoyn_aboutobjectdescription, interfacename: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterface(description.toString(), interfacename.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutobjectdescription_hasinterfaceatpath(description: alljoyn_aboutobjectdescription, path: PCSTR, interfacename: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_hasinterfaceatpath(description.toString(), path.toString(), interfacename.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutobjectdescription_haspath(description: alljoyn_aboutobjectdescription, path: PCSTR): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutobjectdescription_haspath(description.toString(), path.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_aboutproxy_create(bus: alljoyn_busattachment, busname: PCSTR, sessionid: UInt): alljoyn_aboutproxy =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_create(bus.toString(), busname.toString(), sessionid.toInt()) as String).toLong() else 0L

public actual fun alljoyn_aboutproxy_destroy(proxy: alljoyn_aboutproxy) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_destroy(proxy.toString())
    }
}

public actual fun alljoyn_aboutproxy_getaboutdata(proxy: alljoyn_aboutproxy, language: PCSTR, data: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getaboutdata(proxy.toString(), language.toString(), data.toString()) as Int) else 0

public actual fun alljoyn_aboutproxy_getobjectdescription(proxy: alljoyn_aboutproxy, objectdesc: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getobjectdescription(proxy.toString(), objectdesc.toString()) as Int) else 0

public actual fun alljoyn_aboutproxy_getversion(proxy: alljoyn_aboutproxy, version: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_aboutproxy_getversion(proxy.toString(), version.toString()) as Int) else 0

public actual fun alljoyn_applicationstatelistener_create(callbacks: Long, context: Long): alljoyn_applicationstatelistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_applicationstatelistener_destroy(listener: alljoyn_applicationstatelistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_applicationstatelistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_authlistener_create(callbacks: Long, context: Long): alljoyn_authlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_authlistener_destroy(listener: alljoyn_authlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_authlistener_requestcredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int, credentials: alljoyn_credentials): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_requestcredentialsresponse(listener.toString(), authcontext.toString(), accept, credentials.toString()) as Int) else 0

public actual fun alljoyn_authlistener_setsharedsecret(listener: alljoyn_authlistener, sharedsecret: Long, sharedsecretsize: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_setsharedsecret(listener.toString(), sharedsecret.toString(), sharedsecretsize.toString()) as Int) else 0

public actual fun alljoyn_authlistener_verifycredentialsresponse(listener: alljoyn_authlistener, authcontext: Long, accept: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistener_verifycredentialsresponse(listener.toString(), authcontext.toString(), accept) as Int) else 0

public actual fun alljoyn_authlistenerasync_create(callbacks: Long, context: Long): alljoyn_authlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_authlistenerasync_destroy(listener: alljoyn_authlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_authlistenerasync_destroy(listener.toString())
    }
}

public actual fun alljoyn_autopinger_adddestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_adddestination(autopinger.toString(), group.toString(), destination.toString()) as Int) else 0

public actual fun alljoyn_autopinger_addpinggroup(autopinger: alljoyn_autopinger, group: PCSTR, listener: alljoyn_pinglistener, pinginterval: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_addpinggroup(autopinger.toString(), group.toString(), listener.toString(), pinginterval.toInt())
    }
}

public actual fun alljoyn_autopinger_create(bus: alljoyn_busattachment): alljoyn_autopinger =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_create(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_autopinger_destroy(autopinger: alljoyn_autopinger) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_destroy(autopinger.toString())
    }
}

public actual fun alljoyn_autopinger_pause(autopinger: alljoyn_autopinger) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_pause(autopinger.toString())
    }
}

public actual fun alljoyn_autopinger_removedestination(autopinger: alljoyn_autopinger, group: PCSTR, destination: PCSTR, removeall: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removedestination(autopinger.toString(), group.toString(), destination.toString(), removeall) as Int) else 0

public actual fun alljoyn_autopinger_removepinggroup(autopinger: alljoyn_autopinger, group: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_removepinggroup(autopinger.toString(), group.toString())
    }
}

public actual fun alljoyn_autopinger_resume(autopinger: alljoyn_autopinger) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_resume(autopinger.toString())
    }
}

public actual fun alljoyn_autopinger_setpinginterval(autopinger: alljoyn_autopinger, group: PCSTR, pinginterval: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_autopinger_setpinginterval(autopinger.toString(), group.toString(), pinginterval.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_addlogonentry(bus: alljoyn_busattachment, authmechanism: PCSTR, username: PCSTR, password: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addlogonentry(bus.toString(), authmechanism.toString(), username.toString(), password.toString()) as Int) else 0

public actual fun alljoyn_busattachment_addmatch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_addmatch(bus.toString(), rule.toString()) as Int) else 0

public actual fun alljoyn_busattachment_advertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_advertisename(bus.toString(), name.toString(), transports.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_bindsessionport(bus: alljoyn_busattachment, sessionport: Long, opts: alljoyn_sessionopts, listener: alljoyn_sessionportlistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_bindsessionport(bus.toString(), sessionport.toString(), opts.toString(), listener.toString()) as Int) else 0

public actual fun alljoyn_busattachment_canceladvertisename(bus: alljoyn_busattachment, name: PCSTR, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_canceladvertisename(bus.toString(), name.toString(), transports.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_cancelfindadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisedname(bus.toString(), nameprefix.toString()) as Int) else 0

public actual fun alljoyn_busattachment_cancelfindadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelfindadvertisednamebytransport(bus.toString(), nameprefix.toString(), transports.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_cancelwhoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interface(bus.toString(), implementsinterface.toString()) as Int) else 0

public actual fun alljoyn_busattachment_cancelwhoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_cancelwhoimplements_interfaces(bus.toString(), implementsinterfaces.toString(), numberinterfaces.toString()) as Int) else 0

public actual fun alljoyn_busattachment_clearkeys(bus: alljoyn_busattachment, guid: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeys(bus.toString(), guid.toString()) as Int) else 0

public actual fun alljoyn_busattachment_clearkeystore(bus: alljoyn_busattachment) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_clearkeystore(bus.toString())
    }
}

public actual fun alljoyn_busattachment_connect(bus: alljoyn_busattachment, connectspec: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_connect(bus.toString(), connectspec.toString()) as Int) else 0

public actual fun alljoyn_busattachment_create(applicationname: PCSTR, allowremotemessages: Int): alljoyn_busattachment =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create(applicationname.toString(), allowremotemessages) as String).toLong() else 0L

public actual fun alljoyn_busattachment_create_concurrency(applicationname: PCSTR, allowremotemessages: Int, concurrency: UInt): alljoyn_busattachment =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_create_concurrency(applicationname.toString(), allowremotemessages, concurrency.toInt()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_createinterface(bus: alljoyn_busattachment, name: PCSTR, iface: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface(bus.toString(), name.toString(), iface.toString()) as Int) else 0

public actual fun alljoyn_busattachment_createinterface_secure(bus: alljoyn_busattachment, name: PCSTR, iface: Long, secpolicy: alljoyn_interfacedescription_securitypolicy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterface_secure(bus.toString(), name.toString(), iface.toString(), secpolicy) as Int) else 0

public actual fun alljoyn_busattachment_createinterfacesfromxml(bus: alljoyn_busattachment, xml: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_createinterfacesfromxml(bus.toString(), xml.toString()) as Int) else 0

public actual fun alljoyn_busattachment_deletedefaultkeystore(applicationname: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deletedefaultkeystore(applicationname.toString()) as Int) else 0

public actual fun alljoyn_busattachment_deleteinterface(bus: alljoyn_busattachment, iface: alljoyn_interfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_deleteinterface(bus.toString(), iface.toString()) as Int) else 0

public actual fun alljoyn_busattachment_destroy(bus: alljoyn_busattachment) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_destroy(bus.toString())
    }
}

public actual fun alljoyn_busattachment_disconnect(bus: alljoyn_busattachment, unused: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_disconnect(bus.toString(), unused.toString()) as Int) else 0

public actual fun alljoyn_busattachment_enableconcurrentcallbacks(bus: alljoyn_busattachment) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enableconcurrentcallbacks(bus.toString())
    }
}

public actual fun alljoyn_busattachment_enablepeersecurity(bus: alljoyn_busattachment, authmechanisms: PCSTR, listener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecurity(bus.toString(), authmechanisms.toString(), listener.toString(), keystorefilename.toString(), isshared) as Int) else 0

public actual fun alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus: alljoyn_busattachment, authmechanisms: PCSTR, authlistener: alljoyn_authlistener, keystorefilename: PCSTR, isshared: Int, permissionconfigurationlistener: alljoyn_permissionconfigurationlistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus.toString(), authmechanisms.toString(), authlistener.toString(), keystorefilename.toString(), isshared, permissionconfigurationlistener.toString()) as Int) else 0

public actual fun alljoyn_busattachment_findadvertisedname(bus: alljoyn_busattachment, nameprefix: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisedname(bus.toString(), nameprefix.toString()) as Int) else 0

public actual fun alljoyn_busattachment_findadvertisednamebytransport(bus: alljoyn_busattachment, nameprefix: PCSTR, transports: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_findadvertisednamebytransport(bus.toString(), nameprefix.toString(), transports.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_getalljoyndebugobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoyndebugobj(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_getalljoynproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getalljoynproxyobj(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_getconcurrency(bus: alljoyn_busattachment): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconcurrency(bus.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_busattachment_getconnectspec(bus: alljoyn_busattachment): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getconnectspec(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_getdbusproxyobj(bus: alljoyn_busattachment): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getdbusproxyobj(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_getglobalguidstring(bus: alljoyn_busattachment): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getglobalguidstring(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_getinterface(bus: alljoyn_busattachment, name: PCSTR): alljoyn_interfacedescription =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterface(bus.toString(), name.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_getinterfaces(bus: alljoyn_busattachment, ifaces: Long, numifaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getinterfaces(bus.toString(), ifaces.toString(), numifaces.toString()) as String).toULong() else 0uL

public actual fun alljoyn_busattachment_getkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getkeyexpiration(bus.toString(), guid.toString(), timeout.toString()) as Int) else 0

public actual fun alljoyn_busattachment_getpeerguid(bus: alljoyn_busattachment, name: PCSTR, guid: PCSTR, guidsz: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpeerguid(bus.toString(), name.toString(), guid.toString(), guidsz.toString()) as Int) else 0

public actual fun alljoyn_busattachment_getpermissionconfigurator(bus: alljoyn_busattachment): alljoyn_permissionconfigurator =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getpermissionconfigurator(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_gettimestamp(): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_gettimestamp() as Int).toUInt() else 0u

public actual fun alljoyn_busattachment_getuniquename(bus: alljoyn_busattachment): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_getuniquename(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busattachment_isconnected(bus: alljoyn_busattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isconnected(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_ispeersecurityenabled(bus: alljoyn_busattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ispeersecurityenabled(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_isstarted(bus: alljoyn_busattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstarted(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_isstopping(bus: alljoyn_busattachment): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_isstopping(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_join(bus: alljoyn_busattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_join(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_joinsession(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, sessionid: Long, opts: alljoyn_sessionopts): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsession(bus.toString(), sessionhost.toString(), sessionport.toInt(), listener.toString(), sessionid.toString(), opts.toString()) as Int) else 0

public actual fun alljoyn_busattachment_joinsessionasync(bus: alljoyn_busattachment, sessionhost: PCSTR, sessionport: UShort, listener: alljoyn_sessionlistener, opts: alljoyn_sessionopts, callback: alljoyn_busattachment_joinsessioncb_ptr, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_joinsessionasync(bus.toString(), sessionhost.toString(), sessionport.toInt(), listener.toString(), opts.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun alljoyn_busattachment_leavesession(bus: alljoyn_busattachment, sessionid: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_leavesession(bus.toString(), sessionid.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_namehasowner(bus: alljoyn_busattachment, name: PCSTR, hasowner: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_namehasowner(bus.toString(), name.toString(), hasowner.toString()) as Int) else 0

public actual fun alljoyn_busattachment_ping(bus: alljoyn_busattachment, name: PCSTR, timeout: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_ping(bus.toString(), name.toString(), timeout.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_registeraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registeraboutlistener(bus.toString(), aboutlistener.toString())
    }
}

public actual fun alljoyn_busattachment_registerapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerapplicationstatelistener(bus.toString(), listener.toString()) as Int) else 0

public actual fun alljoyn_busattachment_registerbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbuslistener(bus.toString(), listener.toString())
    }
}

public actual fun alljoyn_busattachment_registerbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject(bus.toString(), obj.toString()) as Int) else 0

public actual fun alljoyn_busattachment_registerbusobject_secure(bus: alljoyn_busattachment, obj: alljoyn_busobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerbusobject_secure(bus.toString(), obj.toString()) as Int) else 0

public actual fun alljoyn_busattachment_registerkeystorelistener(bus: alljoyn_busattachment, listener: alljoyn_keystorelistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_registerkeystorelistener(bus.toString(), listener.toString()) as Int) else 0

public actual fun alljoyn_busattachment_registersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_registersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_releasename(bus: alljoyn_busattachment, name: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_releasename(bus.toString(), name.toString()) as Int) else 0

public actual fun alljoyn_busattachment_reloadkeystore(bus: alljoyn_busattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_reloadkeystore(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_removematch(bus: alljoyn_busattachment, rule: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removematch(bus.toString(), rule.toString()) as Int) else 0

public actual fun alljoyn_busattachment_removesessionmember(bus: alljoyn_busattachment, sessionid: UInt, membername: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_removesessionmember(bus.toString(), sessionid.toInt(), membername.toString()) as Int) else 0

public actual fun alljoyn_busattachment_requestname(bus: alljoyn_busattachment, requestedname: PCSTR, flags: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_requestname(bus.toString(), requestedname.toString(), flags.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_secureconnection(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnection(bus.toString(), name.toString(), forceauth) as Int) else 0

public actual fun alljoyn_busattachment_secureconnectionasync(bus: alljoyn_busattachment, name: PCSTR, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_secureconnectionasync(bus.toString(), name.toString(), forceauth) as Int) else 0

public actual fun alljoyn_busattachment_setdaemondebug(bus: alljoyn_busattachment, module: PCSTR, level: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setdaemondebug(bus.toString(), module.toString(), level.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_setkeyexpiration(bus: alljoyn_busattachment, guid: PCSTR, timeout: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setkeyexpiration(bus.toString(), guid.toString(), timeout.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_setlinktimeout(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeout(bus.toString(), sessionid.toInt(), linktimeout.toString()) as Int) else 0

public actual fun alljoyn_busattachment_setlinktimeoutasync(bus: alljoyn_busattachment, sessionid: UInt, linktimeout: UInt, callback: alljoyn_busattachment_setlinktimeoutcb_ptr, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setlinktimeoutasync(bus.toString(), sessionid.toInt(), linktimeout.toInt(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun alljoyn_busattachment_setsessionlistener(bus: alljoyn_busattachment, sessionid: UInt, listener: alljoyn_sessionlistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_setsessionlistener(bus.toString(), sessionid.toInt(), listener.toString()) as Int) else 0

public actual fun alljoyn_busattachment_start(bus: alljoyn_busattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_start(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_stop(bus: alljoyn_busattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_stop(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_unbindsessionport(bus: alljoyn_busattachment, sessionport: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unbindsessionport(bus.toString(), sessionport.toInt()) as Int) else 0

public actual fun alljoyn_busattachment_unregisteraboutlistener(bus: alljoyn_busattachment, aboutlistener: alljoyn_aboutlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisteraboutlistener(bus.toString(), aboutlistener.toString())
    }
}

public actual fun alljoyn_busattachment_unregisterallaboutlisteners(bus: alljoyn_busattachment) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallaboutlisteners(bus.toString())
    }
}

public actual fun alljoyn_busattachment_unregisterallhandlers(bus: alljoyn_busattachment): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterallhandlers(bus.toString()) as Int) else 0

public actual fun alljoyn_busattachment_unregisterapplicationstatelistener(bus: alljoyn_busattachment, listener: alljoyn_applicationstatelistener): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterapplicationstatelistener(bus.toString(), listener.toString()) as Int) else 0

public actual fun alljoyn_busattachment_unregisterbuslistener(bus: alljoyn_busattachment, listener: alljoyn_buslistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbuslistener(bus.toString(), listener.toString())
    }
}

public actual fun alljoyn_busattachment_unregisterbusobject(bus: alljoyn_busattachment, obj: alljoyn_busobject) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_unregisterbusobject(bus.toString(), obj.toString())
    }
}

public actual fun alljoyn_busattachment_unregistersignalhandler(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, srcpath: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_unregistersignalhandlerwithrule(bus: alljoyn_busattachment, signal_handler: alljoyn_messagereceiver_signalhandler_ptr, member: alljoyn_interfacedescription_member, matchrule: PCSTR): QStatus =
    0

public actual fun alljoyn_busattachment_whoimplements_interface(bus: alljoyn_busattachment, implementsinterface: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interface(bus.toString(), implementsinterface.toString()) as Int) else 0

public actual fun alljoyn_busattachment_whoimplements_interfaces(bus: alljoyn_busattachment, implementsinterfaces: Long, numberinterfaces: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busattachment_whoimplements_interfaces(bus.toString(), implementsinterfaces.toString(), numberinterfaces.toString()) as Int) else 0

public actual fun alljoyn_buslistener_create(callbacks: Long, context: Long): alljoyn_buslistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_buslistener_destroy(listener: alljoyn_buslistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_buslistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_busobject_addinterface(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface(bus.toString(), iface.toString()) as Int) else 0

public actual fun alljoyn_busobject_addinterface_announced(bus: alljoyn_busobject, iface: alljoyn_interfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addinterface_announced(bus.toString(), iface.toString()) as Int) else 0

public actual fun alljoyn_busobject_addmethodhandler(bus: alljoyn_busobject, member: alljoyn_interfacedescription_member, handler: alljoyn_messagereceiver_methodhandler_ptr, context: Long): QStatus =
    0

public actual fun alljoyn_busobject_addmethodhandlers(bus: alljoyn_busobject, entries: Long, numentries: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_addmethodhandlers(bus.toString(), entries.toString(), numentries.toString()) as Int) else 0

public actual fun alljoyn_busobject_cancelsessionlessmessage(bus: alljoyn_busobject, msg: alljoyn_message): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage(bus.toString(), msg.toString()) as Int) else 0

public actual fun alljoyn_busobject_cancelsessionlessmessage_serial(bus: alljoyn_busobject, serialnumber: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_cancelsessionlessmessage_serial(bus.toString(), serialnumber.toInt()) as Int) else 0

public actual fun alljoyn_busobject_create(path: PCSTR, isplaceholder: Int, callbacks_in: Long, context_in: Long): alljoyn_busobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_create(path.toString(), isplaceholder, callbacks_in.toString(), context_in.toString()) as String).toLong() else 0L

public actual fun alljoyn_busobject_destroy(bus: alljoyn_busobject) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_destroy(bus.toString())
    }
}

public actual fun alljoyn_busobject_emitpropertieschanged(bus: alljoyn_busobject, ifcname: PCSTR, propnames: Long, numprops: ULong, id: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertieschanged(bus.toString(), ifcname.toString(), propnames.toString(), numprops.toString(), id.toInt())
    }
}

public actual fun alljoyn_busobject_emitpropertychanged(bus: alljoyn_busobject, ifcname: PCSTR, propname: PCSTR, value: alljoyn_msgarg, id: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_emitpropertychanged(bus.toString(), ifcname.toString(), propname.toString(), value.toString(), id.toInt())
    }
}

public actual fun alljoyn_busobject_getannouncedinterfacenames(bus: alljoyn_busobject, interfaces: Long, numinterfaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getannouncedinterfacenames(bus.toString(), interfaces.toString(), numinterfaces.toString()) as String).toULong() else 0uL

public actual fun alljoyn_busobject_getbusattachment(bus: alljoyn_busobject): alljoyn_busattachment =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getbusattachment(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busobject_getname(bus: alljoyn_busobject, buffer: PCSTR, buffersz: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getname(bus.toString(), buffer.toString(), buffersz.toString()) as String).toULong() else 0uL

public actual fun alljoyn_busobject_getpath(bus: alljoyn_busobject): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_getpath(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_busobject_issecure(bus: alljoyn_busobject): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_issecure(bus.toString()) as Int) else 0

public actual fun alljoyn_busobject_methodreply_args(bus: alljoyn_busobject, msg: alljoyn_message, args: alljoyn_msgarg, numargs: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_args(bus.toString(), msg.toString(), args.toString(), numargs.toString()) as Int) else 0

public actual fun alljoyn_busobject_methodreply_err(bus: alljoyn_busobject, msg: alljoyn_message, error: PCSTR, errormessage: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_err(bus.toString(), msg.toString(), error.toString(), errormessage.toString()) as Int) else 0

public actual fun alljoyn_busobject_methodreply_status(bus: alljoyn_busobject, msg: alljoyn_message, status: QStatus): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_methodreply_status(bus.toString(), msg.toString(), status) as Int) else 0

public actual fun alljoyn_busobject_setannounceflag(bus: alljoyn_busobject, iface: alljoyn_interfacedescription, isannounced: alljoyn_about_announceflag): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_busobject_setannounceflag(bus.toString(), iface.toString(), isannounced) as Int) else 0

public actual fun alljoyn_busobject_signal(bus: alljoyn_busobject, destination: PCSTR, sessionid: UInt, signal: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: alljoyn_message): QStatus =
    0

public actual fun alljoyn_credentials_clear(cred: alljoyn_credentials) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_clear(cred.toString())
    }
}

public actual fun alljoyn_credentials_create(): alljoyn_credentials =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_create() as String).toLong() else 0L

public actual fun alljoyn_credentials_destroy(cred: alljoyn_credentials) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_destroy(cred.toString())
    }
}

public actual fun alljoyn_credentials_getcertchain(cred: alljoyn_credentials): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getcertchain(cred.toString()) as String).toLong() else 0L

public actual fun alljoyn_credentials_getexpiration(cred: alljoyn_credentials): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getexpiration(cred.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_credentials_getlogonentry(cred: alljoyn_credentials): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getlogonentry(cred.toString()) as String).toLong() else 0L

public actual fun alljoyn_credentials_getpassword(cred: alljoyn_credentials): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getpassword(cred.toString()) as String).toLong() else 0L

public actual fun alljoyn_credentials_getprivateKey(cred: alljoyn_credentials): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getprivateKey(cred.toString()) as String).toLong() else 0L

public actual fun alljoyn_credentials_getusername(cred: alljoyn_credentials): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_getusername(cred.toString()) as String).toLong() else 0L

public actual fun alljoyn_credentials_isset(cred: alljoyn_credentials, creds: UShort): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_isset(cred.toString(), creds.toInt()) as Int) else 0

public actual fun alljoyn_credentials_setcertchain(cred: alljoyn_credentials, certchain: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setcertchain(cred.toString(), certchain.toString())
    }
}

public actual fun alljoyn_credentials_setexpiration(cred: alljoyn_credentials, expiration: UInt) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setexpiration(cred.toString(), expiration.toInt())
    }
}

public actual fun alljoyn_credentials_setlogonentry(cred: alljoyn_credentials, logonentry: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setlogonentry(cred.toString(), logonentry.toString())
    }
}

public actual fun alljoyn_credentials_setpassword(cred: alljoyn_credentials, pwd: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setpassword(cred.toString(), pwd.toString())
    }
}

public actual fun alljoyn_credentials_setprivatekey(cred: alljoyn_credentials, pk: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setprivatekey(cred.toString(), pk.toString())
    }
}

public actual fun alljoyn_credentials_setusername(cred: alljoyn_credentials, username: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_credentials_setusername(cred.toString(), username.toString())
    }
}

public actual fun alljoyn_getbuildinfo(): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_getbuildinfo() as String).toLong() else 0L

public actual fun alljoyn_getnumericversion(): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_getnumericversion() as Int).toUInt() else 0u

public actual fun alljoyn_getversion(): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_getversion() as String).toLong() else 0L

public actual fun alljoyn_init(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_init() as Int) else 0

public actual fun alljoyn_interfacedescription_activate(iface: alljoyn_interfacedescription) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_activate(iface.toString())
    }
}

public actual fun alljoyn_interfacedescription_addannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addannotation(iface.toString(), name.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_addargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addargannotation(iface.toString(), member.toString(), argname.toString(), name.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_addmember(iface: alljoyn_interfacedescription, type: alljoyn_messagetype, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmember(iface.toString(), type, name.toString(), inputsig.toString(), outsig.toString(), argnames.toString(), annotation.toInt()) as Int) else 0

public actual fun alljoyn_interfacedescription_addmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmemberannotation(iface.toString(), member.toString(), name.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_addmethod(iface: alljoyn_interfacedescription, name: PCSTR, inputsig: PCSTR, outsig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addmethod(iface.toString(), name.toString(), inputsig.toString(), outsig.toString(), argnames.toString(), annotation.toInt(), accessperms.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_addproperty(iface: alljoyn_interfacedescription, name: PCSTR, signature: PCSTR, access: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addproperty(iface.toString(), name.toString(), signature.toString(), access.toInt()) as Int) else 0

public actual fun alljoyn_interfacedescription_addpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addpropertyannotation(iface.toString(), property.toString(), name.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_addsignal(iface: alljoyn_interfacedescription, name: PCSTR, sig: PCSTR, argnames: PCSTR, annotation: UByte, accessperms: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_addsignal(iface.toString(), name.toString(), sig.toString(), argnames.toString(), annotation.toInt(), accessperms.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_eql(one: alljoyn_interfacedescription, other: alljoyn_interfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_eql(one.toString(), other.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getannotation(iface: alljoyn_interfacedescription, name: PCSTR, value: PCSTR, value_size: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotation(iface.toString(), name.toString(), value.toString(), value_size.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getannotationatindex(iface: alljoyn_interfacedescription, index: ULong, name: PCSTR, name_size: Long, value: PCSTR, value_size: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationatindex(iface.toString(), index.toString(), name.toString(), name_size.toString(), value.toString(), value_size.toString())
    }
}

public actual fun alljoyn_interfacedescription_getannotationscount(iface: alljoyn_interfacedescription): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getannotationscount(iface.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getargdescriptionforlanguage(iface.toString(), member.toString(), arg.toString(), description.toString(), maxlanguagelength.toString(), languagetag.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionforlanguage(iface.toString(), description.toString(), maxlanguagelength.toString(), languagetag.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getdescriptionlanguages(iface: alljoyn_interfacedescription, languages: Long, size: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages(iface.toString(), languages.toString(), size.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getdescriptionlanguages2(iface: alljoyn_interfacedescription, languages: PCSTR, languagessize: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptionlanguages2(iface.toString(), languages.toString(), languagessize.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getdescriptiontranslationcallback(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_translation_callback_ptr =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getdescriptiontranslationcallback(iface.toString()) as String).toLong() else null

public actual fun alljoyn_interfacedescription_getmember(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmember(iface.toString(), name.toString(), member.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getmemberannotation(iface: alljoyn_interfacedescription, member: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberannotation(iface.toString(), member.toString(), name.toString(), value.toString(), value_size.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getmemberargannotation(iface: alljoyn_interfacedescription, member: PCSTR, argname: PCSTR, name: PCSTR, value: PCSTR, value_size: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberargannotation(iface.toString(), member.toString(), argname.toString(), name.toString(), value.toString(), value_size.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface.toString(), member.toString(), description.toString(), maxlanguagelength.toString(), languagetag.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getmembers(iface: alljoyn_interfacedescription, members: Long, nummembers: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmembers(iface.toString(), members.toString(), nummembers.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getmethod(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getmethod(iface.toString(), name.toString(), member.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getname(iface: alljoyn_interfacedescription): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getname(iface.toString()) as String).toLong() else 0L

public actual fun alljoyn_interfacedescription_getproperties(iface: alljoyn_interfacedescription, props: Long, numprops: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperties(iface.toString(), props.toString(), numprops.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getproperty(iface: alljoyn_interfacedescription, name: PCSTR, property: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getproperty(iface.toString(), name.toString(), property.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getpropertyannotation(iface: alljoyn_interfacedescription, property: PCSTR, name: PCSTR, value: PCSTR, str_size: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertyannotation(iface.toString(), property.toString(), name.toString(), value.toString(), str_size.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, property: PCSTR, description: PCSTR, maxlanguagelength: ULong, languagetag: PCSTR): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface.toString(), property.toString(), description.toString(), maxlanguagelength.toString(), languagetag.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_getsecuritypolicy(iface: alljoyn_interfacedescription): alljoyn_interfacedescription_securitypolicy =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsecuritypolicy(iface.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_getsignal(iface: alljoyn_interfacedescription, name: PCSTR, member: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_getsignal(iface.toString(), name.toString(), member.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_hasdescription(iface: alljoyn_interfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasdescription(iface.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_hasmember(iface: alljoyn_interfacedescription, name: PCSTR, insig: PCSTR, outsig: PCSTR): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasmember(iface.toString(), name.toString(), insig.toString(), outsig.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_hasproperties(iface: alljoyn_interfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperties(iface.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_hasproperty(iface: alljoyn_interfacedescription, name: PCSTR): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_hasproperty(iface.toString(), name.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_introspect(iface: alljoyn_interfacedescription, str: PCSTR, buf: ULong, indent: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_introspect(iface.toString(), str.toString(), buf.toString(), indent.toString()) as String).toULong() else 0uL

public actual fun alljoyn_interfacedescription_issecure(iface: alljoyn_interfacedescription): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_issecure(iface.toString()) as Int) else 0

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
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescription(iface.toString(), member.toString(), argname.toString(), description.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_setargdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, arg: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setargdescriptionforlanguage(iface.toString(), member.toString(), arg.toString(), description.toString(), languagetag.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_setdescription(iface: alljoyn_interfacedescription, description: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescription(iface.toString(), description.toString())
    }
}

public actual fun alljoyn_interfacedescription_setdescriptionforlanguage(iface: alljoyn_interfacedescription, description: PCSTR, languagetag: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionforlanguage(iface.toString(), description.toString(), languagetag.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_setdescriptionlanguage(iface: alljoyn_interfacedescription, language: PCSTR) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptionlanguage(iface.toString(), language.toString())
    }
}

public actual fun alljoyn_interfacedescription_setdescriptiontranslationcallback(iface: alljoyn_interfacedescription, translationcallback: alljoyn_interfacedescription_translation_callback_ptr) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setdescriptiontranslationcallback(iface.toString(), translationcallback.toLong().toString())
    }
}

public actual fun alljoyn_interfacedescription_setmemberdescription(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescription(iface.toString(), member.toString(), description.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface: alljoyn_interfacedescription, member: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface.toString(), member.toString(), description.toString(), languagetag.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_setpropertydescription(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescription(iface.toString(), name.toString(), description.toString()) as Int) else 0

public actual fun alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface: alljoyn_interfacedescription, name: PCSTR, description: PCSTR, languagetag: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface.toString(), name.toString(), description.toString(), languagetag.toString()) as Int) else 0

public actual fun alljoyn_keystorelistener_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_keystorelistener_destroy(listener: alljoyn_keystorelistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_keystorelistener_getkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, sink: PCSTR, sink_sz: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_getkeys(listener.toString(), keystore.toString(), sink.toString(), sink_sz.toString()) as Int) else 0

public actual fun alljoyn_keystorelistener_putkeys(listener: alljoyn_keystorelistener, keystore: alljoyn_keystore, source: PCSTR, password: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_putkeys(listener.toString(), keystore.toString(), source.toString(), password.toString()) as Int) else 0

public actual fun alljoyn_keystorelistener_with_synchronization_create(callbacks: Long, context: Long): alljoyn_keystorelistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_keystorelistener_with_synchronization_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_create(bus: alljoyn_busattachment): alljoyn_message =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_create(bus.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_description(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_description(msg.toString(), str.toString(), buf.toString()) as String).toULong() else 0uL

public actual fun alljoyn_message_destroy(msg: alljoyn_message) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_destroy(msg.toString())
    }
}

public actual fun alljoyn_message_eql(one: alljoyn_message, other: alljoyn_message): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_eql(one.toString(), other.toString()) as Int) else 0

public actual fun alljoyn_message_getarg(msg: alljoyn_message, argn: ULong): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getarg(msg.toString(), argn.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getargs(msg: alljoyn_message, numargs: Long, args: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getargs(msg.toString(), numargs.toString(), args.toString())
    }
}

public actual fun alljoyn_message_getauthmechanism(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getauthmechanism(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getcallserial(msg: alljoyn_message): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcallserial(msg.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_message_getcompressiontoken(msg: alljoyn_message): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getcompressiontoken(msg.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_message_getdestination(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getdestination(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_geterrorname(msg: alljoyn_message, errormessage: PCSTR, errormessage_size: Long): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_geterrorname(msg.toString(), errormessage.toString(), errormessage_size.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getflags(msg: alljoyn_message): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getflags(msg.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_message_getinterface(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getinterface(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getmembername(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getmembername(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getobjectpath(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getobjectpath(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getreceiveendpointname(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreceiveendpointname(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getreplyserial(msg: alljoyn_message): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getreplyserial(msg.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_message_getsender(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsender(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_getsessionid(msg: alljoyn_message): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsessionid(msg.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_message_getsignature(msg: alljoyn_message): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_getsignature(msg.toString()) as String).toLong() else 0L

public actual fun alljoyn_message_gettimestamp(msg: alljoyn_message): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettimestamp(msg.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_message_gettype(msg: alljoyn_message): alljoyn_messagetype =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_gettype(msg.toString()) as Int) else 0

public actual fun alljoyn_message_isbroadcastsignal(msg: alljoyn_message): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isbroadcastsignal(msg.toString()) as Int) else 0

public actual fun alljoyn_message_isencrypted(msg: alljoyn_message): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isencrypted(msg.toString()) as Int) else 0

public actual fun alljoyn_message_isexpired(msg: alljoyn_message, tillexpirems: Long): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isexpired(msg.toString(), tillexpirems.toString()) as Int) else 0

public actual fun alljoyn_message_isglobalbroadcast(msg: alljoyn_message): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isglobalbroadcast(msg.toString()) as Int) else 0

public actual fun alljoyn_message_issessionless(msg: alljoyn_message): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_issessionless(msg.toString()) as Int) else 0

public actual fun alljoyn_message_isunreliable(msg: alljoyn_message): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_isunreliable(msg.toString()) as Int) else 0

public actual fun alljoyn_message_parseargs(msg: alljoyn_message, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_message_setendianess(endian: Byte) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_setendianess(endian.toInt())
    }
}

public actual fun alljoyn_message_tostring(msg: alljoyn_message, str: PCSTR, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_message_tostring(msg.toString(), str.toString(), buf.toString()) as String).toULong() else 0uL

public actual fun alljoyn_msgarg_array_create(size: ULong): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_create(size.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_array_element(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_element(arg.toString(), index.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_array_get(args: alljoyn_msgarg, numargs: ULong, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set(args: alljoyn_msgarg, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_set_offset(args: alljoyn_msgarg, argoffset: ULong, numargs: Long, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_array_signature(values: alljoyn_msgarg, numvalues: ULong, str: PCSTR, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_signature(values.toString(), numvalues.toString(), str.toString(), buf.toString()) as String).toULong() else 0uL

public actual fun alljoyn_msgarg_array_tostring(args: alljoyn_msgarg, numargs: ULong, str: PCSTR, buf: ULong, indent: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_array_tostring(args.toString(), numargs.toString(), str.toString(), buf.toString(), indent.toString()) as String).toULong() else 0uL

public actual fun alljoyn_msgarg_clear(arg: alljoyn_msgarg) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clear(arg.toString())
    }
}

public actual fun alljoyn_msgarg_clone(destination: alljoyn_msgarg, source: alljoyn_msgarg) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_clone(destination.toString(), source.toString())
    }
}

public actual fun alljoyn_msgarg_copy(source: alljoyn_msgarg): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_copy(source.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_create(): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_create() as String).toLong() else 0L

public actual fun alljoyn_msgarg_create_and_set(signature: PCSTR): alljoyn_msgarg =
    0L

public actual fun alljoyn_msgarg_destroy(arg: alljoyn_msgarg) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_destroy(arg.toString())
    }
}

public actual fun alljoyn_msgarg_equal(lhv: alljoyn_msgarg, rhv: alljoyn_msgarg): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_equal(lhv.toString(), rhv.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_get_array_element(arg: alljoyn_msgarg, index: ULong, element: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_element(arg.toString(), index.toString(), element.toString())
    }
}

public actual fun alljoyn_msgarg_get_array_elementsignature(arg: alljoyn_msgarg, index: ULong): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_elementsignature(arg.toString(), index.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_get_array_numberofelements(arg: alljoyn_msgarg): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_array_numberofelements(arg.toString()) as String).toULong() else 0uL

public actual fun alljoyn_msgarg_get_bool(arg: alljoyn_msgarg, b: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool(arg.toString(), b.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_bool_array(arg: alljoyn_msgarg, length: Long, ab: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_bool_array(arg.toString(), length.toString(), ab.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_double(arg: alljoyn_msgarg, d: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double(arg.toString(), d.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_double_array(arg: alljoyn_msgarg, length: Long, ad: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_double_array(arg.toString(), length.toString(), ad.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_int16(arg: alljoyn_msgarg, n: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16(arg.toString(), n.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_int16_array(arg: alljoyn_msgarg, length: Long, an: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int16_array(arg.toString(), length.toString(), an.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_int32(arg: alljoyn_msgarg, i: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32(arg.toString(), i.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_int32_array(arg: alljoyn_msgarg, length: Long, ai: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int32_array(arg.toString(), length.toString(), ai.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64(arg.toString(), x.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_int64_array(arg: alljoyn_msgarg, length: Long, ax: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_int64_array(arg.toString(), length.toString(), ax.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_objectpath(arg: alljoyn_msgarg, o: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_objectpath(arg.toString(), o.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_signature(arg: alljoyn_msgarg, g: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_signature(arg.toString(), g.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_string(arg: alljoyn_msgarg, s: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_string(arg.toString(), s.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint16(arg: alljoyn_msgarg, q: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16(arg.toString(), q.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint16_array(arg: alljoyn_msgarg, length: Long, aq: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint16_array(arg.toString(), length.toString(), aq.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint32(arg: alljoyn_msgarg, u: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32(arg.toString(), u.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint32_array(arg: alljoyn_msgarg, length: Long, au: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint32_array(arg.toString(), length.toString(), au.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint64(arg: alljoyn_msgarg, t: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64(arg.toString(), t.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint64_array(arg: alljoyn_msgarg, length: Long, at: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint64_array(arg.toString(), length.toString(), at.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint8(arg: alljoyn_msgarg, y: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8(arg.toString(), y.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_uint8_array(arg: alljoyn_msgarg, length: Long, ay: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_uint8_array(arg.toString(), length.toString(), ay.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_variant(arg: alljoyn_msgarg, v: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant(arg.toString(), v.toString()) as Int) else 0

public actual fun alljoyn_msgarg_get_variant_array(arg: alljoyn_msgarg, signature: PCSTR, length: Long, av: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_get_variant_array(arg.toString(), signature.toString(), length.toString(), av.toString()) as Int) else 0

public actual fun alljoyn_msgarg_getdictelement(arg: alljoyn_msgarg, elemsig: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_getkey(arg: alljoyn_msgarg): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getkey(arg.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_getmember(arg: alljoyn_msgarg, index: ULong): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getmember(arg.toString(), index.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_getnummembers(arg: alljoyn_msgarg): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getnummembers(arg.toString()) as String).toULong() else 0uL

public actual fun alljoyn_msgarg_gettype(arg: alljoyn_msgarg): alljoyn_typeid =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_gettype(arg.toString()) as Int) else 0

public actual fun alljoyn_msgarg_getvalue(arg: alljoyn_msgarg): alljoyn_msgarg =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_getvalue(arg.toString()) as String).toLong() else 0L

public actual fun alljoyn_msgarg_hassignature(arg: alljoyn_msgarg, signature: PCSTR): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_hassignature(arg.toString(), signature.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_and_stabilize(arg: alljoyn_msgarg, signature: PCSTR): QStatus =
    0

public actual fun alljoyn_msgarg_set_bool(arg: alljoyn_msgarg, b: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool(arg.toString(), b) as Int) else 0

public actual fun alljoyn_msgarg_set_bool_array(arg: alljoyn_msgarg, length: ULong, ab: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_bool_array(arg.toString(), length.toString(), ab.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_double(arg: alljoyn_msgarg, d: Double): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double(arg.toString(), d) as Int) else 0

public actual fun alljoyn_msgarg_set_double_array(arg: alljoyn_msgarg, length: ULong, ad: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_double_array(arg.toString(), length.toString(), ad.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_int16(arg: alljoyn_msgarg, n: Short): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16(arg.toString(), n.toInt()) as Int) else 0

public actual fun alljoyn_msgarg_set_int16_array(arg: alljoyn_msgarg, length: ULong, an: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int16_array(arg.toString(), length.toString(), an.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_int32(arg: alljoyn_msgarg, i: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32(arg.toString(), i) as Int) else 0

public actual fun alljoyn_msgarg_set_int32_array(arg: alljoyn_msgarg, length: ULong, ai: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int32_array(arg.toString(), length.toString(), ai.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_int64(arg: alljoyn_msgarg, x: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64(arg.toString(), x.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_int64_array(arg: alljoyn_msgarg, length: ULong, ax: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_int64_array(arg.toString(), length.toString(), ax.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_objectpath(arg: alljoyn_msgarg, o: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath(arg.toString(), o.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_objectpath_array(arg: alljoyn_msgarg, length: ULong, ao: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_objectpath_array(arg.toString(), length.toString(), ao.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_signature(arg: alljoyn_msgarg, g: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature(arg.toString(), g.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_signature_array(arg: alljoyn_msgarg, length: ULong, ag: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_signature_array(arg.toString(), length.toString(), ag.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_string(arg: alljoyn_msgarg, s: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string(arg.toString(), s.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_string_array(arg: alljoyn_msgarg, length: ULong, asTarget: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_string_array(arg.toString(), length.toString(), asTarget.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint16(arg: alljoyn_msgarg, q: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16(arg.toString(), q.toInt()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint16_array(arg: alljoyn_msgarg, length: ULong, aq: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint16_array(arg.toString(), length.toString(), aq.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint32(arg: alljoyn_msgarg, u: UInt): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32(arg.toString(), u.toInt()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint32_array(arg: alljoyn_msgarg, length: ULong, au: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint32_array(arg.toString(), length.toString(), au.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint64(arg: alljoyn_msgarg, t: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64(arg.toString(), t.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint64_array(arg: alljoyn_msgarg, length: ULong, at: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint64_array(arg.toString(), length.toString(), at.toString()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint8(arg: alljoyn_msgarg, y: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8(arg.toString(), y.toInt()) as Int) else 0

public actual fun alljoyn_msgarg_set_uint8_array(arg: alljoyn_msgarg, length: ULong, ay: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_set_uint8_array(arg.toString(), length.toString(), ay.toString()) as Int) else 0

public actual fun alljoyn_msgarg_setdictentry(arg: alljoyn_msgarg, key: alljoyn_msgarg, value: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setdictentry(arg.toString(), key.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_msgarg_setstruct(arg: alljoyn_msgarg, struct_members: alljoyn_msgarg, num_members: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_setstruct(arg.toString(), struct_members.toString(), num_members.toString()) as Int) else 0

public actual fun alljoyn_msgarg_signature(arg: alljoyn_msgarg, str: PCSTR, buf: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_signature(arg.toString(), str.toString(), buf.toString()) as String).toULong() else 0uL

public actual fun alljoyn_msgarg_stabilize(arg: alljoyn_msgarg) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_stabilize(arg.toString())
    }
}

public actual fun alljoyn_msgarg_tostring(arg: alljoyn_msgarg, str: PCSTR, buf: ULong, indent: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_msgarg_tostring(arg.toString(), str.toString(), buf.toString(), indent.toString()) as String).toULong() else 0uL

public actual fun alljoyn_observer_create(bus: alljoyn_busattachment, mandatoryinterfaces: Long, nummandatoryinterfaces: ULong): alljoyn_observer =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_create(bus.toString(), mandatoryinterfaces.toString(), nummandatoryinterfaces.toString()) as String).toLong() else 0L

public actual fun alljoyn_observer_destroy(observer: alljoyn_observer) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_destroy(observer.toString())
    }
}

public actual fun alljoyn_observer_get(observer: alljoyn_observer, uniquebusname: PCSTR, objectpath: PCSTR): alljoyn_proxybusobject_ref =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_get(observer.toString(), uniquebusname.toString(), objectpath.toString()) as String).toLong() else 0L

public actual fun alljoyn_observer_getfirst(observer: alljoyn_observer): alljoyn_proxybusobject_ref =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getfirst(observer.toString()) as String).toLong() else 0L

public actual fun alljoyn_observer_getnext(observer: alljoyn_observer, proxyref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject_ref =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_getnext(observer.toString(), proxyref.toString()) as String).toLong() else 0L

public actual fun alljoyn_observer_registerlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener, triggeronexisting: Int) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_registerlistener(observer.toString(), listener.toString(), triggeronexisting)
    }
}

public actual fun alljoyn_observer_unregisteralllisteners(observer: alljoyn_observer) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisteralllisteners(observer.toString())
    }
}

public actual fun alljoyn_observer_unregisterlistener(observer: alljoyn_observer, listener: alljoyn_observerlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observer_unregisterlistener(observer.toString(), listener.toString())
    }
}

public actual fun alljoyn_observerlistener_create(callback: Long, context: Long): alljoyn_observerlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_create(callback.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_observerlistener_destroy(listener: alljoyn_observerlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_observerlistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_passwordmanager_setcredentials(authmechanism: PCSTR, password: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_passwordmanager_setcredentials(authmechanism.toString(), password.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurationlistener_create(callbacks: Long, context: Long): alljoyn_permissionconfigurationlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_permissionconfigurationlistener_destroy(listener: alljoyn_permissionconfigurationlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurationlistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_certificateid_cleanup(certificateid: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateid_cleanup(certificateid.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_claim(configurator: alljoyn_permissionconfigurator, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_claim(configurator.toString(), cakey.toString(), identitycertificatechain.toString(), groupid.toString(), groupsize.toString(), groupauthority.toString(), manifestsxmls.toString(), manifestscount.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_endmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_endmanagement(configurator.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getapplicationstate(configurator: alljoyn_permissionconfigurator, state: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getapplicationstate(configurator.toString(), state.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilities(configurator.toString(), claimcapabilities.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getdefaultclaimcapabilities(): UShort =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultclaimcapabilities() as Int).toUShort() else 0u

public actual fun alljoyn_permissionconfigurator_getdefaultpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getdefaultpolicy(configurator.toString(), policyxml.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentity(configurator.toString(), identitycertificatechain.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getidentitycertificateid(configurator: alljoyn_permissionconfigurator, certificateid: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getidentitycertificateid(configurator.toString(), certificateid.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getmanifests(configurator: alljoyn_permissionconfigurator, manifestarray: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifests(configurator.toString(), manifestarray.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getmanifesttemplate(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmanifesttemplate(configurator.toString(), manifesttemplatexml.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getmembershipsummaries(configurator: alljoyn_permissionconfigurator, certificateids: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getmembershipsummaries(configurator.toString(), certificateids.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getpolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpolicy(configurator.toString(), policyxml.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_getpublickey(configurator: alljoyn_permissionconfigurator, publickey: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_getpublickey(configurator.toString(), publickey.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_installmanifests(configurator: alljoyn_permissionconfigurator, manifestsxmls: Long, manifestscount: ULong, append: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmanifests(configurator.toString(), manifestsxmls.toString(), manifestscount.toString(), append) as Int) else 0

public actual fun alljoyn_permissionconfigurator_installmembership(configurator: alljoyn_permissionconfigurator, membershipcertificatechain: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_installmembership(configurator.toString(), membershipcertificatechain.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_policy_destroy(policyxml: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_policy_destroy(policyxml.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_publickey_destroy(publickey: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_publickey_destroy(publickey.toString())
    }
}

public actual fun alljoyn_permissionconfigurator_removemembership(configurator: alljoyn_permissionconfigurator, serial: Long, seriallen: ULong, issuerpublickey: Long, issueraki: Long, issuerakilen: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_removemembership(configurator.toString(), serial.toString(), seriallen.toString(), issuerpublickey.toString(), issueraki.toString(), issuerakilen.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_reset(configurator: alljoyn_permissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_reset(configurator.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_resetpolicy(configurator: alljoyn_permissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_resetpolicy(configurator.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_setapplicationstate(configurator: alljoyn_permissionconfigurator, state: alljoyn_applicationstate): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setapplicationstate(configurator.toString(), state) as Int) else 0

public actual fun alljoyn_permissionconfigurator_setclaimcapabilities(configurator: alljoyn_permissionconfigurator, claimcapabilities: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilities(configurator.toString(), claimcapabilities.toInt()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator: alljoyn_permissionconfigurator, additionalinfo: UShort): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.toInt()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator: alljoyn_permissionconfigurator, manifesttemplatexml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator.toString(), manifesttemplatexml.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_startmanagement(configurator: alljoyn_permissionconfigurator): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_startmanagement(configurator.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_updateidentity(configurator: alljoyn_permissionconfigurator, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updateidentity(configurator.toString(), identitycertificatechain.toString(), manifestsxmls.toString(), manifestscount.toString()) as Int) else 0

public actual fun alljoyn_permissionconfigurator_updatepolicy(configurator: alljoyn_permissionconfigurator, policyxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_permissionconfigurator_updatepolicy(configurator.toString(), policyxml.toString()) as Int) else 0

public actual fun alljoyn_pinglistener_create(callback: Long, context: Long): alljoyn_pinglistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_create(callback.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_pinglistener_destroy(listener: alljoyn_pinglistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_pinglistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_proxybusobject_addchild(proxyobj: alljoyn_proxybusobject, child: alljoyn_proxybusobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addchild(proxyobj.toString(), child.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_addinterface(proxyobj: alljoyn_proxybusobject, iface: alljoyn_interfacedescription): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface(proxyobj.toString(), iface.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_addinterface_by_name(proxyobj: alljoyn_proxybusobject, name: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_addinterface_by_name(proxyobj.toString(), name.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_copy(source: alljoyn_proxybusobject): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_copy(source.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_create(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create(bus.toString(), service.toString(), path.toString(), sessionid.toInt()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_create_secure(bus: alljoyn_busattachment, service: PCSTR, path: PCSTR, sessionid: UInt): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_create_secure(bus.toString(), service.toString(), path.toString(), sessionid.toInt()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_destroy(proxyobj: alljoyn_proxybusobject) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_destroy(proxyobj.toString())
    }
}

public actual fun alljoyn_proxybusobject_enablepropertycaching(proxyobj: alljoyn_proxybusobject) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_enablepropertycaching(proxyobj.toString())
    }
}

public actual fun alljoyn_proxybusobject_getallproperties(proxyobj: alljoyn_proxybusobject, iface: PCSTR, values: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallproperties(proxyobj.toString(), iface.toString(), values.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_getallpropertiesasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_getallpropertiescb_ptr, timeout: UInt, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getallpropertiesasync(proxyobj.toString(), iface.toString(), callback.toLong().toString(), timeout.toInt(), context.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_getchild(proxyobj: alljoyn_proxybusobject, path: PCSTR): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchild(proxyobj.toString(), path.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_getchildren(proxyobj: alljoyn_proxybusobject, children: Long, numchildren: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getchildren(proxyobj.toString(), children.toString(), numchildren.toString()) as String).toULong() else 0uL

public actual fun alljoyn_proxybusobject_getinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): alljoyn_interfacedescription =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterface(proxyobj.toString(), iface.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_getinterfaces(proxyobj: alljoyn_proxybusobject, ifaces: Long, numifaces: ULong): ULong =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getinterfaces(proxyobj.toString(), ifaces.toString(), numifaces.toString()) as String).toULong() else 0uL

public actual fun alljoyn_proxybusobject_getpath(proxyobj: alljoyn_proxybusobject): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpath(proxyobj.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_getproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getproperty(proxyobj.toString(), iface.toString(), property.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_getpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, callback: alljoyn_proxybusobject_listener_getpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getpropertyasync(proxyobj.toString(), iface.toString(), property.toString(), callback.toLong().toString(), timeout.toInt(), context.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_getservicename(proxyobj: alljoyn_proxybusobject): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getservicename(proxyobj.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_getsessionid(proxyobj: alljoyn_proxybusobject): UInt =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getsessionid(proxyobj.toString()) as Int).toUInt() else 0u

public actual fun alljoyn_proxybusobject_getuniquename(proxyobj: alljoyn_proxybusobject): PCSTR =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_getuniquename(proxyobj.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_implementsinterface(proxyobj: alljoyn_proxybusobject, iface: PCSTR): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_implementsinterface(proxyobj.toString(), iface.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_introspectremoteobject(proxyobj: alljoyn_proxybusobject): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobject(proxyobj.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj: alljoyn_proxybusobject, callback: alljoyn_proxybusobject_listener_introspectcb_ptr, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_issecure(proxyobj: alljoyn_proxybusobject): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_issecure(proxyobj.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_isvalid(proxyobj: alljoyn_proxybusobject): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_isvalid(proxyobj.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_methodcall(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall(proxyobj.toString(), ifacename.toString(), methodname.toString(), args.toString(), numargs.toString(), replymsg.toString(), timeout.toInt(), flags.toInt()) as Int) else 0

public actual fun alljoyn_proxybusobject_methodcall_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, replymsg: alljoyn_message, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_member_noreply(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_methodcall_noreply(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, args: alljoyn_msgarg, numargs: ULong, flags: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcall_noreply(proxyobj.toString(), ifacename.toString(), methodname.toString(), args.toString(), numargs.toString(), flags.toInt()) as Int) else 0

public actual fun alljoyn_proxybusobject_methodcallasync(proxyobj: alljoyn_proxybusobject, ifacename: PCSTR, methodname: PCSTR, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_methodcallasync(proxyobj.toString(), ifacename.toString(), methodname.toString(), replyfunc.toLong().toString(), args.toString(), numargs.toString(), context.toString(), timeout.toInt(), flags.toInt()) as Int) else 0

public actual fun alljoyn_proxybusobject_methodcallasync_member(proxyobj: alljoyn_proxybusobject, method: alljoyn_interfacedescription_member, replyfunc: alljoyn_messagereceiver_replyhandler_ptr, args: alljoyn_msgarg, numargs: ULong, context: Long, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoyn_proxybusobject_parsexml(proxyobj: alljoyn_proxybusobject, xml: PCSTR, identifier: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_parsexml(proxyobj.toString(), xml.toString(), identifier.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_ref_create(proxy: alljoyn_proxybusobject): alljoyn_proxybusobject_ref =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_create(proxy.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_ref_decref(ref: alljoyn_proxybusobject_ref) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_decref(ref.toString())
    }
}

public actual fun alljoyn_proxybusobject_ref_get(ref: alljoyn_proxybusobject_ref): alljoyn_proxybusobject =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_get(ref.toString()) as String).toLong() else 0L

public actual fun alljoyn_proxybusobject_ref_incref(ref: alljoyn_proxybusobject_ref) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_ref_incref(ref.toString())
    }
}

public actual fun alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, properties: Long, numproperties: ULong, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj.toString(), iface.toString(), properties.toString(), numproperties.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_removechild(proxyobj: alljoyn_proxybusobject, path: PCSTR): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_removechild(proxyobj.toString(), path.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_secureconnection(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnection(proxyobj.toString(), forceauth) as Int) else 0

public actual fun alljoyn_proxybusobject_secureconnectionasync(proxyobj: alljoyn_proxybusobject, forceauth: Int): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_secureconnectionasync(proxyobj.toString(), forceauth) as Int) else 0

public actual fun alljoyn_proxybusobject_setproperty(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setproperty(proxyobj.toString(), iface.toString(), property.toString(), value.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_setpropertyasync(proxyobj: alljoyn_proxybusobject, iface: PCSTR, property: PCSTR, value: alljoyn_msgarg, callback: alljoyn_proxybusobject_listener_setpropertycb_ptr, timeout: UInt, context: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_setpropertyasync(proxyobj.toString(), iface.toString(), property.toString(), value.toString(), callback.toLong().toString(), timeout.toInt(), context.toString()) as Int) else 0

public actual fun alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj: alljoyn_proxybusobject, iface: PCSTR, callback: alljoyn_proxybusobject_listener_propertieschanged_ptr): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj.toString(), iface.toString(), callback.toLong().toString()) as Int) else 0

public actual fun alljoyn_routerinit(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_routerinit() as Int) else 0

public actual fun alljoyn_routerinitwithconfig(configxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_routerinitwithconfig(configxml.toString()) as Int) else 0

public actual fun alljoyn_routershutdown(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_routershutdown() as Int) else 0

public actual fun alljoyn_securityapplicationproxy_claim(proxy: alljoyn_securityapplicationproxy, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: ULong, groupauthority: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_claim(proxy.toString(), cakey.toString(), identitycertificatechain.toString(), groupid.toString(), groupsize.toString(), groupauthority.toString(), manifestsxmls.toString(), manifestscount.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml.toString(), identitycertificatepem.toString(), digest.toString(), digestsize.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_create(bus: alljoyn_busattachment, appbusname: Long, sessionid: UInt): alljoyn_securityapplicationproxy =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_create(bus.toString(), appbusname.toString(), sessionid.toInt()) as String).toLong() else 0L

public actual fun alljoyn_securityapplicationproxy_destroy(proxy: alljoyn_securityapplicationproxy) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_destroy(proxy.toString())
    }
}

public actual fun alljoyn_securityapplicationproxy_digest_destroy(digest: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_digest_destroy(digest.toString())
    }
}

public actual fun alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey.toString())
    }
}

public actual fun alljoyn_securityapplicationproxy_endmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_endmanagement(proxy.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_getapplicationstate(proxy: alljoyn_securityapplicationproxy, applicationstate: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getapplicationstate(proxy.toString(), applicationstate.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilities(proxy: alljoyn_securityapplicationproxy, capabilities: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilities(proxy.toString(), capabilities.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy: alljoyn_securityapplicationproxy, additionalinfo: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy.toString(), additionalinfo.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_getdefaultpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getdefaultpolicy(proxy.toString(), policyxml.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_geteccpublickey(proxy: alljoyn_securityapplicationproxy, eccpublickey: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_geteccpublickey(proxy.toString(), eccpublickey.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_getmanifesttemplate(proxy: alljoyn_securityapplicationproxy, manifesttemplatexml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getmanifesttemplate(proxy.toString(), manifesttemplatexml.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_getpermissionmanagementsessionport(): UShort =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpermissionmanagementsessionport() as Int).toUShort() else 0u

public actual fun alljoyn_securityapplicationproxy_getpolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_getpolicy(proxy.toString(), policyxml.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_installmembership(proxy: alljoyn_securityapplicationproxy, membershipcertificatechain: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_installmembership(proxy.toString(), membershipcertificatechain.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml.toString())
    }
}

public actual fun alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml.toString())
    }
}

public actual fun alljoyn_securityapplicationproxy_policy_destroy(policyxml: Long) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_policy_destroy(policyxml.toString())
    }
}

public actual fun alljoyn_securityapplicationproxy_reset(proxy: alljoyn_securityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_reset(proxy.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_resetpolicy(proxy: alljoyn_securityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_resetpolicy(proxy.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: ULong, signedmanifestxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml.toString(), identitycertificatepem.toString(), signature.toString(), signaturesize.toString(), signedmanifestxml.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml.toString(), identitycertificatepem.toString(), signingprivatekeypem.toString(), signedmanifestxml.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_startmanagement(proxy: alljoyn_securityapplicationproxy): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_startmanagement(proxy.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_updateidentity(proxy: alljoyn_securityapplicationproxy, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: ULong): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updateidentity(proxy.toString(), identitycertificatechain.toString(), manifestsxmls.toString(), manifestscount.toString()) as Int) else 0

public actual fun alljoyn_securityapplicationproxy_updatepolicy(proxy: alljoyn_securityapplicationproxy, policyxml: Long): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_securityapplicationproxy_updatepolicy(proxy.toString(), policyxml.toString()) as Int) else 0

public actual fun alljoyn_sessionlistener_create(callbacks: Long, context: Long): alljoyn_sessionlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_sessionlistener_destroy(listener: alljoyn_sessionlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionlistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_sessionopts_cmp(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_cmp(one.toString(), other.toString()) as Int) else 0

public actual fun alljoyn_sessionopts_create(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): alljoyn_sessionopts =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_create(traffic.toInt(), ismultipoint, proximity.toInt(), transports.toInt()) as String).toLong() else 0L

public actual fun alljoyn_sessionopts_destroy(opts: alljoyn_sessionopts) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_destroy(opts.toString())
    }
}

public actual fun alljoyn_sessionopts_get_multipoint(opts: alljoyn_sessionopts): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_multipoint(opts.toString()) as Int) else 0

public actual fun alljoyn_sessionopts_get_proximity(opts: alljoyn_sessionopts): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_proximity(opts.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_sessionopts_get_traffic(opts: alljoyn_sessionopts): UByte =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_traffic(opts.toString()) as Int).toUByte() else 0u

public actual fun alljoyn_sessionopts_get_transports(opts: alljoyn_sessionopts): UShort =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_get_transports(opts.toString()) as Int).toUShort() else 0u

public actual fun alljoyn_sessionopts_iscompatible(one: alljoyn_sessionopts, other: alljoyn_sessionopts): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_iscompatible(one.toString(), other.toString()) as Int) else 0

public actual fun alljoyn_sessionopts_set_multipoint(opts: alljoyn_sessionopts, ismultipoint: Int) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_multipoint(opts.toString(), ismultipoint)
    }
}

public actual fun alljoyn_sessionopts_set_proximity(opts: alljoyn_sessionopts, proximity: UByte) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_proximity(opts.toString(), proximity.toInt())
    }
}

public actual fun alljoyn_sessionopts_set_traffic(opts: alljoyn_sessionopts, traffic: UByte) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_traffic(opts.toString(), traffic.toInt())
    }
}

public actual fun alljoyn_sessionopts_set_transports(opts: alljoyn_sessionopts, transports: UShort) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionopts_set_transports(opts.toString(), transports.toInt())
    }
}

public actual fun alljoyn_sessionportlistener_create(callbacks: Long, context: Long): alljoyn_sessionportlistener =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_create(callbacks.toString(), context.toString()) as String).toLong() else 0L

public actual fun alljoyn_sessionportlistener_destroy(listener: alljoyn_sessionportlistener) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_sessionportlistener_destroy(listener.toString())
    }
}

public actual fun alljoyn_shutdown(): QStatus =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_shutdown() as Int) else 0

public actual fun alljoyn_unity_deferred_callbacks_process(): Int =
    if (_windowsWin32DevicesAlljoynNapiAddon != null) (_windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_unity_deferred_callbacks_process() as Int) else 0

public actual fun alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only: Int) {
    if (_windowsWin32DevicesAlljoynNapiAddon != null) {
        _windowsWin32DevicesAlljoynNapiAddon.windowssys_windows_win32_devices_alljoyn_alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only)
    }
}
