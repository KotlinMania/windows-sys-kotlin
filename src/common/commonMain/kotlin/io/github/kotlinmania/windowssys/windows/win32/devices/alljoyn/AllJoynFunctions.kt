package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun allJoynAcceptBusConnection(serverbushandle: Handle, abortevent: Handle): UInt

public expect fun allJoynCloseBusHandle(bushandle: Handle): Bool

public expect fun allJoynConnectToBus(connectionspec: Pcwstr): Handle

public expect fun allJoynCreateBus(outbuffersize: UInt, inbuffersize: UInt, lpsecurityattributes: ConstPtr): Handle

public expect fun allJoynEnumEvents(connectedbushandle: Handle, eventtoreset: Handle, eventtypes: MutPtr): Bool

public expect fun allJoynEventSelect(connectedbushandle: Handle, eventhandle: Handle, eventtypes: UInt): Bool

public expect fun allJoynReceiveFromBus(connectedbushandle: Handle, buffer: MutPtr, bytestoread: UInt, bytestransferred: MutPtr, reserved: MutPtr): Bool

public expect fun allJoynSendToBus(connectedbushandle: Handle, buffer: ConstPtr, bytestowrite: UInt, bytestransferred: MutPtr, reserved: MutPtr): Bool

public expect fun qccStatusText(status: QStatus): Pcstr

public expect fun alljoynAboutdataCreate(defaultlanguage: Pcstr): AlljoynAboutdata

public expect fun alljoynAboutdataCreateEmpty(): AlljoynAboutdata

public expect fun alljoynAboutdataCreateFull(arg: AlljoynMsgarg, language: Pcstr): AlljoynAboutdata

public expect fun alljoynAboutdataCreatefrommsgarg(data: AlljoynAboutdata, arg: AlljoynMsgarg, language: Pcstr): QStatus

public expect fun alljoynAboutdataCreatefromxml(data: AlljoynAboutdata, aboutdataxml: Pcstr): QStatus

public expect fun alljoynAboutdataDestroy(data: AlljoynAboutdata)

public expect fun alljoynAboutdataGetaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg, language: Pcstr): QStatus

public expect fun alljoynAboutdataGetajsoftwareversion(data: AlljoynAboutdata, ajsoftwareversion: MutPtr): QStatus

public expect fun alljoynAboutdataGetannouncedaboutdata(data: AlljoynAboutdata, msgarg: AlljoynMsgarg): QStatus

public expect fun alljoynAboutdataGetappid(data: AlljoynAboutdata, appid: MutPtr, num: MutPtr): QStatus

public expect fun alljoynAboutdataGetappname(data: AlljoynAboutdata, appname: MutPtr, language: Pcstr): QStatus

public expect fun alljoynAboutdataGetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: MutPtr): QStatus

public expect fun alljoynAboutdataGetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: MutPtr): QStatus

public expect fun alljoynAboutdataGetdescription(data: AlljoynAboutdata, description: MutPtr, language: Pcstr): QStatus

public expect fun alljoynAboutdataGetdeviceid(data: AlljoynAboutdata, deviceid: MutPtr): QStatus

public expect fun alljoynAboutdataGetdevicename(data: AlljoynAboutdata, devicename: MutPtr, language: Pcstr): QStatus

public expect fun alljoynAboutdataGetfield(data: AlljoynAboutdata, name: Pcstr, value: MutPtr, language: Pcstr): QStatus

public expect fun alljoynAboutdataGetfields(data: AlljoynAboutdata, fields: ConstPtr, numFields: ULong): ULong

public expect fun alljoynAboutdataGetfieldsignature(data: AlljoynAboutdata, fieldname: Pcstr): Pcstr

public expect fun alljoynAboutdataGethardwareversion(data: AlljoynAboutdata, hardwareversion: MutPtr): QStatus

public expect fun alljoynAboutdataGetmanufacturer(data: AlljoynAboutdata, manufacturer: MutPtr, language: Pcstr): QStatus

public expect fun alljoynAboutdataGetmodelnumber(data: AlljoynAboutdata, modelnumber: MutPtr): QStatus

public expect fun alljoynAboutdataGetsoftwareversion(data: AlljoynAboutdata, softwareversion: MutPtr): QStatus

public expect fun alljoynAboutdataGetsupportedlanguages(data: AlljoynAboutdata, languagetags: ConstPtr, num: ULong): ULong

public expect fun alljoynAboutdataGetsupporturl(data: AlljoynAboutdata, supporturl: MutPtr): QStatus

public expect fun alljoynAboutdataIsfieldannounced(data: AlljoynAboutdata, fieldname: Pcstr): UByte

public expect fun alljoynAboutdataIsfieldlocalized(data: AlljoynAboutdata, fieldname: Pcstr): UByte

public expect fun alljoynAboutdataIsfieldrequired(data: AlljoynAboutdata, fieldname: Pcstr): UByte

public expect fun alljoynAboutdataIsvalid(data: AlljoynAboutdata, language: Pcstr): UByte

public expect fun alljoynAboutdataSetappid(data: AlljoynAboutdata, appid: ConstPtr, num: ULong): QStatus

public expect fun alljoynAboutdataSetappidFromstring(data: AlljoynAboutdata, appid: Pcstr): QStatus

public expect fun alljoynAboutdataSetappname(data: AlljoynAboutdata, appname: Pcstr, language: Pcstr): QStatus

public expect fun alljoynAboutdataSetdateofmanufacture(data: AlljoynAboutdata, dateofmanufacture: Pcstr): QStatus

public expect fun alljoynAboutdataSetdefaultlanguage(data: AlljoynAboutdata, defaultlanguage: Pcstr): QStatus

public expect fun alljoynAboutdataSetdescription(data: AlljoynAboutdata, description: Pcstr, language: Pcstr): QStatus

public expect fun alljoynAboutdataSetdeviceid(data: AlljoynAboutdata, deviceid: Pcstr): QStatus

public expect fun alljoynAboutdataSetdevicename(data: AlljoynAboutdata, devicename: Pcstr, language: Pcstr): QStatus

public expect fun alljoynAboutdataSetfield(data: AlljoynAboutdata, name: Pcstr, value: AlljoynMsgarg, language: Pcstr): QStatus

public expect fun alljoynAboutdataSethardwareversion(data: AlljoynAboutdata, hardwareversion: Pcstr): QStatus

public expect fun alljoynAboutdataSetmanufacturer(data: AlljoynAboutdata, manufacturer: Pcstr, language: Pcstr): QStatus

public expect fun alljoynAboutdataSetmodelnumber(data: AlljoynAboutdata, modelnumber: Pcstr): QStatus

public expect fun alljoynAboutdataSetsoftwareversion(data: AlljoynAboutdata, softwareversion: Pcstr): QStatus

public expect fun alljoynAboutdataSetsupportedlanguage(data: AlljoynAboutdata, language: Pcstr): QStatus

public expect fun alljoynAboutdataSetsupporturl(data: AlljoynAboutdata, supporturl: Pcstr): QStatus

public expect fun alljoynAboutdatalistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynAboutdatalistener

public expect fun alljoynAboutdatalistenerDestroy(listener: AlljoynAboutdatalistener)

public expect fun alljoynAbouticonClear(icon: AlljoynAbouticon)

public expect fun alljoynAbouticonCreate(): AlljoynAbouticon

public expect fun alljoynAbouticonDestroy(icon: AlljoynAbouticon)

public expect fun alljoynAbouticonGetcontent(icon: AlljoynAbouticon, data: ConstPtr, size: MutPtr)

