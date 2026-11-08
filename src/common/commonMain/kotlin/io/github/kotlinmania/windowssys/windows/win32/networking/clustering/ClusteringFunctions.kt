package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.system.services.SC_HANDLE

public fun interface FnCallback {
    public operator fun invoke(pvcallbackarg: Long, esetupphase: CLUSTER_SETUP_PHASE, ephasetype: CLUSTER_SETUP_PHASE_TYPE, ephaseseverity: CLUSTER_SETUP_PHASE_SEVERITY, dwpercentcomplete: UInt, lpszobjectname: PCWSTR, dwstatus: UInt): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(pworker: Long, lpthreadparameter: Long): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(pvcallbackarg: Long, eupgradephase: CLUSTER_UPGRADE_PHASE): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(param0: HCLUSTER, param1: HGROUP, param2: HGROUP, param3: Long): UInt
}

public fun interface FnCallback4 {
    public operator fun invoke(param0: HRESOURCE, param1: HRESOURCE, param2: Long): UInt
}

public fun interface FnCallback5 {
    public operator fun invoke(param0: HCLUSTER, param1: HRESOURCE, param2: HRESOURCE, param3: Long): UInt
}

public fun interface FnCallback6 {
    public operator fun invoke(param0: HCLUSTER, param1: HNODE, param2: CLUSTER_NODE_STATE, param3: Long): UInt
}

public fun interface FnCallback7 {
    public operator fun invoke(resourcehandle: Long, loglevel: LOG_LEVEL, formatstring: PCWSTR)
}

public fun AddClusterGroupDependency(hdependentgroup: HGROUP, hprovidergroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterGroupDependency", longArrayOf(hdependentgroup, hprovidergroup)).toUInt()
}

public fun AddClusterGroupDependencyEx(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterGroupDependencyEx", longArrayOf(hdependentgroup, hprovidergroup, lpszreason)).toUInt()
}

public fun AddClusterGroupSetDependency(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterGroupSetDependency", longArrayOf(hdependentgroupset, hprovidergroupset)).toUInt()
}

public fun AddClusterGroupSetDependencyEx(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterGroupSetDependencyEx", longArrayOf(hdependentgroupset, hprovidergroupset, lpszreason)).toUInt()
}

public fun AddClusterGroupToGroupSetDependency(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterGroupToGroupSetDependency", longArrayOf(hdependentgroup, hprovidergroupset)).toUInt()
}

public fun AddClusterGroupToGroupSetDependencyEx(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterGroupToGroupSetDependencyEx", longArrayOf(hdependentgroup, hprovidergroupset, lpszreason)).toUInt()
}

public fun AddClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterNode", longArrayOf(hcluster, lpsznodename, Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg))
}

public fun AddClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwflags: UInt, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterNodeEx", longArrayOf(hcluster, lpsznodename, dwflags.toLong(), Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg))
}

public fun AddClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterResourceDependency", longArrayOf(hresource, hdependson)).toUInt()
}

public fun AddClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterResourceDependencyEx", longArrayOf(hresource, hdependson, lpszreason)).toUInt()
}

public fun AddClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterResourceNode", longArrayOf(hresource, hnode)).toUInt()
}

public fun AddClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterResourceNodeEx", longArrayOf(hresource, hnode, lpszreason)).toUInt()
}

public fun AddClusterStorageNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, lpszclusterstoragenodedescription: PCWSTR, lpszclusterstoragenodelocation: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddClusterStorageNode", longArrayOf(hcluster, lpsznodename, Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg, lpszclusterstoragenodedescription, lpszclusterstoragenodelocation)).toUInt()
}

public fun AddCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddCrossClusterGroupSetDependency", longArrayOf(hdependentgroupset, lpremoteclustername, lpremotegroupsetname)).toUInt()
}

public fun AddResourceToClusterSharedVolumes(hresource: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "AddResourceToClusterSharedVolumes", longArrayOf(hresource)).toUInt()
}

public fun BackupClusterDatabase(hcluster: HCLUSTER, lpszpathname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "BackupClusterDatabase", longArrayOf(hcluster, lpszpathname)).toUInt()
}

public fun CanResourceBeDependent(hresource: HRESOURCE, hresourcedependent: HRESOURCE): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CanResourceBeDependent", longArrayOf(hresource, hresourcedependent)).toInt()
}

public fun CancelClusterGroupOperation(hgroup: HGROUP, dwcancelflags_reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "CancelClusterGroupOperation", longArrayOf(hgroup, dwcancelflags_reserved.toLong())).toUInt()
}

public fun ChangeClusterResourceGroup(hresource: HRESOURCE, hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ChangeClusterResourceGroup", longArrayOf(hresource, hgroup)).toUInt()
}

public fun ChangeClusterResourceGroupEx(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ChangeClusterResourceGroupEx", longArrayOf(hresource, hgroup, flags.toLong())).toUInt()
}

public fun ChangeClusterResourceGroupEx2(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ChangeClusterResourceGroupEx2", longArrayOf(hresource, hgroup, flags.toLong(), lpszreason)).toUInt()
}

public fun CloseCluster(hcluster: HCLUSTER): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseCluster", longArrayOf(hcluster)).toInt()
}

public fun CloseClusterCryptProvider(hcluscryptprovider: HCLUSCRYPTPROVIDER): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "CloseClusterCryptProvider", longArrayOf(hcluscryptprovider)).toUInt()
}

public fun CloseClusterGroup(hgroup: HGROUP): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterGroup", longArrayOf(hgroup)).toInt()
}

public fun CloseClusterGroupSet(hgroupset: HGROUPSET): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterGroupSet", longArrayOf(hgroupset)).toInt()
}

public fun CloseClusterNetInterface(hnetinterface: HNETINTERFACE): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterNetInterface", longArrayOf(hnetinterface)).toInt()
}

public fun CloseClusterNetwork(hnetwork: HNETWORK): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterNetwork", longArrayOf(hnetwork)).toInt()
}

public fun CloseClusterNode(hnode: HNODE): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterNode", longArrayOf(hnode)).toInt()
}

public fun CloseClusterNotifyPort(hchange: HCHANGE): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterNotifyPort", longArrayOf(hchange)).toInt()
}

public fun CloseClusterResource(hresource: HRESOURCE): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "CloseClusterResource", longArrayOf(hresource)).toInt()
}

public fun ClusAddClusterHealthFault(hcluster: HCLUSTER, failure: Long, param2: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusAddClusterHealthFault", longArrayOf(hcluster, failure, param2.toLong())).toUInt()
}

public fun ClusGetClusterHealthFaults(hcluster: HCLUSTER, objects: Long, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusGetClusterHealthFaults", longArrayOf(hcluster, objects, flags.toLong())).toUInt()
}

public fun ClusRemoveClusterHealthFault(hcluster: HCLUSTER, id: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusRemoveClusterHealthFault", longArrayOf(hcluster, id, flags.toLong())).toUInt()
}

public fun ClusWorkerCheckTerminate(lpworker: Long): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusWorkerCheckTerminate", longArrayOf(lpworker)).toInt()
}

public fun ClusWorkerCreate(lpworker: Long, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusWorkerCreate", longArrayOf(lpworker, Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter)).toUInt()
}

public fun ClusWorkerTerminate(lpworker: Long) {
    Win32DynamicFfi.invoke("resutils.dll", "ClusWorkerTerminate", longArrayOf(lpworker))
}

public fun ClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusWorkerTerminateEx", longArrayOf(clusworker, timeoutinmilliseconds.toLong(), waitonly.toLong())).toUInt()
}

public fun ClusWorkersTerminate(clusworkers: Long, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusWorkersTerminate", longArrayOf(clusworkers, clusworkerscount.toLong(), timeoutinmilliseconds.toLong(), waitonly.toLong())).toUInt()
}

public fun ClusapiSetReasonHandler(lphandler: Long): Long {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusapiSetReasonHandler", longArrayOf(lphandler))
}

public fun ClusterAddGroupToAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterAddGroupToAffinityRule", longArrayOf(hcluster, rulename, hgroup)).toUInt()
}

public fun ClusterAddGroupToGroupSet(hgroupset: HGROUPSET, hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterAddGroupToGroupSet", longArrayOf(hgroupset, hgroup)).toUInt()
}

public fun ClusterAddGroupToGroupSetWithDomains(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterAddGroupToGroupSetWithDomains", longArrayOf(hgroupset, hgroup, faultdomain.toLong(), updatedomain.toLong())).toUInt()
}

public fun ClusterAddGroupToGroupSetWithDomainsEx(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterAddGroupToGroupSetWithDomainsEx", longArrayOf(hgroupset, hgroup, faultdomain.toLong(), updatedomain.toLong(), lpszreason)).toUInt()
}

public fun ClusterAffinityRuleControl(hcluster: HCLUSTER, affinityrulename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterAffinityRuleControl", longArrayOf(hcluster, affinityrulename, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterClearBackupStateForSharedVolume(lpszvolumepathname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterClearBackupStateForSharedVolume", longArrayOf(lpszvolumepathname)).toUInt()
}

public fun ClusterCloseEnum(henum: HCLUSENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterCloseEnum", longArrayOf(henum)).toUInt()
}

public fun ClusterCloseEnumEx(hclusterenum: HCLUSENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterCloseEnumEx", longArrayOf(hclusterenum)).toUInt()
}

public fun ClusterControl(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterControl", longArrayOf(hcluster, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterControlEx(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterControlEx", longArrayOf(hcluster, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterCreateAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterCreateAffinityRule", longArrayOf(hcluster, rulename, ruletype.toLong())).toUInt()
}

public fun ClusterDecrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: Long, cbcryptinput: UInt, ppcryptoutput: Long, pcbcryptoutput: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterDecrypt", longArrayOf(hcluscryptprovider, pcryptinput, cbcryptinput.toLong(), ppcryptoutput, pcbcryptoutput)).toUInt()
}

