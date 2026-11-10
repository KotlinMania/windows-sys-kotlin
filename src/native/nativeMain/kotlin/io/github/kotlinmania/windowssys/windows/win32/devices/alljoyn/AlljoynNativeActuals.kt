@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection(serverbushandle?.value?.toCPointer<ByteVar>(), abortevent?.value?.toCPointer<ByteVar>())

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle(bushandle?.value?.toCPointer<ByteVar>())

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus(connectionspec?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(outbuffersize, inbuffersize, lpsecurityattributes?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents(connectedbushandle?.value?.toCPointer<ByteVar>(), eventtoreset?.value?.toCPointer<ByteVar>(), eventtypes?.value?.toCPointer<ByteVar>())

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynEventSelect(connectedbushandle?.value?.toCPointer<ByteVar>(), eventhandle?.value?.toCPointer<ByteVar>(), eventtypes)

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestoread: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus(connectedbushandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bytestoread, bytestransferred?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestowrite: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_allJoynSendToBus(connectedbushandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bytestowrite, bytestransferred?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun qccStatusText(status: QStatus): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_qccStatusText(status)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate(defaultlanguage?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty()

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(arg, language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(data.toLong(), arg, language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(data.toLong(), aboutdataxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(data.toLong())
}

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(data.toLong(), msgarg, language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(data.toLong(), ajsoftwareversion?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(data.toLong(), msgarg)

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(data.toLong(), appid?.value?.toCPointer<ByteVar>(), num?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: COpaquePointer?, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(data.toLong(), appname?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(data.toLong(), dateofmanufacture?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(data.toLong(), defaultlanguage?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: COpaquePointer?, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(data.toLong(), description?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(data.toLong(), deviceid?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: COpaquePointer?, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(data.toLong(), devicename?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: COpaquePointer?, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(data.toLong(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: COpaquePointer?, numFields: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(data.toLong(), fields?.value?.toCPointer<ByteVar>(), numFields)

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(data.toLong(), fieldname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(data.toLong(), hardwareversion?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: COpaquePointer?, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(data.toLong(), manufacturer?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(data.toLong(), modelnumber?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(data.toLong(), softwareversion?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: COpaquePointer?, num: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(data.toLong(), languagetags?.value?.toCPointer<ByteVar>(), num)

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(data.toLong(), supporturl?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(data.toLong(), fieldname?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(data.toLong(), fieldname?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(data.toLong(), fieldname?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(data.toLong(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(data.toLong(), appid?.value?.toCPointer<ByteVar>(), num)

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(data.toLong(), appid?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(data.toLong(), appname?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(data.toLong(), dateofmanufacture?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(data.toLong(), defaultlanguage?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(data.toLong(), description?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(data.toLong(), deviceid?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(data.toLong(), devicename?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(data.toLong(), name?.value?.toCPointer<ByteVar>(), value, language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(data.toLong(), hardwareversion?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(data.toLong(), manufacturer?.value?.toCPointer<ByteVar>(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(data.toLong(), modelnumber?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(data.toLong(), softwareversion?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(data.toLong(), language?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(data.toLong(), supporturl?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdatalistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAboutdatalistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(listener.toLong())
}

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(icon.toLong())
}

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate()

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(icon.toLong())
}

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: COpaquePointer?, size: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(icon.toLong(), data?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: COpaquePointer?, url: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(icon.toLong(), type?.value?.toCPointer<ByteVar>(), url?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: COpaquePointer?, csize: ULong, ownsdata: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(icon.toLong(), type?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), csize, ownsdata)

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(icon.toLong(), arg)

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(icon.toLong(), type?.value?.toCPointer<ByteVar>(), url?.value?.toCPointer<ByteVar>())

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(bus, icon.toLong())

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(icon.toLong())
}

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(bus, busname?.value?.toCPointer<ByteVar>(), sessionid)

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(proxy.toLong())
}

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(proxy.toLong(), icon.toLong())

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(proxy.toLong(), version?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynAboutlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate(callback?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(listener.toLong())
}

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(obj.toLong(), sessionport, aboutdata.toLong())

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(obj.toLong(), sessionport, aboutlistener.toLong())

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(bus, isannounced)

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(obj.toLong())
}

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(obj.toLong())

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(description.toLong())
}

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate()

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(arg)

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(description.toLong(), arg)

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(description.toLong())
}

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: COpaquePointer?, numpaths: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(description.toLong(), interfacename?.value?.toCPointer<ByteVar>(), paths?.value?.toCPointer<ByteVar>(), numpaths)

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(description.toLong(), path?.value?.toCPointer<ByteVar>(), interfaces?.value?.toCPointer<ByteVar>(), numinterfaces)

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(description.toLong(), msgarg)

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: COpaquePointer?, numpaths: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(description.toLong(), paths?.value?.toCPointer<ByteVar>(), numpaths)

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(description.toLong(), interfacename?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(description.toLong(), path?.value?.toCPointer<ByteVar>(), interfacename?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(description.toLong(), path?.value?.toCPointer<ByteVar>())

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(bus, busname?.value?.toCPointer<ByteVar>(), sessionid)

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(proxy.toLong())
}

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(proxy.toLong(), language?.value?.toCPointer<ByteVar>(), data)

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(proxy.toLong(), objectdesc)

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(proxy.toLong(), version?.value?.toCPointer<ByteVar>())

public actual fun alljoynApplicationstatelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynApplicationstatelistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(listener.toLong())
}

public actual fun alljoynAuthlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(listener)
}

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int, credentials: AlljoynCredentials): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(listener, authcontext?.value?.toCPointer<ByteVar>(), accept, credentials)

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: COpaquePointer?, sharedsecretsize: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(listener, sharedsecret?.value?.toCPointer<ByteVar>(), sharedsecretsize)

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(listener, authcontext?.value?.toCPointer<ByteVar>(), accept)

public actual fun alljoynAuthlistenerasyncCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(listener)
}

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(autopinger.toLong(), group?.value?.toCPointer<ByteVar>(), destination?.value?.toCPointer<ByteVar>())

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(autopinger.toLong(), group?.value?.toCPointer<ByteVar>(), listener.toLong(), pinginterval)
}

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(bus)

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(autopinger.toLong())
}

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(autopinger.toLong())
}

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(autopinger.toLong(), group?.value?.toCPointer<ByteVar>(), destination?.value?.toCPointer<ByteVar>(), removeall)

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(autopinger.toLong(), group?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(autopinger.toLong())
}

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(autopinger.toLong(), group?.value?.toCPointer<ByteVar>(), pinginterval)

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(bus, authmechanism?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(bus, rule?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(bus, name?.value?.toCPointer<ByteVar>(), transports)

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: COpaquePointer?, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(bus, sessionport?.value?.toCPointer<ByteVar>(), opts, listener.toLong())

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(bus, name?.value?.toCPointer<ByteVar>(), transports)

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(bus, nameprefix?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(bus, nameprefix?.value?.toCPointer<ByteVar>(), transports)

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(bus, implementsinterface?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(bus, implementsinterfaces?.value?.toCPointer<ByteVar>(), numberinterfaces)

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(bus, guid?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(bus)
}

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(bus, connectspec?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate(applicationname?.value?.toCPointer<ByteVar>(), allowremotemessages)

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency(applicationname?.value?.toCPointer<ByteVar>(), allowremotemessages, concurrency)

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(bus, name?.value?.toCPointer<ByteVar>(), iface?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(bus, name?.value?.toCPointer<ByteVar>(), iface?.value?.toCPointer<ByteVar>(), secpolicy)

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(bus, xml?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore(applicationname?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(bus, iface.toLong())

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(bus)
}

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(bus, unused?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(bus)
}

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(bus, authmechanisms?.value?.toCPointer<ByteVar>(), listener, keystorefilename?.value?.toCPointer<ByteVar>(), isshared)

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus, authmechanisms?.value?.toCPointer<ByteVar>(), authlistener, keystorefilename?.value?.toCPointer<ByteVar>(), isshared, permissionconfigurationlistener.toLong())

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(bus, nameprefix?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(bus, nameprefix?.value?.toCPointer<ByteVar>(), transports)

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(bus)

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(bus)

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(bus)

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(bus)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(bus)

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(bus)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(bus, name?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(bus, ifaces?.value?.toCPointer<ByteVar>(), numifaces)

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(bus, guid?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(bus, name?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>(), guidsz?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(bus)

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp()

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(bus)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(bus)

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(bus)

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(bus)

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(bus)

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(bus)

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: COpaquePointer?, opts: AlljoynSessionopts): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(bus, sessionhost?.value?.toCPointer<ByteVar>(), sessionport, listener.toLong(), sessionid?.value?.toCPointer<ByteVar>(), opts)

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(bus, sessionhost?.value?.toCPointer<ByteVar>(), sessionport, listener.toLong(), opts, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(bus, sessionid)

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(bus, name?.value?.toCPointer<ByteVar>(), hasowner?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(bus, name?.value?.toCPointer<ByteVar>(), timeout)

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(bus, aboutlistener.toLong())
}

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(bus, listener.toLong())

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(bus, listener.toLong())
}

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(bus, obj)

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(bus, obj)

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(bus, listener)

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(bus, name?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(bus)

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(bus, rule?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(bus, sessionid, membername?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(bus, requestedname?.value?.toCPointer<ByteVar>(), flags)

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(bus, name?.value?.toCPointer<ByteVar>(), forceauth)

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(bus, name?.value?.toCPointer<ByteVar>(), forceauth)

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(bus, module?.value?.toCPointer<ByteVar>(), level)

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(bus, guid?.value?.toCPointer<ByteVar>(), timeout)

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(bus, sessionid, linktimeout?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(bus, sessionid, linktimeout, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(bus, sessionid, listener.toLong())

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(bus)

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(bus)

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(bus, sessionport)

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(bus, aboutlistener.toLong())
}

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(bus)
}

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(bus)

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(bus, listener.toLong())

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(bus, listener.toLong())
}

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(bus, obj)
}

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(bus, implementsinterface?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(bus, implementsinterfaces?.value?.toCPointer<ByteVar>(), numberinterfaces)

public actual fun alljoynBuslistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynBuslistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(listener.toLong())
}

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(bus, iface.toLong())

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(bus, iface.toLong())

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: COpaquePointer?): QStatus =
    0

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: COpaquePointer?, numentries: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(bus, entries?.value?.toCPointer<ByteVar>(), numentries)

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(bus, msg)

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(bus, serialnumber)

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: COpaquePointer?, contextIn: COpaquePointer?): AlljoynBusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate(path?.value?.toCPointer<ByteVar>(), isplaceholder, callbacksIn?.value?.toCPointer<ByteVar>(), contextIn?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(bus)
}

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: COpaquePointer?, numprops: ULong, id: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(bus, ifcname?.value?.toCPointer<ByteVar>(), propnames?.value?.toCPointer<ByteVar>(), numprops, id)
}

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(bus, ifcname?.value?.toCPointer<ByteVar>(), propname?.value?.toCPointer<ByteVar>(), value, id)
}

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(bus, interfaces?.value?.toCPointer<ByteVar>(), numinterfaces)

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(bus)

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(bus, buffer?.value?.toCPointer<ByteVar>(), buffersz)

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(bus)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(bus)

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(bus, msg, args, numargs)

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(bus, msg, error?.value?.toCPointer<ByteVar>(), errormessage?.value?.toCPointer<ByteVar>())

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(bus, msg, status)

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(bus, iface.toLong(), isannounced)

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    0

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(cred)
}

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate()

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(cred)
}

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(cred)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(cred)

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(cred)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(cred)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(cred)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(cred)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(cred, creds)

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(cred, certchain?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(cred, expiration)
}

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(cred, logonentry?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(cred, pwd?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(cred, pk?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(cred, username?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynGetbuildinfo(): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo()?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynGetnumericversion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion()

public actual fun alljoynGetversion(): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynGetversion()?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynInit(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInit()

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(iface.toLong())
}

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(iface.toLong(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(iface.toLong(), member?.value?.toCPointer<ByteVar>(), argname?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(iface.toLong(), type, name?.value?.toCPointer<ByteVar>(), inputsig?.value?.toCPointer<ByteVar>(), outsig?.value?.toCPointer<ByteVar>(), argnames?.value?.toCPointer<ByteVar>(), annotation)

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(iface.toLong(), member?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(iface.toLong(), name?.value?.toCPointer<ByteVar>(), inputsig?.value?.toCPointer<ByteVar>(), outsig?.value?.toCPointer<ByteVar>(), argnames?.value?.toCPointer<ByteVar>(), annotation, accessperms?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(iface.toLong(), name?.value?.toCPointer<ByteVar>(), signature?.value?.toCPointer<ByteVar>(), access)

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(iface.toLong(), property?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(iface.toLong(), name?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>(), argnames?.value?.toCPointer<ByteVar>(), annotation, accessperms?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(one.toLong(), other.toLong())

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(iface.toLong(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valueSize?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(iface.toLong(), index, name?.value?.toCPointer<ByteVar>(), nameSize?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valueSize?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(iface.toLong())

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(iface.toLong(), member?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), maxlanguagelength, languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(iface.toLong(), description?.value?.toCPointer<ByteVar>(), maxlanguagelength, languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: COpaquePointer?, size: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(iface.toLong(), languages?.value?.toCPointer<ByteVar>(), size)

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(iface.toLong(), languages?.value?.toCPointer<ByteVar>(), languagessize)

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    null

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(iface.toLong(), name?.value?.toCPointer<ByteVar>(), member?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(iface.toLong(), member?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valueSize?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(iface.toLong(), member?.value?.toCPointer<ByteVar>(), argname?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), valueSize?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface.toLong(), member?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), maxlanguagelength, languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: COpaquePointer?, nummembers: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(iface.toLong(), members?.value?.toCPointer<ByteVar>(), nummembers)

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(iface.toLong(), name?.value?.toCPointer<ByteVar>(), member?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(iface.toLong())?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: COpaquePointer?, numprops: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(iface.toLong(), props?.value?.toCPointer<ByteVar>(), numprops)

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(iface.toLong(), name?.value?.toCPointer<ByteVar>(), property?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(iface.toLong(), property?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), strSize?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface.toLong(), property?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), maxlanguagelength, languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(iface.toLong())

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(iface.toLong(), name?.value?.toCPointer<ByteVar>(), member?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(iface.toLong())

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(iface.toLong(), name?.value?.toCPointer<ByteVar>(), insig?.value?.toCPointer<ByteVar>(), outsig?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(iface.toLong())

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(iface.toLong(), name?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(iface.toLong(), str?.value?.toCPointer<ByteVar>(), buf, indent)

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(iface.toLong())

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    0

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    0

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?) {
}

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    0uL

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    0

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?) {
}

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    0uL

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    0

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    0

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?) {
}

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    0uL

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(iface.toLong(), member?.value?.toCPointer<ByteVar>(), argname?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(iface.toLong(), member?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(iface.toLong(), description?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(iface.toLong(), description?.value?.toCPointer<ByteVar>(), languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(iface.toLong(), language?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface.toLong(), 0L.toCPointer<ByteVar>())
}

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(iface.toLong(), member?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface.toLong(), member?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(iface.toLong(), name?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>())

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface.toLong(), name?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), languagetag?.value?.toCPointer<ByteVar>())

public actual fun alljoynKeystorelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(listener)
}

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(listener, keystore, sink?.value?.toCPointer<ByteVar>(), sinkSz?.value?.toCPointer<ByteVar>())

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(listener, keystore, source?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>())

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(bus)

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(msg, str?.value?.toCPointer<ByteVar>(), buf)

public actual fun alljoynMessageDestroy(msg: AlljoynMessage) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(msg)
}

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(one, other)

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(msg, argn)

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: COpaquePointer?, args: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(msg, numargs?.value?.toCPointer<ByteVar>(), args?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(msg)

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(msg)

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: COpaquePointer?): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(msg, errormessage?.value?.toCPointer<ByteVar>(), errormessageSize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(msg)

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(msg)

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(msg)

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(msg)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(msg)

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(msg)

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(msg)

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(msg)

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(msg, tillexpirems?.value?.toCPointer<ByteVar>())

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(msg)

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(msg)

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(msg)

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(msg, signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMessageSetendianess(endian: Byte) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(endian)
}

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(msg, str?.value?.toCPointer<ByteVar>(), buf)

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(size)

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(arg, index)

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(args, numargs, signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(args, numargs?.value?.toCPointer<ByteVar>(), signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(args, argoffset, numargs?.value?.toCPointer<ByteVar>(), signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(values, numvalues, str?.value?.toCPointer<ByteVar>(), buf)

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(args, numargs, str?.value?.toCPointer<ByteVar>(), buf, indent)

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(arg)
}

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(destination, source)
}

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(source)

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate()

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet(signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(arg)
}

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(lhv, rhv)

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(arg, signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(arg, index, element?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(arg, index)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(arg)

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(arg, b?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: COpaquePointer?, ab: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(arg, length?.value?.toCPointer<ByteVar>(), ab?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(arg, d?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: COpaquePointer?, ad: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(arg, length?.value?.toCPointer<ByteVar>(), ad?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(arg, n?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: COpaquePointer?, an: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(arg, length?.value?.toCPointer<ByteVar>(), an?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(arg, i?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: COpaquePointer?, ai: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(arg, length?.value?.toCPointer<ByteVar>(), ai?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(arg, x?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: COpaquePointer?, ax: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(arg, length?.value?.toCPointer<ByteVar>(), ax?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(arg, o?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(arg, g?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(arg, s?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(arg, q?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: COpaquePointer?, aq: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(arg, length?.value?.toCPointer<ByteVar>(), aq?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(arg, u?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: COpaquePointer?, au: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(arg, length?.value?.toCPointer<ByteVar>(), au?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(arg, t?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: COpaquePointer?, at: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(arg, length?.value?.toCPointer<ByteVar>(), at?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(arg, y?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: COpaquePointer?, ay: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(arg, length?.value?.toCPointer<ByteVar>(), ay?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(arg, v)

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: COpaquePointer?, av: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(arg, signature?.value?.toCPointer<ByteVar>(), length?.value?.toCPointer<ByteVar>(), av?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(arg, elemsig?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(arg)

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(arg, index)

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(arg)

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(arg)

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(arg)

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(arg, signature?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(arg, signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(arg, signature?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(arg, b)

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(arg, length, ab?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(arg, d)

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(arg, length, ad?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(arg, n)

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(arg, length, an?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(arg, i)

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(arg, length, ai?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(arg, x)

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(arg, length, ax?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(arg, o?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(arg, length, ao?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(arg, g?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(arg, length, ag?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(arg, s?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(arg, length, asTarget?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(arg, q)

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(arg, length, aq?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(arg, u)

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(arg, length, au?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(arg, t)

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(arg, length, at?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(arg, y)

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(arg, length, ay?.value?.toCPointer<ByteVar>())

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(arg, key, value)

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(arg, structMembers, numMembers)

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(arg, str?.value?.toCPointer<ByteVar>(), buf)

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(arg)
}

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(arg, str?.value?.toCPointer<ByteVar>(), buf, indent)

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: COpaquePointer?, nummandatoryinterfaces: ULong): AlljoynObserver =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(bus, mandatoryinterfaces?.value?.toCPointer<ByteVar>(), nummandatoryinterfaces)

public actual fun alljoynObserverDestroy(observer: AlljoynObserver) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(observer.toLong())
}

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(observer.toLong(), uniquebusname?.value?.toCPointer<ByteVar>(), objectpath?.value?.toCPointer<ByteVar>())

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(observer.toLong())

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(observer.toLong(), proxyref)

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(observer.toLong(), listener.toLong(), triggeronexisting)
}

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(observer.toLong())
}

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(observer.toLong(), listener.toLong())
}

public actual fun alljoynObserverlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynObserverlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate(callback?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(listener.toLong())
}

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials(authmechanism?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynPermissionconfigurationlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(listener.toLong())
}

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup(certificateid?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(configurator.toLong(), cakey?.value?.toCPointer<ByteVar>(), identitycertificatechain?.value?.toCPointer<ByteVar>(), groupid?.value?.toCPointer<ByteVar>(), groupsize, groupauthority?.value?.toCPointer<ByteVar>(), manifestsxmls?.value?.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(configurator.toLong())

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(configurator.toLong(), state?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(configurator.toLong(), claimcapabilities?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator.toLong(), additionalinfo?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities()

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(configurator.toLong(), policyxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(configurator.toLong(), identitycertificatechain?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(configurator.toLong(), certificateid?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(configurator.toLong(), manifestarray?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(configurator.toLong(), manifesttemplatexml?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(configurator.toLong(), certificateids?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(configurator.toLong(), policyxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(configurator.toLong(), publickey?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: COpaquePointer?, manifestscount: ULong, append: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(configurator.toLong(), manifestsxmls?.value?.toCPointer<ByteVar>(), manifestscount, append)

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(configurator.toLong(), membershipcertificatechain?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy(policyxml?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy(publickey?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: COpaquePointer?, seriallen: ULong, issuerpublickey: COpaquePointer?, issueraki: COpaquePointer?, issuerakilen: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(configurator.toLong(), serial?.value?.toCPointer<ByteVar>(), seriallen, issuerpublickey?.value?.toCPointer<ByteVar>(), issueraki?.value?.toCPointer<ByteVar>(), issuerakilen)

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(configurator.toLong())

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(configurator.toLong())

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(configurator.toLong(), state)

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(configurator.toLong(), claimcapabilities)

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator.toLong(), additionalinfo)

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator.toLong(), manifesttemplatexml?.value?.toCPointer<ByteVar>())

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(configurator.toLong())

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(configurator.toLong(), identitycertificatechain?.value?.toCPointer<ByteVar>(), manifestsxmls?.value?.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(configurator.toLong(), policyxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynPinglistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynPinglistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate(callback?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(listener.toLong())
}

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(proxyobj, child)

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(proxyobj, iface.toLong())

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(proxyobj, name?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(source)

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(bus, service?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>(), sessionid)

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(bus, service?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>(), sessionid)

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(proxyobj)
}

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(proxyobj)
}

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(proxyobj, iface?.value?.toCPointer<ByteVar>(), values)

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(proxyobj, iface?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timeout, context?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(proxyobj, path?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: COpaquePointer?, numchildren: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(proxyobj, children?.value?.toCPointer<ByteVar>(), numchildren)

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(proxyobj, iface?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(proxyobj, ifaces?.value?.toCPointer<ByteVar>(), numifaces)

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(proxyobj)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(proxyobj, iface?.value?.toCPointer<ByteVar>(), property?.value?.toCPointer<ByteVar>(), value)

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(proxyobj, iface?.value?.toCPointer<ByteVar>(), property?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), timeout, context?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(proxyobj)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(proxyobj)

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(proxyobj)?.let { COpaquePointer(it.toLong()) }

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(proxyobj, iface?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(proxyobj)

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(proxyobj)

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(proxyobj)

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(proxyobj, ifacename?.value?.toCPointer<ByteVar>(), methodname?.value?.toCPointer<ByteVar>(), args, numargs, replymsg, timeout, flags)

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(proxyobj, ifacename?.value?.toCPointer<ByteVar>(), methodname?.value?.toCPointer<ByteVar>(), args, numargs, flags)

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(proxyobj, ifacename?.value?.toCPointer<ByteVar>(), methodname?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), args, numargs, context?.value?.toCPointer<ByteVar>(), timeout, flags)

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(proxyobj, xml?.value?.toCPointer<ByteVar>(), identifier?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(proxy)

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(ref)
}

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(ref)

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(ref)
}

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: COpaquePointer?, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj, iface?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>(), numproperties, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(proxyobj, path?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(proxyobj, iface?.value?.toCPointer<ByteVar>(), property?.value?.toCPointer<ByteVar>(), value)

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(proxyobj, iface?.value?.toCPointer<ByteVar>(), property?.value?.toCPointer<ByteVar>(), value, 0L.toCPointer<ByteVar>(), timeout, context?.value?.toCPointer<ByteVar>())

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj, iface?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun alljoynRouterinit(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynRouterinit()

public actual fun alljoynRouterinitwithconfig(configxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig(configxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynRoutershutdown(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown()

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(proxy.toLong(), cakey?.value?.toCPointer<ByteVar>(), identitycertificatechain?.value?.toCPointer<ByteVar>(), groupid?.value?.toCPointer<ByteVar>(), groupsize, groupauthority?.value?.toCPointer<ByteVar>(), manifestsxmls?.value?.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, digest: COpaquePointer?, digestsize: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml?.value?.toCPointer<ByteVar>(), identitycertificatepem?.value?.toCPointer<ByteVar>(), digest?.value?.toCPointer<ByteVar>(), digestsize?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: COpaquePointer?, sessionid: UInt): AlljoynSecurityapplicationproxy =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(bus, appbusname?.value?.toCPointer<ByteVar>(), sessionid)

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(proxy.toLong())
}

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy(digest?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(proxy.toLong())

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(proxy.toLong(), applicationstate?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(proxy.toLong(), capabilities?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy.toLong(), additionalinfo?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(proxy.toLong(), policyxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(proxy.toLong(), eccpublickey?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(proxy.toLong(), manifesttemplatexml?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport()

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(proxy.toLong(), policyxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(proxy.toLong(), membershipcertificatechain?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy(policyxml?.value?.toCPointer<ByteVar>())
}

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(proxy.toLong())

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(proxy.toLong())

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signature: COpaquePointer?, signaturesize: ULong, signedmanifestxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml?.value?.toCPointer<ByteVar>(), identitycertificatepem?.value?.toCPointer<ByteVar>(), signature?.value?.toCPointer<ByteVar>(), signaturesize, signedmanifestxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signingprivatekeypem: COpaquePointer?, signedmanifestxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml?.value?.toCPointer<ByteVar>(), identitycertificatepem?.value?.toCPointer<ByteVar>(), signingprivatekeypem?.value?.toCPointer<ByteVar>(), signedmanifestxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(proxy.toLong())

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(proxy.toLong(), identitycertificatechain?.value?.toCPointer<ByteVar>(), manifestsxmls?.value?.toCPointer<ByteVar>(), manifestscount)

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(proxy.toLong(), policyxml?.value?.toCPointer<ByteVar>())

public actual fun alljoynSessionlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(listener.toLong())
}

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(one, other)

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(traffic, ismultipoint, proximity, transports)

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(opts)
}

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(opts)

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(opts)

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(opts)

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(opts)

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(one, other)

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(opts, ismultipoint)
}

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(opts, proximity)
}

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(opts, traffic)
}

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(opts, transports)
}

public actual fun alljoynSessionportlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionportlistener =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate(callbacks?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(listener.toLong())
}

public actual fun alljoynShutdown(): QStatus =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynShutdown()

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess()

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn.cinterop.windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
}
