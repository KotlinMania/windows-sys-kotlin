@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32DevicesAlljoynNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(serverbushandle.rawAddress.toString(), abortevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(bushandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    if (windowsWin32DevicesAlljoynNapiAddon != null) MutPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(connectionspec.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32DevicesAlljoynNapiAddon != null) MutPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), lpsecurityattributes.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: MutPtr): Bool =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(connectedbushandle.rawAddress.toString(), eventtoreset.rawAddress.toString(), eventtypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(connectedbushandle.rawAddress.toString(), eventhandle.rawAddress.toString(), eventtypes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: MutPtr, bytestoread: UInt, bytestransferred: MutPtr, reserved: MutPtr): Bool =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(connectedbushandle.rawAddress.toString(), buffer.rawAddress.toString(), bytestoread.toInt(), bytestransferred.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: ConstPtr, bytestowrite: UInt, bytestransferred: MutPtr, reserved: MutPtr): Bool =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(connectedbushandle.rawAddress.toString(), buffer.rawAddress.toString(), bytestowrite.toInt(), bytestransferred.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qccStatusText(status: QStatus): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynQccStatusText(status) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(defaultlanguage.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(arg.toString(), language.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(data.toString(), arg.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(data.toString(), aboutdataxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(data.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(data.toString(), msgarg.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(data.toString(), ajsoftwareversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(data.toString(), msgarg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: MutPtr, num: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(data.toString(), appid.rawAddress.toString(), num.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: MutPtr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(data.toString(), appname.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(data.toString(), dateofmanufacture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(data.toString(), defaultlanguage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: MutPtr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(data.toString(), description.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(data.toString(), deviceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: MutPtr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(data.toString(), devicename.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: MutPtr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(data.toString(), name.rawAddress.toString(), value.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: ConstPtr, numFields: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(data.toString(), fields.rawAddress.toString(), numFields.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(data.toString(), fieldname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(data.toString(), hardwareversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: MutPtr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(data.toString(), manufacturer.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(data.toString(), modelnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(data.toString(), softwareversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: ConstPtr, num: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(data.toString(), languagetags.rawAddress.toString(), num.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(data.toString(), supporturl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(data.toString(), fieldname.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(data.toString(), fieldname.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(data.toString(), fieldname.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(data.toString(), language.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: ConstPtr, num: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(data.toString(), appid.rawAddress.toString(), num.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(data.toString(), appid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(data.toString(), appname.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(data.toString(), dateofmanufacture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(data.toString(), defaultlanguage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(data.toString(), description.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(data.toString(), deviceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(data.toString(), devicename.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(data.toString(), name.rawAddress.toString(), value.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(data.toString(), hardwareversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(data.toString(), manufacturer.rawAddress.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(data.toString(), modelnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(data.toString(), softwareversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(data.toString(), language.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(data.toString(), supporturl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdatalistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynAboutdatalistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: ConstPtr, size: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(icon.toString(), data.rawAddress.toString(), size.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: ConstPtr, url: ConstPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(icon.toString(), type.rawAddress.toString(), url.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: MutPtr, csize: ULong, ownsdata: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(icon.toString(), type.rawAddress.toString(), data.rawAddress.toString(), csize.toString(), ownsdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(icon.toString(), arg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(icon.toString(), type.rawAddress.toString(), url.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(bus.toString(), icon.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(icon.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(bus.toString(), busname.rawAddress.toString(), sessionid.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(proxy.toString(), icon.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(proxy.toString(), version.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutlistenerCreate(callback: ConstPtr, context: ConstPtr): AlljoynAboutlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(callback.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(obj.toString(), sessionport.toInt(), aboutdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(obj.toString(), sessionport.toInt(), aboutlistener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(bus.toString(), isannounced) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(obj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(description.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(arg.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(description.toString(), arg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(description.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: ConstPtr, numpaths: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(description.toString(), interfacename.rawAddress.toString(), paths.rawAddress.toString(), numpaths.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: ConstPtr, numinterfaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(description.toString(), path.rawAddress.toString(), interfaces.rawAddress.toString(), numinterfaces.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(description.toString(), msgarg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: ConstPtr, numpaths: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(description.toString(), paths.rawAddress.toString(), numpaths.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(description.toString(), interfacename.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(description.toString(), path.rawAddress.toString(), interfacename.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(description.toString(), path.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(bus.toString(), busname.rawAddress.toString(), sessionid.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(proxy.toString(), language.rawAddress.toString(), data.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(proxy.toString(), objectdesc.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(proxy.toString(), version.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynApplicationstatelistenerCreate(callbacks: ConstPtr, context: MutPtr): AlljoynApplicationstatelistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAuthlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynAuthlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr, accept: Int, credentials: AlljoynCredentials): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(listener.toString(), authcontext.rawAddress.toString(), accept, credentials.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: ConstPtr, sharedsecretsize: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(listener.toString(), sharedsecret.rawAddress.toString(), sharedsecretsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr, accept: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(listener.toString(), authcontext.rawAddress.toString(), accept) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerasyncCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynAuthlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(autopinger.toString(), group.rawAddress.toString(), destination.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(autopinger.toString(), group.rawAddress.toString(), listener.toString(), pinginterval.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(autopinger.toString(), group.rawAddress.toString(), destination.rawAddress.toString(), removeall) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(autopinger.toString(), group.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(autopinger.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(autopinger.toString(), group.rawAddress.toString(), pinginterval.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(bus.toString(), authmechanism.rawAddress.toString(), username.rawAddress.toString(), password.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(bus.toString(), rule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(bus.toString(), name.rawAddress.toString(), transports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: MutPtr, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(bus.toString(), sessionport.rawAddress.toString(), opts.toString(), listener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(bus.toString(), name.rawAddress.toString(), transports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(bus.toString(), nameprefix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(bus.toString(), nameprefix.rawAddress.toString(), transports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(bus.toString(), implementsinterface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr, numberinterfaces: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(bus.toString(), implementsinterfaces.rawAddress.toString(), numberinterfaces.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(bus.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(bus.toString(), connectspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(applicationname.rawAddress.toString(), allowremotemessages) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(applicationname.rawAddress.toString(), allowremotemessages, concurrency.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(bus.toString(), name.rawAddress.toString(), iface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(bus.toString(), name.rawAddress.toString(), iface.rawAddress.toString(), secpolicy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(bus.toString(), xml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(applicationname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(bus.toString(), iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(bus.toString(), unused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(bus.toString(), authmechanisms.rawAddress.toString(), listener.toString(), keystorefilename.rawAddress.toString(), isshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus.toString(), authmechanisms.rawAddress.toString(), authlistener.toString(), keystorefilename.rawAddress.toString(), isshared, permissionconfigurationlistener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(bus.toString(), nameprefix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(bus.toString(), nameprefix.rawAddress.toString(), transports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(bus.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(bus.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(bus.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(bus.toString(), name.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: ConstPtr, numifaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(bus.toString(), ifaces.rawAddress.toString(), numifaces.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(bus.toString(), guid.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(bus.toString(), name.rawAddress.toString(), guid.rawAddress.toString(), guidsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(bus.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: MutPtr, opts: AlljoynSessionopts): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(bus.toString(), sessionhost.rawAddress.toString(), sessionport.toInt(), listener.toString(), sessionid.rawAddress.toString(), opts.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(bus.toString(), sessionhost.rawAddress.toString(), sessionport.toInt(), listener.toString(), opts.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(bus.toString(), sessionid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(bus.toString(), name.rawAddress.toString(), hasowner.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(bus.toString(), name.rawAddress.toString(), timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(bus.toString(), aboutlistener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(bus.toString(), listener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(bus.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(bus.toString(), obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(bus.toString(), obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(bus.toString(), listener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(bus.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(bus.toString(), rule.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(bus.toString(), sessionid.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(bus.toString(), requestedname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(bus.toString(), name.rawAddress.toString(), forceauth) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(bus.toString(), name.rawAddress.toString(), forceauth) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(bus.toString(), module.rawAddress.toString(), level.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(bus.toString(), guid.rawAddress.toString(), timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(bus.toString(), sessionid.toInt(), linktimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(bus.toString(), sessionid.toInt(), linktimeout.toInt(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(bus.toString(), sessionid.toInt(), listener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(bus.toString(), sessionport.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(bus.toString(), aboutlistener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(bus.toString(), listener.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(bus.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(bus.toString(), obj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(bus.toString(), implementsinterface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr, numberinterfaces: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(bus.toString(), implementsinterfaces.rawAddress.toString(), numberinterfaces.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBuslistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynBuslistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(bus.toString(), iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(bus.toString(), iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: MutPtr): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: ConstPtr, numentries: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(bus.toString(), entries.rawAddress.toString(), numentries.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(bus.toString(), msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(bus.toString(), serialnumber.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: ConstPtr, contextIn: ConstPtr): AlljoynBusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(path.rawAddress.toString(), isplaceholder, callbacksIn.rawAddress.toString(), contextIn.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(bus.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: ConstPtr, numprops: ULong, id: UInt) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(bus.toString(), ifcname.rawAddress.toString(), propnames.rawAddress.toString(), numprops.toString(), id.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(bus.toString(), ifcname.rawAddress.toString(), propname.rawAddress.toString(), value.toString(), id.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: ConstPtr, numinterfaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(bus.toString(), interfaces.rawAddress.toString(), numinterfaces.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(bus.toString(), buffer.rawAddress.toString(), buffersz.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(bus.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(bus.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(bus.toString(), msg.toString(), args.toString(), numargs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(bus.toString(), msg.toString(), error.rawAddress.toString(), errormessage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(bus.toString(), msg.toString(), status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(bus.toString(), iface.toString(), isannounced) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(cred.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(cred.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(cred.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(cred.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(cred.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(cred.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(cred.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(cred.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(cred.toString(), creds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(cred.toString(), certchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(cred.toString(), expiration.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(cred.toString(), logonentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(cred.toString(), pwd.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(cred.toString(), pk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(cred.toString(), username.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynGetbuildinfo(): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynGetnumericversion(): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynGetversion(): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynGetversion() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInit(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(iface.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(iface.toString(), name.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(iface.toString(), member.rawAddress.toString(), argname.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(iface.toString(), type, name.rawAddress.toString(), inputsig.rawAddress.toString(), outsig.rawAddress.toString(), argnames.rawAddress.toString(), annotation.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(iface.toString(), member.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(iface.toString(), name.rawAddress.toString(), inputsig.rawAddress.toString(), outsig.rawAddress.toString(), argnames.rawAddress.toString(), annotation.toInt(), accessperms.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(iface.toString(), name.rawAddress.toString(), signature.rawAddress.toString(), access.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(iface.toString(), property.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(iface.toString(), name.rawAddress.toString(), sig.rawAddress.toString(), argnames.rawAddress.toString(), annotation.toInt(), accessperms.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(one.toString(), other.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(iface.toString(), name.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(iface.toString(), index.toString(), name.rawAddress.toString(), nameSize.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(iface.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), arg.rawAddress.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(iface.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: ConstPtr, size: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(iface.toString(), languages.rawAddress.toString(), size.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(iface.toString(), languages.rawAddress.toString(), languagessize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(iface.toString(), name.rawAddress.toString(), member.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(iface.toString(), member.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(iface.toString(), member.rawAddress.toString(), argname.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), valueSize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: MutPtr, nummembers: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(iface.toString(), members.rawAddress.toString(), nummembers.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(iface.toString(), name.rawAddress.toString(), member.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(iface.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: MutPtr, numprops: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(iface.toString(), props.rawAddress.toString(), numprops.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(iface.toString(), name.rawAddress.toString(), property.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(iface.toString(), property.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), strSize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface.toString(), property.rawAddress.toString(), description.rawAddress.toString(), maxlanguagelength.toString(), languagetag.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(iface.toString(), name.rawAddress.toString(), member.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(iface.toString(), name.rawAddress.toString(), insig.rawAddress.toString(), outsig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(iface.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(iface.toString(), str.rawAddress.toString(), buf.toString(), indent.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(iface.toString(), member.rawAddress.toString(), argname.rawAddress.toString(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), arg.rawAddress.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(iface.toString(), description.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(iface.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(iface.toString(), language.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(iface.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(iface.toString(), member.rawAddress.toString(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface.toString(), member.rawAddress.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(iface.toString(), name.rawAddress.toString(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface.toString(), name.rawAddress.toString(), description.rawAddress.toString(), languagetag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynKeystorelistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(listener.toString(), keystore.toString(), sink.rawAddress.toString(), sinkSz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(listener.toString(), keystore.toString(), source.rawAddress.toString(), password.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: ConstPtr, context: MutPtr): AlljoynKeystorelistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(bus.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(msg.toString(), str.rawAddress.toString(), buf.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageDestroy(msg: AlljoynMessage) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(msg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(one.toString(), other.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(msg.toString(), argn.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: MutPtr, args: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(msg.toString(), numargs.rawAddress.toString(), args.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(msg.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(msg.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: MutPtr): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(msg.toString(), errormessage.rawAddress.toString(), errormessageSize.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(msg.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(msg.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(msg.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(msg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(msg.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: MutPtr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(msg.toString(), tillexpirems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(msg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(msg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMessageSetendianess(endian: Byte) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(endian.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(msg.toString(), str.rawAddress.toString(), buf.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(arg.toString(), index.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(args.toString(), numargs.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: MutPtr, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(args.toString(), numargs.rawAddress.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: MutPtr, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(args.toString(), argoffset.toString(), numargs.rawAddress.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(values.toString(), numvalues.toString(), str.rawAddress.toString(), buf.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(args.toString(), numargs.toString(), str.rawAddress.toString(), buf.toString(), indent.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(destination.toString(), source.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(source.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(lhv.toString(), rhv.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(arg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(arg.toString(), index.toString(), element.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(arg.toString(), index.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(arg.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(arg.toString(), b.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: MutPtr, ab: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(arg.toString(), length.rawAddress.toString(), ab.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(arg.toString(), d.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: MutPtr, ad: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(arg.toString(), length.rawAddress.toString(), ad.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(arg.toString(), n.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: MutPtr, an: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(arg.toString(), length.rawAddress.toString(), an.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(arg.toString(), i.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: MutPtr, ai: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(arg.toString(), length.rawAddress.toString(), ai.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(arg.toString(), x.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: MutPtr, ax: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(arg.toString(), length.rawAddress.toString(), ax.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(arg.toString(), o.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(arg.toString(), g.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(arg.toString(), s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(arg.toString(), q.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: MutPtr, aq: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(arg.toString(), length.rawAddress.toString(), aq.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(arg.toString(), u.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: MutPtr, au: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(arg.toString(), length.rawAddress.toString(), au.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(arg.toString(), t.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: MutPtr, at: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(arg.toString(), length.rawAddress.toString(), at.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(arg.toString(), y.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: MutPtr, ay: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(arg.toString(), length.rawAddress.toString(), ay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(arg.toString(), v.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: MutPtr, av: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(arg.toString(), signature.rawAddress.toString(), length.rawAddress.toString(), av.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(arg.toString(), elemsig.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(arg.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(arg.toString(), index.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(arg.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(arg.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(arg.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(arg.toString(), signature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(arg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(arg.toString(), signature.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(arg.toString(), b) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(arg.toString(), length.toString(), ab.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(arg.toString(), d) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(arg.toString(), length.toString(), ad.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(arg.toString(), n.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(arg.toString(), length.toString(), an.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(arg.toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(arg.toString(), length.toString(), ai.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(arg.toString(), x.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(arg.toString(), length.toString(), ax.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(arg.toString(), o.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: ConstPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(arg.toString(), length.toString(), ao.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(arg.toString(), g.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: ConstPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(arg.toString(), length.toString(), ag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(arg.toString(), s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: ConstPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(arg.toString(), length.toString(), asTarget.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(arg.toString(), q.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(arg.toString(), length.toString(), aq.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(arg.toString(), u.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(arg.toString(), length.toString(), au.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(arg.toString(), t.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(arg.toString(), length.toString(), at.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(arg.toString(), y.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(arg.toString(), length.toString(), ay.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(arg.toString(), key.toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(arg.toString(), structMembers.toString(), numMembers.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(arg.toString(), str.rawAddress.toString(), buf.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(arg.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(arg.toString(), str.rawAddress.toString(), buf.toString(), indent.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: ConstPtr, nummandatoryinterfaces: ULong): AlljoynObserver =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(bus.toString(), mandatoryinterfaces.rawAddress.toString(), nummandatoryinterfaces.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverDestroy(observer: AlljoynObserver) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(observer.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(observer.toString(), uniquebusname.rawAddress.toString(), objectpath.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(observer.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(observer.toString(), proxyref.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(observer.toString(), listener.toString(), triggeronexisting)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(observer.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(observer.toString(), listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynObserverlistenerCreate(callback: ConstPtr, context: ConstPtr): AlljoynObserverlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(callback.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(authmechanism.rawAddress.toString(), password.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynPermissionconfigurationlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(certificatechain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(certificateid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: MutPtr, identitycertificatechain: MutPtr, groupid: ConstPtr, groupsize: ULong, groupauthority: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(configurator.toString(), cakey.rawAddress.toString(), identitycertificatechain.rawAddress.toString(), groupid.rawAddress.toString(), groupsize.toString(), groupauthority.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(configurator.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(configurator.toString(), state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(configurator.toString(), claimcapabilities.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(configurator.toString(), policyxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(configurator.toString(), identitycertificatechain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(configurator.toString(), certificateid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(configurator.toString(), manifestarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(configurator.toString(), manifesttemplatexml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(configurator.toString(), certificateids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(configurator.toString(), policyxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(configurator.toString(), publickey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: MutPtr, manifestscount: ULong, append: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(configurator.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString(), append) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(configurator.toString(), membershipcertificatechain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(manifestarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(policyxml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(publickey.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: ConstPtr, seriallen: ULong, issuerpublickey: MutPtr, issueraki: ConstPtr, issuerakilen: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(configurator.toString(), serial.rawAddress.toString(), seriallen.toString(), issuerpublickey.rawAddress.toString(), issueraki.rawAddress.toString(), issuerakilen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(configurator.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(configurator.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(configurator.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(configurator.toString(), claimcapabilities.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator.toString(), additionalinfo.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator.toString(), manifesttemplatexml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(configurator.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(configurator.toString(), identitycertificatechain.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(configurator.toString(), policyxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPinglistenerCreate(callback: ConstPtr, context: ConstPtr): AlljoynPinglistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(callback.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(proxyobj.toString(), child.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(proxyobj.toString(), iface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(proxyobj.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(source.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(bus.toString(), service.rawAddress.toString(), path.rawAddress.toString(), sessionid.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(bus.toString(), service.rawAddress.toString(), path.rawAddress.toString(), sessionid.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(proxyobj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(proxyobj.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(proxyobj.toString(), iface.rawAddress.toString(), values.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(proxyobj.toString(), iface.rawAddress.toString(), 0L.toString(), timeout.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(proxyobj.toString(), path.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: MutPtr, numchildren: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(proxyobj.toString(), children.rawAddress.toString(), numchildren.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(proxyobj.toString(), iface.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: ConstPtr, numifaces: ULong): ULong =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(proxyobj.toString(), ifaces.rawAddress.toString(), numifaces.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(proxyobj.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), 0L.toString(), timeout.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(proxyobj.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(proxyobj.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    if (windowsWin32DevicesAlljoynNapiAddon != null) ConstPtr((windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(proxyobj.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(proxyobj.toString(), iface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(proxyobj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(proxyobj.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(proxyobj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(proxyobj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(proxyobj.toString(), ifacename.rawAddress.toString(), methodname.rawAddress.toString(), args.toString(), numargs.toString(), replymsg.toString(), timeout.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(proxyobj.toString(), ifacename.rawAddress.toString(), methodname.rawAddress.toString(), args.toString(), numargs.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr, timeout: UInt, flags: UByte): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(proxyobj.toString(), ifacename.rawAddress.toString(), methodname.rawAddress.toString(), 0L.toString(), args.toString(), numargs.toString(), context.rawAddress.toString(), timeout.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(proxyobj.toString(), xml.rawAddress.toString(), identifier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(proxy.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(ref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(ref.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(ref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: ConstPtr, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj.toString(), iface.rawAddress.toString(), properties.rawAddress.toString(), numproperties.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(proxyobj.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(proxyobj.toString(), forceauth) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(proxyobj.toString(), forceauth) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(proxyobj.toString(), iface.rawAddress.toString(), property.rawAddress.toString(), value.toString(), 0L.toString(), timeout.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj.toString(), iface.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRouterinit(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRouterinitwithconfig(configxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(configxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynRoutershutdown(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: MutPtr, identitycertificatechain: MutPtr, groupid: ConstPtr, groupsize: ULong, groupauthority: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(proxy.toString(), cakey.rawAddress.toString(), identitycertificatechain.rawAddress.toString(), groupid.rawAddress.toString(), groupsize.toString(), groupauthority.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: MutPtr, identitycertificatepem: MutPtr, digest: MutPtr, digestsize: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml.rawAddress.toString(), identitycertificatepem.rawAddress.toString(), digest.rawAddress.toString(), digestsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: MutPtr, sessionid: UInt): AlljoynSecurityapplicationproxy =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(bus.toString(), appbusname.rawAddress.toString(), sessionid.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(proxy.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(digest.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(proxy.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(proxy.toString(), applicationstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(proxy.toString(), capabilities.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy.toString(), additionalinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(proxy.toString(), policyxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(proxy.toString(), eccpublickey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(proxy.toString(), manifesttemplatexml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(proxy.toString(), policyxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(proxy.toString(), membershipcertificatechain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: MutPtr) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(policyxml.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(proxy.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(proxy.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: MutPtr, identitycertificatepem: MutPtr, signature: ConstPtr, signaturesize: ULong, signedmanifestxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml.rawAddress.toString(), identitycertificatepem.rawAddress.toString(), signature.rawAddress.toString(), signaturesize.toString(), signedmanifestxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: MutPtr, identitycertificatepem: MutPtr, signingprivatekeypem: MutPtr, signedmanifestxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml.rawAddress.toString(), identitycertificatepem.rawAddress.toString(), signingprivatekeypem.rawAddress.toString(), signedmanifestxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(proxy.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(proxy.toString(), identitycertificatechain.rawAddress.toString(), manifestsxmls.rawAddress.toString(), manifestscount.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(proxy.toString(), policyxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynSessionlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(one.toString(), other.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(traffic.toInt(), ismultipoint, proximity.toInt(), transports.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(opts.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(opts.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(opts.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(opts.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(opts.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(one.toString(), other.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(opts.toString(), ismultipoint)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(opts.toString(), proximity.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(opts.toString(), traffic.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(opts.toString(), transports.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynSessionportlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynSessionportlistener =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(callbacks.rawAddress.toString(), context.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(listener.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alljoynShutdown(): QStatus =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    if (windowsWin32DevicesAlljoynNapiAddon != null) (windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int) {
    if (windowsWin32DevicesAlljoynNapiAddon != null) {
        windowsWin32DevicesAlljoynNapiAddon.windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
