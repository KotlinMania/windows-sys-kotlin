@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32DevicesAlljoynJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection(serverbushandle: Long, abortevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle(bushandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus(connectionspec: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(outbuffersize: Int, inbuffersize: Int, lpsecurityattributes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents(connectedbushandle: Long, eventtoreset: Long, eventtypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynEventSelect(connectedbushandle: Long, eventhandle: Long, eventtypes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus(connectedbushandle: Long, buffer: Long, bytestoread: Int, bytestransferred: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_allJoynSendToBus(connectedbushandle: Long, buffer: Long, bytestowrite: Int, bytestransferred: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_qccStatusText(status: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate(defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(arg: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(data: Long, arg: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(data: Long, aboutdataxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(data: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(data: Long, msgarg: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(data: Long, ajsoftwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(data: Long, msgarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(data: Long, appid: Long, num: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(data: Long, appname: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(data: Long, dateofmanufacture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(data: Long, defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(data: Long, description: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(data: Long, deviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(data: Long, devicename: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(data: Long, name: Long, value: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(data: Long, fields: Long, numFields: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(data: Long, fieldname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(data: Long, hardwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(data: Long, manufacturer: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(data: Long, modelnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(data: Long, softwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(data: Long, languagetags: Long, num: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(data: Long, supporturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(data: Long, fieldname: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(data: Long, language: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(data: Long, appid: Long, num: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(data: Long, appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(data: Long, appname: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(data: Long, dateofmanufacture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(data: Long, defaultlanguage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(data: Long, description: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(data: Long, deviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(data: Long, devicename: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(data: Long, name: Long, value: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(data: Long, hardwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(data: Long, manufacturer: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(data: Long, modelnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(data: Long, softwareversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(data: Long, language: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(data: Long, supporturl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate(callbacks: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(icon: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(icon: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(icon: Long, data: Long, size: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(icon: Long, type: Long, url: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(icon: Long, type: Long, data: Long, csize: Long, ownsdata: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(icon: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(icon: Long, type: Long, url: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(bus: Long, icon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(icon: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(bus: Long, busname: Long, sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(proxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(proxy: Long, icon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(proxy: Long, version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate(callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(obj: Long, sessionport: Short, aboutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(obj: Long, sessionport: Short, aboutlistener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(bus: Long, isannounced: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(obj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(description: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(description: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(description: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(description: Long, interfacename: Long, paths: Long, numpaths: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(description: Long, path: Long, interfaces: Long, numinterfaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(description: Long, msgarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(description: Long, paths: Long, numpaths: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(description: Long, interfacename: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(description: Long, path: Long, interfacename: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(description: Long, path: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(bus: Long, busname: Long, sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(proxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(proxy: Long, language: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(proxy: Long, objectdesc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(proxy: Long, version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate(callbacks: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(listener: Long, authcontext: Long, accept: Int, credentials: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(listener: Long, sharedsecret: Long, sharedsecretsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(listener: Long, authcontext: Long, accept: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(autopinger: Long, group: Long, destination: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(autopinger: Long, group: Long, listener: Long, pinginterval: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(autopinger: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(autopinger: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(autopinger: Long, group: Long, destination: Long, removeall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(autopinger: Long, group: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(autopinger: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(autopinger: Long, group: Long, pinginterval: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(bus: Long, authmechanism: Long, username: Long, password: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(bus: Long, rule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(bus: Long, name: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(bus: Long, sessionport: Long, opts: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(bus: Long, name: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(bus: Long, nameprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(bus: Long, nameprefix: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(bus: Long, implementsinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(bus: Long, implementsinterfaces: Long, numberinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(bus: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(bus: Long, connectspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate(applicationname: Long, allowremotemessages: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency(applicationname: Long, allowremotemessages: Int, concurrency: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(bus: Long, name: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(bus: Long, name: Long, iface: Long, secpolicy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(bus: Long, xml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore(applicationname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(bus: Long, unused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(bus: Long, authmechanisms: Long, listener: Long, keystorefilename: Long, isshared: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: Long, authmechanisms: Long, authlistener: Long, keystorefilename: Long, isshared: Int, permissionconfigurationlistener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(bus: Long, nameprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(bus: Long, nameprefix: Long, transports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(bus: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(bus: Long, ifaces: Long, numifaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(bus: Long, guid: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(bus: Long, name: Long, guid: Long, guidsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(bus: Long, sessionhost: Long, sessionport: Short, listener: Long, sessionid: Long, opts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(bus: Long, sessionhost: Long, sessionport: Short, listener: Long, opts: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(bus: Long, sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(bus: Long, name: Long, hasowner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(bus: Long, name: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(bus: Long, aboutlistener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(bus: Long, listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(bus: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(bus: Long, obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(bus: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(bus: Long, rule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(bus: Long, sessionid: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(bus: Long, requestedname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(bus: Long, name: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(bus: Long, name: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(bus: Long, module: Long, level: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(bus: Long, guid: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(bus: Long, sessionid: Int, linktimeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(bus: Long, sessionid: Int, linktimeout: Int, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(bus: Long, sessionid: Int, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(bus: Long, sessionport: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(bus: Long, aboutlistener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(bus: Long, listener: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(bus: Long, listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(bus: Long, obj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(bus: Long, implementsinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(bus: Long, implementsinterfaces: Long, numberinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate(callbacks: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(bus: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(bus: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(bus: Long, msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(bus: Long, serialnumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate(path: Long, isplaceholder: Int, callbacksIn: Long, contextIn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(bus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(bus: Long, ifcname: Long, propnames: Long, numprops: Long, id: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(bus: Long, ifcname: Long, propname: Long, value: Long, id: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(bus: Long, interfaces: Long, numinterfaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(bus: Long, buffer: Long, buffersz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(bus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(bus: Long, msg: Long, args: Long, numargs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(bus: Long, msg: Long, error: Long, errormessage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(bus: Long, msg: Long, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(bus: Long, iface: Long, isannounced: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(cred: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(cred: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(cred: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(cred: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(cred: Long, creds: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(cred: Long, certchain: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(cred: Long, expiration: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(cred: Long, logonentry: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(cred: Long, pwd: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(cred: Long, pk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(cred: Long, username: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynGetversion(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(iface: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(iface: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(iface: Long, member: Long, argname: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(iface: Long, type: Int, name: Long, inputsig: Long, outsig: Long, argnames: Long, annotation: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(iface: Long, member: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(iface: Long, name: Long, inputsig: Long, outsig: Long, argnames: Long, annotation: Byte, accessperms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(iface: Long, name: Long, signature: Long, access: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(iface: Long, property: Long, name: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(iface: Long, name: Long, sig: Long, argnames: Long, annotation: Byte, accessperms: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(iface: Long, name: Long, value: Long, valueSize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(iface: Long, index: Long, name: Long, nameSize: Long, value: Long, valueSize: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: Long, member: Long, arg: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(iface: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(iface: Long, languages: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(iface: Long, languages: Long, languagessize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(iface: Long, member: Long, name: Long, value: Long, valueSize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(iface: Long, member: Long, argname: Long, name: Long, value: Long, valueSize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: Long, member: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(iface: Long, members: Long, nummembers: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(iface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(iface: Long, props: Long, numprops: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(iface: Long, name: Long, property: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(iface: Long, property: Long, name: Long, value: Long, strSize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: Long, property: Long, description: Long, maxlanguagelength: Long, languagetag: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(iface: Long, name: Long, member: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(iface: Long, name: Long, insig: Long, outsig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(iface: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(iface: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(iface: Long, member: Long, argname: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: Long, member: Long, arg: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(iface: Long, description: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(iface: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(iface: Long, language: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: Long, translationcallback: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(iface: Long, member: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: Long, member: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(iface: Long, name: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: Long, name: Long, description: Long, languagetag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(listener: Long, keystore: Long, sink: Long, sinkSz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(listener: Long, keystore: Long, source: Long, password: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate(callbacks: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(bus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(msg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(msg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(msg: Long, argn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(msg: Long, numargs: Long, args: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(msg: Long, errormessage: Long, errormessageSize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(msg: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(msg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(msg: Long, tillexpirems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(msg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(msg: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(endian: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(msg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(args: Long, numargs: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(args: Long, numargs: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(args: Long, argoffset: Long, numargs: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(values: Long, numvalues: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(args: Long, numargs: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(arg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(destination: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(source: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet(signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(arg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(lhv: Long, rhv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(arg: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(arg: Long, index: Long, element: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(arg: Long, b: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(arg: Long, length: Long, ab: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(arg: Long, d: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(arg: Long, length: Long, ad: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(arg: Long, n: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(arg: Long, length: Long, an: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(arg: Long, i: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(arg: Long, length: Long, ai: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(arg: Long, x: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(arg: Long, length: Long, ax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(arg: Long, o: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(arg: Long, g: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(arg: Long, s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(arg: Long, q: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(arg: Long, length: Long, aq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(arg: Long, u: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(arg: Long, length: Long, au: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(arg: Long, t: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(arg: Long, length: Long, at: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(arg: Long, y: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(arg: Long, length: Long, ay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(arg: Long, v: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(arg: Long, signature: Long, length: Long, av: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(arg: Long, elemsig: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(arg: Long, index: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(arg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(arg: Long, signature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(arg: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(arg: Long, signature: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(arg: Long, b: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(arg: Long, length: Long, ab: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(arg: Long, d: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(arg: Long, length: Long, ad: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(arg: Long, n: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(arg: Long, length: Long, an: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(arg: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(arg: Long, length: Long, ai: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(arg: Long, x: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(arg: Long, length: Long, ax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(arg: Long, o: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(arg: Long, length: Long, ao: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(arg: Long, g: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(arg: Long, length: Long, ag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(arg: Long, s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(arg: Long, length: Long, asTarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(arg: Long, q: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(arg: Long, length: Long, aq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(arg: Long, u: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(arg: Long, length: Long, au: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(arg: Long, t: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(arg: Long, length: Long, at: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(arg: Long, y: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(arg: Long, length: Long, ay: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(arg: Long, key: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(arg: Long, structMembers: Long, numMembers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(arg: Long, str: Long, buf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(arg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(arg: Long, str: Long, buf: Long, indent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(bus: Long, mandatoryinterfaces: Long, nummandatoryinterfaces: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(observer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(observer: Long, uniquebusname: Long, objectpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(observer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(observer: Long, proxyref: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(observer: Long, listener: Long, triggeronexisting: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(observer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(observer: Long, listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate(callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials(authmechanism: Long, password: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate(callbacks: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup(certificateid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(configurator: Long, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: Long, groupauthority: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(configurator: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(configurator: Long, claimcapabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(configurator: Long, identitycertificatechain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(configurator: Long, certificateid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(configurator: Long, manifestarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(configurator: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(configurator: Long, certificateids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(configurator: Long, publickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(configurator: Long, manifestsxmls: Long, manifestscount: Long, append: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(configurator: Long, membershipcertificatechain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy(policyxml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy(publickey: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(configurator: Long, serial: Long, seriallen: Long, issuerpublickey: Long, issueraki: Long, issuerakilen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(configurator: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(configurator: Long, claimcapabilities: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: Long, additionalinfo: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(configurator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(configurator: Long, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(configurator: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate(callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(proxyobj: Long, child: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(proxyobj: Long, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(source: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(bus: Long, service: Long, path: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(bus: Long, service: Long, path: Long, sessionid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(proxyobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(proxyobj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(proxyobj: Long, iface: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(proxyobj: Long, iface: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(proxyobj: Long, path: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(proxyobj: Long, children: Long, numchildren: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(proxyobj: Long, ifaces: Long, numifaces: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(proxyobj: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(proxyobj: Long, iface: Long, property: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(proxyobj: Long, iface: Long, property: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(proxyobj: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(proxyobj: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(proxyobj: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(proxyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(proxyobj: Long, ifacename: Long, methodname: Long, args: Long, numargs: Long, replymsg: Long, timeout: Int, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(proxyobj: Long, ifacename: Long, methodname: Long, args: Long, numargs: Long, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(proxyobj: Long, ifacename: Long, methodname: Long, replyfunc: Long, args: Long, numargs: Long, context: Long, timeout: Int, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(proxyobj: Long, xml: Long, identifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(proxy: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(ref: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(ref: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(ref: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: Long, iface: Long, properties: Long, numproperties: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(proxyobj: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(proxyobj: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(proxyobj: Long, forceauth: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(proxyobj: Long, iface: Long, property: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(proxyobj: Long, iface: Long, property: Long, value: Long, callback: Long, timeout: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: Long, iface: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynRouterinit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig(configxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(proxy: Long, cakey: Long, identitycertificatechain: Long, groupid: Long, groupsize: Long, groupauthority: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: Long, identitycertificatepem: Long, digest: Long, digestsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(bus: Long, appbusname: Long, sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(proxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy(digest: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(proxy: Long, applicationstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: Long, capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: Long, additionalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(proxy: Long, eccpublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: Long, manifesttemplatexml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(proxy: Long, membershipcertificatechain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy(policyxml: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: Long, identitycertificatepem: Long, signature: Long, signaturesize: Long, signedmanifestxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: Long, identitycertificatepem: Long, signingprivatekeypem: Long, signedmanifestxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(proxy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(proxy: Long, identitycertificatechain: Long, manifestsxmls: Long, manifestscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(proxy: Long, policyxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate(callbacks: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(traffic: Byte, ismultipoint: Int, proximity: Byte, transports: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(opts: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(opts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(opts: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(opts: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(opts: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(one: Long, other: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(opts: Long, ismultipoint: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(opts: Long, proximity: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(opts: Long, traffic: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(opts: Long, transports: Short)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate(callbacks: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int)
}

public actual fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynAcceptBusConnection((serverbushandle?.value ?: 0L), (abortevent?.value ?: 0L)).toUInt()

public actual fun allJoynCloseBusHandle(bushandle: Handle): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynCloseBusHandle((bushandle?.value ?: 0L))

public actual fun allJoynConnectToBus(connectionspec: Pcwstr): Handle =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynConnectToBus((connectionspec?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynCreateBus(outbuffersize.toInt(), inbuffersize.toInt(), (lpsecurityattributes?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: COpaquePointer?): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynEnumEvents((connectedbushandle?.value ?: 0L), (eventtoreset?.value ?: 0L), (eventtypes?.value ?: 0L))

public actual fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynEventSelect((connectedbushandle?.value ?: 0L), (eventhandle?.value ?: 0L), eventtypes.toInt())

public actual fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestoread: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynReceiveFromBus((connectedbushandle?.value ?: 0L), (buffer?.value ?: 0L), bytestoread.toInt(), (bytestransferred?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun allJoynSendToBus(connectedbushandle: Handle, buffer: COpaquePointer?, bytestowrite: UInt, bytestransferred: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_allJoynSendToBus((connectedbushandle?.value ?: 0L), (buffer?.value ?: 0L), bytestowrite.toInt(), (bytestransferred?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun qccStatusText(status: QStatus): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_qccStatusText(status).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreate((defaultlanguage?.value ?: 0L))

public actual fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateEmpty()

public actual fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreateFull(arg, (language?.value ?: 0L))

public actual fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefrommsgarg(data.toLong(), arg, (language?.value ?: 0L))

public actual fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataCreatefromxml(data.toLong(), (aboutdataxml?.value ?: 0L))

public actual fun alljoynAboutdataDestroy(data: AlljoynAboutdata) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataDestroy(data.toLong())
}

public actual fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetaboutdata(data.toLong(), msgarg, (language?.value ?: 0L))

public actual fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetajsoftwareversion(data.toLong(), (ajsoftwareversion?.value ?: 0L))

public actual fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetannouncedaboutdata(data.toLong(), msgarg)

public actual fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappid(data.toLong(), (appid?.value ?: 0L), (num?.value ?: 0L))

public actual fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: COpaquePointer?, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetappname(data.toLong(), (appname?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdateofmanufacture(data.toLong(), (dateofmanufacture?.value ?: 0L))

public actual fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdefaultlanguage(data.toLong(), (defaultlanguage?.value ?: 0L))

public actual fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: COpaquePointer?, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdescription(data.toLong(), (description?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdeviceid(data.toLong(), (deviceid?.value ?: 0L))

public actual fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: COpaquePointer?, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetdevicename(data.toLong(), (devicename?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: COpaquePointer?, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfield(data.toLong(), (name?.value ?: 0L), (value?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: COpaquePointer?, numFields: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfields(data.toLong(), (fields?.value ?: 0L), numFields.toLong()).toULong()

public actual fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetfieldsignature(data.toLong(), (fieldname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGethardwareversion(data.toLong(), (hardwareversion?.value ?: 0L))

public actual fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: COpaquePointer?, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmanufacturer(data.toLong(), (manufacturer?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetmodelnumber(data.toLong(), (modelnumber?.value ?: 0L))

public actual fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsoftwareversion(data.toLong(), (softwareversion?.value ?: 0L))

public actual fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: COpaquePointer?, num: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupportedlanguages(data.toLong(), (languagetags?.value ?: 0L), num.toLong()).toULong()

public actual fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataGetsupporturl(data.toLong(), (supporturl?.value ?: 0L))

public actual fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldannounced(data.toLong(), (fieldname?.value ?: 0L)).toUByte()

public actual fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldlocalized(data.toLong(), (fieldname?.value ?: 0L)).toUByte()

public actual fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsfieldrequired(data.toLong(), (fieldname?.value ?: 0L)).toUByte()

public actual fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataIsvalid(data.toLong(), (language?.value ?: 0L)).toUByte()

public actual fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: COpaquePointer?, num: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappid(data.toLong(), (appid?.value ?: 0L), num.toLong())

public actual fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappidFromstring(data.toLong(), (appid?.value ?: 0L))

public actual fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetappname(data.toLong(), (appname?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdateofmanufacture(data.toLong(), (dateofmanufacture?.value ?: 0L))

public actual fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdefaultlanguage(data.toLong(), (defaultlanguage?.value ?: 0L))

public actual fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdescription(data.toLong(), (description?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdeviceid(data.toLong(), (deviceid?.value ?: 0L))

public actual fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetdevicename(data.toLong(), (devicename?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetfield(data.toLong(), (name?.value ?: 0L), value, (language?.value ?: 0L))

public actual fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSethardwareversion(data.toLong(), (hardwareversion?.value ?: 0L))

public actual fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmanufacturer(data.toLong(), (manufacturer?.value ?: 0L), (language?.value ?: 0L))

public actual fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetmodelnumber(data.toLong(), (modelnumber?.value ?: 0L))

public actual fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsoftwareversion(data.toLong(), (softwareversion?.value ?: 0L))

public actual fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupportedlanguage(data.toLong(), (language?.value ?: 0L))

public actual fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdataSetsupporturl(data.toLong(), (supporturl?.value ?: 0L))

public actual fun alljoynAboutdatalistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAboutdatalistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutdatalistenerDestroy(listener.toLong())
}

public actual fun alljoynAbouticonClear(icon: AlljoynAbouticon) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonClear(icon.toLong())
}

public actual fun alljoynAbouticonCreate(): AlljoynAbouticon =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonCreate()

public actual fun alljoynAbouticonDestroy(icon: AlljoynAbouticon) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonDestroy(icon.toLong())
}

public actual fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: COpaquePointer?, size: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGetcontent(icon.toLong(), (data?.value ?: 0L), (size?.value ?: 0L))
}

public actual fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: COpaquePointer?, url: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonGeturl(icon.toLong(), (type?.value ?: 0L), (url?.value ?: 0L))
}

public actual fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: COpaquePointer?, csize: ULong, ownsdata: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontent(icon.toLong(), (type?.value ?: 0L), (data?.value ?: 0L), csize.toLong(), ownsdata.toByte())

public actual fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSetcontentFrommsgarg(icon.toLong(), arg)

public actual fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonSeturl(icon.toLong(), (type?.value ?: 0L), (url?.value ?: 0L))

public actual fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjCreate(bus, icon.toLong())

public actual fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonobjDestroy(icon.toLong())
}

public actual fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyCreate(bus, (busname?.value ?: 0L), sessionid.toInt())

public actual fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyDestroy(proxy.toLong())
}

public actual fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGeticon(proxy.toLong(), icon.toLong())

public actual fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAbouticonproxyGetversion(proxy.toLong(), (version?.value ?: 0L))

public actual fun alljoynAboutlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynAboutlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerCreate((callback?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutlistenerDestroy(listener.toLong())
}

public actual fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounce(obj.toLong(), sessionport.toShort(), aboutdata.toLong())

public actual fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjAnnounceUsingDatalistener(obj.toLong(), sessionport.toShort(), aboutlistener.toLong())

public actual fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjCreate(bus, isannounced)

public actual fun alljoynAboutobjDestroy(obj: AlljoynAboutobj) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjDestroy(obj.toLong())
}

public actual fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjUnannounce(obj.toLong())

public actual fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionClear(description.toLong())
}

public actual fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreate()

public actual fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreateFull(arg)

public actual fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionCreatefrommsgarg(description.toLong(), arg)

public actual fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionDestroy(description.toLong())
}

public actual fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: COpaquePointer?, numpaths: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfacepaths(description.toLong(), (interfacename?.value ?: 0L), (paths?.value ?: 0L), numpaths.toLong()).toULong()

public actual fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetinterfaces(description.toLong(), (path?.value ?: 0L), (interfaces?.value ?: 0L), numinterfaces.toLong()).toULong()

public actual fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetmsgarg(description.toLong(), msgarg)

public actual fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: COpaquePointer?, numpaths: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionGetpaths(description.toLong(), (paths?.value ?: 0L), numpaths.toLong()).toULong()

public actual fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterface(description.toLong(), (interfacename?.value ?: 0L)).toUByte()

public actual fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHasinterfaceatpath(description.toLong(), (path?.value ?: 0L), (interfacename?.value ?: 0L)).toUByte()

public actual fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutobjectdescriptionHaspath(description.toLong(), (path?.value ?: 0L)).toUByte()

public actual fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyCreate(bus, (busname?.value ?: 0L), sessionid.toInt())

public actual fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyDestroy(proxy.toLong())
}

public actual fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetaboutdata(proxy.toLong(), (language?.value ?: 0L), data)

public actual fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetobjectdescription(proxy.toLong(), objectdesc)

public actual fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAboutproxyGetversion(proxy.toLong(), (version?.value ?: 0L))

public actual fun alljoynApplicationstatelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynApplicationstatelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynApplicationstatelistenerDestroy(listener.toLong())
}

public actual fun alljoynAuthlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerDestroy(listener)
}

public actual fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int, credentials: AlljoynCredentials): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerRequestcredentialsresponse(listener, (authcontext?.value ?: 0L), accept, credentials)

public actual fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: COpaquePointer?, sharedsecretsize: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerSetsharedsecret(listener, (sharedsecret?.value ?: 0L), sharedsecretsize.toLong())

public actual fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: COpaquePointer?, accept: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerVerifycredentialsresponse(listener, (authcontext?.value ?: 0L), accept)

public actual fun alljoynAuthlistenerasyncCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynAuthlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAuthlistenerasyncDestroy(listener)
}

public actual fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAdddestination(autopinger.toLong(), (group?.value ?: 0L), (destination?.value ?: 0L))

public actual fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerAddpinggroup(autopinger.toLong(), (group?.value ?: 0L), listener.toLong(), pinginterval.toInt())
}

public actual fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerCreate(bus)

public actual fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerDestroy(autopinger.toLong())
}

public actual fun alljoynAutopingerPause(autopinger: AlljoynAutopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerPause(autopinger.toLong())
}

public actual fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovedestination(autopinger.toLong(), (group?.value ?: 0L), (destination?.value ?: 0L), removeall)

public actual fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerRemovepinggroup(autopinger.toLong(), (group?.value ?: 0L))
}

public actual fun alljoynAutopingerResume(autopinger: AlljoynAutopinger) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerResume(autopinger.toLong())
}

public actual fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynAutopingerSetpinginterval(autopinger.toLong(), (group?.value ?: 0L), pinginterval.toInt())

public actual fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddlogonentry(bus, (authmechanism?.value ?: 0L), (username?.value ?: 0L), (password?.value ?: 0L))

public actual fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAddmatch(bus, (rule?.value ?: 0L))

public actual fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentAdvertisename(bus, (name?.value ?: 0L), transports.toShort())

public actual fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: COpaquePointer?, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentBindsessionport(bus, (sessionport?.value ?: 0L), opts, listener.toLong())

public actual fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCanceladvertisename(bus, (name?.value ?: 0L), transports.toShort())

public actual fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisedname(bus, (nameprefix?.value ?: 0L))

public actual fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelfindadvertisednamebytransport(bus, (nameprefix?.value ?: 0L), transports.toShort())

public actual fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterface(bus, (implementsinterface?.value ?: 0L))

public actual fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCancelwhoimplementsInterfaces(bus, (implementsinterfaces?.value ?: 0L), numberinterfaces.toLong())

public actual fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeys(bus, (guid?.value ?: 0L))

public actual fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentClearkeystore(bus)
}

public actual fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentConnect(bus, (connectspec?.value ?: 0L))

public actual fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreate((applicationname?.value ?: 0L), allowremotemessages)

public actual fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateConcurrency((applicationname?.value ?: 0L), allowremotemessages, concurrency.toInt())

public actual fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterface(bus, (name?.value ?: 0L), (iface?.value ?: 0L))

public actual fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: COpaquePointer?, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfaceSecure(bus, (name?.value ?: 0L), (iface?.value ?: 0L), secpolicy)

public actual fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentCreateinterfacesfromxml(bus, (xml?.value ?: 0L))

public actual fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeletedefaultkeystore((applicationname?.value ?: 0L))

public actual fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDeleteinterface(bus, iface.toLong())

public actual fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDestroy(bus)
}

public actual fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentDisconnect(bus, (unused?.value ?: 0L))

public actual fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnableconcurrentcallbacks(bus)
}

public actual fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecurity(bus, (authmechanisms?.value ?: 0L), listener, (keystorefilename?.value ?: 0L), isshared)

public actual fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus, (authmechanisms?.value ?: 0L), authlistener, (keystorefilename?.value ?: 0L), isshared, permissionconfigurationlistener.toLong())

public actual fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisedname(bus, (nameprefix?.value ?: 0L))

public actual fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentFindadvertisednamebytransport(bus, (nameprefix?.value ?: 0L), transports.toShort())

public actual fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoyndebugobj(bus)

public actual fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetalljoynproxyobj(bus)

public actual fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconcurrency(bus).toUInt()

public actual fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetconnectspec(bus).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetdbusproxyobj(bus)

public actual fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetglobalguidstring(bus).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterface(bus, (name?.value ?: 0L))

public actual fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetinterfaces(bus, (ifaces?.value ?: 0L), numifaces.toLong()).toULong()

public actual fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetkeyexpiration(bus, (guid?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpeerguid(bus, (name?.value ?: 0L), (guid?.value ?: 0L), (guidsz?.value ?: 0L))

public actual fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetpermissionconfigurator(bus)

public actual fun alljoynBusattachmentGettimestamp(): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGettimestamp().toUInt()

public actual fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentGetuniquename(bus).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsconnected(bus)

public actual fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIspeersecurityenabled(bus)

public actual fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstarted(bus)

public actual fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentIsstopping(bus)

public actual fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoin(bus)

public actual fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: COpaquePointer?, opts: AlljoynSessionopts): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsession(bus, (sessionhost?.value ?: 0L), sessionport.toShort(), listener.toLong(), (sessionid?.value ?: 0L), opts)

public actual fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentJoinsessionasync(bus, (sessionhost?.value ?: 0L), sessionport.toShort(), listener.toLong(), opts, 0L, (context?.value ?: 0L))

public actual fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentLeavesession(bus, sessionid.toInt())

public actual fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentNamehasowner(bus, (name?.value ?: 0L), (hasowner?.value ?: 0L))

public actual fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentPing(bus, (name?.value ?: 0L), timeout.toInt())

public actual fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisteraboutlistener(bus, aboutlistener.toLong())
}

public actual fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterapplicationstatelistener(bus, listener.toLong())

public actual fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbuslistener(bus, listener.toLong())
}

public actual fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobject(bus, obj)

public actual fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterbusobjectSecure(bus, obj)

public actual fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRegisterkeystorelistener(bus, listener)

public actual fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReleasename(bus, (name?.value ?: 0L))

public actual fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentReloadkeystore(bus)

public actual fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovematch(bus, (rule?.value ?: 0L))

public actual fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRemovesessionmember(bus, sessionid.toInt(), (membername?.value ?: 0L))

public actual fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentRequestname(bus, (requestedname?.value ?: 0L), flags.toInt())

public actual fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnection(bus, (name?.value ?: 0L), forceauth)

public actual fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSecureconnectionasync(bus, (name?.value ?: 0L), forceauth)

public actual fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetdaemondebug(bus, (module?.value ?: 0L), level.toInt())

public actual fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetkeyexpiration(bus, (guid?.value ?: 0L), timeout.toInt())

public actual fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeout(bus, sessionid.toInt(), (linktimeout?.value ?: 0L))

public actual fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetlinktimeoutasync(bus, sessionid.toInt(), linktimeout.toInt(), 0L, (context?.value ?: 0L))

public actual fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentSetsessionlistener(bus, sessionid.toInt(), listener.toLong())

public actual fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStart(bus)

public actual fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentStop(bus)

public actual fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnbindsessionport(bus, sessionport.toShort())

public actual fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisteraboutlistener(bus, aboutlistener.toLong())
}

public actual fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallaboutlisteners(bus)
}

public actual fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterallhandlers(bus)

public actual fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterapplicationstatelistener(bus, listener.toLong())

public actual fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbuslistener(bus, listener.toLong())
}

public actual fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentUnregisterbusobject(bus, obj)
}

public actual fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus =
    0

public actual fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterface(bus, (implementsinterface?.value ?: 0L))

public actual fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: COpaquePointer?, numberinterfaces: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusattachmentWhoimplementsInterfaces(bus, (implementsinterfaces?.value ?: 0L), numberinterfaces.toLong())

public actual fun alljoynBuslistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynBuslistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBuslistenerDestroy(listener.toLong())
}

public actual fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterface(bus, iface.toLong())

public actual fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddinterfaceAnnounced(bus, iface.toLong())

public actual fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: COpaquePointer?): QStatus =
    0

public actual fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: COpaquePointer?, numentries: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectAddmethodhandlers(bus, (entries?.value ?: 0L), numentries.toLong())

public actual fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessage(bus, msg)

public actual fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCancelsessionlessmessageSerial(bus, serialnumber.toInt())

public actual fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: COpaquePointer?, contextIn: COpaquePointer?): AlljoynBusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectCreate((path?.value ?: 0L), isplaceholder, (callbacksIn?.value ?: 0L), (contextIn?.value ?: 0L))

public actual fun alljoynBusobjectDestroy(bus: AlljoynBusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectDestroy(bus)
}

public actual fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: COpaquePointer?, numprops: ULong, id: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertieschanged(bus, (ifcname?.value ?: 0L), (propnames?.value ?: 0L), numprops.toLong(), id.toInt())
}

public actual fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectEmitpropertychanged(bus, (ifcname?.value ?: 0L), (propname?.value ?: 0L), value, id.toInt())
}

public actual fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: COpaquePointer?, numinterfaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetannouncedinterfacenames(bus, (interfaces?.value ?: 0L), numinterfaces.toLong()).toULong()

public actual fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetbusattachment(bus)

public actual fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetname(bus, (buffer?.value ?: 0L), buffersz.toLong()).toULong()

public actual fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectGetpath(bus).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectIssecure(bus)

public actual fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyArgs(bus, msg, args, numargs.toLong())

public actual fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyErr(bus, msg, (error?.value ?: 0L), (errormessage?.value ?: 0L))

public actual fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectMethodreplyStatus(bus, msg, status)

public actual fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynBusobjectSetannounceflag(bus, iface.toLong(), isannounced)

public actual fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus =
    0

public actual fun alljoynCredentialsClear(cred: AlljoynCredentials) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsClear(cred)
}

public actual fun alljoynCredentialsCreate(): AlljoynCredentials =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsCreate()

public actual fun alljoynCredentialsDestroy(cred: AlljoynCredentials) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsDestroy(cred)
}

public actual fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetcertchain(cred).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetexpiration(cred).toUInt()

public actual fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetlogonentry(cred).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetpassword(cred).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetprivateKey(cred).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsGetusername(cred).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsIsset(cred, creds.toShort())

public actual fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetcertchain(cred, (certchain?.value ?: 0L))
}

public actual fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetexpiration(cred, expiration.toInt())
}

public actual fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetlogonentry(cred, (logonentry?.value ?: 0L))
}

public actual fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetpassword(cred, (pwd?.value ?: 0L))
}

public actual fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetprivatekey(cred, (pk?.value ?: 0L))
}

public actual fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynCredentialsSetusername(cred, (username?.value ?: 0L))
}

public actual fun alljoynGetbuildinfo(): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynGetbuildinfo().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynGetnumericversion(): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynGetnumericversion().toUInt()

public actual fun alljoynGetversion(): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynGetversion().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynInit(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInit()

public actual fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionActivate(iface.toLong())
}

public actual fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddannotation(iface.toLong(), (name?.value ?: 0L), (value?.value ?: 0L))

public actual fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddargannotation(iface.toLong(), (member?.value ?: 0L), (argname?.value ?: 0L), (name?.value ?: 0L), (value?.value ?: 0L))

public actual fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmember(iface.toLong(), type, (name?.value ?: 0L), (inputsig?.value ?: 0L), (outsig?.value ?: 0L), (argnames?.value ?: 0L), annotation.toByte())

public actual fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmemberannotation(iface.toLong(), (member?.value ?: 0L), (name?.value ?: 0L), (value?.value ?: 0L))

public actual fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddmethod(iface.toLong(), (name?.value ?: 0L), (inputsig?.value ?: 0L), (outsig?.value ?: 0L), (argnames?.value ?: 0L), annotation.toByte(), (accessperms?.value ?: 0L))

public actual fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddproperty(iface.toLong(), (name?.value ?: 0L), (signature?.value ?: 0L), access.toByte())

public actual fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddpropertyannotation(iface.toLong(), (property?.value ?: 0L), (name?.value ?: 0L), (value?.value ?: 0L))

public actual fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionAddsignal(iface.toLong(), (name?.value ?: 0L), (sig?.value ?: 0L), (argnames?.value ?: 0L), annotation.toByte(), (accessperms?.value ?: 0L))

public actual fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionEql(one.toLong(), other.toLong())

public actual fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotation(iface.toLong(), (name?.value ?: 0L), (value?.value ?: 0L), (valueSize?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: COpaquePointer?, value: Pcstr, valueSize: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationatindex(iface.toLong(), index.toLong(), (name?.value ?: 0L), (nameSize?.value ?: 0L), (value?.value ?: 0L), (valueSize?.value ?: 0L))
}

public actual fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetannotationscount(iface.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetargdescriptionforlanguage(iface.toLong(), (member?.value ?: 0L), (arg?.value ?: 0L), (description?.value ?: 0L), maxlanguagelength.toLong(), (languagetag?.value ?: 0L)).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionforlanguage(iface.toLong(), (description?.value ?: 0L), maxlanguagelength.toLong(), (languagetag?.value ?: 0L)).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: COpaquePointer?, size: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages(iface.toLong(), (languages?.value ?: 0L), size.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetdescriptionlanguages2(iface.toLong(), (languages?.value ?: 0L), languagessize.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr =
    null

public actual fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmember(iface.toLong(), (name?.value ?: 0L), (member?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberannotation(iface.toLong(), (member?.value ?: 0L), (name?.value ?: 0L), (value?.value ?: 0L), (valueSize?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberargannotation(iface.toLong(), (member?.value ?: 0L), (argname?.value ?: 0L), (name?.value ?: 0L), (value?.value ?: 0L), (valueSize?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface.toLong(), (member?.value ?: 0L), (description?.value ?: 0L), maxlanguagelength.toLong(), (languagetag?.value ?: 0L)).toULong()

public actual fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: COpaquePointer?, nummembers: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmembers(iface.toLong(), (members?.value ?: 0L), nummembers.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetmethod(iface.toLong(), (name?.value ?: 0L), (member?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetname(iface.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: COpaquePointer?, numprops: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperties(iface.toLong(), (props?.value ?: 0L), numprops.toLong()).toULong()

public actual fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetproperty(iface.toLong(), (name?.value ?: 0L), (property?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertyannotation(iface.toLong(), (property?.value ?: 0L), (name?.value ?: 0L), (value?.value ?: 0L), (strSize?.value ?: 0L))

public actual fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface.toLong(), (property?.value ?: 0L), (description?.value ?: 0L), maxlanguagelength.toLong(), (languagetag?.value ?: 0L)).toULong()

public actual fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsecuritypolicy(iface.toLong())

public actual fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionGetsignal(iface.toLong(), (name?.value ?: 0L), (member?.value ?: 0L))

public actual fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasdescription(iface.toLong())

public actual fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasmember(iface.toLong(), (name?.value ?: 0L), (insig?.value ?: 0L), (outsig?.value ?: 0L))

public actual fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperties(iface.toLong())

public actual fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionHasproperty(iface.toLong(), (name?.value ?: 0L))

public actual fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIntrospect(iface.toLong(), (str?.value ?: 0L), buf.toLong(), indent.toLong()).toULong()

public actual fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionIssecure(iface.toLong())

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
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescription(iface.toLong(), (member?.value ?: 0L), (argname?.value ?: 0L), (description?.value ?: 0L))

public actual fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetargdescriptionforlanguage(iface.toLong(), (member?.value ?: 0L), (arg?.value ?: 0L), (description?.value ?: 0L), (languagetag?.value ?: 0L))

public actual fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescription(iface.toLong(), (description?.value ?: 0L))
}

public actual fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionforlanguage(iface.toLong(), (description?.value ?: 0L), (languagetag?.value ?: 0L))

public actual fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptionlanguage(iface.toLong(), (language?.value ?: 0L))
}

public actual fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface.toLong(), 0L)
}

public actual fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescription(iface.toLong(), (member?.value ?: 0L), (description?.value ?: 0L))

public actual fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface.toLong(), (member?.value ?: 0L), (description?.value ?: 0L), (languagetag?.value ?: 0L))

public actual fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescription(iface.toLong(), (name?.value ?: 0L), (description?.value ?: 0L))

public actual fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface.toLong(), (name?.value ?: 0L), (description?.value ?: 0L), (languagetag?.value ?: 0L))

public actual fun alljoynKeystorelistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerDestroy(listener)
}

public actual fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerGetkeys(listener, keystore, (sink?.value ?: 0L), (sinkSz?.value ?: 0L))

public actual fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerPutkeys(listener, keystore, (source?.value ?: 0L), (password?.value ?: 0L))

public actual fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynKeystorelistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynKeystorelistenerWithSynchronizationCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageCreate(bus)

public actual fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageDescription(msg, (str?.value ?: 0L), buf.toLong()).toULong()

public actual fun alljoynMessageDestroy(msg: AlljoynMessage) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageDestroy(msg)
}

public actual fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageEql(one, other)

public actual fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetarg(msg, argn.toLong())

public actual fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: COpaquePointer?, args: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetargs(msg, (numargs?.value ?: 0L), (args?.value ?: 0L))
}

public actual fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetauthmechanism(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcallserial(msg).toUInt()

public actual fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetcompressiontoken(msg).toUInt()

public actual fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetdestination(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: COpaquePointer?): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGeterrorname(msg, (errormessage?.value ?: 0L), (errormessageSize?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetflags(msg: AlljoynMessage): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetflags(msg).toUByte()

public actual fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetinterface(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetmembername(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetobjectpath(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreceiveendpointname(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetreplyserial(msg).toUInt()

public actual fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsender(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsessionid(msg).toUInt()

public actual fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGetsignature(msg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGettimestamp(msg).toUInt()

public actual fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageGettype(msg)

public actual fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsbroadcastsignal(msg)

public actual fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsencrypted(msg)

public actual fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: COpaquePointer?): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsexpired(msg, (tillexpirems?.value ?: 0L))

public actual fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsglobalbroadcast(msg)

public actual fun alljoynMessageIssessionless(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageIssessionless(msg)

public actual fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageIsunreliable(msg)

public actual fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageParseargs(msg, (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMessageSetendianess(endian: Byte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageSetendianess(endian)
}

public actual fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMessageTostring(msg, (str?.value ?: 0L), buf.toLong()).toULong()

public actual fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayCreate(size.toLong())

public actual fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayElement(arg, index.toLong())

public actual fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayGet(args, numargs.toLong(), (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySet(args, (numargs?.value ?: 0L), (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: COpaquePointer?, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySetOffset(args, argoffset.toLong(), (numargs?.value ?: 0L), (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArraySignature(values, numvalues.toLong(), (str?.value ?: 0L), buf.toLong()).toULong()

public actual fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargArrayTostring(args, numargs.toLong(), (str?.value ?: 0L), buf.toLong(), indent.toLong()).toULong()

public actual fun alljoynMsgargClear(arg: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargClear(arg)
}

public actual fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargClone(destination, source)
}

public actual fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCopy(source)

public actual fun alljoynMsgargCreate(): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreate()

public actual fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargCreateAndSet((signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargDestroy(arg: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargDestroy(arg)
}

public actual fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargEqual(lhv, rhv)

public actual fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGet(arg, (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElement(arg, index.toLong(), (element?.value ?: 0L))
}

public actual fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayElementsignature(arg, index.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetArrayNumberofelements(arg).toULong()

public actual fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBool(arg, (b?.value ?: 0L))

public actual fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: COpaquePointer?, ab: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetBoolArray(arg, (length?.value ?: 0L), (ab?.value ?: 0L))

public actual fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDouble(arg, (d?.value ?: 0L))

public actual fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: COpaquePointer?, ad: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetDoubleArray(arg, (length?.value ?: 0L), (ad?.value ?: 0L))

public actual fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16(arg, (n?.value ?: 0L))

public actual fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: COpaquePointer?, an: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt16Array(arg, (length?.value ?: 0L), (an?.value ?: 0L))

public actual fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32(arg, (i?.value ?: 0L))

public actual fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: COpaquePointer?, ai: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt32Array(arg, (length?.value ?: 0L), (ai?.value ?: 0L))

public actual fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64(arg, (x?.value ?: 0L))

public actual fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: COpaquePointer?, ax: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetInt64Array(arg, (length?.value ?: 0L), (ax?.value ?: 0L))

public actual fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetObjectpath(arg, (o?.value ?: 0L))

public actual fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetSignature(arg, (g?.value ?: 0L))

public actual fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetString(arg, (s?.value ?: 0L))

public actual fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16(arg, (q?.value ?: 0L))

public actual fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: COpaquePointer?, aq: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint16Array(arg, (length?.value ?: 0L), (aq?.value ?: 0L))

public actual fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32(arg, (u?.value ?: 0L))

public actual fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: COpaquePointer?, au: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint32Array(arg, (length?.value ?: 0L), (au?.value ?: 0L))

public actual fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64(arg, (t?.value ?: 0L))

public actual fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: COpaquePointer?, at: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint64Array(arg, (length?.value ?: 0L), (at?.value ?: 0L))

public actual fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8(arg, (y?.value ?: 0L))

public actual fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: COpaquePointer?, ay: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetUint8Array(arg, (length?.value ?: 0L), (ay?.value ?: 0L))

public actual fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariant(arg, v)

public actual fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: COpaquePointer?, av: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetVariantArray(arg, (signature?.value ?: 0L), (length?.value ?: 0L), (av?.value ?: 0L))

public actual fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetdictelement(arg, (elemsig?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetkey(arg)

public actual fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetmember(arg, index.toLong())

public actual fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetnummembers(arg).toULong()

public actual fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGettype(arg)

public actual fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargGetvalue(arg)

public actual fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargHassignature(arg, (signature?.value ?: 0L))

public actual fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSet(arg, (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetAndStabilize(arg, (signature?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBool(arg, b)

public actual fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetBoolArray(arg, length.toLong(), (ab?.value ?: 0L))

public actual fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDouble(arg, d)

public actual fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetDoubleArray(arg, length.toLong(), (ad?.value ?: 0L))

public actual fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16(arg, n)

public actual fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt16Array(arg, length.toLong(), (an?.value ?: 0L))

public actual fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32(arg, i)

public actual fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt32Array(arg, length.toLong(), (ai?.value ?: 0L))

public actual fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64(arg, x)

public actual fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetInt64Array(arg, length.toLong(), (ax?.value ?: 0L))

public actual fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpath(arg, (o?.value ?: 0L))

public actual fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetObjectpathArray(arg, length.toLong(), (ao?.value ?: 0L))

public actual fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignature(arg, (g?.value ?: 0L))

public actual fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetSignatureArray(arg, length.toLong(), (ag?.value ?: 0L))

public actual fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetString(arg, (s?.value ?: 0L))

public actual fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetStringArray(arg, length.toLong(), (asTarget?.value ?: 0L))

public actual fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16(arg, q.toShort())

public actual fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint16Array(arg, length.toLong(), (aq?.value ?: 0L))

public actual fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32(arg, u.toInt())

public actual fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint32Array(arg, length.toLong(), (au?.value ?: 0L))

public actual fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64(arg, t.toLong())

public actual fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint64Array(arg, length.toLong(), (at?.value ?: 0L))

public actual fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8(arg, y.toByte())

public actual fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetUint8Array(arg, length.toLong(), (ay?.value ?: 0L))

public actual fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetdictentry(arg, key, value)

public actual fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSetstruct(arg, structMembers, numMembers.toLong())

public actual fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargSignature(arg, (str?.value ?: 0L), buf.toLong()).toULong()

public actual fun alljoynMsgargStabilize(arg: AlljoynMsgarg) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargStabilize(arg)
}

public actual fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynMsgargTostring(arg, (str?.value ?: 0L), buf.toLong(), indent.toLong()).toULong()

public actual fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: COpaquePointer?, nummandatoryinterfaces: ULong): AlljoynObserver =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverCreate(bus, (mandatoryinterfaces?.value ?: 0L), nummandatoryinterfaces.toLong())

public actual fun alljoynObserverDestroy(observer: AlljoynObserver) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverDestroy(observer.toLong())
}

public actual fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverGet(observer.toLong(), (uniquebusname?.value ?: 0L), (objectpath?.value ?: 0L))

public actual fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverGetfirst(observer.toLong())

public actual fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverGetnext(observer.toLong(), proxyref)

public actual fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverRegisterlistener(observer.toLong(), listener.toLong(), triggeronexisting)
}

public actual fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisteralllisteners(observer.toLong())
}

public actual fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverUnregisterlistener(observer.toLong(), listener.toLong())
}

public actual fun alljoynObserverlistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynObserverlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerCreate((callback?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynObserverlistenerDestroy(listener.toLong())
}

public actual fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPasswordmanagerSetcredentials((authmechanism?.value ?: 0L), (password?.value ?: 0L))

public actual fun alljoynPermissionconfigurationlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynPermissionconfigurationlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfigurationlistenerDestroy(listener.toLong())
}

public actual fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificatechainDestroy((certificatechain?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidCleanup((certificateid?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorCertificateidarrayCleanup((certificateidarray?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorClaim(configurator.toLong(), (cakey?.value ?: 0L), (identitycertificatechain?.value ?: 0L), (groupid?.value ?: 0L), groupsize.toLong(), (groupauthority?.value ?: 0L), (manifestsxmls?.value ?: 0L), manifestscount.toLong())

public actual fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorEndmanagement(configurator.toLong())

public actual fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetapplicationstate(configurator.toLong(), (state?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilities(configurator.toLong(), (claimcapabilities?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator.toLong(), (additionalinfo?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultclaimcapabilities().toUShort()

public actual fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetdefaultpolicy(configurator.toLong(), (policyxml?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentity(configurator.toLong(), (identitycertificatechain?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetidentitycertificateid(configurator.toLong(), (certificateid?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifests(configurator.toLong(), (manifestarray?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmanifesttemplate(configurator.toLong(), (manifesttemplatexml?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetmembershipsummaries(configurator.toLong(), (certificateids?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpolicy(configurator.toLong(), (policyxml?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorGetpublickey(configurator.toLong(), (publickey?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: COpaquePointer?, manifestscount: ULong, append: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmanifests(configurator.toLong(), (manifestsxmls?.value ?: 0L), manifestscount.toLong(), append)

public actual fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorInstallmembership(configurator.toLong(), (membershipcertificatechain?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifestarrayCleanup((manifestarray?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorManifesttemplateDestroy((manifesttemplatexml?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPolicyDestroy((policyxml?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorPublickeyDestroy((publickey?.value ?: 0L))
}

public actual fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: COpaquePointer?, seriallen: ULong, issuerpublickey: COpaquePointer?, issueraki: COpaquePointer?, issuerakilen: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorRemovemembership(configurator.toLong(), (serial?.value ?: 0L), seriallen.toLong(), (issuerpublickey?.value ?: 0L), (issueraki?.value ?: 0L), issuerakilen.toLong())

public actual fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorReset(configurator.toLong())

public actual fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorResetpolicy(configurator.toLong())

public actual fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetapplicationstate(configurator.toLong(), state)

public actual fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilities(configurator.toLong(), claimcapabilities.toShort())

public actual fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator.toLong(), additionalinfo.toShort())

public actual fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator.toLong(), (manifesttemplatexml?.value ?: 0L))

public actual fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorStartmanagement(configurator.toLong())

public actual fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdateidentity(configurator.toLong(), (identitycertificatechain?.value ?: 0L), (manifestsxmls?.value ?: 0L), manifestscount.toLong())

public actual fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPermissionconfiguratorUpdatepolicy(configurator.toLong(), (policyxml?.value ?: 0L))

public actual fun alljoynPinglistenerCreate(callback: COpaquePointer?, context: COpaquePointer?): AlljoynPinglistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerCreate((callback?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynPinglistenerDestroy(listener.toLong())
}

public actual fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddchild(proxyobj, child)

public actual fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterface(proxyobj, iface.toLong())

public actual fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectAddinterfaceByName(proxyobj, (name?.value ?: 0L))

public actual fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCopy(source)

public actual fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreate(bus, (service?.value ?: 0L), (path?.value ?: 0L), sessionid.toInt())

public actual fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectCreateSecure(bus, (service?.value ?: 0L), (path?.value ?: 0L), sessionid.toInt())

public actual fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectDestroy(proxyobj)
}

public actual fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectEnablepropertycaching(proxyobj)
}

public actual fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallproperties(proxyobj, (iface?.value ?: 0L), values)

public actual fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetallpropertiesasync(proxyobj, (iface?.value ?: 0L), 0L, timeout.toInt(), (context?.value ?: 0L))

public actual fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchild(proxyobj, (path?.value ?: 0L))

public actual fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: COpaquePointer?, numchildren: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetchildren(proxyobj, (children?.value ?: 0L), numchildren.toLong()).toULong()

public actual fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterface(proxyobj, (iface?.value ?: 0L))

public actual fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: COpaquePointer?, numifaces: ULong): ULong =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetinterfaces(proxyobj, (ifaces?.value ?: 0L), numifaces.toLong()).toULong()

public actual fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpath(proxyobj).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetproperty(proxyobj, (iface?.value ?: 0L), (property?.value ?: 0L), value)

public actual fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetpropertyasync(proxyobj, (iface?.value ?: 0L), (property?.value ?: 0L), 0L, timeout.toInt(), (context?.value ?: 0L))

public actual fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetservicename(proxyobj).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetsessionid(proxyobj).toUInt()

public actual fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectGetuniquename(proxyobj).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectImplementsinterface(proxyobj, (iface?.value ?: 0L))

public actual fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobject(proxyobj)

public actual fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj, 0L, (context?.value ?: 0L))

public actual fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIssecure(proxyobj)

public actual fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectIsvalid(proxyobj)

public actual fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcall(proxyobj, (ifacename?.value ?: 0L), (methodname?.value ?: 0L), args, numargs.toLong(), replymsg, timeout.toInt(), flags.toByte())

public actual fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallNoreply(proxyobj, (ifacename?.value ?: 0L), (methodname?.value ?: 0L), args, numargs.toLong(), flags.toByte())

public actual fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectMethodcallasync(proxyobj, (ifacename?.value ?: 0L), (methodname?.value ?: 0L), 0L, args, numargs.toLong(), (context?.value ?: 0L), timeout.toInt(), flags.toByte())

public actual fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: COpaquePointer?, timeout: UInt, flags: UByte): QStatus =
    0

public actual fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectParsexml(proxyobj, (xml?.value ?: 0L), (identifier?.value ?: 0L))

public actual fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefCreate(proxy)

public actual fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefDecref(ref)
}

public actual fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefGet(ref)

public actual fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRefIncref(ref)
}

public actual fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: COpaquePointer?, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj, (iface?.value ?: 0L), (properties?.value ?: 0L), numproperties.toLong(), 0L, (context?.value ?: 0L))

public actual fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectRemovechild(proxyobj, (path?.value ?: 0L))

public actual fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnection(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSecureconnectionasync(proxyobj, forceauth)

public actual fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetproperty(proxyobj, (iface?.value ?: 0L), (property?.value ?: 0L), value)

public actual fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectSetpropertyasync(proxyobj, (iface?.value ?: 0L), (property?.value ?: 0L), value, 0L, timeout.toInt(), (context?.value ?: 0L))

public actual fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj, (iface?.value ?: 0L), 0L)

public actual fun alljoynRouterinit(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynRouterinit()

public actual fun alljoynRouterinitwithconfig(configxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynRouterinitwithconfig((configxml?.value ?: 0L))

public actual fun alljoynRoutershutdown(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynRoutershutdown()

public actual fun alljoynSecurityapplicationproxyClaim(proxy: AlljoynSecurityapplicationproxy, cakey: COpaquePointer?, identitycertificatechain: COpaquePointer?, groupid: COpaquePointer?, groupsize: ULong, groupauthority: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyClaim(proxy.toLong(), (cakey?.value ?: 0L), (identitycertificatechain?.value ?: 0L), (groupid?.value ?: 0L), groupsize.toLong(), (groupauthority?.value ?: 0L), (manifestsxmls?.value ?: 0L), manifestscount.toLong())

public actual fun alljoynSecurityapplicationproxyComputemanifestdigest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, digest: COpaquePointer?, digestsize: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyComputemanifestdigest((unsignedmanifestxml?.value ?: 0L), (identitycertificatepem?.value ?: 0L), (digest?.value ?: 0L), (digestsize?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyCreate(bus: AlljoynBusattachment, appbusname: COpaquePointer?, sessionid: UInt): AlljoynSecurityapplicationproxy =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyCreate(bus, (appbusname?.value ?: 0L), sessionid.toInt())

public actual fun alljoynSecurityapplicationproxyDestroy(proxy: AlljoynSecurityapplicationproxy) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDestroy(proxy.toLong())
}

public actual fun alljoynSecurityapplicationproxyDigestDestroy(digest: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyDigestDestroy((digest?.value ?: 0L))
}

public actual fun alljoynSecurityapplicationproxyEccpublickeyDestroy(eccpublickey: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEccpublickeyDestroy((eccpublickey?.value ?: 0L))
}

public actual fun alljoynSecurityapplicationproxyEndmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyEndmanagement(proxy.toLong())

public actual fun alljoynSecurityapplicationproxyGetapplicationstate(proxy: AlljoynSecurityapplicationproxy, applicationstate: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetapplicationstate(proxy.toLong(), (applicationstate?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilities(proxy: AlljoynSecurityapplicationproxy, capabilities: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilities(proxy.toLong(), (capabilities?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy: AlljoynSecurityapplicationproxy, additionalinfo: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetclaimcapabilitiesadditionalinfo(proxy.toLong(), (additionalinfo?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyGetdefaultpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetdefaultpolicy(proxy.toLong(), (policyxml?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyGeteccpublickey(proxy: AlljoynSecurityapplicationproxy, eccpublickey: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGeteccpublickey(proxy.toLong(), (eccpublickey?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyGetmanifesttemplate(proxy: AlljoynSecurityapplicationproxy, manifesttemplatexml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetmanifesttemplate(proxy.toLong(), (manifesttemplatexml?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyGetpermissionmanagementsessionport(): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpermissionmanagementsessionport().toUShort()

public actual fun alljoynSecurityapplicationproxyGetpolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyGetpolicy(proxy.toLong(), (policyxml?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyInstallmembership(proxy: AlljoynSecurityapplicationproxy, membershipcertificatechain: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyInstallmembership(proxy.toLong(), (membershipcertificatechain?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyManifestDestroy(signedmanifestxml: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifestDestroy((signedmanifestxml?.value ?: 0L))
}

public actual fun alljoynSecurityapplicationproxyManifesttemplateDestroy(manifesttemplatexml: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyManifesttemplateDestroy((manifesttemplatexml?.value ?: 0L))
}

public actual fun alljoynSecurityapplicationproxyPolicyDestroy(policyxml: COpaquePointer?) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyPolicyDestroy((policyxml?.value ?: 0L))
}

public actual fun alljoynSecurityapplicationproxyReset(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyReset(proxy.toLong())

public actual fun alljoynSecurityapplicationproxyResetpolicy(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyResetpolicy(proxy.toLong())

public actual fun alljoynSecurityapplicationproxySetmanifestsignature(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signature: COpaquePointer?, signaturesize: ULong, signedmanifestxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySetmanifestsignature((unsignedmanifestxml?.value ?: 0L), (identitycertificatepem?.value ?: 0L), (signature?.value ?: 0L), signaturesize.toLong(), (signedmanifestxml?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxySignmanifest(unsignedmanifestxml: COpaquePointer?, identitycertificatepem: COpaquePointer?, signingprivatekeypem: COpaquePointer?, signedmanifestxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxySignmanifest((unsignedmanifestxml?.value ?: 0L), (identitycertificatepem?.value ?: 0L), (signingprivatekeypem?.value ?: 0L), (signedmanifestxml?.value ?: 0L))

public actual fun alljoynSecurityapplicationproxyStartmanagement(proxy: AlljoynSecurityapplicationproxy): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyStartmanagement(proxy.toLong())

public actual fun alljoynSecurityapplicationproxyUpdateidentity(proxy: AlljoynSecurityapplicationproxy, identitycertificatechain: COpaquePointer?, manifestsxmls: COpaquePointer?, manifestscount: ULong): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdateidentity(proxy.toLong(), (identitycertificatechain?.value ?: 0L), (manifestsxmls?.value ?: 0L), manifestscount.toLong())

public actual fun alljoynSecurityapplicationproxyUpdatepolicy(proxy: AlljoynSecurityapplicationproxy, policyxml: COpaquePointer?): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSecurityapplicationproxyUpdatepolicy(proxy.toLong(), (policyxml?.value ?: 0L))

public actual fun alljoynSessionlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynSessionlistenerDestroy(listener: AlljoynSessionlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionlistenerDestroy(listener.toLong())
}

public actual fun alljoynSessionoptsCmp(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCmp(one, other)

public actual fun alljoynSessionoptsCreate(traffic: UByte, ismultipoint: Int, proximity: UByte, transports: UShort): AlljoynSessionopts =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsCreate(traffic.toByte(), ismultipoint, proximity.toByte(), transports.toShort())

public actual fun alljoynSessionoptsDestroy(opts: AlljoynSessionopts) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsDestroy(opts)
}

public actual fun alljoynSessionoptsGetMultipoint(opts: AlljoynSessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetMultipoint(opts)

public actual fun alljoynSessionoptsGetProximity(opts: AlljoynSessionopts): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetProximity(opts).toUByte()

public actual fun alljoynSessionoptsGetTraffic(opts: AlljoynSessionopts): UByte =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTraffic(opts).toUByte()

public actual fun alljoynSessionoptsGetTransports(opts: AlljoynSessionopts): UShort =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsGetTransports(opts).toUShort()

public actual fun alljoynSessionoptsIscompatible(one: AlljoynSessionopts, other: AlljoynSessionopts): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsIscompatible(one, other)

public actual fun alljoynSessionoptsSetMultipoint(opts: AlljoynSessionopts, ismultipoint: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetMultipoint(opts, ismultipoint)
}

public actual fun alljoynSessionoptsSetProximity(opts: AlljoynSessionopts, proximity: UByte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetProximity(opts, proximity.toByte())
}

public actual fun alljoynSessionoptsSetTraffic(opts: AlljoynSessionopts, traffic: UByte) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTraffic(opts, traffic.toByte())
}

public actual fun alljoynSessionoptsSetTransports(opts: AlljoynSessionopts, transports: UShort) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionoptsSetTransports(opts, transports.toShort())
}

public actual fun alljoynSessionportlistenerCreate(callbacks: COpaquePointer?, context: COpaquePointer?): AlljoynSessionportlistener =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerCreate((callbacks?.value ?: 0L), (context?.value ?: 0L))

public actual fun alljoynSessionportlistenerDestroy(listener: AlljoynSessionportlistener) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynSessionportlistenerDestroy(listener.toLong())
}

public actual fun alljoynShutdown(): QStatus =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynShutdown()

public actual fun alljoynUnityDeferredCallbacksProcess(): Int =
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynUnityDeferredCallbacksProcess()

public actual fun alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly: Int) {
    WindowsWin32DevicesAlljoynJniBridge.windowssys_windows_win32_devices_alljoyn_alljoynUnitySetDeferredCallbackMainthreadOnly(mainthreadOnly)
}
