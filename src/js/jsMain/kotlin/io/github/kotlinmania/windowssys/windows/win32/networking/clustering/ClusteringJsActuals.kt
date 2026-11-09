@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

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

private val _windowsWin32NetworkingClusteringNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddClusterGroupDependency(hdependentgroup: HGROUP, hprovidergroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterGroupDependency(hdependentgroup.toString(), hprovidergroup.toString()) as Int).toUInt() else 0u

public actual fun AddClusterGroupDependencyEx(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx(hdependentgroup.toString(), hprovidergroup.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun AddClusterGroupSetDependency(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency(hdependentgroupset.toString(), hprovidergroupset.toString()) as Int).toUInt() else 0u

public actual fun AddClusterGroupSetDependencyEx(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx(hdependentgroupset.toString(), hprovidergroupset.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun AddClusterGroupToGroupSetDependency(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency(hdependentgroup.toString(), hprovidergroupset.toString()) as Int).toUInt() else 0u

public actual fun AddClusterGroupToGroupSetDependencyEx(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx(hdependentgroup.toString(), hprovidergroupset.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun AddClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterNode(hcluster.toString(), lpsznodename.toString(), pfnprogresscallback.toLong().toString(), pvcallbackarg.toString()) as String).toLong() else 0L

public actual fun AddClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwflags: UInt, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterNodeEx(hcluster.toString(), lpsznodename.toString(), dwflags.toInt(), pfnprogresscallback.toLong().toString(), pvcallbackarg.toString()) as String).toLong() else 0L

public actual fun AddClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterResourceDependency(hresource.toString(), hdependson.toString()) as Int).toUInt() else 0u

public actual fun AddClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun AddClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterResourceNode(hresource.toString(), hnode.toString()) as Int).toUInt() else 0u

public actual fun AddClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx(hresource.toString(), hnode.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun AddClusterStorageNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, lpszclusterstoragenodedescription: PCWSTR, lpszclusterstoragenodelocation: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddClusterStorageNode(hcluster.toString(), lpsznodename.toString(), pfnprogresscallback.toLong().toString(), pvcallbackarg.toString(), lpszclusterstoragenodedescription.toString(), lpszclusterstoragenodelocation.toString()) as Int).toUInt() else 0u

public actual fun AddCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency(hdependentgroupset.toString(), lpremoteclustername.toString(), lpremotegroupsetname.toString()) as Int).toUInt() else 0u

public actual fun AddResourceToClusterSharedVolumes(hresource: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes(hresource.toString()) as Int).toUInt() else 0u

public actual fun BackupClusterDatabase(hcluster: HCLUSTER, lpszpathname: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_BackupClusterDatabase(hcluster.toString(), lpszpathname.toString()) as Int).toUInt() else 0u

public actual fun CanResourceBeDependent(hresource: HRESOURCE, hresourcedependent: HRESOURCE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CanResourceBeDependent(hresource.toString(), hresourcedependent.toString()) as Int) else 0

public actual fun CancelClusterGroupOperation(hgroup: HGROUP, dwcancelflags_reserved: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation(hgroup.toString(), dwcancelflags_reserved.toInt()) as Int).toUInt() else 0u

public actual fun ChangeClusterResourceGroup(hresource: HRESOURCE, hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup(hresource.toString(), hgroup.toString()) as Int).toUInt() else 0u

public actual fun ChangeClusterResourceGroupEx(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx(hresource.toString(), hgroup.toString(), flags.toString()) as Int).toUInt() else 0u

public actual fun ChangeClusterResourceGroupEx2(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2(hresource.toString(), hgroup.toString(), flags.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun CloseCluster(hcluster: HCLUSTER): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseCluster(hcluster.toString()) as Int) else 0

public actual fun CloseClusterCryptProvider(hcluscryptprovider: HCLUSCRYPTPROVIDER): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider(hcluscryptprovider.toString()) as Int).toUInt() else 0u

public actual fun CloseClusterGroup(hgroup: HGROUP): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterGroup(hgroup.toString()) as Int) else 0

public actual fun CloseClusterGroupSet(hgroupset: HGROUPSET): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterGroupSet(hgroupset.toString()) as Int) else 0

public actual fun CloseClusterNetInterface(hnetinterface: HNETINTERFACE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterNetInterface(hnetinterface.toString()) as Int) else 0

public actual fun CloseClusterNetwork(hnetwork: HNETWORK): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterNetwork(hnetwork.toString()) as Int) else 0

public actual fun CloseClusterNode(hnode: HNODE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterNode(hnode.toString()) as Int) else 0

public actual fun CloseClusterNotifyPort(hchange: HCHANGE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort(hchange.toString()) as Int) else 0

public actual fun CloseClusterResource(hresource: HRESOURCE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CloseClusterResource(hresource.toString()) as Int) else 0

public actual fun ClusAddClusterHealthFault(hcluster: HCLUSTER, failure: Long, param2: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault(hcluster.toString(), failure.toString(), param2.toInt()) as Int).toUInt() else 0u

public actual fun ClusGetClusterHealthFaults(hcluster: HCLUSTER, objects: Long, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults(hcluster.toString(), objects.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun ClusRemoveClusterHealthFault(hcluster: HCLUSTER, id: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault(hcluster.toString(), id.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun ClusWorkerCheckTerminate(lpworker: Long): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate(lpworker.toString()) as Int) else 0

public actual fun ClusWorkerCreate(lpworker: Long, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusWorkerCreate(lpworker.toString(), lpstartaddress.toLong().toString(), lpparameter.toString()) as Int).toUInt() else 0u

public actual fun ClusWorkerTerminate(lpworker: Long) {
    if (_windowsWin32NetworkingClusteringNapiAddon != null) {
        _windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusWorkerTerminate(lpworker.toString())
    }
}

public actual fun ClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx(clusworker.toString(), timeoutinmilliseconds.toInt(), waitonly) as Int).toUInt() else 0u

public actual fun ClusWorkersTerminate(clusworkers: Long, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusWorkersTerminate(clusworkers.toString(), clusworkerscount.toString(), timeoutinmilliseconds.toInt(), waitonly) as Int).toUInt() else 0u

public actual fun ClusapiSetReasonHandler(lphandler: Long): Long =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler(lphandler.toString()) as String).toLong() else 0L

public actual fun ClusterAddGroupToAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule(hcluster.toString(), rulename.toString(), hgroup.toString()) as Int).toUInt() else 0u

public actual fun ClusterAddGroupToGroupSet(hgroupset: HGROUPSET, hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet(hgroupset.toString(), hgroup.toString()) as Int).toUInt() else 0u

public actual fun ClusterAddGroupToGroupSetWithDomains(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt()) as Int).toUInt() else 0u

