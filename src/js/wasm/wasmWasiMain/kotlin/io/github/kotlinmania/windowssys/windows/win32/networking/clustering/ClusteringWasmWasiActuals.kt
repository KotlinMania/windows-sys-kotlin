@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(hdependentgroup: Long, hprovidergroup: Long): Int

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(hdependentgroup, hprovidergroup).toUInt()

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(hdependentgroupset: Long, hprovidergroupset: Long): Int

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(hdependentgroupset, hprovidergroupset).toUInt()

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(hdependentgroup: Long, hprovidergroupset: Long): Int

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(hdependentgroup, hprovidergroupset).toUInt()

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx")

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterNode")

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(hresource: Long, hdependson: Long): Int

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(hresource: Long, hnode: Long): Int

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(hresource, hnode).toUInt()

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx")

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode")

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(hresource: Long): Int

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(hresource).toUInt()

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(hresource: Long, hresourcedependent: Long): Int

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(hresource, hresourcedependent)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(hgroup: Long, dwcancelflagsReserved: Int): Int

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(hgroup, dwcancelflagsReserved.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(hresource: Long, hgroup: Long): Int

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(hresource, hgroup).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(hresource: Long, hgroup: Long, flags: Long): Int

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(hresource, hgroup, flags.toLong()).toUInt()

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseCluster")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseCluster(hcluster: Long): Int

public actual fun closeCluster(hcluster: Hcluster): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseCluster(hcluster)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(hcluscryptprovider: Long): Int

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(hcluscryptprovider).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterGroup(hgroup: Long): Int

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterGroup(hgroup)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(hgroupset: Long): Int

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(hgroupset)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(hnetinterface: Long): Int

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(hnetinterface)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(hnetwork: Long): Int

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(hnetwork)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNode(hnode: Long): Int

public actual fun closeClusterNode(hnode: Hnode): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNode(hnode)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(hchange: Long): Int

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(hchange)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCloseClusterResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterResource(hresource: Long): Int

public actual fun closeClusterResource(hresource: Hresource): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringCloseClusterResource(hresource)

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: ConstPtr, param2: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault")

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: MutPtr, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults")

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault")

public actual fun clusWorkerCheckTerminate(lpworker: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate")

public actual fun clusWorkerCreate(lpworker: MutPtr, lpstartaddress: PworkerStartRoutine, lpparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusWorkerCreate")

public actual fun clusWorkerTerminate(lpworker: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate")

public actual fun clusWorkerTerminateEx(clusworker: MutPtr, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx")

public actual fun clusWorkersTerminate(clusworkers: MutPtr, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate")

public actual fun clusapiSetReasonHandler(lphandler: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler")

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(hgroupset: Long, hgroup: Long): Int

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(hgroupset, hgroup).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int): Int

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt()).toUInt()

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx")

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl")

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterCloseEnum(henum: Long): Int

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterCloseEnum(henum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(hclusterenum: Long): Int

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(hclusterenum).toUInt()

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterControl")

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterControlEx")

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule")

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: ConstPtr, cbcryptinput: UInt, ppcryptoutput: MutPtr, pcbcryptoutput: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterDecrypt")

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: ConstPtr, cbdata: UInt, ppdata: MutPtr, pcbdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterEncrypt")

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterEnum")

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterEnumEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(henum: Long): Int

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(henum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(hclusterenum: Long): Int

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(hclusterenum).toUInt()

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint")

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(hgroupenum: Long): Int

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(hgroupenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(hgroupenumex: Long): Int

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(hgroupenumex).toUInt()

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupControl")

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx")

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: MutPtr, lpszresourcename: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupEnum")

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(hgroupenum: Long): Int

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(hgroupenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(hgroupenumex: Long): Int

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(hgroupenumex).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(hgroup: Long, dwtype: Int): Long

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(hgroup, dwtype.toInt())

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(hgroupsetenum: Long): Int

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(hgroupsetenum).toUInt()

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl")

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx")

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(hgroupsetenum: Long): Int

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(hgroupsetenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(hcluster: Long): Long

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(hcluster)

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(hnetinterfaceenum: Long): Int

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(hnetinterfaceenum).toUInt()

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl")

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx")

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum")

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(hnetworkenum: Long): Int

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(hnetworkenum).toUInt()

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetworkControl")

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx")

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(hnetworkenum: Long): Int

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(hnetworkenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(hnetwork: Long, dwtype: Int): Long

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(hnetwork, dwtype.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(hnodeenum: Long): Int

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(hnodeenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(hnodeenum: Long): Int

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(hnodeenum).toUInt()

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNodeControl")

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx")

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNodeEnum")

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(hnodeenum: Long): Int

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(hnodeenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(hnodeenum: Long): Int

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(hnodeenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(hnode: Long, dwtype: Int): Long

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(hnode, dwtype.toInt())

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: ConstPtr): Hnodeenumex =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx")

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterOpenEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterOpenEnum(hcluster: Long, dwtype: Int): Long

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterOpenEnum(hcluster, dwtype.toInt())

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: ConstPtr): Hclusenumex =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx")

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: MutPtr, lpszvolumename: Pwstr, lpcchvolumename: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup")

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: ConstPtr, cbdata: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(hbatchnotification: Long): Int

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(hbatchnotification)

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand")

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch")

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(hbatchnotifyport: Long): Int

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(hbatchnotifyport)

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey")

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch")

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(hregreadbatchreply: Long): Int

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(hregreadbatchreply)

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch")

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort")

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey")

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, lpszreason: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx")

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch")

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey")

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx")

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue")

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx")

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr, lpftlastwritetime: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey")

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: MutPtr, lpdwtype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue")

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification")

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity")

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey")

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: ConstPtr, lpcchmaxsubkeylen: ConstPtr, lpcvalues: ConstPtr, lpcchmaxvaluenamelen: ConstPtr, lpcbmaxvaluelen: ConstPtr, lpcbsecuritydescriptor: ConstPtr, lpftlastwritetime: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey")

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue")

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand")

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand")

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity")

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx")

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegSetValue")

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(hcluster: Long, flags: Int): Int

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(hcluster, flags.toInt())

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule")

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(hgroup: Long): Int

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(hgroup).toUInt()

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(hresenum: Long): Int

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(hresenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(hresourceenumex: Long): Int

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(hresourceenumex).toUInt()

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceControl")

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser")

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx")

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx")

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceEnum")

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(hresenum: Long): Int

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(hresenum).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(hresourceenumex: Long): Int

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(hresourceenumex).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(hresource: Long, dwtype: Int): Long

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(hresource, dwtype.toInt())

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(hrestypeenum: Long): Int

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(hrestypeenum).toUInt()

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl")

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser")

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx")

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx")

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(hrestypeenum: Long): Int

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(hrestypeenum).toUInt()

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum")

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess")

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterSharedVolumeSetSnapshotState")

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel")

public actual fun createCluster(pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hcluster =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateCluster")

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: ConstPtr): Hgroupset =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet")

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterGroup")

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: ConstPtr): Hgroup =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx")

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet")

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(hchange: Long, hcluster: Long, dwfilter: Int, dwnotifykey: Long): Long

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    wasiWindowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(hchange, hcluster, dwfilter.toInt(), dwnotifykey.toLong())

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: ConstPtr, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2")

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterResource")

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx")

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType")

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(hgroup: Long): Int

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(hgroup).toUInt()

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(hgroupset: Long): Int

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(hgroupset).toUInt()

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringDeleteClusterResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringDeleteClusterResource(hresource: Long): Int

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringDeleteClusterResource(hresource).toUInt()

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx")

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType")

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx")

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, fdeletevirtualcomputerobjects: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDestroyCluster")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(hgroup: Long): Int

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(hgroup).toUInt()

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx")

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster")

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcnorestype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist")

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster")

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcloudtype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringEvictClusterNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringEvictClusterNode(hnode: Long): Int

public actual fun evictClusterNode(hnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringEvictClusterNode(hnode).toUInt()

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx")

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringFailClusterResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringFailClusterResource(hresource: Long): Int

public actual fun failClusterResource(hresource: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringFailClusterResource(hresource).toUInt()

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx")

public actual fun freeClusterCrypt(pcryptinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt")

public actual fun freeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault")

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(hgroup: Long): Long

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(hgroup)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(hnetinterface: Long): Long

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(hnetinterface)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(hnetwork: Long): Long

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(hnetwork)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterFromNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromNode(hnode: Long): Long

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromNode(hnode)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterFromResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromResource(hresource: Long): Long

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterFromResource(hresource)

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey")

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: MutPtr): ClusterGroupState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterGroupState")

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: MutPtr, lpclusterinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterInformation")

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterKey")

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface")

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(hnetinterface: Long): Int

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(hnetinterface)

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId")

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(hnetwork: Long): Int

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(hnetwork)

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNodeId")

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringGetClusterNodeState")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringGetClusterNodeState(hnode: Long): Int

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    wasiWindowssysWindowsWin32NetworkingClusteringGetClusterNodeState(hnode)

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: MutPtr, lpdwfiltertype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, dwmilliseconds: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNotify")

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: MutPtr, pfilterandtype: MutPtr, buffer: MutPtr, lpbbuffersize: MutPtr, lpszobjectid: Pwstr, lpcchobjectid: MutPtr, lpszparentid: Pwstr, lpcchparentid: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, lpsztype: Pwstr, lpcchtype: MutPtr, dwmilliseconds: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2")

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: MutPtr, lpszdevicename: Pwstr, lpcchdevicename: MutPtr, lpdwmaxquorumlogsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource")

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression")

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey")

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName")

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: MutPtr, lpszgroupname: Pwstr, lpcchgroupname: MutPtr): ClusterResourceState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterResourceState")

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey")

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW")

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetNodeClusterState")

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle")

public actual fun initializeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault")

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray")

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringMoveClusterGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringMoveClusterGroup(hgroup: Long, hdestinationnode: Long): Int

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringMoveClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx")

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(hgroup: Long): Int

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(hgroup).toUInt()

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx")

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringOfflineClusterResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringOfflineClusterResource(hresource: Long): Int

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringOfflineClusterResource(hresource).toUInt()

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx")

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(hgroup: Long, hdestinationnode: Long): Int

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx")

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringOnlineClusterResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringOnlineClusterResource(hresource: Long): Int

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringOnlineClusterResource(hresource).toUInt()

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx")

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2")

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenCluster")

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider")

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx")

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: MutPtr): Hcluster =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterEx")

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterGroup")

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hgroup =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx")

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet")

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface")

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetinterface =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx")

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork")

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetwork =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx")

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterNode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(hcluster: Long, nodeid: Int): Long

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    wasiWindowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(hcluster, nodeid.toInt())

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx")

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterResource")

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringPauseClusterNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringPauseClusterNode(hnode: Long): Int

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringPauseClusterNode(hnode).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long): Int

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget).toUInt()

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2")

public actual fun queryAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: MutPtr, instanceversionlow: MutPtr, versionstatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion")

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: ConstPtr, childreninheritappinstance: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRegisterAppInstance")

public actual fun registerAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion")

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify")

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRegisterClusterNotifyV2")

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(hgroup: Long, hdependson: Long): Int

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(hgroup, hdependson).toUInt()

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(hgroupset: Long, hdependson: Long): Int

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(hgroupset, hdependson).toUInt()

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(hgroup: Long, hdependson: Long): Int

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(hgroup, hdependson).toUInt()

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(hcluster: Long, bdeletecomputerobjects: Int): Int

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(hcluster, bdeletecomputerobjects).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(hresource: Long, hdependson: Long): Int

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(hresource: Long, hnode: Long): Int

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(hresource, hnode).toUInt()

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx")

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode")

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(hresource: Long): Int

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(hresource).toUInt()

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties")

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree")

public actual fun resUtilDupGroup(group: Hgroup, copy: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilDupGroup")

public actual fun resUtilDupParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock")

public actual fun resUtilDupResource(group: Hresource, copy: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilDupResource")

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilDupString")

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups")

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx")

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties")

public actual fun resUtilEnumProperties(ppropertytable: ConstPtr, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties")

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumResources")

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx")

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr, dwdesiredaccess: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2")

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings")

public actual fun resUtilFindBinaryProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty")

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter")

public actual fun resUtilFindDwordProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty")

public actual fun resUtilFindExpandSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty")

public actual fun resUtilFindExpandedSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty")

public actual fun resUtilFindFileTimeProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty")

public actual fun resUtilFindLongProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty")

public actual fun resUtilFindMultiSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty")

public actual fun resUtilFindSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty")

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty")

public actual fun resUtilFreeEnvironment(lpenvironment: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment")

public actual fun resUtilFreeParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock")

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties")

public actual fun resUtilGetBinaryProperty(ppboutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pboldvalue: ConstPtr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty")

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue")

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType")

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(hcluster: Long, eclusterrole: Int): Int

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    wasiWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(hcluster, eclusterrole)

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: MutPtr, phclusteripaddressresource: MutPtr, phclusterquorumresource: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources")

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: MutPtr, phclusterquorumresourceout: MutPtr, dwdesiredaccess: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(hcluster: Long): Long

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    wasiWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(hcluster)

public actual fun resUtilGetDwordProperty(pdwoutvalue: MutPtr, pvaluestruct: ConstPtr, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty")

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: MutPtr, dwdefaultvalue: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue")

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName")

public actual fun resUtilGetFileTimeProperty(pftoutvalue: MutPtr, pvaluestruct: ConstPtr, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetFileTimeProperty")

public actual fun resUtilGetLongProperty(ploutvalue: MutPtr, pvaluestruct: ConstPtr, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty")

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty")

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties")

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetProperties")

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutparams: MutPtr, bcheckforrequiredproperties: Bool, psznameofpropinerror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock")

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, poutpropertyitem: MutPtr, pcboutpropertyitemsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetProperty")

public actual fun resUtilGetPropertyFormats(ppropertytable: ConstPtr, poutpropertyformatlist: MutPtr, cbpropertyformatlistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats")

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, pcboutpropertylistsize: MutPtr, pnpropertycount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize")

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: MutPtr, qwdefaultvalue: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue")

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency")

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass")

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx")

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName")

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx")

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx")

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: MutPtr, pszsubnetmask: Pwstr, pcchsubnetmask: MutPtr, psznetwork: Pwstr, pcchnetwork: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps")

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName")

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency")

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx")

public actual fun resUtilGetSzProperty(ppszoutvalue: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty")

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue")

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual")

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid")

public actual fun resUtilIsResourceClassEqual(prci: MutPtr, hresource: Hresource): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual")

public actual fun resUtilLeftPaxosIsLessThanRight(left: ConstPtr, right: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight")

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum")

public actual fun resUtilPaxosComparer(left: ConstPtr, right: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer")

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: MutPtr, pinparams: ConstPtr, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock")

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment")

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum")

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(hself: Long, hresource: Long): Int

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    wasiWindowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(hself, hresource)

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: ConstPtr, cbnewvaluesize: UInt, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue")

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue")

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue")

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue")

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList")

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock")

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx")

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable")

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx")

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue")

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment")

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters")

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx")

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue")

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties")

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuesize: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx")

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService")

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService")

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilStopService")

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll")

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList")

public actual fun resUtilVerifyPropertyTable(ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable")

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService")

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilVerifyService")

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe")

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions(): Int

public actual fun resetAllAppInstanceVersions(): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringRestartClusterResource")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringRestartClusterResource(hresource: Long, dwflags: Int): Int

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringRestartClusterResource(hresource, dwflags.toInt()).toUInt()

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx")

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringResumeClusterNode")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringResumeClusterNode(hnode: Long): Int

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringResumeClusterNode(hnode).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx")
private external fun wasiWindowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int): Int

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt()).toUInt()

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2")

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags")

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterGroupName")

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx")

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList")

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx")

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression")

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx")

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterName")

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterNameEx")

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName")

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx")

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder")

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource")

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx")

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression")

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterResourceName")

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx")

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: MutPtr, lpcbreturnstatusbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword")

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression")

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx")