public expect fun alljoynAbouticonGeturl(icon: AlljoynAbouticon, type: ConstPtr, url: ConstPtr)

public expect fun alljoynAbouticonSetcontent(icon: AlljoynAbouticon, type: Pcstr, data: MutPtr, csize: ULong, ownsdata: UByte): QStatus

public expect fun alljoynAbouticonSetcontentFrommsgarg(icon: AlljoynAbouticon, arg: AlljoynMsgarg): QStatus

public expect fun alljoynAbouticonSeturl(icon: AlljoynAbouticon, type: Pcstr, url: Pcstr): QStatus

public expect fun alljoynAbouticonobjCreate(bus: AlljoynBusattachment, icon: AlljoynAbouticon): AlljoynAbouticonobj

public expect fun alljoynAbouticonobjDestroy(icon: AlljoynAbouticonobj)

public expect fun alljoynAbouticonproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAbouticonproxy

public expect fun alljoynAbouticonproxyDestroy(proxy: AlljoynAbouticonproxy)

public expect fun alljoynAbouticonproxyGeticon(proxy: AlljoynAbouticonproxy, icon: AlljoynAbouticon): QStatus

public expect fun alljoynAbouticonproxyGetversion(proxy: AlljoynAbouticonproxy, version: MutPtr): QStatus

public expect fun alljoynAboutlistenerCreate(callback: ConstPtr, context: ConstPtr): AlljoynAboutlistener

public expect fun alljoynAboutlistenerDestroy(listener: AlljoynAboutlistener)

public expect fun alljoynAboutobjAnnounce(obj: AlljoynAboutobj, sessionport: UShort, aboutdata: AlljoynAboutdata): QStatus

public expect fun alljoynAboutobjAnnounceUsingDatalistener(obj: AlljoynAboutobj, sessionport: UShort, aboutlistener: AlljoynAboutdatalistener): QStatus

public expect fun alljoynAboutobjCreate(bus: AlljoynBusattachment, isannounced: AlljoynAboutAnnounceflag): AlljoynAboutobj

public expect fun alljoynAboutobjDestroy(obj: AlljoynAboutobj)

public expect fun alljoynAboutobjUnannounce(obj: AlljoynAboutobj): QStatus

public expect fun alljoynAboutobjectdescriptionClear(description: AlljoynAboutobjectdescription)

public expect fun alljoynAboutobjectdescriptionCreate(): AlljoynAboutobjectdescription

public expect fun alljoynAboutobjectdescriptionCreateFull(arg: AlljoynMsgarg): AlljoynAboutobjectdescription

public expect fun alljoynAboutobjectdescriptionCreatefrommsgarg(description: AlljoynAboutobjectdescription, arg: AlljoynMsgarg): QStatus

public expect fun alljoynAboutobjectdescriptionDestroy(description: AlljoynAboutobjectdescription)

public expect fun alljoynAboutobjectdescriptionGetinterfacepaths(description: AlljoynAboutobjectdescription, interfacename: Pcstr, paths: ConstPtr, numpaths: ULong): ULong

public expect fun alljoynAboutobjectdescriptionGetinterfaces(description: AlljoynAboutobjectdescription, path: Pcstr, interfaces: ConstPtr, numinterfaces: ULong): ULong

public expect fun alljoynAboutobjectdescriptionGetmsgarg(description: AlljoynAboutobjectdescription, msgarg: AlljoynMsgarg): QStatus

public expect fun alljoynAboutobjectdescriptionGetpaths(description: AlljoynAboutobjectdescription, paths: ConstPtr, numpaths: ULong): ULong

public expect fun alljoynAboutobjectdescriptionHasinterface(description: AlljoynAboutobjectdescription, interfacename: Pcstr): UByte

public expect fun alljoynAboutobjectdescriptionHasinterfaceatpath(description: AlljoynAboutobjectdescription, path: Pcstr, interfacename: Pcstr): UByte

public expect fun alljoynAboutobjectdescriptionHaspath(description: AlljoynAboutobjectdescription, path: Pcstr): UByte

public expect fun alljoynAboutproxyCreate(bus: AlljoynBusattachment, busname: Pcstr, sessionid: UInt): AlljoynAboutproxy

public expect fun alljoynAboutproxyDestroy(proxy: AlljoynAboutproxy)

public expect fun alljoynAboutproxyGetaboutdata(proxy: AlljoynAboutproxy, language: Pcstr, data: AlljoynMsgarg): QStatus

public expect fun alljoynAboutproxyGetobjectdescription(proxy: AlljoynAboutproxy, objectdesc: AlljoynMsgarg): QStatus

public expect fun alljoynAboutproxyGetversion(proxy: AlljoynAboutproxy, version: MutPtr): QStatus

public expect fun alljoynApplicationstatelistenerCreate(callbacks: ConstPtr, context: MutPtr): AlljoynApplicationstatelistener

public expect fun alljoynApplicationstatelistenerDestroy(listener: AlljoynApplicationstatelistener)

public expect fun alljoynAuthlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynAuthlistener

public expect fun alljoynAuthlistenerDestroy(listener: AlljoynAuthlistener)

public expect fun alljoynAuthlistenerRequestcredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr, accept: Int, credentials: AlljoynCredentials): QStatus

public expect fun alljoynAuthlistenerSetsharedsecret(listener: AlljoynAuthlistener, sharedsecret: ConstPtr, sharedsecretsize: ULong): QStatus

public expect fun alljoynAuthlistenerVerifycredentialsresponse(listener: AlljoynAuthlistener, authcontext: MutPtr, accept: Int): QStatus

public expect fun alljoynAuthlistenerasyncCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynAuthlistener

public expect fun alljoynAuthlistenerasyncDestroy(listener: AlljoynAuthlistener)

public expect fun alljoynAutopingerAdddestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr): QStatus

public expect fun alljoynAutopingerAddpinggroup(autopinger: AlljoynAutopinger, group: Pcstr, listener: AlljoynPinglistener, pinginterval: UInt)

public expect fun alljoynAutopingerCreate(bus: AlljoynBusattachment): AlljoynAutopinger

public expect fun alljoynAutopingerDestroy(autopinger: AlljoynAutopinger)

public expect fun alljoynAutopingerPause(autopinger: AlljoynAutopinger)

public expect fun alljoynAutopingerRemovedestination(autopinger: AlljoynAutopinger, group: Pcstr, destination: Pcstr, removeall: Int): QStatus

public expect fun alljoynAutopingerRemovepinggroup(autopinger: AlljoynAutopinger, group: Pcstr)

public expect fun alljoynAutopingerResume(autopinger: AlljoynAutopinger)

public expect fun alljoynAutopingerSetpinginterval(autopinger: AlljoynAutopinger, group: Pcstr, pinginterval: UInt): QStatus

public expect fun alljoynBusattachmentAddlogonentry(bus: AlljoynBusattachment, authmechanism: Pcstr, username: Pcstr, password: Pcstr): QStatus

public expect fun alljoynBusattachmentAddmatch(bus: AlljoynBusattachment, rule: Pcstr): QStatus

public expect fun alljoynBusattachmentAdvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus

public expect fun alljoynBusattachmentBindsessionport(bus: AlljoynBusattachment, sessionport: MutPtr, opts: AlljoynSessionopts, listener: AlljoynSessionportlistener): QStatus

public expect fun alljoynBusattachmentCanceladvertisename(bus: AlljoynBusattachment, name: Pcstr, transports: UShort): QStatus

public expect fun alljoynBusattachmentCancelfindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus

public expect fun alljoynBusattachmentCancelfindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus

public expect fun alljoynBusattachmentCancelwhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus

public expect fun alljoynBusattachmentCancelwhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr, numberinterfaces: ULong): QStatus

public expect fun alljoynBusattachmentClearkeys(bus: AlljoynBusattachment, guid: Pcstr): QStatus

public expect fun alljoynBusattachmentClearkeystore(bus: AlljoynBusattachment)

public expect fun alljoynBusattachmentConnect(bus: AlljoynBusattachment, connectspec: Pcstr): QStatus

public expect fun alljoynBusattachmentCreate(applicationname: Pcstr, allowremotemessages: Int): AlljoynBusattachment

public expect fun alljoynBusattachmentCreateConcurrency(applicationname: Pcstr, allowremotemessages: Int, concurrency: UInt): AlljoynBusattachment

public expect fun alljoynBusattachmentCreateinterface(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr): QStatus

public expect fun alljoynBusattachmentCreateinterfaceSecure(bus: AlljoynBusattachment, name: Pcstr, iface: MutPtr, secpolicy: AlljoynInterfacedescriptionSecuritypolicy): QStatus

public expect fun alljoynBusattachmentCreateinterfacesfromxml(bus: AlljoynBusattachment, xml: Pcstr): QStatus

public expect fun alljoynBusattachmentDeletedefaultkeystore(applicationname: Pcstr): QStatus

public expect fun alljoynBusattachmentDeleteinterface(bus: AlljoynBusattachment, iface: AlljoynInterfacedescription): QStatus

public expect fun alljoynBusattachmentDestroy(bus: AlljoynBusattachment)

public expect fun alljoynBusattachmentDisconnect(bus: AlljoynBusattachment, unused: Pcstr): QStatus

public expect fun alljoynBusattachmentEnableconcurrentcallbacks(bus: AlljoynBusattachment)

public expect fun alljoynBusattachmentEnablepeersecurity(bus: AlljoynBusattachment, authmechanisms: Pcstr, listener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int): QStatus

public expect fun alljoynBusattachmentEnablepeersecuritywithpermissionconfigurationlistener(bus: AlljoynBusattachment, authmechanisms: Pcstr, authlistener: AlljoynAuthlistener, keystorefilename: Pcstr, isshared: Int, permissionconfigurationlistener: AlljoynPermissionconfigurationlistener): QStatus

public expect fun alljoynBusattachmentFindadvertisedname(bus: AlljoynBusattachment, nameprefix: Pcstr): QStatus

public expect fun alljoynBusattachmentFindadvertisednamebytransport(bus: AlljoynBusattachment, nameprefix: Pcstr, transports: UShort): QStatus

public expect fun alljoynBusattachmentGetalljoyndebugobj(bus: AlljoynBusattachment): AlljoynProxybusobject

public expect fun alljoynBusattachmentGetalljoynproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject

public expect fun alljoynBusattachmentGetconcurrency(bus: AlljoynBusattachment): UInt

public expect fun alljoynBusattachmentGetconnectspec(bus: AlljoynBusattachment): Pcstr

public expect fun alljoynBusattachmentGetdbusproxyobj(bus: AlljoynBusattachment): AlljoynProxybusobject

public expect fun alljoynBusattachmentGetglobalguidstring(bus: AlljoynBusattachment): Pcstr

public expect fun alljoynBusattachmentGetinterface(bus: AlljoynBusattachment, name: Pcstr): AlljoynInterfacedescription

public expect fun alljoynBusattachmentGetinterfaces(bus: AlljoynBusattachment, ifaces: ConstPtr, numifaces: ULong): ULong

public expect fun alljoynBusattachmentGetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: MutPtr): QStatus

public expect fun alljoynBusattachmentGetpeerguid(bus: AlljoynBusattachment, name: Pcstr, guid: Pcstr, guidsz: MutPtr): QStatus

public expect fun alljoynBusattachmentGetpermissionconfigurator(bus: AlljoynBusattachment): AlljoynPermissionconfigurator

public expect fun alljoynBusattachmentGettimestamp(): UInt

public expect fun alljoynBusattachmentGetuniquename(bus: AlljoynBusattachment): Pcstr

public expect fun alljoynBusattachmentIsconnected(bus: AlljoynBusattachment): Int

public expect fun alljoynBusattachmentIspeersecurityenabled(bus: AlljoynBusattachment): Int

public expect fun alljoynBusattachmentIsstarted(bus: AlljoynBusattachment): Int

public expect fun alljoynBusattachmentIsstopping(bus: AlljoynBusattachment): Int

public expect fun alljoynBusattachmentJoin(bus: AlljoynBusattachment): QStatus

public expect fun alljoynBusattachmentJoinsession(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, sessionid: MutPtr, opts: AlljoynSessionopts): QStatus

public expect fun alljoynBusattachmentJoinsessionasync(bus: AlljoynBusattachment, sessionhost: Pcstr, sessionport: UShort, listener: AlljoynSessionlistener, opts: AlljoynSessionopts, callback: AlljoynBusattachmentJoinsessioncbPtr, context: MutPtr): QStatus

public expect fun alljoynBusattachmentLeavesession(bus: AlljoynBusattachment, sessionid: UInt): QStatus

public expect fun alljoynBusattachmentNamehasowner(bus: AlljoynBusattachment, name: Pcstr, hasowner: MutPtr): QStatus

public expect fun alljoynBusattachmentPing(bus: AlljoynBusattachment, name: Pcstr, timeout: UInt): QStatus

public expect fun alljoynBusattachmentRegisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener)

public expect fun alljoynBusattachmentRegisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus

public expect fun alljoynBusattachmentRegisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener)

public expect fun alljoynBusattachmentRegisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus

public expect fun alljoynBusattachmentRegisterbusobjectSecure(bus: AlljoynBusattachment, obj: AlljoynBusobject): QStatus

public expect fun alljoynBusattachmentRegisterkeystorelistener(bus: AlljoynBusattachment, listener: AlljoynKeystorelistener): QStatus

public expect fun alljoynBusattachmentRegistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus

public expect fun alljoynBusattachmentRegistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus

public expect fun alljoynBusattachmentReleasename(bus: AlljoynBusattachment, name: Pcstr): QStatus

public expect fun alljoynBusattachmentReloadkeystore(bus: AlljoynBusattachment): QStatus

public expect fun alljoynBusattachmentRemovematch(bus: AlljoynBusattachment, rule: Pcstr): QStatus

public expect fun alljoynBusattachmentRemovesessionmember(bus: AlljoynBusattachment, sessionid: UInt, membername: Pcstr): QStatus

public expect fun alljoynBusattachmentRequestname(bus: AlljoynBusattachment, requestedname: Pcstr, flags: UInt): QStatus

