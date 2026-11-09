@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddClusterGroupDependency(hdependentgroup: HGROUP, hprovidergroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterGroupDependency(hdependentgroup, hprovidergroup)

public actual fun AddClusterGroupDependencyEx(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx(hdependentgroup, hprovidergroup, lpszreason.toCPointer<ByteVar>())

public actual fun AddClusterGroupSetDependency(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency(hdependentgroupset, hprovidergroupset)

public actual fun AddClusterGroupSetDependencyEx(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx(hdependentgroupset, hprovidergroupset, lpszreason.toCPointer<ByteVar>())

public actual fun AddClusterGroupToGroupSetDependency(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency(hdependentgroup, hprovidergroupset)

public actual fun AddClusterGroupToGroupSetDependencyEx(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx(hdependentgroup, hprovidergroupset, lpszreason.toCPointer<ByteVar>())

public actual fun AddClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterNode(hcluster, lpsznodename.toCPointer<ByteVar>(), pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>())

public actual fun AddClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwflags: UInt, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterNodeEx(hcluster, lpsznodename.toCPointer<ByteVar>(), dwflags, pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>())

public actual fun AddClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterResourceDependency(hresource, hdependson)

public actual fun AddClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx(hresource, hdependson, lpszreason.toCPointer<ByteVar>())

public actual fun AddClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterResourceNode(hresource, hnode)

public actual fun AddClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx(hresource, hnode, lpszreason.toCPointer<ByteVar>())

public actual fun AddClusterStorageNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, lpszclusterstoragenodedescription: PCWSTR, lpszclusterstoragenodelocation: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddClusterStorageNode(hcluster, lpsznodename.toCPointer<ByteVar>(), pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>(), lpszclusterstoragenodedescription.toCPointer<ByteVar>(), lpszclusterstoragenodelocation.toCPointer<ByteVar>())

public actual fun AddCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername.toCPointer<ByteVar>(), lpremotegroupsetname.toCPointer<ByteVar>())

public actual fun AddResourceToClusterSharedVolumes(hresource: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes(hresource)

public actual fun BackupClusterDatabase(hcluster: HCLUSTER, lpszpathname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_BackupClusterDatabase(hcluster, lpszpathname.toCPointer<ByteVar>())

public actual fun CanResourceBeDependent(hresource: HRESOURCE, hresourcedependent: HRESOURCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CanResourceBeDependent(hresource, hresourcedependent)

public actual fun CancelClusterGroupOperation(hgroup: HGROUP, dwcancelflags_reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation(hgroup, dwcancelflags_reserved)

public actual fun ChangeClusterResourceGroup(hresource: HRESOURCE, hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup(hresource, hgroup)

public actual fun ChangeClusterResourceGroupEx(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx(hresource, hgroup, flags)

public actual fun ChangeClusterResourceGroupEx2(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2(hresource, hgroup, flags, lpszreason.toCPointer<ByteVar>())

public actual fun CloseCluster(hcluster: HCLUSTER): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseCluster(hcluster)

public actual fun CloseClusterCryptProvider(hcluscryptprovider: HCLUSCRYPTPROVIDER): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider(hcluscryptprovider)

public actual fun CloseClusterGroup(hgroup: HGROUP): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterGroup(hgroup)

public actual fun CloseClusterGroupSet(hgroupset: HGROUPSET): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterGroupSet(hgroupset)

public actual fun CloseClusterNetInterface(hnetinterface: HNETINTERFACE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterNetInterface(hnetinterface)

public actual fun CloseClusterNetwork(hnetwork: HNETWORK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterNetwork(hnetwork)

public actual fun CloseClusterNode(hnode: HNODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterNode(hnode)

public actual fun CloseClusterNotifyPort(hchange: HCHANGE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort(hchange)

public actual fun CloseClusterResource(hresource: HRESOURCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CloseClusterResource(hresource)

public actual fun ClusAddClusterHealthFault(hcluster: HCLUSTER, failure: Long, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault(hcluster, failure.toCPointer<ByteVar>(), param2)

public actual fun ClusGetClusterHealthFaults(hcluster: HCLUSTER, objects: Long, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults(hcluster, objects.toCPointer<ByteVar>(), flags)

public actual fun ClusRemoveClusterHealthFault(hcluster: HCLUSTER, id: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault(hcluster, id.toCPointer<ByteVar>(), flags)

public actual fun ClusWorkerCheckTerminate(lpworker: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate(lpworker.toCPointer<ByteVar>())

public actual fun ClusWorkerCreate(lpworker: Long, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusWorkerCreate(lpworker.toCPointer<ByteVar>(), lpstartaddress.toLong().toCPointer<ByteVar>(), lpparameter.toCPointer<ByteVar>())

public actual fun ClusWorkerTerminate(lpworker: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusWorkerTerminate(lpworker.toCPointer<ByteVar>())
}

public actual fun ClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx(clusworker.toCPointer<ByteVar>(), timeoutinmilliseconds, waitonly)

public actual fun ClusWorkersTerminate(clusworkers: Long, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusWorkersTerminate(clusworkers.toCPointer<ByteVar>(), clusworkerscount, timeoutinmilliseconds, waitonly)

public actual fun ClusapiSetReasonHandler(lphandler: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler(lphandler.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ClusterAddGroupToAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule(hcluster, rulename.toCPointer<ByteVar>(), hgroup)

public actual fun ClusterAddGroupToGroupSet(hgroupset: HGROUPSET, hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet(hgroupset, hgroup)

public actual fun ClusterAddGroupToGroupSetWithDomains(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains(hgroupset, hgroup, faultdomain, updatedomain)

public actual fun ClusterAddGroupToGroupSetWithDomainsEx(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx(hgroupset, hgroup, faultdomain, updatedomain, lpszreason.toCPointer<ByteVar>())

public actual fun ClusterAffinityRuleControl(hcluster: HCLUSTER, affinityrulename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl(hcluster, affinityrulename.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterClearBackupStateForSharedVolume(lpszvolumepathname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume(lpszvolumepathname.toCPointer<ByteVar>())

public actual fun ClusterCloseEnum(henum: HCLUSENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterCloseEnum(henum)

public actual fun ClusterCloseEnumEx(hclusterenum: HCLUSENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx(hclusterenum)

public actual fun ClusterControl(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterControl(hcluster, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterControlEx(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterControlEx(hcluster, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterCreateAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule(hcluster, rulename.toCPointer<ByteVar>(), ruletype)

public actual fun ClusterDecrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: Long, cbcryptinput: UInt, ppcryptoutput: Long, pcbcryptoutput: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterDecrypt(hcluscryptprovider, pcryptinput.toCPointer<ByteVar>(), cbcryptinput, ppcryptoutput.toCPointer<ByteVar>(), pcbcryptoutput.toCPointer<ByteVar>())

public actual fun ClusterEncrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: Long, cbdata: UInt, ppdata: Long, pcbdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterEncrypt(hcluscryptprovider, pdata.toCPointer<ByteVar>(), cbdata, ppdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun ClusterEnum(henum: HCLUSENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterEnum(henum, dwindex, lpdwtype.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterEnumEx(hclusterenum: HCLUSENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterEnumEx(hclusterenum, dwindex, pitem.toCPointer<ByteVar>(), cbitem.toCPointer<ByteVar>())

public actual fun ClusterGetEnumCount(henum: HCLUSENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGetEnumCount(henum)

public actual fun ClusterGetEnumCountEx(hclusterenum: HCLUSENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx(hclusterenum)

public actual fun ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)

public actual fun ClusterGetVolumePathName(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName(lpszfilename.toCPointer<ByteVar>(), lpszvolumepathname.toCPointer<ByteVar>(), cchbufferlength)

public actual fun ClusterGroupCloseEnum(hgroupenum: HGROUPENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum(hgroupenum)

public actual fun ClusterGroupCloseEnumEx(hgroupenumex: HGROUPENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx(hgroupenumex)

public actual fun ClusterGroupControl(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupControl(hgroup, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterGroupControlEx(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupControlEx(hgroup, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterGroupEnum(hgroupenum: HGROUPENUM, dwindex: UInt, lpdwtype: Long, lpszresourcename: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupEnum(hgroupenum, dwindex, lpdwtype.toCPointer<ByteVar>(), lpszresourcename.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterGroupEnumEx(hgroupenumex: HGROUPENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx(hgroupenumex, dwindex, pitem.toCPointer<ByteVar>(), cbitem.toCPointer<ByteVar>())

public actual fun ClusterGroupGetEnumCount(hgroupenum: HGROUPENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount(hgroupenum)

public actual fun ClusterGroupGetEnumCountEx(hgroupenumex: HGROUPENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx(hgroupenumex)

public actual fun ClusterGroupOpenEnum(hgroup: HGROUP, dwtype: UInt): HGROUPENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum(hgroup, dwtype)

public actual fun ClusterGroupOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HGROUPENUMEX =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx(hcluster, lpszproperties.toCPointer<ByteVar>(), cbproperties, lpszroproperties.toCPointer<ByteVar>(), cbroproperties, dwflags)

public actual fun ClusterGroupSetCloseEnum(hgroupsetenum: HGROUPSETENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum(hgroupsetenum)

public actual fun ClusterGroupSetControl(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupSetControl(hgroupset, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterGroupSetControlEx(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx(hgroupset, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterGroupSetEnum(hgroupsetenum: HGROUPSETENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum(hgroupsetenum, dwindex, lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterGroupSetGetEnumCount(hgroupsetenum: HGROUPSETENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount(hgroupsetenum)

public actual fun ClusterGroupSetOpenEnum(hcluster: HCLUSTER): HGROUPSETENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum(hcluster)

public actual fun ClusterIsPathOnSharedVolume(lpszpathname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume(lpszpathname.toCPointer<ByteVar>())

public actual fun ClusterNetInterfaceCloseEnum(hnetinterfaceenum: HNETINTERFACEENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum(hnetinterfaceenum)

public actual fun ClusterNetInterfaceControl(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterNetInterfaceControlEx(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterNetInterfaceEnum(hnetinterfaceenum: HNETINTERFACEENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum(hnetinterfaceenum, dwindex, lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterNetInterfaceOpenEnum(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR): HNETINTERFACEENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum(hcluster, lpsznodename.toCPointer<ByteVar>(), lpsznetworkname.toCPointer<ByteVar>())

public actual fun ClusterNetworkCloseEnum(hnetworkenum: HNETWORKENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum(hnetworkenum)

public actual fun ClusterNetworkControl(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetworkControl(hnetwork, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterNetworkControlEx(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx(hnetwork, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterNetworkEnum(hnetworkenum: HNETWORKENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetworkEnum(hnetworkenum, dwindex, lpdwtype.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterNetworkGetEnumCount(hnetworkenum: HNETWORKENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount(hnetworkenum)

public actual fun ClusterNetworkOpenEnum(hnetwork: HNETWORK, dwtype: UInt): HNETWORKENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum(hnetwork, dwtype)

public actual fun ClusterNodeCloseEnum(hnodeenum: HNODEENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum(hnodeenum)

public actual fun ClusterNodeCloseEnumEx(hnodeenum: HNODEENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx(hnodeenum)

public actual fun ClusterNodeControl(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeControl(hnode, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterNodeControlEx(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeControlEx(hnode, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterNodeEnum(hnodeenum: HNODEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeEnum(hnodeenum, dwindex, lpdwtype.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterNodeEnumEx(hnodeenum: HNODEENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx(hnodeenum, dwindex, pitem.toCPointer<ByteVar>(), cbitem.toCPointer<ByteVar>())

public actual fun ClusterNodeGetEnumCount(hnodeenum: HNODEENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount(hnodeenum)

public actual fun ClusterNodeGetEnumCountEx(hnodeenum: HNODEENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx(hnodeenum)

public actual fun ClusterNodeOpenEnum(hnode: HNODE, dwtype: UInt): HNODEENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum(hnode, dwtype)

public actual fun ClusterNodeOpenEnumEx(hnode: HNODE, dwtype: UInt, poptions: Long): HNODEENUMEX =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx(hnode, dwtype, poptions.toCPointer<ByteVar>())

public actual fun ClusterNodeReplacement(hcluster: HCLUSTER, lpsznodenamecurrent: PCWSTR, lpsznodenamenew: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterNodeReplacement(hcluster, lpsznodenamecurrent.toCPointer<ByteVar>(), lpsznodenamenew.toCPointer<ByteVar>())

public actual fun ClusterOpenEnum(hcluster: HCLUSTER, dwtype: UInt): HCLUSENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterOpenEnum(hcluster, dwtype)

public actual fun ClusterOpenEnumEx(hcluster: HCLUSTER, dwtype: UInt, poptions: Long): HCLUSENUMEX =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx(hcluster, dwtype, poptions.toCPointer<ByteVar>())

public actual fun ClusterPrepareSharedVolumeForBackup(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, lpcchvolumepathname: Long, lpszvolumename: PWSTR, lpcchvolumename: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup(lpszfilename.toCPointer<ByteVar>(), lpszvolumepathname.toCPointer<ByteVar>(), lpcchvolumepathname.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>(), lpcchvolumename.toCPointer<ByteVar>())

public actual fun ClusterRegBatchAddCommand(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: PCWSTR, dwoptions: UInt, lpdata: Long, cbdata: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand(hregbatch, dwcommand, wzname.toCPointer<ByteVar>(), dwoptions, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun ClusterRegBatchCloseNotification(hbatchnotification: HREGBATCHNOTIFICATION): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification(hbatchnotification)

public actual fun ClusterRegBatchReadCommand(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand(hbatchnotification, pbatchcommand.toCPointer<ByteVar>())

public actual fun ClusterRegCloseBatch(hregbatch: HREGBATCH, bcommit: BOOL, failedcommandnumber: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch(hregbatch, bcommit, failedcommandnumber.toCPointer<ByteVar>())

public actual fun ClusterRegCloseBatchEx(hregbatch: HREGBATCH, flags: UInt, failedcommandnumber: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx(hregbatch, flags, failedcommandnumber.toCPointer<ByteVar>())

public actual fun ClusterRegCloseBatchNotifyPort(hbatchnotifyport: HREGBATCHPORT): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort(hbatchnotifyport)

public actual fun ClusterRegCloseKey(hkey: HKEY): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseKey(hkey.toCPointer<ByteVar>())

public actual fun ClusterRegCloseReadBatch(hregreadbatch: HREGREADBATCH, phregreadbatchreply: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch(hregreadbatch, phregreadbatchreply.toCPointer<ByteVar>())

public actual fun ClusterRegCloseReadBatchEx(hregreadbatch: HREGREADBATCH, flags: UInt, phregreadbatchreply: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx(hregreadbatch, flags, phregreadbatchreply.toCPointer<ByteVar>())

public actual fun ClusterRegCloseReadBatchReply(hregreadbatchreply: HREGREADBATCHREPLY): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply(hregreadbatchreply)

public actual fun ClusterRegCreateBatch(hkey: HKEY, phregbatch: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch(hkey.toCPointer<ByteVar>(), phregbatch.toCPointer<ByteVar>())

public actual fun ClusterRegCreateBatchNotifyPort(hkey: HKEY, phbatchnotifyport: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort(hkey.toCPointer<ByteVar>(), phbatchnotifyport.toCPointer<ByteVar>())

public actual fun ClusterRegCreateKey(hkey: HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCreateKey(hkey.toCPointer<ByteVar>(), lpszsubkey.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>())

public actual fun ClusterRegCreateKeyEx(hkey: HKEY, lpsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterRegCreateReadBatch(hkey: HKEY, phregreadbatch: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch(hkey.toCPointer<ByteVar>(), phregreadbatch.toCPointer<ByteVar>())

public actual fun ClusterRegDeleteKey(hkey: HKEY, lpszsubkey: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey(hkey.toCPointer<ByteVar>(), lpszsubkey.toCPointer<ByteVar>())

public actual fun ClusterRegDeleteKeyEx(hkey: HKEY, lpsubkey: PCWSTR, lpszreason: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterRegDeleteValue(hkey: HKEY, lpszvaluename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue(hkey.toCPointer<ByteVar>(), lpszvaluename.toCPointer<ByteVar>())

public actual fun ClusterRegDeleteValueEx(hkey: HKEY, lpszvaluename: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx(hkey.toCPointer<ByteVar>(), lpszvaluename.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterRegEnumKey(hkey: HKEY, dwindex: UInt, lpszname: PWSTR, lpcchname: Long, lpftlastwritetime: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegEnumKey(hkey.toCPointer<ByteVar>(), dwindex, lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun ClusterRegEnumValue(hkey: HKEY, dwindex: UInt, lpszvaluename: PWSTR, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegEnumValue(hkey.toCPointer<ByteVar>(), dwindex, lpszvaluename.toCPointer<ByteVar>(), lpcchvaluename.toCPointer<ByteVar>(), lpdwtype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun ClusterRegGetBatchNotification(hbatchnotify: HREGBATCHPORT, phbatchnotification: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification(hbatchnotify, phbatchnotification.toCPointer<ByteVar>())

public actual fun ClusterRegGetKeySecurity(hkey: HKEY, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity(hkey.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>())

public actual fun ClusterRegOpenKey(hkey: HKEY, lpszsubkey: PCWSTR, samdesired: UInt, phkresult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegOpenKey(hkey.toCPointer<ByteVar>(), lpszsubkey.toCPointer<ByteVar>(), samdesired, phkresult.toCPointer<ByteVar>())

public actual fun ClusterRegQueryInfoKey(hkey: HKEY, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey(hkey.toCPointer<ByteVar>(), lpcsubkeys.toCPointer<ByteVar>(), lpcchmaxsubkeylen.toCPointer<ByteVar>(), lpcvalues.toCPointer<ByteVar>(), lpcchmaxvaluenamelen.toCPointer<ByteVar>(), lpcbmaxvaluelen.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun ClusterRegQueryValue(hkey: HKEY, lpszvaluename: PCWSTR, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegQueryValue(hkey.toCPointer<ByteVar>(), lpszvaluename.toCPointer<ByteVar>(), lpdwvaluetype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun ClusterRegReadBatchAddCommand(hregreadbatch: HREGREADBATCH, wzsubkeyname: PCWSTR, wzvaluename: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand(hregreadbatch, wzsubkeyname.toCPointer<ByteVar>(), wzvaluename.toCPointer<ByteVar>())

public actual fun ClusterRegReadBatchReplyNextCommand(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand(hregreadbatchreply, pbatchcommand.toCPointer<ByteVar>())

public actual fun ClusterRegSetKeySecurity(hkey: HKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity(hkey.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun ClusterRegSetKeySecurityEx(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpszreason: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx(hkey.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterRegSetValue(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegSetValue(hkey.toCPointer<ByteVar>(), lpszvaluename.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun ClusterRegSetValueEx(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx(hkey.toCPointer<ByteVar>(), lpszvaluename.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata, lpszreason.toCPointer<ByteVar>())

public actual fun ClusterRegSyncDatabase(hcluster: HCLUSTER, flags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase(hcluster, flags)

public actual fun ClusterRemoveAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule(hcluster, rulename.toCPointer<ByteVar>())

public actual fun ClusterRemoveGroupFromAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule(hcluster, rulename.toCPointer<ByteVar>(), hgroup)

public actual fun ClusterRemoveGroupFromGroupSet(hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet(hgroup)

public actual fun ClusterRemoveGroupFromGroupSetEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx(hgroup, lpszreason.toCPointer<ByteVar>())

public actual fun ClusterResourceCloseEnum(hresenum: HRESENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum(hresenum)

public actual fun ClusterResourceCloseEnumEx(hresourceenumex: HRESENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx(hresourceenumex)

public actual fun ClusterResourceControl(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceControl(hresource, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterResourceControlAsUser(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser(hresource, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterResourceControlAsUserEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx(hresource, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterResourceControlEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceControlEx(hresource, hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterResourceEnum(hresenum: HRESENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceEnum(hresenum, dwindex, lpdwtype.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterResourceEnumEx(hresourceenumex: HRESENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx(hresourceenumex, dwindex, pitem.toCPointer<ByteVar>(), cbitem.toCPointer<ByteVar>())

public actual fun ClusterResourceGetEnumCount(hresenum: HRESENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount(hresenum)

public actual fun ClusterResourceGetEnumCountEx(hresourceenumex: HRESENUMEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx(hresourceenumex)

public actual fun ClusterResourceOpenEnum(hresource: HRESOURCE, dwtype: UInt): HRESENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum(hresource, dwtype)

public actual fun ClusterResourceOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HRESENUMEX =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx(hcluster, lpszproperties.toCPointer<ByteVar>(), cbproperties, lpszroproperties.toCPointer<ByteVar>(), cbroproperties, dwflags)

public actual fun ClusterResourceTypeCloseEnum(hrestypeenum: HRESTYPEENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum(hrestypeenum)

public actual fun ClusterResourceTypeControl(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterResourceTypeControlAsUser(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun ClusterResourceTypeControlAsUserEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterResourceTypeControlEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun ClusterResourceTypeEnum(hrestypeenum: HRESTYPEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum(hrestypeenum, dwindex, lpdwtype.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun ClusterResourceTypeGetEnumCount(hrestypeenum: HRESTYPEENUM): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount(hrestypeenum)

public actual fun ClusterResourceTypeOpenEnum(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, dwtype: UInt): HRESTYPEENUM =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), dwtype)

public actual fun ClusterSetAccountAccess(hcluster: HCLUSTER, szaccountsid: PCWSTR, dwaccess: UInt, dwcontroltype: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess(hcluster, szaccountsid.toCPointer<ByteVar>(), dwaccess, dwcontroltype)

public actual fun ClusterSharedVolumeSetSnapshotState(guidsnapshotset: GUID, lpszvolumename: PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE): UInt =
    0u

public actual fun ClusterUpgradeFunctionalLevel(hcluster: HCLUSTER, perform: BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel(hcluster, perform, pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>())

public actual fun CreateCluster(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateCluster(pconfig.toCPointer<ByteVar>(), pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>())

public actual fun CreateClusterAvailabilitySet(hcluster: HCLUSTER, lpavailabilitysetname: PCWSTR, pavailabilitysetconfig: Long): HGROUPSET =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet(hcluster, lpavailabilitysetname.toCPointer<ByteVar>(), pavailabilitysetconfig.toCPointer<ByteVar>())

public actual fun CreateClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterGroup(hcluster, lpszgroupname.toCPointer<ByteVar>())

public actual fun CreateClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, pgroupinfo: Long): HGROUP =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterGroupEx(hcluster, lpszgroupname.toCPointer<ByteVar>(), pgroupinfo.toCPointer<ByteVar>())

public actual fun CreateClusterGroupSet(hcluster: HCLUSTER, groupsetname: PCWSTR): HGROUPSET =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterGroupSet(hcluster, groupsetname.toCPointer<ByteVar>())

public actual fun CreateClusterNameAccount(hcluster: HCLUSTER, pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterNameAccount(hcluster, pconfig.toCPointer<ByteVar>(), pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>())

public actual fun CreateClusterNotifyPort(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: UInt, dwnotifykey: ULong): HCHANGE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort(hchange, hcluster, dwfilter, dwnotifykey)

public actual fun CreateClusterNotifyPortV2(hchange: HCHANGE, hcluster: HCLUSTER, filters: Long, dwfiltercount: UInt, dwnotifykey: ULong): HCHANGE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2(hchange, hcluster, filters.toCPointer<ByteVar>(), dwfiltercount, dwnotifykey)

public actual fun CreateClusterResource(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterResource(hgroup, lpszresourcename.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>(), dwflags)

public actual fun CreateClusterResourceEx(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt, lpszreason: PCWSTR): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterResourceEx(hgroup, lpszresourcename.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>(), dwflags, lpszreason.toCPointer<ByteVar>())

public actual fun CreateClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterResourceType(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), lpszdisplayname.toCPointer<ByteVar>(), lpszresourcetypedll.toCPointer<ByteVar>(), dwlooksalivepollinterval, dwisalivepollinterval)

public actual fun CreateClusterResourceTypeEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx(hcluster, lpszresourcetypename.toCPointer<ByteVar>(), lpszdisplayname.toCPointer<ByteVar>(), lpszresourcetypedll.toCPointer<ByteVar>(), dwlooksalivepollinterval, dwisalivepollinterval, lpszreason.toCPointer<ByteVar>())

public actual fun DeleteClusterGroup(hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterGroup(hgroup)

public actual fun DeleteClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx(hgroup, lpszreason.toCPointer<ByteVar>())

public actual fun DeleteClusterGroupSet(hgroupset: HGROUPSET): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet(hgroupset)

public actual fun DeleteClusterGroupSetEx(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx(hgroupset, lpszreason.toCPointer<ByteVar>())

public actual fun DeleteClusterResource(hresource: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterResource(hresource)

public actual fun DeleteClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx(hresource, lpszreason.toCPointer<ByteVar>())

public actual fun DeleteClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterResourceType(hcluster, lpszresourcetypename.toCPointer<ByteVar>())

public actual fun DeleteClusterResourceTypeEx(hcluster: HCLUSTER, lpsztypename: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx(hcluster, lpsztypename.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun DestroyCluster(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, fdeletevirtualcomputerobjects: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DestroyCluster(hcluster, pfnprogresscallback.toLong().toCPointer<ByteVar>(), pvcallbackarg.toCPointer<ByteVar>(), fdeletevirtualcomputerobjects)

public actual fun DestroyClusterGroup(hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DestroyClusterGroup(hgroup)

public actual fun DestroyClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx(hgroup, lpszreason.toCPointer<ByteVar>())

public actual fun DetermineCNOResTypeFromCluster(hcluster: HCLUSTER, pcnorestype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster(hcluster, pcnorestype.toCPointer<ByteVar>())

public actual fun DetermineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcnorestype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist(cnodes, ppsznodenames.toCPointer<ByteVar>(), pcnorestype.toCPointer<ByteVar>())

public actual fun DetermineClusterCloudTypeFromCluster(hcluster: HCLUSTER, pcloudtype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster(hcluster, pcloudtype.toCPointer<ByteVar>())

public actual fun DetermineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcloudtype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist(cnodes, ppsznodenames.toCPointer<ByteVar>(), pcloudtype.toCPointer<ByteVar>())

public actual fun EvictClusterNode(hnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_EvictClusterNode(hnode)

public actual fun EvictClusterNodeEx(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_EvictClusterNodeEx(hnode, dwtimeout, phrcleanupstatus.toCPointer<ByteVar>())

public actual fun EvictClusterNodeEx2(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2(hnode, dwtimeout, phrcleanupstatus.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun FailClusterResource(hresource: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_FailClusterResource(hresource)

public actual fun FailClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_FailClusterResourceEx(hresource, lpszreason.toCPointer<ByteVar>())

public actual fun FreeClusterCrypt(pcryptinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_FreeClusterCrypt(pcryptinfo.toCPointer<ByteVar>())

public actual fun FreeClusterHealthFault(clusterhealthfault: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_FreeClusterHealthFault(clusterhealthfault.toCPointer<ByteVar>())

public actual fun FreeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray(clusterhealthfaultarray.toCPointer<ByteVar>())

public actual fun GetClusterFromGroup(hgroup: HGROUP): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterFromGroup(hgroup)

public actual fun GetClusterFromNetInterface(hnetinterface: HNETINTERFACE): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface(hnetinterface)

public actual fun GetClusterFromNetwork(hnetwork: HNETWORK): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterFromNetwork(hnetwork)

public actual fun GetClusterFromNode(hnode: HNODE): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterFromNode(hnode)

public actual fun GetClusterFromResource(hresource: HRESOURCE): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterFromResource(hresource)

public actual fun GetClusterGroupKey(hgroup: HGROUP, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterGroupKey(hgroup, samdesired)?.toLong() ?: 0L

public actual fun GetClusterGroupState(hgroup: HGROUP, lpsznodename: PWSTR, lpcchnodename: Long): CLUSTER_GROUP_STATE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterGroupState(hgroup, lpsznodename.toCPointer<ByteVar>(), lpcchnodename.toCPointer<ByteVar>())

public actual fun GetClusterInformation(hcluster: HCLUSTER, lpszclustername: PWSTR, lpcchclustername: Long, lpclusterinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterInformation(hcluster, lpszclustername.toCPointer<ByteVar>(), lpcchclustername.toCPointer<ByteVar>(), lpclusterinfo.toCPointer<ByteVar>())

public actual fun GetClusterKey(hcluster: HCLUSTER, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterKey(hcluster, samdesired)?.toLong() ?: 0L

public actual fun GetClusterNetInterface(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR, lpszinterfacename: PWSTR, lpcchinterfacename: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNetInterface(hcluster, lpsznodename.toCPointer<ByteVar>(), lpsznetworkname.toCPointer<ByteVar>(), lpszinterfacename.toCPointer<ByteVar>(), lpcchinterfacename.toCPointer<ByteVar>())

public actual fun GetClusterNetInterfaceKey(hnetinterface: HNETINTERFACE, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey(hnetinterface, samdesired)?.toLong() ?: 0L

public actual fun GetClusterNetInterfaceState(hnetinterface: HNETINTERFACE): CLUSTER_NETINTERFACE_STATE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState(hnetinterface)

public actual fun GetClusterNetworkId(hnetwork: HNETWORK, lpsznetworkid: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNetworkId(hnetwork, lpsznetworkid.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun GetClusterNetworkKey(hnetwork: HNETWORK, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNetworkKey(hnetwork, samdesired)?.toLong() ?: 0L

public actual fun GetClusterNetworkState(hnetwork: HNETWORK): CLUSTER_NETWORK_STATE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNetworkState(hnetwork)

public actual fun GetClusterNodeId(hnode: HNODE, lpsznodeid: PWSTR, lpcchname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNodeId(hnode, lpsznodeid.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>())

public actual fun GetClusterNodeKey(hnode: HNODE, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNodeKey(hnode, samdesired)?.toLong() ?: 0L

public actual fun GetClusterNodeState(hnode: HNODE): CLUSTER_NODE_STATE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNodeState(hnode)

public actual fun GetClusterNotify(hchange: HCHANGE, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: PWSTR, lpcchname: Long, dwmilliseconds: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNotify(hchange, lpdwnotifykey.toCPointer<ByteVar>(), lpdwfiltertype.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun GetClusterNotifyV2(hchange: HCHANGE, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: PWSTR, lpcchobjectid: Long, lpszparentid: PWSTR, lpcchparentid: Long, lpszname: PWSTR, lpcchname: Long, lpsztype: PWSTR, lpcchtype: Long, dwmilliseconds: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterNotifyV2(hchange, lpdwnotifykey.toCPointer<ByteVar>(), pfilterandtype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), lpbbuffersize.toCPointer<ByteVar>(), lpszobjectid.toCPointer<ByteVar>(), lpcchobjectid.toCPointer<ByteVar>(), lpszparentid.toCPointer<ByteVar>(), lpcchparentid.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>(), lpsztype.toCPointer<ByteVar>(), lpcchtype.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun GetClusterQuorumResource(hcluster: HCLUSTER, lpszresourcename: PWSTR, lpcchresourcename: Long, lpszdevicename: PWSTR, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterQuorumResource(hcluster, lpszresourcename.toCPointer<ByteVar>(), lpcchresourcename.toCPointer<ByteVar>(), lpszdevicename.toCPointer<ByteVar>(), lpcchdevicename.toCPointer<ByteVar>(), lpdwmaxquorumlogsize.toCPointer<ByteVar>())

public actual fun GetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PWSTR, lpcchdependencyexpression: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression(hresource, lpszdependencyexpression.toCPointer<ByteVar>(), lpcchdependencyexpression.toCPointer<ByteVar>())

public actual fun GetClusterResourceKey(hresource: HRESOURCE, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterResourceKey(hresource, samdesired)?.toLong() ?: 0L

public actual fun GetClusterResourceNetworkName(hresource: HRESOURCE, lpbuffer: PWSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName(hresource, lpbuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetClusterResourceState(hresource: HRESOURCE, lpsznodename: PWSTR, lpcchnodename: Long, lpszgroupname: PWSTR, lpcchgroupname: Long): CLUSTER_RESOURCE_STATE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterResourceState(hresource, lpsznodename.toCPointer<ByteVar>(), lpcchnodename.toCPointer<ByteVar>(), lpszgroupname.toCPointer<ByteVar>(), lpcchgroupname.toCPointer<ByteVar>())

public actual fun GetClusterResourceTypeKey(hcluster: HCLUSTER, lpsztypename: PCWSTR, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey(hcluster, lpsztypename.toCPointer<ByteVar>(), samdesired)?.toLong() ?: 0L

public actual fun GetNodeCloudTypeDW(ppsznodename: PCWSTR, nodecloudtype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW(ppsznodename.toCPointer<ByteVar>(), nodecloudtype.toCPointer<ByteVar>())

public actual fun GetNodeClusterState(lpsznodename: PCWSTR, pdwclusterstate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetNodeClusterState(lpsznodename.toCPointer<ByteVar>(), pdwclusterstate.toCPointer<ByteVar>())

public actual fun GetNotifyEventHandle(hchange: HCHANGE, lphtargetevent: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_GetNotifyEventHandle(hchange, lphtargetevent.toCPointer<ByteVar>())

public actual fun InitializeClusterHealthFault(clusterhealthfault: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault(clusterhealthfault.toCPointer<ByteVar>())

public actual fun InitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray(clusterhealthfaultarray.toCPointer<ByteVar>())

public actual fun IsFileOnClusterSharedVolume(lpszpathname: PCWSTR, pbfileisonsharedvolume: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume(lpszpathname.toCPointer<ByteVar>(), pbfileisonsharedvolume.toCPointer<ByteVar>())

public actual fun MoveClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_MoveClusterGroup(hgroup, hdestinationnode)

public actual fun MoveClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_MoveClusterGroupEx(hgroup, hdestinationnode, dwmoveflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun MoveClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2(hgroup, hdestinationnode, dwmoveflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpszreason.toCPointer<ByteVar>())

public actual fun OfflineClusterGroup(hgroup: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OfflineClusterGroup(hgroup)

public actual fun OfflineClusterGroupEx(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx(hgroup, dwofflineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun OfflineClusterGroupEx2(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2(hgroup, dwofflineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpszreason.toCPointer<ByteVar>())

public actual fun OfflineClusterResource(hresource: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OfflineClusterResource(hresource)

public actual fun OfflineClusterResourceEx(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx(hresource, dwofflineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun OfflineClusterResourceEx2(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2(hresource, dwofflineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpszreason.toCPointer<ByteVar>())

public actual fun OnlineClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OnlineClusterGroup(hgroup, hdestinationnode)

public actual fun OnlineClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx(hgroup, hdestinationnode, dwonlineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun OnlineClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2(hgroup, hdestinationnode, dwonlineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpszreason.toCPointer<ByteVar>())

public actual fun OnlineClusterResource(hresource: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OnlineClusterResource(hresource)

public actual fun OnlineClusterResourceEx(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx(hresource, dwonlineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun OnlineClusterResourceEx2(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2(hresource, dwonlineflags, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpszreason.toCPointer<ByteVar>())

public actual fun OpenCluster(lpszclustername: PCWSTR): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenCluster(lpszclustername.toCPointer<ByteVar>())

public actual fun OpenClusterCryptProvider(lpszresource: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider(lpszresource.toCPointer<ByteVar>(), lpszprovider.toCPointer<ByteVar>(), dwtype, dwflags)

public actual fun OpenClusterCryptProviderEx(lpszresource: PCWSTR, lpszkeyname: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx(lpszresource.toCPointer<ByteVar>(), lpszkeyname.toCPointer<ByteVar>(), lpszprovider.toCPointer<ByteVar>(), dwtype, dwflags)

public actual fun OpenClusterEx(lpszclustername: PCWSTR, desiredaccess: UInt, grantedaccess: Long): HCLUSTER =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterEx(lpszclustername.toCPointer<ByteVar>(), desiredaccess, grantedaccess.toCPointer<ByteVar>())

public actual fun OpenClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterGroup(hcluster, lpszgroupname.toCPointer<ByteVar>())

public actual fun OpenClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HGROUP =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterGroupEx(hcluster, lpszgroupname.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess.toCPointer<ByteVar>())

public actual fun OpenClusterGroupSet(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterGroupSet(hcluster, lpszgroupsetname.toCPointer<ByteVar>())

public actual fun OpenClusterNetInterface(hcluster: HCLUSTER, lpszinterfacename: PCWSTR): HNETINTERFACE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNetInterface(hcluster, lpszinterfacename.toCPointer<ByteVar>())

public actual fun OpenClusterNetInterfaceEx(hcluster: HCLUSTER, lpszinterfacename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETINTERFACE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx(hcluster, lpszinterfacename.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess.toCPointer<ByteVar>())

public actual fun OpenClusterNetwork(hcluster: HCLUSTER, lpsznetworkname: PCWSTR): HNETWORK =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNetwork(hcluster, lpsznetworkname.toCPointer<ByteVar>())

public actual fun OpenClusterNetworkEx(hcluster: HCLUSTER, lpsznetworkname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETWORK =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx(hcluster, lpsznetworkname.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess.toCPointer<ByteVar>())

public actual fun OpenClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR): HNODE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNode(hcluster, lpsznodename.toCPointer<ByteVar>())

public actual fun OpenClusterNodeById(hcluster: HCLUSTER, nodeid: UInt): HNODE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNodeById(hcluster, nodeid)

public actual fun OpenClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNODE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterNodeEx(hcluster, lpsznodename.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess.toCPointer<ByteVar>())

public actual fun OpenClusterResource(hcluster: HCLUSTER, lpszresourcename: PCWSTR): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterResource(hcluster, lpszresourcename.toCPointer<ByteVar>())

public actual fun OpenClusterResourceEx(hcluster: HCLUSTER, lpszresourcename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_OpenClusterResourceEx(hcluster, lpszresourcename.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess.toCPointer<ByteVar>())

public actual fun PauseClusterNode(hnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_PauseClusterNode(hnode)

public actual fun PauseClusterNodeEx(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_PauseClusterNodeEx(hnode, bdrainnode, dwpauseflags, hnodedraintarget)

public actual fun PauseClusterNodeEx2(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2(hnode, bdrainnode, dwpauseflags, hnodedraintarget, lpszreason.toCPointer<ByteVar>())

public actual fun QueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion(appinstanceid.toCPointer<ByteVar>(), instanceversionhigh.toCPointer<ByteVar>(), instanceversionlow.toCPointer<ByteVar>(), versionstatus.toCPointer<ByteVar>())

public actual fun RegisterAppInstance(processhandle: HANDLE, appinstanceid: Long, childreninheritappinstance: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RegisterAppInstance(processhandle.toCPointer<ByteVar>(), appinstanceid.toCPointer<ByteVar>(), childreninheritappinstance)

public actual fun RegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion(appinstanceid.toCPointer<ByteVar>(), instanceversionhigh, instanceversionlow)

public actual fun RegisterClusterNotify(hchange: HCHANGE, dwfiltertype: UInt, hobject: HANDLE, dwnotifykey: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RegisterClusterNotify(hchange, dwfiltertype, hobject.toCPointer<ByteVar>(), dwnotifykey)

public actual fun RegisterClusterNotifyV2(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: HANDLE, dwnotifykey: ULong): UInt =
    0u

public actual fun RegisterClusterResourceTypeNotifyV2(hchange: HCHANGE, hcluster: HCLUSTER, flags: Long, restypename: PCWSTR, dwnotifykey: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2(hchange, hcluster, flags, restypename.toCPointer<ByteVar>(), dwnotifykey)

public actual fun RemoveClusterGroupDependency(hgroup: HGROUP, hdependson: HGROUP): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency(hgroup, hdependson)

public actual fun RemoveClusterGroupDependencyEx(hgroup: HGROUP, hdependson: HGROUP, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx(hgroup, hdependson, lpszreason.toCPointer<ByteVar>())

public actual fun RemoveClusterGroupSetDependency(hgroupset: HGROUPSET, hdependson: HGROUPSET): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency(hgroupset, hdependson)

public actual fun RemoveClusterGroupSetDependencyEx(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx(hgroupset, hdependson, lpszreason.toCPointer<ByteVar>())

public actual fun RemoveClusterGroupToGroupSetDependency(hgroup: HGROUP, hdependson: HGROUPSET): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency(hgroup, hdependson)

public actual fun RemoveClusterGroupToGroupSetDependencyEx(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx(hgroup, hdependson, lpszreason.toCPointer<ByteVar>())

public actual fun RemoveClusterNameAccount(hcluster: HCLUSTER, bdeletecomputerobjects: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount(hcluster, bdeletecomputerobjects)

public actual fun RemoveClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency(hresource, hdependson)

public actual fun RemoveClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx(hresource, hdependson, lpszreason.toCPointer<ByteVar>())

public actual fun RemoveClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode(hresource, hnode)

public actual fun RemoveClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx(hresource, hnode, lpszreason.toCPointer<ByteVar>())

public actual fun RemoveClusterStorageNode(hcluster: HCLUSTER, lpszclusterstorageenclosurename: PCWSTR, dwtimeout: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode(hcluster, lpszclusterstorageenclosurename.toCPointer<ByteVar>(), dwtimeout, dwflags)

public actual fun RemoveCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername.toCPointer<ByteVar>(), lpremotegroupsetname.toCPointer<ByteVar>())

public actual fun RemoveResourceFromClusterSharedVolumes(hresource: HRESOURCE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes(hresource)

public actual fun ResUtilAddUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), poutpropertylist.toCPointer<ByteVar>(), pcboutpropertylistsize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilCreateDirectoryTree(pszpath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree(pszpath.toCPointer<ByteVar>())

public actual fun ResUtilDupGroup(group: HGROUP, copy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilDupGroup(group, copy.toCPointer<ByteVar>())

public actual fun ResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock(poutparams.toCPointer<ByteVar>(), pinparams.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>())

public actual fun ResUtilDupResource(group: HRESOURCE, copy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilDupResource(group, copy.toCPointer<ByteVar>())

public actual fun ResUtilDupString(pszinstring: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilDupString(pszinstring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ResUtilEnumGroups(hcluster: HCLUSTER, hself: HGROUP, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumGroups(hcluster, hself, prescallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>())

public actual fun ResUtilEnumGroupsEx(hcluster: HCLUSTER, hself: HGROUP, grouptype: CLUSGROUP_TYPE, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx(hcluster, hself, grouptype, prescallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>())

public actual fun ResUtilEnumPrivateProperties(hkeyclusterkey: HKEY, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties(hkeyclusterkey.toCPointer<ByteVar>(), pszoutproperties.toCPointer<ByteVar>(), cboutpropertiessize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilEnumProperties(ppropertytable: Long, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumProperties(ppropertytable.toCPointer<ByteVar>(), pszoutproperties.toCPointer<ByteVar>(), cboutpropertiessize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilEnumResources(hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumResources(hself, lpszrestypename.toCPointer<ByteVar>(), prescallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>())

public actual fun ResUtilEnumResourcesEx(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx(hcluster, hself, lpszrestypename.toCPointer<ByteVar>(), prescallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>())

public actual fun ResUtilEnumResourcesEx2(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long, dwdesiredaccess: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2(hcluster, hself, lpszrestypename.toCPointer<ByteVar>(), prescallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun ResUtilExpandEnvironmentStrings(pszsrc: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings(pszsrc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pbpropertyvalue.toCPointer<ByteVar>(), pcbpropertyvaluesize.toCPointer<ByteVar>())

public actual fun ResUtilFindDependentDiskResourceDriveLetter(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: PWSTR, pcchdriveletter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter(hcluster, hresource, pszdriveletter.toCPointer<ByteVar>(), pcchdriveletter.toCPointer<ByteVar>())

public actual fun ResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pdwpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pdwpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pszpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pszpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pftpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pftpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), plpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pszpropertyvalue.toCPointer<ByteVar>(), pcbpropertyvaluesize.toCPointer<ByteVar>())

public actual fun ResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), pszpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty(ppropertylist.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname.toCPointer<ByteVar>(), plpropertyvalue.toCPointer<ByteVar>())

public actual fun ResUtilFreeEnvironment(lpenvironment: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment(lpenvironment.toCPointer<ByteVar>())

public actual fun ResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock(poutparams.toCPointer<ByteVar>(), pinparams.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>())
}

public actual fun ResUtilGetAllProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), poutpropertylist.toCPointer<ByteVar>(), cboutpropertylistsize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty(ppboutvalue.toCPointer<ByteVar>(), pcboutvaluesize.toCPointer<ByteVar>(), pvaluestruct.toCPointer<ByteVar>(), pboldvalue.toCPointer<ByteVar>(), cboldvaluesize, pppropertylist.toCPointer<ByteVar>(), pcbpropertylistsize.toCPointer<ByteVar>())

public actual fun ResUtilGetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), ppboutvalue.toCPointer<ByteVar>(), pcboutvaluesize.toCPointer<ByteVar>())

public actual fun ResUtilGetClusterGroupType(hgroup: HGROUP, grouptype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType(hgroup, grouptype.toCPointer<ByteVar>())

public actual fun ResUtilGetClusterId(hcluster: HCLUSTER, guid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetClusterId(hcluster, guid.toCPointer<ByteVar>())

public actual fun ResUtilGetClusterRoleState(hcluster: HCLUSTER, eclusterrole: CLUSTER_ROLE): CLUSTER_ROLE_STATE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState(hcluster, eclusterrole)

public actual fun ResUtilGetCoreClusterResources(hcluster: HCLUSTER, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources(hcluster, phclusternameresource.toCPointer<ByteVar>(), phclusteripaddressresource.toCPointer<ByteVar>(), phclusterquorumresource.toCPointer<ByteVar>())

public actual fun ResUtilGetCoreClusterResourcesEx(hclusterin: HCLUSTER, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx(hclusterin, phclusternameresourceout.toCPointer<ByteVar>(), phclusterquorumresourceout.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun ResUtilGetCoreGroup(hcluster: HCLUSTER): HGROUP =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup(hcluster)

public actual fun ResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty(pdwoutvalue.toCPointer<ByteVar>(), pvaluestruct.toCPointer<ByteVar>(), dwoldvalue, dwminimum, dwmaximum, pppropertylist.toCPointer<ByteVar>(), pcbpropertylistsize.toCPointer<ByteVar>())

public actual fun ResUtilGetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pdwoutvalue: Long, dwdefaultvalue: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), pdwoutvalue.toCPointer<ByteVar>(), dwdefaultvalue)

public actual fun ResUtilGetEnvironmentWithNetName(hresource: HRESOURCE): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName(hresource)?.toLong() ?: 0L

public actual fun ResUtilGetFileTimeProperty(pftoutvalue: Long, pvaluestruct: Long, ftoldvalue: FILETIME, ftminimum: FILETIME, ftmaximum: FILETIME, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty(ploutvalue.toCPointer<ByteVar>(), pvaluestruct.toCPointer<ByteVar>(), loldvalue, lminimum, lmaximum, pppropertylist.toCPointer<ByteVar>(), pcbpropertylistsize.toCPointer<ByteVar>())

public actual fun ResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty(ppszoutvalue.toCPointer<ByteVar>(), pcboutvaluesize.toCPointer<ByteVar>(), pvaluestruct.toCPointer<ByteVar>(), pszoldvalue.toCPointer<ByteVar>(), cboldvaluesize, pppropertylist.toCPointer<ByteVar>(), pcbpropertylistsize.toCPointer<ByteVar>())

public actual fun ResUtilGetPrivateProperties(hkeyclusterkey: HKEY, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties(hkeyclusterkey.toCPointer<ByteVar>(), poutpropertylist.toCPointer<ByteVar>(), cboutpropertylistsize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilGetProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetProperties(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), poutpropertylist.toCPointer<ByteVar>(), cboutpropertylistsize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilGetPropertiesToParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: BOOL, psznameofpropinerror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), poutparams.toCPointer<ByteVar>(), bcheckforrequiredproperties, psznameofpropinerror.toCPointer<ByteVar>())

public actual fun ResUtilGetProperty(hkeyclusterkey: HKEY, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetProperty(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytableitem.toCPointer<ByteVar>(), poutpropertyitem.toCPointer<ByteVar>(), pcboutpropertyitemsize.toCPointer<ByteVar>())

public actual fun ResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats(ppropertytable.toCPointer<ByteVar>(), poutpropertyformatlist.toCPointer<ByteVar>(), cbpropertyformatlistsize, pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilGetPropertySize(hkeyclusterkey: HKEY, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytableitem.toCPointer<ByteVar>(), pcboutpropertylistsize.toCPointer<ByteVar>(), pnpropertycount.toCPointer<ByteVar>())

public actual fun ResUtilGetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pqwoutvalue: Long, qwdefaultvalue: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), pqwoutvalue.toCPointer<ByteVar>(), qwdefaultvalue)

public actual fun ResUtilGetResourceDependency(hself: HANDLE, lpszresourcetype: PCWSTR): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency(hself.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>())

public actual fun ResUtilGetResourceDependencyByClass(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass(hcluster, hself.toCPointer<ByteVar>(), prci.toCPointer<ByteVar>(), brecurse)

public actual fun ResUtilGetResourceDependencyByClassEx(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx(hcluster, hself.toCPointer<ByteVar>(), prci.toCPointer<ByteVar>(), brecurse, dwdesiredaccess)

public actual fun ResUtilGetResourceDependencyByName(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName(hcluster, hself.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>(), brecurse)

public actual fun ResUtilGetResourceDependencyByNameEx(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx(hcluster, hself.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>(), brecurse, dwdesiredaccess)

public actual fun ResUtilGetResourceDependencyEx(hself: HANDLE, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx(hself.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun ResUtilGetResourceDependentIPAddressProps(hresource: HRESOURCE, pszaddress: PWSTR, pcchaddress: Long, pszsubnetmask: PWSTR, pcchsubnetmask: Long, psznetwork: PWSTR, pcchnetwork: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps(hresource, pszaddress.toCPointer<ByteVar>(), pcchaddress.toCPointer<ByteVar>(), pszsubnetmask.toCPointer<ByteVar>(), pcchsubnetmask.toCPointer<ByteVar>(), psznetwork.toCPointer<ByteVar>(), pcchnetwork.toCPointer<ByteVar>())

public actual fun ResUtilGetResourceName(hresource: HRESOURCE, pszresourcename: PWSTR, pcchresourcenameinout: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceName(hresource, pszresourcename.toCPointer<ByteVar>(), pcchresourcenameinout.toCPointer<ByteVar>())

public actual fun ResUtilGetResourceNameDependency(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency(lpszresourcename.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>())

public actual fun ResUtilGetResourceNameDependencyEx(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx(lpszresourcename.toCPointer<ByteVar>(), lpszresourcetype.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun ResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty(ppszoutvalue.toCPointer<ByteVar>(), pvaluestruct.toCPointer<ByteVar>(), pszoldvalue.toCPointer<ByteVar>(), pppropertylist.toCPointer<ByteVar>(), pcbpropertylistsize.toCPointer<ByteVar>())

public actual fun ResUtilGetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGetSzValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ResUtilGroupsEqual(hself: HGROUP, hgroup: HGROUP, pequal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual(hself, hgroup, pequal.toCPointer<ByteVar>())

public actual fun ResUtilIsPathValid(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilIsPathValid(pszpath.toCPointer<ByteVar>())

public actual fun ResUtilIsResourceClassEqual(prci: Long, hresource: HRESOURCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual(prci.toCPointer<ByteVar>(), hresource)

public actual fun ResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight(left.toCPointer<ByteVar>(), right.toCPointer<ByteVar>())

public actual fun ResUtilNodeEnum(hcluster: HCLUSTER, pnodecallback: LPNODE_CALLBACK, pparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilNodeEnum(hcluster, pnodecallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>())

public actual fun ResUtilPaxosComparer(left: Long, right: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer(left.toCPointer<ByteVar>(), right.toCPointer<ByteVar>())

public actual fun ResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock(ppropertytable.toCPointer<ByteVar>(), poutpropertylist.toCPointer<ByteVar>(), pcboutpropertylistsize.toCPointer<ByteVar>(), pinparams.toCPointer<ByteVar>(), pcbbytesreturned.toCPointer<ByteVar>(), pcbrequired.toCPointer<ByteVar>())

public actual fun ResUtilRemoveResourceServiceEnvironment(pszservicename: PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment(pszservicename.toCPointer<ByteVar>(), pfnlogevent.toLong().toCPointer<ByteVar>(), hresourcehandle)

public actual fun ResUtilResourceDepEnum(hself: HRESOURCE, enumtype: UInt, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum(hself, enumtype, prescallback.toLong().toCPointer<ByteVar>(), pparameter.toCPointer<ByteVar>())

public actual fun ResUtilResourceTypesEqual(lpszresourcetypename: PCWSTR, hresource: HRESOURCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual(lpszresourcetypename.toCPointer<ByteVar>(), hresource)

public actual fun ResUtilResourcesEqual(hself: HRESOURCE, hresource: HRESOURCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual(hself, hresource)

public actual fun ResUtilSetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pbnewvalue: Long, cbnewvaluesize: UInt, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), pbnewvalue.toCPointer<ByteVar>(), cbnewvaluesize, ppboutvalue.toCPointer<ByteVar>(), pcboutvaluesize.toCPointer<ByteVar>())

public actual fun ResUtilSetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, dwnewvalue: UInt, pdwoutvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), dwnewvalue, pdwoutvalue.toCPointer<ByteVar>())

public actual fun ResUtilSetExpandSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), psznewvalue.toCPointer<ByteVar>(), ppszoutstring.toCPointer<ByteVar>())

public actual fun ResUtilSetMultiSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, cbnewvaluesize: UInt, ppszoutvalue: Long, pcboutvaluesize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), psznewvalue.toCPointer<ByteVar>(), cbnewvaluesize, ppszoutvalue.toCPointer<ByteVar>(), pcboutvaluesize.toCPointer<ByteVar>())

public actual fun ResUtilSetPrivatePropertyList(hkeyclusterkey: HKEY, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList(hkeyclusterkey.toCPointer<ByteVar>(), pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize)

public actual fun ResUtilSetPropertyParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), pinparams.toCPointer<ByteVar>(), pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize, poutparams.toCPointer<ByteVar>())

public actual fun ResUtilSetPropertyParameterBlockEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), pinparams.toCPointer<ByteVar>(), pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize, bforcewrite, poutparams.toCPointer<ByteVar>())

public actual fun ResUtilSetPropertyTable(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), ballowunknownproperties, pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize, poutparams.toCPointer<ByteVar>())

public actual fun ResUtilSetPropertyTableEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), ballowunknownproperties, pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize, bforcewrite, poutparams.toCPointer<ByteVar>())

public actual fun ResUtilSetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, qwnewvalue: ULong, pqwoutvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), qwnewvalue, pqwoutvalue.toCPointer<ByteVar>())

public actual fun ResUtilSetResourceServiceEnvironment(pszservicename: PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment(pszservicename.toCPointer<ByteVar>(), hresource, pfnlogevent.toLong().toCPointer<ByteVar>(), hresourcehandle)

public actual fun ResUtilSetResourceServiceStartParameters(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters(pszservicename.toCPointer<ByteVar>(), schscmhandle.toCPointer<ByteVar>(), phservice.toCPointer<ByteVar>(), pfnlogevent.toLong().toCPointer<ByteVar>(), hresourcehandle)

public actual fun ResUtilSetResourceServiceStartParametersEx(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, dwdesiredaccess: UInt, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx(pszservicename.toCPointer<ByteVar>(), schscmhandle.toCPointer<ByteVar>(), phservice.toCPointer<ByteVar>(), dwdesiredaccess, pfnlogevent.toLong().toCPointer<ByteVar>(), hresourcehandle)

public actual fun ResUtilSetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetSzValue(hkeyclusterkey.toCPointer<ByteVar>(), pszvaluename.toCPointer<ByteVar>(), psznewvalue.toCPointer<ByteVar>(), ppszoutstring.toCPointer<ByteVar>())

public actual fun ResUtilSetUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties(hkeyclusterkey.toCPointer<ByteVar>(), ppropertytable.toCPointer<ByteVar>(), pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize)

public actual fun ResUtilSetValueEx(hkeyclusterkey: HKEY, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuesize: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilSetValueEx(hkeyclusterkey.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), valuetype, valuedata.toCPointer<ByteVar>(), valuesize, flags)

public actual fun ResUtilStartResourceService(pszservicename: PCWSTR, phservicehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilStartResourceService(pszservicename.toCPointer<ByteVar>(), phservicehandle.toCPointer<ByteVar>())

public actual fun ResUtilStopResourceService(pszservicename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilStopResourceService(pszservicename.toCPointer<ByteVar>())

public actual fun ResUtilStopService(hservicehandle: SC_HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilStopService(hservicehandle.toCPointer<ByteVar>())

public actual fun ResUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: BOOL, pdwresourcestate: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll(dwservicepid, boffline, pdwresourcestate.toCPointer<ByteVar>(), pfnlogevent.toLong().toCPointer<ByteVar>(), hresourcehandle)

public actual fun ResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList(pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize)

public actual fun ResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable(ppropertytable.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), ballowunknownproperties, pinpropertylist.toCPointer<ByteVar>(), cbinpropertylistsize, poutparams.toCPointer<ByteVar>())

public actual fun ResUtilVerifyResourceService(pszservicename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService(pszservicename.toCPointer<ByteVar>())

public actual fun ResUtilVerifyService(hservicehandle: SC_HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilVerifyService(hservicehandle.toCPointer<ByteVar>())

public actual fun ResUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe(flags, reason, presult.toCPointer<ByteVar>())

public actual fun ResUtilsDeleteKeyTree(key: HKEY, keyname: PCWSTR, treatnokeyaserror: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree(key.toCPointer<ByteVar>(), keyname.toCPointer<ByteVar>(), treatnokeyaserror)

public actual fun ResetAllAppInstanceVersions(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions()

public actual fun RestartClusterResource(hresource: HRESOURCE, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RestartClusterResource(hresource, dwflags)

public actual fun RestartClusterResourceEx(hresource: HRESOURCE, dwflags: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RestartClusterResourceEx(hresource, dwflags, lpszreason.toCPointer<ByteVar>())

public actual fun RestoreClusterDatabase(lpszpathname: PCWSTR, bforce: BOOL, lpszquorumdriveletter: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_RestoreClusterDatabase(lpszpathname.toCPointer<ByteVar>(), bforce, lpszquorumdriveletter.toCPointer<ByteVar>())

public actual fun ResumeClusterNode(hnode: HNODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResumeClusterNode(hnode)

public actual fun ResumeClusterNodeEx(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx(hnode, eresumefailbacktype, dwresumeflagsreserved)

public actual fun ResumeClusterNodeEx2(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2(hnode, eresumefailbacktype, dwresumeflagsreserved, lpszreason.toCPointer<ByteVar>())

public actual fun SetAppInstanceCsvFlags(processhandle: HANDLE, mask: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags(processhandle.toCPointer<ByteVar>(), mask, flags)

public actual fun SetClusterGroupName(hgroup: HGROUP, lpszgroupname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterGroupName(hgroup, lpszgroupname.toCPointer<ByteVar>())

public actual fun SetClusterGroupNameEx(hgroup: HGROUP, lpszgroupname: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx(hgroup, lpszgroupname.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterGroupNodeList(hgroup: HGROUP, nodecount: UInt, nodelist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList(hgroup, nodecount, nodelist.toCPointer<ByteVar>())

public actual fun SetClusterGroupNodeListEx(hgroup: HGROUP, nodecount: UInt, nodelist: Long, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx(hgroup, nodecount, nodelist.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterGroupSetDependencyExpression(hgroupset: HGROUPSET, lpszdependencyexprssion: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression(hgroupset, lpszdependencyexprssion.toCPointer<ByteVar>())

public actual fun SetClusterGroupSetDependencyExpressionEx(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx(hgroupset, lpszdependencyexpression.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterName(hcluster: HCLUSTER, lpsznewclustername: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterName(hcluster, lpsznewclustername.toCPointer<ByteVar>())

public actual fun SetClusterNameEx(hcluster: HCLUSTER, lpsznewclustername: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterNameEx(hcluster, lpsznewclustername.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterNetworkName(hnetwork: HNETWORK, lpszname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterNetworkName(hnetwork, lpszname.toCPointer<ByteVar>())

public actual fun SetClusterNetworkNameEx(hnetwork: HNETWORK, lpszname: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx(hnetwork, lpszname.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterNetworkPriorityOrder(hcluster: HCLUSTER, networkcount: UInt, networklist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder(hcluster, networkcount, networklist.toCPointer<ByteVar>())

public actual fun SetClusterQuorumResource(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquologsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterQuorumResource(hresource, lpszdevicename.toCPointer<ByteVar>(), dwmaxquologsize)

public actual fun SetClusterQuorumResourceEx(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquorumlogsize: UInt, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx(hresource, lpszdevicename.toCPointer<ByteVar>(), dwmaxquorumlogsize, lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression(hresource, lpszdependencyexpression.toCPointer<ByteVar>())

public actual fun SetClusterResourceName(hresource: HRESOURCE, lpszresourcename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterResourceName(hresource, lpszresourcename.toCPointer<ByteVar>())

public actual fun SetClusterResourceNameEx(hresource: HRESOURCE, lpszresourcename: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx(hresource, lpszresourcename.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())

public actual fun SetClusterServiceAccountPassword(lpszclustername: PCWSTR, lpsznewpassword: PCWSTR, dwflags: UInt, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword(lpszclustername.toCPointer<ByteVar>(), lpsznewpassword.toCPointer<ByteVar>(), dwflags, lpreturnstatusbuffer.toCPointer<ByteVar>(), lpcbreturnstatusbuffersize.toCPointer<ByteVar>())

public actual fun SetGroupDependencyExpression(hgroup: HGROUP, lpszdependencyexpression: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression(hgroup, lpszdependencyexpression.toCPointer<ByteVar>())

public actual fun SetGroupDependencyExpressionEx(hgroup: HGROUP, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx(hgroup, lpszdependencyexpression.toCPointer<ByteVar>(), lpszreason.toCPointer<ByteVar>())