public fun ClusterEncrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: Long, cbdata: UInt, ppdata: Long, pcbdata: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterEncrypt", longArrayOf(hcluscryptprovider, pdata, cbdata.toLong(), ppdata, pcbdata)).toUInt()
}

public fun ClusterEnum(henum: HCLUSENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterEnum", longArrayOf(henum, dwindex.toLong(), lpdwtype, lpszname, lpcchname)).toUInt()
}

public fun ClusterEnumEx(hclusterenum: HCLUSENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterEnumEx", longArrayOf(hclusterenum, dwindex.toLong(), pitem, cbitem)).toUInt()
}

public fun ClusterGetEnumCount(henum: HCLUSENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGetEnumCount", longArrayOf(henum)).toUInt()
}

public fun ClusterGetEnumCountEx(hclusterenum: HCLUSENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGetEnumCountEx", longArrayOf(hclusterenum)).toUInt()
}

public fun ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterGetVolumeNameForVolumeMountPoint", longArrayOf(lpszvolumemountpoint, lpszvolumename, cchbufferlength.toLong())).toInt()
}

public fun ClusterGetVolumePathName(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterGetVolumePathName", longArrayOf(lpszfilename, lpszvolumepathname, cchbufferlength.toLong())).toInt()
}

public fun ClusterGroupCloseEnum(hgroupenum: HGROUPENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupCloseEnum", longArrayOf(hgroupenum)).toUInt()
}

public fun ClusterGroupCloseEnumEx(hgroupenumex: HGROUPENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupCloseEnumEx", longArrayOf(hgroupenumex)).toUInt()
}

public fun ClusterGroupControl(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupControl", longArrayOf(hgroup, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterGroupControlEx(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupControlEx", longArrayOf(hgroup, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterGroupEnum(hgroupenum: HGROUPENUM, dwindex: UInt, lpdwtype: Long, lpszresourcename: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupEnum", longArrayOf(hgroupenum, dwindex.toLong(), lpdwtype, lpszresourcename, lpcchname)).toUInt()
}

public fun ClusterGroupEnumEx(hgroupenumex: HGROUPENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupEnumEx", longArrayOf(hgroupenumex, dwindex.toLong(), pitem, cbitem)).toUInt()
}

public fun ClusterGroupGetEnumCount(hgroupenum: HGROUPENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupGetEnumCount", longArrayOf(hgroupenum)).toUInt()
}

public fun ClusterGroupGetEnumCountEx(hgroupenumex: HGROUPENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupGetEnumCountEx", longArrayOf(hgroupenumex)).toUInt()
}

public fun ClusterGroupOpenEnum(hgroup: HGROUP, dwtype: UInt): HGROUPENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupOpenEnum", longArrayOf(hgroup, dwtype.toLong()))
}

public fun ClusterGroupOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HGROUPENUMEX {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupOpenEnumEx", longArrayOf(hcluster, lpszproperties, cbproperties.toLong(), lpszroproperties, cbroproperties.toLong(), dwflags.toLong()))
}

public fun ClusterGroupSetCloseEnum(hgroupsetenum: HGROUPSETENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupSetCloseEnum", longArrayOf(hgroupsetenum)).toUInt()
}

public fun ClusterGroupSetControl(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupSetControl", longArrayOf(hgroupset, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterGroupSetControlEx(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupSetControlEx", longArrayOf(hgroupset, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterGroupSetEnum(hgroupsetenum: HGROUPSETENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupSetEnum", longArrayOf(hgroupsetenum, dwindex.toLong(), lpszname, lpcchname)).toUInt()
}

public fun ClusterGroupSetGetEnumCount(hgroupsetenum: HGROUPSETENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupSetGetEnumCount", longArrayOf(hgroupsetenum)).toUInt()
}

public fun ClusterGroupSetOpenEnum(hcluster: HCLUSTER): HGROUPSETENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterGroupSetOpenEnum", longArrayOf(hcluster))
}

public fun ClusterIsPathOnSharedVolume(lpszpathname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterIsPathOnSharedVolume", longArrayOf(lpszpathname)).toInt()
}

public fun ClusterNetInterfaceCloseEnum(hnetinterfaceenum: HNETINTERFACEENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetInterfaceCloseEnum", longArrayOf(hnetinterfaceenum)).toUInt()
}

public fun ClusterNetInterfaceControl(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetInterfaceControl", longArrayOf(hnetinterface, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterNetInterfaceControlEx(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetInterfaceControlEx", longArrayOf(hnetinterface, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterNetInterfaceEnum(hnetinterfaceenum: HNETINTERFACEENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetInterfaceEnum", longArrayOf(hnetinterfaceenum, dwindex.toLong(), lpszname, lpcchname)).toUInt()
}

public fun ClusterNetInterfaceOpenEnum(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR): HNETINTERFACEENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetInterfaceOpenEnum", longArrayOf(hcluster, lpsznodename, lpsznetworkname))
}

public fun ClusterNetworkCloseEnum(hnetworkenum: HNETWORKENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetworkCloseEnum", longArrayOf(hnetworkenum)).toUInt()
}

public fun ClusterNetworkControl(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetworkControl", longArrayOf(hnetwork, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterNetworkControlEx(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetworkControlEx", longArrayOf(hnetwork, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterNetworkEnum(hnetworkenum: HNETWORKENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetworkEnum", longArrayOf(hnetworkenum, dwindex.toLong(), lpdwtype, lpszname, lpcchname)).toUInt()
}

public fun ClusterNetworkGetEnumCount(hnetworkenum: HNETWORKENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetworkGetEnumCount", longArrayOf(hnetworkenum)).toUInt()
}

public fun ClusterNetworkOpenEnum(hnetwork: HNETWORK, dwtype: UInt): HNETWORKENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNetworkOpenEnum", longArrayOf(hnetwork, dwtype.toLong()))
}

public fun ClusterNodeCloseEnum(hnodeenum: HNODEENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeCloseEnum", longArrayOf(hnodeenum)).toUInt()
}

public fun ClusterNodeCloseEnumEx(hnodeenum: HNODEENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeCloseEnumEx", longArrayOf(hnodeenum)).toUInt()
}

public fun ClusterNodeControl(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeControl", longArrayOf(hnode, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterNodeControlEx(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeControlEx", longArrayOf(hnode, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterNodeEnum(hnodeenum: HNODEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeEnum", longArrayOf(hnodeenum, dwindex.toLong(), lpdwtype, lpszname, lpcchname)).toUInt()
}

public fun ClusterNodeEnumEx(hnodeenum: HNODEENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeEnumEx", longArrayOf(hnodeenum, dwindex.toLong(), pitem, cbitem)).toUInt()
}

public fun ClusterNodeGetEnumCount(hnodeenum: HNODEENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeGetEnumCount", longArrayOf(hnodeenum)).toUInt()
}

public fun ClusterNodeGetEnumCountEx(hnodeenum: HNODEENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeGetEnumCountEx", longArrayOf(hnodeenum)).toUInt()
}

public fun ClusterNodeOpenEnum(hnode: HNODE, dwtype: UInt): HNODEENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeOpenEnum", longArrayOf(hnode, dwtype.toLong()))
}

public fun ClusterNodeOpenEnumEx(hnode: HNODE, dwtype: UInt, poptions: Long): HNODEENUMEX {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeOpenEnumEx", longArrayOf(hnode, dwtype.toLong(), poptions))
}

public fun ClusterNodeReplacement(hcluster: HCLUSTER, lpsznodenamecurrent: PCWSTR, lpsznodenamenew: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterNodeReplacement", longArrayOf(hcluster, lpsznodenamecurrent, lpsznodenamenew)).toUInt()
}

public fun ClusterOpenEnum(hcluster: HCLUSTER, dwtype: UInt): HCLUSENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterOpenEnum", longArrayOf(hcluster, dwtype.toLong()))
}

public fun ClusterOpenEnumEx(hcluster: HCLUSTER, dwtype: UInt, poptions: Long): HCLUSENUMEX {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterOpenEnumEx", longArrayOf(hcluster, dwtype.toLong(), poptions))
}

public fun ClusterPrepareSharedVolumeForBackup(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, lpcchvolumepathname: Long, lpszvolumename: PWSTR, lpcchvolumename: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ClusterPrepareSharedVolumeForBackup", longArrayOf(lpszfilename, lpszvolumepathname, lpcchvolumepathname, lpszvolumename, lpcchvolumename)).toUInt()
}

public fun ClusterRegBatchAddCommand(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: PCWSTR, dwoptions: UInt, lpdata: Long, cbdata: UInt): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegBatchAddCommand", longArrayOf(hregbatch, dwcommand.toLong(), wzname, dwoptions.toLong(), lpdata, cbdata.toLong())).toInt()
}

public fun ClusterRegBatchCloseNotification(hbatchnotification: HREGBATCHNOTIFICATION): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegBatchCloseNotification", longArrayOf(hbatchnotification)).toInt()
}

public fun ClusterRegBatchReadCommand(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegBatchReadCommand", longArrayOf(hbatchnotification, pbatchcommand)).toInt()
}

public fun ClusterRegCloseBatch(hregbatch: HREGBATCH, bcommit: BOOL, failedcommandnumber: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseBatch", longArrayOf(hregbatch, bcommit.toLong(), failedcommandnumber)).toInt()
}

public fun ClusterRegCloseBatchEx(hregbatch: HREGBATCH, flags: UInt, failedcommandnumber: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseBatchEx", longArrayOf(hregbatch, flags.toLong(), failedcommandnumber)).toInt()
}

public fun ClusterRegCloseBatchNotifyPort(hbatchnotifyport: HREGBATCHPORT): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseBatchNotifyPort", longArrayOf(hbatchnotifyport)).toInt()
}

public fun ClusterRegCloseKey(hkey: HKEY): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseKey", longArrayOf(hkey)).toInt()
}

