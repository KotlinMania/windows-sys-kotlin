package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.Priority
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderaV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderwV2
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public expect fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt

public expect fun cmAddEmptyLogConf(plclogconf: MutPtr<ULong>, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret

public expect fun cmAddEmptyLogConfEx(plclogconf: MutPtr<ULong>, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret

public expect fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret

public expect fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmAddResDes(prdresdes: MutPtr<ULong>, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt): Configret

public expect fun cmAddResDesEx(prdresdes: MutPtr<ULong>, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmConnectMachineA(uncservername: Pcstr, phmachine: MutPtr<Long>): Configret

public expect fun cmConnectMachineW(uncservername: Pcwstr, phmachine: MutPtr<Long>): Configret

public expect fun cmCreateDevNodeA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret

public expect fun cmCreateDevNodeW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret

public expect fun cmCreateDevNodeExA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmCreateDevNodeExW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmCreateRangeList(prlh: MutPtr<ULong>, ulflags: UInt): Configret

public expect fun cmDeleteClassKey(classguid: ConstPtr<Guid>, ulflags: UInt): Configret

public expect fun cmDeleteClassKeyEx(classguid: ConstPtr<Guid>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret

public expect fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret

public expect fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret

public expect fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, pbconflictdetected: MutPtr<Bool>, ulflags: UInt): Configret

public expect fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, pbconflictdetected: MutPtr<Bool>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDisconnectMachine(hmachine: Long): Configret

public expect fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmEnumerateClasses(ulclassindex: UInt, classguid: MutPtr<Guid>, ulflags: CmEnumerateFlags): Configret

public expect fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: MutPtr<Guid>, ulflags: CmEnumerateFlags, hmachine: Long): Configret

public expect fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFindRange(pullstart: MutPtr<ULong>, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmFirstRange(rlh: ULong, pullstart: MutPtr<ULong>, pullend: MutPtr<ULong>, preelement: MutPtr<ULong>, ulflags: UInt): Configret

public expect fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret

public expect fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFreeLogConfHandle(lclogconf: ULong): Configret

public expect fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret

public expect fun cmFreeResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, ulflags: UInt): Configret

public expect fun cmFreeResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFreeResDesHandle(rdresdes: ULong): Configret

public expect fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret

public expect fun cmGetChild(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetChildEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassKeyNameA(classguid: ConstPtr<Guid>, pszkeyname: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetClassKeyNameW(classguid: ConstPtr<Guid>, pszkeyname: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetClassKeyNameExA(classguid: ConstPtr<Guid>, pszkeyname: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassKeyNameExW(classguid: ConstPtr<Guid>, pszkeyname: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassNameA(classguid: ConstPtr<Guid>, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetClassNameW(classguid: ConstPtr<Guid>, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetClassNameExA(classguid: ConstPtr<Guid>, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassNameExW(classguid: ConstPtr<Guid>, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassPropertyKeys(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetClassPropertyKeysEx(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassRegistryPropertyA(classguid: ConstPtr<Guid>, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassRegistryPropertyW(classguid: ConstPtr<Guid>, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDepth(puldepth: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDepthEx(puldepth: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeStatus(pulstatus: MutPtr<CmDevnodeStatusFlags>, pulproblemnumber: MutPtr<CmProb>, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDevNodeStatusEx(pulstatus: MutPtr<CmDevnodeStatusFlags>, pulproblemnumber: MutPtr<CmProb>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListSizeA(pullen: MutPtr<UInt>, pszfilter: Pcstr, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListSizeW(pullen: MutPtr<UInt>, pszfilter: Pcwstr, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListSizeExA(pullen: MutPtr<UInt>, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListSizeExW(pullen: MutPtr<UInt>, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdSize(pullen: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdSizeEx(pullen: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListA(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListW(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListExA(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListExW(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListSizeA(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListSizeW(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListSizeExA(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListSizeExW(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetFirstLogConf(plclogconf: MutPtr<ULong>, dndevinst: UInt, ulflags: CmLogConf): Configret

public expect fun cmGetFirstLogConfEx(plclogconf: MutPtr<ULong>, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret

public expect fun cmGetGlobalState(pulstate: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetGlobalStateEx(pulstate: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoA>, ulflags: UInt): Configret

public expect fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoW>, ulflags: UInt): Configret

public expect fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoA>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoW>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetLogConfPriority(lclogconf: ULong, ppriority: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetNextLogConf(plclogconf: MutPtr<ULong>, lclogconf: ULong, ulflags: UInt): Configret

public expect fun cmGetNextLogConfEx(plclogconf: MutPtr<ULong>, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetNextResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr<CmRestype>, ulflags: UInt): Configret

public expect fun cmGetNextResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr<CmRestype>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetParent(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetParentEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResDesData(rdresdes: ULong, buffer: MutPtr<CVoid>, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetResDesDataEx(rdresdes: ULong, buffer: MutPtr<CVoid>, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResDesDataSize(pulsize: MutPtr<UInt>, rdresdes: ULong, ulflags: UInt): Configret

public expect fun cmGetResDesDataSizeEx(pulsize: MutPtr<UInt>, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: MutPtr<UInt>): Configret

public expect fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr<ConflictDetailsA>): Configret

public expect fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr<ConflictDetailsW>): Configret

public expect fun cmGetSibling(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetSiblingEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetVersion(): UShort

public expect fun cmGetVersionEx(hmachine: Long): UShort

public expect fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret

public expect fun cmIsDockStationPresent(pbpresent: MutPtr<Bool>): Configret

public expect fun cmIsDockStationPresentEx(pbpresent: MutPtr<Bool>, hmachine: Long): Configret

public expect fun cmIsVersionAvailable(wversion: UShort): Bool

public expect fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool

public expect fun cmLocateDevNodeA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret

public expect fun cmLocateDevNodeW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret

public expect fun cmLocateDevNodeExA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmLocateDevNodeExW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt

public expect fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmModifyResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt): Configret

public expect fun cmModifyResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret

public expect fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmNextRange(preelement: MutPtr<ULong>, pullstart: MutPtr<ULong>, pullend: MutPtr<ULong>, ulflags: UInt): Configret

public expect fun cmOpenClassKeyA(classguid: ConstPtr<Guid>, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt): Configret

public expect fun cmOpenClassKeyW(classguid: ConstPtr<Guid>, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt): Configret

public expect fun cmOpenClassKeyExA(classguid: ConstPtr<Guid>, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenClassKeyExW(classguid: ConstPtr<Guid>, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr<Hkey>, ulflags: UInt): Configret

public expect fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt): Configret

public expect fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt): Configret

public expect fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryArbitratorFreeData(pdata: MutPtr<CVoid>, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret

public expect fun cmQueryArbitratorFreeDataEx(pdata: MutPtr<CVoid>, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryArbitratorFreeSize(pulsize: MutPtr<UInt>, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret

public expect fun cmQueryArbitratorFreeSizeEx(pulsize: MutPtr<UInt>, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret

public expect fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryResourceConflictList(pclconflictlist: MutPtr<ULong>, dndevinst: UInt, resourceid: CmRestype, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret

public expect fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret

public expect fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterNotification(pfilter: ConstPtr<CmNotifyFilter>, pcontext: ConstPtr<CVoid>, pcallback: PcmNotifyCallback, pnotifycontext: MutPtr<Hcmnotification>): Configret

public expect fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret

public expect fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestEjectPc(): Configret

public expect fun cmRequestEjectPcEx(hmachine: Long): Configret

public expect fun cmRunDetection(ulflags: UInt): Configret

public expect fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassRegistryPropertyA(classguid: ConstPtr<Guid>, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassRegistryPropertyW(classguid: ConstPtr<Guid>, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret

public expect fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret

public expect fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret

public expect fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret

public expect fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret

public expect fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret

public expect fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, flags: DiinstalldeviceFlags, needreboot: MutPtr<Bool>): Bool

public expect fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: MutPtr<Bool>): Bool

public expect fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: MutPtr<Bool>): Bool

public expect fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: MutPtr<Bool>): Bool

public expect fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, flags: UInt, needreboot: MutPtr<Bool>): Bool

public expect fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: MutPtr<Bool>): Bool

public expect fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, flags: UInt, needreboot: MutPtr<Bool>): Bool

public expect fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: MutPtr<Bool>): Bool

public expect fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: MutPtr<Bool>): Bool

public expect fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int)

public expect fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int)

public expect fun setupAddInstallSectionToDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAddInstallSectionToDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAddSectionToDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAddSectionToDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAddToDiskSpaceListA(diskspace: ConstPtr<CVoid>, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAddToDiskSpaceListW(diskspace: ConstPtr<CVoid>, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool

public expect fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool

public expect fun setupAdjustDiskSpaceListA(diskspace: ConstPtr<CVoid>, driveroot: Pcstr, amount: Long, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupAdjustDiskSpaceListW(diskspace: ConstPtr<CVoid>, driveroot: Pcwstr, amount: Long, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool

public expect fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupCancelTemporarySourceList(): Bool

public expect fun setupCloseFileQueue(queuehandle: ConstPtr<CVoid>): Bool

public expect fun setupCloseInfFile(infhandle: ConstPtr<CVoid>)

public expect fun setupCloseLog()

public expect fun setupCommitFileQueueA(owner: Hwnd, queuehandle: ConstPtr<CVoid>, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool

public expect fun setupCommitFileQueueW(owner: Hwnd, queuehandle: ConstPtr<CVoid>, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool

public expect fun setupConfigureWmiFromInfSectionA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: UInt): Bool

public expect fun setupConfigureWmiFromInfSectionW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: UInt): Bool

public expect fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt

public expect fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt

public expect fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: MutPtr<UInt>, destinationinffilenamecomponent: MutPtr<Pstr>): Bool

public expect fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: MutPtr<UInt>, destinationinffilenamecomponent: MutPtr<Pwstr>): Bool

public expect fun setupCreateDiskSpaceListA(reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid>

public expect fun setupCreateDiskSpaceListW(reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid>

public expect fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: ConstPtr<FileCompressionType>): UInt

public expect fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: ConstPtr<FileCompressionType>): UInt

public expect fun setupDefaultQueueCallbackA(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun setupDefaultQueueCallbackW(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupDestroyDiskSpaceList(diskspace: MutPtr<CVoid>): Bool

public expect fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiBuildClassInfoList(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, drivertype: SetupDiDriverType): Bool

public expect fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool

public expect fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiClassNameFromGuidA(classguid: ConstPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiClassNameFromGuidExA(classguid: ConstPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiClassNameFromGuidExW(classguid: ConstPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiClassNameFromGuidW(classguid: ConstPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcstr): Hkey

public expect fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr): Hkey

public expect fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: ConstPtr<Guid>, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiCreateDeviceInfoList(classguid: ConstPtr<Guid>, hwndparent: Hwnd): Hdevinfo

public expect fun setupDiCreateDeviceInfoListExA(classguid: ConstPtr<Guid>, hwndparent: Hwnd, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hdevinfo

public expect fun setupDiCreateDeviceInfoListExW(classguid: ConstPtr<Guid>, hwndparent: Hwnd, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hdevinfo

public expect fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: ConstPtr<Guid>, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcstr): Hkey

public expect fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr): Hkey

public expect fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt): Bool

public expect fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt): Bool

public expect fun setupDiDestroyClassImageList(classimagelistdata: ConstPtr<SpClassimagelistData>): Bool

public expect fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool

public expect fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType): Bool

public expect fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int

public expect fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, memberindex: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool

public expect fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool

public expect fun setupDiGetActualModelsSectionA(context: ConstPtr<Infcontext>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetActualModelsSectionW(context: ConstPtr<Infcontext>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetActualSectionToInstallA(infhandle: ConstPtr<CVoid>, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pstr>): Bool

public expect fun setupDiGetActualSectionToInstallExA(infhandle: ConstPtr<CVoid>, infsectionname: Pcstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pstr>, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetActualSectionToInstallExW(infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pwstr>, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetActualSectionToInstallW(infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pwstr>): Bool

public expect fun setupDiGetClassBitmapIndex(classguid: ConstPtr<Guid>, miniiconindex: MutPtr<Int>): Bool

public expect fun setupDiGetClassDescriptionA(classguid: ConstPtr<Guid>, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetClassDescriptionExA(classguid: ConstPtr<Guid>, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassDescriptionExW(classguid: ConstPtr<Guid>, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassDescriptionW(classguid: ConstPtr<Guid>, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertysheetheader: ConstPtr<PropsheetheaderaV2>, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr<UInt>, propertysheettype: UInt): Bool

public expect fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertysheetheader: ConstPtr<PropsheetheaderwV2>, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr<UInt>, propertysheettype: UInt): Bool

public expect fun setupDiGetClassDevsA(classguid: ConstPtr<Guid>, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo

public expect fun setupDiGetClassDevsExA(classguid: ConstPtr<Guid>, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hdevinfo

public expect fun setupDiGetClassDevsExW(classguid: ConstPtr<Guid>, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hdevinfo

public expect fun setupDiGetClassDevsW(classguid: ConstPtr<Guid>, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo

public expect fun setupDiGetClassImageIndex(classimagelistdata: ConstPtr<SpClassimagelistData>, classguid: ConstPtr<Guid>, imageindex: MutPtr<Int>): Bool

public expect fun setupDiGetClassImageList(classimagelistdata: MutPtr<SpClassimagelistData>): Bool

public expect fun setupDiGetClassImageListExA(classimagelistdata: MutPtr<SpClassimagelistData>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassImageListExW(classimagelistdata: MutPtr<SpClassimagelistData>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: MutPtr<SpClassinstallHeader>, classinstallparamssize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: MutPtr<SpClassinstallHeader>, classinstallparamssize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassPropertyKeys(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool

public expect fun setupDiGetClassPropertyKeysExW(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool

public expect fun setupDiGetClassRegistryPropertyA(classguid: ConstPtr<Guid>, property: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetClassRegistryPropertyW(classguid: ConstPtr<Guid>, property: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: MutPtr<Guid>): Bool

public expect fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr<SpDevinfoListDetailDataA>): Bool

public expect fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr<SpDevinfoListDetailDataW>): Bool

public expect fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: MutPtr<SpDevinstallParamsA>): Bool

public expect fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: MutPtr<SpDevinstallParamsW>): Bool

public expect fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, aliasinterfaceclassguid: ConstPtr<Guid>, aliasdeviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, deviceinterfacedetaildata: MutPtr<SpDeviceInterfaceDetailDataA>, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr<UInt>, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, deviceinterfacedetaildata: MutPtr<SpDeviceInterfaceDetailDataW>, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr<UInt>, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool

public expect fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool

public expect fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool

public expect fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool

public expect fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinfodetaildata: MutPtr<SpDrvinfoDetailDataA>, driverinfodetaildatasize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinfodetaildata: MutPtr<SpDrvinfoDetailDataW>, driverinfodetaildatasize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinstallparams: MutPtr<SpDrvinstallParams>): Bool

public expect fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinstallparams: MutPtr<SpDrvinstallParams>): Bool

public expect fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetHwProfileList(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>): Bool

public expect fun setupDiGetHwProfileListExA(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetHwProfileListExW(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiGetINFClassA(infname: Pcstr, classguid: MutPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetINFClassW(infname: Pcwstr, classguid: MutPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool

public expect fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool

public expect fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, installwizarddata: ConstPtr<SpInstallwizardData>, pagetype: UInt, flags: UInt): Hpropsheetpage

public expect fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr<CVoid>): Bool

public expect fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr<CVoid>, interfaceclassguid: ConstPtr<Guid>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool

public expect fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr<CVoid>, interfaceclassguid: ConstPtr<Guid>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool

public expect fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr<CVoid>): Bool

public expect fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiLoadClassIcon(classguid: ConstPtr<Guid>, largeicon: MutPtr<Hicon>, miniiconindex: MutPtr<Int>): Bool

public expect fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: MutPtr<Hicon>): Bool

public expect fun setupDiOpenClassRegKey(classguid: ConstPtr<Guid>, samdesired: UInt): Hkey

public expect fun setupDiOpenClassRegKeyExA(classguid: ConstPtr<Guid>, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hkey

public expect fun setupDiOpenClassRegKeyExW(classguid: ConstPtr<Guid>, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hkey

public expect fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey

public expect fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt): Hkey

public expect fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: ConstPtr<CVoid>, dupdeviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool

public expect fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: ConstPtr<SpClassinstallHeader>, classinstallparamssize: UInt): Bool

public expect fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: ConstPtr<SpClassinstallHeader>, classinstallparamssize: UInt): Bool

public expect fun setupDiSetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiSetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetClassRegistryPropertyA(classguid: ConstPtr<Guid>, property: UInt, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiSetClassRegistryPropertyW(classguid: ConstPtr<Guid>, property: UInt, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: ConstPtr<SpDevinstallParamsA>): Bool

public expect fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: ConstPtr<SpDevinstallParamsW>): Bool

public expect fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>, flags: UInt, reserved: ConstPtr<CVoid>): Bool

public expect fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt): Bool

public expect fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt): Bool

public expect fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinstallparams: ConstPtr<SpDrvinstallParams>): Bool

public expect fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinstallparams: ConstPtr<SpDrvinstallParams>): Bool

public expect fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool

public expect fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool

public expect fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool

public expect fun setupDuplicateDiskSpaceListA(diskspace: ConstPtr<CVoid>, reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid>

public expect fun setupDuplicateDiskSpaceListW(diskspace: ConstPtr<CVoid>, reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid>

public expect fun setupEnumInfSectionsA(infhandle: ConstPtr<CVoid>, index: UInt, buffer: Pstr, size: UInt, sizeneeded: MutPtr<UInt>): Bool

public expect fun setupEnumInfSectionsW(infhandle: ConstPtr<CVoid>, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: MutPtr<UInt>): Bool

public expect fun setupFindFirstLineA(infhandle: ConstPtr<CVoid>, section: Pcstr, key: Pcstr, context: MutPtr<Infcontext>): Bool

public expect fun setupFindFirstLineW(infhandle: ConstPtr<CVoid>, section: Pcwstr, key: Pcwstr, context: MutPtr<Infcontext>): Bool

public expect fun setupFindNextLine(contextin: ConstPtr<Infcontext>, contextout: MutPtr<Infcontext>): Bool

public expect fun setupFindNextMatchLineA(contextin: ConstPtr<Infcontext>, key: Pcstr, contextout: MutPtr<Infcontext>): Bool

public expect fun setupFindNextMatchLineW(contextin: ConstPtr<Infcontext>, key: Pcwstr, contextout: MutPtr<Infcontext>): Bool

public expect fun setupFreeSourceListA(list: MutPtr<MutPtr<Pcstr>>, count: UInt): Bool

public expect fun setupFreeSourceListW(list: MutPtr<MutPtr<Pcwstr>>, count: UInt): Bool

public expect fun setupGetBackupInformationA(queuehandle: ConstPtr<CVoid>, backupparams: MutPtr<SpBackupQueueParamsV2A>): Bool

public expect fun setupGetBackupInformationW(queuehandle: ConstPtr<CVoid>, backupparams: MutPtr<SpBackupQueueParamsV2W>): Bool

public expect fun setupGetBinaryField(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: MutPtr<UByte>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetFieldCount(context: ConstPtr<Infcontext>): UInt

public expect fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: MutPtr<Pstr>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): UInt

public expect fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr<UInt>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): Bool

public expect fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr<UInt>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): Bool

public expect fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: MutPtr<Pwstr>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): UInt

public expect fun setupGetFileQueueCount(filequeue: ConstPtr<CVoid>, subqueuefileop: UInt, numoperations: MutPtr<UInt>): Bool

public expect fun setupGetFileQueueFlags(filequeue: ConstPtr<CVoid>, flags: MutPtr<UInt>): Bool

public expect fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfInformationA(infspec: ConstPtr<CVoid>, searchcontrol: UInt, returnbuffer: MutPtr<SpInfInformation>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfInformationW(infspec: ConstPtr<CVoid>, searchcontrol: UInt, returnbuffer: MutPtr<SpInfInformation>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetIntField(context: ConstPtr<Infcontext>, fieldindex: UInt, integervalue: MutPtr<Int>): Bool

public expect fun setupGetLineByIndexA(infhandle: ConstPtr<CVoid>, section: Pcstr, index: UInt, context: MutPtr<Infcontext>): Bool

public expect fun setupGetLineByIndexW(infhandle: ConstPtr<CVoid>, section: Pcwstr, index: UInt, context: MutPtr<Infcontext>): Bool

public expect fun setupGetLineCountA(infhandle: ConstPtr<CVoid>, section: Pcstr): Int

public expect fun setupGetLineCountW(infhandle: ConstPtr<CVoid>, section: Pcwstr): Int

public expect fun setupGetLineTextA(context: ConstPtr<Infcontext>, infhandle: ConstPtr<CVoid>, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetLineTextW(context: ConstPtr<Infcontext>, infhandle: ConstPtr<CVoid>, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetMultiSzFieldA(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetMultiSzFieldW(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetNonInteractiveMode(): Bool

public expect fun setupGetSourceFileLocationA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcstr, sourceid: MutPtr<UInt>, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetSourceFileLocationW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcwstr, sourceid: MutPtr<UInt>, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetSourceFileSizeA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcstr, section: Pcstr, filesize: MutPtr<UInt>, roundingfactor: UInt): Bool

public expect fun setupGetSourceFileSizeW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcwstr, section: Pcwstr, filesize: MutPtr<UInt>, roundingfactor: UInt): Bool

public expect fun setupGetSourceInfoA(infhandle: ConstPtr<CVoid>, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetSourceInfoW(infhandle: ConstPtr<CVoid>, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetStringFieldA(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetStringFieldW(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetTargetPathA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetTargetPathW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool

public expect fun setupGetThreadLogToken(): ULong

public expect fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): MutPtr<CVoid>

public expect fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): MutPtr<CVoid>

public expect fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): MutPtr<CVoid>

public expect fun setupInstallFileA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool

public expect fun setupInstallFileExA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr<CVoid>, filewasinuse: MutPtr<Bool>): Bool

public expect fun setupInstallFileExW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr<CVoid>, filewasinuse: MutPtr<Bool>): Bool

public expect fun setupInstallFileW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool

public expect fun setupInstallFilesFromInfSectionA(infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, filequeue: ConstPtr<CVoid>, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool

public expect fun setupInstallFilesFromInfSectionW(infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, filequeue: ConstPtr<CVoid>, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool

public expect fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool

public expect fun setupInstallServicesFromInfSectionA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: SpsvcinstFlags): Bool

public expect fun setupInstallServicesFromInfSectionExA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool

public expect fun setupInstallServicesFromInfSectionExW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool

public expect fun setupInstallServicesFromInfSectionW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool

public expect fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool

public expect fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool

public expect fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool

public expect fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool

public expect fun setupLogFileA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool

public expect fun setupLogFileW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool

public expect fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: ConstPtr<CVoid>, errorline: MutPtr<UInt>): Bool

public expect fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: ConstPtr<CVoid>, errorline: MutPtr<UInt>): Bool

public expect fun setupOpenFileQueue(): MutPtr<CVoid>

public expect fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: MutPtr<UInt>): MutPtr<CVoid>

public expect fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: MutPtr<UInt>): MutPtr<CVoid>

public expect fun setupOpenLog(erase: Bool): Bool
