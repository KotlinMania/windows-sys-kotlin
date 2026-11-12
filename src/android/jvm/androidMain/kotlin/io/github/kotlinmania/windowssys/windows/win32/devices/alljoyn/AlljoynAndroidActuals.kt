@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

private object WindowsWin32DevicesAlljoynJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(serverbushandle: Long, abortevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(bushandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(connectionspec: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(outbuffersize: Int, inbuffersize: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(connectedbushandle: Long, eventtoreset: Long, eventtypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(connectedbushandle: Long, eventhandle: Long, eventtypes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(connectedbushandle: Long, buffer: Long, bytestoread: Int, bytestransferred: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(connectedbushandle: Long, buffer: Long, bytestowrite: Int, bytestransferred: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynQccStatusText(status: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(defaultlanguage: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(arg: Long, language: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(data: Long, arg: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(data: Long, aboutdataxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(data: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(data: Long, msgarg: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(data: Long, ajsoftwareversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(data: Long, msgarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(data: Long, appid: Long, num: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(data: Long, appname: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(data: Long, dateofmanufacture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(data: Long, defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(data: Long, description: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(data: Long, deviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(data: Long, devicename: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(data: Long, name: Long, value: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(data: Long, fields: Long, numFields: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(data: Long, fieldname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(data: Long, hardwareversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(data: Long, manufacturer: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(data: Long, modelnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(data: Long, softwareversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(data: Long, languagetags: Long, num: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(data: Long, supporturl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(data: Long, language: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(data: Long, appid: Long, num: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(data: Long, appid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(data: Long, appname: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(data: Long, dateofmanufacture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(data: Long, defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(data: Long, description: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(data: Long, deviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(data: Long, devicename: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(data: Long, name: Long, value: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(data: Long, hardwareversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(data: Long, manufacturer: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(data: Long, modelnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(data: Long, softwareversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(data: Long, language: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(data: Long, supporturl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(icon: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(icon: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(icon: Long, data: Long, size: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(icon: Long, type: Long, url: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(icon: Long, type: Long, data: Long, csize: Long, ownsdata: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(icon: Long, arg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(icon: Long, type: Long, url: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(bus: Long, icon: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(icon: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(bus: Long, busname: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(proxy: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(proxy: Long, icon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(proxy: Long, version: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(callback: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(obj: Long, sessionport: Short, aboutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(obj: Long, sessionport: Short, aboutlistener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(bus: Long, isannounced: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(obj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(description: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(arg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(description: Long, arg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(description: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(description: Long, interfacename: Long, paths: Long, numpaths: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(description: Long, path: Long, interfaces: Long, numinterfaces: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(description: Long, msgarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(description: Long, paths: Long, numpaths: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(description: Long, interfacename: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(description: Long, path: Long, interfacename: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(description: Long, path: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(bus: Long, busname: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(proxy: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(proxy: Long, language: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(proxy: Long, objectdesc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(proxy: Long, version: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(listener: Long, authcontext: Long, accept: Int, credentials: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(listener: Long, sharedsecret: Long, sharedsecretsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(listener: Long, authcontext: Long, accept: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(autopinger: Long, group: Long, destination: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(autopinger: Long, group: Long, listener: Long, pinginterval: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(autopinger: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(autopinger: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(autopinger: Long, group: Long, destination: Long, removeall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(autopinger: Long, group: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(autopinger: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(autopinger: Long, group: Long, pinginterval: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(bus: Long, authmechanism: Long, username: Long, password: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(bus: Long, rule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(bus: Long, name: Long, transports: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(bus: Long, sessionport: Long, opts: Long, listener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(bus: Long, name: Long, transports: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(bus: Long, nameprefix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(bus: Long, nameprefix: Long, transports: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(bus: Long, implementsinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(bus: Long, implementsinterfaces: Long, numberinterfaces: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(bus: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(bus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(bus: Long, connectspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(applicationname: Long, allowremotemessages: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(applicationname: Long, allowremotemessages: Int, concurrency: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(bus: Long, name: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(bus: Long, name: Long, iface: Long, secpolicy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(bus: Long, xml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(applicationname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(bus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(bus: Long, unused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(bus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(bus: Long, authmechanisms: Long, listener: Long, keystorefilename: Long, isshared: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: Long, authmechanisms: Long, authlistener: Long, keystorefilename: Long, isshared: Int, permissionconfigurationlistener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(bus: Long, nameprefix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(bus: Long, nameprefix: Long, transports: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(bus: Long, name: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(bus: Long, ifaces: Long, numifaces: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(bus: Long, guid: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(bus: Long, name: Long, guid: Long, guidsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(bus: Long, sessionhost: Long, sessionport: Short, listener: Long, sessionid: Long, opts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(bus: Long, sessionhost: Long, sessionport: Short, listener: Long, opts: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(bus: Long, sessionid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(bus: Long, name: Long, hasowner: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(bus: Long, name: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(bus: Long, aboutlistener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(bus: Long, listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(bus: Long, obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(bus: Long, obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(bus: Long, name: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(bus: Long, rule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(bus: Long, sessionid: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(bus: Long, requestedname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(bus: Long, name: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(bus: Long, name: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(bus: Long, module: Long, level: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(bus: Long, guid: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(bus: Long, sessionid: Int, linktimeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(bus: Long, sessionid: Int, linktimeout: Int, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(bus: Long, sessionid: Int, listener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(bus: Long, sessionport: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(bus: Long, aboutlistener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(bus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(bus: Long, listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(bus: Long, obj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(bus: Long, implementsinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(bus: Long, implementsinterfaces: Long, numberinterfaces: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(bus: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(bus: Long, msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(bus: Long, serialnumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(path: Long, isplaceholder: Int, callbacksIn: Long, contextIn: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(bus: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(bus: Long, ifcname: Long, propnames: Long, numprops: Long, id: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(bus: Long, ifcname: Long, propname: Long, value: Long, id: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(bus: Long, interfaces: Long, numinterfaces: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(bus: Long, buffer: Long, buffersz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(bus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(bus: Long, msg: Long, args: Long, numargs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(bus: Long, msg: Long, error: Long, errormessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(bus: Long, msg: Long, status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(bus: Long, iface: Long, isannounced: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(cred: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(cred: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(cred: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(cred: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(cred: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(cred: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(cred: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(cred: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(cred: Long, creds: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(cred: Long, certchain: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(cred: Long, expiration: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(cred: Long, logonentry: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(cred: Long, pwd: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(cred: Long, pk: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(cred: Long, username: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynGetversion(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(iface: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(iface: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(iface: Long, member: Long, argname: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(iface: Long, type: Int, name: Long, inputsig: Long, outsig: Long, argnames: Long, annotation: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(iface: Long, member: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(iface: Long, name: Long, inputsig: Long, outsig: Long, argnames: Long, annotation: Byte, accessperms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(iface: Long, name: Long, signature: Long, access: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(iface: Long, property: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(iface: Long, name: Long, sig: Long, argnames: Long, annotation: Byte, accessperms: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(iface: Long, name: Long, value: Long, valueSize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(iface: Long, index: Long, name: Long, nameSize: Long, value: Long, valueSize: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(iface: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(iface: Long, member: Long, arg: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(iface: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(iface: Long, languages: Long, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(iface: Long, languages: Long, languagessize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(iface: Long, member: Long, name: Long, value: Long, valueSize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(iface: Long, member: Long, argname: Long, name: Long, value: Long, valueSize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: Long, member: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(iface: Long, members: Long, nummembers: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(iface: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(iface: Long, props: Long, numprops: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(iface: Long, name: Long, property: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(iface: Long, property: Long, name: Long, value: Long, strSize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: Long, property: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(iface: Long, name: Long, insig: Long, outsig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(iface: Long, name: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(iface: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(iface: Long, member: Long, argname: Long, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(iface: Long, member: Long, arg: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(iface: Long, description: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(iface: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(iface: Long, language: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: Long, translationcallback: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(iface: Long, member: Long, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: Long, member: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(iface: Long, name: Long, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: Long, name: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(listener: Long, keystore: Long, sink: Long, sinkSz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(listener: Long, keystore: Long, source: Long, password: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(bus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(msg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(msg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(msg: Long, argn: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(msg: Long, numargs: Long, args: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(msg: Long, errormessage: Long, errormessageSize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(msg: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(msg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(msg: Long, tillexpirems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(msg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(msg: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(endian: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(msg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(args: Long, numargs: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(args: Long, numargs: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(args: Long, argoffset: Long, numargs: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(values: Long, numvalues: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(args: Long, numargs: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(arg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(destination: Long, source: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(source: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(arg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(lhv: Long, rhv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(arg: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(arg: Long, index: Long, element: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(arg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(arg: Long, b: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(arg: Long, length: Long, ab: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(arg: Long, d: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(arg: Long, length: Long, ad: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(arg: Long, n: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(arg: Long, length: Long, an: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(arg: Long, i: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(arg: Long, length: Long, ai: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(arg: Long, x: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(arg: Long, length: Long, ax: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(arg: Long, o: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(arg: Long, g: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(arg: Long, s: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(arg: Long, q: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(arg: Long, length: Long, aq: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(arg: Long, u: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(arg: Long, length: Long, au: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(arg: Long, t: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(arg: Long, length: Long, at: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(arg: Long, y: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(arg: Long, length: Long, ay: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(arg: Long, v: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(arg: Long, signature: Long, length: Long, av: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(arg: Long, elemsig: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(arg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(arg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(arg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(arg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(arg: Long, signature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(arg: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(arg: Long, signature: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(arg: Long, b: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(arg: Long, length: Long, ab: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(arg: Long, d: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(arg: Long, length: Long, ad: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(arg: Long, n: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(arg: Long, length: Long, an: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(arg: Long, i: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(arg: Long, length: Long, ai: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(arg: Long, x: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(arg: Long, length: Long, ax: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(arg: Long, o: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(arg: Long, length: Long, ao: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(arg: Long, g: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(arg: Long, length: Long, ag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(arg: Long, s: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(arg: Long, length: Long, asTarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(arg: Long, q: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(arg: Long, length: Long, aq: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(arg: Long, u: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(arg: Long, length: Long, au: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(arg: Long, t: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(arg: Long, length: Long, at: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(arg: Long, y: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(arg: Long, length: Long, ay: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(arg: Long, key: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(arg: Long, structMembers: Long, numMembers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(arg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(arg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(arg: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(bus: Long, mandatoryinterfaces: Long, nummandatoryinterfaces: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(observer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(observer: Long, uniquebusname: Long, objectpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(observer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(observer: Long, proxyref: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(observer: Long, listener: Long, triggeronexisting: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(observer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(observer: Long, listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(callback: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(authmechanism: Long, password: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(certificateid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(configurator: Long, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: Long, groupauthority: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(configurator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(configurator: Long, state: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(configurator: Long, claimcapabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities(): Short

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(configurator: Long, identitycertificatechain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(configurator: Long, certificateid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(configurator: Long, manifestarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(configurator: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(configurator: Long, certificateids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(configurator: Long, publickey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(configurator: Long, manifestsxmls: Long, manifestscount: Long, append: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(configurator: Long, membershipcertificatechain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(policyxml: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(publickey: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(configurator: Long, serial: Long, seriallen: Long, issuerpublickey: Long, issueraki: Long, issuerakilen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(configurator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(configurator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(configurator: Long, state: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(configurator: Long, claimcapabilities: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(configurator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(configurator: Long, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(callback: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(proxyobj: Long, child: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(proxyobj: Long, name: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(source: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(bus: Long, service: Long, path: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(bus: Long, service: Long, path: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(proxyobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(proxyobj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(proxyobj: Long, iface: Long, values: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(proxyobj: Long, iface: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(proxyobj: Long, path: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(proxyobj: Long, children: Long, numchildren: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(proxyobj: Long, iface: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(proxyobj: Long, ifaces: Long, numifaces: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(proxyobj: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(proxyobj: Long, iface: Long, property: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(proxyobj: Long, iface: Long, property: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(proxyobj: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(proxyobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(proxyobj: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(proxyobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(proxyobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(proxyobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(proxyobj: Long, ifacename: Long, methodname: Long, args: Long, numargs: Long, replymsg: Long, timeout: Int, flags: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(proxyobj: Long, ifacename: Long, methodname: Long, args: Long, numargs: Long, flags: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(proxyobj: Long, ifacename: Long, methodname: Long, replyfunc: Long, args: Long, numargs: Long, context: Long, timeout: Int, flags: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(proxyobj: Long, xml: Long, identifier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(proxy: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(ref: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(ref: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(ref: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: Long, iface: Long, properties: Long, numproperties: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(proxyobj: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(proxyobj: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(proxyobj: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(proxyobj: Long, iface: Long, property: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(proxyobj: Long, iface: Long, property: Long, value: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: Long, iface: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(configxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(proxy: Long, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: Long, groupauthority: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(bus: Long, appbusname: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(proxy: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(digest: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(proxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(proxy: Long, applicationstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(proxy: Long, capabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: Long, additionalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(proxy: Long, eccpublickey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(proxy: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): Short

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(proxy: Long, membershipcertificatechain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(policyxml: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(proxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(proxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: Long, signedmanifestxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(proxy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(proxy: Long, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(traffic: Byte, ismultipoint: Int, proximity: Byte, transports: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(opts: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(opts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(opts: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(opts: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(opts: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(opts: Long, ismultipoint: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(opts: Long, proximity: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(opts: Long, traffic: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(opts: Long, transports: Short)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int)
}

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynAcceptBusConnection(serverbushandle.rawAddress, abortevent.rawAddress).toUInt()

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynCloseBusHandle(bushandle.rawAddress)

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    MutPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynConnectToBus(connectionspec.rawAddress))

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): Handle =
    MutPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), lpsecurityattributes.rawAddress))

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: MutPtr<UInt>): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynEnumEvents(connectedbushandle.rawAddress, eventtoreset.rawAddress, eventtypes.rawAddress)

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynEventSelect(connectedbushandle.rawAddress, eventhandle.rawAddress, eventtypes.toInt())

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: MutPtr<CVoid>, bytestoread: UInt, bytestransferred: MutPtr<UInt>, reserved: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynReceiveFromBus(connectedbushandle.rawAddress, buffer.rawAddress, bytestoread.toInt(), bytestransferred.rawAddress, reserved.rawAddress)

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: ConstPtr<CVoid>, bytestowrite: UInt, bytestransferred: MutPtr<UInt>, reserved: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAllJoynSendToBus(connectedbushandle.rawAddress, buffer.rawAddress, bytestowrite.toInt(), bytestransferred.rawAddress, reserved.rawAddress)

public actual fun qccStatusText(status: QStatus): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynQccStatusText(status))

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreate(defaultlanguage.rawAddress)

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateEmpty()

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreateFull(arg, language.rawAddress)

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefrommsgarg(data, arg, language.rawAddress)

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataCreatefromxml(data, aboutdataxml.rawAddress)

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataDestroy(data)
}

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetaboutdata(data, msgarg, language.rawAddress)

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetajsoftwareversion(data, ajsoftwareversion.rawAddress)

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetannouncedaboutdata(data, msgarg)

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: MutPtr<MutPtr<UByte>>, num: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappid(data, appid.rawAddress, num.rawAddress)

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetappname(data, appname.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdateofmanufacture(data, dateofmanufacture.rawAddress)

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdefaultlanguage(data, defaultlanguage.rawAddress)

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdescription(data, description.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdeviceid(data, deviceid.rawAddress)

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetdevicename(data, devicename.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: MutPtr<AlljoynMsgarg>, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfield(data, name.rawAddress, value.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: ConstPtr<ConstPtr<Byte>>, numFields: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfields(data, fields.rawAddress, numFields.toLong()).toULong()

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetfieldsignature(data, fieldname.rawAddress))

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGethardwareversion(data, hardwareversion.rawAddress)

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: MutPtr<MutPtr<Byte>>, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmanufacturer(data, manufacturer.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetmodelnumber(data, modelnumber.rawAddress)

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsoftwareversion(data, softwareversion.rawAddress)

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: ConstPtr<ConstPtr<Byte>>, num: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupportedlanguages(data, languagetags.rawAddress, num.toLong()).toULong()

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataGetsupporturl(data, supporturl.rawAddress)

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldannounced(data, fieldname.rawAddress).toUByte()

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldlocalized(data, fieldname.rawAddress).toUByte()

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsfieldrequired(data, fieldname.rawAddress).toUByte()

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataIsvalid(data, language.rawAddress).toUByte()

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: ConstPtr<UByte>, num: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappid(data, appid.rawAddress, num.toLong())

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappidFromstring(data, appid.rawAddress)

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetappname(data, appname.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdateofmanufacture(data, dateofmanufacture.rawAddress)

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdefaultlanguage(data, defaultlanguage.rawAddress)

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdescription(data, description.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdeviceid(data, deviceid.rawAddress)

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetdevicename(data, devicename.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetfield(data, name.rawAddress, value, language.rawAddress)

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSethardwareversion(data, hardwareversion.rawAddress)

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmanufacturer(data, manufacturer.rawAddress, language.rawAddress)

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetmodelnumber(data, modelnumber.rawAddress)

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsoftwareversion(data, softwareversion.rawAddress)

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupportedlanguage(data, language.rawAddress)

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdataSetsupporturl(data, supporturl.rawAddress)

public actual fun alljoynAboutdatalistenerCreate(callbacks: ConstPtr<AlljoynAboutdatalistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynAboutdatalistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutdatalistenerDestroy(listener)
}

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonClear(icon)
}

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonCreate()

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonDestroy(icon)
}

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: ConstPtr<ConstPtr<UByte>>, size: MutPtr<ULong>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGetcontent(icon, data.rawAddress, size.rawAddress)
}

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: ConstPtr<ConstPtr<Byte>>, url: ConstPtr<ConstPtr<Byte>>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonGeturl(icon, type.rawAddress, url.rawAddress)
}

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: MutPtr<UByte>, csize: ULong, ownsdata: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontent(icon, type.rawAddress, data.rawAddress, csize.toLong(), ownsdata.toByte())

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSetcontentFrommsgarg(icon, arg)

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonSeturl(icon, type.rawAddress, url.rawAddress)

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjCreate(bus, icon)

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonobjDestroy(icon)
}

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyCreate(bus, busname.rawAddress, sessionid.toInt())

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyDestroy(proxy)
}

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGeticon(proxy, icon)

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAbouticonproxyGetversion(proxy, version.rawAddress)

public actual fun alljoynAboutlistenerCreate(callback: ConstPtr<AlljoynAboutlistenerCallback>, context: ConstPtr<CVoid>): AlljoynAboutlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerCreate(callback.rawAddress, context.rawAddress)

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutlistenerDestroy(listener)
}

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounce(obj, sessionport.toShort(), aboutdata)

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjAnnounceUsingDatalistener(obj, sessionport.toShort(), aboutlistener)

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjCreate(bus, isannounced)

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjDestroy(obj)
}

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjUnannounce(obj)

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionClear(description)
}

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreate()

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreateFull(arg)

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionCreatefrommsgarg(description, arg)

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionDestroy(description)
}

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: ConstPtr<ConstPtr<Byte>>, numpaths: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfacepaths(description, interfacename.rawAddress, paths.rawAddress, numpaths.toLong()).toULong()

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: ConstPtr<ConstPtr<Byte>>, numinterfaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetinterfaces(description, path.rawAddress, interfaces.rawAddress, numinterfaces.toLong()).toULong()

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetmsgarg(description, msgarg)

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: ConstPtr<ConstPtr<Byte>>, numpaths: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionGetpaths(description, paths.rawAddress, numpaths.toLong()).toULong()

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterface(description, interfacename.rawAddress).toUByte()

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHasinterfaceatpath(description, path.rawAddress, interfacename.rawAddress).toUByte()

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutobjectdescriptionHaspath(description, path.rawAddress).toUByte()

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyCreate(bus, busname.rawAddress, sessionid.toInt())

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyDestroy(proxy)
}

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetaboutdata(proxy, language.rawAddress, data)

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetobjectdescription(proxy, objectdesc)

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAboutproxyGetversion(proxy, version.rawAddress)

public actual fun alljoynApplicationstatelistenerCreate(callbacks: ConstPtr<AlljoynApplicationstatelistenerCallbacks>, context: MutPtr<CVoid>): AlljoynApplicationstatelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynApplicationstatelistenerDestroy(listener)
}

public actual fun alljoynAuthlistenerCreate(callbacks: ConstPtr<AlljoynAuthlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynAuthlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerDestroy(listener)
}

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr<CVoid>, accept: Int, credentials: AlljoynCredentials): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerRequestcredentialsresponse(listener, authcontext.rawAddress, accept, credentials)

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: ConstPtr<UByte>, sharedsecretsize: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerSetsharedsecret(listener, sharedsecret.rawAddress, sharedsecretsize.toLong())

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr<CVoid>, accept: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerVerifycredentialsresponse(listener, authcontext.rawAddress, accept)

public actual fun alljoynAuthlistenerasyncCreate(callbacks: ConstPtr<AlljoynAuthlistenerasyncCallbacks>, context: ConstPtr<CVoid>): AlljoynAuthlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAuthlistenerasyncDestroy(listener)
}

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAdddestination(autopinger, group.rawAddress, destination.rawAddress)

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerAddpinggroup(autopinger, group.rawAddress, listener, pinginterval.toInt())
}

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerCreate(bus)

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerDestroy(autopinger)
}

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerPause(autopinger)
}

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovedestination(autopinger, group.rawAddress, destination.rawAddress, removeall)

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerRemovepinggroup(autopinger, group.rawAddress)
}

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerResume(autopinger)
}

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynAutopingerSetpinginterval(autopinger, group.rawAddress, pinginterval.toInt())

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddlogonentry(bus, authmechanism.rawAddress, username.rawAddress, password.rawAddress)

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAddmatch(bus, rule.rawAddress)

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentAdvertisename(bus, name.rawAddress, transports.toShort())

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: MutPtr<UShort>, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentBindsessionport(bus, sessionport.rawAddress, opts, listener)

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCanceladvertisename(bus, name.rawAddress, transports.toShort())

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisedname(bus, nameprefix.rawAddress)

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelfindadvertisednamebytransport(bus, nameprefix.rawAddress, transports.toShort())

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterface(bus, implementsinterface.rawAddress)

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr<ConstPtr<Byte>>, numberinterfaces: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCancelwhoimplementsInterfaces(bus, implementsinterfaces.rawAddress, numberinterfaces.toLong())

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeys(bus, guid.rawAddress)

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentClearkeystore(bus)
}

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentConnect(bus, connectspec.rawAddress)

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreate(applicationname.rawAddress, allowremotemessages)

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateConcurrency(applicationname.rawAddress, allowremotemessages, concurrency.toInt())

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr<AlljoynInterfacedescription>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterface(bus, name.rawAddress, iface.rawAddress)

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr<AlljoynInterfacedescription>, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfaceSecure(bus, name.rawAddress, iface.rawAddress, secpolicy)

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentCreateinterfacesfromxml(bus, xml.rawAddress)

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeletedefaultkeystore(applicationname.rawAddress)

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDeleteinterface(bus, iface)

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDestroy(bus)
}

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentDisconnect(bus, unused.rawAddress)

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnableconcurrentcallbacks(bus)
}

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecurity(bus, authmechanisms.rawAddress, listener, keystorefilename.rawAddress, isshared)

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus, authmechanisms.rawAddress, authlistener, keystorefilename.rawAddress, isshared, permissionconfigurationlistener)

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisedname(bus, nameprefix.rawAddress)

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentFindadvertisednamebytransport(bus, nameprefix.rawAddress, transports.toShort())

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoyndebugobj(bus)

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetalljoynproxyobj(bus)

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconcurrency(bus).toUInt()

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetconnectspec(bus))

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetdbusproxyobj(bus)

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetglobalguidstring(bus))

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterface(bus, name.rawAddress)

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: ConstPtr<AlljoynInterfacedescription>, numifaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetinterfaces(bus, ifaces.rawAddress, numifaces.toLong()).toULong()

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: MutPtr<UInt>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetkeyexpiration(bus, guid.rawAddress, timeout.rawAddress)

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpeerguid(bus, name.rawAddress, guid.rawAddress, guidsz.rawAddress)

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetpermissionconfigurator(bus)

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGettimestamp().toUInt()

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentGetuniquename(bus))

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsconnected(bus)

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIspeersecurityenabled(bus)

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstarted(bus)

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentIsstopping(bus)

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoin(bus)

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: MutPtr<UInt>, opts: AlljoynSessionopts): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsession(bus, sessionhost.rawAddress, sessionport.toShort(), listener, sessionid.rawAddress, opts)

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentJoinsessionasync(bus, sessionhost.rawAddress, sessionport.toShort(), listener, opts, 0L, context.rawAddress)

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentLeavesession(bus, sessionid.toInt())

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentNamehasowner(bus, name.rawAddress, hasowner.rawAddress)

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentPing(bus, name.rawAddress, timeout.toInt())

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisteraboutlistener(bus, aboutlistener)
}

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterapplicationstatelistener(bus, listener)

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbuslistener(bus, listener)
}

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobject(bus, obj)

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterbusobjectSecure(bus, obj)

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRegisterkeystorelistener(bus, listener)

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReleasename(bus, name.rawAddress)

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentReloadkeystore(bus)

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovematch(bus, rule.rawAddress)

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRemovesessionmember(bus, sessionid.toInt(), membername.rawAddress)

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentRequestname(bus, requestedname.rawAddress, flags.toInt())

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnection(bus, name.rawAddress, forceauth)

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSecureconnectionasync(bus, name.rawAddress, forceauth)

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetdaemondebug(bus, module.rawAddress, level.toInt())

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetkeyexpiration(bus, guid.rawAddress, timeout.toInt())

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: MutPtr<UInt>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeout(bus, sessionid.toInt(), linktimeout.rawAddress)

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetlinktimeoutasync(bus, sessionid.toInt(), linktimeout.toInt(), 0L, context.rawAddress)

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentSetsessionlistener(bus, sessionid.toInt(), listener)

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStart(bus)

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentStop(bus)

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnbindsessionport(bus, sessionport.toShort())

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisteraboutlistener(bus, aboutlistener)
}

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallaboutlisteners(bus)
}

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterallhandlers(bus)

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterapplicationstatelistener(bus, listener)

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbuslistener(bus, listener)
}

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentUnregisterbusobject(bus, obj)
}

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterface(bus, implementsinterface.rawAddress)

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr<ConstPtr<Byte>>, numberinterfaces: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusattachmentWhoimplementsInterfaces(bus, implementsinterfaces.rawAddress, numberinterfaces.toLong())

public actual fun alljoynBuslistenerCreate(callbacks: ConstPtr<AlljoynBuslistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynBuslistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBuslistenerDestroy(listener)
}

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterface(bus, iface)

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddinterfaceAnnounced(bus, iface)

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: MutPtr<CVoid>): QStatus =
    0

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: ConstPtr<AlljoynBusobjectMethodentry>, numentries: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectAddmethodhandlers(bus, entries.rawAddress, numentries.toLong())

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessage(bus, msg)

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCancelsessionlessmessageSerial(bus, serialnumber.toInt())

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: ConstPtr<AlljoynBusobjectCallbacks>, contextIn: ConstPtr<CVoid>): AlljoynBusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectCreate(path.rawAddress, isplaceholder, callbacksIn.rawAddress, contextIn.rawAddress)

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectDestroy(bus)
}

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: ConstPtr<ConstPtr<Byte>>, numprops: ULong, id: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertieschanged(bus, ifcname.rawAddress, propnames.rawAddress, numprops.toLong(), id.toInt())
}

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectEmitpropertychanged(bus, ifcname.rawAddress, propname.rawAddress, value, id.toInt())
}

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: ConstPtr<ConstPtr<Byte>>, numinterfaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetannouncedinterfacenames(bus, interfaces.rawAddress, numinterfaces.toLong()).toULong()

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetbusattachment(bus)

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetname(bus, buffer.rawAddress, buffersz.toLong()).toULong()

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectGetpath(bus))

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectIssecure(bus)

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyArgs(bus, msg, args, numargs.toLong())

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyErr(bus, msg, error.rawAddress, errormessage.rawAddress)

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectMethodreplyStatus(bus, msg, status)

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynBusobjectSetannounceflag(bus, iface, isannounced)

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    0

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsClear(cred)
}

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsCreate()

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsDestroy(cred)
}

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetcertchain(cred))

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetexpiration(cred).toUInt()

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetlogonentry(cred))

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetpassword(cred))

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetprivateKey(cred))

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsGetusername(cred))

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsIsset(cred, creds.toShort())

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetcertchain(cred, certchain.rawAddress)
}

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetexpiration(cred, expiration.toInt())
}

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetlogonentry(cred, logonentry.rawAddress)
}

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetpassword(cred, pwd.rawAddress)
}

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetprivatekey(cred, pk.rawAddress)
}

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynCredentialsSetusername(cred, username.rawAddress)
}

public actual fun alljoynGetbuildinfo(): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynGetbuildinfo())

public actual fun alljoynGetnumericversion(): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynGetnumericversion().toUInt()

public actual fun alljoynGetversion(): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynGetversion())

public actual fun alljoynInit(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInit()

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionActivate(iface)
}

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddannotation(iface, name.rawAddress, value.rawAddress)

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddargannotation(iface, member.rawAddress, argname.rawAddress, name.rawAddress, value.rawAddress)

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmember(iface, type, name.rawAddress, inputsig.rawAddress, outsig.rawAddress, argnames.rawAddress, annotation.toByte())

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmemberannotation(iface, member.rawAddress, name.rawAddress, value.rawAddress)

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddmethod(iface, name.rawAddress, inputsig.rawAddress, outsig.rawAddress, argnames.rawAddress, annotation.toByte(), accessperms.rawAddress)

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddproperty(iface, name.rawAddress, signature.rawAddress, access.toByte())

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddpropertyannotation(iface, property.rawAddress, name.rawAddress, value.rawAddress)

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionAddsignal(iface, name.rawAddress, sig.rawAddress, argnames.rawAddress, annotation.toByte(), accessperms.rawAddress)

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionEql(one, other)

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotation(iface, name.rawAddress, value.rawAddress, valueSize.rawAddress)

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationatindex(iface, index.toLong(), name.rawAddress, nameSize.rawAddress, value.rawAddress, valueSize.rawAddress)
}

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetannotationscount(iface).toULong()

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetargdescriptionforlanguage(iface, member.rawAddress, arg.rawAddress, description.rawAddress, maxlanguagelength.toLong(), languagetag.rawAddress).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionforlanguage(iface, description.rawAddress, maxlanguagelength.toLong(), languagetag.rawAddress).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: ConstPtr<ConstPtr<Byte>>, size: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages(iface, languages.rawAddress, size.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetdescriptionlanguages2(iface, languages.rawAddress, languagessize.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    null

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmember(iface, name.rawAddress, member.rawAddress)

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberannotation(iface, member.rawAddress, name.rawAddress, value.rawAddress, valueSize.rawAddress)

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberargannotation(iface, member.rawAddress, argname.rawAddress, name.rawAddress, value.rawAddress, valueSize.rawAddress)

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface, member.rawAddress, description.rawAddress, maxlanguagelength.toLong(), languagetag.rawAddress).toULong()

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: MutPtr<AlljoynInterfacedescriptionMember>, nummembers: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmembers(iface, members.rawAddress, nummembers.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetmethod(iface, name.rawAddress, member.rawAddress)

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetname(iface))

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: MutPtr<AlljoynInterfacedescriptionProperty>, numprops: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperties(iface, props.rawAddress, numprops.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: MutPtr<AlljoynInterfacedescriptionProperty>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetproperty(iface, name.rawAddress, property.rawAddress)

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: MutPtr<ULong>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertyannotation(iface, property.rawAddress, name.rawAddress, value.rawAddress, strSize.rawAddress)

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface, property.rawAddress, description.rawAddress, maxlanguagelength.toLong(), languagetag.rawAddress).toULong()

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsecuritypolicy(iface)

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr<AlljoynInterfacedescriptionMember>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionGetsignal(iface, name.rawAddress, member.rawAddress)

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasdescription(iface)

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasmember(iface, name.rawAddress, insig.rawAddress, outsig.rawAddress)

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperties(iface)

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionHasproperty(iface, name.rawAddress)

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIntrospect(iface, str.rawAddress, buf.toLong(), indent.toLong()).toULong()

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionIssecure(iface)

public actual fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int =
    0

public actual fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    0

public actual fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>) {
}

public actual fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong =
    0uL

public actual fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    0

public actual fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>) {
}

public actual fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong =
    0uL

public actual fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int =
    0

public actual fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: MutPtr<ULong>): Int =
    0

public actual fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: MutPtr<ULong>, value: Pcstr, valueSize: MutPtr<ULong>) {
}

public actual fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong =
    0uL

public actual fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescription(iface, member.rawAddress, argname.rawAddress, description.rawAddress)

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetargdescriptionforlanguage(iface, member.rawAddress, arg.rawAddress, description.rawAddress, languagetag.rawAddress)

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescription(iface, description.rawAddress)
}

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionforlanguage(iface, description.rawAddress, languagetag.rawAddress)

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptionlanguage(iface, language.rawAddress)
}

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetdescriptiontranslationcallback(iface, 0L)
}

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescription(iface, member.rawAddress, description.rawAddress)

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface, member.rawAddress, description.rawAddress, languagetag.rawAddress)

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescription(iface, name.rawAddress, description.rawAddress)

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface, name.rawAddress, description.rawAddress, languagetag.rawAddress)

public actual fun alljoynKeystorelistenerCreate(callbacks: ConstPtr<AlljoynKeystorelistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynKeystorelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerDestroy(listener)
}

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerGetkeys(listener, keystore, sink.rawAddress, sinkSz.rawAddress)

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerPutkeys(listener, keystore, source.rawAddress, password.rawAddress)

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: ConstPtr<AlljoynKeystorelistenerWithSynchronizationCallbacks>, context: MutPtr<CVoid>): AlljoynKeystorelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynKeystorelistenerWithSynchronizationCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageCreate(bus)

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageDescription(msg, str.rawAddress, buf.toLong()).toULong()

public actual fun alljoynMessageDestroy(msg: AlljoynMessage) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageDestroy(msg)
}

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageEql(one, other)

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetarg(msg, argn.toLong())

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: MutPtr<ULong>, args: MutPtr<AlljoynMsgarg>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetargs(msg, numargs.rawAddress, args.rawAddress)
}

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetauthmechanism(msg))

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcallserial(msg).toUInt()

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetcompressiontoken(msg).toUInt()

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetdestination(msg))

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: MutPtr<ULong>): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGeterrorname(msg, errormessage.rawAddress, errormessageSize.rawAddress))

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetflags(msg).toUByte()

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetinterface(msg))

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetmembername(msg))

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetobjectpath(msg))

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreceiveendpointname(msg))

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetreplyserial(msg).toUInt()

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsender(msg))

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsessionid(msg).toUInt()

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGetsignature(msg))

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettimestamp(msg).toUInt()

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageGettype(msg)

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsbroadcastsignal(msg)

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsencrypted(msg)

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: MutPtr<UInt>): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsexpired(msg, tillexpirems.rawAddress)

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsglobalbroadcast(msg)

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIssessionless(msg)

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageIsunreliable(msg)

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageParseargs(msg, signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMessageSetendianess(endian: Byte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageSetendianess(endian)
}

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMessageTostring(msg, str.rawAddress, buf.toLong()).toULong()

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayCreate(size.toLong())

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayElement(arg, index.toLong())

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayGet(args, numargs.toLong(), signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: MutPtr<ULong>, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySet(args, numargs.rawAddress, signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: MutPtr<ULong>, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySetOffset(args, argoffset.toLong(), numargs.rawAddress, signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArraySignature(values, numvalues.toLong(), str.rawAddress, buf.toLong()).toULong()

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargArrayTostring(args, numargs.toLong(), str.rawAddress, buf.toLong(), indent.toLong()).toULong()

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClear(arg)
}

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargClone(destination, source)
}

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCopy(source)

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreate()

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargCreateAndSet(signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargDestroy(arg)
}

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargEqual(lhv, rhv)

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGet(arg, signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: MutPtr<AlljoynMsgarg>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElement(arg, index.toLong(), element.rawAddress)
}

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayElementsignature(arg, index.toLong()))

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetArrayNumberofelements(arg).toULong()

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBool(arg, b.rawAddress)

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: MutPtr<ULong>, ab: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetBoolArray(arg, length.rawAddress, ab.rawAddress)

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: MutPtr<Double>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDouble(arg, d.rawAddress)

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: MutPtr<ULong>, ad: MutPtr<Double>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetDoubleArray(arg, length.rawAddress, ad.rawAddress)

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: MutPtr<Short>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16(arg, n.rawAddress)

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, an: MutPtr<Short>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt16Array(arg, length.rawAddress, an.rawAddress)

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32(arg, i.rawAddress)

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ai: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt32Array(arg, length.rawAddress, ai.rawAddress)

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: MutPtr<Long>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64(arg, x.rawAddress)

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ax: MutPtr<Long>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetInt64Array(arg, length.rawAddress, ax.rawAddress)

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetObjectpath(arg, o.rawAddress)

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetSignature(arg, g.rawAddress)

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetString(arg, s.rawAddress)

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16(arg, q.rawAddress)

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, aq: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint16Array(arg, length.rawAddress, aq.rawAddress)

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: MutPtr<UInt>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32(arg, u.rawAddress)

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, au: MutPtr<UInt>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint32Array(arg, length.rawAddress, au.rawAddress)

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64(arg, t.rawAddress)

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, at: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint64Array(arg, length.rawAddress, at.rawAddress)

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: MutPtr<UByte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8(arg, y.rawAddress)

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: MutPtr<ULong>, ay: MutPtr<UByte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetUint8Array(arg, length.rawAddress, ay.rawAddress)

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariant(arg, v)

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: MutPtr<ULong>, av: MutPtr<AlljoynMsgarg>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetVariantArray(arg, signature.rawAddress, length.rawAddress, av.rawAddress)

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetdictelement(arg, elemsig.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetkey(arg)

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetmember(arg, index.toLong())

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetnummembers(arg).toULong()

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGettype(arg)

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargGetvalue(arg)

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargHassignature(arg, signature.rawAddress)

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSet(arg, signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetAndStabilize(arg, signature.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBool(arg, b)

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetBoolArray(arg, length.toLong(), ab.rawAddress)

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDouble(arg, d)

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: MutPtr<Double>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetDoubleArray(arg, length.toLong(), ad.rawAddress)

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16(arg, n)

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: MutPtr<Short>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt16Array(arg, length.toLong(), an.rawAddress)

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32(arg, i)

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: MutPtr<Int>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt32Array(arg, length.toLong(), ai.rawAddress)

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64(arg, x)

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: MutPtr<Long>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetInt64Array(arg, length.toLong(), ax.rawAddress)

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpath(arg, o.rawAddress)

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: ConstPtr<ConstPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetObjectpathArray(arg, length.toLong(), ao.rawAddress)

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignature(arg, g.rawAddress)

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: ConstPtr<ConstPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetSignatureArray(arg, length.toLong(), ag.rawAddress)

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetString(arg, s.rawAddress)

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: ConstPtr<ConstPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetStringArray(arg, length.toLong(), asTarget.rawAddress)

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16(arg, q.toShort())

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint16Array(arg, length.toLong(), aq.rawAddress)

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32(arg, u.toInt())

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: MutPtr<UInt>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint32Array(arg, length.toLong(), au.rawAddress)

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64(arg, t.toLong())

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint64Array(arg, length.toLong(), at.rawAddress)

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8(arg, y.toByte())

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: MutPtr<UByte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetUint8Array(arg, length.toLong(), ay.rawAddress)

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetdictentry(arg, key, value)

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSetstruct(arg, structMembers, numMembers.toLong())

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargSignature(arg, str.rawAddress, buf.toLong()).toULong()

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargStabilize(arg)
}

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynMsgargTostring(arg, str.rawAddress, buf.toLong(), indent.toLong()).toULong()

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: ConstPtr<ConstPtr<Byte>>, nummandatoryinterfaces: ULong): AlljoynObserver =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverCreate(bus, mandatoryinterfaces.rawAddress, nummandatoryinterfaces.toLong())

public actual fun alljoynObserverDestroy(observer: AlljoynObserver) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverDestroy(observer)
}

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGet(observer, uniquebusname.rawAddress, objectpath.rawAddress)

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetfirst(observer)

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverGetnext(observer, proxyref)

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverRegisterlistener(observer, listener, triggeronexisting)
}

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisteralllisteners(observer)
}

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverUnregisterlistener(observer, listener)
}

public actual fun alljoynObserverlistenerCreate(callback: ConstPtr<AlljoynObserverlistenerCallback>, context: ConstPtr<CVoid>): AlljoynObserverlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerCreate(callback.rawAddress, context.rawAddress)

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynObserverlistenerDestroy(listener)
}

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPasswordmanagerSetcredentials(authmechanism.rawAddress, password.rawAddress)

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: ConstPtr<AlljoynPermissionconfigurationlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynPermissionconfigurationlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfigurationlistenerDestroy(listener)
}

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificatechainDestroy(certificatechain.rawAddress)
}

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: MutPtr<AlljoynCertificateid>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidCleanup(certificateid.rawAddress)
}

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: MutPtr<AlljoynCertificateidarray>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray.rawAddress)
}

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorClaim(configurator, cakey.rawAddress, identitycertificatechain.rawAddress, groupid.rawAddress, groupsize.toLong(), groupauthority.rawAddress, manifestsxmls.rawAddress, manifestscount.toLong())

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorEndmanagement(configurator)

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: MutPtr<AlljoynApplicationstate>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetapplicationstate(configurator, state.rawAddress)

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilities(configurator, claimcapabilities.rawAddress)

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator, additionalinfo.rawAddress)

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultclaimcapabilities().toUShort()

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetdefaultpolicy(configurator, policyxml.rawAddress)

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentity(configurator, identitycertificatechain.rawAddress)

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: MutPtr<AlljoynCertificateid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetidentitycertificateid(configurator, certificateid.rawAddress)

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: MutPtr<AlljoynManifestarray>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifests(configurator, manifestarray.rawAddress)

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmanifesttemplate(configurator, manifesttemplatexml.rawAddress)

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: MutPtr<AlljoynCertificateidarray>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetmembershipsummaries(configurator, certificateids.rawAddress)

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpolicy(configurator, policyxml.rawAddress)

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorGetpublickey(configurator, publickey.rawAddress)

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong, append: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmanifests(configurator, manifestsxmls.rawAddress, manifestscount.toLong(), append)

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: MutPtr<Byte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorInstallmembership(configurator, membershipcertificatechain.rawAddress)

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: MutPtr<AlljoynManifestarray>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifestarrayCleanup(manifestarray.rawAddress)
}

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml.rawAddress)
}

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPolicyDestroy(policyxml.rawAddress)
}

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorPublickeyDestroy(publickey.rawAddress)
}

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: ConstPtr<UByte>, seriallen: ULong, issuerpublickey: MutPtr<Byte>, issueraki: ConstPtr<UByte>, issuerakilen: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorRemovemembership(configurator, serial.rawAddress, seriallen.toLong(), issuerpublickey.rawAddress, issueraki.rawAddress, issuerakilen.toLong())

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorReset(configurator)

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorResetpolicy(configurator)

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetapplicationstate(configurator, state)

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilities(configurator, claimcapabilities.toShort())

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator, additionalinfo.toShort())

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr<Byte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator, manifesttemplatexml.rawAddress)

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorStartmanagement(configurator)

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdateidentity(configurator, identitycertificatechain.rawAddress, manifestsxmls.rawAddress, manifestscount.toLong())

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr<Byte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPermissionconfiguratorUpdatepolicy(configurator, policyxml.rawAddress)

public actual fun alljoynPinglistenerCreate(callback: ConstPtr<AlljoynPinglistenerCallback>, context: ConstPtr<CVoid>): AlljoynPinglistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerCreate(callback.rawAddress, context.rawAddress)

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynPinglistenerDestroy(listener)
}

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddchild(proxyobj, child)

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterface(proxyobj, iface)

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectAddinterfaceByName(proxyobj, name.rawAddress)

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCopy(source)

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreate(bus, service.rawAddress, path.rawAddress, sessionid.toInt())

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectCreateSecure(bus, service.rawAddress, path.rawAddress, sessionid.toInt())

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectDestroy(proxyobj)
}

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectEnablepropertycaching(proxyobj)
}

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallproperties(proxyobj, iface.rawAddress, values)

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetallpropertiesasync(proxyobj, iface.rawAddress, 0L, timeout.toInt(), context.rawAddress)

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchild(proxyobj, path.rawAddress)

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: MutPtr<AlljoynProxybusobject>, numchildren: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetchildren(proxyobj, children.rawAddress, numchildren.toLong()).toULong()

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterface(proxyobj, iface.rawAddress)

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: ConstPtr<AlljoynInterfacedescription>, numifaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetinterfaces(proxyobj, ifaces.rawAddress, numifaces.toLong()).toULong()

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpath(proxyobj))

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetproperty(proxyobj, iface.rawAddress, property.rawAddress, value)

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetpropertyasync(proxyobj, iface.rawAddress, property.rawAddress, 0L, timeout.toInt(), context.rawAddress)

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetservicename(proxyobj))

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetsessionid(proxyobj).toUInt()

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    ConstPtr(WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectGetuniquename(proxyobj))

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectImplementsinterface(proxyobj, iface.rawAddress)

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobject(proxyobj)

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIntrospectremoteobjectasync(proxyobj, 0L, context.rawAddress)

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIssecure(proxyobj)

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectIsvalid(proxyobj)

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcall(proxyobj, ifacename.rawAddress, methodname.rawAddress, args, numargs.toLong(), replymsg, timeout.toInt(), flags.toByte())

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallNoreply(proxyobj, ifacename.rawAddress, methodname.rawAddress, args, numargs.toLong(), flags.toByte())

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr<CVoid>, timeout: UInt, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectMethodcallasync(proxyobj, ifacename.rawAddress, methodname.rawAddress, 0L, args, numargs.toLong(), context.rawAddress, timeout.toInt(), flags.toByte())

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr<CVoid>, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectParsexml(proxyobj, xml.rawAddress, identifier.rawAddress)

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefCreate(proxy)

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefDecref(ref)
}

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefGet(ref)

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRefIncref(ref)
}

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: ConstPtr<ConstPtr<Byte>>, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj, iface.rawAddress, properties.rawAddress, numproperties.toLong(), 0L, context.rawAddress)

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectRemovechild(proxyobj, path.rawAddress)

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnection(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSecureconnectionasync(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetproperty(proxyobj, iface.rawAddress, property.rawAddress, value)

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: MutPtr<CVoid>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectSetpropertyasync(proxyobj, iface.rawAddress, property.rawAddress, value, 0L, timeout.toInt(), context.rawAddress)

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj, iface.rawAddress, 0L)

public actual fun alljoynRouterinit(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynRouterinit()

public actual fun alljoynRouterinitwithconfig(configxml: MutPtr<Byte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynRouterinitwithconfig(configxml.rawAddress)

public actual fun alljoynRoutershutdown(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynRoutershutdown()

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: MutPtr<Byte>, identitycertificatechain: MutPtr<Byte>, groupid: ConstPtr<UByte>, groupsize: ULong, groupauthority: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyClaim(proxy, cakey.rawAddress, identitycertificatechain.rawAddress, groupid.rawAddress, groupsize.toLong(), groupauthority.rawAddress, manifestsxmls.rawAddress, manifestscount.toLong())

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, digest: MutPtr<MutPtr<UByte>>, digestsize: MutPtr<ULong>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml.rawAddress, identitycertificatepem.rawAddress, digest.rawAddress, digestsize.rawAddress)

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: MutPtr<Byte>, sessionid: UInt): AlljoynSecurityapplicationproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyCreate(bus, appbusname.rawAddress, sessionid.toInt())

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDestroy(proxy)
}

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: MutPtr<UByte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyDigestDestroy(digest.rawAddress)
}

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey.rawAddress)
}

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyEndmanagement(proxy)

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: MutPtr<AlljoynApplicationstate>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetapplicationstate(proxy, applicationstate.rawAddress)

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilities(proxy, capabilities.rawAddress)

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: MutPtr<UShort>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy, additionalinfo.rawAddress)

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetdefaultpolicy(proxy, policyxml.rawAddress)

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGeteccpublickey(proxy, eccpublickey.rawAddress)

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetmanifesttemplate(proxy, manifesttemplatexml.rawAddress)

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpermissionmanagementsessionport().toUShort()

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyGetpolicy(proxy, policyxml.rawAddress)

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: MutPtr<Byte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyInstallmembership(proxy, membershipcertificatechain.rawAddress)

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml.rawAddress)
}

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml.rawAddress)
}

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: MutPtr<Byte>) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyPolicyDestroy(policyxml.rawAddress)
}

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyReset(proxy)

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyResetpolicy(proxy)

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signature: ConstPtr<UByte>, signaturesize: ULong, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml.rawAddress, identitycertificatepem.rawAddress, signature.rawAddress, signaturesize.toLong(), signedmanifestxml.rawAddress)

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: MutPtr<Byte>, identitycertificatepem: MutPtr<Byte>, signingprivatekeypem: MutPtr<Byte>, signedmanifestxml: MutPtr<MutPtr<Byte>>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml.rawAddress, identitycertificatepem.rawAddress, signingprivatekeypem.rawAddress, signedmanifestxml.rawAddress)

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyStartmanagement(proxy)

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: MutPtr<Byte>, manifestsxmls: MutPtr<MutPtr<Byte>>, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdateidentity(proxy, identitycertificatechain.rawAddress, manifestsxmls.rawAddress, manifestscount.toLong())

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: MutPtr<Byte>): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSecurityapplicationproxyUpdatepolicy(proxy, policyxml.rawAddress)

public actual fun alljoynSessionlistenerCreate(callbacks: ConstPtr<AlljoynSessionlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionlistenerDestroy(listener)
}

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCmp(one, other)

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsCreate(traffic.toByte(), ismultipoint, proximity.toByte(), transports.toShort())

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsDestroy(opts)
}

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetMultipoint(opts)

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetProximity(opts).toUByte()

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTraffic(opts).toUByte()

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsGetTransports(opts).toUShort()

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsIscompatible(one, other)

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetMultipoint(opts, ismultipoint)
}

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetProximity(opts, proximity.toByte())
}

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTraffic(opts, traffic.toByte())
}

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionoptsSetTransports(opts, transports.toShort())
}

public actual fun alljoynSessionportlistenerCreate(callbacks: ConstPtr<AlljoynSessionportlistenerCallbacks>, context: ConstPtr<CVoid>): AlljoynSessionportlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerCreate(callbacks.rawAddress, context.rawAddress)

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynSessionportlistenerDestroy(listener)
}

public actual fun alljoynShutdown(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynShutdown()

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynUnityDeferredCallbacksProcess()

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssysWindowsWin32DevicesAlljoynAlljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
}