public fun ClusterRegCloseReadBatch(hregreadbatch: HREGREADBATCH, phregreadbatchreply: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseReadBatch", longArrayOf(hregreadbatch, phregreadbatchreply)).toInt()
}

public fun ClusterRegCloseReadBatchEx(hregreadbatch: HREGREADBATCH, flags: UInt, phregreadbatchreply: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseReadBatchEx", longArrayOf(hregreadbatch, flags.toLong(), phregreadbatchreply)).toInt()
}

public fun ClusterRegCloseReadBatchReply(hregreadbatchreply: HREGREADBATCHREPLY): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCloseReadBatchReply", longArrayOf(hregreadbatchreply)).toInt()
}

public fun ClusterRegCreateBatch(hkey: HKEY, phregbatch: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCreateBatch", longArrayOf(hkey, phregbatch)).toInt()
}

public fun ClusterRegCreateBatchNotifyPort(hkey: HKEY, phbatchnotifyport: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCreateBatchNotifyPort", longArrayOf(hkey, phbatchnotifyport)).toInt()
}

public fun ClusterRegCreateKey(hkey: HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCreateKey", longArrayOf(hkey, lpszsubkey, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition)).toInt()
}

public fun ClusterRegCreateKeyEx(hkey: HKEY, lpsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: PCWSTR): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCreateKeyEx", longArrayOf(hkey, lpsubkey, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition, lpszreason)).toInt()
}

public fun ClusterRegCreateReadBatch(hkey: HKEY, phregreadbatch: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegCreateReadBatch", longArrayOf(hkey, phregreadbatch)).toInt()
}

public fun ClusterRegDeleteKey(hkey: HKEY, lpszsubkey: PCWSTR): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegDeleteKey", longArrayOf(hkey, lpszsubkey)).toInt()
}

public fun ClusterRegDeleteKeyEx(hkey: HKEY, lpsubkey: PCWSTR, lpszreason: PCWSTR): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegDeleteKeyEx", longArrayOf(hkey, lpsubkey, lpszreason)).toInt()
}

public fun ClusterRegDeleteValue(hkey: HKEY, lpszvaluename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegDeleteValue", longArrayOf(hkey, lpszvaluename)).toUInt()
}

public fun ClusterRegDeleteValueEx(hkey: HKEY, lpszvaluename: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegDeleteValueEx", longArrayOf(hkey, lpszvaluename, lpszreason)).toUInt()
}

public fun ClusterRegEnumKey(hkey: HKEY, dwindex: UInt, lpszname: PWSTR, lpcchname: Long, lpftlastwritetime: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegEnumKey", longArrayOf(hkey, dwindex.toLong(), lpszname, lpcchname, lpftlastwritetime)).toInt()
}

public fun ClusterRegEnumValue(hkey: HKEY, dwindex: UInt, lpszvaluename: PWSTR, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegEnumValue", longArrayOf(hkey, dwindex.toLong(), lpszvaluename, lpcchvaluename, lpdwtype, lpdata, lpcbdata)).toUInt()
}

public fun ClusterRegGetBatchNotification(hbatchnotify: HREGBATCHPORT, phbatchnotification: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegGetBatchNotification", longArrayOf(hbatchnotify, phbatchnotification)).toInt()
}

public fun ClusterRegGetKeySecurity(hkey: HKEY, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegGetKeySecurity", longArrayOf(hkey, requestedinformation.toLong(), psecuritydescriptor, lpcbsecuritydescriptor)).toInt()
}

public fun ClusterRegOpenKey(hkey: HKEY, lpszsubkey: PCWSTR, samdesired: UInt, phkresult: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegOpenKey", longArrayOf(hkey, lpszsubkey, samdesired.toLong(), phkresult)).toInt()
}

public fun ClusterRegQueryInfoKey(hkey: HKEY, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegQueryInfoKey", longArrayOf(hkey, lpcsubkeys, lpcchmaxsubkeylen, lpcvalues, lpcchmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime)).toInt()
}

public fun ClusterRegQueryValue(hkey: HKEY, lpszvaluename: PCWSTR, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegQueryValue", longArrayOf(hkey, lpszvaluename, lpdwvaluetype, lpdata, lpcbdata)).toInt()
}

public fun ClusterRegReadBatchAddCommand(hregreadbatch: HREGREADBATCH, wzsubkeyname: PCWSTR, wzvaluename: PCWSTR): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegReadBatchAddCommand", longArrayOf(hregreadbatch, wzsubkeyname, wzvaluename)).toInt()
}

public fun ClusterRegReadBatchReplyNextCommand(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: Long): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegReadBatchReplyNextCommand", longArrayOf(hregreadbatchreply, pbatchcommand)).toInt()
}

public fun ClusterRegSetKeySecurity(hkey: HKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegSetKeySecurity", longArrayOf(hkey, securityinformation.toLong(), psecuritydescriptor)).toInt()
}

public fun ClusterRegSetKeySecurityEx(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpszreason: PCWSTR): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegSetKeySecurityEx", longArrayOf(hkey, securityinformation.toLong(), psecuritydescriptor, lpszreason)).toInt()
}

public fun ClusterRegSetValue(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegSetValue", longArrayOf(hkey, lpszvaluename, dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun ClusterRegSetValueEx(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegSetValueEx", longArrayOf(hkey, lpszvaluename, dwtype.toLong(), lpdata, cbdata.toLong(), lpszreason)).toUInt()
}

public fun ClusterRegSyncDatabase(hcluster: HCLUSTER, flags: UInt): Int {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRegSyncDatabase", longArrayOf(hcluster, flags.toLong())).toInt()
}

public fun ClusterRemoveAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRemoveAffinityRule", longArrayOf(hcluster, rulename)).toUInt()
}

public fun ClusterRemoveGroupFromAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRemoveGroupFromAffinityRule", longArrayOf(hcluster, rulename, hgroup)).toUInt()
}

public fun ClusterRemoveGroupFromGroupSet(hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRemoveGroupFromGroupSet", longArrayOf(hgroup)).toUInt()
}

public fun ClusterRemoveGroupFromGroupSetEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterRemoveGroupFromGroupSetEx", longArrayOf(hgroup, lpszreason)).toUInt()
}

public fun ClusterResourceCloseEnum(hresenum: HRESENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceCloseEnum", longArrayOf(hresenum)).toUInt()
}

public fun ClusterResourceCloseEnumEx(hresourceenumex: HRESENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceCloseEnumEx", longArrayOf(hresourceenumex)).toUInt()
}

public fun ClusterResourceControl(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceControl", longArrayOf(hresource, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterResourceControlAsUser(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceControlAsUser", longArrayOf(hresource, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterResourceControlAsUserEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceControlAsUserEx", longArrayOf(hresource, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterResourceControlEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceControlEx", longArrayOf(hresource, hhostnode, dwcontrolcode.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpoutbuffer, cboutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterResourceEnum(hresenum: HRESENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceEnum", longArrayOf(hresenum, dwindex.toLong(), lpdwtype, lpszname, lpcchname)).toUInt()
}

public fun ClusterResourceEnumEx(hresourceenumex: HRESENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceEnumEx", longArrayOf(hresourceenumex, dwindex.toLong(), pitem, cbitem)).toUInt()
}

public fun ClusterResourceGetEnumCount(hresenum: HRESENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceGetEnumCount", longArrayOf(hresenum)).toUInt()
}

public fun ClusterResourceGetEnumCountEx(hresourceenumex: HRESENUMEX): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceGetEnumCountEx", longArrayOf(hresourceenumex)).toUInt()
}

public fun ClusterResourceOpenEnum(hresource: HRESOURCE, dwtype: UInt): HRESENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceOpenEnum", longArrayOf(hresource, dwtype.toLong()))
}

public fun ClusterResourceOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HRESENUMEX {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceOpenEnumEx", longArrayOf(hcluster, lpszproperties, cbproperties.toLong(), lpszroproperties, cbroproperties.toLong(), dwflags.toLong()))
}

public fun ClusterResourceTypeCloseEnum(hrestypeenum: HRESTYPEENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeCloseEnum", longArrayOf(hrestypeenum)).toUInt()
}

public fun ClusterResourceTypeControl(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeControl", longArrayOf(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterResourceTypeControlAsUser(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeControlAsUser", longArrayOf(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned)).toUInt()
}

public fun ClusterResourceTypeControlAsUserEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeControlAsUserEx", longArrayOf(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterResourceTypeControlEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeControlEx", longArrayOf(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toLong(), lpinbuffer, ninbuffersize.toLong(), lpoutbuffer, noutbuffersize.toLong(), lpbytesreturned, lpszreason)).toUInt()
}

public fun ClusterResourceTypeEnum(hrestypeenum: HRESTYPEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeEnum", longArrayOf(hrestypeenum, dwindex.toLong(), lpdwtype, lpszname, lpcchname)).toUInt()
}

public fun ClusterResourceTypeGetEnumCount(hrestypeenum: HRESTYPEENUM): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeGetEnumCount", longArrayOf(hrestypeenum)).toUInt()
}

public fun ClusterResourceTypeOpenEnum(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, dwtype: UInt): HRESTYPEENUM {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterResourceTypeOpenEnum", longArrayOf(hcluster, lpszresourcetypename, dwtype.toLong()))
}

public fun ClusterSetAccountAccess(hcluster: HCLUSTER, szaccountsid: PCWSTR, dwaccess: UInt, dwcontroltype: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterSetAccountAccess", longArrayOf(hcluster, szaccountsid, dwaccess.toLong(), dwcontroltype.toLong())).toUInt()
}

