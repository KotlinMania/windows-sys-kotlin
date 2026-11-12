@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection")

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle")

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus")

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus")

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents")

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect")

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: MutPtr<CVoid>, bytestoread: UInt, bytestransferred: MutPtr<UInt>, reserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus")

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: ConstPtr<CVoid>, bytestowrite: UInt, bytestransferred: MutPtr<UInt>, reserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus")

public actual fun qccStatusText(status: QStatus): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynQccStatusText")

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty(): Long

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty()

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull")

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg")

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(data: Long): Unit

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(data)

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata")

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(data: Long, msgarg: Long): Int

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(data, msgarg)

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: MutPtr<MutPtr<UByte>>, num: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid")

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname")

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture")

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage")

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription")

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid")

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename")

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: MutPtr<AlljoynMsgarg>, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield")

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: ConstPtr<ConstPtr<Byte>>, numFields: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields")

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature")

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion")

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer")

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber")

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion")

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: ConstPtr<ConstPtr<Byte>>, num: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages")

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl")

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced")

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized")

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired")

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid")

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: ConstPtr<UByte>, num: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid")

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring")

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname")

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture")

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage")

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription")

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid")

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename")

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield")

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion")

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer")

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber")

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion")

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage")

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl")

