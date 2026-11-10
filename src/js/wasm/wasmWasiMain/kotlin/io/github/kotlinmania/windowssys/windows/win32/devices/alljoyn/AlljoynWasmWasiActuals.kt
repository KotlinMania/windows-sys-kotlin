@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestoread: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestowrite: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qccStatusText(status: QStatus): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: COpaquePointer?, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: COpaquePointer?, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: COpaquePointer?, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: COpaquePointer?, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: COpaquePointer?, numFields: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: COpaquePointer?, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: COpaquePointer?, num: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdatalistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAboutdatalistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: COpaquePointer?, size: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: COpaquePointer?, url: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: COpaquePointer?, csize: ULong, ownsdata: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynAboutlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: COpaquePointer?, numpaths: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: COpaquePointer?, numpaths: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynApplicationstatelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynApplicationstatelistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int, credentials: AlljoynCredentials): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: COpaquePointer?, sharedsecretsize: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerasyncCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: COpaquePointer?, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: COpaquePointer?, opts: AlljoynSessionopts): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBuslistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynBuslistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: COpaquePointer?, numentries: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: COpaquePointer?, contextIn: COpaquePointer?): AlljoynBusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: COpaquePointer?, numprops: ULong, id: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynGetbuildinfo(): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynGetnumericversion(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynGetversion(): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInit(): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: COpaquePointer?, size: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: COpaquePointer?, nummembers: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: COpaquePointer?, numprops: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynKeystorelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageDestroy(msg: AlljoynMessage): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: COpaquePointer?, args: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: COpaquePointer?): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageSetendianess(endian: Byte): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: COpaquePointer?, ab: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: COpaquePointer?, ad: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: COpaquePointer?, an: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: COpaquePointer?, ai: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: COpaquePointer?, ax: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: COpaquePointer?, aq: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: COpaquePointer?, au: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: COpaquePointer?, at: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: COpaquePointer?, ay: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: COpaquePointer?, av: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: COpaquePointer?, nummandatoryinterfaces: ULong): AlljoynObserver =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverDestroy(observer: AlljoynObserver): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynObserverlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynPermissionconfigurationlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: COpaquePointer?, manifestscount: ULong, append: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: COpaquePointer?, seriallen: ULong, issuerpublickey: COpaquePointer?, issueraki: COpaquePointer?, issuerakilen: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPinglistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynPinglistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: COpaquePointer?, numchildren: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: COpaquePointer?, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynRouterinit(): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynRouterinitwithconfig(configxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynRoutershutdown(): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, digest: COpaquePointer?, digestsize: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: COpaquePointer?, sessionid: UInt): AlljoynSecurityapplicationproxy =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signature: COpaquePointer?, signaturesize: ULong, signedmanifestxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signingprivatekeypem: COpaquePointer?, signedmanifestxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionportlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionportlistener =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynShutdown(): QStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