public fun ClusterSharedVolumeSetSnapshotState(guidsnapshotset: GUID, lpszvolumename: PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterSharedVolumeSetSnapshotState", longArrayOf(run { val buf = ByteArray(16); buf[0] = (guidsnapshotset.data1.toInt() and 0xFF).toByte(); buf[1] = ((guidsnapshotset.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((guidsnapshotset.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((guidsnapshotset.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (guidsnapshotset.data2.toInt() and 0xFF).toByte(); buf[5] = ((guidsnapshotset.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (guidsnapshotset.data3.toInt() and 0xFF).toByte(); buf[7] = ((guidsnapshotset.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, guidsnapshotset.data4.size)) buf[8 + i] = guidsnapshotset.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, lpszvolumename, state.toLong())).toUInt()
}

public fun ClusterUpgradeFunctionalLevel(hcluster: HCLUSTER, perform: BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ClusterUpgradeFunctionalLevel", longArrayOf(hcluster, perform.toLong(), Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg)).toUInt()
}

public fun CreateCluster(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateCluster", longArrayOf(pconfig, Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg))
}

public fun CreateClusterAvailabilitySet(hcluster: HCLUSTER, lpavailabilitysetname: PCWSTR, pavailabilitysetconfig: Long): HGROUPSET {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterAvailabilitySet", longArrayOf(hcluster, lpavailabilitysetname, pavailabilitysetconfig))
}

public fun CreateClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterGroup", longArrayOf(hcluster, lpszgroupname))
}

public fun CreateClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, pgroupinfo: Long): HGROUP {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterGroupEx", longArrayOf(hcluster, lpszgroupname, pgroupinfo))
}

public fun CreateClusterGroupSet(hcluster: HCLUSTER, groupsetname: PCWSTR): HGROUPSET {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterGroupSet", longArrayOf(hcluster, groupsetname))
}

public fun CreateClusterNameAccount(hcluster: HCLUSTER, pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterNameAccount", longArrayOf(hcluster, pconfig, Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg)).toUInt()
}

public fun CreateClusterNotifyPort(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: UInt, dwnotifykey: ULong): HCHANGE {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterNotifyPort", longArrayOf(hchange, hcluster, dwfilter.toLong(), dwnotifykey.toLong()))
}

public fun CreateClusterNotifyPortV2(hchange: HCHANGE, hcluster: HCLUSTER, filters: Long, dwfiltercount: UInt, dwnotifykey: ULong): HCHANGE {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterNotifyPortV2", longArrayOf(hchange, hcluster, filters, dwfiltercount.toLong(), dwnotifykey.toLong()))
}

public fun CreateClusterResource(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt): HRESOURCE {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterResource", longArrayOf(hgroup, lpszresourcename, lpszresourcetype, dwflags.toLong()))
}

public fun CreateClusterResourceEx(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt, lpszreason: PCWSTR): HRESOURCE {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterResourceEx", longArrayOf(hgroup, lpszresourcename, lpszresourcetype, dwflags.toLong(), lpszreason))
}

public fun CreateClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterResourceType", longArrayOf(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval.toLong(), dwisalivepollinterval.toLong())).toUInt()
}

public fun CreateClusterResourceTypeEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "CreateClusterResourceTypeEx", longArrayOf(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval.toLong(), dwisalivepollinterval.toLong(), lpszreason)).toUInt()
}

public fun DeleteClusterGroup(hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterGroup", longArrayOf(hgroup)).toUInt()
}

public fun DeleteClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterGroupEx", longArrayOf(hgroup, lpszreason)).toUInt()
}

public fun DeleteClusterGroupSet(hgroupset: HGROUPSET): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterGroupSet", longArrayOf(hgroupset)).toUInt()
}

public fun DeleteClusterGroupSetEx(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterGroupSetEx", longArrayOf(hgroupset, lpszreason)).toUInt()
}

public fun DeleteClusterResource(hresource: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterResource", longArrayOf(hresource)).toUInt()
}

public fun DeleteClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterResourceEx", longArrayOf(hresource, lpszreason)).toUInt()
}

public fun DeleteClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterResourceType", longArrayOf(hcluster, lpszresourcetypename)).toUInt()
}

public fun DeleteClusterResourceTypeEx(hcluster: HCLUSTER, lpsztypename: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DeleteClusterResourceTypeEx", longArrayOf(hcluster, lpsztypename, lpszreason)).toUInt()
}

public fun DestroyCluster(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, fdeletevirtualcomputerobjects: BOOL): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DestroyCluster", longArrayOf(hcluster, Win32DynamicFfi.objectSlot(pfnprogresscallback), pvcallbackarg, fdeletevirtualcomputerobjects.toLong())).toUInt()
}

public fun DestroyClusterGroup(hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DestroyClusterGroup", longArrayOf(hgroup)).toUInt()
}

public fun DestroyClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DestroyClusterGroupEx", longArrayOf(hgroup, lpszreason)).toUInt()
}

public fun DetermineCNOResTypeFromCluster(hcluster: HCLUSTER, pcnorestype: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DetermineCNOResTypeFromCluster", longArrayOf(hcluster, pcnorestype)).toUInt()
}

public fun DetermineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcnorestype: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DetermineCNOResTypeFromNodelist", longArrayOf(cnodes.toLong(), ppsznodenames, pcnorestype)).toUInt()
}

public fun DetermineClusterCloudTypeFromCluster(hcluster: HCLUSTER, pcloudtype: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DetermineClusterCloudTypeFromCluster", longArrayOf(hcluster, pcloudtype)).toUInt()
}

public fun DetermineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcloudtype: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "DetermineClusterCloudTypeFromNodelist", longArrayOf(cnodes.toLong(), ppsznodenames, pcloudtype)).toUInt()
}

public fun EvictClusterNode(hnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "EvictClusterNode", longArrayOf(hnode)).toUInt()
}

public fun EvictClusterNodeEx(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "EvictClusterNodeEx", longArrayOf(hnode, dwtimeout.toLong(), phrcleanupstatus)).toUInt()
}

public fun EvictClusterNodeEx2(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "EvictClusterNodeEx2", longArrayOf(hnode, dwtimeout.toLong(), phrcleanupstatus, lpszreason)).toUInt()
}

public fun FailClusterResource(hresource: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "FailClusterResource", longArrayOf(hresource)).toUInt()
}

public fun FailClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "FailClusterResourceEx", longArrayOf(hresource, lpszreason)).toUInt()
}

public fun FreeClusterCrypt(pcryptinfo: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "FreeClusterCrypt", longArrayOf(pcryptinfo)).toUInt()
}

public fun FreeClusterHealthFault(clusterhealthfault: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "FreeClusterHealthFault", longArrayOf(clusterhealthfault)).toUInt()
}

public fun FreeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "FreeClusterHealthFaultArray", longArrayOf(clusterhealthfaultarray)).toUInt()
}

public fun GetClusterFromGroup(hgroup: HGROUP): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterFromGroup", longArrayOf(hgroup))
}

public fun GetClusterFromNetInterface(hnetinterface: HNETINTERFACE): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterFromNetInterface", longArrayOf(hnetinterface))
}

public fun GetClusterFromNetwork(hnetwork: HNETWORK): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterFromNetwork", longArrayOf(hnetwork))
}

public fun GetClusterFromNode(hnode: HNODE): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterFromNode", longArrayOf(hnode))
}

public fun GetClusterFromResource(hresource: HRESOURCE): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterFromResource", longArrayOf(hresource))
}

public fun GetClusterGroupKey(hgroup: HGROUP, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterGroupKey", longArrayOf(hgroup, samdesired.toLong()))
}

public fun GetClusterGroupState(hgroup: HGROUP, lpsznodename: PWSTR, lpcchnodename: Long): CLUSTER_GROUP_STATE {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterGroupState", longArrayOf(hgroup, lpsznodename, lpcchnodename)).toInt()
}

public fun GetClusterInformation(hcluster: HCLUSTER, lpszclustername: PWSTR, lpcchclustername: Long, lpclusterinfo: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterInformation", longArrayOf(hcluster, lpszclustername, lpcchclustername, lpclusterinfo)).toUInt()
}

public fun GetClusterKey(hcluster: HCLUSTER, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterKey", longArrayOf(hcluster, samdesired.toLong()))
}

public fun GetClusterNetInterface(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR, lpszinterfacename: PWSTR, lpcchinterfacename: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNetInterface", longArrayOf(hcluster, lpsznodename, lpsznetworkname, lpszinterfacename, lpcchinterfacename)).toUInt()
}

public fun GetClusterNetInterfaceKey(hnetinterface: HNETINTERFACE, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNetInterfaceKey", longArrayOf(hnetinterface, samdesired.toLong()))
}

public fun GetClusterNetInterfaceState(hnetinterface: HNETINTERFACE): CLUSTER_NETINTERFACE_STATE {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNetInterfaceState", longArrayOf(hnetinterface)).toInt()
}

public fun GetClusterNetworkId(hnetwork: HNETWORK, lpsznetworkid: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNetworkId", longArrayOf(hnetwork, lpsznetworkid, lpcchname)).toUInt()
}

public fun GetClusterNetworkKey(hnetwork: HNETWORK, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNetworkKey", longArrayOf(hnetwork, samdesired.toLong()))
}

public fun GetClusterNetworkState(hnetwork: HNETWORK): CLUSTER_NETWORK_STATE {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNetworkState", longArrayOf(hnetwork)).toInt()
}

public fun GetClusterNodeId(hnode: HNODE, lpsznodeid: PWSTR, lpcchname: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNodeId", longArrayOf(hnode, lpsznodeid, lpcchname)).toUInt()
}

public fun GetClusterNodeKey(hnode: HNODE, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNodeKey", longArrayOf(hnode, samdesired.toLong()))
}

public fun GetClusterNodeState(hnode: HNODE): CLUSTER_NODE_STATE {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNodeState", longArrayOf(hnode)).toInt()
}

