@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.services.ScHandle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterGroupDependency(hdependentgroup, hprovidergroup)

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx(hdependentgroup, hprovidergroup, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency(hdependentgroupset, hprovidergroupset)

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx(hdependentgroupset, hprovidergroupset, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency(hdependentgroup, hprovidergroupset)

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx(hdependentgroup, hprovidergroupset, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hnode =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterNode(hcluster, lpsznodename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>())

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hnode =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterNodeEx(hcluster, lpsznodename?.value?.toCPointer<ByteVar>(), dwflags, 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>())

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterResourceDependency(hresource, hdependson)

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx(hresource, hdependson, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterResourceNode(hresource, hnode)

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx(hresource, hnode, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addClusterStorageNode(hcluster, lpsznodename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>(), lpszclusterstoragenodedescription?.value?.toCPointer<ByteVar>(), lpszclusterstoragenodelocation?.value?.toCPointer<ByteVar>())

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername?.value?.toCPointer<ByteVar>(), lpremotegroupsetname?.value?.toCPointer<ByteVar>())

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes(hresource)

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_backupClusterDatabase(hcluster, lpszpathname?.value?.toCPointer<ByteVar>())

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_canResourceBeDependent(hresource, hresourcedependent)

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation(hgroup, dwcancelflagsReserved)

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_changeClusterResourceGroup(hresource, hgroup)

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx(hresource, hgroup, flags)

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2(hresource, hgroup, flags, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun closeCluster(hcluster: Hcluster): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeCluster(hcluster)

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterCryptProvider(hcluscryptprovider)

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterGroup(hgroup)

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterGroupSet(hgroupset)

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterNetInterface(hnetinterface)

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterNetwork(hnetwork)

public actual fun closeClusterNode(hnode: Hnode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterNode(hnode)

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterNotifyPort(hchange)

public actual fun closeClusterResource(hresource: Hresource): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_closeClusterResource(hresource)

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: COpaquePointer?, param2: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault(hcluster, failure?.value?.toCPointer<ByteVar>(), param2)

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: COpaquePointer?, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults(hcluster, objects?.value?.toCPointer<ByteVar>(), flags)

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault(hcluster, id?.value?.toCPointer<ByteVar>(), flags)

public actual fun clusWorkerCheckTerminate(lpworker: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate(lpworker?.value?.toCPointer<ByteVar>())

public actual fun clusWorkerCreate(lpworker: COpaquePointer?, lpstartaddress: PworkerStartRoutine, lpparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusWorkerCreate(lpworker?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpparameter?.value?.toCPointer<ByteVar>())

public actual fun clusWorkerTerminate(lpworker: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusWorkerTerminate(lpworker?.value?.toCPointer<ByteVar>())
}

public actual fun clusWorkerTerminateEx(clusworker: COpaquePointer?, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx(clusworker?.value?.toCPointer<ByteVar>(), timeoutinmilliseconds, waitonly)

public actual fun clusWorkersTerminate(clusworkers: COpaquePointer?, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusWorkersTerminate(clusworkers?.value?.toCPointer<ByteVar>(), clusworkerscount, timeoutinmilliseconds, waitonly)

public actual fun clusapiSetReasonHandler(lphandler: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler(lphandler?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule(hcluster, rulename?.value?.toCPointer<ByteVar>(), hgroup)

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet(hgroupset, hgroup)

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains(hgroupset, hgroup, faultdomain, updatedomain)

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx(hgroupset, hgroup, faultdomain, updatedomain, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl(hcluster, affinityrulename?.value?.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume(lpszvolumepathname?.value?.toCPointer<ByteVar>())

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterCloseEnum(henum)

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterCloseEnumEx(hclusterenum)

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterControl(hcluster, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterControlEx(hcluster, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule(hcluster, rulename?.value?.toCPointer<ByteVar>(), ruletype)

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: COpaquePointer?, cbcryptinput: UInt, ppcryptoutput: COpaquePointer?, pcbcryptoutput: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterDecrypt(hcluscryptprovider, pcryptinput?.value?.toCPointer<ByteVar>(), cbcryptinput, ppcryptoutput?.value?.toCPointer<ByteVar>(), pcbcryptoutput?.value?.toCPointer<ByteVar>())

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: COpaquePointer?, cbdata: UInt, ppdata: COpaquePointer?, pcbdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterEncrypt(hcluscryptprovider, pdata?.value?.toCPointer<ByteVar>(), cbdata, ppdata?.value?.toCPointer<ByteVar>(), pcbdata?.value?.toCPointer<ByteVar>())

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterEnum(henum, dwindex, lpdwtype?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterEnumEx(hclusterenum, dwindex, pitem?.value?.toCPointer<ByteVar>(), cbitem?.value?.toCPointer<ByteVar>())

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGetEnumCount(henum)

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx(hclusterenum)

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGetVolumePathName(lpszfilename?.value?.toCPointer<ByteVar>(), lpszvolumepathname?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum(hgroupenum)

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx(hgroupenumex)

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupControl(hgroup, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupControlEx(hgroup, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszresourcename: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupEnum(hgroupenum, dwindex, lpdwtype?.value?.toCPointer<ByteVar>(), lpszresourcename?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupEnumEx(hgroupenumex, dwindex, pitem?.value?.toCPointer<ByteVar>(), cbitem?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount(hgroupenum)

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx(hgroupenumex)

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum(hgroup, dwtype)

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx(hcluster, lpszproperties?.value?.toCPointer<ByteVar>(), cbproperties, lpszroproperties?.value?.toCPointer<ByteVar>(), cbroproperties, dwflags)

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum(hgroupsetenum.toLong())

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupSetControl(hgroupset, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx(hgroupset, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupSetEnum(hgroupsetenum.toLong(), dwindex, lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount(hgroupsetenum.toLong())

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum(hcluster)

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume(lpszpathname?.value?.toCPointer<ByteVar>())

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum(hnetinterfaceenum.toLong())

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum(hnetinterfaceenum.toLong(), dwindex, lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum(hcluster, lpsznodename?.value?.toCPointer<ByteVar>(), lpsznetworkname?.value?.toCPointer<ByteVar>())

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum(hnetworkenum)

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetworkControl(hnetwork, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetworkControlEx(hnetwork, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetworkEnum(hnetworkenum, dwindex, lpdwtype?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount(hnetworkenum)

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum(hnetwork, dwtype)

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum(hnodeenum)

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx(hnodeenum)

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeControl(hnode, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeControlEx(hnode, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeEnum(hnodeenum, dwindex, lpdwtype?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeEnumEx(hnodeenum, dwindex, pitem?.value?.toCPointer<ByteVar>(), cbitem?.value?.toCPointer<ByteVar>())

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount(hnodeenum)

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx(hnodeenum)

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum(hnode, dwtype)

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: COpaquePointer?): Hnodeenumex =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx(hnode, dwtype, poptions?.value?.toCPointer<ByteVar>())

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterNodeReplacement(hcluster, lpsznodenamecurrent?.value?.toCPointer<ByteVar>(), lpsznodenamenew?.value?.toCPointer<ByteVar>())

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterOpenEnum(hcluster, dwtype)

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: COpaquePointer?): Hclusenumex =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterOpenEnumEx(hcluster, dwtype, poptions?.value?.toCPointer<ByteVar>())

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: COpaquePointer?, lpszvolumename: Pwstr, lpcchvolumename: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup(lpszfilename?.value?.toCPointer<ByteVar>(), lpszvolumepathname?.value?.toCPointer<ByteVar>(), lpcchvolumepathname?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>(), lpcchvolumename?.value?.toCPointer<ByteVar>())

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: COpaquePointer?, cbdata: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand(hregbatch, dwcommand, wzname?.value?.toCPointer<ByteVar>(), dwoptions, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification(hbatchnotification)

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand(hbatchnotification, pbatchcommand?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseBatch(hregbatch, bcommit, failedcommandnumber?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx(hregbatch, flags, failedcommandnumber?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort(hbatchnotifyport)

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseKey(hkey?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch(hregreadbatch, phregreadbatchreply?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx(hregreadbatch, flags, phregreadbatchreply?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply(hregreadbatchreply)

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCreateBatch(hkey?.value?.toCPointer<ByteVar>(), phregbatch?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort(hkey?.value?.toCPointer<ByteVar>(), phbatchnotifyport?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCreateKey(hkey?.value?.toCPointer<ByteVar>(), lpszsubkey?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, lpszreason: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch(hkey?.value?.toCPointer<ByteVar>(), phregreadbatch?.value?.toCPointer<ByteVar>())

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegDeleteKey(hkey?.value?.toCPointer<ByteVar>(), lpszsubkey?.value?.toCPointer<ByteVar>())

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegDeleteValue(hkey?.value?.toCPointer<ByteVar>(), lpszvaluename?.value?.toCPointer<ByteVar>())

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx(hkey?.value?.toCPointer<ByteVar>(), lpszvaluename?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegEnumKey(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpdwtype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegEnumValue(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpszvaluename?.value?.toCPointer<ByteVar>(), lpcchvaluename?.value?.toCPointer<ByteVar>(), lpdwtype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification(hbatchnotify, phbatchnotification?.value?.toCPointer<ByteVar>())

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity(hkey?.value?.toCPointer<ByteVar>(), requestedinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegOpenKey(hkey?.value?.toCPointer<ByteVar>(), lpszsubkey?.value?.toCPointer<ByteVar>(), samdesired, phkresult?.value?.toCPointer<ByteVar>())

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: COpaquePointer?, lpcchmaxsubkeylen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcchmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey(hkey?.value?.toCPointer<ByteVar>(), lpcsubkeys?.value?.toCPointer<ByteVar>(), lpcchmaxsubkeylen?.value?.toCPointer<ByteVar>(), lpcvalues?.value?.toCPointer<ByteVar>(), lpcchmaxvaluenamelen?.value?.toCPointer<ByteVar>(), lpcbmaxvaluelen?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegQueryValue(hkey?.value?.toCPointer<ByteVar>(), lpszvaluename?.value?.toCPointer<ByteVar>(), lpdwvaluetype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand(hregreadbatch, wzsubkeyname?.value?.toCPointer<ByteVar>(), wzvaluename?.value?.toCPointer<ByteVar>())

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand(hregreadbatchreply, pbatchcommand?.value?.toCPointer<ByteVar>())

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity(hkey?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx(hkey?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegSetValue(hkey?.value?.toCPointer<ByteVar>(), lpszvaluename?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegSetValueEx(hkey?.value?.toCPointer<ByteVar>(), lpszvaluename?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase(hcluster, flags)

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule(hcluster, rulename?.value?.toCPointer<ByteVar>())

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule(hcluster, rulename?.value?.toCPointer<ByteVar>(), hgroup)

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet(hgroup)

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx(hgroup, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum(hresenum)

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx(hresourceenumex)

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceControl(hresource, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser(hresource, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx(hresource, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceControlEx(hresource, hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceEnum(hresenum, dwindex, lpdwtype?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceEnumEx(hresourceenumex, dwindex, pitem?.value?.toCPointer<ByteVar>(), cbitem?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount(hresenum)

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx(hresourceenumex)

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum(hresource, dwtype)

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx(hcluster, lpszproperties?.value?.toCPointer<ByteVar>(), cbproperties, lpszroproperties?.value?.toCPointer<ByteVar>(), cbroproperties, dwflags)

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum(hrestypeenum)

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeControl(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), hhostnode, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), ninbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), noutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum(hrestypeenum, dwindex, lpdwtype?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount(hrestypeenum)

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), dwtype)

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterSetAccountAccess(hcluster, szaccountsid?.value?.toCPointer<ByteVar>(), dwaccess, dwcontroltype)

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    0u

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel(hcluster, perform, 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>())

public actual fun createCluster(pconfig: COpaquePointer?, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createCluster(pconfig?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>())

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: COpaquePointer?): Hgroupset =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet(hcluster, lpavailabilitysetname?.value?.toCPointer<ByteVar>(), pavailabilitysetconfig?.value?.toCPointer<ByteVar>())

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterGroup(hcluster, lpszgroupname?.value?.toCPointer<ByteVar>())

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: COpaquePointer?): Hgroup =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterGroupEx(hcluster, lpszgroupname?.value?.toCPointer<ByteVar>(), pgroupinfo?.value?.toCPointer<ByteVar>())

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterGroupSet(hcluster, groupsetname?.value?.toCPointer<ByteVar>())

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: COpaquePointer?, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterNameAccount(hcluster, pconfig?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>())

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterNotifyPort(hchange, hcluster, dwfilter, dwnotifykey)

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: COpaquePointer?, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2(hchange, hcluster, filters?.value?.toCPointer<ByteVar>(), dwfiltercount, dwnotifykey)

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterResource(hgroup, lpszresourcename?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterResourceEx(hgroup, lpszresourcename?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>(), dwflags, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterResourceType(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), lpszdisplayname?.value?.toCPointer<ByteVar>(), lpszresourcetypedll?.value?.toCPointer<ByteVar>(), dwlooksalivepollinterval, dwisalivepollinterval)

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>(), lpszdisplayname?.value?.toCPointer<ByteVar>(), lpszresourcetypedll?.value?.toCPointer<ByteVar>(), dwlooksalivepollinterval, dwisalivepollinterval, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterGroup(hgroup)

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterGroupEx(hgroup, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterGroupSet(hgroupset)

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx(hgroupset, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterResource(hresource)

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterResourceEx(hresource, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterResourceType(hcluster, lpszresourcetypename?.value?.toCPointer<ByteVar>())

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx(hcluster, lpsztypename?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?, fdeletevirtualcomputerobjects: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_destroyCluster(hcluster, 0L.toCPointer<ByteVar>(), pvcallbackarg?.value?.toCPointer<ByteVar>(), fdeletevirtualcomputerobjects)

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_destroyClusterGroup(hgroup)

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_destroyClusterGroupEx(hgroup, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster(hcluster, pcnorestype?.value?.toCPointer<ByteVar>())

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: COpaquePointer?, pcnorestype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist(cnodes, ppsznodenames?.value?.toCPointer<ByteVar>(), pcnorestype?.value?.toCPointer<ByteVar>())

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster(hcluster, pcloudtype?.value?.toCPointer<ByteVar>())

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: COpaquePointer?, pcloudtype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist(cnodes, ppsznodenames?.value?.toCPointer<ByteVar>(), pcloudtype?.value?.toCPointer<ByteVar>())

public actual fun evictClusterNode(hnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_evictClusterNode(hnode)

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_evictClusterNodeEx(hnode, dwtimeout, phrcleanupstatus?.value?.toCPointer<ByteVar>())

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_evictClusterNodeEx2(hnode, dwtimeout, phrcleanupstatus?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun failClusterResource(hresource: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_failClusterResource(hresource)

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_failClusterResourceEx(hresource, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun freeClusterCrypt(pcryptinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_freeClusterCrypt(pcryptinfo?.value?.toCPointer<ByteVar>())

public actual fun freeClusterHealthFault(clusterhealthfault: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_freeClusterHealthFault(clusterhealthfault?.value?.toCPointer<ByteVar>())

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray(clusterhealthfaultarray?.value?.toCPointer<ByteVar>())

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterFromGroup(hgroup)

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterFromNetInterface(hnetinterface)

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterFromNetwork(hnetwork)

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterFromNode(hnode)

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterFromResource(hresource)

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterGroupKey(hgroup, samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: COpaquePointer?): ClusterGroupState =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterGroupState(hgroup, lpsznodename?.value?.toCPointer<ByteVar>(), lpcchnodename?.value?.toCPointer<ByteVar>())

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: COpaquePointer?, lpclusterinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterInformation(hcluster, lpszclustername?.value?.toCPointer<ByteVar>(), lpcchclustername?.value?.toCPointer<ByteVar>(), lpclusterinfo?.value?.toCPointer<ByteVar>())

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterKey(hcluster, samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNetInterface(hcluster, lpsznodename?.value?.toCPointer<ByteVar>(), lpsznetworkname?.value?.toCPointer<ByteVar>(), lpszinterfacename?.value?.toCPointer<ByteVar>(), lpcchinterfacename?.value?.toCPointer<ByteVar>())

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey(hnetinterface, samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState(hnetinterface)

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNetworkId(hnetwork, lpsznetworkid?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNetworkKey(hnetwork, samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNetworkState(hnetwork)

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNodeId(hnode, lpsznodeid?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>())

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNodeKey(hnode, samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNodeState(hnode)

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: COpaquePointer?, lpdwfiltertype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?, dwmilliseconds: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNotify(hchange, lpdwnotifykey?.value?.toCPointer<ByteVar>(), lpdwfiltertype?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: COpaquePointer?, pfilterandtype: COpaquePointer?, buffer: COpaquePointer?, lpbbuffersize: COpaquePointer?, lpszobjectid: Pwstr, lpcchobjectid: COpaquePointer?, lpszparentid: Pwstr, lpcchparentid: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?, lpsztype: Pwstr, lpcchtype: COpaquePointer?, dwmilliseconds: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterNotifyV2(hchange, lpdwnotifykey?.value?.toCPointer<ByteVar>(), pfilterandtype?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), lpbbuffersize?.value?.toCPointer<ByteVar>(), lpszobjectid?.value?.toCPointer<ByteVar>(), lpcchobjectid?.value?.toCPointer<ByteVar>(), lpszparentid?.value?.toCPointer<ByteVar>(), lpcchparentid?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>(), lpsztype?.value?.toCPointer<ByteVar>(), lpcchtype?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: COpaquePointer?, lpszdevicename: Pwstr, lpcchdevicename: COpaquePointer?, lpdwmaxquorumlogsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterQuorumResource(hcluster, lpszresourcename?.value?.toCPointer<ByteVar>(), lpcchresourcename?.value?.toCPointer<ByteVar>(), lpszdevicename?.value?.toCPointer<ByteVar>(), lpcchdevicename?.value?.toCPointer<ByteVar>(), lpdwmaxquorumlogsize?.value?.toCPointer<ByteVar>())

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression(hresource, lpszdependencyexpression?.value?.toCPointer<ByteVar>(), lpcchdependencyexpression?.value?.toCPointer<ByteVar>())

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterResourceKey(hresource, samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName(hresource, lpbuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: COpaquePointer?, lpszgroupname: Pwstr, lpcchgroupname: COpaquePointer?): ClusterResourceState =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterResourceState(hresource, lpsznodename?.value?.toCPointer<ByteVar>(), lpcchnodename?.value?.toCPointer<ByteVar>(), lpszgroupname?.value?.toCPointer<ByteVar>(), lpcchgroupname?.value?.toCPointer<ByteVar>())

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey(hcluster, lpsztypename?.value?.toCPointer<ByteVar>(), samdesired)?.let { COpaquePointer(it.toLong()) }

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW(ppsznodename?.value?.toCPointer<ByteVar>(), nodecloudtype?.value?.toCPointer<ByteVar>())

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getNodeClusterState(lpsznodename?.value?.toCPointer<ByteVar>(), pdwclusterstate?.value?.toCPointer<ByteVar>())

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_getNotifyEventHandle(hchange, lphtargetevent?.value?.toCPointer<ByteVar>())

public actual fun initializeClusterHealthFault(clusterhealthfault: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_initializeClusterHealthFault(clusterhealthfault?.value?.toCPointer<ByteVar>())

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray(clusterhealthfaultarray?.value?.toCPointer<ByteVar>())

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume(lpszpathname?.value?.toCPointer<ByteVar>(), pbfileisonsharedvolume?.value?.toCPointer<ByteVar>())

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_moveClusterGroup(hgroup, hdestinationnode)

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_moveClusterGroupEx(hgroup, hdestinationnode, dwmoveflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_moveClusterGroupEx2(hgroup, hdestinationnode, dwmoveflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_offlineClusterGroup(hgroup)

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_offlineClusterGroupEx(hgroup, dwofflineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2(hgroup, dwofflineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_offlineClusterResource(hresource)

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_offlineClusterResourceEx(hresource, dwofflineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2(hresource, dwofflineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_onlineClusterGroup(hgroup, hdestinationnode)

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_onlineClusterGroupEx(hgroup, hdestinationnode, dwonlineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2(hgroup, hdestinationnode, dwonlineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_onlineClusterResource(hresource)

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_onlineClusterResourceEx(hresource, dwonlineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize)

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2(hresource, dwonlineflags, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openCluster(lpszclustername?.value?.toCPointer<ByteVar>())

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: COpaquePointer?, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterCryptProvider(lpszresource?.value?.toCPointer<ByteVar>(), lpszprovider?.value?.toCPointer<ByteVar>(), dwtype, dwflags)

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: COpaquePointer?, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx(lpszresource?.value?.toCPointer<ByteVar>(), lpszkeyname?.value?.toCPointer<ByteVar>(), lpszprovider?.value?.toCPointer<ByteVar>(), dwtype, dwflags)

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: COpaquePointer?): Hcluster =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterEx(lpszclustername?.value?.toCPointer<ByteVar>(), desiredaccess, grantedaccess?.value?.toCPointer<ByteVar>())

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterGroup(hcluster, lpszgroupname?.value?.toCPointer<ByteVar>())

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hgroup =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterGroupEx(hcluster, lpszgroupname?.value?.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterGroupSet(hcluster, lpszgroupsetname?.value?.toCPointer<ByteVar>())

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNetInterface(hcluster, lpszinterfacename?.value?.toCPointer<ByteVar>())

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnetinterface =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx(hcluster, lpszinterfacename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNetwork(hcluster, lpsznetworkname?.value?.toCPointer<ByteVar>())

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnetwork =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNetworkEx(hcluster, lpsznetworkname?.value?.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNode(hcluster, lpsznodename?.value?.toCPointer<ByteVar>())

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNodeById(hcluster, nodeid)

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnode =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterNodeEx(hcluster, lpsznodename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterResource(hcluster, lpszresourcename?.value?.toCPointer<ByteVar>())

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_openClusterResourceEx(hcluster, lpszresourcename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, lpdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_pauseClusterNode(hnode)

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_pauseClusterNodeEx(hnode, bdrainnode, dwpauseflags, hnodedraintarget)

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2(hnode, bdrainnode, dwpauseflags, hnodedraintarget, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun queryAppInstanceVersion(appinstanceid: COpaquePointer?, instanceversionhigh: COpaquePointer?, instanceversionlow: COpaquePointer?, versionstatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_queryAppInstanceVersion(appinstanceid?.value?.toCPointer<ByteVar>(), instanceversionhigh?.value?.toCPointer<ByteVar>(), instanceversionlow?.value?.toCPointer<ByteVar>(), versionstatus?.value?.toCPointer<ByteVar>())

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: COpaquePointer?, childreninheritappinstance: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_registerAppInstance(processhandle?.value?.toCPointer<ByteVar>(), appinstanceid?.value?.toCPointer<ByteVar>(), childreninheritappinstance)

public actual fun registerAppInstanceVersion(appinstanceid: COpaquePointer?, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_registerAppInstanceVersion(appinstanceid?.value?.toCPointer<ByteVar>(), instanceversionhigh, instanceversionlow)

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_registerClusterNotify(hchange, dwfiltertype, hobject?.value?.toCPointer<ByteVar>(), dwnotifykey)

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    0u

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2(hchange, hcluster, flags, restypename?.value?.toCPointer<ByteVar>(), dwnotifykey)

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterGroupDependency(hgroup, hdependson)

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx(hgroup, hdependson, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency(hgroupset, hdependson)

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx(hgroupset, hdependson, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency(hgroup, hdependson)

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx(hgroup, hdependson, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterNameAccount(hcluster, bdeletecomputerobjects)

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterResourceDependency(hresource, hdependson)

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx(hresource, hdependson, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterResourceNode(hresource, hnode)

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx(hresource, hnode, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeClusterStorageNode(hcluster, lpszclusterstorageenclosurename?.value?.toCPointer<ByteVar>(), dwtimeout, dwflags)

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername?.value?.toCPointer<ByteVar>(), lpremotegroupsetname?.value?.toCPointer<ByteVar>())

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes(hresource)

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, pcboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), poutpropertylist?.value?.toCPointer<ByteVar>(), pcboutpropertylistsize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree(pszpath?.value?.toCPointer<ByteVar>())

public actual fun resUtilDupGroup(group: Hgroup, copy: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilDupGroup(group, copy?.value?.toCPointer<ByteVar>())

public actual fun resUtilDupParameterBlock(poutparams: COpaquePointer?, pinparams: COpaquePointer?, ppropertytable: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock(poutparams?.value?.toCPointer<ByteVar>(), pinparams?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>())

public actual fun resUtilDupResource(group: Hresource, copy: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilDupResource(group, copy?.value?.toCPointer<ByteVar>())

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilDupString(pszinstring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumGroups(hcluster, hself, 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>())

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx(hcluster, hself, grouptype, 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>())

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszoutproperties?.value?.toCPointer<ByteVar>(), cboutpropertiessize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilEnumProperties(ppropertytable: COpaquePointer?, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumProperties(ppropertytable?.value?.toCPointer<ByteVar>(), pszoutproperties?.value?.toCPointer<ByteVar>(), cboutpropertiessize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumResources(hself, lpszrestypename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>())

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx(hcluster, hself, lpszrestypename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>())

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?, dwdesiredaccess: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2(hcluster, hself, lpszrestypename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings(pszsrc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun resUtilFindBinaryProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: COpaquePointer?, pcbpropertyvaluesize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pbpropertyvalue?.value?.toCPointer<ByteVar>(), pcbpropertyvaluesize?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter(hcluster, hresource, pszdriveletter?.value?.toCPointer<ByteVar>(), pcchdriveletter?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindDwordProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pdwpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindExpandSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pszpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindExpandedSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pszpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindFileTimeProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pftpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindLongProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindLongProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), plpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindMultiSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?, pcbpropertyvaluesize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pszpropertyvalue?.value?.toCPointer<ByteVar>(), pcbpropertyvaluesize?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindSzProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), pszpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty(ppropertylist?.value?.toCPointer<ByteVar>(), cbpropertylistsize, pszpropertyname?.value?.toCPointer<ByteVar>(), plpropertyvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilFreeEnvironment(lpenvironment: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment(lpenvironment?.value?.toCPointer<ByteVar>())

public actual fun resUtilFreeParameterBlock(poutparams: COpaquePointer?, pinparams: COpaquePointer?, ppropertytable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock(poutparams?.value?.toCPointer<ByteVar>(), pinparams?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>())
}

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetAllProperties(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), poutpropertylist?.value?.toCPointer<ByteVar>(), cboutpropertylistsize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetBinaryProperty(ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?, pvaluestruct: COpaquePointer?, pboldvalue: COpaquePointer?, cboldvaluesize: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty(ppboutvalue?.value?.toCPointer<ByteVar>(), pcboutvaluesize?.value?.toCPointer<ByteVar>(), pvaluestruct?.value?.toCPointer<ByteVar>(), pboldvalue?.value?.toCPointer<ByteVar>(), cboldvaluesize, pppropertylist?.value?.toCPointer<ByteVar>(), pcbpropertylistsize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), ppboutvalue?.value?.toCPointer<ByteVar>(), pcboutvaluesize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType(hgroup, grouptype?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetClusterId(hcluster, guid?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState(hcluster, eclusterrole)

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: COpaquePointer?, phclusteripaddressresource: COpaquePointer?, phclusterquorumresource: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources(hcluster, phclusternameresource?.value?.toCPointer<ByteVar>(), phclusteripaddressresource?.value?.toCPointer<ByteVar>(), phclusterquorumresource?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: COpaquePointer?, phclusterquorumresourceout: COpaquePointer?, dwdesiredaccess: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx(hclusterin, phclusternameresourceout?.value?.toCPointer<ByteVar>(), phclusterquorumresourceout?.value?.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup(hcluster)

public actual fun resUtilGetDwordProperty(pdwoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty(pdwoutvalue?.value?.toCPointer<ByteVar>(), pvaluestruct?.value?.toCPointer<ByteVar>(), dwoldvalue, dwminimum, dwmaximum, pppropertylist?.value?.toCPointer<ByteVar>(), pcbpropertylistsize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: COpaquePointer?, dwdefaultvalue: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetDwordValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), pdwoutvalue?.value?.toCPointer<ByteVar>(), dwdefaultvalue)

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName(hresource)?.let { COpaquePointer(it.toLong()) }

public actual fun resUtilGetFileTimeProperty(pftoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    0u

public actual fun resUtilGetLongProperty(ploutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetLongProperty(ploutvalue?.value?.toCPointer<ByteVar>(), pvaluestruct?.value?.toCPointer<ByteVar>(), loldvalue, lminimum, lmaximum, pppropertylist?.value?.toCPointer<ByteVar>(), pcbpropertylistsize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?, pvaluestruct: COpaquePointer?, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty(ppszoutvalue?.value?.toCPointer<ByteVar>(), pcboutvaluesize?.value?.toCPointer<ByteVar>(), pvaluestruct?.value?.toCPointer<ByteVar>(), pszoldvalue?.value?.toCPointer<ByteVar>(), cboldvaluesize, pppropertylist?.value?.toCPointer<ByteVar>(), pcbpropertylistsize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties(hkeyclusterkey?.value?.toCPointer<ByteVar>(), poutpropertylist?.value?.toCPointer<ByteVar>(), cboutpropertylistsize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetProperties(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), poutpropertylist?.value?.toCPointer<ByteVar>(), cboutpropertylistsize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutparams: COpaquePointer?, bcheckforrequiredproperties: Bool, psznameofpropinerror: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), poutparams?.value?.toCPointer<ByteVar>(), bcheckforrequiredproperties, psznameofpropinerror?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: COpaquePointer?, poutpropertyitem: COpaquePointer?, pcboutpropertyitemsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetProperty(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytableitem?.value?.toCPointer<ByteVar>(), poutpropertyitem?.value?.toCPointer<ByteVar>(), pcboutpropertyitemsize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetPropertyFormats(ppropertytable: COpaquePointer?, poutpropertyformatlist: COpaquePointer?, cbpropertyformatlistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats(ppropertytable?.value?.toCPointer<ByteVar>(), poutpropertyformatlist?.value?.toCPointer<ByteVar>(), cbpropertyformatlistsize, pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: COpaquePointer?, pcboutpropertylistsize: COpaquePointer?, pnpropertycount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetPropertySize(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytableitem?.value?.toCPointer<ByteVar>(), pcboutpropertylistsize?.value?.toCPointer<ByteVar>(), pnpropertycount?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: COpaquePointer?, qwdefaultvalue: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetQwordValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), pqwoutvalue?.value?.toCPointer<ByteVar>(), qwdefaultvalue)

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency(hself?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: COpaquePointer?, brecurse: Bool): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass(hcluster, hself?.value?.toCPointer<ByteVar>(), prci?.value?.toCPointer<ByteVar>(), brecurse)

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: COpaquePointer?, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx(hcluster, hself?.value?.toCPointer<ByteVar>(), prci?.value?.toCPointer<ByteVar>(), brecurse, dwdesiredaccess)

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName(hcluster, hself?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>(), brecurse)

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx(hcluster, hself?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>(), brecurse, dwdesiredaccess)

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx(hself?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: COpaquePointer?, pszsubnetmask: Pwstr, pcchsubnetmask: COpaquePointer?, psznetwork: Pwstr, pcchnetwork: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps(hresource, pszaddress?.value?.toCPointer<ByteVar>(), pcchaddress?.value?.toCPointer<ByteVar>(), pszsubnetmask?.value?.toCPointer<ByteVar>(), pcchsubnetmask?.value?.toCPointer<ByteVar>(), psznetwork?.value?.toCPointer<ByteVar>(), pcchnetwork?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceName(hresource, pszresourcename?.value?.toCPointer<ByteVar>(), pcchresourcenameinout?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency(lpszresourcename?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx(lpszresourcename?.value?.toCPointer<ByteVar>(), lpszresourcetype?.value?.toCPointer<ByteVar>(), dwdesiredaccess)

public actual fun resUtilGetSzProperty(ppszoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, pszoldvalue: Pcwstr, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetSzProperty(ppszoutvalue?.value?.toCPointer<ByteVar>(), pvaluestruct?.value?.toCPointer<ByteVar>(), pszoldvalue?.value?.toCPointer<ByteVar>(), pppropertylist?.value?.toCPointer<ByteVar>(), pcbpropertylistsize?.value?.toCPointer<ByteVar>())

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGetSzValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilGroupsEqual(hself, hgroup, pequal?.value?.toCPointer<ByteVar>())

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilIsPathValid(pszpath?.value?.toCPointer<ByteVar>())

public actual fun resUtilIsResourceClassEqual(prci: COpaquePointer?, hresource: Hresource): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual(prci?.value?.toCPointer<ByteVar>(), hresource)

public actual fun resUtilLeftPaxosIsLessThanRight(left: COpaquePointer?, right: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight(left?.value?.toCPointer<ByteVar>(), right?.value?.toCPointer<ByteVar>())

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilNodeEnum(hcluster, 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>())

public actual fun resUtilPaxosComparer(left: COpaquePointer?, right: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilPaxosComparer(left?.value?.toCPointer<ByteVar>(), right?.value?.toCPointer<ByteVar>())

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, pcboutpropertylistsize: COpaquePointer?, pinparams: COpaquePointer?, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock(ppropertytable?.value?.toCPointer<ByteVar>(), poutpropertylist?.value?.toCPointer<ByteVar>(), pcboutpropertylistsize?.value?.toCPointer<ByteVar>(), pinparams?.value?.toCPointer<ByteVar>(), pcbbytesreturned?.value?.toCPointer<ByteVar>(), pcbrequired?.value?.toCPointer<ByteVar>())

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment(pszservicename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hresourcehandle)

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum(hself, enumtype, 0L.toCPointer<ByteVar>(), pparameter?.value?.toCPointer<ByteVar>())

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual(lpszresourcetypename?.value?.toCPointer<ByteVar>(), hresource)

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilResourcesEqual(hself, hresource)

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: COpaquePointer?, cbnewvaluesize: UInt, ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), pbnewvalue?.value?.toCPointer<ByteVar>(), cbnewvaluesize, ppboutvalue?.value?.toCPointer<ByteVar>(), pcboutvaluesize?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetDwordValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), dwnewvalue, pdwoutvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), psznewvalue?.value?.toCPointer<ByteVar>(), ppszoutstring?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), psznewvalue?.value?.toCPointer<ByteVar>(), cbnewvaluesize, ppszoutvalue?.value?.toCPointer<ByteVar>(), pcboutvaluesize?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize)

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, pinparams: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), pinparams?.value?.toCPointer<ByteVar>(), pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize, poutparams?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, pinparams: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), pinparams?.value?.toCPointer<ByteVar>(), pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize, bforcewrite, poutparams?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), ballowunknownproperties, pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize, poutparams?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), ballowunknownproperties, pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize, bforcewrite, poutparams?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetQwordValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), qwnewvalue, pqwoutvalue?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment(pszservicename?.value?.toCPointer<ByteVar>(), hresource, 0L.toCPointer<ByteVar>(), hresourcehandle)

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: COpaquePointer?, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters(pszservicename?.value?.toCPointer<ByteVar>(), schscmhandle?.value?.toCPointer<ByteVar>(), phservice?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hresourcehandle)

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: COpaquePointer?, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx(pszservicename?.value?.toCPointer<ByteVar>(), schscmhandle?.value?.toCPointer<ByteVar>(), phservice?.value?.toCPointer<ByteVar>(), dwdesiredaccess, 0L.toCPointer<ByteVar>(), hresourcehandle)

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetSzValue(hkeyclusterkey?.value?.toCPointer<ByteVar>(), pszvaluename?.value?.toCPointer<ByteVar>(), psznewvalue?.value?.toCPointer<ByteVar>(), ppszoutstring?.value?.toCPointer<ByteVar>())

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties(hkeyclusterkey?.value?.toCPointer<ByteVar>(), ppropertytable?.value?.toCPointer<ByteVar>(), pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize)

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuesize: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilSetValueEx(hkeyclusterkey?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), valuetype, valuedata?.value?.toCPointer<ByteVar>(), valuesize, flags)

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilStartResourceService(pszservicename?.value?.toCPointer<ByteVar>(), phservicehandle?.value?.toCPointer<ByteVar>())

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilStopResourceService(pszservicename?.value?.toCPointer<ByteVar>())

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilStopService(hservicehandle?.value?.toCPointer<ByteVar>())

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: COpaquePointer?, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll(dwservicepid, boffline, pdwresourcestate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hresourcehandle)

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList(pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize)

public actual fun resUtilVerifyPropertyTable(ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable(ppropertytable?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>(), ballowunknownproperties, pinpropertylist?.value?.toCPointer<ByteVar>(), cbinpropertylistsize, poutparams?.value?.toCPointer<ByteVar>())

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService(pszservicename?.value?.toCPointer<ByteVar>())

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilVerifyService(hservicehandle?.value?.toCPointer<ByteVar>())

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe(flags, reason, presult?.value?.toCPointer<ByteVar>())

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree(key?.value?.toCPointer<ByteVar>(), keyname?.value?.toCPointer<ByteVar>(), treatnokeyaserror)

public actual fun resetAllAppInstanceVersions(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions()

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_restartClusterResource(hresource, dwflags)

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_restartClusterResourceEx(hresource, dwflags, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_restoreClusterDatabase(lpszpathname?.value?.toCPointer<ByteVar>(), bforce, lpszquorumdriveletter?.value?.toCPointer<ByteVar>())

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resumeClusterNode(hnode)

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resumeClusterNodeEx(hnode, eresumefailbacktype, dwresumeflagsreserved)

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2(hnode, eresumefailbacktype, dwresumeflagsreserved, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags(processhandle?.value?.toCPointer<ByteVar>(), mask, flags)

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterGroupName(hgroup, lpszgroupname?.value?.toCPointer<ByteVar>())

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterGroupNameEx(hgroup, lpszgroupname?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterGroupNodeList(hgroup, nodecount, nodelist?.value?.toCPointer<ByteVar>())

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: COpaquePointer?, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx(hgroup, nodecount, nodelist?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression(hgroupset, lpszdependencyexprssion?.value?.toCPointer<ByteVar>())

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx(hgroupset, lpszdependencyexpression?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterName(hcluster, lpsznewclustername?.value?.toCPointer<ByteVar>())

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterNameEx(hcluster, lpsznewclustername?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterNetworkName(hnetwork, lpszname?.value?.toCPointer<ByteVar>())

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx(hnetwork, lpszname?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder(hcluster, networkcount, networklist?.value?.toCPointer<ByteVar>())

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterQuorumResource(hresource, lpszdevicename?.value?.toCPointer<ByteVar>(), dwmaxquologsize)

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx(hresource, lpszdevicename?.value?.toCPointer<ByteVar>(), dwmaxquorumlogsize, lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression(hresource, lpszdependencyexpression?.value?.toCPointer<ByteVar>())

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterResourceName(hresource, lpszresourcename?.value?.toCPointer<ByteVar>())

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterResourceNameEx(hresource, lpszresourcename?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: COpaquePointer?, lpcbreturnstatusbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword(lpszclustername?.value?.toCPointer<ByteVar>(), lpsznewpassword?.value?.toCPointer<ByteVar>(), dwflags, lpreturnstatusbuffer?.value?.toCPointer<ByteVar>(), lpcbreturnstatusbuffersize?.value?.toCPointer<ByteVar>())

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setGroupDependencyExpression(hgroup, lpszdependencyexpression?.value?.toCPointer<ByteVar>())

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.clustering.cinterop.windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx(hgroup, lpszdependencyexpression?.value?.toCPointer<ByteVar>(), lpszreason?.value?.toCPointer<ByteVar>())