public actual fun ClusterAddGroupToGroupSetWithDomainsEx(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterAffinityRuleControl(hcluster: HCLUSTER, affinityrulename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl(hcluster.toString(), affinityrulename.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterClearBackupStateForSharedVolume(lpszvolumepathname: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume(lpszvolumepathname.toString()) as Int).toUInt() else 0u

public actual fun ClusterCloseEnum(henum: HCLUSENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterCloseEnum(henum.toString()) as Int).toUInt() else 0u

public actual fun ClusterCloseEnumEx(hclusterenum: HCLUSENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx(hclusterenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterControl(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterControl(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterControlEx(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterControlEx(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterCreateAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule(hcluster.toString(), rulename.toString(), ruletype) as Int).toUInt() else 0u

public actual fun ClusterDecrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: Long, cbcryptinput: UInt, ppcryptoutput: Long, pcbcryptoutput: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterDecrypt(hcluscryptprovider.toString(), pcryptinput.toString(), cbcryptinput.toInt(), ppcryptoutput.toString(), pcbcryptoutput.toString()) as Int).toUInt() else 0u

public actual fun ClusterEncrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: Long, cbdata: UInt, ppdata: Long, pcbdata: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterEncrypt(hcluscryptprovider.toString(), pdata.toString(), cbdata.toInt(), ppdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun ClusterEnum(henum: HCLUSENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterEnum(henum.toString(), dwindex.toInt(), lpdwtype.toString(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterEnumEx(hclusterenum: HCLUSENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterEnumEx(hclusterenum.toString(), dwindex.toInt(), pitem.toString(), cbitem.toString()) as Int).toUInt() else 0u

public actual fun ClusterGetEnumCount(henum: HCLUSENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGetEnumCount(henum.toString()) as Int).toUInt() else 0u

public actual fun ClusterGetEnumCountEx(hclusterenum: HCLUSENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx(hclusterenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint.toString(), lpszvolumename.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun ClusterGetVolumePathName(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName(lpszfilename.toString(), lpszvolumepathname.toString(), cchbufferlength.toInt()) as Int) else 0

public actual fun ClusterGroupCloseEnum(hgroupenum: HGROUPENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum(hgroupenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupCloseEnumEx(hgroupenumex: HGROUPENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx(hgroupenumex.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupControl(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupControl(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupControlEx(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupControlEx(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupEnum(hgroupenum: HGROUPENUM, dwindex: UInt, lpdwtype: Long, lpszresourcename: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupEnum(hgroupenum.toString(), dwindex.toInt(), lpdwtype.toString(), lpszresourcename.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupEnumEx(hgroupenumex: HGROUPENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx(hgroupenumex.toString(), dwindex.toInt(), pitem.toString(), cbitem.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupGetEnumCount(hgroupenum: HGROUPENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount(hgroupenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupGetEnumCountEx(hgroupenumex: HGROUPENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx(hgroupenumex.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupOpenEnum(hgroup: HGROUP, dwtype: UInt): HGROUPENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum(hgroup.toString(), dwtype.toInt()) as String).toLong() else 0L

public actual fun ClusterGroupOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HGROUPENUMEX =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx(hcluster.toString(), lpszproperties.toString(), cbproperties.toInt(), lpszroproperties.toString(), cbroproperties.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun ClusterGroupSetCloseEnum(hgroupsetenum: HGROUPSETENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum(hgroupsetenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupSetControl(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupSetControl(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupSetControlEx(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupSetEnum(hgroupsetenum: HGROUPSETENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum(hgroupsetenum.toString(), dwindex.toInt(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupSetGetEnumCount(hgroupsetenum: HGROUPSETENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount(hgroupsetenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterGroupSetOpenEnum(hcluster: HCLUSTER): HGROUPSETENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum(hcluster.toString()) as String).toLong() else 0L

public actual fun ClusterIsPathOnSharedVolume(lpszpathname: PCWSTR): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume(lpszpathname.toString()) as Int) else 0

public actual fun ClusterNetInterfaceCloseEnum(hnetinterfaceenum: HNETINTERFACEENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum(hnetinterfaceenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetInterfaceControl(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetInterfaceControlEx(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetInterfaceEnum(hnetinterfaceenum: HNETINTERFACEENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum(hnetinterfaceenum.toString(), dwindex.toInt(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetInterfaceOpenEnum(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR): HNETINTERFACEENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum(hcluster.toString(), lpsznodename.toString(), lpsznetworkname.toString()) as String).toLong() else 0L

public actual fun ClusterNetworkCloseEnum(hnetworkenum: HNETWORKENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum(hnetworkenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetworkControl(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetworkControl(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetworkControlEx(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetworkEnum(hnetworkenum: HNETWORKENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetworkEnum(hnetworkenum.toString(), dwindex.toInt(), lpdwtype.toString(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetworkGetEnumCount(hnetworkenum: HNETWORKENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount(hnetworkenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNetworkOpenEnum(hnetwork: HNETWORK, dwtype: UInt): HNETWORKENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum(hnetwork.toString(), dwtype.toInt()) as String).toLong() else 0L

public actual fun ClusterNodeCloseEnum(hnodeenum: HNODEENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum(hnodeenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeCloseEnumEx(hnodeenum: HNODEENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx(hnodeenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeControl(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeControl(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeControlEx(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeControlEx(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeEnum(hnodeenum: HNODEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeEnum(hnodeenum.toString(), dwindex.toInt(), lpdwtype.toString(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeEnumEx(hnodeenum: HNODEENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx(hnodeenum.toString(), dwindex.toInt(), pitem.toString(), cbitem.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeGetEnumCount(hnodeenum: HNODEENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount(hnodeenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeGetEnumCountEx(hnodeenum: HNODEENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx(hnodeenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterNodeOpenEnum(hnode: HNODE, dwtype: UInt): HNODEENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum(hnode.toString(), dwtype.toInt()) as String).toLong() else 0L

public actual fun ClusterNodeOpenEnumEx(hnode: HNODE, dwtype: UInt, poptions: Long): HNODEENUMEX =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx(hnode.toString(), dwtype.toInt(), poptions.toString()) as String).toLong() else 0L

public actual fun ClusterNodeReplacement(hcluster: HCLUSTER, lpsznodenamecurrent: PCWSTR, lpsznodenamenew: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterNodeReplacement(hcluster.toString(), lpsznodenamecurrent.toString(), lpsznodenamenew.toString()) as Int).toUInt() else 0u

public actual fun ClusterOpenEnum(hcluster: HCLUSTER, dwtype: UInt): HCLUSENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterOpenEnum(hcluster.toString(), dwtype.toInt()) as String).toLong() else 0L

public actual fun ClusterOpenEnumEx(hcluster: HCLUSTER, dwtype: UInt, poptions: Long): HCLUSENUMEX =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx(hcluster.toString(), dwtype.toInt(), poptions.toString()) as String).toLong() else 0L

public actual fun ClusterPrepareSharedVolumeForBackup(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, lpcchvolumepathname: Long, lpszvolumename: PWSTR, lpcchvolumename: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup(lpszfilename.toString(), lpszvolumepathname.toString(), lpcchvolumepathname.toString(), lpszvolumename.toString(), lpcchvolumename.toString()) as Int).toUInt() else 0u

public actual fun ClusterRegBatchAddCommand(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: PCWSTR, dwoptions: UInt, lpdata: Long, cbdata: UInt): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand(hregbatch.toString(), dwcommand, wzname.toString(), dwoptions.toInt(), lpdata.toString(), cbdata.toInt()) as Int) else 0

public actual fun ClusterRegBatchCloseNotification(hbatchnotification: HREGBATCHNOTIFICATION): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification(hbatchnotification.toString()) as Int) else 0

public actual fun ClusterRegBatchReadCommand(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand(hbatchnotification.toString(), pbatchcommand.toString()) as Int) else 0

public actual fun ClusterRegCloseBatch(hregbatch: HREGBATCH, bcommit: BOOL, failedcommandnumber: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch(hregbatch.toString(), bcommit, failedcommandnumber.toString()) as Int) else 0

public actual fun ClusterRegCloseBatchEx(hregbatch: HREGBATCH, flags: UInt, failedcommandnumber: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx(hregbatch.toString(), flags.toInt(), failedcommandnumber.toString()) as Int) else 0

public actual fun ClusterRegCloseBatchNotifyPort(hbatchnotifyport: HREGBATCHPORT): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort(hbatchnotifyport.toString()) as Int) else 0

public actual fun ClusterRegCloseKey(hkey: HKEY): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseKey(hkey.toString()) as Int) else 0

public actual fun ClusterRegCloseReadBatch(hregreadbatch: HREGREADBATCH, phregreadbatchreply: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch(hregreadbatch.toString(), phregreadbatchreply.toString()) as Int) else 0

public actual fun ClusterRegCloseReadBatchEx(hregreadbatch: HREGREADBATCH, flags: UInt, phregreadbatchreply: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx(hregreadbatch.toString(), flags.toInt(), phregreadbatchreply.toString()) as Int) else 0

public actual fun ClusterRegCloseReadBatchReply(hregreadbatchreply: HREGREADBATCHREPLY): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply(hregreadbatchreply.toString()) as Int) else 0

public actual fun ClusterRegCreateBatch(hkey: HKEY, phregbatch: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch(hkey.toString(), phregbatch.toString()) as Int) else 0

public actual fun ClusterRegCreateBatchNotifyPort(hkey: HKEY, phbatchnotifyport: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort(hkey.toString(), phbatchnotifyport.toString()) as Int) else 0

public actual fun ClusterRegCreateKey(hkey: HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCreateKey(hkey.toString(), lpszsubkey.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString()) as Int) else 0

public actual fun ClusterRegCreateKeyEx(hkey: HKEY, lpsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: PCWSTR): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx(hkey.toString(), lpsubkey.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString(), lpszreason.toString()) as Int) else 0

public actual fun ClusterRegCreateReadBatch(hkey: HKEY, phregreadbatch: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch(hkey.toString(), phregreadbatch.toString()) as Int) else 0

public actual fun ClusterRegDeleteKey(hkey: HKEY, lpszsubkey: PCWSTR): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey(hkey.toString(), lpszsubkey.toString()) as Int) else 0

public actual fun ClusterRegDeleteKeyEx(hkey: HKEY, lpsubkey: PCWSTR, lpszreason: PCWSTR): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx(hkey.toString(), lpsubkey.toString(), lpszreason.toString()) as Int) else 0

public actual fun ClusterRegDeleteValue(hkey: HKEY, lpszvaluename: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue(hkey.toString(), lpszvaluename.toString()) as Int).toUInt() else 0u

public actual fun ClusterRegDeleteValueEx(hkey: HKEY, lpszvaluename: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx(hkey.toString(), lpszvaluename.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterRegEnumKey(hkey: HKEY, dwindex: UInt, lpszname: PWSTR, lpcchname: Long, lpftlastwritetime: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegEnumKey(hkey.toString(), dwindex.toInt(), lpszname.toString(), lpcchname.toString(), lpftlastwritetime.toString()) as Int) else 0

public actual fun ClusterRegEnumValue(hkey: HKEY, dwindex: UInt, lpszvaluename: PWSTR, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegEnumValue(hkey.toString(), dwindex.toInt(), lpszvaluename.toString(), lpcchvaluename.toString(), lpdwtype.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun ClusterRegGetBatchNotification(hbatchnotify: HREGBATCHPORT, phbatchnotification: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification(hbatchnotify.toString(), phbatchnotification.toString()) as Int) else 0

public actual fun ClusterRegGetKeySecurity(hkey: HKEY, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity(hkey.toString(), requestedinformation.toInt(), psecuritydescriptor.toString(), lpcbsecuritydescriptor.toString()) as Int) else 0

public actual fun ClusterRegOpenKey(hkey: HKEY, lpszsubkey: PCWSTR, samdesired: UInt, phkresult: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegOpenKey(hkey.toString(), lpszsubkey.toString(), samdesired.toInt(), phkresult.toString()) as Int) else 0

public actual fun ClusterRegQueryInfoKey(hkey: HKEY, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey(hkey.toString(), lpcsubkeys.toString(), lpcchmaxsubkeylen.toString(), lpcvalues.toString(), lpcchmaxvaluenamelen.toString(), lpcbmaxvaluelen.toString(), lpcbsecuritydescriptor.toString(), lpftlastwritetime.toString()) as Int) else 0

public actual fun ClusterRegQueryValue(hkey: HKEY, lpszvaluename: PCWSTR, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegQueryValue(hkey.toString(), lpszvaluename.toString(), lpdwvaluetype.toString(), lpdata.toString(), lpcbdata.toString()) as Int) else 0

public actual fun ClusterRegReadBatchAddCommand(hregreadbatch: HREGREADBATCH, wzsubkeyname: PCWSTR, wzvaluename: PCWSTR): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand(hregreadbatch.toString(), wzsubkeyname.toString(), wzvaluename.toString()) as Int) else 0

public actual fun ClusterRegReadBatchReplyNextCommand(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: Long): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand(hregreadbatchreply.toString(), pbatchcommand.toString()) as Int) else 0

public actual fun ClusterRegSetKeySecurity(hkey: HKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity(hkey.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int) else 0

public actual fun ClusterRegSetKeySecurityEx(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpszreason: PCWSTR): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx(hkey.toString(), securityinformation.toInt(), psecuritydescriptor.toString(), lpszreason.toString()) as Int) else 0

public actual fun ClusterRegSetValue(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegSetValue(hkey.toString(), lpszvaluename.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun ClusterRegSetValueEx(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx(hkey.toString(), lpszvaluename.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterRegSyncDatabase(hcluster: HCLUSTER, flags: UInt): Int =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase(hcluster.toString(), flags.toInt()) as Int) else 0

public actual fun ClusterRemoveAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule(hcluster.toString(), rulename.toString()) as Int).toUInt() else 0u

public actual fun ClusterRemoveGroupFromAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule(hcluster.toString(), rulename.toString(), hgroup.toString()) as Int).toUInt() else 0u

public actual fun ClusterRemoveGroupFromGroupSet(hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet(hgroup.toString()) as Int).toUInt() else 0u

public actual fun ClusterRemoveGroupFromGroupSetEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx(hgroup.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceCloseEnum(hresenum: HRESENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum(hresenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceCloseEnumEx(hresourceenumex: HRESENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx(hresourceenumex.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceControl(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceControl(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceControlAsUser(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceControlAsUserEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceControlEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceControlEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceEnum(hresenum: HRESENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceEnum(hresenum.toString(), dwindex.toInt(), lpdwtype.toString(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceEnumEx(hresourceenumex: HRESENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx(hresourceenumex.toString(), dwindex.toInt(), pitem.toString(), cbitem.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceGetEnumCount(hresenum: HRESENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount(hresenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceGetEnumCountEx(hresourceenumex: HRESENUMEX): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx(hresourceenumex.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceOpenEnum(hresource: HRESOURCE, dwtype: UInt): HRESENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum(hresource.toString(), dwtype.toInt()) as String).toLong() else 0L

public actual fun ClusterResourceOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HRESENUMEX =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx(hcluster.toString(), lpszproperties.toString(), cbproperties.toInt(), lpszroproperties.toString(), cbroproperties.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun ClusterResourceTypeCloseEnum(hrestypeenum: HRESTYPEENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum(hrestypeenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeControl(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl(hcluster.toString(), lpszresourcetypename.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeControlAsUser(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser(hcluster.toString(), lpszresourcetypename.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeControlAsUserEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx(hcluster.toString(), lpszresourcetypename.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeControlEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx(hcluster.toString(), lpszresourcetypename.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), ninbuffersize.toInt(), lpoutbuffer.toString(), noutbuffersize.toInt(), lpbytesreturned.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeEnum(hrestypeenum: HRESTYPEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum(hrestypeenum.toString(), dwindex.toInt(), lpdwtype.toString(), lpszname.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeGetEnumCount(hrestypeenum: HRESTYPEENUM): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount(hrestypeenum.toString()) as Int).toUInt() else 0u

public actual fun ClusterResourceTypeOpenEnum(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, dwtype: UInt): HRESTYPEENUM =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum(hcluster.toString(), lpszresourcetypename.toString(), dwtype.toInt()) as String).toLong() else 0L

public actual fun ClusterSetAccountAccess(hcluster: HCLUSTER, szaccountsid: PCWSTR, dwaccess: UInt, dwcontroltype: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess(hcluster.toString(), szaccountsid.toString(), dwaccess.toInt(), dwcontroltype.toInt()) as Int).toUInt() else 0u

public actual fun ClusterSharedVolumeSetSnapshotState(guidsnapshotset: GUID, lpszvolumename: PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE): UInt =
    0u

public actual fun ClusterUpgradeFunctionalLevel(hcluster: HCLUSTER, perform: BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel(hcluster.toString(), perform, pfnprogresscallback.toLong().toString(), pvcallbackarg.toString()) as Int).toUInt() else 0u

public actual fun CreateCluster(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateCluster(pconfig.toString(), pfnprogresscallback.toLong().toString(), pvcallbackarg.toString()) as String).toLong() else 0L

public actual fun CreateClusterAvailabilitySet(hcluster: HCLUSTER, lpavailabilitysetname: PCWSTR, pavailabilitysetconfig: Long): HGROUPSET =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet(hcluster.toString(), lpavailabilitysetname.toString(), pavailabilitysetconfig.toString()) as String).toLong() else 0L

public actual fun CreateClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterGroup(hcluster.toString(), lpszgroupname.toString()) as String).toLong() else 0L

public actual fun CreateClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, pgroupinfo: Long): HGROUP =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterGroupEx(hcluster.toString(), lpszgroupname.toString(), pgroupinfo.toString()) as String).toLong() else 0L

public actual fun CreateClusterGroupSet(hcluster: HCLUSTER, groupsetname: PCWSTR): HGROUPSET =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterGroupSet(hcluster.toString(), groupsetname.toString()) as String).toLong() else 0L

public actual fun CreateClusterNameAccount(hcluster: HCLUSTER, pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterNameAccount(hcluster.toString(), pconfig.toString(), pfnprogresscallback.toLong().toString(), pvcallbackarg.toString()) as Int).toUInt() else 0u

public actual fun CreateClusterNotifyPort(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: UInt, dwnotifykey: ULong): HCHANGE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort(hchange.toString(), hcluster.toString(), dwfilter.toInt(), dwnotifykey.toString()) as String).toLong() else 0L

public actual fun CreateClusterNotifyPortV2(hchange: HCHANGE, hcluster: HCLUSTER, filters: Long, dwfiltercount: UInt, dwnotifykey: ULong): HCHANGE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2(hchange.toString(), hcluster.toString(), filters.toString(), dwfiltercount.toInt(), dwnotifykey.toString()) as String).toLong() else 0L

public actual fun CreateClusterResource(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterResource(hgroup.toString(), lpszresourcename.toString(), lpszresourcetype.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CreateClusterResourceEx(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt, lpszreason: PCWSTR): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterResourceEx(hgroup.toString(), lpszresourcename.toString(), lpszresourcetype.toString(), dwflags.toInt(), lpszreason.toString()) as String).toLong() else 0L

public actual fun CreateClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterResourceType(hcluster.toString(), lpszresourcetypename.toString(), lpszdisplayname.toString(), lpszresourcetypedll.toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()) as Int).toUInt() else 0u

public actual fun CreateClusterResourceTypeEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx(hcluster.toString(), lpszresourcetypename.toString(), lpszdisplayname.toString(), lpszresourcetypedll.toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterGroup(hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterGroup(hgroup.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx(hgroup.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterGroupSet(hgroupset: HGROUPSET): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet(hgroupset.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterGroupSetEx(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx(hgroupset.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterResource(hresource: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterResource(hresource.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx(hresource.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterResourceType(hcluster.toString(), lpszresourcetypename.toString()) as Int).toUInt() else 0u

public actual fun DeleteClusterResourceTypeEx(hcluster: HCLUSTER, lpsztypename: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx(hcluster.toString(), lpsztypename.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun DestroyCluster(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, fdeletevirtualcomputerobjects: BOOL): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DestroyCluster(hcluster.toString(), pfnprogresscallback.toLong().toString(), pvcallbackarg.toString(), fdeletevirtualcomputerobjects) as Int).toUInt() else 0u

public actual fun DestroyClusterGroup(hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DestroyClusterGroup(hgroup.toString()) as Int).toUInt() else 0u

public actual fun DestroyClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx(hgroup.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun DetermineCNOResTypeFromCluster(hcluster: HCLUSTER, pcnorestype: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster(hcluster.toString(), pcnorestype.toString()) as Int).toUInt() else 0u

public actual fun DetermineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcnorestype: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist(cnodes.toInt(), ppsznodenames.toString(), pcnorestype.toString()) as Int).toUInt() else 0u

public actual fun DetermineClusterCloudTypeFromCluster(hcluster: HCLUSTER, pcloudtype: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster(hcluster.toString(), pcloudtype.toString()) as Int).toUInt() else 0u

public actual fun DetermineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcloudtype: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist(cnodes.toInt(), ppsznodenames.toString(), pcloudtype.toString()) as Int).toUInt() else 0u

public actual fun EvictClusterNode(hnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_EvictClusterNode(hnode.toString()) as Int).toUInt() else 0u

public actual fun EvictClusterNodeEx(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_EvictClusterNodeEx(hnode.toString(), dwtimeout.toInt(), phrcleanupstatus.toString()) as Int).toUInt() else 0u

public actual fun EvictClusterNodeEx2(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2(hnode.toString(), dwtimeout.toInt(), phrcleanupstatus.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun FailClusterResource(hresource: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_FailClusterResource(hresource.toString()) as Int).toUInt() else 0u

public actual fun FailClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_FailClusterResourceEx(hresource.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun FreeClusterCrypt(pcryptinfo: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_FreeClusterCrypt(pcryptinfo.toString()) as Int).toUInt() else 0u

public actual fun FreeClusterHealthFault(clusterhealthfault: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_FreeClusterHealthFault(clusterhealthfault.toString()) as Int).toUInt() else 0u

public actual fun FreeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray(clusterhealthfaultarray.toString()) as Int).toUInt() else 0u

public actual fun GetClusterFromGroup(hgroup: HGROUP): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterFromGroup(hgroup.toString()) as String).toLong() else 0L

public actual fun GetClusterFromNetInterface(hnetinterface: HNETINTERFACE): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface(hnetinterface.toString()) as String).toLong() else 0L

public actual fun GetClusterFromNetwork(hnetwork: HNETWORK): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterFromNetwork(hnetwork.toString()) as String).toLong() else 0L

public actual fun GetClusterFromNode(hnode: HNODE): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterFromNode(hnode.toString()) as String).toLong() else 0L

public actual fun GetClusterFromResource(hresource: HRESOURCE): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterFromResource(hresource.toString()) as String).toLong() else 0L

public actual fun GetClusterGroupKey(hgroup: HGROUP, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterGroupKey(hgroup.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetClusterGroupState(hgroup: HGROUP, lpsznodename: PWSTR, lpcchnodename: Long): CLUSTER_GROUP_STATE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterGroupState(hgroup.toString(), lpsznodename.toString(), lpcchnodename.toString()) as Int) else 0

public actual fun GetClusterInformation(hcluster: HCLUSTER, lpszclustername: PWSTR, lpcchclustername: Long, lpclusterinfo: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterInformation(hcluster.toString(), lpszclustername.toString(), lpcchclustername.toString(), lpclusterinfo.toString()) as Int).toUInt() else 0u

public actual fun GetClusterKey(hcluster: HCLUSTER, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterKey(hcluster.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetClusterNetInterface(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR, lpszinterfacename: PWSTR, lpcchinterfacename: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNetInterface(hcluster.toString(), lpsznodename.toString(), lpsznetworkname.toString(), lpszinterfacename.toString(), lpcchinterfacename.toString()) as Int).toUInt() else 0u

public actual fun GetClusterNetInterfaceKey(hnetinterface: HNETINTERFACE, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey(hnetinterface.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetClusterNetInterfaceState(hnetinterface: HNETINTERFACE): CLUSTER_NETINTERFACE_STATE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState(hnetinterface.toString()) as Int) else 0

public actual fun GetClusterNetworkId(hnetwork: HNETWORK, lpsznetworkid: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNetworkId(hnetwork.toString(), lpsznetworkid.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun GetClusterNetworkKey(hnetwork: HNETWORK, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNetworkKey(hnetwork.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetClusterNetworkState(hnetwork: HNETWORK): CLUSTER_NETWORK_STATE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNetworkState(hnetwork.toString()) as Int) else 0

public actual fun GetClusterNodeId(hnode: HNODE, lpsznodeid: PWSTR, lpcchname: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNodeId(hnode.toString(), lpsznodeid.toString(), lpcchname.toString()) as Int).toUInt() else 0u

public actual fun GetClusterNodeKey(hnode: HNODE, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNodeKey(hnode.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetClusterNodeState(hnode: HNODE): CLUSTER_NODE_STATE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNodeState(hnode.toString()) as Int) else 0

public actual fun GetClusterNotify(hchange: HCHANGE, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: PWSTR, lpcchname: Long, dwmilliseconds: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNotify(hchange.toString(), lpdwnotifykey.toString(), lpdwfiltertype.toString(), lpszname.toString(), lpcchname.toString(), dwmilliseconds.toInt()) as Int).toUInt() else 0u

public actual fun GetClusterNotifyV2(hchange: HCHANGE, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: PWSTR, lpcchobjectid: Long, lpszparentid: PWSTR, lpcchparentid: Long, lpszname: PWSTR, lpcchname: Long, lpsztype: PWSTR, lpcchtype: Long, dwmilliseconds: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterNotifyV2(hchange.toString(), lpdwnotifykey.toString(), pfilterandtype.toString(), buffer.toString(), lpbbuffersize.toString(), lpszobjectid.toString(), lpcchobjectid.toString(), lpszparentid.toString(), lpcchparentid.toString(), lpszname.toString(), lpcchname.toString(), lpsztype.toString(), lpcchtype.toString(), dwmilliseconds.toInt()) as Int).toUInt() else 0u

public actual fun GetClusterQuorumResource(hcluster: HCLUSTER, lpszresourcename: PWSTR, lpcchresourcename: Long, lpszdevicename: PWSTR, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterQuorumResource(hcluster.toString(), lpszresourcename.toString(), lpcchresourcename.toString(), lpszdevicename.toString(), lpcchdevicename.toString(), lpdwmaxquorumlogsize.toString()) as Int).toUInt() else 0u

public actual fun GetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PWSTR, lpcchdependencyexpression: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression(hresource.toString(), lpszdependencyexpression.toString(), lpcchdependencyexpression.toString()) as Int).toUInt() else 0u

public actual fun GetClusterResourceKey(hresource: HRESOURCE, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterResourceKey(hresource.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetClusterResourceNetworkName(hresource: HRESOURCE, lpbuffer: PWSTR, nsize: Long): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName(hresource.toString(), lpbuffer.toString(), nsize.toString()) as Int) else 0

public actual fun GetClusterResourceState(hresource: HRESOURCE, lpsznodename: PWSTR, lpcchnodename: Long, lpszgroupname: PWSTR, lpcchgroupname: Long): CLUSTER_RESOURCE_STATE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterResourceState(hresource.toString(), lpsznodename.toString(), lpcchnodename.toString(), lpszgroupname.toString(), lpcchgroupname.toString()) as Int) else 0

public actual fun GetClusterResourceTypeKey(hcluster: HCLUSTER, lpsztypename: PCWSTR, samdesired: UInt): HKEY =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey(hcluster.toString(), lpsztypename.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun GetNodeCloudTypeDW(ppsznodename: PCWSTR, nodecloudtype: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW(ppsznodename.toString(), nodecloudtype.toString()) as Int).toUInt() else 0u

public actual fun GetNodeClusterState(lpsznodename: PCWSTR, pdwclusterstate: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetNodeClusterState(lpsznodename.toString(), pdwclusterstate.toString()) as Int).toUInt() else 0u

public actual fun GetNotifyEventHandle(hchange: HCHANGE, lphtargetevent: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_GetNotifyEventHandle(hchange.toString(), lphtargetevent.toString()) as Int).toUInt() else 0u

public actual fun InitializeClusterHealthFault(clusterhealthfault: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault(clusterhealthfault.toString()) as Int).toUInt() else 0u

public actual fun InitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray(clusterhealthfaultarray.toString()) as Int).toUInt() else 0u

public actual fun IsFileOnClusterSharedVolume(lpszpathname: PCWSTR, pbfileisonsharedvolume: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume(lpszpathname.toString(), pbfileisonsharedvolume.toString()) as Int).toUInt() else 0u

public actual fun MoveClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_MoveClusterGroup(hgroup.toString(), hdestinationnode.toString()) as Int).toUInt() else 0u

public actual fun MoveClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_MoveClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun MoveClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun OfflineClusterGroup(hgroup: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OfflineClusterGroup(hgroup.toString()) as Int).toUInt() else 0u

public actual fun OfflineClusterGroupEx(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx(hgroup.toString(), dwofflineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun OfflineClusterGroupEx2(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2(hgroup.toString(), dwofflineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun OfflineClusterResource(hresource: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OfflineClusterResource(hresource.toString()) as Int).toUInt() else 0u

public actual fun OfflineClusterResourceEx(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx(hresource.toString(), dwofflineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun OfflineClusterResourceEx2(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2(hresource.toString(), dwofflineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun OnlineClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OnlineClusterGroup(hgroup.toString(), hdestinationnode.toString()) as Int).toUInt() else 0u

public actual fun OnlineClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun OnlineClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun OnlineClusterResource(hresource: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OnlineClusterResource(hresource.toString()) as Int).toUInt() else 0u

public actual fun OnlineClusterResourceEx(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx(hresource.toString(), dwonlineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun OnlineClusterResourceEx2(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2(hresource.toString(), dwonlineflags.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun OpenCluster(lpszclustername: PCWSTR): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenCluster(lpszclustername.toString()) as String).toLong() else 0L

public actual fun OpenClusterCryptProvider(lpszresource: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider(lpszresource.toString(), lpszprovider.toString(), dwtype.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun OpenClusterCryptProviderEx(lpszresource: PCWSTR, lpszkeyname: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx(lpszresource.toString(), lpszkeyname.toString(), lpszprovider.toString(), dwtype.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun OpenClusterEx(lpszclustername: PCWSTR, desiredaccess: UInt, grantedaccess: Long): HCLUSTER =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterEx(lpszclustername.toString(), desiredaccess.toInt(), grantedaccess.toString()) as String).toLong() else 0L

public actual fun OpenClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterGroup(hcluster.toString(), lpszgroupname.toString()) as String).toLong() else 0L

public actual fun OpenClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HGROUP =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterGroupEx(hcluster.toString(), lpszgroupname.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.toString()) as String).toLong() else 0L

public actual fun OpenClusterGroupSet(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterGroupSet(hcluster.toString(), lpszgroupsetname.toString()) as String).toLong() else 0L

public actual fun OpenClusterNetInterface(hcluster: HCLUSTER, lpszinterfacename: PCWSTR): HNETINTERFACE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNetInterface(hcluster.toString(), lpszinterfacename.toString()) as String).toLong() else 0L

public actual fun OpenClusterNetInterfaceEx(hcluster: HCLUSTER, lpszinterfacename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETINTERFACE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx(hcluster.toString(), lpszinterfacename.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.toString()) as String).toLong() else 0L

public actual fun OpenClusterNetwork(hcluster: HCLUSTER, lpsznetworkname: PCWSTR): HNETWORK =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNetwork(hcluster.toString(), lpsznetworkname.toString()) as String).toLong() else 0L

public actual fun OpenClusterNetworkEx(hcluster: HCLUSTER, lpsznetworkname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETWORK =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx(hcluster.toString(), lpsznetworkname.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.toString()) as String).toLong() else 0L

public actual fun OpenClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR): HNODE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNode(hcluster.toString(), lpsznodename.toString()) as String).toLong() else 0L

public actual fun OpenClusterNodeById(hcluster: HCLUSTER, nodeid: UInt): HNODE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNodeById(hcluster.toString(), nodeid.toInt()) as String).toLong() else 0L

public actual fun OpenClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNODE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterNodeEx(hcluster.toString(), lpsznodename.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.toString()) as String).toLong() else 0L

public actual fun OpenClusterResource(hcluster: HCLUSTER, lpszresourcename: PCWSTR): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterResource(hcluster.toString(), lpszresourcename.toString()) as String).toLong() else 0L

public actual fun OpenClusterResourceEx(hcluster: HCLUSTER, lpszresourcename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_OpenClusterResourceEx(hcluster.toString(), lpszresourcename.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.toString()) as String).toLong() else 0L

public actual fun PauseClusterNode(hnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_PauseClusterNode(hnode.toString()) as Int).toUInt() else 0u

public actual fun PauseClusterNodeEx(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_PauseClusterNodeEx(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString()) as Int).toUInt() else 0u

public actual fun PauseClusterNodeEx2(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun QueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion(appinstanceid.toString(), instanceversionhigh.toString(), instanceversionlow.toString(), versionstatus.toString()) as Int).toUInt() else 0u

public actual fun RegisterAppInstance(processhandle: HANDLE, appinstanceid: Long, childreninheritappinstance: BOOL): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RegisterAppInstance(processhandle.toString(), appinstanceid.toString(), childreninheritappinstance) as Int).toUInt() else 0u

public actual fun RegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion(appinstanceid.toString(), instanceversionhigh.toString(), instanceversionlow.toString()) as Int).toUInt() else 0u

public actual fun RegisterClusterNotify(hchange: HCHANGE, dwfiltertype: UInt, hobject: HANDLE, dwnotifykey: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RegisterClusterNotify(hchange.toString(), dwfiltertype.toInt(), hobject.toString(), dwnotifykey.toString()) as Int).toUInt() else 0u

public actual fun RegisterClusterNotifyV2(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: HANDLE, dwnotifykey: ULong): UInt =
    0u

public actual fun RegisterClusterResourceTypeNotifyV2(hchange: HCHANGE, hcluster: HCLUSTER, flags: Long, restypename: PCWSTR, dwnotifykey: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2(hchange.toString(), hcluster.toString(), flags.toString(), restypename.toString(), dwnotifykey.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterGroupDependency(hgroup: HGROUP, hdependson: HGROUP): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency(hgroup.toString(), hdependson.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterGroupDependencyEx(hgroup: HGROUP, hdependson: HGROUP, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx(hgroup.toString(), hdependson.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterGroupSetDependency(hgroupset: HGROUPSET, hdependson: HGROUPSET): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency(hgroupset.toString(), hdependson.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterGroupSetDependencyEx(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx(hgroupset.toString(), hdependson.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterGroupToGroupSetDependency(hgroup: HGROUP, hdependson: HGROUPSET): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency(hgroup.toString(), hdependson.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterGroupToGroupSetDependencyEx(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx(hgroup.toString(), hdependson.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterNameAccount(hcluster: HCLUSTER, bdeletecomputerobjects: BOOL): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount(hcluster.toString(), bdeletecomputerobjects) as Int).toUInt() else 0u

public actual fun RemoveClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency(hresource.toString(), hdependson.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode(hresource.toString(), hnode.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx(hresource.toString(), hnode.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun RemoveClusterStorageNode(hcluster: HCLUSTER, lpszclusterstorageenclosurename: PCWSTR, dwtimeout: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode(hcluster.toString(), lpszclusterstorageenclosurename.toString(), dwtimeout.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun RemoveCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency(hdependentgroupset.toString(), lpremoteclustername.toString(), lpremotegroupsetname.toString()) as Int).toUInt() else 0u

public actual fun RemoveResourceFromClusterSharedVolumes(hresource: HRESOURCE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes(hresource.toString()) as Int).toUInt() else 0u

public actual fun ResUtilAddUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties(hkeyclusterkey.toString(), ppropertytable.toString(), poutpropertylist.toString(), pcboutpropertylistsize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilCreateDirectoryTree(pszpath: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree(pszpath.toString()) as Int).toUInt() else 0u

public actual fun ResUtilDupGroup(group: HGROUP, copy: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilDupGroup(group.toString(), copy.toString()) as Int).toUInt() else 0u

public actual fun ResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock(poutparams.toString(), pinparams.toString(), ppropertytable.toString()) as Int).toUInt() else 0u

public actual fun ResUtilDupResource(group: HRESOURCE, copy: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilDupResource(group.toString(), copy.toString()) as Int).toUInt() else 0u

public actual fun ResUtilDupString(pszinstring: PCWSTR): PWSTR =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilDupString(pszinstring.toString()) as String).toLong() else 0L

public actual fun ResUtilEnumGroups(hcluster: HCLUSTER, hself: HGROUP, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumGroups(hcluster.toString(), hself.toString(), prescallback.toLong().toString(), pparameter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilEnumGroupsEx(hcluster: HCLUSTER, hself: HGROUP, grouptype: CLUSGROUP_TYPE, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx(hcluster.toString(), hself.toString(), grouptype, prescallback.toLong().toString(), pparameter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilEnumPrivateProperties(hkeyclusterkey: HKEY, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties(hkeyclusterkey.toString(), pszoutproperties.toString(), cboutpropertiessize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilEnumProperties(ppropertytable: Long, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumProperties(ppropertytable.toString(), pszoutproperties.toString(), cboutpropertiessize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilEnumResources(hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumResources(hself.toString(), lpszrestypename.toString(), prescallback.toLong().toString(), pparameter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilEnumResourcesEx(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx(hcluster.toString(), hself.toString(), lpszrestypename.toString(), prescallback.toLong().toString(), pparameter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilEnumResourcesEx2(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long, dwdesiredaccess: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2(hcluster.toString(), hself.toString(), lpszrestypename.toString(), prescallback.toLong().toString(), pparameter.toString(), dwdesiredaccess.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilExpandEnvironmentStrings(pszsrc: PCWSTR): PWSTR =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings(pszsrc.toString()) as String).toLong() else 0L

public actual fun ResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pbpropertyvalue.toString(), pcbpropertyvaluesize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindDependentDiskResourceDriveLetter(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: PWSTR, pcchdriveletter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter(hcluster.toString(), hresource.toString(), pszdriveletter.toString(), pcchdriveletter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pdwpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pdwpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pszpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pszpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pftpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pftpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), plpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pszpropertyvalue.toString(), pcbpropertyvaluesize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), pszpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty(ppropertylist.toString(), cbpropertylistsize.toInt(), pszpropertyname.toString(), plpropertyvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFreeEnvironment(lpenvironment: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment(lpenvironment.toString()) as Int).toUInt() else 0u

public actual fun ResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long) {
    if (_windowsWin32NetworkingClusteringNapiAddon != null) {
        _windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock(poutparams.toString(), pinparams.toString(), ppropertytable.toString())
    }
}

public actual fun ResUtilGetAllProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties(hkeyclusterkey.toString(), ppropertytable.toString(), poutpropertylist.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty(ppboutvalue.toString(), pcboutvaluesize.toString(), pvaluestruct.toString(), pboldvalue.toString(), cboldvaluesize.toInt(), pppropertylist.toString(), pcbpropertylistsize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue(hkeyclusterkey.toString(), pszvaluename.toString(), ppboutvalue.toString(), pcboutvaluesize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetClusterGroupType(hgroup: HGROUP, grouptype: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType(hgroup.toString(), grouptype.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetClusterId(hcluster: HCLUSTER, guid: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetClusterId(hcluster.toString(), guid.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetClusterRoleState(hcluster: HCLUSTER, eclusterrole: CLUSTER_ROLE): CLUSTER_ROLE_STATE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState(hcluster.toString(), eclusterrole) as Int) else 0

public actual fun ResUtilGetCoreClusterResources(hcluster: HCLUSTER, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources(hcluster.toString(), phclusternameresource.toString(), phclusteripaddressresource.toString(), phclusterquorumresource.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetCoreClusterResourcesEx(hclusterin: HCLUSTER, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx(hclusterin.toString(), phclusternameresourceout.toString(), phclusterquorumresourceout.toString(), dwdesiredaccess.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilGetCoreGroup(hcluster: HCLUSTER): HGROUP =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup(hcluster.toString()) as String).toLong() else 0L

public actual fun ResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty(pdwoutvalue.toString(), pvaluestruct.toString(), dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), pppropertylist.toString(), pcbpropertylistsize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pdwoutvalue: Long, dwdefaultvalue: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue(hkeyclusterkey.toString(), pszvaluename.toString(), pdwoutvalue.toString(), dwdefaultvalue.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilGetEnvironmentWithNetName(hresource: HRESOURCE): Long =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName(hresource.toString()) as String).toLong() else 0L

public actual fun ResUtilGetFileTimeProperty(pftoutvalue: Long, pvaluestruct: Long, ftoldvalue: FILETIME, ftminimum: FILETIME, ftmaximum: FILETIME, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty(ploutvalue.toString(), pvaluestruct.toString(), loldvalue, lminimum, lmaximum, pppropertylist.toString(), pcbpropertylistsize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty(ppszoutvalue.toString(), pcboutvaluesize.toString(), pvaluestruct.toString(), pszoldvalue.toString(), cboldvaluesize.toInt(), pppropertylist.toString(), pcbpropertylistsize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetPrivateProperties(hkeyclusterkey: HKEY, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties(hkeyclusterkey.toString(), poutpropertylist.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetProperties(hkeyclusterkey.toString(), ppropertytable.toString(), poutpropertylist.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetPropertiesToParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: BOOL, psznameofpropinerror: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock(hkeyclusterkey.toString(), ppropertytable.toString(), poutparams.toString(), bcheckforrequiredproperties, psznameofpropinerror.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetProperty(hkeyclusterkey: HKEY, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetProperty(hkeyclusterkey.toString(), ppropertytableitem.toString(), poutpropertyitem.toString(), pcboutpropertyitemsize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats(ppropertytable.toString(), poutpropertyformatlist.toString(), cbpropertyformatlistsize.toInt(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetPropertySize(hkeyclusterkey: HKEY, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize(hkeyclusterkey.toString(), ppropertytableitem.toString(), pcboutpropertylistsize.toString(), pnpropertycount.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pqwoutvalue: Long, qwdefaultvalue: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue(hkeyclusterkey.toString(), pszvaluename.toString(), pqwoutvalue.toString(), qwdefaultvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetResourceDependency(hself: HANDLE, lpszresourcetype: PCWSTR): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency(hself.toString(), lpszresourcetype.toString()) as String).toLong() else 0L

public actual fun ResUtilGetResourceDependencyByClass(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass(hcluster.toString(), hself.toString(), prci.toString(), brecurse) as String).toLong() else 0L

public actual fun ResUtilGetResourceDependencyByClassEx(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx(hcluster.toString(), hself.toString(), prci.toString(), brecurse, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun ResUtilGetResourceDependencyByName(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName(hcluster.toString(), hself.toString(), lpszresourcetype.toString(), brecurse) as String).toLong() else 0L

public actual fun ResUtilGetResourceDependencyByNameEx(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx(hcluster.toString(), hself.toString(), lpszresourcetype.toString(), brecurse, dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun ResUtilGetResourceDependencyEx(hself: HANDLE, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx(hself.toString(), lpszresourcetype.toString(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun ResUtilGetResourceDependentIPAddressProps(hresource: HRESOURCE, pszaddress: PWSTR, pcchaddress: Long, pszsubnetmask: PWSTR, pcchsubnetmask: Long, psznetwork: PWSTR, pcchnetwork: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps(hresource.toString(), pszaddress.toString(), pcchaddress.toString(), pszsubnetmask.toString(), pcchsubnetmask.toString(), psznetwork.toString(), pcchnetwork.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetResourceName(hresource: HRESOURCE, pszresourcename: PWSTR, pcchresourcenameinout: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceName(hresource.toString(), pszresourcename.toString(), pcchresourcenameinout.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetResourceNameDependency(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency(lpszresourcename.toString(), lpszresourcetype.toString()) as String).toLong() else 0L

public actual fun ResUtilGetResourceNameDependencyEx(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx(lpszresourcename.toString(), lpszresourcetype.toString(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun ResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty(ppszoutvalue.toString(), pvaluestruct.toString(), pszoldvalue.toString(), pppropertylist.toString(), pcbpropertylistsize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilGetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR): PWSTR =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGetSzValue(hkeyclusterkey.toString(), pszvaluename.toString()) as String).toLong() else 0L

public actual fun ResUtilGroupsEqual(hself: HGROUP, hgroup: HGROUP, pequal: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual(hself.toString(), hgroup.toString(), pequal.toString()) as Int).toUInt() else 0u

public actual fun ResUtilIsPathValid(pszpath: PCWSTR): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilIsPathValid(pszpath.toString()) as Int) else 0

public actual fun ResUtilIsResourceClassEqual(prci: Long, hresource: HRESOURCE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual(prci.toString(), hresource.toString()) as Int) else 0

public actual fun ResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight(left.toString(), right.toString()) as Int) else 0

public actual fun ResUtilNodeEnum(hcluster: HCLUSTER, pnodecallback: LPNODE_CALLBACK, pparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilNodeEnum(hcluster.toString(), pnodecallback.toLong().toString(), pparameter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilPaxosComparer(left: Long, right: Long): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer(left.toString(), right.toString()) as Int) else 0

public actual fun ResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock(ppropertytable.toString(), poutpropertylist.toString(), pcboutpropertylistsize.toString(), pinparams.toString(), pcbbytesreturned.toString(), pcbrequired.toString()) as Int).toUInt() else 0u

public actual fun ResUtilRemoveResourceServiceEnvironment(pszservicename: PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment(pszservicename.toString(), pfnlogevent.toLong().toString(), hresourcehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilResourceDepEnum(hself: HRESOURCE, enumtype: UInt, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum(hself.toString(), enumtype.toInt(), prescallback.toLong().toString(), pparameter.toString()) as Int).toUInt() else 0u

public actual fun ResUtilResourceTypesEqual(lpszresourcetypename: PCWSTR, hresource: HRESOURCE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual(lpszresourcetypename.toString(), hresource.toString()) as Int) else 0

public actual fun ResUtilResourcesEqual(hself: HRESOURCE, hresource: HRESOURCE): BOOL =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual(hself.toString(), hresource.toString()) as Int) else 0

public actual fun ResUtilSetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pbnewvalue: Long, cbnewvaluesize: UInt, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue(hkeyclusterkey.toString(), pszvaluename.toString(), pbnewvalue.toString(), cbnewvaluesize.toInt(), ppboutvalue.toString(), pcboutvaluesize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, dwnewvalue: UInt, pdwoutvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue(hkeyclusterkey.toString(), pszvaluename.toString(), dwnewvalue.toInt(), pdwoutvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetExpandSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue(hkeyclusterkey.toString(), pszvaluename.toString(), psznewvalue.toString(), ppszoutstring.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetMultiSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, cbnewvaluesize: UInt, ppszoutvalue: Long, pcboutvaluesize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue(hkeyclusterkey.toString(), pszvaluename.toString(), psznewvalue.toString(), cbnewvaluesize.toInt(), ppszoutvalue.toString(), pcboutvaluesize.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetPrivatePropertyList(hkeyclusterkey: HKEY, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList(hkeyclusterkey.toString(), pinpropertylist.toString(), cbinpropertylistsize.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilSetPropertyParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock(hkeyclusterkey.toString(), ppropertytable.toString(), reserved.toString(), pinparams.toString(), pinpropertylist.toString(), cbinpropertylistsize.toInt(), poutparams.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetPropertyParameterBlockEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx(hkeyclusterkey.toString(), ppropertytable.toString(), reserved.toString(), pinparams.toString(), pinpropertylist.toString(), cbinpropertylistsize.toInt(), bforcewrite, poutparams.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetPropertyTable(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable(hkeyclusterkey.toString(), ppropertytable.toString(), reserved.toString(), ballowunknownproperties, pinpropertylist.toString(), cbinpropertylistsize.toInt(), poutparams.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetPropertyTableEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx(hkeyclusterkey.toString(), ppropertytable.toString(), reserved.toString(), ballowunknownproperties, pinpropertylist.toString(), cbinpropertylistsize.toInt(), bforcewrite, poutparams.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, qwnewvalue: ULong, pqwoutvalue: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue(hkeyclusterkey.toString(), pszvaluename.toString(), qwnewvalue.toString(), pqwoutvalue.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetResourceServiceEnvironment(pszservicename: PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment(pszservicename.toString(), hresource.toString(), pfnlogevent.toLong().toString(), hresourcehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetResourceServiceStartParameters(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters(pszservicename.toString(), schscmhandle.toString(), phservice.toString(), pfnlogevent.toLong().toString(), hresourcehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetResourceServiceStartParametersEx(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, dwdesiredaccess: UInt, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx(pszservicename.toString(), schscmhandle.toString(), phservice.toString(), dwdesiredaccess.toInt(), pfnlogevent.toLong().toString(), hresourcehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetSzValue(hkeyclusterkey.toString(), pszvaluename.toString(), psznewvalue.toString(), ppszoutstring.toString()) as Int).toUInt() else 0u

public actual fun ResUtilSetUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties(hkeyclusterkey.toString(), ppropertytable.toString(), pinpropertylist.toString(), cbinpropertylistsize.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilSetValueEx(hkeyclusterkey: HKEY, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuesize: UInt, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilSetValueEx(hkeyclusterkey.toString(), valuename.toString(), valuetype.toInt(), valuedata.toString(), valuesize.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilStartResourceService(pszservicename: PCWSTR, phservicehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilStartResourceService(pszservicename.toString(), phservicehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilStopResourceService(pszservicename: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilStopResourceService(pszservicename.toString()) as Int).toUInt() else 0u

public actual fun ResUtilStopService(hservicehandle: SC_HANDLE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilStopService(hservicehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: BOOL, pdwresourcestate: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, pdwresourcestate.toString(), pfnlogevent.toLong().toString(), hresourcehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList(pinpropertylist.toString(), cbinpropertylistsize.toInt()) as Int).toUInt() else 0u

public actual fun ResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable(ppropertytable.toString(), reserved.toString(), ballowunknownproperties, pinpropertylist.toString(), cbinpropertylistsize.toInt(), poutparams.toString()) as Int).toUInt() else 0u

public actual fun ResUtilVerifyResourceService(pszservicename: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService(pszservicename.toString()) as Int).toUInt() else 0u

public actual fun ResUtilVerifyService(hservicehandle: SC_HANDLE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilVerifyService(hservicehandle.toString()) as Int).toUInt() else 0u

public actual fun ResUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), presult.toString()) as Int).toUInt() else 0u

public actual fun ResUtilsDeleteKeyTree(key: HKEY, keyname: PCWSTR, treatnokeyaserror: BOOL): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree(key.toString(), keyname.toString(), treatnokeyaserror) as Int).toUInt() else 0u

public actual fun ResetAllAppInstanceVersions(): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions() as Int).toUInt() else 0u

public actual fun RestartClusterResource(hresource: HRESOURCE, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RestartClusterResource(hresource.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun RestartClusterResourceEx(hresource: HRESOURCE, dwflags: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RestartClusterResourceEx(hresource.toString(), dwflags.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun RestoreClusterDatabase(lpszpathname: PCWSTR, bforce: BOOL, lpszquorumdriveletter: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_RestoreClusterDatabase(lpszpathname.toString(), bforce, lpszquorumdriveletter.toString()) as Int).toUInt() else 0u

public actual fun ResumeClusterNode(hnode: HNODE): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResumeClusterNode(hnode.toString()) as Int).toUInt() else 0u

public actual fun ResumeClusterNodeEx(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt()) as Int).toUInt() else 0u

public actual fun ResumeClusterNodeEx2(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetAppInstanceCsvFlags(processhandle: HANDLE, mask: UInt, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags(processhandle.toString(), mask.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun SetClusterGroupName(hgroup: HGROUP, lpszgroupname: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterGroupName(hgroup.toString(), lpszgroupname.toString()) as Int).toUInt() else 0u

public actual fun SetClusterGroupNameEx(hgroup: HGROUP, lpszgroupname: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx(hgroup.toString(), lpszgroupname.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterGroupNodeList(hgroup: HGROUP, nodecount: UInt, nodelist: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList(hgroup.toString(), nodecount.toInt(), nodelist.toString()) as Int).toUInt() else 0u

public actual fun SetClusterGroupNodeListEx(hgroup: HGROUP, nodecount: UInt, nodelist: Long, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx(hgroup.toString(), nodecount.toInt(), nodelist.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterGroupSetDependencyExpression(hgroupset: HGROUPSET, lpszdependencyexprssion: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression(hgroupset.toString(), lpszdependencyexprssion.toString()) as Int).toUInt() else 0u

public actual fun SetClusterGroupSetDependencyExpressionEx(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx(hgroupset.toString(), lpszdependencyexpression.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterName(hcluster: HCLUSTER, lpsznewclustername: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterName(hcluster.toString(), lpsznewclustername.toString()) as Int).toUInt() else 0u

public actual fun SetClusterNameEx(hcluster: HCLUSTER, lpsznewclustername: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterNameEx(hcluster.toString(), lpsznewclustername.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterNetworkName(hnetwork: HNETWORK, lpszname: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterNetworkName(hnetwork.toString(), lpszname.toString()) as Int).toUInt() else 0u

public actual fun SetClusterNetworkNameEx(hnetwork: HNETWORK, lpszname: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx(hnetwork.toString(), lpszname.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterNetworkPriorityOrder(hcluster: HCLUSTER, networkcount: UInt, networklist: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder(hcluster.toString(), networkcount.toInt(), networklist.toString()) as Int).toUInt() else 0u

public actual fun SetClusterQuorumResource(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquologsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterQuorumResource(hresource.toString(), lpszdevicename.toString(), dwmaxquologsize.toInt()) as Int).toUInt() else 0u

public actual fun SetClusterQuorumResourceEx(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquorumlogsize: UInt, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx(hresource.toString(), lpszdevicename.toString(), dwmaxquorumlogsize.toInt(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression(hresource.toString(), lpszdependencyexpression.toString()) as Int).toUInt() else 0u

public actual fun SetClusterResourceName(hresource: HRESOURCE, lpszresourcename: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterResourceName(hresource.toString(), lpszresourcename.toString()) as Int).toUInt() else 0u

public actual fun SetClusterResourceNameEx(hresource: HRESOURCE, lpszresourcename: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx(hresource.toString(), lpszresourcename.toString(), lpszreason.toString()) as Int).toUInt() else 0u

public actual fun SetClusterServiceAccountPassword(lpszclustername: PCWSTR, lpsznewpassword: PCWSTR, dwflags: UInt, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword(lpszclustername.toString(), lpsznewpassword.toString(), dwflags.toInt(), lpreturnstatusbuffer.toString(), lpcbreturnstatusbuffersize.toString()) as Int).toUInt() else 0u

public actual fun SetGroupDependencyExpression(hgroup: HGROUP, lpszdependencyexpression: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression(hgroup.toString(), lpszdependencyexpression.toString()) as Int).toUInt() else 0u

public actual fun SetGroupDependencyExpressionEx(hgroup: HGROUP, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    if (_windowsWin32NetworkingClusteringNapiAddon != null) (_windowsWin32NetworkingClusteringNapiAddon.windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx(hgroup.toString(), lpszdependencyexpression.toString(), lpszreason.toString()) as Int).toUInt() else 0u