public fun GetClusterNotify(hchange: HCHANGE, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: PWSTR, lpcchname: Long, dwmilliseconds: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNotify", longArrayOf(hchange, lpdwnotifykey, lpdwfiltertype, lpszname, lpcchname, dwmilliseconds.toLong())).toUInt()
}

public fun GetClusterNotifyV2(hchange: HCHANGE, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: PWSTR, lpcchobjectid: Long, lpszparentid: PWSTR, lpcchparentid: Long, lpszname: PWSTR, lpcchname: Long, lpsztype: PWSTR, lpcchtype: Long, dwmilliseconds: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterNotifyV2", longArrayOf(hchange, lpdwnotifykey, pfilterandtype, buffer, lpbbuffersize, lpszobjectid, lpcchobjectid, lpszparentid, lpcchparentid, lpszname, lpcchname, lpsztype, lpcchtype, dwmilliseconds.toLong())).toUInt()
}

public fun GetClusterQuorumResource(hcluster: HCLUSTER, lpszresourcename: PWSTR, lpcchresourcename: Long, lpszdevicename: PWSTR, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterQuorumResource", longArrayOf(hcluster, lpszresourcename, lpcchresourcename, lpszdevicename, lpcchdevicename, lpdwmaxquorumlogsize)).toUInt()
}

public fun GetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PWSTR, lpcchdependencyexpression: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterResourceDependencyExpression", longArrayOf(hresource, lpszdependencyexpression, lpcchdependencyexpression)).toUInt()
}

public fun GetClusterResourceKey(hresource: HRESOURCE, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterResourceKey", longArrayOf(hresource, samdesired.toLong()))
}

public fun GetClusterResourceNetworkName(hresource: HRESOURCE, lpbuffer: PWSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterResourceNetworkName", longArrayOf(hresource, lpbuffer, nsize)).toInt()
}

public fun GetClusterResourceState(hresource: HRESOURCE, lpsznodename: PWSTR, lpcchnodename: Long, lpszgroupname: PWSTR, lpcchgroupname: Long): CLUSTER_RESOURCE_STATE {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterResourceState", longArrayOf(hresource, lpsznodename, lpcchnodename, lpszgroupname, lpcchgroupname)).toInt()
}

public fun GetClusterResourceTypeKey(hcluster: HCLUSTER, lpsztypename: PCWSTR, samdesired: UInt): HKEY {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetClusterResourceTypeKey", longArrayOf(hcluster, lpsztypename, samdesired.toLong()))
}

public fun GetNodeCloudTypeDW(ppsznodename: PCWSTR, nodecloudtype: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetNodeCloudTypeDW", longArrayOf(ppsznodename, nodecloudtype)).toUInt()
}

public fun GetNodeClusterState(lpsznodename: PCWSTR, pdwclusterstate: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetNodeClusterState", longArrayOf(lpsznodename, pdwclusterstate)).toUInt()
}

public fun GetNotifyEventHandle(hchange: HCHANGE, lphtargetevent: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "GetNotifyEventHandle", longArrayOf(hchange, lphtargetevent)).toUInt()
}

public fun InitializeClusterHealthFault(clusterhealthfault: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "InitializeClusterHealthFault", longArrayOf(clusterhealthfault)).toUInt()
}

public fun InitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "InitializeClusterHealthFaultArray", longArrayOf(clusterhealthfaultarray)).toUInt()
}

public fun IsFileOnClusterSharedVolume(lpszpathname: PCWSTR, pbfileisonsharedvolume: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "IsFileOnClusterSharedVolume", longArrayOf(lpszpathname, pbfileisonsharedvolume)).toUInt()
}

public fun MoveClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "MoveClusterGroup", longArrayOf(hgroup, hdestinationnode)).toUInt()
}

public fun MoveClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "MoveClusterGroupEx", longArrayOf(hgroup, hdestinationnode, dwmoveflags.toLong(), lpinbuffer, cbinbuffersize.toLong())).toUInt()
}

public fun MoveClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "MoveClusterGroupEx2", longArrayOf(hgroup, hdestinationnode, dwmoveflags.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpszreason)).toUInt()
}

public fun OfflineClusterGroup(hgroup: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OfflineClusterGroup", longArrayOf(hgroup)).toUInt()
}

public fun OfflineClusterGroupEx(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OfflineClusterGroupEx", longArrayOf(hgroup, dwofflineflags.toLong(), lpinbuffer, cbinbuffersize.toLong())).toUInt()
}

public fun OfflineClusterGroupEx2(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OfflineClusterGroupEx2", longArrayOf(hgroup, dwofflineflags.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpszreason)).toUInt()
}

public fun OfflineClusterResource(hresource: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OfflineClusterResource", longArrayOf(hresource)).toUInt()
}

public fun OfflineClusterResourceEx(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OfflineClusterResourceEx", longArrayOf(hresource, dwofflineflags.toLong(), lpinbuffer, cbinbuffersize.toLong())).toUInt()
}

public fun OfflineClusterResourceEx2(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OfflineClusterResourceEx2", longArrayOf(hresource, dwofflineflags.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpszreason)).toUInt()
}

public fun OnlineClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OnlineClusterGroup", longArrayOf(hgroup, hdestinationnode)).toUInt()
}

public fun OnlineClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OnlineClusterGroupEx", longArrayOf(hgroup, hdestinationnode, dwonlineflags.toLong(), lpinbuffer, cbinbuffersize.toLong())).toUInt()
}

public fun OnlineClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OnlineClusterGroupEx2", longArrayOf(hgroup, hdestinationnode, dwonlineflags.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpszreason)).toUInt()
}

public fun OnlineClusterResource(hresource: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OnlineClusterResource", longArrayOf(hresource)).toUInt()
}

public fun OnlineClusterResourceEx(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OnlineClusterResourceEx", longArrayOf(hresource, dwonlineflags.toLong(), lpinbuffer, cbinbuffersize.toLong())).toUInt()
}

public fun OnlineClusterResourceEx2(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "OnlineClusterResourceEx2", longArrayOf(hresource, dwonlineflags.toLong(), lpinbuffer, cbinbuffersize.toLong(), lpszreason)).toUInt()
}

public fun OpenCluster(lpszclustername: PCWSTR): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenCluster", longArrayOf(lpszclustername))
}

public fun OpenClusterCryptProvider(lpszresource: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER {
    return Win32DynamicFfi.invoke("resutils.dll", "OpenClusterCryptProvider", longArrayOf(lpszresource, lpszprovider, dwtype.toLong(), dwflags.toLong()))
}

public fun OpenClusterCryptProviderEx(lpszresource: PCWSTR, lpszkeyname: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER {
    return Win32DynamicFfi.invoke("resutils.dll", "OpenClusterCryptProviderEx", longArrayOf(lpszresource, lpszkeyname, lpszprovider, dwtype.toLong(), dwflags.toLong()))
}

public fun OpenClusterEx(lpszclustername: PCWSTR, desiredaccess: UInt, grantedaccess: Long): HCLUSTER {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterEx", longArrayOf(lpszclustername, desiredaccess.toLong(), grantedaccess))
}

public fun OpenClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterGroup", longArrayOf(hcluster, lpszgroupname))
}

public fun OpenClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HGROUP {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterGroupEx", longArrayOf(hcluster, lpszgroupname, dwdesiredaccess.toLong(), lpdwgrantedaccess))
}

public fun OpenClusterGroupSet(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterGroupSet", longArrayOf(hcluster, lpszgroupsetname))
}

public fun OpenClusterNetInterface(hcluster: HCLUSTER, lpszinterfacename: PCWSTR): HNETINTERFACE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNetInterface", longArrayOf(hcluster, lpszinterfacename))
}

public fun OpenClusterNetInterfaceEx(hcluster: HCLUSTER, lpszinterfacename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETINTERFACE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNetInterfaceEx", longArrayOf(hcluster, lpszinterfacename, dwdesiredaccess.toLong(), lpdwgrantedaccess))
}

public fun OpenClusterNetwork(hcluster: HCLUSTER, lpsznetworkname: PCWSTR): HNETWORK {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNetwork", longArrayOf(hcluster, lpsznetworkname))
}

public fun OpenClusterNetworkEx(hcluster: HCLUSTER, lpsznetworkname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETWORK {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNetworkEx", longArrayOf(hcluster, lpsznetworkname, dwdesiredaccess.toLong(), lpdwgrantedaccess))
}

public fun OpenClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR): HNODE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNode", longArrayOf(hcluster, lpsznodename))
}

public fun OpenClusterNodeById(hcluster: HCLUSTER, nodeid: UInt): HNODE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNodeById", longArrayOf(hcluster, nodeid.toLong()))
}

public fun OpenClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNODE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterNodeEx", longArrayOf(hcluster, lpsznodename, dwdesiredaccess.toLong(), lpdwgrantedaccess))
}

public fun OpenClusterResource(hcluster: HCLUSTER, lpszresourcename: PCWSTR): HRESOURCE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterResource", longArrayOf(hcluster, lpszresourcename))
}

public fun OpenClusterResourceEx(hcluster: HCLUSTER, lpszresourcename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HRESOURCE {
    return Win32DynamicFfi.invoke("clusapi.dll", "OpenClusterResourceEx", longArrayOf(hcluster, lpszresourcename, dwdesiredaccess.toLong(), lpdwgrantedaccess))
}

public fun PauseClusterNode(hnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "PauseClusterNode", longArrayOf(hnode)).toUInt()
}

public fun PauseClusterNodeEx(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "PauseClusterNodeEx", longArrayOf(hnode, bdrainnode.toLong(), dwpauseflags.toLong(), hnodedraintarget)).toUInt()
}

