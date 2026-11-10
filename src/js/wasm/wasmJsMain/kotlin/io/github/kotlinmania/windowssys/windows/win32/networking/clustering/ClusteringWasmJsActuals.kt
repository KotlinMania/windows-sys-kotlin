@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkingClusteringNapiAddon(): Boolean

private val _windowsWin32NetworkingClusteringNapiAvailable: Boolean = _initWindowsWin32NetworkingClusteringNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterGroupDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterNode(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterNode(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterNodeEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterNodeEx(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterResourceDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterResourceNode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addClusterStorageNode(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addClusterStorageNode(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_backupClusterDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_backupClusterDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_canResourceBeDependent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_canResourceBeDependent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_changeClusterResourceGroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_changeClusterResourceGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeCluster(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeCluster(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterCryptProvider(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterCryptProvider(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterGroup(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterGroup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterGroupSet(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterGroupSet(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterNetInterface(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterNetInterface(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterNetwork(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterNetwork(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterNode(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterNode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterNotifyPort(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterNotifyPort(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_closeClusterResource(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_closeClusterResource(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusWorkerCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusWorkerCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusWorkerTerminate(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusWorkerTerminate(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusWorkersTerminate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusWorkersTerminate(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterCloseEnumEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterDecrypt(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterDecrypt(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterEncrypt(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterEncrypt(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterEnumEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGetVolumePathName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGetVolumePathName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupEnumEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupSetControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupSetEnum(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetworkControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetworkControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetworkEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeEnumEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterNodeReplacement(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterNodeReplacement(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterOpenEnum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterOpenEnumEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterOpenEnumEx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseBatch(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseBatch(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseKey(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCreateBatch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateBatch(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegDeleteKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegDeleteValue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteValue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegEnumKey(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegEnumKey(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegEnumValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegEnumValue(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegOpenKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegOpenKey(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegQueryValue(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegQueryValue(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegSetValue(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetValue(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegSetValueEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetValueEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceEnumEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeControl(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControl(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterSetAccountAccess(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterSetAccountAccess(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createCluster(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createCluster(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterGroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterGroup(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterGroupEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterGroupEx(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterGroupSet(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterGroupSet(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterNameAccount(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterNameAccount(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterNotifyPort(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterNotifyPort(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterResource(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterResource(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterResourceEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterResourceEx(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterResourceType(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterResourceType(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterGroup(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterGroupEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroupEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterGroupSet(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroupSet(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterResource(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResource(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterResourceEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResourceEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterResourceType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResourceType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_destroyCluster(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_destroyCluster(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_destroyClusterGroup(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_destroyClusterGroup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_destroyClusterGroupEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_destroyClusterGroupEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_evictClusterNode(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_evictClusterNode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_evictClusterNodeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_evictClusterNodeEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_evictClusterNodeEx2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_evictClusterNodeEx2(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_failClusterResource(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_failClusterResource(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_failClusterResourceEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_failClusterResourceEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_freeClusterCrypt(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_freeClusterCrypt(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_freeClusterHealthFault(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_freeClusterHealthFault(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterFromGroup(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterFromGroup(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterFromNetInterface(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterFromNetInterface(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterFromNetwork(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterFromNetwork(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterFromNode(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterFromNode(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterFromResource(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterFromResource(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterGroupKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterGroupKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterGroupState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterGroupState(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNetInterface(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNetInterface(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNetworkId(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNetworkId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNetworkKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNetworkKey(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNetworkState(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNetworkState(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNodeId(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNodeId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNodeKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNodeKey(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNodeState(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNodeState(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNotify(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNotify(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterNotifyV2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterNotifyV2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String, p13: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterQuorumResource(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterQuorumResource(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterResourceKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterResourceState(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceState(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getNodeClusterState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getNodeClusterState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_getNotifyEventHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_getNotifyEventHandle(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_initializeClusterHealthFault(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_initializeClusterHealthFault(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_moveClusterGroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_moveClusterGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_moveClusterGroupEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_moveClusterGroupEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_moveClusterGroupEx2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_moveClusterGroupEx2(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_offlineClusterGroup(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_offlineClusterGroup(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_offlineClusterGroupEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_offlineClusterGroupEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_offlineClusterResource(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_offlineClusterResource(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_offlineClusterResourceEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_offlineClusterResourceEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_onlineClusterGroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_onlineClusterGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_onlineClusterGroupEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_onlineClusterGroupEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_onlineClusterResource(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_onlineClusterResource(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_onlineClusterResourceEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_onlineClusterResourceEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openCluster(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openCluster(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterCryptProvider(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterCryptProvider(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterEx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterGroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterGroup(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterGroupEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterGroupEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterGroupSet(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterGroupSet(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNetInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNetInterface(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNetwork(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNetwork(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNetworkEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNetworkEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNode(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNodeById(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNodeById(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterNodeEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterNodeEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterResource(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterResource(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_openClusterResourceEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_openClusterResourceEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_pauseClusterNode(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_pauseClusterNode(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_pauseClusterNodeEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_pauseClusterNodeEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_queryAppInstanceVersion(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_queryAppInstanceVersion(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_registerAppInstance(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_registerAppInstance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_registerAppInstanceVersion(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_registerAppInstanceVersion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_registerClusterNotify(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_registerClusterNotify(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterGroupDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterNameAccount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterNameAccount(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterResourceDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterResourceNode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeClusterStorageNode(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeClusterStorageNode(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilDupGroup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilDupGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilDupResource(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilDupResource(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilDupString(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilDupString(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumGroups(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumGroups(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumProperties(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumProperties(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumResources(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumResources(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindLongProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindLongProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindSzProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindSzProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetAllProperties(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetAllProperties(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetClusterId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetClusterId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetDwordValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetDwordValue(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetLongProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetLongProperty(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetProperties(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetProperties(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetProperty(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetProperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetPropertySize(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPropertySize(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetQwordValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetQwordValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetSzProperty(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetSzProperty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGetSzValue(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGetSzValue(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilGroupsEqual(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilGroupsEqual(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilIsPathValid(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilIsPathValid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilNodeEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilNodeEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilPaxosComparer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilPaxosComparer(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilResourcesEqual(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilResourcesEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetDwordValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetDwordValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetQwordValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetQwordValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetSzValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetSzValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilSetValueEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilSetValueEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilStartResourceService(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilStartResourceService(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilStopResourceService(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilStopResourceService(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilStopService(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilStopService(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilVerifyService(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyService(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions()")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_restartClusterResource(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_restartClusterResource(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_restartClusterResourceEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_restartClusterResourceEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_restoreClusterDatabase(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_restoreClusterDatabase(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resumeClusterNode(p0)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resumeClusterNode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resumeClusterNodeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resumeClusterNodeEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterGroupName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterGroupNameEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterGroupNodeList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupNodeList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterNameEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterNetworkName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterNetworkName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterQuorumResource(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterQuorumResource(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterResourceName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterResourceName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterResourceNameEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterResourceNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setGroupDependencyExpression(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setGroupDependencyExpression(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx(p0: String, p1: String, p2: String): Int

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupDependency(hdependentgroup.toString(), hprovidergroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx(hdependentgroup.toString(), hprovidergroup.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency(hdependentgroupset.toString(), hprovidergroupset.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx(hdependentgroupset.toString(), hprovidergroupset.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency(hdependentgroup.toString(), hprovidergroupset.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx(hdependentgroup.toString(), hprovidergroupset.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hnode =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterNode(hcluster.toString(), (lpsznodename?.value ?: 0L).toString(), 0L.toString(), (pvcallbackarg?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hnode =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterNodeEx(hcluster.toString(), (lpsznodename?.value ?: 0L).toString(), dwflags.toInt(), 0L.toString(), (pvcallbackarg?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceDependency(hresource.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceNode(hresource.toString(), hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx(hresource.toString(), hnode.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addClusterStorageNode(hcluster.toString(), (lpsznodename?.value ?: 0L).toString(), 0L.toString(), (pvcallbackarg?.value ?: 0L).toString(), (lpszclusterstoragenodedescription?.value ?: 0L).toString(), (lpszclusterstoragenodelocation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency(hdependentgroupset.toString(), (lpremoteclustername?.value ?: 0L).toString(), (lpremotegroupsetname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_backupClusterDatabase(hcluster.toString(), (lpszpathname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_canResourceBeDependent(hresource.toString(), hresourcedependent.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation(hgroup.toString(), dwcancelflagsReserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_changeClusterResourceGroup(hresource.toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx(hresource.toString(), hgroup.toString(), flags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2(hresource.toString(), hgroup.toString(), flags.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeCluster(hcluster: Hcluster): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeCluster(hcluster.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterCryptProvider(hcluscryptprovider.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterGroup(hgroup.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterGroupSet(hgroupset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterNetInterface(hnetinterface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterNetwork(hnetwork.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNode(hnode: Hnode): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterNode(hnode.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterNotifyPort(hchange.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterResource(hresource: Hresource): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_closeClusterResource(hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: COpaquePointer?, param2: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault(hcluster.toString(), (failure?.value ?: 0L).toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: COpaquePointer?, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults(hcluster.toString(), (objects?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault(hcluster.toString(), (id?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerCheckTerminate(lpworker: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate((lpworker?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerCreate(lpworker: COpaquePointer?, lpstartaddress: PworkerStartRoutine, lpparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusWorkerCreate((lpworker?.value ?: 0L).toString(), 0L.toString(), (lpparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerTerminate(lpworker: COpaquePointer?) {
    if (_windowsWin32NetworkingClusteringNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_clustering_clusWorkerTerminate((lpworker?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clusWorkerTerminateEx(clusworker: COpaquePointer?, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx((clusworker?.value ?: 0L).toString(), timeoutinmilliseconds.toInt(), waitonly).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkersTerminate(clusworkers: COpaquePointer?, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusWorkersTerminate((clusworkers?.value ?: 0L).toString(), clusworkerscount.toString(), timeoutinmilliseconds.toInt(), waitonly).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusapiSetReasonHandler(lphandler: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler((lphandler?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule(hcluster.toString(), (rulename?.value ?: 0L).toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet(hgroupset.toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl(hcluster.toString(), (affinityrulename?.value ?: 0L).toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume((lpszvolumepathname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterCloseEnum(henum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterCloseEnumEx(hclusterenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterControl(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterControlEx(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule(hcluster.toString(), (rulename?.value ?: 0L).toString(), ruletype).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: COpaquePointer?, cbcryptinput: UInt, ppcryptoutput: COpaquePointer?, pcbcryptoutput: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterDecrypt(hcluscryptprovider.toString(), (pcryptinput?.value ?: 0L).toString(), cbcryptinput.toInt(), (ppcryptoutput?.value ?: 0L).toString(), (pcbcryptoutput?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: COpaquePointer?, cbdata: UInt, ppdata: COpaquePointer?, pcbdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterEncrypt(hcluscryptprovider.toString(), (pdata?.value ?: 0L).toString(), cbdata.toInt(), (ppdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterEnum(henum.toString(), dwindex.toInt(), (lpdwtype?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterEnumEx(hclusterenum.toString(), dwindex.toInt(), (pitem?.value ?: 0L).toString(), (cbitem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGetEnumCount(henum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx(hclusterenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint((lpszvolumemountpoint?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGetVolumePathName((lpszfilename?.value ?: 0L).toString(), (lpszvolumepathname?.value ?: 0L).toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum(hgroupenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx(hgroupenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupControl(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupControlEx(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszresourcename: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupEnum(hgroupenum.toString(), dwindex.toInt(), (lpdwtype?.value ?: 0L).toString(), (lpszresourcename?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupEnumEx(hgroupenumex.toString(), dwindex.toInt(), (pitem?.value ?: 0L).toString(), (cbitem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount(hgroupenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx(hgroupenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum(hgroup.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx(hcluster.toString(), (lpszproperties?.value ?: 0L).toString(), cbproperties.toInt(), (lpszroproperties?.value ?: 0L).toString(), cbroproperties.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum(hgroupsetenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetControl(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetEnum(hgroupsetenum.toString(), dwindex.toInt(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount(hgroupsetenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum(hcluster.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume((lpszpathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum(hnetinterfaceenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum(hnetinterfaceenum.toString(), dwindex.toInt(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum(hcluster.toString(), (lpsznodename?.value ?: 0L).toString(), (lpsznetworkname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum(hnetworkenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkControl(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkControlEx(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkEnum(hnetworkenum.toString(), dwindex.toInt(), (lpdwtype?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount(hnetworkenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum(hnetwork.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeControl(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeControlEx(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeEnum(hnodeenum.toString(), dwindex.toInt(), (lpdwtype?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeEnumEx(hnodeenum.toString(), dwindex.toInt(), (pitem?.value ?: 0L).toString(), (cbitem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum(hnode.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: COpaquePointer?): Hnodeenumex =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx(hnode.toString(), dwtype.toInt(), (poptions?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterNodeReplacement(hcluster.toString(), (lpsznodenamecurrent?.value ?: 0L).toString(), (lpsznodenamenew?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterOpenEnum(hcluster.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: COpaquePointer?): Hclusenumex =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterOpenEnumEx(hcluster.toString(), dwtype.toInt(), (poptions?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: COpaquePointer?, lpszvolumename: Pwstr, lpcchvolumename: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup((lpszfilename?.value ?: 0L).toString(), (lpszvolumepathname?.value ?: 0L).toString(), (lpcchvolumepathname?.value ?: 0L).toString(), (lpszvolumename?.value ?: 0L).toString(), (lpcchvolumename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: COpaquePointer?, cbdata: UInt): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand(hregbatch.toString(), dwcommand, (wzname?.value ?: 0L).toString(), dwoptions.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification(hbatchnotification.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand(hbatchnotification.toString(), (pbatchcommand?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseBatch(hregbatch.toString(), bcommit, (failedcommandnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx(hregbatch.toString(), flags.toInt(), (failedcommandnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort(hbatchnotifyport.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseKey((hkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch(hregreadbatch.toString(), (phregreadbatchreply?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx(hregreadbatch.toString(), flags.toInt(), (phregreadbatchreply?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply(hregreadbatchreply.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateBatch((hkey?.value ?: 0L).toString(), (phregbatch?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort((hkey?.value ?: 0L).toString(), (phbatchnotifyport?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateKey((hkey?.value ?: 0L).toString(), (lpszsubkey?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, lpszreason: Pcwstr): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch((hkey?.value ?: 0L).toString(), (phregreadbatch?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteKey((hkey?.value ?: 0L).toString(), (lpszsubkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteValue((hkey?.value ?: 0L).toString(), (lpszvaluename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx((hkey?.value ?: 0L).toString(), (lpszvaluename?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegEnumKey((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpdwtype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegEnumValue((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpszvaluename?.value ?: 0L).toString(), (lpcchvaluename?.value ?: 0L).toString(), (lpdwtype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification(hbatchnotify.toString(), (phbatchnotification?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity((hkey?.value ?: 0L).toString(), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegOpenKey((hkey?.value ?: 0L).toString(), (lpszsubkey?.value ?: 0L).toString(), samdesired.toInt(), (phkresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: COpaquePointer?, lpcchmaxsubkeylen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcchmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey((hkey?.value ?: 0L).toString(), (lpcsubkeys?.value ?: 0L).toString(), (lpcchmaxsubkeylen?.value ?: 0L).toString(), (lpcvalues?.value ?: 0L).toString(), (lpcchmaxvaluenamelen?.value ?: 0L).toString(), (lpcbmaxvaluelen?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegQueryValue((hkey?.value ?: 0L).toString(), (lpszvaluename?.value ?: 0L).toString(), (lpdwvaluetype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand(hregreadbatch.toString(), (wzsubkeyname?.value ?: 0L).toString(), (wzvaluename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: COpaquePointer?): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand(hregreadbatchreply.toString(), (pbatchcommand?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity((hkey?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx((hkey?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetValue((hkey?.value ?: 0L).toString(), (lpszvaluename?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegSetValueEx((hkey?.value ?: 0L).toString(), (lpszvaluename?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase(hcluster.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule(hcluster.toString(), (rulename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule(hcluster.toString(), (rulename?.value ?: 0L).toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx(hgroup.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum(hresenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx(hresourceenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControl(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceControlEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceEnum(hresenum.toString(), dwindex.toInt(), (lpdwtype?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceEnumEx(hresourceenumex.toString(), dwindex.toInt(), (pitem?.value ?: 0L).toString(), (cbitem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount(hresenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx(hresourceenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum(hresource.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx(hcluster.toString(), (lpszproperties?.value ?: 0L).toString(), cbproperties.toInt(), (lpszroproperties?.value ?: 0L).toString(), cbroproperties.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum(hrestypeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControl(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), hhostnode.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum(hrestypeenum.toString(), dwindex.toInt(), (lpdwtype?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount(hrestypeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterSetAccountAccess(hcluster.toString(), (szaccountsid?.value ?: 0L).toString(), dwaccess.toInt(), dwcontroltype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel(hcluster.toString(), perform, 0L.toString(), (pvcallbackarg?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCluster(pconfig: COpaquePointer?, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createCluster((pconfig?.value ?: 0L).toString(), 0L.toString(), (pvcallbackarg?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: COpaquePointer?): Hgroupset =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet(hcluster.toString(), (lpavailabilitysetname?.value ?: 0L).toString(), (pavailabilitysetconfig?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterGroup(hcluster.toString(), (lpszgroupname?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: COpaquePointer?): Hgroup =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterGroupEx(hcluster.toString(), (lpszgroupname?.value ?: 0L).toString(), (pgroupinfo?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterGroupSet(hcluster.toString(), (groupsetname?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: COpaquePointer?, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterNameAccount(hcluster.toString(), (pconfig?.value ?: 0L).toString(), 0L.toString(), (pvcallbackarg?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterNotifyPort(hchange.toString(), hcluster.toString(), dwfilter.toInt(), dwnotifykey.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: COpaquePointer?, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2(hchange.toString(), hcluster.toString(), (filters?.value ?: 0L).toString(), dwfiltercount.toInt(), dwnotifykey.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterResource(hgroup.toString(), (lpszresourcename?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterResourceEx(hgroup.toString(), (lpszresourcename?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString(), dwflags.toInt(), (lpszreason?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterResourceType(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), (lpszdisplayname?.value ?: 0L).toString(), (lpszresourcetypedll?.value ?: 0L).toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString(), (lpszdisplayname?.value ?: 0L).toString(), (lpszresourcetypedll?.value ?: 0L).toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroup(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroupEx(hgroup.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroupSet(hgroupset.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx(hgroupset.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResourceEx(hresource.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResourceType(hcluster.toString(), (lpszresourcetypename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx(hcluster.toString(), (lpsztypename?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?, fdeletevirtualcomputerobjects: Bool): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_destroyCluster(hcluster.toString(), 0L.toString(), (pvcallbackarg?.value ?: 0L).toString(), fdeletevirtualcomputerobjects).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_destroyClusterGroup(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_destroyClusterGroupEx(hgroup.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster(hcluster.toString(), (pcnorestype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: COpaquePointer?, pcnorestype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist(cnodes.toInt(), (ppsznodenames?.value ?: 0L).toString(), (pcnorestype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster(hcluster.toString(), (pcloudtype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: COpaquePointer?, pcloudtype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist(cnodes.toInt(), (ppsznodenames?.value ?: 0L).toString(), (pcloudtype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNode(hnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_evictClusterNode(hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_evictClusterNodeEx(hnode.toString(), dwtimeout.toInt(), (phrcleanupstatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_evictClusterNodeEx2(hnode.toString(), dwtimeout.toInt(), (phrcleanupstatus?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun failClusterResource(hresource: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_failClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_failClusterResourceEx(hresource.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterCrypt(pcryptinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_freeClusterCrypt((pcryptinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterHealthFault(clusterhealthfault: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_freeClusterHealthFault((clusterhealthfault?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray((clusterhealthfaultarray?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterFromGroup(hgroup.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterFromNetInterface(hnetinterface.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterFromNetwork(hnetwork.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterFromNode(hnode.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterFromResource(hresource.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterGroupKey(hgroup.toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: COpaquePointer?): ClusterGroupState =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterGroupState(hgroup.toString(), (lpsznodename?.value ?: 0L).toString(), (lpcchnodename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: COpaquePointer?, lpclusterinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterInformation(hcluster.toString(), (lpszclustername?.value ?: 0L).toString(), (lpcchclustername?.value ?: 0L).toString(), (lpclusterinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterKey(hcluster.toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNetInterface(hcluster.toString(), (lpsznodename?.value ?: 0L).toString(), (lpsznetworkname?.value ?: 0L).toString(), (lpszinterfacename?.value ?: 0L).toString(), (lpcchinterfacename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey(hnetinterface.toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState(hnetinterface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNetworkId(hnetwork.toString(), (lpsznetworkid?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNetworkKey(hnetwork.toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNetworkState(hnetwork.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNodeId(hnode.toString(), (lpsznodeid?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNodeKey(hnode.toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNodeState(hnode.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: COpaquePointer?, lpdwfiltertype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?, dwmilliseconds: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNotify(hchange.toString(), (lpdwnotifykey?.value ?: 0L).toString(), (lpdwfiltertype?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: COpaquePointer?, pfilterandtype: COpaquePointer?, buffer: COpaquePointer?, lpbbuffersize: COpaquePointer?, lpszobjectid: Pwstr, lpcchobjectid: COpaquePointer?, lpszparentid: Pwstr, lpcchparentid: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?, lpsztype: Pwstr, lpcchtype: COpaquePointer?, dwmilliseconds: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterNotifyV2(hchange.toString(), (lpdwnotifykey?.value ?: 0L).toString(), (pfilterandtype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (lpbbuffersize?.value ?: 0L).toString(), (lpszobjectid?.value ?: 0L).toString(), (lpcchobjectid?.value ?: 0L).toString(), (lpszparentid?.value ?: 0L).toString(), (lpcchparentid?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString(), (lpsztype?.value ?: 0L).toString(), (lpcchtype?.value ?: 0L).toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: COpaquePointer?, lpszdevicename: Pwstr, lpcchdevicename: COpaquePointer?, lpdwmaxquorumlogsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterQuorumResource(hcluster.toString(), (lpszresourcename?.value ?: 0L).toString(), (lpcchresourcename?.value ?: 0L).toString(), (lpszdevicename?.value ?: 0L).toString(), (lpcchdevicename?.value ?: 0L).toString(), (lpdwmaxquorumlogsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression(hresource.toString(), (lpszdependencyexpression?.value ?: 0L).toString(), (lpcchdependencyexpression?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceKey(hresource.toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName(hresource.toString(), (lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: COpaquePointer?, lpszgroupname: Pwstr, lpcchgroupname: COpaquePointer?): ClusterResourceState =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceState(hresource.toString(), (lpsznodename?.value ?: 0L).toString(), (lpcchnodename?.value ?: 0L).toString(), (lpszgroupname?.value ?: 0L).toString(), (lpcchgroupname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey(hcluster.toString(), (lpsztypename?.value ?: 0L).toString(), samdesired.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW((ppsznodename?.value ?: 0L).toString(), (nodecloudtype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getNodeClusterState((lpsznodename?.value ?: 0L).toString(), (pdwclusterstate?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_getNotifyEventHandle(hchange.toString(), (lphtargetevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeClusterHealthFault(clusterhealthfault: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_initializeClusterHealthFault((clusterhealthfault?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray((clusterhealthfaultarray?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume((lpszpathname?.value ?: 0L).toString(), (pbfileisonsharedvolume?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_moveClusterGroup(hgroup.toString(), hdestinationnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_moveClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_moveClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_offlineClusterGroup(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_offlineClusterGroupEx(hgroup.toString(), dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2(hgroup.toString(), dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_offlineClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_offlineClusterResourceEx(hresource.toString(), dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2(hresource.toString(), dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_onlineClusterGroup(hgroup.toString(), hdestinationnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_onlineClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_onlineClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_onlineClusterResourceEx(hresource.toString(), dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2(hresource.toString(), dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openCluster((lpszclustername?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: COpaquePointer?, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterCryptProvider((lpszresource?.value ?: 0L).toString(), (lpszprovider?.value ?: 0L).toString(), dwtype.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: COpaquePointer?, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx((lpszresource?.value ?: 0L).toString(), (lpszkeyname?.value ?: 0L).toString(), (lpszprovider?.value ?: 0L).toString(), dwtype.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: COpaquePointer?): Hcluster =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterEx((lpszclustername?.value ?: 0L).toString(), desiredaccess.toInt(), (grantedaccess?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterGroup(hcluster.toString(), (lpszgroupname?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hgroup =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterGroupEx(hcluster.toString(), (lpszgroupname?.value ?: 0L).toString(), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterGroupSet(hcluster.toString(), (lpszgroupsetname?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNetInterface(hcluster.toString(), (lpszinterfacename?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnetinterface =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx(hcluster.toString(), (lpszinterfacename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNetwork(hcluster.toString(), (lpsznetworkname?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnetwork =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNetworkEx(hcluster.toString(), (lpsznetworkname?.value ?: 0L).toString(), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNode(hcluster.toString(), (lpsznodename?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNodeById(hcluster.toString(), nodeid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnode =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterNodeEx(hcluster.toString(), (lpsznodename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterResource(hcluster.toString(), (lpszresourcename?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_openClusterResourceEx(hcluster.toString(), (lpszresourcename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_pauseClusterNode(hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_pauseClusterNodeEx(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAppInstanceVersion(appinstanceid: COpaquePointer?, instanceversionhigh: COpaquePointer?, instanceversionlow: COpaquePointer?, versionstatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_queryAppInstanceVersion((appinstanceid?.value ?: 0L).toString(), (instanceversionhigh?.value ?: 0L).toString(), (instanceversionlow?.value ?: 0L).toString(), (versionstatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: COpaquePointer?, childreninheritappinstance: Bool): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_registerAppInstance((processhandle?.value ?: 0L).toString(), (appinstanceid?.value ?: 0L).toString(), childreninheritappinstance).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppInstanceVersion(appinstanceid: COpaquePointer?, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_registerAppInstanceVersion((appinstanceid?.value ?: 0L).toString(), instanceversionhigh.toString(), instanceversionlow.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_registerClusterNotify(hchange.toString(), dwfiltertype.toInt(), (hobject?.value ?: 0L).toString(), dwnotifykey.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2(hchange.toString(), hcluster.toString(), flags.toString(), (restypename?.value ?: 0L).toString(), dwnotifykey.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupDependency(hgroup.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx(hgroup.toString(), hdependson.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency(hgroupset.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx(hgroupset.toString(), hdependson.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency(hgroup.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx(hgroup.toString(), hdependson.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterNameAccount(hcluster.toString(), bdeletecomputerobjects).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceDependency(hresource.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceNode(hresource.toString(), hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx(hresource.toString(), hnode.toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeClusterStorageNode(hcluster.toString(), (lpszclusterstorageenclosurename?.value ?: 0L).toString(), dwtimeout.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency(hdependentgroupset.toString(), (lpremoteclustername?.value ?: 0L).toString(), (lpremotegroupsetname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, pcboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (poutpropertylist?.value ?: 0L).toString(), pcboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree((pszpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupGroup(group: Hgroup, copy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilDupGroup(group.toString(), (copy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupParameterBlock(poutparams: COpaquePointer?, pinparams: COpaquePointer?, ppropertytable: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock((poutparams?.value ?: 0L).toString(), (pinparams?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupResource(group: Hresource, copy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilDupResource(group.toString(), (copy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilDupString((pszinstring?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumGroups(hcluster.toString(), hself.toString(), 0L.toString(), (pparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx(hcluster.toString(), hself.toString(), grouptype, 0L.toString(), (pparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties((hkeyclusterkey?.value ?: 0L).toString(), (pszoutproperties?.value ?: 0L).toString(), cboutpropertiessize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumProperties(ppropertytable: COpaquePointer?, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumProperties((ppropertytable?.value ?: 0L).toString(), (pszoutproperties?.value ?: 0L).toString(), cboutpropertiessize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumResources(hself.toString(), (lpszrestypename?.value ?: 0L).toString(), 0L.toString(), (pparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx(hcluster.toString(), hself.toString(), (lpszrestypename?.value ?: 0L).toString(), 0L.toString(), (pparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?, dwdesiredaccess: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2(hcluster.toString(), hself.toString(), (lpszrestypename?.value ?: 0L).toString(), 0L.toString(), (pparameter?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings((pszsrc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindBinaryProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: COpaquePointer?, pcbpropertyvaluesize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pbpropertyvalue?.value ?: 0L).toString(), (pcbpropertyvaluesize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter(hcluster.toString(), hresource.toString(), (pszdriveletter?.value ?: 0L).toString(), (pcchdriveletter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindDwordProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pdwpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindExpandSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pszpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindExpandedSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pszpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindFileTimeProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pftpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindLongProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindLongProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (plpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindMultiSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?, pcbpropertyvaluesize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pszpropertyvalue?.value ?: 0L).toString(), (pcbpropertyvaluesize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindSzProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (pszpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty((ppropertylist?.value ?: 0L).toString(), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L).toString(), (plpropertyvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFreeEnvironment(lpenvironment: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment((lpenvironment?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFreeParameterBlock(poutparams: COpaquePointer?, pinparams: COpaquePointer?, ppropertytable: COpaquePointer?) {
    if (_windowsWin32NetworkingClusteringNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock((poutparams?.value ?: 0L).toString(), (pinparams?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetAllProperties((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (poutpropertylist?.value ?: 0L).toString(), cboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetBinaryProperty(ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?, pvaluestruct: COpaquePointer?, pboldvalue: COpaquePointer?, cboldvaluesize: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty((ppboutvalue?.value ?: 0L).toString(), (pcboutvaluesize?.value ?: 0L).toString(), (pvaluestruct?.value ?: 0L).toString(), (pboldvalue?.value ?: 0L).toString(), cboldvaluesize.toInt(), (pppropertylist?.value ?: 0L).toString(), (pcbpropertylistsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (ppboutvalue?.value ?: 0L).toString(), (pcboutvaluesize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType(hgroup.toString(), (grouptype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetClusterId(hcluster.toString(), (guid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState(hcluster.toString(), eclusterrole) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: COpaquePointer?, phclusteripaddressresource: COpaquePointer?, phclusterquorumresource: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources(hcluster.toString(), (phclusternameresource?.value ?: 0L).toString(), (phclusteripaddressresource?.value ?: 0L).toString(), (phclusterquorumresource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: COpaquePointer?, phclusterquorumresourceout: COpaquePointer?, dwdesiredaccess: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx(hclusterin.toString(), (phclusternameresourceout?.value ?: 0L).toString(), (phclusterquorumresourceout?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup(hcluster.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetDwordProperty(pdwoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty((pdwoutvalue?.value ?: 0L).toString(), (pvaluestruct?.value ?: 0L).toString(), dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), (pppropertylist?.value ?: 0L).toString(), (pcbpropertylistsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: COpaquePointer?, dwdefaultvalue: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetDwordValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (pdwoutvalue?.value ?: 0L).toString(), dwdefaultvalue.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): COpaquePointer? =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName(hresource.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetFileTimeProperty(pftoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetLongProperty(ploutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetLongProperty((ploutvalue?.value ?: 0L).toString(), (pvaluestruct?.value ?: 0L).toString(), loldvalue, lminimum, lmaximum, (pppropertylist?.value ?: 0L).toString(), (pcbpropertylistsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?, pvaluestruct: COpaquePointer?, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty((ppszoutvalue?.value ?: 0L).toString(), (pcboutvaluesize?.value ?: 0L).toString(), (pvaluestruct?.value ?: 0L).toString(), (pszoldvalue?.value ?: 0L).toString(), cboldvaluesize.toInt(), (pppropertylist?.value ?: 0L).toString(), (pcbpropertylistsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties((hkeyclusterkey?.value ?: 0L).toString(), (poutpropertylist?.value ?: 0L).toString(), cboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetProperties((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (poutpropertylist?.value ?: 0L).toString(), cboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutparams: COpaquePointer?, bcheckforrequiredproperties: Bool, psznameofpropinerror: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (poutparams?.value ?: 0L).toString(), bcheckforrequiredproperties, (psznameofpropinerror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: COpaquePointer?, poutpropertyitem: COpaquePointer?, pcboutpropertyitemsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetProperty((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytableitem?.value ?: 0L).toString(), (poutpropertyitem?.value ?: 0L).toString(), (pcboutpropertyitemsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertyFormats(ppropertytable: COpaquePointer?, poutpropertyformatlist: COpaquePointer?, cbpropertyformatlistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats((ppropertytable?.value ?: 0L).toString(), (poutpropertyformatlist?.value ?: 0L).toString(), cbpropertyformatlistsize.toInt(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: COpaquePointer?, pcboutpropertylistsize: COpaquePointer?, pnpropertycount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetPropertySize((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytableitem?.value ?: 0L).toString(), (pcboutpropertylistsize?.value ?: 0L).toString(), (pnpropertycount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: COpaquePointer?, qwdefaultvalue: ULong): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetQwordValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (pqwoutvalue?.value ?: 0L).toString(), qwdefaultvalue.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency((hself?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: COpaquePointer?, brecurse: Bool): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass(hcluster.toString(), (hself?.value ?: 0L).toString(), (prci?.value ?: 0L).toString(), brecurse).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: COpaquePointer?, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx(hcluster.toString(), (hself?.value ?: 0L).toString(), (prci?.value ?: 0L).toString(), brecurse, dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName(hcluster.toString(), (hself?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString(), brecurse).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx(hcluster.toString(), (hself?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString(), brecurse, dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx((hself?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: COpaquePointer?, pszsubnetmask: Pwstr, pcchsubnetmask: COpaquePointer?, psznetwork: Pwstr, pcchnetwork: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps(hresource.toString(), (pszaddress?.value ?: 0L).toString(), (pcchaddress?.value ?: 0L).toString(), (pszsubnetmask?.value ?: 0L).toString(), (pcchsubnetmask?.value ?: 0L).toString(), (psznetwork?.value ?: 0L).toString(), (pcchnetwork?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceName(hresource.toString(), (pszresourcename?.value ?: 0L).toString(), (pcchresourcenameinout?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency((lpszresourcename?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx((lpszresourcename?.value ?: 0L).toString(), (lpszresourcetype?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetSzProperty(ppszoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, pszoldvalue: Pcwstr, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetSzProperty((ppszoutvalue?.value ?: 0L).toString(), (pvaluestruct?.value ?: 0L).toString(), (pszoldvalue?.value ?: 0L).toString(), (pppropertylist?.value ?: 0L).toString(), (pcbpropertylistsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGetSzValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilGroupsEqual(hself.toString(), hgroup.toString(), (pequal?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilIsPathValid((pszpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilIsResourceClassEqual(prci: COpaquePointer?, hresource: Hresource): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual((prci?.value ?: 0L).toString(), hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilLeftPaxosIsLessThanRight(left: COpaquePointer?, right: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight((left?.value ?: 0L).toString(), (right?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilNodeEnum(hcluster.toString(), 0L.toString(), (pparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilPaxosComparer(left: COpaquePointer?, right: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilPaxosComparer((left?.value ?: 0L).toString(), (right?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, pcboutpropertylistsize: COpaquePointer?, pinparams: COpaquePointer?, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock((ppropertytable?.value ?: 0L).toString(), (poutpropertylist?.value ?: 0L).toString(), (pcboutpropertylistsize?.value ?: 0L).toString(), (pinparams?.value ?: 0L).toString(), (pcbbytesreturned?.value ?: 0L).toString(), (pcbrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment((pszservicename?.value ?: 0L).toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum(hself.toString(), enumtype.toInt(), 0L.toString(), (pparameter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual((lpszresourcetypename?.value ?: 0L).toString(), hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilResourcesEqual(hself.toString(), hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: COpaquePointer?, cbnewvaluesize: UInt, ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (pbnewvalue?.value ?: 0L).toString(), cbnewvaluesize.toInt(), (ppboutvalue?.value ?: 0L).toString(), (pcboutvaluesize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetDwordValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), dwnewvalue.toInt(), (pdwoutvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (psznewvalue?.value ?: 0L).toString(), (ppszoutstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (psznewvalue?.value ?: 0L).toString(), cbnewvaluesize.toInt(), (ppszoutvalue?.value ?: 0L).toString(), (pcboutvaluesize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList((hkeyclusterkey?.value ?: 0L).toString(), (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, pinparams: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), (pinparams?.value ?: 0L).toString(), (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt(), (poutparams?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, pinparams: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), (pinparams?.value ?: 0L).toString(), (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt(), bforcewrite, (poutparams?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), ballowunknownproperties, (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt(), (poutparams?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), ballowunknownproperties, (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt(), bforcewrite, (poutparams?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetQwordValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), qwnewvalue.toString(), (pqwoutvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment((pszservicename?.value ?: 0L).toString(), hresource.toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: COpaquePointer?, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters((pszservicename?.value ?: 0L).toString(), (schscmhandle?.value ?: 0L).toString(), (phservice?.value ?: 0L).toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: COpaquePointer?, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx((pszservicename?.value ?: 0L).toString(), (schscmhandle?.value ?: 0L).toString(), (phservice?.value ?: 0L).toString(), dwdesiredaccess.toInt(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetSzValue((hkeyclusterkey?.value ?: 0L).toString(), (pszvaluename?.value ?: 0L).toString(), (psznewvalue?.value ?: 0L).toString(), (ppszoutstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties((hkeyclusterkey?.value ?: 0L).toString(), (ppropertytable?.value ?: 0L).toString(), (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuesize: UInt, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilSetValueEx((hkeyclusterkey?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), valuetype.toInt(), (valuedata?.value ?: 0L).toString(), valuesize.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilStartResourceService((pszservicename?.value ?: 0L).toString(), (phservicehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilStopResourceService((pszservicename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilStopService((hservicehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: COpaquePointer?, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, (pdwresourcestate?.value ?: 0L).toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList((pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyPropertyTable(ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable((ppropertytable?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString(), ballowunknownproperties, (pinpropertylist?.value ?: 0L).toString(), cbinpropertylistsize.toInt(), (poutparams?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService((pszservicename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyService((hservicehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), (presult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree((key?.value ?: 0L).toString(), (keyname?.value ?: 0L).toString(), treatnokeyaserror).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetAllAppInstanceVersions(): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_restartClusterResource(hresource.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_restartClusterResourceEx(hresource.toString(), dwflags.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_restoreClusterDatabase((lpszpathname?.value ?: 0L).toString(), bforce, (lpszquorumdriveletter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resumeClusterNode(hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resumeClusterNodeEx(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags((processhandle?.value ?: 0L).toString(), mask.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupName(hgroup.toString(), (lpszgroupname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupNameEx(hgroup.toString(), (lpszgroupname?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupNodeList(hgroup.toString(), nodecount.toInt(), (nodelist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: COpaquePointer?, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx(hgroup.toString(), nodecount.toInt(), (nodelist?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression(hgroupset.toString(), (lpszdependencyexprssion?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx(hgroupset.toString(), (lpszdependencyexpression?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterName(hcluster.toString(), (lpsznewclustername?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterNameEx(hcluster.toString(), (lpsznewclustername?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterNetworkName(hnetwork.toString(), (lpszname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx(hnetwork.toString(), (lpszname?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder(hcluster.toString(), networkcount.toInt(), (networklist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterQuorumResource(hresource.toString(), (lpszdevicename?.value ?: 0L).toString(), dwmaxquologsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx(hresource.toString(), (lpszdevicename?.value ?: 0L).toString(), dwmaxquorumlogsize.toInt(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression(hresource.toString(), (lpszdependencyexpression?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterResourceName(hresource.toString(), (lpszresourcename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterResourceNameEx(hresource.toString(), (lpszresourcename?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: COpaquePointer?, lpcbreturnstatusbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword((lpszclustername?.value ?: 0L).toString(), (lpsznewpassword?.value ?: 0L).toString(), dwflags.toInt(), (lpreturnstatusbuffer?.value ?: 0L).toString(), (lpcbreturnstatusbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setGroupDependencyExpression(hgroup.toString(), (lpszdependencyexpression?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    if (_windowsWin32NetworkingClusteringNapiAvailable) _wasm_windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx(hgroup.toString(), (lpszdependencyexpression?.value ?: 0L).toString(), (lpszreason?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