public expect fun alljoynBusattachmentSecureconnection(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus

public expect fun alljoynBusattachmentSecureconnectionasync(bus: AlljoynBusattachment, name: Pcstr, forceauth: Int): QStatus

public expect fun alljoynBusattachmentSetdaemondebug(bus: AlljoynBusattachment, module: Pcstr, level: UInt): QStatus

public expect fun alljoynBusattachmentSetkeyexpiration(bus: AlljoynBusattachment, guid: Pcstr, timeout: UInt): QStatus

public expect fun alljoynBusattachmentSetlinktimeout(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: MutPtr): QStatus

public expect fun alljoynBusattachmentSetlinktimeoutasync(bus: AlljoynBusattachment, sessionid: UInt, linktimeout: UInt, callback: AlljoynBusattachmentSetlinktimeoutcbPtr, context: MutPtr): QStatus

public expect fun alljoynBusattachmentSetsessionlistener(bus: AlljoynBusattachment, sessionid: UInt, listener: AlljoynSessionlistener): QStatus

public expect fun alljoynBusattachmentStart(bus: AlljoynBusattachment): QStatus

public expect fun alljoynBusattachmentStop(bus: AlljoynBusattachment): QStatus

public expect fun alljoynBusattachmentUnbindsessionport(bus: AlljoynBusattachment, sessionport: UShort): QStatus

public expect fun alljoynBusattachmentUnregisteraboutlistener(bus: AlljoynBusattachment, aboutlistener: AlljoynAboutlistener)

public expect fun alljoynBusattachmentUnregisterallaboutlisteners(bus: AlljoynBusattachment)

public expect fun alljoynBusattachmentUnregisterallhandlers(bus: AlljoynBusattachment): QStatus

public expect fun alljoynBusattachmentUnregisterapplicationstatelistener(bus: AlljoynBusattachment, listener: AlljoynApplicationstatelistener): QStatus

public expect fun alljoynBusattachmentUnregisterbuslistener(bus: AlljoynBusattachment, listener: AlljoynBuslistener)

public expect fun alljoynBusattachmentUnregisterbusobject(bus: AlljoynBusattachment, obj: AlljoynBusobject)

public expect fun alljoynBusattachmentUnregistersignalhandler(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, srcpath: Pcstr): QStatus

public expect fun alljoynBusattachmentUnregistersignalhandlerwithrule(bus: AlljoynBusattachment, signalHandler: AlljoynMessagereceiverSignalhandlerPtr, member: AlljoynInterfacedescriptionMember, matchrule: Pcstr): QStatus

public expect fun alljoynBusattachmentWhoimplementsInterface(bus: AlljoynBusattachment, implementsinterface: Pcstr): QStatus

public expect fun alljoynBusattachmentWhoimplementsInterfaces(bus: AlljoynBusattachment, implementsinterfaces: ConstPtr, numberinterfaces: ULong): QStatus

public expect fun alljoynBuslistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynBuslistener

public expect fun alljoynBuslistenerDestroy(listener: AlljoynBuslistener)

public expect fun alljoynBusobjectAddinterface(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus

public expect fun alljoynBusobjectAddinterfaceAnnounced(bus: AlljoynBusobject, iface: AlljoynInterfacedescription): QStatus

public expect fun alljoynBusobjectAddmethodhandler(bus: AlljoynBusobject, member: AlljoynInterfacedescriptionMember, handler: AlljoynMessagereceiverMethodhandlerPtr, context: MutPtr): QStatus

public expect fun alljoynBusobjectAddmethodhandlers(bus: AlljoynBusobject, entries: ConstPtr, numentries: ULong): QStatus

public expect fun alljoynBusobjectCancelsessionlessmessage(bus: AlljoynBusobject, msg: AlljoynMessage): QStatus

public expect fun alljoynBusobjectCancelsessionlessmessageSerial(bus: AlljoynBusobject, serialnumber: UInt): QStatus

public expect fun alljoynBusobjectCreate(path: Pcstr, isplaceholder: Int, callbacksIn: ConstPtr, contextIn: ConstPtr): AlljoynBusobject

public expect fun alljoynBusobjectDestroy(bus: AlljoynBusobject)

public expect fun alljoynBusobjectEmitpropertieschanged(bus: AlljoynBusobject, ifcname: Pcstr, propnames: ConstPtr, numprops: ULong, id: UInt)

public expect fun alljoynBusobjectEmitpropertychanged(bus: AlljoynBusobject, ifcname: Pcstr, propname: Pcstr, value: AlljoynMsgarg, id: UInt)

public expect fun alljoynBusobjectGetannouncedinterfacenames(bus: AlljoynBusobject, interfaces: ConstPtr, numinterfaces: ULong): ULong

public expect fun alljoynBusobjectGetbusattachment(bus: AlljoynBusobject): AlljoynBusattachment

public expect fun alljoynBusobjectGetname(bus: AlljoynBusobject, buffer: Pcstr, buffersz: ULong): ULong

public expect fun alljoynBusobjectGetpath(bus: AlljoynBusobject): Pcstr

public expect fun alljoynBusobjectIssecure(bus: AlljoynBusobject): Int

public expect fun alljoynBusobjectMethodreplyArgs(bus: AlljoynBusobject, msg: AlljoynMessage, args: AlljoynMsgarg, numargs: ULong): QStatus

public expect fun alljoynBusobjectMethodreplyErr(bus: AlljoynBusobject, msg: AlljoynMessage, error: Pcstr, errormessage: Pcstr): QStatus

public expect fun alljoynBusobjectMethodreplyStatus(bus: AlljoynBusobject, msg: AlljoynMessage, status: QStatus): QStatus

public expect fun alljoynBusobjectSetannounceflag(bus: AlljoynBusobject, iface: AlljoynInterfacedescription, isannounced: AlljoynAboutAnnounceflag): QStatus

public expect fun alljoynBusobjectSignal(bus: AlljoynBusobject, destination: Pcstr, sessionid: UInt, signal: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, timetolive: UShort, flags: UByte, msg: AlljoynMessage): QStatus

public expect fun alljoynCredentialsClear(cred: AlljoynCredentials)

public expect fun alljoynCredentialsCreate(): AlljoynCredentials

public expect fun alljoynCredentialsDestroy(cred: AlljoynCredentials)

public expect fun alljoynCredentialsGetcertchain(cred: AlljoynCredentials): Pcstr

public expect fun alljoynCredentialsGetexpiration(cred: AlljoynCredentials): UInt

public expect fun alljoynCredentialsGetlogonentry(cred: AlljoynCredentials): Pcstr

public expect fun alljoynCredentialsGetpassword(cred: AlljoynCredentials): Pcstr

public expect fun alljoynCredentialsGetprivateKey(cred: AlljoynCredentials): Pcstr

public expect fun alljoynCredentialsGetusername(cred: AlljoynCredentials): Pcstr

public expect fun alljoynCredentialsIsset(cred: AlljoynCredentials, creds: UShort): Int

public expect fun alljoynCredentialsSetcertchain(cred: AlljoynCredentials, certchain: Pcstr)

public expect fun alljoynCredentialsSetexpiration(cred: AlljoynCredentials, expiration: UInt)

public expect fun alljoynCredentialsSetlogonentry(cred: AlljoynCredentials, logonentry: Pcstr)

public expect fun alljoynCredentialsSetpassword(cred: AlljoynCredentials, pwd: Pcstr)

public expect fun alljoynCredentialsSetprivatekey(cred: AlljoynCredentials, pk: Pcstr)

public expect fun alljoynCredentialsSetusername(cred: AlljoynCredentials, username: Pcstr)

public expect fun alljoynGetbuildinfo(): Pcstr

public expect fun alljoynGetnumericversion(): UInt

public expect fun alljoynGetversion(): Pcstr

public expect fun alljoynInit(): QStatus

public expect fun alljoynInterfacedescriptionActivate(iface: AlljoynInterfacedescription)

public expect fun alljoynInterfacedescriptionAddannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionAddargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionAddmember(iface: AlljoynInterfacedescription, type: AlljoynMessagetype, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte): QStatus

public expect fun alljoynInterfacedescriptionAddmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionAddmethod(iface: AlljoynInterfacedescription, name: Pcstr, inputsig: Pcstr, outsig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionAddproperty(iface: AlljoynInterfacedescription, name: Pcstr, signature: Pcstr, access: UByte): QStatus

public expect fun alljoynInterfacedescriptionAddpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionAddsignal(iface: AlljoynInterfacedescription, name: Pcstr, sig: Pcstr, argnames: Pcstr, annotation: UByte, accessperms: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionEql(one: AlljoynInterfacedescription, other: AlljoynInterfacedescription): Int

public expect fun alljoynInterfacedescriptionGetannotation(iface: AlljoynInterfacedescription, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetannotationatindex(iface: AlljoynInterfacedescription, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr)

public expect fun alljoynInterfacedescriptionGetannotationscount(iface: AlljoynInterfacedescription): ULong

public expect fun alljoynInterfacedescriptionGetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong

public expect fun alljoynInterfacedescriptionGetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong

public expect fun alljoynInterfacedescriptionGetdescriptionlanguages(iface: AlljoynInterfacedescription, languages: ConstPtr, size: ULong): ULong

public expect fun alljoynInterfacedescriptionGetdescriptionlanguages2(iface: AlljoynInterfacedescription, languages: Pcstr, languagessize: ULong): ULong

public expect fun alljoynInterfacedescriptionGetdescriptiontranslationcallback(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionTranslationCallbackPtr

public expect fun alljoynInterfacedescriptionGetmember(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetmemberannotation(iface: AlljoynInterfacedescription, member: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetmemberargannotation(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong

public expect fun alljoynInterfacedescriptionGetmembers(iface: AlljoynInterfacedescription, members: MutPtr, nummembers: ULong): ULong

public expect fun alljoynInterfacedescriptionGetmethod(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetname(iface: AlljoynInterfacedescription): Pcstr

public expect fun alljoynInterfacedescriptionGetproperties(iface: AlljoynInterfacedescription, props: MutPtr, numprops: ULong): ULong

public expect fun alljoynInterfacedescriptionGetproperty(iface: AlljoynInterfacedescription, name: Pcstr, property: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetpropertyannotation(iface: AlljoynInterfacedescription, property: Pcstr, name: Pcstr, value: Pcstr, strSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionGetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, property: Pcstr, description: Pcstr, maxlanguagelength: ULong, languagetag: Pcstr): ULong

public expect fun alljoynInterfacedescriptionGetsecuritypolicy(iface: AlljoynInterfacedescription): AlljoynInterfacedescriptionSecuritypolicy

public expect fun alljoynInterfacedescriptionGetsignal(iface: AlljoynInterfacedescription, name: Pcstr, member: MutPtr): Int

public expect fun alljoynInterfacedescriptionHasdescription(iface: AlljoynInterfacedescription): Int

public expect fun alljoynInterfacedescriptionHasmember(iface: AlljoynInterfacedescription, name: Pcstr, insig: Pcstr, outsig: Pcstr): Int

public expect fun alljoynInterfacedescriptionHasproperties(iface: AlljoynInterfacedescription): Int

public expect fun alljoynInterfacedescriptionHasproperty(iface: AlljoynInterfacedescription, name: Pcstr): Int

public expect fun alljoynInterfacedescriptionIntrospect(iface: AlljoynInterfacedescription, str: Pcstr, buf: ULong, indent: ULong): ULong

public expect fun alljoynInterfacedescriptionIssecure(iface: AlljoynInterfacedescription): Int

public expect fun alljoynInterfacedescriptionMemberEql(one: AlljoynInterfacedescriptionMember, other: AlljoynInterfacedescriptionMember): Int

public expect fun alljoynInterfacedescriptionMemberGetannotation(member: AlljoynInterfacedescriptionMember, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionMemberGetannotationatindex(member: AlljoynInterfacedescriptionMember, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr)

public expect fun alljoynInterfacedescriptionMemberGetannotationscount(member: AlljoynInterfacedescriptionMember): ULong

public expect fun alljoynInterfacedescriptionMemberGetargannotation(member: AlljoynInterfacedescriptionMember, argname: Pcstr, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionMemberGetargannotationatindex(member: AlljoynInterfacedescriptionMember, argname: Pcstr, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr)

public expect fun alljoynInterfacedescriptionMemberGetargannotationscount(member: AlljoynInterfacedescriptionMember, argname: Pcstr): ULong

public expect fun alljoynInterfacedescriptionPropertyEql(one: AlljoynInterfacedescriptionProperty, other: AlljoynInterfacedescriptionProperty): Int

public expect fun alljoynInterfacedescriptionPropertyGetannotation(property: AlljoynInterfacedescriptionProperty, name: Pcstr, value: Pcstr, valueSize: MutPtr): Int

public expect fun alljoynInterfacedescriptionPropertyGetannotationatindex(property: AlljoynInterfacedescriptionProperty, index: ULong, name: Pcstr, nameSize: MutPtr, value: Pcstr, valueSize: MutPtr)

public expect fun alljoynInterfacedescriptionPropertyGetannotationscount(property: AlljoynInterfacedescriptionProperty): ULong

public expect fun alljoynInterfacedescriptionSetargdescription(iface: AlljoynInterfacedescription, member: Pcstr, argname: Pcstr, description: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionSetargdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, arg: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionSetdescription(iface: AlljoynInterfacedescription, description: Pcstr)

public expect fun alljoynInterfacedescriptionSetdescriptionforlanguage(iface: AlljoynInterfacedescription, description: Pcstr, languagetag: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionSetdescriptionlanguage(iface: AlljoynInterfacedescription, language: Pcstr)

public expect fun alljoynInterfacedescriptionSetdescriptiontranslationcallback(iface: AlljoynInterfacedescription, translationcallback: AlljoynInterfacedescriptionTranslationCallbackPtr)

public expect fun alljoynInterfacedescriptionSetmemberdescription(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionSetmemberdescriptionforlanguage(iface: AlljoynInterfacedescription, member: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionSetpropertydescription(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr): QStatus

public expect fun alljoynInterfacedescriptionSetpropertydescriptionforlanguage(iface: AlljoynInterfacedescription, name: Pcstr, description: Pcstr, languagetag: Pcstr): QStatus

public expect fun alljoynKeystorelistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynKeystorelistener

public expect fun alljoynKeystorelistenerDestroy(listener: AlljoynKeystorelistener)

public expect fun alljoynKeystorelistenerGetkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, sink: Pcstr, sinkSz: MutPtr): QStatus

public expect fun alljoynKeystorelistenerPutkeys(listener: AlljoynKeystorelistener, keystore: AlljoynKeystore, source: Pcstr, password: Pcstr): QStatus

public expect fun alljoynKeystorelistenerWithSynchronizationCreate(callbacks: ConstPtr, context: MutPtr): AlljoynKeystorelistener

public expect fun alljoynMessageCreate(bus: AlljoynBusattachment): AlljoynMessage

public expect fun alljoynMessageDescription(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong

public expect fun alljoynMessageDestroy(msg: AlljoynMessage)

public expect fun alljoynMessageEql(one: AlljoynMessage, other: AlljoynMessage): Int

public expect fun alljoynMessageGetarg(msg: AlljoynMessage, argn: ULong): AlljoynMsgarg

public expect fun alljoynMessageGetargs(msg: AlljoynMessage, numargs: MutPtr, args: MutPtr)

public expect fun alljoynMessageGetauthmechanism(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGetcallserial(msg: AlljoynMessage): UInt

public expect fun alljoynMessageGetcompressiontoken(msg: AlljoynMessage): UInt

public expect fun alljoynMessageGetdestination(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGeterrorname(msg: AlljoynMessage, errormessage: Pcstr, errormessageSize: MutPtr): Pcstr

public expect fun alljoynMessageGetflags(msg: AlljoynMessage): UByte

public expect fun alljoynMessageGetinterface(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGetmembername(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGetobjectpath(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGetreceiveendpointname(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGetreplyserial(msg: AlljoynMessage): UInt

public expect fun alljoynMessageGetsender(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGetsessionid(msg: AlljoynMessage): UInt

public expect fun alljoynMessageGetsignature(msg: AlljoynMessage): Pcstr

public expect fun alljoynMessageGettimestamp(msg: AlljoynMessage): UInt

public expect fun alljoynMessageGettype(msg: AlljoynMessage): AlljoynMessagetype

public expect fun alljoynMessageIsbroadcastsignal(msg: AlljoynMessage): Int

public expect fun alljoynMessageIsencrypted(msg: AlljoynMessage): Int

public expect fun alljoynMessageIsexpired(msg: AlljoynMessage, tillexpirems: MutPtr): Int

public expect fun alljoynMessageIsglobalbroadcast(msg: AlljoynMessage): Int

public expect fun alljoynMessageIssessionless(msg: AlljoynMessage): Int

public expect fun alljoynMessageIsunreliable(msg: AlljoynMessage): Int

public expect fun alljoynMessageParseargs(msg: AlljoynMessage, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMessageSetendianess(endian: Byte)

public expect fun alljoynMessageTostring(msg: AlljoynMessage, str: Pcstr, buf: ULong): ULong

public expect fun alljoynMsgargArrayCreate(size: ULong): AlljoynMsgarg

public expect fun alljoynMsgargArrayElement(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg

public expect fun alljoynMsgargArrayGet(args: AlljoynMsgarg, numargs: ULong, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargArraySet(args: AlljoynMsgarg, numargs: MutPtr, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargArraySetOffset(args: AlljoynMsgarg, argoffset: ULong, numargs: MutPtr, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargArraySignature(values: AlljoynMsgarg, numvalues: ULong, str: Pcstr, buf: ULong): ULong

public expect fun alljoynMsgargArrayTostring(args: AlljoynMsgarg, numargs: ULong, str: Pcstr, buf: ULong, indent: ULong): ULong

public expect fun alljoynMsgargClear(arg: AlljoynMsgarg)

public expect fun alljoynMsgargClone(destination: AlljoynMsgarg, source: AlljoynMsgarg)

public expect fun alljoynMsgargCopy(source: AlljoynMsgarg): AlljoynMsgarg

public expect fun alljoynMsgargCreate(): AlljoynMsgarg

public expect fun alljoynMsgargCreateAndSet(signature: Pcstr, vararg variadicArgs: Long): AlljoynMsgarg

public expect fun alljoynMsgargDestroy(arg: AlljoynMsgarg)

public expect fun alljoynMsgargEqual(lhv: AlljoynMsgarg, rhv: AlljoynMsgarg): Int

public expect fun alljoynMsgargGet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargGetArrayElement(arg: AlljoynMsgarg, index: ULong, element: MutPtr)

public expect fun alljoynMsgargGetArrayElementsignature(arg: AlljoynMsgarg, index: ULong): Pcstr

public expect fun alljoynMsgargGetArrayNumberofelements(arg: AlljoynMsgarg): ULong

public expect fun alljoynMsgargGetBool(arg: AlljoynMsgarg, b: MutPtr): QStatus

public expect fun alljoynMsgargGetBoolArray(arg: AlljoynMsgarg, length: MutPtr, ab: MutPtr): QStatus

public expect fun alljoynMsgargGetDouble(arg: AlljoynMsgarg, d: MutPtr): QStatus

public expect fun alljoynMsgargGetDoubleArray(arg: AlljoynMsgarg, length: MutPtr, ad: MutPtr): QStatus

public expect fun alljoynMsgargGetInt16(arg: AlljoynMsgarg, n: MutPtr): QStatus

public expect fun alljoynMsgargGetInt16Array(arg: AlljoynMsgarg, length: MutPtr, an: MutPtr): QStatus

public expect fun alljoynMsgargGetInt32(arg: AlljoynMsgarg, i: MutPtr): QStatus

public expect fun alljoynMsgargGetInt32Array(arg: AlljoynMsgarg, length: MutPtr, ai: MutPtr): QStatus

public expect fun alljoynMsgargGetInt64(arg: AlljoynMsgarg, x: MutPtr): QStatus

public expect fun alljoynMsgargGetInt64Array(arg: AlljoynMsgarg, length: MutPtr, ax: MutPtr): QStatus

public expect fun alljoynMsgargGetObjectpath(arg: AlljoynMsgarg, o: MutPtr): QStatus

public expect fun alljoynMsgargGetSignature(arg: AlljoynMsgarg, g: MutPtr): QStatus

public expect fun alljoynMsgargGetString(arg: AlljoynMsgarg, s: MutPtr): QStatus

public expect fun alljoynMsgargGetUint16(arg: AlljoynMsgarg, q: MutPtr): QStatus

public expect fun alljoynMsgargGetUint16Array(arg: AlljoynMsgarg, length: MutPtr, aq: MutPtr): QStatus

public expect fun alljoynMsgargGetUint32(arg: AlljoynMsgarg, u: MutPtr): QStatus

public expect fun alljoynMsgargGetUint32Array(arg: AlljoynMsgarg, length: MutPtr, au: MutPtr): QStatus

public expect fun alljoynMsgargGetUint64(arg: AlljoynMsgarg, t: MutPtr): QStatus

public expect fun alljoynMsgargGetUint64Array(arg: AlljoynMsgarg, length: MutPtr, at: MutPtr): QStatus

public expect fun alljoynMsgargGetUint8(arg: AlljoynMsgarg, y: MutPtr): QStatus

public expect fun alljoynMsgargGetUint8Array(arg: AlljoynMsgarg, length: MutPtr, ay: MutPtr): QStatus

public expect fun alljoynMsgargGetVariant(arg: AlljoynMsgarg, v: AlljoynMsgarg): QStatus

public expect fun alljoynMsgargGetVariantArray(arg: AlljoynMsgarg, signature: Pcstr, length: MutPtr, av: MutPtr): QStatus

public expect fun alljoynMsgargGetdictelement(arg: AlljoynMsgarg, elemsig: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargGetkey(arg: AlljoynMsgarg): AlljoynMsgarg

public expect fun alljoynMsgargGetmember(arg: AlljoynMsgarg, index: ULong): AlljoynMsgarg

public expect fun alljoynMsgargGetnummembers(arg: AlljoynMsgarg): ULong

public expect fun alljoynMsgargGettype(arg: AlljoynMsgarg): AlljoynTypeid

public expect fun alljoynMsgargGetvalue(arg: AlljoynMsgarg): AlljoynMsgarg

public expect fun alljoynMsgargHassignature(arg: AlljoynMsgarg, signature: Pcstr): Int

public expect fun alljoynMsgargSet(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargSetAndStabilize(arg: AlljoynMsgarg, signature: Pcstr, vararg variadicArgs: Long): QStatus

public expect fun alljoynMsgargSetBool(arg: AlljoynMsgarg, b: Int): QStatus

public expect fun alljoynMsgargSetBoolArray(arg: AlljoynMsgarg, length: ULong, ab: MutPtr): QStatus

public expect fun alljoynMsgargSetDouble(arg: AlljoynMsgarg, d: Double): QStatus

public expect fun alljoynMsgargSetDoubleArray(arg: AlljoynMsgarg, length: ULong, ad: MutPtr): QStatus

public expect fun alljoynMsgargSetInt16(arg: AlljoynMsgarg, n: Short): QStatus

public expect fun alljoynMsgargSetInt16Array(arg: AlljoynMsgarg, length: ULong, an: MutPtr): QStatus

public expect fun alljoynMsgargSetInt32(arg: AlljoynMsgarg, i: Int): QStatus

public expect fun alljoynMsgargSetInt32Array(arg: AlljoynMsgarg, length: ULong, ai: MutPtr): QStatus

public expect fun alljoynMsgargSetInt64(arg: AlljoynMsgarg, x: Long): QStatus

public expect fun alljoynMsgargSetInt64Array(arg: AlljoynMsgarg, length: ULong, ax: MutPtr): QStatus

public expect fun alljoynMsgargSetObjectpath(arg: AlljoynMsgarg, o: Pcstr): QStatus

public expect fun alljoynMsgargSetObjectpathArray(arg: AlljoynMsgarg, length: ULong, ao: ConstPtr): QStatus

public expect fun alljoynMsgargSetSignature(arg: AlljoynMsgarg, g: Pcstr): QStatus

public expect fun alljoynMsgargSetSignatureArray(arg: AlljoynMsgarg, length: ULong, ag: ConstPtr): QStatus

public expect fun alljoynMsgargSetString(arg: AlljoynMsgarg, s: Pcstr): QStatus

public expect fun alljoynMsgargSetStringArray(arg: AlljoynMsgarg, length: ULong, asTarget: ConstPtr): QStatus

public expect fun alljoynMsgargSetUint16(arg: AlljoynMsgarg, q: UShort): QStatus

public expect fun alljoynMsgargSetUint16Array(arg: AlljoynMsgarg, length: ULong, aq: MutPtr): QStatus

public expect fun alljoynMsgargSetUint32(arg: AlljoynMsgarg, u: UInt): QStatus

public expect fun alljoynMsgargSetUint32Array(arg: AlljoynMsgarg, length: ULong, au: MutPtr): QStatus

public expect fun alljoynMsgargSetUint64(arg: AlljoynMsgarg, t: ULong): QStatus

public expect fun alljoynMsgargSetUint64Array(arg: AlljoynMsgarg, length: ULong, at: MutPtr): QStatus

public expect fun alljoynMsgargSetUint8(arg: AlljoynMsgarg, y: UByte): QStatus

public expect fun alljoynMsgargSetUint8Array(arg: AlljoynMsgarg, length: ULong, ay: MutPtr): QStatus

public expect fun alljoynMsgargSetdictentry(arg: AlljoynMsgarg, key: AlljoynMsgarg, value: AlljoynMsgarg): QStatus

public expect fun alljoynMsgargSetstruct(arg: AlljoynMsgarg, structMembers: AlljoynMsgarg, numMembers: ULong): QStatus

public expect fun alljoynMsgargSignature(arg: AlljoynMsgarg, str: Pcstr, buf: ULong): ULong

public expect fun alljoynMsgargStabilize(arg: AlljoynMsgarg)

public expect fun alljoynMsgargTostring(arg: AlljoynMsgarg, str: Pcstr, buf: ULong, indent: ULong): ULong

public expect fun alljoynObserverCreate(bus: AlljoynBusattachment, mandatoryinterfaces: ConstPtr, nummandatoryinterfaces: ULong): AlljoynObserver

public expect fun alljoynObserverDestroy(observer: AlljoynObserver)

public expect fun alljoynObserverGet(observer: AlljoynObserver, uniquebusname: Pcstr, objectpath: Pcstr): AlljoynProxybusobjectRef

public expect fun alljoynObserverGetfirst(observer: AlljoynObserver): AlljoynProxybusobjectRef

public expect fun alljoynObserverGetnext(observer: AlljoynObserver, proxyref: AlljoynProxybusobjectRef): AlljoynProxybusobjectRef

public expect fun alljoynObserverRegisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener, triggeronexisting: Int)

public expect fun alljoynObserverUnregisteralllisteners(observer: AlljoynObserver)

public expect fun alljoynObserverUnregisterlistener(observer: AlljoynObserver, listener: AlljoynObserverlistener)

public expect fun alljoynObserverlistenerCreate(callback: ConstPtr, context: ConstPtr): AlljoynObserverlistener

public expect fun alljoynObserverlistenerDestroy(listener: AlljoynObserverlistener)

public expect fun alljoynPasswordmanagerSetcredentials(authmechanism: Pcstr, password: Pcstr): QStatus

public expect fun alljoynPermissionconfigurationlistenerCreate(callbacks: ConstPtr, context: ConstPtr): AlljoynPermissionconfigurationlistener

public expect fun alljoynPermissionconfigurationlistenerDestroy(listener: AlljoynPermissionconfigurationlistener)

public expect fun alljoynPermissionconfiguratorCertificatechainDestroy(certificatechain: MutPtr)

public expect fun alljoynPermissionconfiguratorCertificateidCleanup(certificateid: MutPtr)

public expect fun alljoynPermissionconfiguratorCertificateidarrayCleanup(certificateidarray: MutPtr)

public expect fun alljoynPermissionconfiguratorClaim(configurator: AlljoynPermissionconfigurator, cakey: MutPtr, identitycertificatechain: MutPtr, groupid: ConstPtr, groupsize: ULong, groupauthority: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus

public expect fun alljoynPermissionconfiguratorEndmanagement(configurator: AlljoynPermissionconfigurator): QStatus

public expect fun alljoynPermissionconfiguratorGetapplicationstate(configurator: AlljoynPermissionconfigurator, state: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetdefaultclaimcapabilities(): UShort

public expect fun alljoynPermissionconfiguratorGetdefaultpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetidentitycertificateid(configurator: AlljoynPermissionconfigurator, certificateid: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetmanifests(configurator: AlljoynPermissionconfigurator, manifestarray: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetmanifesttemplate(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetmembershipsummaries(configurator: AlljoynPermissionconfigurator, certificateids: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetpolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorGetpublickey(configurator: AlljoynPermissionconfigurator, publickey: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorInstallmanifests(configurator: AlljoynPermissionconfigurator, manifestsxmls: MutPtr, manifestscount: ULong, append: Int): QStatus

public expect fun alljoynPermissionconfiguratorInstallmembership(configurator: AlljoynPermissionconfigurator, membershipcertificatechain: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorManifestarrayCleanup(manifestarray: MutPtr)

public expect fun alljoynPermissionconfiguratorManifesttemplateDestroy(manifesttemplatexml: MutPtr)

public expect fun alljoynPermissionconfiguratorPolicyDestroy(policyxml: MutPtr)

public expect fun alljoynPermissionconfiguratorPublickeyDestroy(publickey: MutPtr)

public expect fun alljoynPermissionconfiguratorRemovemembership(configurator: AlljoynPermissionconfigurator, serial: ConstPtr, seriallen: ULong, issuerpublickey: MutPtr, issueraki: ConstPtr, issuerakilen: ULong): QStatus

public expect fun alljoynPermissionconfiguratorReset(configurator: AlljoynPermissionconfigurator): QStatus

public expect fun alljoynPermissionconfiguratorResetpolicy(configurator: AlljoynPermissionconfigurator): QStatus

public expect fun alljoynPermissionconfiguratorSetapplicationstate(configurator: AlljoynPermissionconfigurator, state: AlljoynApplicationstate): QStatus

public expect fun alljoynPermissionconfiguratorSetclaimcapabilities(configurator: AlljoynPermissionconfigurator, claimcapabilities: UShort): QStatus

public expect fun alljoynPermissionconfiguratorSetclaimcapabilitiesadditionalinfo(configurator: AlljoynPermissionconfigurator, additionalinfo: UShort): QStatus

public expect fun alljoynPermissionconfiguratorSetmanifesttemplatefromxml(configurator: AlljoynPermissionconfigurator, manifesttemplatexml: MutPtr): QStatus

public expect fun alljoynPermissionconfiguratorStartmanagement(configurator: AlljoynPermissionconfigurator): QStatus

public expect fun alljoynPermissionconfiguratorUpdateidentity(configurator: AlljoynPermissionconfigurator, identitycertificatechain: MutPtr, manifestsxmls: MutPtr, manifestscount: ULong): QStatus

public expect fun alljoynPermissionconfiguratorUpdatepolicy(configurator: AlljoynPermissionconfigurator, policyxml: MutPtr): QStatus

public expect fun alljoynPinglistenerCreate(callback: ConstPtr, context: ConstPtr): AlljoynPinglistener

public expect fun alljoynPinglistenerDestroy(listener: AlljoynPinglistener)

public expect fun alljoynProxybusobjectAddchild(proxyobj: AlljoynProxybusobject, child: AlljoynProxybusobject): QStatus

public expect fun alljoynProxybusobjectAddinterface(proxyobj: AlljoynProxybusobject, iface: AlljoynInterfacedescription): QStatus

public expect fun alljoynProxybusobjectAddinterfaceByName(proxyobj: AlljoynProxybusobject, name: Pcstr): QStatus

public expect fun alljoynProxybusobjectCopy(source: AlljoynProxybusobject): AlljoynProxybusobject

public expect fun alljoynProxybusobjectCreate(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject

public expect fun alljoynProxybusobjectCreateSecure(bus: AlljoynBusattachment, service: Pcstr, path: Pcstr, sessionid: UInt): AlljoynProxybusobject

public expect fun alljoynProxybusobjectDestroy(proxyobj: AlljoynProxybusobject)

public expect fun alljoynProxybusobjectEnablepropertycaching(proxyobj: AlljoynProxybusobject)

public expect fun alljoynProxybusobjectGetallproperties(proxyobj: AlljoynProxybusobject, iface: Pcstr, values: AlljoynMsgarg): QStatus

public expect fun alljoynProxybusobjectGetallpropertiesasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerGetallpropertiescbPtr, timeout: UInt, context: MutPtr): QStatus

public expect fun alljoynProxybusobjectGetchild(proxyobj: AlljoynProxybusobject, path: Pcstr): AlljoynProxybusobject

public expect fun alljoynProxybusobjectGetchildren(proxyobj: AlljoynProxybusobject, children: MutPtr, numchildren: ULong): ULong

public expect fun alljoynProxybusobjectGetinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): AlljoynInterfacedescription

public expect fun alljoynProxybusobjectGetinterfaces(proxyobj: AlljoynProxybusobject, ifaces: ConstPtr, numifaces: ULong): ULong

public expect fun alljoynProxybusobjectGetpath(proxyobj: AlljoynProxybusobject): Pcstr

public expect fun alljoynProxybusobjectGetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus

public expect fun alljoynProxybusobjectGetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, callback: AlljoynProxybusobjectListenerGetpropertycbPtr, timeout: UInt, context: MutPtr): QStatus

public expect fun alljoynProxybusobjectGetservicename(proxyobj: AlljoynProxybusobject): Pcstr

public expect fun alljoynProxybusobjectGetsessionid(proxyobj: AlljoynProxybusobject): UInt

public expect fun alljoynProxybusobjectGetuniquename(proxyobj: AlljoynProxybusobject): Pcstr

public expect fun alljoynProxybusobjectImplementsinterface(proxyobj: AlljoynProxybusobject, iface: Pcstr): Int

public expect fun alljoynProxybusobjectIntrospectremoteobject(proxyobj: AlljoynProxybusobject): QStatus

public expect fun alljoynProxybusobjectIntrospectremoteobjectasync(proxyobj: AlljoynProxybusobject, callback: AlljoynProxybusobjectListenerIntrospectcbPtr, context: MutPtr): QStatus

public expect fun alljoynProxybusobjectIssecure(proxyobj: AlljoynProxybusobject): Int

public expect fun alljoynProxybusobjectIsvalid(proxyobj: AlljoynProxybusobject): Int

public expect fun alljoynProxybusobjectMethodcall(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus

public expect fun alljoynProxybusobjectMethodcallMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, replymsg: AlljoynMessage, timeout: UInt, flags: UByte): QStatus

public expect fun alljoynProxybusobjectMethodcallMemberNoreply(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus

public expect fun alljoynProxybusobjectMethodcallNoreply(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, args: AlljoynMsgarg, numargs: ULong, flags: UByte): QStatus

public expect fun alljoynProxybusobjectMethodcallasync(proxyobj: AlljoynProxybusobject, ifacename: Pcstr, methodname: Pcstr, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr, timeout: UInt, flags: UByte): QStatus

public expect fun alljoynProxybusobjectMethodcallasyncMember(proxyobj: AlljoynProxybusobject, method: AlljoynInterfacedescriptionMember, replyfunc: AlljoynMessagereceiverReplyhandlerPtr, args: AlljoynMsgarg, numargs: ULong, context: MutPtr, timeout: UInt, flags: UByte): QStatus

public expect fun alljoynProxybusobjectParsexml(proxyobj: AlljoynProxybusobject, xml: Pcstr, identifier: Pcstr): QStatus

public expect fun alljoynProxybusobjectRefCreate(proxy: AlljoynProxybusobject): AlljoynProxybusobjectRef

public expect fun alljoynProxybusobjectRefDecref(ref: AlljoynProxybusobjectRef)

public expect fun alljoynProxybusobjectRefGet(ref: AlljoynProxybusobjectRef): AlljoynProxybusobject

public expect fun alljoynProxybusobjectRefIncref(ref: AlljoynProxybusobjectRef)

public expect fun alljoynProxybusobjectRegisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, properties: ConstPtr, numproperties: ULong, callback: AlljoynProxybusobjectListenerPropertieschangedPtr, context: MutPtr): QStatus

public expect fun alljoynProxybusobjectRemovechild(proxyobj: AlljoynProxybusobject, path: Pcstr): QStatus

public expect fun alljoynProxybusobjectSecureconnection(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus

public expect fun alljoynProxybusobjectSecureconnectionasync(proxyobj: AlljoynProxybusobject, forceauth: Int): QStatus

public expect fun alljoynProxybusobjectSetproperty(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg): QStatus

public expect fun alljoynProxybusobjectSetpropertyasync(proxyobj: AlljoynProxybusobject, iface: Pcstr, property: Pcstr, value: AlljoynMsgarg, callback: AlljoynProxybusobjectListenerSetpropertycbPtr, timeout: UInt, context: MutPtr): QStatus

public expect fun alljoynProxybusobjectUnregisterpropertieschangedlistener(proxyobj: AlljoynProxybusobject, iface: Pcstr, callback: AlljoynProxybusobjectListenerPropertieschangedPtr): QStatus

public expect fun alljoynRouterinit(): QStatus