public fun PauseClusterNodeEx2(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "PauseClusterNodeEx2", longArrayOf(hnode, bdrainnode.toLong(), dwpauseflags.toLong(), hnodedraintarget, lpszreason)).toUInt()
}

public fun QueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "QueryAppInstanceVersion", longArrayOf(appinstanceid, instanceversionhigh, instanceversionlow, versionstatus)).toUInt()
}

public fun RegisterAppInstance(processhandle: HANDLE, appinstanceid: Long, childreninheritappinstance: BOOL): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "RegisterAppInstance", longArrayOf(processhandle, appinstanceid, childreninheritappinstance.toLong())).toUInt()
}

public fun RegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: ULong, instanceversionlow: ULong): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "RegisterAppInstanceVersion", longArrayOf(appinstanceid, instanceversionhigh.toLong(), instanceversionlow.toLong())).toUInt()
}

public fun RegisterClusterNotify(hchange: HCHANGE, dwfiltertype: UInt, hobject: HANDLE, dwnotifykey: ULong): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RegisterClusterNotify", longArrayOf(hchange, dwfiltertype.toLong(), hobject, dwnotifykey.toLong())).toUInt()
}

public fun RegisterClusterNotifyV2(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: HANDLE, dwnotifykey: ULong): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RegisterClusterNotifyV2", longArrayOf(hchange, run { val buf = ByteArray(16); buf[0] = (filter.dwObjectType.toInt() and 0xFF).toByte(); buf[1] = ((filter.dwObjectType.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((filter.dwObjectType.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((filter.dwObjectType.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (filter.FilterFlags and 0xFF).toByte(); buf[9] = ((filter.FilterFlags ushr 8) and 0xFF).toByte(); buf[10] = ((filter.FilterFlags ushr 16) and 0xFF).toByte(); buf[11] = ((filter.FilterFlags ushr 24) and 0xFF).toByte(); buf[12] = ((filter.FilterFlags ushr 32) and 0xFF).toByte(); buf[13] = ((filter.FilterFlags ushr 40) and 0xFF).toByte(); buf[14] = ((filter.FilterFlags ushr 48) and 0xFF).toByte(); buf[15] = ((filter.FilterFlags ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, hobject, dwnotifykey.toLong())).toUInt()
}

public fun RegisterClusterResourceTypeNotifyV2(hchange: HCHANGE, hcluster: HCLUSTER, flags: Long, restypename: PCWSTR, dwnotifykey: ULong): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RegisterClusterResourceTypeNotifyV2", longArrayOf(hchange, hcluster, flags, restypename, dwnotifykey.toLong())).toUInt()
}

public fun RemoveClusterGroupDependency(hgroup: HGROUP, hdependson: HGROUP): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterGroupDependency", longArrayOf(hgroup, hdependson)).toUInt()
}

public fun RemoveClusterGroupDependencyEx(hgroup: HGROUP, hdependson: HGROUP, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterGroupDependencyEx", longArrayOf(hgroup, hdependson, lpszreason)).toUInt()
}

public fun RemoveClusterGroupSetDependency(hgroupset: HGROUPSET, hdependson: HGROUPSET): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterGroupSetDependency", longArrayOf(hgroupset, hdependson)).toUInt()
}

public fun RemoveClusterGroupSetDependencyEx(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterGroupSetDependencyEx", longArrayOf(hgroupset, hdependson, lpszreason)).toUInt()
}

public fun RemoveClusterGroupToGroupSetDependency(hgroup: HGROUP, hdependson: HGROUPSET): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterGroupToGroupSetDependency", longArrayOf(hgroup, hdependson)).toUInt()
}

public fun RemoveClusterGroupToGroupSetDependencyEx(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterGroupToGroupSetDependencyEx", longArrayOf(hgroup, hdependson, lpszreason)).toUInt()
}

public fun RemoveClusterNameAccount(hcluster: HCLUSTER, bdeletecomputerobjects: BOOL): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterNameAccount", longArrayOf(hcluster, bdeletecomputerobjects.toLong())).toUInt()
}

public fun RemoveClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterResourceDependency", longArrayOf(hresource, hdependson)).toUInt()
}

public fun RemoveClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterResourceDependencyEx", longArrayOf(hresource, hdependson, lpszreason)).toUInt()
}

public fun RemoveClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterResourceNode", longArrayOf(hresource, hnode)).toUInt()
}

public fun RemoveClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterResourceNodeEx", longArrayOf(hresource, hnode, lpszreason)).toUInt()
}

public fun RemoveClusterStorageNode(hcluster: HCLUSTER, lpszclusterstorageenclosurename: PCWSTR, dwtimeout: UInt, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveClusterStorageNode", longArrayOf(hcluster, lpszclusterstorageenclosurename, dwtimeout.toLong(), dwflags.toLong())).toUInt()
}

public fun RemoveCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveCrossClusterGroupSetDependency", longArrayOf(hdependentgroupset, lpremoteclustername, lpremotegroupsetname)).toUInt()
}

public fun RemoveResourceFromClusterSharedVolumes(hresource: HRESOURCE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RemoveResourceFromClusterSharedVolumes", longArrayOf(hresource)).toUInt()
}

public fun ResUtilAddUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilAddUnknownProperties", longArrayOf(hkeyclusterkey, ppropertytable, poutpropertylist, pcboutpropertylistsize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilCreateDirectoryTree(pszpath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilCreateDirectoryTree", longArrayOf(pszpath)).toUInt()
}

public fun ResUtilDupGroup(group: HGROUP, copy: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilDupGroup", longArrayOf(group, copy)).toUInt()
}

public fun ResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilDupParameterBlock", longArrayOf(poutparams, pinparams, ppropertytable)).toUInt()
}

public fun ResUtilDupResource(group: HRESOURCE, copy: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilDupResource", longArrayOf(group, copy)).toUInt()
}

public fun ResUtilDupString(pszinstring: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilDupString", longArrayOf(pszinstring))
}

public fun ResUtilEnumGroups(hcluster: HCLUSTER, hself: HGROUP, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumGroups", longArrayOf(hcluster, hself, Win32DynamicFfi.objectSlot(prescallback), pparameter)).toUInt()
}

public fun ResUtilEnumGroupsEx(hcluster: HCLUSTER, hself: HGROUP, grouptype: CLUSGROUP_TYPE, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumGroupsEx", longArrayOf(hcluster, hself, grouptype.toLong(), Win32DynamicFfi.objectSlot(prescallback), pparameter)).toUInt()
}

public fun ResUtilEnumPrivateProperties(hkeyclusterkey: HKEY, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumPrivateProperties", longArrayOf(hkeyclusterkey, pszoutproperties, cboutpropertiessize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilEnumProperties(ppropertytable: Long, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumProperties", longArrayOf(ppropertytable, pszoutproperties, cboutpropertiessize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilEnumResources(hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumResources", longArrayOf(hself, lpszrestypename, Win32DynamicFfi.objectSlot(prescallback), pparameter)).toUInt()
}

public fun ResUtilEnumResourcesEx(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumResourcesEx", longArrayOf(hcluster, hself, lpszrestypename, Win32DynamicFfi.objectSlot(prescallback), pparameter)).toUInt()
}

public fun ResUtilEnumResourcesEx2(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long, dwdesiredaccess: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilEnumResourcesEx2", longArrayOf(hcluster, hself, lpszrestypename, Win32DynamicFfi.objectSlot(prescallback), pparameter, dwdesiredaccess.toLong())).toUInt()
}

public fun ResUtilExpandEnvironmentStrings(pszsrc: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilExpandEnvironmentStrings", longArrayOf(pszsrc))
}

public fun ResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindBinaryProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pbpropertyvalue, pcbpropertyvaluesize)).toUInt()
}

public fun ResUtilFindDependentDiskResourceDriveLetter(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: PWSTR, pcchdriveletter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindDependentDiskResourceDriveLetter", longArrayOf(hcluster, hresource, pszdriveletter, pcchdriveletter)).toUInt()
}

public fun ResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pdwpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindDwordProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pdwpropertyvalue)).toUInt()
}

public fun ResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindExpandSzProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pszpropertyvalue)).toUInt()
}

public fun ResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindExpandedSzProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pszpropertyvalue)).toUInt()
}

public fun ResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pftpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindFileTimeProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pftpropertyvalue)).toUInt()
}

public fun ResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindLongProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, plpropertyvalue)).toUInt()
}

public fun ResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindMultiSzProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pszpropertyvalue, pcbpropertyvaluesize)).toUInt()
}

public fun ResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindSzProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, pszpropertyvalue)).toUInt()
}

public fun ResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFindULargeIntegerProperty", longArrayOf(ppropertylist, cbpropertylistsize.toLong(), pszpropertyname, plpropertyvalue)).toUInt()
}

public fun ResUtilFreeEnvironment(lpenvironment: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilFreeEnvironment", longArrayOf(lpenvironment)).toUInt()
}

public fun ResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long) {
    Win32DynamicFfi.invoke("resutils.dll", "ResUtilFreeParameterBlock", longArrayOf(poutparams, pinparams, ppropertytable))
}

public fun ResUtilGetAllProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetAllProperties", longArrayOf(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetBinaryProperty", longArrayOf(ppboutvalue, pcboutvaluesize, pvaluestruct, pboldvalue, cboldvaluesize.toLong(), pppropertylist, pcbpropertylistsize)).toUInt()
}

public fun ResUtilGetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, ppboutvalue: Long, pcboutvaluesize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetBinaryValue", longArrayOf(hkeyclusterkey, pszvaluename, ppboutvalue, pcboutvaluesize)).toUInt()
}

public fun ResUtilGetClusterGroupType(hgroup: HGROUP, grouptype: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetClusterGroupType", longArrayOf(hgroup, grouptype)).toUInt()
}

