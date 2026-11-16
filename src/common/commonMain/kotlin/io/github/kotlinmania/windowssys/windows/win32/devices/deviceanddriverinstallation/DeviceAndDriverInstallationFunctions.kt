package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.Priority
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage

public expect fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt

public expect fun cmAddEmptyLogConf(plclogconf: MutPtr, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret

public expect fun cmAddEmptyLogConfEx(plclogconf: MutPtr, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret

public expect fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret

public expect fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmAddResDes(prdresdes: MutPtr, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt): Configret

public expect fun cmAddResDesEx(prdresdes: MutPtr, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmConnectMachineA(uncservername: Pcstr, phmachine: MutPtr): Configret

public expect fun cmConnectMachineW(uncservername: Pcwstr, phmachine: MutPtr): Configret

public expect fun cmCreateDevNodeA(pdndevinst: MutPtr, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret

public expect fun cmCreateDevNodeW(pdndevinst: MutPtr, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret

public expect fun cmCreateDevNodeExA(pdndevinst: MutPtr, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmCreateDevNodeExW(pdndevinst: MutPtr, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmCreateRangeList(prlh: MutPtr, ulflags: UInt): Configret

public expect fun cmDeleteClassKey(classguid: ConstPtr, ulflags: UInt): Configret

public expect fun cmDeleteClassKeyEx(classguid: ConstPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret

public expect fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret

public expect fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret

public expect fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, pbconflictdetected: MutPtr, ulflags: UInt): Configret

public expect fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, pbconflictdetected: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDisconnectMachine(hmachine: Long): Configret

public expect fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmEnumerateClasses(ulclassindex: UInt, classguid: MutPtr, ulflags: CmEnumerateFlags): Configret

public expect fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: MutPtr, ulflags: CmEnumerateFlags, hmachine: Long): Configret

public expect fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFindRange(pullstart: MutPtr, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmFirstRange(rlh: ULong, pullstart: MutPtr, pullend: MutPtr, preelement: MutPtr, ulflags: UInt): Configret

public expect fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret

public expect fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFreeLogConfHandle(lclogconf: ULong): Configret

public expect fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret

public expect fun cmFreeResDes(prdresdes: MutPtr, rdresdes: ULong, ulflags: UInt): Configret

public expect fun cmFreeResDesEx(prdresdes: MutPtr, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFreeResDesHandle(rdresdes: ULong): Configret

public expect fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret

public expect fun cmGetChild(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetChildEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassKeyNameA(classguid: ConstPtr, pszkeyname: Pstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetClassKeyNameW(classguid: ConstPtr, pszkeyname: Pwstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetClassKeyNameExA(classguid: ConstPtr, pszkeyname: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassKeyNameExW(classguid: ConstPtr, pszkeyname: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassNameA(classguid: ConstPtr, buffer: Pstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetClassNameW(classguid: ConstPtr, buffer: Pwstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetClassNameExA(classguid: ConstPtr, buffer: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassNameExW(classguid: ConstPtr, buffer: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret

public expect fun cmGetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassPropertyKeys(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret

public expect fun cmGetClassPropertyKeysEx(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassRegistryPropertyA(classguid: ConstPtr, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassRegistryPropertyW(classguid: ConstPtr, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDepth(puldepth: MutPtr, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDepthEx(puldepth: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr, buffer: MutPtr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeStatus(pulstatus: MutPtr, pulproblemnumber: MutPtr, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDevNodeStatusEx(pulstatus: MutPtr, pulproblemnumber: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListSizeA(pullen: MutPtr, pszfilter: Pcstr, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListSizeW(pullen: MutPtr, pszfilter: Pcwstr, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListSizeExA(pullen: MutPtr, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListSizeExW(pullen: MutPtr, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdSize(pullen: MutPtr, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdSizeEx(pullen: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr, pszaliasdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListA(interfaceclassguid: ConstPtr, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListW(interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListExA(interfaceclassguid: ConstPtr, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListExW(interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListSizeA(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListSizeW(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListSizeExA(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListSizeExW(pullen: MutPtr, interfaceclassguid: ConstPtr, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr, propertykeycount: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetFirstLogConf(plclogconf: MutPtr, dndevinst: UInt, ulflags: CmLogConf): Configret

public expect fun cmGetFirstLogConfEx(plclogconf: MutPtr, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret

public expect fun cmGetGlobalState(pulstate: MutPtr, ulflags: UInt): Configret

public expect fun cmGetGlobalStateEx(pulstate: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt): Configret

public expect fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt): Configret

public expect fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt): Configret

public expect fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt): Configret

public expect fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetLogConfPriority(lclogconf: ULong, ppriority: MutPtr, ulflags: UInt): Configret

public expect fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetNextLogConf(plclogconf: MutPtr, lclogconf: ULong, ulflags: UInt): Configret

public expect fun cmGetNextLogConfEx(plclogconf: MutPtr, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetNextResDes(prdresdes: MutPtr, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr, ulflags: UInt): Configret

public expect fun cmGetNextResDesEx(prdresdes: MutPtr, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetParent(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetParentEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResDesData(rdresdes: ULong, buffer: MutPtr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetResDesDataEx(rdresdes: ULong, buffer: MutPtr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResDesDataSize(pulsize: MutPtr, rdresdes: ULong, ulflags: UInt): Configret

public expect fun cmGetResDesDataSizeEx(pulsize: MutPtr, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: MutPtr): Configret

public expect fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr): Configret

public expect fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr): Configret

public expect fun cmGetSibling(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetSiblingEx(pdndevinst: MutPtr, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetVersion(): UShort

public expect fun cmGetVersionEx(hmachine: Long): UShort

public expect fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret

public expect fun cmIsDockStationPresent(pbpresent: MutPtr): Configret

public expect fun cmIsDockStationPresentEx(pbpresent: MutPtr, hmachine: Long): Configret

public expect fun cmIsVersionAvailable(wversion: UShort): Bool

public expect fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool

public expect fun cmLocateDevNodeA(pdndevinst: MutPtr, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret

public expect fun cmLocateDevNodeW(pdndevinst: MutPtr, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret

public expect fun cmLocateDevNodeExA(pdndevinst: MutPtr, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmLocateDevNodeExW(pdndevinst: MutPtr, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt

public expect fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmModifyResDes(prdresdes: MutPtr, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt): Configret

public expect fun cmModifyResDesEx(prdresdes: MutPtr, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret

public expect fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmNextRange(preelement: MutPtr, pullstart: MutPtr, pullend: MutPtr, ulflags: UInt): Configret

public expect fun cmOpenClassKeyA(classguid: ConstPtr, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt): Configret

public expect fun cmOpenClassKeyW(classguid: ConstPtr, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt): Configret

public expect fun cmOpenClassKeyExA(classguid: ConstPtr, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenClassKeyExW(classguid: ConstPtr, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr, ulflags: UInt): Configret

public expect fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt): Configret

public expect fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt): Configret

public expect fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryArbitratorFreeData(pdata: MutPtr, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret

public expect fun cmQueryArbitratorFreeDataEx(pdata: MutPtr, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryArbitratorFreeSize(pulsize: MutPtr, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret

public expect fun cmQueryArbitratorFreeSizeEx(pulsize: MutPtr, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret

public expect fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryResourceConflictList(pclconflictlist: MutPtr, dndevinst: UInt, resourceid: CmRestype, resourcedata: ConstPtr, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret

public expect fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt): Configret

public expect fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: ConstPtr, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterNotification(pfilter: ConstPtr, pcontext: ConstPtr, pcallback: PcmNotifyCallback, pnotifycontext: MutPtr): Configret

public expect fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret

public expect fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: MutPtr, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestEjectPc(): Configret

public expect fun cmRequestEjectPcEx(hmachine: Long): Configret

public expect fun cmRunDetection(ulflags: UInt): Configret

public expect fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassRegistryPropertyA(classguid: ConstPtr, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassRegistryPropertyW(classguid: ConstPtr, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

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

public expect fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, flags: DiinstalldeviceFlags, needreboot: MutPtr): Bool

public expect fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: MutPtr): Bool

public expect fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: MutPtr): Bool

public expect fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: MutPtr): Bool

public expect fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, flags: UInt, needreboot: MutPtr): Bool

public expect fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: MutPtr): Bool

public expect fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, flags: UInt, needreboot: MutPtr): Bool

public expect fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: MutPtr): Bool

public expect fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: MutPtr): Bool

public expect fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int)

public expect fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int)

public expect fun setupAddInstallSectionToDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcstr, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAddInstallSectionToDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, layoutinfhandle: ConstPtr, sectionname: Pcwstr, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAddSectionToDiskSpaceListA(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAddSectionToDiskSpaceListW(diskspace: ConstPtr, infhandle: ConstPtr, listinfhandle: ConstPtr, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAddToDiskSpaceListA(diskspace: ConstPtr, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAddToDiskSpaceListW(diskspace: ConstPtr, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool

public expect fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool

public expect fun setupAdjustDiskSpaceListA(diskspace: ConstPtr, driveroot: Pcstr, amount: Long, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupAdjustDiskSpaceListW(diskspace: ConstPtr, driveroot: Pcwstr, amount: Long, reserved1: ConstPtr, reserved2: UInt): Bool

public expect fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupCancelTemporarySourceList(): Bool

public expect fun setupCloseFileQueue(queuehandle: ConstPtr): Bool

public expect fun setupCloseInfFile(infhandle: ConstPtr)

public expect fun setupCloseLog()

public expect fun setupCommitFileQueueA(owner: Hwnd, queuehandle: ConstPtr, msghandler: PspFileCallbackA, context: ConstPtr): Bool

public expect fun setupCommitFileQueueW(owner: Hwnd, queuehandle: ConstPtr, msghandler: PspFileCallbackW, context: ConstPtr): Bool

public expect fun setupConfigureWmiFromInfSectionA(infhandle: ConstPtr, sectionname: Pcstr, flags: UInt): Bool

public expect fun setupConfigureWmiFromInfSectionW(infhandle: ConstPtr, sectionname: Pcwstr, flags: UInt): Bool

public expect fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt

public expect fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr): UInt

public expect fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: MutPtr, destinationinffilenamecomponent: MutPtr): Bool

public expect fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: MutPtr, destinationinffilenamecomponent: MutPtr): Bool

public expect fun setupCreateDiskSpaceListA(reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr

public expect fun setupCreateDiskSpaceListW(reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr

public expect fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: ConstPtr): UInt

public expect fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: ConstPtr): UInt

public expect fun setupDefaultQueueCallbackA(context: ConstPtr, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun setupDefaultQueueCallbackW(context: ConstPtr, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupDestroyDiskSpaceList(diskspace: MutPtr): Bool

public expect fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiBuildClassInfoList(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, drivertype: SetupDiDriverType): Bool

public expect fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool

public expect fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: MutPtr, classguidlistsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiClassNameFromGuidA(classguid: ConstPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiClassNameFromGuidExA(classguid: ConstPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiClassNameFromGuidExW(classguid: ConstPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiClassNameFromGuidW(classguid: ConstPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr, infsectionname: Pcstr): Hkey

public expect fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr, infsectionname: Pcwstr): Hkey

public expect fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: ConstPtr, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr): Bool

public expect fun setupDiCreateDeviceInfoList(classguid: ConstPtr, hwndparent: Hwnd): Hdevinfo

public expect fun setupDiCreateDeviceInfoListExA(classguid: ConstPtr, hwndparent: Hwnd, machinename: Pcstr, reserved: ConstPtr): Hdevinfo

public expect fun setupDiCreateDeviceInfoListExW(classguid: ConstPtr, hwndparent: Hwnd, machinename: Pcwstr, reserved: ConstPtr): Hdevinfo

public expect fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: ConstPtr, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr): Bool

public expect fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: MutPtr): Bool

public expect fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt, infhandle: ConstPtr, infsectionname: Pcstr): Hkey

public expect fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt, infhandle: ConstPtr, infsectionname: Pcwstr): Hkey

public expect fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: MutPtr): Bool

public expect fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt): Bool

public expect fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr): Bool

public expect fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt): Bool

public expect fun setupDiDestroyClassImageList(classimagelistdata: ConstPtr): Bool

public expect fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool

public expect fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType): Bool

public expect fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int

public expect fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: MutPtr): Bool

public expect fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, interfaceclassguid: ConstPtr, memberindex: UInt, deviceinterfacedata: MutPtr): Bool

public expect fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr): Bool

public expect fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr): Bool

public expect fun setupDiGetActualModelsSectionA(context: ConstPtr, alternateplatforminfo: ConstPtr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, reserved: ConstPtr): Bool

public expect fun setupDiGetActualModelsSectionW(context: ConstPtr, alternateplatforminfo: ConstPtr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, reserved: ConstPtr): Bool

public expect fun setupDiGetActualSectionToInstallA(infhandle: ConstPtr, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr): Bool

public expect fun setupDiGetActualSectionToInstallExA(infhandle: ConstPtr, infsectionname: Pcstr, alternateplatforminfo: ConstPtr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr, reserved: ConstPtr): Bool

public expect fun setupDiGetActualSectionToInstallExW(infhandle: ConstPtr, infsectionname: Pcwstr, alternateplatforminfo: ConstPtr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr, reserved: ConstPtr): Bool

public expect fun setupDiGetActualSectionToInstallW(infhandle: ConstPtr, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr, extension: MutPtr): Bool

public expect fun setupDiGetClassBitmapIndex(classguid: ConstPtr, miniiconindex: MutPtr): Bool

public expect fun setupDiGetClassDescriptionA(classguid: ConstPtr, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetClassDescriptionExA(classguid: ConstPtr, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassDescriptionExW(classguid: ConstPtr, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassDescriptionW(classguid: ConstPtr, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertysheetheader: ConstPtr, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr, propertysheettype: UInt): Bool

public expect fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertysheetheader: ConstPtr, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr, propertysheettype: UInt): Bool

public expect fun setupDiGetClassDevsA(classguid: ConstPtr, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo

public expect fun setupDiGetClassDevsExA(classguid: ConstPtr, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: ConstPtr): Hdevinfo

public expect fun setupDiGetClassDevsExW(classguid: ConstPtr, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: ConstPtr): Hdevinfo

public expect fun setupDiGetClassDevsW(classguid: ConstPtr, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo

public expect fun setupDiGetClassImageIndex(classimagelistdata: ConstPtr, classguid: ConstPtr, imageindex: MutPtr): Bool

public expect fun setupDiGetClassImageList(classimagelistdata: MutPtr): Bool

public expect fun setupDiGetClassImageListExA(classimagelistdata: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassImageListExW(classimagelistdata: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: MutPtr, classinstallparamssize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: MutPtr, classinstallparamssize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassPropertyKeys(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool

public expect fun setupDiGetClassPropertyKeysExW(classguid: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool

public expect fun setupDiGetClassRegistryPropertyA(classguid: ConstPtr, property: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiGetClassRegistryPropertyW(classguid: ConstPtr, property: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: MutPtr): Bool

public expect fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr): Bool

public expect fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr): Bool

public expect fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: MutPtr): Bool

public expect fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: MutPtr): Bool

public expect fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, aliasinterfaceclassguid: ConstPtr, aliasdeviceinterfacedata: MutPtr): Bool

public expect fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, deviceinterfacedetaildata: MutPtr, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr, deviceinfodata: MutPtr): Bool

public expect fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, deviceinterfacedetaildata: MutPtr, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr, deviceinfodata: MutPtr): Bool

public expect fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool

public expect fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool

public expect fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykeyarray: MutPtr, propertykeycount: UInt, requiredpropertykeycount: MutPtr, flags: UInt): Bool

public expect fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykey: ConstPtr, propertytype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr, flags: UInt): Bool

public expect fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr, propertybuffer: MutPtr, propertybuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinfodetaildata: MutPtr, driverinfodetaildatasize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinfodetaildata: MutPtr, driverinfodetaildatasize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: MutPtr): Bool

public expect fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: MutPtr): Bool

public expect fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetHwProfileList(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr): Bool

public expect fun setupDiGetHwProfileListExA(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiGetHwProfileListExW(hwprofilelist: MutPtr, hwprofilelistsize: UInt, requiredsize: MutPtr, currentlyactiveindex: MutPtr, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiGetINFClassA(infname: Pcstr, classguid: MutPtr, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetINFClassW(infname: Pcwstr, classguid: MutPtr, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr): Bool

public expect fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: MutPtr): Bool

public expect fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: MutPtr): Bool

public expect fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, installwizarddata: ConstPtr, pagetype: UInt, flags: UInt): Hpropsheetpage

public expect fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr): Bool

public expect fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr, interfaceclassguid: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool

public expect fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr, interfaceclassguid: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool

public expect fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr): Bool

public expect fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiLoadClassIcon(classguid: ConstPtr, largeicon: MutPtr, miniiconindex: MutPtr): Bool

public expect fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: MutPtr): Bool

public expect fun setupDiOpenClassRegKey(classguid: ConstPtr, samdesired: UInt): Hkey

public expect fun setupDiOpenClassRegKeyExA(classguid: ConstPtr, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: ConstPtr): Hkey

public expect fun setupDiOpenClassRegKeyExW(classguid: ConstPtr, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Hkey

public expect fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey

public expect fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr): Bool

public expect fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr): Bool

public expect fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: MutPtr): Bool

public expect fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, reserved: UInt, samdesired: UInt): Hkey

public expect fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: MutPtr): Bool

public expect fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: ConstPtr, dupdeviceinfodata: MutPtr): Bool

public expect fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr): Bool

public expect fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: ConstPtr, classinstallparamssize: UInt): Bool

public expect fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, classinstallparams: ConstPtr, classinstallparamssize: UInt): Bool

public expect fun setupDiSetClassPropertyExW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiSetClassPropertyW(classguid: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetClassRegistryPropertyA(classguid: ConstPtr, property: UInt, propertybuffer: ConstPtr, propertybuffersize: UInt, machinename: Pcstr, reserved: ConstPtr): Bool

public expect fun setupDiSetClassRegistryPropertyW(classguid: ConstPtr, property: UInt, propertybuffer: ConstPtr, propertybuffersize: UInt, machinename: Pcwstr, reserved: ConstPtr): Bool

public expect fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: ConstPtr): Bool

public expect fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, deviceinstallparams: ConstPtr): Bool

public expect fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr, flags: UInt, reserved: ConstPtr): Bool

public expect fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, propertykey: ConstPtr, propertytype: Devproptype, propertybuffer: ConstPtr, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, property: SetupDiRegistryProperty, propertybuffer: ConstPtr, propertybuffersize: UInt): Bool

public expect fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, property: SetupDiRegistryProperty, propertybuffer: ConstPtr, propertybuffersize: UInt): Bool

public expect fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: ConstPtr): Bool

public expect fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, driverinfodata: ConstPtr, driverinstallparams: ConstPtr): Bool

public expect fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, driverinfodata: MutPtr): Bool

public expect fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr, driverinfodata: MutPtr): Bool

public expect fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr): Bool

public expect fun setupDuplicateDiskSpaceListA(diskspace: ConstPtr, reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr

public expect fun setupDuplicateDiskSpaceListW(diskspace: ConstPtr, reserved1: ConstPtr, reserved2: UInt, flags: UInt): MutPtr

public expect fun setupEnumInfSectionsA(infhandle: ConstPtr, index: UInt, buffer: Pstr, size: UInt, sizeneeded: MutPtr): Bool

public expect fun setupEnumInfSectionsW(infhandle: ConstPtr, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: MutPtr): Bool

public expect fun setupFindFirstLineA(infhandle: ConstPtr, section: Pcstr, key: Pcstr, context: MutPtr): Bool

public expect fun setupFindFirstLineW(infhandle: ConstPtr, section: Pcwstr, key: Pcwstr, context: MutPtr): Bool

public expect fun setupFindNextLine(contextin: ConstPtr, contextout: MutPtr): Bool

public expect fun setupFindNextMatchLineA(contextin: ConstPtr, key: Pcstr, contextout: MutPtr): Bool

public expect fun setupFindNextMatchLineW(contextin: ConstPtr, key: Pcwstr, contextout: MutPtr): Bool

public expect fun setupFreeSourceListA(list: MutPtr, count: UInt): Bool

public expect fun setupFreeSourceListW(list: MutPtr, count: UInt): Bool

public expect fun setupGetBackupInformationA(queuehandle: ConstPtr, backupparams: MutPtr): Bool

public expect fun setupGetBackupInformationW(queuehandle: ConstPtr, backupparams: MutPtr): Bool

public expect fun setupGetBinaryField(context: ConstPtr, fieldindex: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetFieldCount(context: ConstPtr): UInt

public expect fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): UInt

public expect fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): Bool

public expect fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): Bool

public expect fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: MutPtr, sourcefilesize: MutPtr, targetfilesize: MutPtr, compressiontype: MutPtr): UInt

public expect fun setupGetFileQueueCount(filequeue: ConstPtr, subqueuefileop: UInt, numoperations: MutPtr): Bool

public expect fun setupGetFileQueueFlags(filequeue: ConstPtr, flags: MutPtr): Bool

public expect fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: ConstPtr, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: ConstPtr, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfInformationA(infspec: ConstPtr, searchcontrol: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfInformationW(infspec: ConstPtr, searchcontrol: UInt, returnbuffer: MutPtr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetIntField(context: ConstPtr, fieldindex: UInt, integervalue: MutPtr): Bool

public expect fun setupGetLineByIndexA(infhandle: ConstPtr, section: Pcstr, index: UInt, context: MutPtr): Bool

public expect fun setupGetLineByIndexW(infhandle: ConstPtr, section: Pcwstr, index: UInt, context: MutPtr): Bool

public expect fun setupGetLineCountA(infhandle: ConstPtr, section: Pcstr): Int

public expect fun setupGetLineCountW(infhandle: ConstPtr, section: Pcwstr): Int

public expect fun setupGetLineTextA(context: ConstPtr, infhandle: ConstPtr, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetLineTextW(context: ConstPtr, infhandle: ConstPtr, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetMultiSzFieldA(context: ConstPtr, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetMultiSzFieldW(context: ConstPtr, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetNonInteractiveMode(): Bool

public expect fun setupGetSourceFileLocationA(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcstr, sourceid: MutPtr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetSourceFileLocationW(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcwstr, sourceid: MutPtr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetSourceFileSizeA(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcstr, section: Pcstr, filesize: MutPtr, roundingfactor: UInt): Bool

public expect fun setupGetSourceFileSizeW(infhandle: ConstPtr, infcontext: ConstPtr, filename: Pcwstr, section: Pcwstr, filesize: MutPtr, roundingfactor: UInt): Bool

public expect fun setupGetSourceInfoA(infhandle: ConstPtr, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetSourceInfoW(infhandle: ConstPtr, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetStringFieldA(context: ConstPtr, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetStringFieldW(context: ConstPtr, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetTargetPathA(infhandle: ConstPtr, infcontext: ConstPtr, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetTargetPathW(infhandle: ConstPtr, infcontext: ConstPtr, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr): Bool

public expect fun setupGetThreadLogToken(): ULong

public expect fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): MutPtr

public expect fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: ConstPtr): MutPtr

public expect fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): MutPtr

public expect fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): MutPtr

public expect fun setupInstallFileA(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr): Bool

public expect fun setupInstallFileExA(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr, filewasinuse: MutPtr): Bool

public expect fun setupInstallFileExW(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr, filewasinuse: MutPtr): Bool

public expect fun setupInstallFileW(infhandle: ConstPtr, infcontext: ConstPtr, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr): Bool

public expect fun setupInstallFilesFromInfSectionA(infhandle: ConstPtr, layoutinfhandle: ConstPtr, filequeue: ConstPtr, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool

public expect fun setupInstallFilesFromInfSectionW(infhandle: ConstPtr, layoutinfhandle: ConstPtr, filequeue: ConstPtr, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool

public expect fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: ConstPtr, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: ConstPtr, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: ConstPtr, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: ConstPtr, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr): Bool

public expect fun setupInstallServicesFromInfSectionA(infhandle: ConstPtr, sectionname: Pcstr, flags: SpsvcinstFlags): Bool

public expect fun setupInstallServicesFromInfSectionExA(infhandle: ConstPtr, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool

public expect fun setupInstallServicesFromInfSectionExW(infhandle: ConstPtr, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr, reserved1: ConstPtr, reserved2: ConstPtr): Bool

public expect fun setupInstallServicesFromInfSectionW(infhandle: ConstPtr, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool

public expect fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: ConstPtr): Bool

public expect fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: ConstPtr): Bool

public expect fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool

public expect fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool

public expect fun setupLogFileA(fileloghandle: ConstPtr, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool

public expect fun setupLogFileW(fileloghandle: ConstPtr, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool

public expect fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: ConstPtr, errorline: MutPtr): Bool

public expect fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: ConstPtr, errorline: MutPtr): Bool

public expect fun setupOpenFileQueue(): MutPtr

public expect fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: MutPtr): MutPtr

public expect fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: MutPtr): MutPtr

public expect fun setupOpenLog(erase: Bool): Bool