public actual fun alljoynAboutdatalistenerCreate(callbacks: ConstPtr<AlljoynAboutdatalistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynAboutdatalistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(listener: Long): Unit

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(icon: Long): Unit

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(icon)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate(): Long

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(icon: Long): Unit

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(icon)

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: ConstPtr<ConstPtr<UByte>>, size: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent")

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: ConstPtr<ConstPtr<Byte>>, url: ConstPtr<ConstPtr<Byte>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl")

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: MutPtr<UByte>, csize: ULong, ownsdata: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(icon: Long, arg: Long): Int

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(icon, arg)

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(bus: Long, icon: Long): Long

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(bus, icon)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(icon: Long): Unit

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(icon)

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(proxy: Long): Unit

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(proxy)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(proxy: Long, icon: Long): Int

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(proxy, icon)

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion")

public actual fun alljoynAboutlistenerCreate(callback: ConstPtr<AlljoynAboutlistenerCallback>, context: ConstPtr<CVoid>): AlljoynAboutlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(listener: Long): Unit

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(obj: Long, sessionport: Int, aboutdata: Long): Int

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(obj, sessionport.toInt(), aboutdata)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(obj: Long, sessionport: Int, aboutlistener: Long): Int

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(obj, sessionport.toInt(), aboutlistener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(bus: Long, isannounced: Int): Long

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(bus, isannounced)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(obj: Long): Unit

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(obj)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(obj: Long): Int

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(obj)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(description: Long): Unit

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(description)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate(): Long

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(arg: Long): Long

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(arg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(description: Long, arg: Long): Int

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(description, arg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(description: Long): Unit

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(description)

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: ConstPtr<ConstPtr<Byte>>, numpaths: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths")

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: ConstPtr<ConstPtr<Byte>>, numinterfaces: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(description: Long, msgarg: Long): Int

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(description, msgarg)

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: ConstPtr<ConstPtr<Byte>>, numpaths: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths")

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface")

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath")

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath")

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(proxy: Long): Unit

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(proxy)

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(proxy: Long, objectdesc: Long): Int

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(proxy, objectdesc)

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion")

public actual fun alljoynApplicationstatelistenerCreate(callbacks: ConstPtr<AlljoynApplicationstatelistenerCallbacks>, context: MutPtr<CVoid>): AlljoynApplicationstatelistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(listener: Long): Unit

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(listener)

public actual fun alljoynAuthlistenerCreate(callbacks: ConstPtr<AlljoynAuthlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynAuthlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(listener: Long): Unit

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(listener)

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr<CVoid>, accept: Int, credentials: AlljoynCredentials): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse")

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: ConstPtr<UByte>, sharedsecretsize: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret")

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr<CVoid>, accept: Int): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse")

public actual fun alljoynAuthlistenerasyncCreate(callbacks: ConstPtr<AlljoynAuthlistenerasyncCallbacks>, context: ConstPtr<CVoid>): AlljoynAuthlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(listener: Long): Unit

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(listener)

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination")

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(bus: Long): Long

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(autopinger: Long): Unit

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(autopinger)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(autopinger: Long): Unit

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(autopinger)

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination")

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(autopinger: Long): Unit

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(autopinger)

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval")

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry")

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch")

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename")

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: MutPtr<UShort>, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport")

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename")

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname")

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport")

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface")

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr<ConstPtr<Byte>>, numberinterfaces: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces")

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(bus: Long): Unit

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(bus)

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect")

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate")

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency")

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr<AlljoynInterfacedescription>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface")

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr<AlljoynInterfacedescription>, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure")

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml")

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(bus: Long, iface: Long): Int

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(bus, iface)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(bus: Long): Unit

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(bus)

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(bus: Long): Unit

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(bus)

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity")

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener")

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname")

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(bus: Long): Long

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(bus: Long): Long

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(bus: Long): Int

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(bus).toUInt()

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(bus: Long): Long

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(bus)

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring")

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface")

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: ConstPtr<AlljoynInterfacedescription>, numifaces: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces")

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: MutPtr<UInt>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration")

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(bus: Long): Long

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp(): Int

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp().toUInt()

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(bus: Long): Int

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(bus: Long): Int

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(bus: Long): Int

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(bus: Long): Int

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(bus: Long): Int

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(bus)

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: MutPtr<UInt>, opts: AlljoynSessionopts): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession")

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(bus: Long, sessionid: Int): Int

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(bus, sessionid.toInt())

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner")

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(bus: Long, aboutlistener: Long): Unit

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(bus, aboutlistener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(bus: Long, listener: Long): Int

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(bus, listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(bus: Long, listener: Long): Unit

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(bus, listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(bus: Long, obj: Long): Int

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(bus, obj)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(bus: Long, obj: Long): Int

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(bus, obj)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(bus: Long, listener: Long): Int

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(bus, listener)

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegistersignalhandler")

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegistersignalhandlerwithrule")

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(bus: Long): Int

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(bus)

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch")

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember")

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname")

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection")

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync")

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug")

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration")

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: MutPtr<UInt>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout")

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(bus: Long, sessionid: Int, listener: Long): Int

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(bus, sessionid.toInt(), listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(bus: Long): Int

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(bus: Long): Int

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(bus: Long, sessionport: Int): Int

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(bus, sessionport.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(bus: Long, aboutlistener: Long): Unit

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(bus, aboutlistener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(bus: Long): Unit

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(bus: Long): Int

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(bus: Long, listener: Long): Int

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(bus, listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(bus: Long, listener: Long): Unit

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(bus, listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(bus: Long, obj: Long): Unit

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(bus, obj)

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregistersignalhandler")

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregistersignalhandlerwithrule")

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface")

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr<ConstPtr<Byte>>, numberinterfaces: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces")

public actual fun alljoynBuslistenerCreate(callbacks: ConstPtr<AlljoynBuslistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynBuslistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(listener: Long): Unit

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(bus: Long, iface: Long): Int

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(bus, iface)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(bus: Long, iface: Long): Int

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(bus, iface)

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandler")

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: ConstPtr<AlljoynBusobjectMethodentry>, numentries: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(bus: Long, msg: Long): Int

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(bus, msg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(bus: Long, serialnumber: Int): Int

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(bus, serialnumber.toInt())

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: ConstPtr<AlljoynBusobjectCallbacks>, contextIn: ConstPtr<CVoid>): AlljoynBusobject =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(bus: Long): Unit

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(bus)

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: ConstPtr<ConstPtr<Byte>>, numprops: ULong, id: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged")

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged")

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: ConstPtr<ConstPtr<Byte>>, numinterfaces: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(bus: Long): Long

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(bus)

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname")

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(bus: Long): Int

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(bus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(bus: Long, msg: Long, args: Long, numargs: Long): Int

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(bus, msg, args, numargs.toLong())

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(bus: Long, msg: Long, status: Int): Int

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(bus, msg, status)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(bus: Long, iface: Long, isannounced: Int): Int

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(bus, iface, isannounced)

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSignal")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(cred: Long): Unit

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(cred)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate(): Long

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(cred: Long): Unit

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(cred)

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(cred: Long): Int

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(cred).toUInt()

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry")

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword")

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey")

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(cred: Long, creds: Int): Int

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(cred, creds.toInt())

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(cred: Long, expiration: Int): Unit

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(cred, expiration.toInt())

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry")

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword")

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey")

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername")

public actual fun alljoynGetbuildinfo(): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion(): Int

public actual fun alljoynGetnumericversion(): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion().toUInt()

public actual fun alljoynGetversion(): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynGetversion")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInit")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInit(): Int

public actual fun alljoynInit(): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInit()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(iface: Long): Unit

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(iface)

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation")

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation")

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember")

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation")

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod")

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty")

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation")

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(one: Long, other: Long): Int

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(one, other)

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation")

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(iface: Long): Long

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(iface).toULong()

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage")

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: ConstPtr<ConstPtr<Byte>>, size: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2")

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback")

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember")

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation")

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation")

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage")

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: MutPtr<AlljoynInterfacedescriptionMember>, nummembers: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers")

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod")

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname")

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: MutPtr<AlljoynInterfacedescriptionProperty>, numprops: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties")

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: MutPtr<AlljoynInterfacedescriptionProperty>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty")

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation")

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(iface: Long): Int

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(iface)

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(iface: Long): Int

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(iface)

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(iface: Long): Int

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(iface)

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty")

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(iface: Long): Int

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(iface)

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberEql")

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberGetannotation")

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberGetannotationatindex")

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberGetannotationscount")

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberGetargannotation")

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberGetargannotationatindex")

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionMemberGetargannotationscount")

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionPropertyEql")

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionPropertyGetannotation")

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionPropertyGetannotationatindex")

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionPropertyGetannotationscount")

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription")

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage")

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription")

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage")

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage")

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback")

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription")

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage")

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription")

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage")

public actual fun alljoynKeystorelistenerCreate(callbacks: ConstPtr<AlljoynKeystorelistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynKeystorelistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(listener: Long): Unit

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(listener)

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys")

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys")

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: ConstPtr<AlljoynKeystorelistenerWithSynchronizationCallbacks>, context: MutPtr<CVoid>): AlljoynKeystorelistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(bus: Long): Long

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(bus)

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(msg: Long): Unit

public actual fun alljoynMessageDestroy(msg: AlljoynMessage): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(msg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(one: Long, other: Long): Int

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(one, other)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(msg: Long, argn: Long): Long

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(msg, argn.toLong())

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: MutPtr<ULong>, args: MutPtr<AlljoynMsgarg>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs")

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(msg: Long): Int

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(msg).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(msg: Long): Int

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(msg).toUInt()

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination")

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: MutPtr<ULong>): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(msg: Long): Int

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(msg).toUByte()

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface")

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername")

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath")

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(msg: Long): Int

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(msg).toUInt()

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(msg: Long): Int

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(msg).toUInt()

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(msg: Long): Int

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(msg).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(msg: Long): Int

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(msg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(msg: Long): Int

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(msg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(msg: Long): Int

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(msg)

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(msg: Long): Int

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(msg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(msg: Long): Int

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(msg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(msg: Long): Int

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(msg)

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(endian: Int): Unit

public actual fun alljoynMessageSetendianess(endian: Byte): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(endian.toInt())

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(size: Long): Long

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(size.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(arg: Long, index: Long): Long

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(arg, index.toLong())

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet")

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: MutPtr<ULong>, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet")

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: MutPtr<ULong>, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset")

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature")

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(arg: Long): Unit

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(arg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(destination: Long, source: Long): Unit

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(destination, source)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(source: Long): Long

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(source)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate(): Long

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate()

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(arg: Long): Unit

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(arg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(lhv: Long, rhv: Long): Int

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(lhv, rhv)

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet")

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: MutPtr<AlljoynMsgarg>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement")

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(arg: Long): Long

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(arg).toULong()

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool")

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: MutPtr<ULong>, ab: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray")

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: MutPtr<Double>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble")

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: MutPtr<ULong>, ad: MutPtr<Double>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray")

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: MutPtr<Short>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16")

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, an: MutPtr<Short>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array")

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32")

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ai: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array")

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: MutPtr<Long>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64")

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ax: MutPtr<Long>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array")

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath")

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature")

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString")

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16")

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, aq: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array")

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: MutPtr<UInt>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32")

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, au: MutPtr<UInt>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array")

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64")

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, at: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array")

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: MutPtr<UByte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8")

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ay: MutPtr<UByte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(arg: Long, v: Long): Int

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(arg, v)

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: MutPtr<ULong>, av: MutPtr<AlljoynMsgarg>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray")

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(arg: Long): Long

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(arg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(arg: Long, index: Long): Long

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(arg, index.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(arg: Long): Long

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(arg).toULong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(arg: Long): Int

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(arg)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(arg: Long): Long

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(arg)

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature")

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet")

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(arg: Long, b: Int): Int

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(arg, b)

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(arg: Long, d: Double): Int

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(arg, d)

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: MutPtr<Double>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(arg: Long, n: Int): Int

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(arg, n.toInt())

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: MutPtr<Short>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(arg: Long, i: Int): Int

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(arg, i)

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: MutPtr<Int>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(arg: Long, x: Long): Int

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(arg, x)

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: MutPtr<Long>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array")

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath")

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: ConstPtr<ConstPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray")

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature")

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: ConstPtr<ConstPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray")

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString")

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: ConstPtr<ConstPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(arg: Long, q: Int): Int

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(arg, q.toInt())

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(arg: Long, u: Int): Int

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(arg, u.toInt())

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: MutPtr<UInt>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(arg: Long, t: Long): Int

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(arg, t.toLong())

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(arg: Long, y: Int): Int

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(arg, y.toInt())

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: MutPtr<UByte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(arg: Long, key: Long, value: Long): Int

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(arg, key, value)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(arg: Long, structMembers: Long, numMembers: Long): Int

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(arg, structMembers, numMembers.toLong())

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(arg: Long): Unit

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(arg)

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring")

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: ConstPtr<ConstPtr<Byte>>, nummandatoryinterfaces: ULong): AlljoynObserver =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(observer: Long): Unit

public actual fun alljoynObserverDestroy(observer: AlljoynObserver): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(observer)

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(observer: Long): Long

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(observer)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(observer: Long, proxyref: Long): Long

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(observer, proxyref)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(observer: Long, listener: Long, triggeronexisting: Int): Unit

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(observer, listener, triggeronexisting)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(observer: Long): Unit

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(observer)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(observer: Long, listener: Long): Unit

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(observer, listener)

public actual fun alljoynObserverlistenerCreate(callback: ConstPtr<AlljoynObserverlistenerCallback>, context: ConstPtr<CVoid>): AlljoynObserverlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(listener: Long): Unit

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(listener)

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials")

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: ConstPtr<AlljoynPermissionconfigurationlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynPermissionconfigurationlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(listener: Long): Unit

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(listener)

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy")

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: MutPtr<AlljoynCertificateid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup")

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: MutPtr<AlljoynCertificateidarray>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup")

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(configurator: Long): Int

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(configurator)

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: MutPtr<AlljoynApplicationstate>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities(): Int

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities().toUShort()

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy")

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity")

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: MutPtr<AlljoynCertificateid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid")

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: MutPtr<AlljoynManifestarray>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests")

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate")

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: MutPtr<AlljoynCertificateidarray>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries")

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy")

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey")

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong, append: Int): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests")

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: MutPtr<Byte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership")

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: MutPtr<AlljoynManifestarray>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup")

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy")

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy")

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy")

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: ConstPtr<UByte>, seriallen: ULong, issuerpublickey: MutPtr<Byte>, issueraki: ConstPtr<UByte>, issuerakilen: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(configurator: Long): Int

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(configurator)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(configurator: Long): Int

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(configurator)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(configurator: Long, state: Int): Int

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(configurator, state)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(configurator: Long, claimcapabilities: Int): Int

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(configurator, claimcapabilities.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Int): Int

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator, additionalinfo.toInt())

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr<Byte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(configurator: Long): Int

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(configurator)

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity")

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<Byte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy")

public actual fun alljoynPinglistenerCreate(callback: ConstPtr<AlljoynPinglistenerCallback>, context: ConstPtr<CVoid>): AlljoynPinglistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(listener: Long): Unit

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(proxyobj: Long, child: Long): Int

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(proxyobj, child)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(proxyobj: Long, iface: Long): Int

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(proxyobj, iface)

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(source: Long): Long

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(source)

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate")

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(proxyobj: Long): Unit

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(proxyobj)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(proxyobj: Long): Unit

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(proxyobj)

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties")

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync")

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild")

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: MutPtr<AlljoynProxybusobject>, numchildren: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren")

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface")

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: ConstPtr<AlljoynInterfacedescription>, numifaces: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces")

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath")

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty")

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync")

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(proxyobj: Long): Int

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(proxyobj).toUInt()

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename")

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(proxyobj: Long): Int

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(proxyobj)

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(proxyobj: Long): Int

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(proxyobj)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(proxyobj: Long): Int

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(proxyobj)

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall")

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallMember")

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallMemberNoreply")

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply")

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr<CVoid>, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync")

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr<CVoid>, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasyncMember")

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(proxy: Long): Long

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(proxy)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(ref: Long): Unit

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(ref)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(ref: Long): Long

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(ref)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(ref: Long): Unit

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(ref)

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: ConstPtr<ConstPtr<Byte>>, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener")

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(proxyobj: Long, forceauth: Int): Int

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(proxyobj, forceauth)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(proxyobj: Long, forceauth: Int): Int

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty")

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync")

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynRouterinit(): Int

public actual fun alljoynRouterinit(): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynRouterinit()

public actual fun alljoynRouterinitwithconfig(configxml: MutPtr<Byte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown(): Int

public actual fun alljoynRoutershutdown(): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown()

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim")

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, digest: MutPtr<MutPtr<UByte>>, digestsize: MutPtr<ULong>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest")

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: MutPtr<Byte>, sessionid: UInt): AlljoynSecurityapplicationproxy =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(proxy: Long): Unit

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(proxy)

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy")

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(proxy: Long): Int

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(proxy)

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: MutPtr<AlljoynApplicationstate>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: MutPtr<UShort>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo")

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy")

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey")

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): Int

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport().toUShort()

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy")

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: MutPtr<Byte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership")

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy")

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy")

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(proxy: Long): Int

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(proxy)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(proxy: Long): Int

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(proxy)

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signature: ConstPtr<UByte>, signaturesize: ULong, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature")

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signingprivatekeypem: MutPtr<Byte>, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(proxy: Long): Int

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(proxy)

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity")

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<Byte>): QStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy")

public actual fun alljoynSessionlistenerCreate(callbacks: ConstPtr<AlljoynSessionlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(listener: Long): Unit

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(one: Long, other: Long): Int

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(one, other)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(traffic: Int, ismultipoint: Int, proximity: Int, transports: Int): Long

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(traffic.toInt(), ismultipoint, proximity.toInt(), transports.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(opts: Long): Unit

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(opts)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(opts: Long): Int

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(opts)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(opts: Long): Int

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(opts).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(opts: Long): Int

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(opts).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(opts: Long): Int

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(opts).toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(one: Long, other: Long): Int

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(one, other)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(opts: Long, ismultipoint: Int): Unit

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(opts, ismultipoint)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(opts: Long, proximity: Int): Unit

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(opts, proximity.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(opts: Long, traffic: Int): Unit

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(opts, traffic.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(opts: Long, transports: Int): Unit

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(opts, transports.toInt())

public actual fun alljoynSessionportlistenerCreate(callbacks: ConstPtr<AlljoynSessionportlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionportlistener =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(listener: Long): Unit

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(listener)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynShutdown")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynShutdown(): Int

public actual fun alljoynShutdown(): QStatus =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynShutdown()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess(): Int

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly")
private external fun wasiWindowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int): Unit

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int): Unit =
    wasiWindowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