public fun ResUtilGetClusterId(hcluster: HCLUSTER, guid: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetClusterId", longArrayOf(hcluster, guid)).toUInt()
}

public fun ResUtilGetClusterRoleState(hcluster: HCLUSTER, eclusterrole: CLUSTER_ROLE): CLUSTER_ROLE_STATE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetClusterRoleState", longArrayOf(hcluster, eclusterrole.toLong())).toInt()
}

public fun ResUtilGetCoreClusterResources(hcluster: HCLUSTER, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetCoreClusterResources", longArrayOf(hcluster, phclusternameresource, phclusteripaddressresource, phclusterquorumresource)).toUInt()
}

public fun ResUtilGetCoreClusterResourcesEx(hclusterin: HCLUSTER, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetCoreClusterResourcesEx", longArrayOf(hclusterin, phclusternameresourceout, phclusterquorumresourceout, dwdesiredaccess.toLong())).toUInt()
}

public fun ResUtilGetCoreGroup(hcluster: HCLUSTER): HGROUP {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetCoreGroup", longArrayOf(hcluster))
}

public fun ResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetDwordProperty", longArrayOf(pdwoutvalue, pvaluestruct, dwoldvalue.toLong(), dwminimum.toLong(), dwmaximum.toLong(), pppropertylist, pcbpropertylistsize)).toUInt()
}

public fun ResUtilGetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pdwoutvalue: Long, dwdefaultvalue: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetDwordValue", longArrayOf(hkeyclusterkey, pszvaluename, pdwoutvalue, dwdefaultvalue.toLong())).toUInt()
}

public fun ResUtilGetEnvironmentWithNetName(hresource: HRESOURCE): Long {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetEnvironmentWithNetName", longArrayOf(hresource))
}

public fun ResUtilGetFileTimeProperty(pftoutvalue: Long, pvaluestruct: Long, ftoldvalue: FILETIME, ftminimum: FILETIME, ftmaximum: FILETIME, pppropertylist: Long, pcbpropertylistsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetFileTimeProperty", longArrayOf(pftoutvalue, pvaluestruct, ((ftoldvalue.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftoldvalue.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), ((ftminimum.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftminimum.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), ((ftmaximum.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftmaximum.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), pppropertylist, pcbpropertylistsize)).toUInt()
}

public fun ResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetLongProperty", longArrayOf(ploutvalue, pvaluestruct, loldvalue.toLong(), lminimum.toLong(), lmaximum.toLong(), pppropertylist, pcbpropertylistsize)).toUInt()
}

public fun ResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetMultiSzProperty", longArrayOf(ppszoutvalue, pcboutvaluesize, pvaluestruct, pszoldvalue, cboldvaluesize.toLong(), pppropertylist, pcbpropertylistsize)).toUInt()
}

public fun ResUtilGetPrivateProperties(hkeyclusterkey: HKEY, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetPrivateProperties", longArrayOf(hkeyclusterkey, poutpropertylist, cboutpropertylistsize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilGetProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetProperties", longArrayOf(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilGetPropertiesToParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: BOOL, psznameofpropinerror: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetPropertiesToParameterBlock", longArrayOf(hkeyclusterkey, ppropertytable, poutparams, bcheckforrequiredproperties.toLong(), psznameofpropinerror)).toUInt()
}

public fun ResUtilGetProperty(hkeyclusterkey: HKEY, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetProperty", longArrayOf(hkeyclusterkey, ppropertytableitem, poutpropertyitem, pcboutpropertyitemsize)).toUInt()
}

public fun ResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetPropertyFormats", longArrayOf(ppropertytable, poutpropertyformatlist, cbpropertyformatlistsize.toLong(), pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilGetPropertySize(hkeyclusterkey: HKEY, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetPropertySize", longArrayOf(hkeyclusterkey, ppropertytableitem, pcboutpropertylistsize, pnpropertycount)).toUInt()
}

public fun ResUtilGetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pqwoutvalue: Long, qwdefaultvalue: ULong): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetQwordValue", longArrayOf(hkeyclusterkey, pszvaluename, pqwoutvalue, qwdefaultvalue.toLong())).toUInt()
}

public fun ResUtilGetResourceDependency(hself: HANDLE, lpszresourcetype: PCWSTR): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependency", longArrayOf(hself, lpszresourcetype))
}

public fun ResUtilGetResourceDependencyByClass(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependencyByClass", longArrayOf(hcluster, hself, prci, brecurse.toLong()))
}

public fun ResUtilGetResourceDependencyByClassEx(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependencyByClassEx", longArrayOf(hcluster, hself, prci, brecurse.toLong(), dwdesiredaccess.toLong()))
}

public fun ResUtilGetResourceDependencyByName(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependencyByName", longArrayOf(hcluster, hself, lpszresourcetype, brecurse.toLong()))
}

public fun ResUtilGetResourceDependencyByNameEx(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependencyByNameEx", longArrayOf(hcluster, hself, lpszresourcetype, brecurse.toLong(), dwdesiredaccess.toLong()))
}

public fun ResUtilGetResourceDependencyEx(hself: HANDLE, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependencyEx", longArrayOf(hself, lpszresourcetype, dwdesiredaccess.toLong()))
}

public fun ResUtilGetResourceDependentIPAddressProps(hresource: HRESOURCE, pszaddress: PWSTR, pcchaddress: Long, pszsubnetmask: PWSTR, pcchsubnetmask: Long, psznetwork: PWSTR, pcchnetwork: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceDependentIPAddressProps", longArrayOf(hresource, pszaddress, pcchaddress, pszsubnetmask, pcchsubnetmask, psznetwork, pcchnetwork)).toUInt()
}

public fun ResUtilGetResourceName(hresource: HRESOURCE, pszresourcename: PWSTR, pcchresourcenameinout: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceName", longArrayOf(hresource, pszresourcename, pcchresourcenameinout)).toUInt()
}

public fun ResUtilGetResourceNameDependency(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceNameDependency", longArrayOf(lpszresourcename, lpszresourcetype))
}

public fun ResUtilGetResourceNameDependencyEx(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetResourceNameDependencyEx", longArrayOf(lpszresourcename, lpszresourcetype, dwdesiredaccess.toLong()))
}

public fun ResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, pppropertylist: Long, pcbpropertylistsize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetSzProperty", longArrayOf(ppszoutvalue, pvaluestruct, pszoldvalue, pppropertylist, pcbpropertylistsize)).toUInt()
}

public fun ResUtilGetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGetSzValue", longArrayOf(hkeyclusterkey, pszvaluename))
}

public fun ResUtilGroupsEqual(hself: HGROUP, hgroup: HGROUP, pequal: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilGroupsEqual", longArrayOf(hself, hgroup, pequal)).toUInt()
}

public fun ResUtilIsPathValid(pszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilIsPathValid", longArrayOf(pszpath)).toInt()
}

public fun ResUtilIsResourceClassEqual(prci: Long, hresource: HRESOURCE): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilIsResourceClassEqual", longArrayOf(prci, hresource)).toInt()
}

public fun ResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilLeftPaxosIsLessThanRight", longArrayOf(left, right)).toInt()
}

public fun ResUtilNodeEnum(hcluster: HCLUSTER, pnodecallback: LPNODE_CALLBACK, pparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilNodeEnum", longArrayOf(hcluster, Win32DynamicFfi.objectSlot(pnodecallback), pparameter)).toUInt()
}

public fun ResUtilPaxosComparer(left: Long, right: Long): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilPaxosComparer", longArrayOf(left, right)).toInt()
}

public fun ResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilPropertyListFromParameterBlock", longArrayOf(ppropertytable, poutpropertylist, pcboutpropertylistsize, pinparams, pcbbytesreturned, pcbrequired)).toUInt()
}

public fun ResUtilRemoveResourceServiceEnvironment(pszservicename: PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilRemoveResourceServiceEnvironment", longArrayOf(pszservicename, Win32DynamicFfi.objectSlot(pfnlogevent), hresourcehandle)).toUInt()
}

public fun ResUtilResourceDepEnum(hself: HRESOURCE, enumtype: UInt, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilResourceDepEnum", longArrayOf(hself, enumtype.toLong(), Win32DynamicFfi.objectSlot(prescallback), pparameter)).toUInt()
}

public fun ResUtilResourceTypesEqual(lpszresourcetypename: PCWSTR, hresource: HRESOURCE): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilResourceTypesEqual", longArrayOf(lpszresourcetypename, hresource)).toInt()
}

public fun ResUtilResourcesEqual(hself: HRESOURCE, hresource: HRESOURCE): BOOL {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilResourcesEqual", longArrayOf(hself, hresource)).toInt()
}

public fun ResUtilSetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pbnewvalue: Long, cbnewvaluesize: UInt, ppboutvalue: Long, pcboutvaluesize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetBinaryValue", longArrayOf(hkeyclusterkey, pszvaluename, pbnewvalue, cbnewvaluesize.toLong(), ppboutvalue, pcboutvaluesize)).toUInt()
}

public fun ResUtilSetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, dwnewvalue: UInt, pdwoutvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetDwordValue", longArrayOf(hkeyclusterkey, pszvaluename, dwnewvalue.toLong(), pdwoutvalue)).toUInt()
}

public fun ResUtilSetExpandSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetExpandSzValue", longArrayOf(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring)).toUInt()
}

public fun ResUtilSetMultiSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, cbnewvaluesize: UInt, ppszoutvalue: Long, pcboutvaluesize: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetMultiSzValue", longArrayOf(hkeyclusterkey, pszvaluename, psznewvalue, cbnewvaluesize.toLong(), ppszoutvalue, pcboutvaluesize)).toUInt()
}

public fun ResUtilSetPrivatePropertyList(hkeyclusterkey: HKEY, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetPrivatePropertyList", longArrayOf(hkeyclusterkey, pinpropertylist, cbinpropertylistsize.toLong())).toUInt()
}

