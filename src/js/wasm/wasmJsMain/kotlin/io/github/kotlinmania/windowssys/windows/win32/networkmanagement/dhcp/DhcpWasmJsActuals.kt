@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementDhcpNapiAddon(): Boolean

private val windowsWin32NetworkmanagementDhcpNapiAvailable: Boolean = initWindowsWin32NetworkmanagementDhcpNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix(p0: String, p1: String, p2: String, p3: String): Int

public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: ConstPtr<DhcpFilterAddInfo>, forceflag: Bool): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4(serveripaddress.rawAddress.toString(), addfilterinfo.rawAddress.toString(), forceflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup(pserver.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer(flags.toInt(), idinfo.rawAddress.toString(), newserver.rawAddress.toString(), callbackfn.rawAddress.toString(), callbackdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementData>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), addelementinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV4>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), addelementinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV5>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), addelementinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: MutPtr<DhcpSubnetElementDataV6>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: MutPtr<Pwstr>, diskcheckinterval: MutPtr<UInt>, maxlogfilessize: MutPtr<UInt>, minspaceondisk: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams(serveripaddress.rawAddress.toString(), flags.toInt(), auditlogdir.rawAddress.toString(), diskcheckinterval.rawAddress.toString(), maxlogfilessize.rawAddress.toString(), minspaceondisk.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams(serveripaddress.rawAddress.toString(), flags.toInt(), auditlogdir.rawAddress.toString(), diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCApiCleanup() {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpCApiInitialize(version: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize(version.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption(serveripaddress.rawAddress.toString(), optionid.toInt(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: MutPtr<CVoid>, event: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange(flags.toInt(), reserved.rawAddress.toString(), event.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfoV6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: ConstPtr<DhcpAddrPattern>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4(serveripaddress.rawAddress.toString(), deletefilterinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer(flags.toInt(), idinfo.rawAddress.toString(), newserver.rawAddress.toString(), callbackfn.rawAddress.toString(), callbackdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), forceflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4(serveripaddress.rawAddress.toString(), superscopename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDsCleanup() {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpDsInit(): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArray>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), classinfoarray.rawAddress.toString(), nread.rawAddress.toString(), ntotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArrayV6>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), classinfoarray.rawAddress.toString(), nread.rawAddress.toString(), ntotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: MutPtr<DhcpAddrPattern>, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: MutPtr<MutPtr<DhcpFilterEnumInfo>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), listtype, enumfilterinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), optionvalues.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), optionvalues.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), optionvalues.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), options.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), options.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), options.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumServers(flags: UInt, idinfo: MutPtr<CVoid>, servers: MutPtr<MutPtr<DhcpdsServers>>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers(flags.toInt(), idinfo.rawAddress.toString(), servers.rawAddress.toString(), callbackfn.rawAddress.toString(), callbackdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientFilterStatusInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV4>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV5>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: MutPtr<DhcpIpv6Address>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV6>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayVq>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV4>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV5>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV6>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<DhcpIpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<Dhcpv6IpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues(serveripaddress.rawAddress.toString(), flags.toInt(), scopeinfo.rawAddress.toString(), values.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6(serveripaddress.rawAddress.toString(), flags.toInt(), scopeinfo.rawAddress.toString(), values.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions(serveripaddress.rawAddress.toString(), flags.toInt(), optionstruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionstruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: MutPtr<DhcpClassInfo>, filledclassinfo: MutPtr<MutPtr<DhcpClassInfo>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), partialclassinfo.rawAddress.toString(), filledclassinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfo>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV4>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfoV6>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV6>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoVq>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: MutPtr<MutPtr<DhcpOptionList>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions(serveripaddress.rawAddress.toString(), clientipaddress.toInt(), clientsubnetmask.toInt(), clientoptions.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: MutPtr<DhcpFilterGlobalInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4(serveripaddress.rawAddress.toString(), globalfilterinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfo>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo(serveripaddress.rawAddress.toString(), mibinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV5>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5(serveripaddress.rawAddress.toString(), mibinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV6>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6(serveripaddress.rawAddress.toString(), mibinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo(serveripaddress.rawAddress.toString(), optionid.toInt(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue(serveripaddress.rawAddress.toString(), optionid.toInt(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask(sadaptername.rawAddress.toString(), dwsubnetmask.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<DhcpBindElementArray>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementsinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<Dhcpv6BindElementArray>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementsinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: MutPtr<MutPtr<DhcpServerSpecificStrings>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings(serveripaddress.rawAddress.toString(), serverspecificstrings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: MutPtr<UShort>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), timedelayinmilliseconds.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfo>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoV6>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoVq>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: MutPtr<MutPtr<DhcpSuperScopeTable>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4(serveripaddress.rawAddress.toString(), superscopetable.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetThreadOptions(pflags: MutPtr<UInt>, reserved: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions(pflags.rawAddress.toString(), reserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion(serveripaddress.rawAddress.toString(), majorversion.rawAddress.toString(), minorversion.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyCondition(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: ConstPtr<UByte>, valuelength: UInt, conditionindex: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition(policy.rawAddress.toString(), parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), vendorname.rawAddress.toString(), operator, value.rawAddress.toString(), valuelength.toInt(), conditionindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyExpr(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr(policy.rawAddress.toString(), parentexpr.toInt(), operator, exprindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyRange(policy: MutPtr<DhcpPolicy>, range: ConstPtr<DhcpIpRange>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange(policy.rawAddress.toString(), range.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy(policyname.rawAddress.toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.rawAddress.toString(), enabled, policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx(policyname.rawAddress.toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.rawAddress.toString(), enabled, policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: ConstPtr<DhcpPropertyArray>, id: DhcpPropertyId, type: DhcpPropertyType): MutPtr<DhcpProperty> =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty(propertyarray.rawAddress.toString(), id, type).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprFreeV4DhcpProperty(property: MutPtr<DhcpProperty>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty(property.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: MutPtr<DhcpPropertyArray>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray(propertyarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4Policy(policy: MutPtr<DhcpPolicy>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy(policy.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: MutPtr<DhcpPolicyArray>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray(policyarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyEx(policyex: MutPtr<DhcpPolicyEx>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx(policyex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: MutPtr<DhcpPolicyExArray>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray(policyexarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprIsV4PolicySingleUC(policy: ConstPtr<DhcpPolicy>): Bool =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC(policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: ConstPtr<DhcpPolicy>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid(ppolicy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: ConstPtr<DhcpPolicy>): Bool =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed(ppolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprModifyV4PolicyExpr(policy: MutPtr<DhcpPolicy>, operator: DhcpPolLogicOper): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr(policy.rawAddress.toString(), operator).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprResetV4PolicyExpr(policy: MutPtr<DhcpPolicy>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr(policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, params: DhcpcapiParamsArray, handle: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption(serveripaddress.rawAddress.toString(), optionid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue(serveripaddress.rawAddress.toString(), optionid.toInt(), scopeinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementData>, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), removeelementinfo.rawAddress.toString(), forceflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV4>, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), removeelementinfo.rawAddress.toString(), forceflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV5>, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), removeelementinfo.rawAddress.toString(), forceflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: MutPtr<DhcpSubnetElementDataV6>, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRequestParams(flags: UInt, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRpcFreeMemory(bufferpointer: MutPtr<CVoid>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory(bufferpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: MutPtr<MutPtr<DhcpScanList>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), fixflag.toInt(), scanlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerAuditlogParamsFree(configinfo: MutPtr<DhcpServerConfigInfoVq>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree(configinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase(serveripaddress.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfo>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig(serveripaddress.rawAddress.toString(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV4>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4(serveripaddress.rawAddress.toString(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV6>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoVq>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ(serveripaddress.rawAddress.toString(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: MutPtr<MutPtr<DhcpAttrib>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute(serveripaddr.rawAddress.toString(), dwreserved.toInt(), dhcpattribid.toInt(), pdhcpattrib.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: MutPtr<UInt>, pdhcpattribarr: MutPtr<MutPtr<DhcpAttribArray>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes(serveripaddr.rawAddress.toString(), dwreserved.toInt(), dwattribcount.toInt(), pdhcpattribs.rawAddress.toString(), pdhcpattribarr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials(serveripaddress.rawAddress.toString(), unamesize.toInt(), uname.rawAddress.toString(), domainsize.toInt(), domain.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization(serveripaddr.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase(serveripaddress.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig(serveripaddress.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV4>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4(serveripaddress.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoVq>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ(serveripaddress.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials(serveripaddress.rawAddress.toString(), uname.rawAddress.toString(), domain.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5(serveripaddress.rawAddress.toString(), uname.rawAddress.toString(), domain.rawAddress.toString(), passwd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: ConstPtr<DhcpFilterGlobalInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4(serveripaddress.rawAddress.toString(), globalfilterinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo(serveripaddress.rawAddress.toString(), optionid.toInt(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: ConstPtr<DhcpOptionData>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue(serveripaddress.rawAddress.toString(), optionid.toInt(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalues: ConstPtr<DhcpOptionValueArray>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalues.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalues.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<DhcpBindElementArray>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<Dhcpv6BindElementArray>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), timedelayinmilliseconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), superscopename.rawAddress.toString(), changeexisting).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions(flags.toInt(), reserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams(flags.toInt(), reserved.rawAddress.toString(), adaptername.rawAddress.toString(), requestidstr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), policyname.rawAddress.toString(), range.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoPb>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoEx>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: ConstPtr<DhcpPolicy>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy(serveripaddress.rawAddress.toString(), ppolicy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: ConstPtr<DhcpPolicyEx>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx(serveripaddress.rawAddress.toString(), policyex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyExArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoPbArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoExArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpReservationInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship(serveripaddress.rawAddress.toString(), prelationship.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship(serveripaddress.rawAddress.toString(), prelationship.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship(serveripaddress.rawAddress.toString(), prelationshipname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship(serveripaddress.rawAddress.toString(), prelationship.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationshipArray>>, relationshipread: MutPtr<UInt>, relationshiptotal: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), prelationship.rawAddress.toString(), relationshipread.rawAddress.toString(), relationshiptotal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), pstatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship(serveripaddress.rawAddress.toString(), prelationshipname.rawAddress.toString(), prelationship.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship(serveripaddress.rawAddress.toString(), scopeid.toInt(), prelationship.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: MutPtr<MutPtr<DhcpFailoverStatistics>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics(serveripaddress.rawAddress.toString(), scopeid.toInt(), pstats.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: MutPtr<UInt>, pmaxalloweddeltatime: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime(serveripaddress.rawAddress.toString(), ptime.rawAddress.toString(), pmaxalloweddeltatime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship(serveripaddress.rawAddress.toString(), flags.toInt(), prelationship.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation(serveripaddress.rawAddress.toString(), pfailrelname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValuesPb>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues(serveripaddress.rawAddress.toString(), flags.toInt(), scopeinfo.rawAddress.toString(), values.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoPb>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoEx>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<DhcpIpArray>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress(serveripaddress.rawAddress.toString(), scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), ipaddrlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx(serveripaddress.rawAddress.toString(), globalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), enabled.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), policyname.rawAddress.toString(), range.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues(serveripaddress.rawAddress.toString(), flags.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalues.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicy>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy(serveripaddress.rawAddress.toString(), fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), enable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicyEx>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx(serveripaddress.rawAddress.toString(), fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<Dhcpv6IpArray>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: MutPtr<MutPtr<Dhcpv6StatelessStats>>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics(serveripaddress.rawAddress.toString(), statelessstats.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: MutPtr<MutPtr<Dhcpv6StatelessParams>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: ConstPtr<Dhcpv6StatelessParams>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6CApiCleanup() {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpv6CApiInitialize(version: MutPtr<UInt>) {
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize(version.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, leaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix(adaptername.rawAddress.toString(), classid.rawAddress.toString(), leaseinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>, bvalidateprefix: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix(adaptername.rawAddress.toString(), pclassid.rawAddress.toString(), prefixleaseinfo.rawAddress.toString(), pdwtimetowait.rawAddress.toString(), bvalidateprefix.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, recdparams: Dhcpv6capiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix(adaptername.rawAddress.toString(), pclassid.rawAddress.toString(), prefixleaseinfo.rawAddress.toString(), pdwtimetowait.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
