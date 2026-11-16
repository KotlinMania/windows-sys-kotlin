@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32NetworkingClusteringNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(hdependentgroup.toString(), hprovidergroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx(hdependentgroup.toString(), hprovidergroup.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(hdependentgroupset.toString(), hprovidergroupset.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx(hdependentgroupset.toString(), hprovidergroupset.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(hdependentgroup.toString(), hprovidergroupset.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx(hdependentgroup.toString(), hprovidergroupset.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterNode(hcluster.toString(), lpsznodename.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx(hcluster.toString(), lpsznodename.rawAddress.toString(), dwflags.toInt(), 0L.toString(), pvcallbackarg.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(hresource.toString(), hdependson.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(hresource.toString(), hnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx(hresource.toString(), hnode.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode(hcluster.toString(), lpsznodename.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString(), lpszclusterstoragenodedescription.rawAddress.toString(), lpszclusterstoragenodelocation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency(hdependentgroupset.toString(), lpremoteclustername.rawAddress.toString(), lpremotegroupsetname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(hresource.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase(hcluster.toString(), lpszpathname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(hresource.toString(), hresourcedependent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(hgroup.toString(), dwcancelflagsReserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(hresource.toString(), hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(hresource.toString(), hgroup.toString(), flags.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2(hresource.toString(), hgroup.toString(), flags.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeCluster(hcluster: Hcluster): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseCluster(hcluster.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(hcluscryptprovider.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterGroup(hgroup.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(hgroupset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(hnetinterface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(hnetwork.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNode(hnode: Hnode): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterNode(hnode.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(hchange.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterResource(hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCloseClusterResource(hresource.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: ConstPtr, param2: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault(hcluster.toString(), failure.rawAddress.toString(), param2.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: MutPtr, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults(hcluster.toString(), objects.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault(hcluster.toString(), id.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerCheckTerminate(lpworker: MutPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate(lpworker.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerCreate(lpworker: MutPtr, lpstartaddress: PworkerStartRoutine, lpparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusWorkerCreate(lpworker.rawAddress.toString(), 0L.toString(), lpparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerTerminate(lpworker: ConstPtr) {
    if (windowsWin32NetworkingClusteringNapiAddon != null) {
        windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate(lpworker.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clusWorkerTerminateEx(clusworker: MutPtr, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx(clusworker.rawAddress.toString(), timeoutinmilliseconds.toInt(), waitonly) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkersTerminate(clusworkers: MutPtr, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate(clusworkers.rawAddress.toString(), clusworkerscount.toString(), timeoutinmilliseconds.toInt(), waitonly) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusapiSetReasonHandler(lphandler: ConstPtr): MutPtr =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler(lphandler.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule(hcluster.toString(), rulename.rawAddress.toString(), hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(hgroupset.toString(), hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl(hcluster.toString(), affinityrulename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume(lpszvolumepathname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterCloseEnum(henum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(hclusterenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterControl(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterControlEx(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule(hcluster.toString(), rulename.rawAddress.toString(), ruletype) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: ConstPtr, cbcryptinput: UInt, ppcryptoutput: MutPtr, pcbcryptoutput: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterDecrypt(hcluscryptprovider.toString(), pcryptinput.rawAddress.toString(), cbcryptinput.toInt(), ppcryptoutput.rawAddress.toString(), pcbcryptoutput.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: ConstPtr, cbdata: UInt, ppdata: MutPtr, pcbdata: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterEncrypt(hcluscryptprovider.toString(), pdata.rawAddress.toString(), cbdata.toInt(), ppdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterEnum(henum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterEnumEx(hclusterenum.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(henum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(hclusterenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(hgroupenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(hgroupenumex.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupControl(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: MutPtr, lpszresourcename: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupEnum(hgroupenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszresourcename.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx(hgroupenumex.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(hgroupenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(hgroupenumex.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(hgroup.toString(), dwtype.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx(hcluster.toString(), lpszproperties.rawAddress.toString(), cbproperties.toInt(), lpszroproperties.rawAddress.toString(), cbroproperties.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(hgroupsetenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum(hgroupsetenum.toString(), dwindex.toInt(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(hgroupsetenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(hcluster.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume(lpszpathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(hnetinterfaceenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum(hnetinterfaceenum.toString(), dwindex.toInt(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum(hcluster.toString(), lpsznodename.rawAddress.toString(), lpsznetworkname.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(hnetworkenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetworkControl(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum(hnetworkenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(hnetworkenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(hnetwork.toString(), dwtype.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(hnodeenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(hnodeenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeControl(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeEnum(hnodeenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx(hnodeenum.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(hnodeenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(hnodeenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(hnode.toString(), dwtype.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: ConstPtr): Hnodeenumex =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx(hnode.toString(), dwtype.toInt(), poptions.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement(hcluster.toString(), lpsznodenamecurrent.rawAddress.toString(), lpsznodenamenew.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterOpenEnum(hcluster.toString(), dwtype.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: ConstPtr): Hclusenumex =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx(hcluster.toString(), dwtype.toInt(), poptions.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: MutPtr, lpszvolumename: Pwstr, lpcchvolumename: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), lpcchvolumepathname.rawAddress.toString(), lpszvolumename.rawAddress.toString(), lpcchvolumename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: ConstPtr, cbdata: UInt): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand(hregbatch.toString(), dwcommand, wzname.rawAddress.toString(), dwoptions.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(hbatchnotification.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand(hbatchnotification.toString(), pbatchcommand.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch(hregbatch.toString(), bcommit, failedcommandnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx(hregbatch.toString(), flags.toInt(), failedcommandnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(hbatchnotifyport.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey(hkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch(hregreadbatch.toString(), phregreadbatchreply.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx(hregreadbatch.toString(), flags.toInt(), phregreadbatchreply.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(hregreadbatchreply.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch(hkey.rawAddress.toString(), phregbatch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort(hkey.rawAddress.toString(), phbatchnotifyport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey(hkey.rawAddress.toString(), lpszsubkey.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, lpszreason: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch(hkey.rawAddress.toString(), phregreadbatch.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey(hkey.rawAddress.toString(), lpszsubkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr, lpftlastwritetime: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey(hkey.rawAddress.toString(), dwindex.toInt(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: MutPtr, lpdwtype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue(hkey.rawAddress.toString(), dwindex.toInt(), lpszvaluename.rawAddress.toString(), lpcchvaluename.rawAddress.toString(), lpdwtype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification(hbatchnotify.toString(), phbatchnotification.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity(hkey.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey(hkey.rawAddress.toString(), lpszsubkey.rawAddress.toString(), samdesired.toInt(), phkresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: ConstPtr, lpcchmaxsubkeylen: ConstPtr, lpcvalues: ConstPtr, lpcchmaxvaluenamelen: ConstPtr, lpcbmaxvaluelen: ConstPtr, lpcbsecuritydescriptor: ConstPtr, lpftlastwritetime: ConstPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey(hkey.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcchmaxsubkeylen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcchmaxvaluenamelen.rawAddress.toString(), lpcbmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), lpdwvaluetype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand(hregreadbatch.toString(), wzsubkeyname.rawAddress.toString(), wzvaluename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand(hregreadbatchreply.toString(), pbatchcommand.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegSetValue(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(hcluster.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule(hcluster.toString(), rulename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule(hcluster.toString(), rulename.rawAddress.toString(), hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx(hgroup.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(hresenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(hresourceenumex.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceControl(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceEnum(hresenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx(hresourceenumex.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(hresenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(hresourceenumex.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(hresource.toString(), dwtype.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx(hcluster.toString(), lpszproperties.rawAddress.toString(), cbproperties.toInt(), lpszroproperties.rawAddress.toString(), cbroproperties.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(hrestypeenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum(hrestypeenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(hrestypeenum.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), dwtype.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess(hcluster.toString(), szaccountsid.rawAddress.toString(), dwaccess.toInt(), dwcontroltype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel(hcluster.toString(), perform, 0L.toString(), pvcallbackarg.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCluster(pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateCluster(pconfig.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: ConstPtr): Hgroupset =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet(hcluster.toString(), lpavailabilitysetname.rawAddress.toString(), pavailabilitysetconfig.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterGroup(hcluster.toString(), lpszgroupname.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: ConstPtr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx(hcluster.toString(), lpszgroupname.rawAddress.toString(), pgroupinfo.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet(hcluster.toString(), groupsetname.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount(hcluster.toString(), pconfig.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(hchange.toString(), hcluster.toString(), dwfilter.toInt(), dwnotifykey.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: ConstPtr, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2(hchange.toString(), hcluster.toString(), filters.rawAddress.toString(), dwfiltercount.toInt(), dwnotifykey.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterResource(hgroup.toString(), lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx(hgroup.toString(), lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwflags.toInt(), lpszreason.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), lpszdisplayname.rawAddress.toString(), lpszresourcetypedll.rawAddress.toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), lpszdisplayname.rawAddress.toString(), lpszresourcetypedll.rawAddress.toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx(hgroup.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(hgroupset.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx(hgroupset.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterResource(hresource.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx(hresource.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType(hcluster.toString(), lpszresourcetypename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx(hcluster.toString(), lpsztypename.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, fdeletevirtualcomputerobjects: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDestroyCluster(hcluster.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString(), fdeletevirtualcomputerobjects) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx(hgroup.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster(hcluster.toString(), pcnorestype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcnorestype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist(cnodes.toInt(), ppsznodenames.rawAddress.toString(), pcnorestype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster(hcluster.toString(), pcloudtype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcloudtype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist(cnodes.toInt(), ppsznodenames.rawAddress.toString(), pcloudtype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNode(hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringEvictClusterNode(hnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx(hnode.toString(), dwtimeout.toInt(), phrcleanupstatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2(hnode.toString(), dwtimeout.toInt(), phrcleanupstatus.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun failClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringFailClusterResource(hresource.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx(hresource.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterCrypt(pcryptinfo: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt(pcryptinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault(clusterhealthfault.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray(clusterhealthfaultarray.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(hgroup.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(hnetinterface.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(hnetwork.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterFromNode(hnode.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterFromResource(hresource.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey(hgroup.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: MutPtr): ClusterGroupState =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterGroupState(hgroup.toString(), lpsznodename.rawAddress.toString(), lpcchnodename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: MutPtr, lpclusterinfo: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterInformation(hcluster.toString(), lpszclustername.rawAddress.toString(), lpcchclustername.rawAddress.toString(), lpclusterinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterKey(hcluster.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface(hcluster.toString(), lpsznodename.rawAddress.toString(), lpsznetworkname.rawAddress.toString(), lpszinterfacename.rawAddress.toString(), lpcchinterfacename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey(hnetinterface.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(hnetinterface.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId(hnetwork.toString(), lpsznetworkid.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey(hnetwork.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(hnetwork.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNodeId(hnode.toString(), lpsznodeid.rawAddress.toString(), lpcchname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey(hnode.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNodeState(hnode.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: MutPtr, lpdwfiltertype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, dwmilliseconds: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNotify(hchange.toString(), lpdwnotifykey.rawAddress.toString(), lpdwfiltertype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString(), dwmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: MutPtr, pfilterandtype: MutPtr, buffer: MutPtr, lpbbuffersize: MutPtr, lpszobjectid: Pwstr, lpcchobjectid: MutPtr, lpszparentid: Pwstr, lpcchparentid: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, lpsztype: Pwstr, lpcchtype: MutPtr, dwmilliseconds: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2(hchange.toString(), lpdwnotifykey.rawAddress.toString(), pfilterandtype.rawAddress.toString(), buffer.rawAddress.toString(), lpbbuffersize.rawAddress.toString(), lpszobjectid.rawAddress.toString(), lpcchobjectid.rawAddress.toString(), lpszparentid.rawAddress.toString(), lpcchparentid.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpsztype.rawAddress.toString(), lpcchtype.rawAddress.toString(), dwmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: MutPtr, lpszdevicename: Pwstr, lpcchdevicename: MutPtr, lpdwmaxquorumlogsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource(hcluster.toString(), lpszresourcename.rawAddress.toString(), lpcchresourcename.rawAddress.toString(), lpszdevicename.rawAddress.toString(), lpcchdevicename.rawAddress.toString(), lpdwmaxquorumlogsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression(hresource.toString(), lpszdependencyexpression.rawAddress.toString(), lpcchdependencyexpression.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey(hresource.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: MutPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName(hresource.toString(), lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: MutPtr, lpszgroupname: Pwstr, lpcchgroupname: MutPtr): ClusterResourceState =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterResourceState(hresource.toString(), lpsznodename.rawAddress.toString(), lpcchnodename.rawAddress.toString(), lpszgroupname.rawAddress.toString(), lpcchgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey(hcluster.toString(), lpsztypename.rawAddress.toString(), samdesired.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW(ppsznodename.rawAddress.toString(), nodecloudtype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetNodeClusterState(lpsznodename.rawAddress.toString(), pdwclusterstate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle(hchange.toString(), lphtargetevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault(clusterhealthfault.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray(clusterhealthfaultarray.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume(lpszpathname.rawAddress.toString(), pbfileisonsharedvolume.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringMoveClusterGroup(hgroup.toString(), hdestinationnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(hgroup.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx(hgroup.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2(hgroup.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOfflineClusterResource(hresource.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx(hresource.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2(hresource.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(hgroup.toString(), hdestinationnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOnlineClusterResource(hresource.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx(hresource.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2(hresource.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenCluster(lpszclustername.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider(lpszresource.rawAddress.toString(), lpszprovider.rawAddress.toString(), dwtype.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx(lpszresource.rawAddress.toString(), lpszkeyname.rawAddress.toString(), lpszprovider.rawAddress.toString(), dwtype.toInt(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: MutPtr): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterEx(lpszclustername.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterGroup(hcluster.toString(), lpszgroupname.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx(hcluster.toString(), lpszgroupname.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet(hcluster.toString(), lpszgroupsetname.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface(hcluster.toString(), lpszinterfacename.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetinterface =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx(hcluster.toString(), lpszinterfacename.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork(hcluster.toString(), lpsznetworkname.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetwork =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx(hcluster.toString(), lpsznetworkname.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNode(hcluster.toString(), lpsznodename.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(hcluster.toString(), nodeid.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx(hcluster.toString(), lpsznodename.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterResource(hcluster.toString(), lpszresourcename.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx(hcluster.toString(), lpszresourcename.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringPauseClusterNode(hnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: MutPtr, instanceversionlow: MutPtr, versionstatus: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion(appinstanceid.rawAddress.toString(), instanceversionhigh.rawAddress.toString(), instanceversionlow.rawAddress.toString(), versionstatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: ConstPtr, childreninheritappinstance: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRegisterAppInstance(processhandle.rawAddress.toString(), appinstanceid.rawAddress.toString(), childreninheritappinstance) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion(appinstanceid.rawAddress.toString(), instanceversionhigh.toString(), instanceversionlow.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify(hchange.toString(), dwfiltertype.toInt(), hobject.rawAddress.toString(), dwnotifykey.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2(hchange.toString(), hcluster.toString(), flags.toString(), restypename.rawAddress.toString(), dwnotifykey.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(hgroup.toString(), hdependson.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx(hgroup.toString(), hdependson.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(hgroupset.toString(), hdependson.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx(hgroupset.toString(), hdependson.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(hgroup.toString(), hdependson.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx(hgroup.toString(), hdependson.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(hcluster.toString(), bdeletecomputerobjects) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(hresource.toString(), hdependson.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(hresource.toString(), hnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx(hresource.toString(), hnode.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode(hcluster.toString(), lpszclusterstorageenclosurename.rawAddress.toString(), dwtimeout.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency(hdependentgroupset.toString(), lpremoteclustername.rawAddress.toString(), lpremotegroupsetname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(hresource.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), pcboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree(pszpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupGroup(group: Hgroup, copy: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilDupGroup(group.toString(), copy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock(poutparams.rawAddress.toString(), pinparams.rawAddress.toString(), ppropertytable.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupResource(group: Hresource, copy: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilDupResource(group.toString(), copy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilDupString(pszinstring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups(hcluster.toString(), hself.toString(), 0L.toString(), pparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx(hcluster.toString(), hself.toString(), grouptype, 0L.toString(), pparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties(hkeyclusterkey.rawAddress.toString(), pszoutproperties.rawAddress.toString(), cboutpropertiessize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumProperties(ppropertytable: ConstPtr, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties(ppropertytable.rawAddress.toString(), pszoutproperties.rawAddress.toString(), cboutpropertiessize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumResources(hself.toString(), lpszrestypename.rawAddress.toString(), 0L.toString(), pparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx(hcluster.toString(), hself.toString(), lpszrestypename.rawAddress.toString(), 0L.toString(), pparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr, dwdesiredaccess: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2(hcluster.toString(), hself.toString(), lpszrestypename.rawAddress.toString(), 0L.toString(), pparameter.rawAddress.toString(), dwdesiredaccess.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings(pszsrc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindBinaryProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pbpropertyvalue.rawAddress.toString(), pcbpropertyvaluesize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter(hcluster.toString(), hresource.toString(), pszdriveletter.rawAddress.toString(), pcchdriveletter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindDwordProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pdwpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindExpandSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindExpandedSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindFileTimeProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pftpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindLongProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), plpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindMultiSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString(), pcbpropertyvaluesize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), plpropertyvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFreeEnvironment(lpenvironment: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment(lpenvironment.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFreeParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr) {
    if (windowsWin32NetworkingClusteringNapiAddon != null) {
        windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock(poutparams.rawAddress.toString(), pinparams.rawAddress.toString(), ppropertytable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetBinaryProperty(ppboutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pboldvalue: ConstPtr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty(ppboutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString(), pvaluestruct.rawAddress.toString(), pboldvalue.rawAddress.toString(), cboldvaluesize.toInt(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), ppboutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType(hgroup.toString(), grouptype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId(hcluster.toString(), guid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(hcluster.toString(), eclusterrole) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: MutPtr, phclusteripaddressresource: MutPtr, phclusterquorumresource: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources(hcluster.toString(), phclusternameresource.rawAddress.toString(), phclusteripaddressresource.rawAddress.toString(), phclusterquorumresource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: MutPtr, phclusterquorumresourceout: MutPtr, dwdesiredaccess: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx(hclusterin.toString(), phclusternameresourceout.rawAddress.toString(), phclusterquorumresourceout.rawAddress.toString(), dwdesiredaccess.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(hcluster.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetDwordProperty(pdwoutvalue: MutPtr, pvaluestruct: ConstPtr, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty(pdwoutvalue.rawAddress.toString(), pvaluestruct.rawAddress.toString(), dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: MutPtr, dwdefaultvalue: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), pdwoutvalue.rawAddress.toString(), dwdefaultvalue.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): MutPtr =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName(hresource.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetFileTimeProperty(pftoutvalue: MutPtr, pvaluestruct: ConstPtr, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetLongProperty(ploutvalue: MutPtr, pvaluestruct: ConstPtr, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty(ploutvalue.rawAddress.toString(), pvaluestruct.rawAddress.toString(), loldvalue, lminimum, lmaximum, pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty(ppszoutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString(), pvaluestruct.rawAddress.toString(), pszoldvalue.rawAddress.toString(), cboldvaluesize.toInt(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties(hkeyclusterkey.rawAddress.toString(), poutpropertylist.rawAddress.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutparams: MutPtr, bcheckforrequiredproperties: Bool, psznameofpropinerror: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutparams.rawAddress.toString(), bcheckforrequiredproperties, psznameofpropinerror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, poutpropertyitem: MutPtr, pcboutpropertyitemsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetProperty(hkeyclusterkey.rawAddress.toString(), ppropertytableitem.rawAddress.toString(), poutpropertyitem.rawAddress.toString(), pcboutpropertyitemsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertyFormats(ppropertytable: ConstPtr, poutpropertyformatlist: MutPtr, cbpropertyformatlistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats(ppropertytable.rawAddress.toString(), poutpropertyformatlist.rawAddress.toString(), cbpropertyformatlistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, pcboutpropertylistsize: MutPtr, pnpropertycount: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize(hkeyclusterkey.rawAddress.toString(), ppropertytableitem.rawAddress.toString(), pcboutpropertylistsize.rawAddress.toString(), pnpropertycount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: MutPtr, qwdefaultvalue: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), pqwoutvalue.rawAddress.toString(), qwdefaultvalue.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency(hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass(hcluster.toString(), hself.rawAddress.toString(), prci.rawAddress.toString(), brecurse) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx(hcluster.toString(), hself.rawAddress.toString(), prci.rawAddress.toString(), brecurse, dwdesiredaccess.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName(hcluster.toString(), hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), brecurse) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx(hcluster.toString(), hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), brecurse, dwdesiredaccess.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx(hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwdesiredaccess.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: MutPtr, pszsubnetmask: Pwstr, pcchsubnetmask: MutPtr, psznetwork: Pwstr, pcchnetwork: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps(hresource.toString(), pszaddress.rawAddress.toString(), pcchaddress.rawAddress.toString(), pszsubnetmask.rawAddress.toString(), pcchsubnetmask.rawAddress.toString(), psznetwork.rawAddress.toString(), pcchnetwork.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName(hresource.toString(), pszresourcename.rawAddress.toString(), pcchresourcenameinout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency(lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx(lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwdesiredaccess.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetSzProperty(ppszoutvalue: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty(ppszoutvalue.rawAddress.toString(), pvaluestruct.rawAddress.toString(), pszoldvalue.rawAddress.toString(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    if (windowsWin32NetworkingClusteringNapiAddon != null) MutPtr((windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual(hself.toString(), hgroup.toString(), pequal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid(pszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilIsResourceClassEqual(prci: MutPtr, hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual(prci.rawAddress.toString(), hresource.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilLeftPaxosIsLessThanRight(left: ConstPtr, right: ConstPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight(left.rawAddress.toString(), right.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum(hcluster.toString(), 0L.toString(), pparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilPaxosComparer(left: ConstPtr, right: ConstPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer(left.rawAddress.toString(), right.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: MutPtr, pinparams: ConstPtr, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock(ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), pcboutpropertylistsize.rawAddress.toString(), pinparams.rawAddress.toString(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment(pszservicename.rawAddress.toString(), 0L.toString(), hresourcehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum(hself.toString(), enumtype.toInt(), 0L.toString(), pparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual(lpszresourcetypename.rawAddress.toString(), hresource.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(hself.toString(), hresource.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: ConstPtr, cbnewvaluesize: UInt, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), pbnewvalue.rawAddress.toString(), cbnewvaluesize.toInt(), ppboutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), dwnewvalue.toInt(), pdwoutvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), psznewvalue.rawAddress.toString(), ppszoutstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), psznewvalue.rawAddress.toString(), cbnewvaluesize.toInt(), ppszoutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList(hkeyclusterkey.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), pinparams.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), poutparams.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), pinparams.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), bforcewrite, poutparams.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), ballowunknownproperties, pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), poutparams.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), ballowunknownproperties, pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), bforcewrite, poutparams.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), qwnewvalue.toString(), pqwoutvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment(pszservicename.rawAddress.toString(), hresource.toString(), 0L.toString(), hresourcehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters(pszservicename.rawAddress.toString(), schscmhandle.rawAddress.toString(), phservice.rawAddress.toString(), 0L.toString(), hresourcehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx(pszservicename.rawAddress.toString(), schscmhandle.rawAddress.toString(), phservice.rawAddress.toString(), dwdesiredaccess.toInt(), 0L.toString(), hresourcehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), psznewvalue.rawAddress.toString(), ppszoutstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuesize: UInt, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx(hkeyclusterkey.rawAddress.toString(), valuename.rawAddress.toString(), valuetype.toInt(), valuedata.rawAddress.toString(), valuesize.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService(pszservicename.rawAddress.toString(), phservicehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService(pszservicename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilStopService(hservicehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, pdwresourcestate.rawAddress.toString(), 0L.toString(), hresourcehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList(pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyPropertyTable(ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable(ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), ballowunknownproperties, pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), poutparams.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService(pszservicename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilVerifyService(hservicehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), presult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree(key.rawAddress.toString(), keyname.rawAddress.toString(), treatnokeyaserror) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetAllAppInstanceVersions(): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRestartClusterResource(hresource.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx(hresource.toString(), dwflags.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase(lpszpathname.rawAddress.toString(), bforce, lpszquorumdriveletter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResumeClusterNode(hnode.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags(processhandle.rawAddress.toString(), mask.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterGroupName(hgroup.toString(), lpszgroupname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx(hgroup.toString(), lpszgroupname.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList(hgroup.toString(), nodecount.toInt(), nodelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx(hgroup.toString(), nodecount.toInt(), nodelist.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression(hgroupset.toString(), lpszdependencyexprssion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx(hgroupset.toString(), lpszdependencyexpression.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterName(hcluster.toString(), lpsznewclustername.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterNameEx(hcluster.toString(), lpsznewclustername.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName(hnetwork.toString(), lpszname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx(hnetwork.toString(), lpszname.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder(hcluster.toString(), networkcount.toInt(), networklist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource(hresource.toString(), lpszdevicename.rawAddress.toString(), dwmaxquologsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx(hresource.toString(), lpszdevicename.rawAddress.toString(), dwmaxquorumlogsize.toInt(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression(hresource.toString(), lpszdependencyexpression.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterResourceName(hresource.toString(), lpszresourcename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx(hresource.toString(), lpszresourcename.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: MutPtr, lpcbreturnstatusbuffersize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword(lpszclustername.rawAddress.toString(), lpsznewpassword.rawAddress.toString(), dwflags.toInt(), lpreturnstatusbuffer.rawAddress.toString(), lpcbreturnstatusbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression(hgroup.toString(), lpszdependencyexpression.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAddon != null) (windowsWin32NetworkingClusteringNapiAddon.windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx(hgroup.toString(), lpszdependencyexpression.rawAddress.toString(), lpszreason.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