public fun ResUtilSetPropertyParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetPropertyParameterBlock", longArrayOf(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize.toLong(), poutparams)).toUInt()
}

public fun ResUtilSetPropertyParameterBlockEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetPropertyParameterBlockEx", longArrayOf(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize.toLong(), bforcewrite.toLong(), poutparams)).toUInt()
}

public fun ResUtilSetPropertyTable(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetPropertyTable", longArrayOf(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties.toLong(), pinpropertylist, cbinpropertylistsize.toLong(), poutparams)).toUInt()
}

public fun ResUtilSetPropertyTableEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetPropertyTableEx", longArrayOf(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties.toLong(), pinpropertylist, cbinpropertylistsize.toLong(), bforcewrite.toLong(), poutparams)).toUInt()
}

public fun ResUtilSetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, qwnewvalue: ULong, pqwoutvalue: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetQwordValue", longArrayOf(hkeyclusterkey, pszvaluename, qwnewvalue.toLong(), pqwoutvalue)).toUInt()
}

public fun ResUtilSetResourceServiceEnvironment(pszservicename: PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetResourceServiceEnvironment", longArrayOf(pszservicename, hresource, Win32DynamicFfi.objectSlot(pfnlogevent), hresourcehandle)).toUInt()
}

public fun ResUtilSetResourceServiceStartParameters(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetResourceServiceStartParameters", longArrayOf(pszservicename, schscmhandle, phservice, Win32DynamicFfi.objectSlot(pfnlogevent), hresourcehandle)).toUInt()
}

public fun ResUtilSetResourceServiceStartParametersEx(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, dwdesiredaccess: UInt, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetResourceServiceStartParametersEx", longArrayOf(pszservicename, schscmhandle, phservice, dwdesiredaccess.toLong(), Win32DynamicFfi.objectSlot(pfnlogevent), hresourcehandle)).toUInt()
}

public fun ResUtilSetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetSzValue", longArrayOf(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring)).toUInt()
}

public fun ResUtilSetUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetUnknownProperties", longArrayOf(hkeyclusterkey, ppropertytable, pinpropertylist, cbinpropertylistsize.toLong())).toUInt()
}

public fun ResUtilSetValueEx(hkeyclusterkey: HKEY, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuesize: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilSetValueEx", longArrayOf(hkeyclusterkey, valuename, valuetype.toLong(), valuedata, valuesize.toLong(), flags.toLong())).toUInt()
}

public fun ResUtilStartResourceService(pszservicename: PCWSTR, phservicehandle: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilStartResourceService", longArrayOf(pszservicename, phservicehandle)).toUInt()
}

public fun ResUtilStopResourceService(pszservicename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilStopResourceService", longArrayOf(pszservicename)).toUInt()
}

public fun ResUtilStopService(hservicehandle: SC_HANDLE): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilStopService", longArrayOf(hservicehandle)).toUInt()
}

public fun ResUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: BOOL, pdwresourcestate: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilTerminateServiceProcessFromResDll", longArrayOf(dwservicepid.toLong(), boffline.toLong(), pdwresourcestate, Win32DynamicFfi.objectSlot(pfnlogevent), hresourcehandle)).toUInt()
}

public fun ResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: UInt): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilVerifyPrivatePropertyList", longArrayOf(pinpropertylist, cbinpropertylistsize.toLong())).toUInt()
}

public fun ResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilVerifyPropertyTable", longArrayOf(ppropertytable, reserved, ballowunknownproperties.toLong(), pinpropertylist, cbinpropertylistsize.toLong(), poutparams)).toUInt()
}

public fun ResUtilVerifyResourceService(pszservicename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilVerifyResourceService", longArrayOf(pszservicename)).toUInt()
}

public fun ResUtilVerifyService(hservicehandle: SC_HANDLE): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilVerifyService", longArrayOf(hservicehandle)).toUInt()
}

public fun ResUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: Long): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilVerifyShutdownSafe", longArrayOf(flags.toLong(), reason.toLong(), presult)).toUInt()
}

public fun ResUtilsDeleteKeyTree(key: HKEY, keyname: PCWSTR, treatnokeyaserror: BOOL): UInt {
    return Win32DynamicFfi.invoke("resutils.dll", "ResUtilsDeleteKeyTree", longArrayOf(key, keyname, treatnokeyaserror.toLong())).toUInt()
}

public fun ResetAllAppInstanceVersions(): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "ResetAllAppInstanceVersions", longArrayOf()).toUInt()
}

public fun RestartClusterResource(hresource: HRESOURCE, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RestartClusterResource", longArrayOf(hresource, dwflags.toLong())).toUInt()
}

public fun RestartClusterResourceEx(hresource: HRESOURCE, dwflags: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RestartClusterResourceEx", longArrayOf(hresource, dwflags.toLong(), lpszreason)).toUInt()
}

public fun RestoreClusterDatabase(lpszpathname: PCWSTR, bforce: BOOL, lpszquorumdriveletter: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "RestoreClusterDatabase", longArrayOf(lpszpathname, bforce.toLong(), lpszquorumdriveletter)).toUInt()
}

public fun ResumeClusterNode(hnode: HNODE): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ResumeClusterNode", longArrayOf(hnode)).toUInt()
}

public fun ResumeClusterNodeEx(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ResumeClusterNodeEx", longArrayOf(hnode, eresumefailbacktype.toLong(), dwresumeflagsreserved.toLong())).toUInt()
}

public fun ResumeClusterNodeEx2(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "ResumeClusterNodeEx2", longArrayOf(hnode, eresumefailbacktype.toLong(), dwresumeflagsreserved.toLong(), lpszreason)).toUInt()
}

public fun SetAppInstanceCsvFlags(processhandle: HANDLE, mask: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "SetAppInstanceCsvFlags", longArrayOf(processhandle, mask.toLong(), flags.toLong())).toUInt()
}

public fun SetClusterGroupName(hgroup: HGROUP, lpszgroupname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterGroupName", longArrayOf(hgroup, lpszgroupname)).toUInt()
}

public fun SetClusterGroupNameEx(hgroup: HGROUP, lpszgroupname: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterGroupNameEx", longArrayOf(hgroup, lpszgroupname, lpszreason)).toUInt()
}

public fun SetClusterGroupNodeList(hgroup: HGROUP, nodecount: UInt, nodelist: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterGroupNodeList", longArrayOf(hgroup, nodecount.toLong(), nodelist)).toUInt()
}

public fun SetClusterGroupNodeListEx(hgroup: HGROUP, nodecount: UInt, nodelist: Long, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterGroupNodeListEx", longArrayOf(hgroup, nodecount.toLong(), nodelist, lpszreason)).toUInt()
}

public fun SetClusterGroupSetDependencyExpression(hgroupset: HGROUPSET, lpszdependencyexprssion: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterGroupSetDependencyExpression", longArrayOf(hgroupset, lpszdependencyexprssion)).toUInt()
}

public fun SetClusterGroupSetDependencyExpressionEx(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterGroupSetDependencyExpressionEx", longArrayOf(hgroupset, lpszdependencyexpression, lpszreason)).toUInt()
}

public fun SetClusterName(hcluster: HCLUSTER, lpsznewclustername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterName", longArrayOf(hcluster, lpsznewclustername)).toUInt()
}

public fun SetClusterNameEx(hcluster: HCLUSTER, lpsznewclustername: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterNameEx", longArrayOf(hcluster, lpsznewclustername, lpszreason)).toUInt()
}

public fun SetClusterNetworkName(hnetwork: HNETWORK, lpszname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterNetworkName", longArrayOf(hnetwork, lpszname)).toUInt()
}

public fun SetClusterNetworkNameEx(hnetwork: HNETWORK, lpszname: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterNetworkNameEx", longArrayOf(hnetwork, lpszname, lpszreason)).toUInt()
}

public fun SetClusterNetworkPriorityOrder(hcluster: HCLUSTER, networkcount: UInt, networklist: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterNetworkPriorityOrder", longArrayOf(hcluster, networkcount.toLong(), networklist)).toUInt()
}

public fun SetClusterQuorumResource(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquologsize: UInt): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterQuorumResource", longArrayOf(hresource, lpszdevicename, dwmaxquologsize.toLong())).toUInt()
}

public fun SetClusterQuorumResourceEx(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquorumlogsize: UInt, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterQuorumResourceEx", longArrayOf(hresource, lpszdevicename, dwmaxquorumlogsize.toLong(), lpszreason)).toUInt()
}

public fun SetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterResourceDependencyExpression", longArrayOf(hresource, lpszdependencyexpression)).toUInt()
}

public fun SetClusterResourceName(hresource: HRESOURCE, lpszresourcename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterResourceName", longArrayOf(hresource, lpszresourcename)).toUInt()
}

public fun SetClusterResourceNameEx(hresource: HRESOURCE, lpszresourcename: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterResourceNameEx", longArrayOf(hresource, lpszresourcename, lpszreason)).toUInt()
}

public fun SetClusterServiceAccountPassword(lpszclustername: PCWSTR, lpsznewpassword: PCWSTR, dwflags: UInt, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetClusterServiceAccountPassword", longArrayOf(lpszclustername, lpsznewpassword, dwflags.toLong(), lpreturnstatusbuffer, lpcbreturnstatusbuffersize)).toUInt()
}

public fun SetGroupDependencyExpression(hgroup: HGROUP, lpszdependencyexpression: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetGroupDependencyExpression", longArrayOf(hgroup, lpszdependencyexpression)).toUInt()
}

public fun SetGroupDependencyExpressionEx(hgroup: HGROUP, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("clusapi.dll", "SetGroupDependencyExpressionEx", longArrayOf(hgroup, lpszdependencyexpression, lpszreason)).toUInt()
}
