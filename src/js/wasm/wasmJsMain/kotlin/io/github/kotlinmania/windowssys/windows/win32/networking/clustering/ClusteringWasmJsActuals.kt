@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingClusteringNapiAddon(): Boolean

private val windowsWin32NetworkingClusteringNapiAvailable: Boolean = initWindowsWin32NetworkingClusteringNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterNode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterNode(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterNodeEx(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddClusterStorageNode(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringBackupClusterDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseCluster(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseCluster(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterGroup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterNode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCloseClusterResource(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterResource(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusWorkerCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerTerminate(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusWorkersTerminate(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterDecrypt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterDecrypt(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterEncrypt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterEncrypt(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterEnumEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetworkControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeReplacement(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterOpenEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegEnumKey(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegEnumValue(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegOpenKey(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegQueryValue(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegSetValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetValue(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControlEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateCluster(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateCluster(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterGroup(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterResource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResource(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResourceType(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterResource(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResource(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDestroyCluster(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDestroyCluster(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringEvictClusterNode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringEvictClusterNode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringFailClusterResource(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringFailClusterResource(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringFailClusterResourceEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringFreeClusterCrypt(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterFromNode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromNode(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterFromResource(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromResource(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterGroupKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterGroupState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterGroupState(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterface(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNodeId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNodeId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNodeKey(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNodeState(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNodeState(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNotify(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNotify(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String, p13: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceKey(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterResourceState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceState(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetNodeClusterState(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetNodeClusterState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringMoveClusterGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringMoveClusterGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOfflineClusterResource(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterResource(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOnlineClusterResource(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterResource(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenCluster(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenCluster(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterEx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterGroup(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetwork(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNode(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterResource(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterResource(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringPauseClusterNode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringPauseClusterNode(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRegisterAppInstance(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRegisterAppInstance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRegisterClusterNotify(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilDupGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupGroup(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilDupResource(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupResource(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilDupString(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupString(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumGroups(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumProperties(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumResources(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumResources(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetProperties(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetProperties(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetProperty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetSzValue(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilIsPathValid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilNodeEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetSzValue(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetValueEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilStartResourceService(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilStopResourceService(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilStopService(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilStopService(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilVerifyService(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyService(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions()")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRestartClusterResource(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRestartClusterResource(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResumeClusterNode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResumeClusterNode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterGroupName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterNameEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNetworkName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterResourceName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterResourceName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx(p0: String, p1: String, p2: String): Int

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(hdependentgroup.toString(), hprovidergroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx(hdependentgroup.toString(), hprovidergroup.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(hdependentgroupset.toString(), hprovidergroupset.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx(hdependentgroupset.toString(), hprovidergroupset.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(hdependentgroup.toString(), hprovidergroupset.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx(hdependentgroup.toString(), hprovidergroupset.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterNode(hcluster.toString(), lpsznodename.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterNodeEx(hcluster.toString(), lpsznodename.rawAddress.toString(), dwflags.toInt(), 0L.toString(), pvcallbackarg.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(hresource.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(hresource.toString(), hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx(hresource.toString(), hnode.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddClusterStorageNode(hcluster.toString(), lpsznodename.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString(), lpszclusterstoragenodedescription.rawAddress.toString(), lpszclusterstoragenodelocation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency(hdependentgroupset.toString(), lpremoteclustername.rawAddress.toString(), lpremotegroupsetname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringBackupClusterDatabase(hcluster.toString(), lpszpathname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(hresource.toString(), hresourcedependent.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(hgroup.toString(), dwcancelflagsReserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(hresource.toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(hresource.toString(), hgroup.toString(), flags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2(hresource.toString(), hgroup.toString(), flags.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeCluster(hcluster: Hcluster): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseCluster(hcluster.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(hcluscryptprovider.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterGroup(hgroup.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(hgroupset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(hnetinterface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(hnetwork.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNode(hnode: Hnode): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNode(hnode.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(hchange.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeClusterResource(hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCloseClusterResource(hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: ConstPtr, param2: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault(hcluster.toString(), failure.rawAddress.toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: MutPtr, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults(hcluster.toString(), objects.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault(hcluster.toString(), id.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerCheckTerminate(lpworker: MutPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate(lpworker.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerCreate(lpworker: MutPtr, lpstartaddress: PworkerStartRoutine, lpparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerCreate(lpworker.rawAddress.toString(), 0L.toString(), lpparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkerTerminate(lpworker: ConstPtr) {
    if (windowsWin32NetworkingClusteringNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerTerminate(lpworker.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clusWorkerTerminateEx(clusworker: MutPtr, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx(clusworker.rawAddress.toString(), timeoutinmilliseconds.toInt(), waitonly).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusWorkersTerminate(clusworkers: MutPtr, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusWorkersTerminate(clusworkers.rawAddress.toString(), clusworkerscount.toString(), timeoutinmilliseconds.toInt(), waitonly).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusapiSetReasonHandler(lphandler: ConstPtr): MutPtr =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler(lphandler.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule(hcluster.toString(), rulename.rawAddress.toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(hgroupset.toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx(hgroupset.toString(), hgroup.toString(), faultdomain.toInt(), updatedomain.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl(hcluster.toString(), affinityrulename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume(lpszvolumepathname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterCloseEnum(henum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(hclusterenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterControl(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterControlEx(hcluster.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule(hcluster.toString(), rulename.rawAddress.toString(), ruletype).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: ConstPtr, cbcryptinput: UInt, ppcryptoutput: MutPtr, pcbcryptoutput: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterDecrypt(hcluscryptprovider.toString(), pcryptinput.rawAddress.toString(), cbcryptinput.toInt(), ppcryptoutput.rawAddress.toString(), pcbcryptoutput.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: ConstPtr, cbdata: UInt, ppdata: MutPtr, pcbdata: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterEncrypt(hcluscryptprovider.toString(), pdata.rawAddress.toString(), cbdata.toInt(), ppdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterEnum(henum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterEnumEx(hclusterenum.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(henum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(hclusterenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), cchbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(hgroupenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(hgroupenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupControl(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupControlEx(hgroup.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: MutPtr, lpszresourcename: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupEnum(hgroupenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszresourcename.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx(hgroupenumex.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(hgroupenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(hgroupenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(hgroup.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx(hcluster.toString(), lpszproperties.rawAddress.toString(), cbproperties.toInt(), lpszroproperties.rawAddress.toString(), cbroproperties.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(hgroupsetenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetControl(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx(hgroupset.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum(hgroupsetenum.toString(), dwindex.toInt(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(hgroupsetenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(hcluster.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume(lpszpathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(hnetinterfaceenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx(hnetinterface.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum(hnetinterfaceenum.toString(), dwindex.toInt(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum(hcluster.toString(), lpsznodename.rawAddress.toString(), lpsznetworkname.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(hnetworkenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkControl(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx(hnetwork.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkEnum(hnetworkenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(hnetworkenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(hnetwork.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeControl(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeControlEx(hnode.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeEnum(hnodeenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx(hnodeenum.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(hnodeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(hnode.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: ConstPtr): Hnodeenumex =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx(hnode.toString(), dwtype.toInt(), poptions.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterNodeReplacement(hcluster.toString(), lpsznodenamecurrent.rawAddress.toString(), lpsznodenamenew.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterOpenEnum(hcluster.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: ConstPtr): Hclusenumex =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx(hcluster.toString(), dwtype.toInt(), poptions.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: MutPtr, lpszvolumename: Pwstr, lpcchvolumename: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), lpcchvolumepathname.rawAddress.toString(), lpszvolumename.rawAddress.toString(), lpcchvolumename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: ConstPtr, cbdata: UInt): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand(hregbatch.toString(), dwcommand, wzname.rawAddress.toString(), dwoptions.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(hbatchnotification.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand(hbatchnotification.toString(), pbatchcommand.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch(hregbatch.toString(), bcommit, failedcommandnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx(hregbatch.toString(), flags.toInt(), failedcommandnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(hbatchnotifyport.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseKey(hkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch(hregreadbatch.toString(), phregreadbatchreply.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx(hregreadbatch.toString(), flags.toInt(), phregreadbatchreply.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(hregreadbatchreply.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch(hkey.rawAddress.toString(), phregbatch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort(hkey.rawAddress.toString(), phbatchnotifyport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateKey(hkey.rawAddress.toString(), lpszsubkey.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, lpszreason: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString(), lpszreason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch(hkey.rawAddress.toString(), phregreadbatch.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey(hkey.rawAddress.toString(), lpszsubkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpszreason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr, lpftlastwritetime: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegEnumKey(hkey.rawAddress.toString(), dwindex.toInt(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: MutPtr, lpdwtype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegEnumValue(hkey.rawAddress.toString(), dwindex.toInt(), lpszvaluename.rawAddress.toString(), lpcchvaluename.rawAddress.toString(), lpdwtype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification(hbatchnotify.toString(), phbatchnotification.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity(hkey.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegOpenKey(hkey.rawAddress.toString(), lpszsubkey.rawAddress.toString(), samdesired.toInt(), phkresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: ConstPtr, lpcchmaxsubkeylen: ConstPtr, lpcvalues: ConstPtr, lpcchmaxvaluenamelen: ConstPtr, lpcbmaxvaluelen: ConstPtr, lpcbsecuritydescriptor: ConstPtr, lpftlastwritetime: ConstPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey(hkey.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcchmaxsubkeylen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcchmaxvaluenamelen.rawAddress.toString(), lpcbmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegQueryValue(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), lpdwvaluetype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand(hregreadbatch.toString(), wzsubkeyname.rawAddress.toString(), wzvaluename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: MutPtr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand(hregreadbatchreply.toString(), pbatchcommand.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpszreason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetValue(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx(hkey.rawAddress.toString(), lpszvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(hcluster.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule(hcluster.toString(), rulename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule(hcluster.toString(), rulename.rawAddress.toString(), hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx(hgroup.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(hresenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(hresourceenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControl(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceControlEx(hresource.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceEnum(hresenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx(hresourceenumex.toString(), dwindex.toInt(), pitem.rawAddress.toString(), cbitem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(hresenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(hresourceenumex.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(hresource.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx(hcluster.toString(), lpszproperties.rawAddress.toString(), cbproperties.toInt(), lpszroproperties.rawAddress.toString(), cbroproperties.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(hrestypeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), hhostnode.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), ninbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), noutbuffersize.toInt(), lpbytesreturned.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum(hrestypeenum.toString(), dwindex.toInt(), lpdwtype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(hrestypeenum.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), dwtype.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess(hcluster.toString(), szaccountsid.rawAddress.toString(), dwaccess.toInt(), dwcontroltype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel(hcluster.toString(), perform, 0L.toString(), pvcallbackarg.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCluster(pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateCluster(pconfig.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: ConstPtr): Hgroupset =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet(hcluster.toString(), lpavailabilitysetname.rawAddress.toString(), pavailabilitysetconfig.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterGroup(hcluster.toString(), lpszgroupname.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: ConstPtr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx(hcluster.toString(), lpszgroupname.rawAddress.toString(), pgroupinfo.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet(hcluster.toString(), groupsetname.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount(hcluster.toString(), pconfig.rawAddress.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(hchange.toString(), hcluster.toString(), dwfilter.toInt(), dwnotifykey.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: ConstPtr, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2(hchange.toString(), hcluster.toString(), filters.rawAddress.toString(), dwfiltercount.toInt(), dwnotifykey.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResource(hgroup.toString(), lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx(hgroup.toString(), lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwflags.toInt(), lpszreason.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResourceType(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), lpszdisplayname.rawAddress.toString(), lpszresourcetypedll.rawAddress.toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx(hcluster.toString(), lpszresourcetypename.rawAddress.toString(), lpszdisplayname.rawAddress.toString(), lpszresourcetypedll.rawAddress.toString(), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx(hgroup.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(hgroupset.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx(hgroupset.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx(hresource.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType(hcluster.toString(), lpszresourcetypename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx(hcluster.toString(), lpsztypename.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, fdeletevirtualcomputerobjects: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDestroyCluster(hcluster.toString(), 0L.toString(), pvcallbackarg.rawAddress.toString(), fdeletevirtualcomputerobjects).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx(hgroup.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster(hcluster.toString(), pcnorestype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcnorestype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist(cnodes.toInt(), ppsznodenames.rawAddress.toString(), pcnorestype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster(hcluster.toString(), pcloudtype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcloudtype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist(cnodes.toInt(), ppsznodenames.rawAddress.toString(), pcloudtype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNode(hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringEvictClusterNode(hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx(hnode.toString(), dwtimeout.toInt(), phrcleanupstatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2(hnode.toString(), dwtimeout.toInt(), phrcleanupstatus.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun failClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringFailClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringFailClusterResourceEx(hresource.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterCrypt(pcryptinfo: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringFreeClusterCrypt(pcryptinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault(clusterhealthfault.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray(clusterhealthfaultarray.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(hgroup.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(hnetinterface.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(hnetwork.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromNode(hnode.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterFromResource(hresource.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterGroupKey(hgroup.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: MutPtr): ClusterGroupState =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterGroupState(hgroup.toString(), lpsznodename.rawAddress.toString(), lpcchnodename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: MutPtr, lpclusterinfo: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterInformation(hcluster.toString(), lpszclustername.rawAddress.toString(), lpcchclustername.rawAddress.toString(), lpclusterinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterKey(hcluster.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterface(hcluster.toString(), lpsznodename.rawAddress.toString(), lpsznetworkname.rawAddress.toString(), lpszinterfacename.rawAddress.toString(), lpcchinterfacename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey(hnetinterface.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(hnetinterface.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkId(hnetwork.toString(), lpsznetworkid.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey(hnetwork.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(hnetwork.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNodeId(hnode.toString(), lpsznodeid.rawAddress.toString(), lpcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNodeKey(hnode.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNodeState(hnode.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: MutPtr, lpdwfiltertype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, dwmilliseconds: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNotify(hchange.toString(), lpdwnotifykey.rawAddress.toString(), lpdwfiltertype.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: MutPtr, pfilterandtype: MutPtr, buffer: MutPtr, lpbbuffersize: MutPtr, lpszobjectid: Pwstr, lpcchobjectid: MutPtr, lpszparentid: Pwstr, lpcchparentid: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, lpsztype: Pwstr, lpcchtype: MutPtr, dwmilliseconds: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2(hchange.toString(), lpdwnotifykey.rawAddress.toString(), pfilterandtype.rawAddress.toString(), buffer.rawAddress.toString(), lpbbuffersize.rawAddress.toString(), lpszobjectid.rawAddress.toString(), lpcchobjectid.rawAddress.toString(), lpszparentid.rawAddress.toString(), lpcchparentid.rawAddress.toString(), lpszname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpsztype.rawAddress.toString(), lpcchtype.rawAddress.toString(), dwmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: MutPtr, lpszdevicename: Pwstr, lpcchdevicename: MutPtr, lpdwmaxquorumlogsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource(hcluster.toString(), lpszresourcename.rawAddress.toString(), lpcchresourcename.rawAddress.toString(), lpszdevicename.rawAddress.toString(), lpcchdevicename.rawAddress.toString(), lpdwmaxquorumlogsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression(hresource.toString(), lpszdependencyexpression.rawAddress.toString(), lpcchdependencyexpression.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceKey(hresource.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: MutPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName(hresource.toString(), lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: MutPtr, lpszgroupname: Pwstr, lpcchgroupname: MutPtr): ClusterResourceState =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceState(hresource.toString(), lpsznodename.rawAddress.toString(), lpcchnodename.rawAddress.toString(), lpszgroupname.rawAddress.toString(), lpcchgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey(hcluster.toString(), lpsztypename.rawAddress.toString(), samdesired.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW(ppsznodename.rawAddress.toString(), nodecloudtype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetNodeClusterState(lpsznodename.rawAddress.toString(), pdwclusterstate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle(hchange.toString(), lphtargetevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault(clusterhealthfault.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray(clusterhealthfaultarray.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume(lpszpathname.rawAddress.toString(), pbfileisonsharedvolume.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringMoveClusterGroup(hgroup.toString(), hdestinationnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwmoveflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(hgroup.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx(hgroup.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2(hgroup.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx(hresource.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2(hresource.toString(), dwofflineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(hgroup.toString(), hdestinationnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2(hgroup.toString(), hdestinationnode.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterResource(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx(hresource.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2(hresource.toString(), dwonlineflags.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenCluster(lpszclustername.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider(lpszresource.rawAddress.toString(), lpszprovider.rawAddress.toString(), dwtype.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx(lpszresource.rawAddress.toString(), lpszkeyname.rawAddress.toString(), lpszprovider.rawAddress.toString(), dwtype.toInt(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: MutPtr): Hcluster =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterEx(lpszclustername.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterGroup(hcluster.toString(), lpszgroupname.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx(hcluster.toString(), lpszgroupname.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet(hcluster.toString(), lpszgroupsetname.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface(hcluster.toString(), lpszinterfacename.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetinterface =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx(hcluster.toString(), lpszinterfacename.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetwork(hcluster.toString(), lpsznetworkname.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetwork =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx(hcluster.toString(), lpsznetworkname.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNode(hcluster.toString(), lpsznodename.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(hcluster.toString(), nodeid.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnode =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx(hcluster.toString(), lpsznodename.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterResource(hcluster.toString(), lpszresourcename.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx(hcluster.toString(), lpszresourcename.rawAddress.toString(), dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringPauseClusterNode(hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2(hnode.toString(), bdrainnode, dwpauseflags.toInt(), hnodedraintarget.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: MutPtr, instanceversionlow: MutPtr, versionstatus: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion(appinstanceid.rawAddress.toString(), instanceversionhigh.rawAddress.toString(), instanceversionlow.rawAddress.toString(), versionstatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: ConstPtr, childreninheritappinstance: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRegisterAppInstance(processhandle.rawAddress.toString(), appinstanceid.rawAddress.toString(), childreninheritappinstance).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion(appinstanceid.rawAddress.toString(), instanceversionhigh.toString(), instanceversionlow.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRegisterClusterNotify(hchange.toString(), dwfiltertype.toInt(), hobject.rawAddress.toString(), dwnotifykey.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2(hchange.toString(), hcluster.toString(), flags.toString(), restypename.rawAddress.toString(), dwnotifykey.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(hgroup.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx(hgroup.toString(), hdependson.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(hgroupset.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx(hgroupset.toString(), hdependson.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(hgroup.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx(hgroup.toString(), hdependson.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(hcluster.toString(), bdeletecomputerobjects).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(hresource.toString(), hdependson.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx(hresource.toString(), hdependson.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(hresource.toString(), hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx(hresource.toString(), hnode.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode(hcluster.toString(), lpszclusterstorageenclosurename.rawAddress.toString(), dwtimeout.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency(hdependentgroupset.toString(), lpremoteclustername.rawAddress.toString(), lpremotegroupsetname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(hresource.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), pcboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree(pszpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupGroup(group: Hgroup, copy: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupGroup(group.toString(), copy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock(poutparams.rawAddress.toString(), pinparams.rawAddress.toString(), ppropertytable.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupResource(group: Hresource, copy: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupResource(group.toString(), copy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringResUtilDupString(pszinstring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumGroups(hcluster.toString(), hself.toString(), 0L.toString(), pparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx(hcluster.toString(), hself.toString(), grouptype, 0L.toString(), pparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties(hkeyclusterkey.rawAddress.toString(), pszoutproperties.rawAddress.toString(), cboutpropertiessize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumProperties(ppropertytable: ConstPtr, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumProperties(ppropertytable.rawAddress.toString(), pszoutproperties.rawAddress.toString(), cboutpropertiessize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumResources(hself.toString(), lpszrestypename.rawAddress.toString(), 0L.toString(), pparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx(hcluster.toString(), hself.toString(), lpszrestypename.rawAddress.toString(), 0L.toString(), pparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr, dwdesiredaccess: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2(hcluster.toString(), hself.toString(), lpszrestypename.rawAddress.toString(), 0L.toString(), pparameter.rawAddress.toString(), dwdesiredaccess.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings(pszsrc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindBinaryProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pbpropertyvalue.rawAddress.toString(), pcbpropertyvaluesize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter(hcluster.toString(), hresource.toString(), pszdriveletter.rawAddress.toString(), pcchdriveletter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindDwordProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pdwpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindExpandSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindExpandedSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindFileTimeProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pftpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindLongProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), plpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindMultiSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString(), pcbpropertyvaluesize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), pszpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty(ppropertylist.rawAddress.toString(), cbpropertylistsize.toInt(), pszpropertyname.rawAddress.toString(), plpropertyvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFreeEnvironment(lpenvironment: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment(lpenvironment.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilFreeParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr) {
    if (windowsWin32NetworkingClusteringNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock(poutparams.rawAddress.toString(), pinparams.rawAddress.toString(), ppropertytable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetBinaryProperty(ppboutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pboldvalue: ConstPtr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty(ppboutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString(), pvaluestruct.rawAddress.toString(), pboldvalue.rawAddress.toString(), cboldvaluesize.toInt(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), ppboutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType(hgroup.toString(), grouptype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterId(hcluster.toString(), guid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(hcluster.toString(), eclusterrole) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: MutPtr, phclusteripaddressresource: MutPtr, phclusterquorumresource: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources(hcluster.toString(), phclusternameresource.rawAddress.toString(), phclusteripaddressresource.rawAddress.toString(), phclusterquorumresource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: MutPtr, phclusterquorumresourceout: MutPtr, dwdesiredaccess: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx(hclusterin.toString(), phclusternameresourceout.rawAddress.toString(), phclusterquorumresourceout.rawAddress.toString(), dwdesiredaccess.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(hcluster.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetDwordProperty(pdwoutvalue: MutPtr, pvaluestruct: ConstPtr, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty(pdwoutvalue.rawAddress.toString(), pvaluestruct.rawAddress.toString(), dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: MutPtr, dwdefaultvalue: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), pdwoutvalue.rawAddress.toString(), dwdefaultvalue.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): MutPtr =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName(hresource.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetFileTimeProperty(pftoutvalue: MutPtr, pvaluestruct: ConstPtr, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetLongProperty(ploutvalue: MutPtr, pvaluestruct: ConstPtr, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty(ploutvalue.rawAddress.toString(), pvaluestruct.rawAddress.toString(), loldvalue, lminimum, lmaximum, pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty(ppszoutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString(), pvaluestruct.rawAddress.toString(), pszoldvalue.rawAddress.toString(), cboldvaluesize.toInt(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties(hkeyclusterkey.rawAddress.toString(), poutpropertylist.rawAddress.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutparams: MutPtr, bcheckforrequiredproperties: Bool, psznameofpropinerror: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), poutparams.rawAddress.toString(), bcheckforrequiredproperties, psznameofpropinerror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, poutpropertyitem: MutPtr, pcboutpropertyitemsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetProperty(hkeyclusterkey.rawAddress.toString(), ppropertytableitem.rawAddress.toString(), poutpropertyitem.rawAddress.toString(), pcboutpropertyitemsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertyFormats(ppropertytable: ConstPtr, poutpropertyformatlist: MutPtr, cbpropertyformatlistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats(ppropertytable.rawAddress.toString(), poutpropertyformatlist.rawAddress.toString(), cbpropertyformatlistsize.toInt(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, pcboutpropertylistsize: MutPtr, pnpropertycount: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize(hkeyclusterkey.rawAddress.toString(), ppropertytableitem.rawAddress.toString(), pcboutpropertylistsize.rawAddress.toString(), pnpropertycount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: MutPtr, qwdefaultvalue: ULong): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), pqwoutvalue.rawAddress.toString(), qwdefaultvalue.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency(hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass(hcluster.toString(), hself.rawAddress.toString(), prci.rawAddress.toString(), brecurse).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx(hcluster.toString(), hself.rawAddress.toString(), prci.rawAddress.toString(), brecurse, dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName(hcluster.toString(), hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), brecurse).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx(hcluster.toString(), hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), brecurse, dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx(hself.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: MutPtr, pszsubnetmask: Pwstr, pcchsubnetmask: MutPtr, psznetwork: Pwstr, pcchnetwork: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps(hresource.toString(), pszaddress.rawAddress.toString(), pcchaddress.rawAddress.toString(), pszsubnetmask.rawAddress.toString(), pcchsubnetmask.rawAddress.toString(), psznetwork.rawAddress.toString(), pcchnetwork.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceName(hresource.toString(), pszresourcename.rawAddress.toString(), pcchresourcenameinout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency(lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx(lpszresourcename.rawAddress.toString(), lpszresourcetype.rawAddress.toString(), dwdesiredaccess.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetSzProperty(ppszoutvalue: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty(ppszoutvalue.rawAddress.toString(), pvaluestruct.rawAddress.toString(), pszoldvalue.rawAddress.toString(), pppropertylist.rawAddress.toString(), pcbpropertylistsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    if (windowsWin32NetworkingClusteringNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingClusteringResUtilGetSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual(hself.toString(), hgroup.toString(), pequal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilIsPathValid(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilIsResourceClassEqual(prci: MutPtr, hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual(prci.rawAddress.toString(), hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilLeftPaxosIsLessThanRight(left: ConstPtr, right: ConstPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight(left.rawAddress.toString(), right.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilNodeEnum(hcluster.toString(), 0L.toString(), pparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilPaxosComparer(left: ConstPtr, right: ConstPtr): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer(left.rawAddress.toString(), right.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: MutPtr, pinparams: ConstPtr, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock(ppropertytable.rawAddress.toString(), poutpropertylist.rawAddress.toString(), pcboutpropertylistsize.rawAddress.toString(), pinparams.rawAddress.toString(), pcbbytesreturned.rawAddress.toString(), pcbrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment(pszservicename.rawAddress.toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum(hself.toString(), enumtype.toInt(), 0L.toString(), pparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual(lpszresourcetypename.rawAddress.toString(), hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(hself.toString(), hresource.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: ConstPtr, cbnewvaluesize: UInt, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), pbnewvalue.rawAddress.toString(), cbnewvaluesize.toInt(), ppboutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), dwnewvalue.toInt(), pdwoutvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), psznewvalue.rawAddress.toString(), ppszoutstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), psznewvalue.rawAddress.toString(), cbnewvaluesize.toInt(), ppszoutvalue.rawAddress.toString(), pcboutvaluesize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList(hkeyclusterkey.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), pinparams.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), poutparams.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), pinparams.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), bforcewrite, poutparams.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), ballowunknownproperties, pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), poutparams.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), ballowunknownproperties, pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), bforcewrite, poutparams.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), qwnewvalue.toString(), pqwoutvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment(pszservicename.rawAddress.toString(), hresource.toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters(pszservicename.rawAddress.toString(), schscmhandle.rawAddress.toString(), phservice.rawAddress.toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx(pszservicename.rawAddress.toString(), schscmhandle.rawAddress.toString(), phservice.rawAddress.toString(), dwdesiredaccess.toInt(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetSzValue(hkeyclusterkey.rawAddress.toString(), pszvaluename.rawAddress.toString(), psznewvalue.rawAddress.toString(), ppszoutstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties(hkeyclusterkey.rawAddress.toString(), ppropertytable.rawAddress.toString(), pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuesize: UInt, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilSetValueEx(hkeyclusterkey.rawAddress.toString(), valuename.rawAddress.toString(), valuetype.toInt(), valuedata.rawAddress.toString(), valuesize.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilStartResourceService(pszservicename.rawAddress.toString(), phservicehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilStopResourceService(pszservicename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilStopService(hservicehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, pdwresourcestate.rawAddress.toString(), 0L.toString(), hresourcehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList(pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyPropertyTable(ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable(ppropertytable.rawAddress.toString(), reserved.rawAddress.toString(), ballowunknownproperties, pinpropertylist.rawAddress.toString(), cbinpropertylistsize.toInt(), poutparams.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService(pszservicename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyService(hservicehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), presult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree(key.rawAddress.toString(), keyname.rawAddress.toString(), treatnokeyaserror).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetAllAppInstanceVersions(): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRestartClusterResource(hresource.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx(hresource.toString(), dwflags.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase(lpszpathname.rawAddress.toString(), bforce, lpszquorumdriveletter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResumeClusterNode(hnode.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2(hnode.toString(), eresumefailbacktype, dwresumeflagsreserved.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags(processhandle.rawAddress.toString(), mask.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupName(hgroup.toString(), lpszgroupname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx(hgroup.toString(), lpszgroupname.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList(hgroup.toString(), nodecount.toInt(), nodelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx(hgroup.toString(), nodecount.toInt(), nodelist.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression(hgroupset.toString(), lpszdependencyexprssion.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx(hgroupset.toString(), lpszdependencyexpression.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterName(hcluster.toString(), lpsznewclustername.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNameEx(hcluster.toString(), lpsznewclustername.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNetworkName(hnetwork.toString(), lpszname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx(hnetwork.toString(), lpszname.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: ConstPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder(hcluster.toString(), networkcount.toInt(), networklist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource(hresource.toString(), lpszdevicename.rawAddress.toString(), dwmaxquologsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx(hresource.toString(), lpszdevicename.rawAddress.toString(), dwmaxquorumlogsize.toInt(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression(hresource.toString(), lpszdependencyexpression.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterResourceName(hresource.toString(), lpszresourcename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx(hresource.toString(), lpszresourcename.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: MutPtr, lpcbreturnstatusbuffersize: MutPtr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword(lpszclustername.rawAddress.toString(), lpsznewpassword.rawAddress.toString(), dwflags.toInt(), lpreturnstatusbuffer.rawAddress.toString(), lpcbreturnstatusbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression(hgroup.toString(), lpszdependencyexpression.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    if (windowsWin32NetworkingClusteringNapiAvailable) wasmWindowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx(hgroup.toString(), lpszdependencyexpression.rawAddress.toString(), lpszreason.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
