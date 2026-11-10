@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesSensorsNapiAddon(): Boolean

private val _windowsWin32DevicesSensorsNapiAvailable: Boolean = _initWindowsWin32DevicesSensorsNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListMarshall(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListMarshall(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_evaluateActivityThresholds(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_evaluateActivityThresholds(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_getPerformanceTime(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_getPerformanceTime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(p0: Double, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_isCollectionListSame(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_isCollectionListSame(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_isGUIDPresentInList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_isGUIDPresentInList(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propVariantGetInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propVariantGetInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propertiesListCopy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propertiesListCopy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_serializationBufferAllocate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_serializationBufferAllocate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_sensors_serializationBufferFree(p0)")
private external fun _wasm_windowssys_windows_win32_devices_sensors_serializationBufferFree(p0: String)

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: COpaquePointer?, ptargetbuffersizeinbytes: COpaquePointer?, ptargetbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize((sourcecollection?.value ?: 0L).toString(), (ptargetbuffersizeinbytes?.value ?: 0L).toString(), (ptargetbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListCopyAndMarshall(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall((target?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: COpaquePointer?, targetcollection: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), (sourcebuffer?.value ?: 0L).toString(), (targetcollection?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(buffersizebytes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSize(collection: COpaquePointer?): UInt =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize((collection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: COpaquePointer?): UInt =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization((collection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetSerializedSize(collection: COpaquePointer?): UInt =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize((collection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListMarshall(target: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListMarshall((target?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSerializeToBuffer(sourcecollection: COpaquePointer?, targetbuffersizeinbytes: UInt, targetbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer((sourcecollection?.value ?: 0L).toString(), targetbuffersizeinbytes.toInt(), (targetbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: COpaquePointer?, pcollection: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence((thresholds?.value ?: 0L).toString(), (pcollection?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListUpdateMarshalledPointer(collection: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer((collection?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateActivityThresholds(newsample: COpaquePointer?, oldsample: COpaquePointer?, thresholds: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_evaluateActivityThresholds((newsample?.value ?: 0L).toString(), (oldsample?.value ?: 0L).toString(), (thresholds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceTime(timems: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_getPerformanceTime((timems?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSIDArray(members: COpaquePointer?, size: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray((members?.value ?: 0L).toString(), size.toInt(), (ppropvar?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(fltval.toDouble(), (ppropvar?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCollectionListSame(lista: COpaquePointer?, listb: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_isCollectionListSame((lista?.value ?: 0L).toString(), (listb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIDPresentInList(guidarray: COpaquePointer?, arraylength: UInt, guidelem: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_isGUIDPresentInList((guidarray?.value ?: 0L).toString(), arraylength.toInt(), (guidelem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInCollectionList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInPropertyList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSensorSubscribed(subscriptionlist: COpaquePointer?, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetBool(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetDouble(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFileTime(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFloat(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetGuid(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt32(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt64(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthInt64(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), occurrence.toInt(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUlong(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), occurrence.toInt(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUshort(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), occurrence.toInt(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), typecheck, (pvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUlong(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUshort(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeySetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), typecheck, (pvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInformation(propvariantvalue: COpaquePointer?, propvariantoffset: COpaquePointer?, propvariantsize: COpaquePointer?, propvariantpointer: COpaquePointer?, remappedtype: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propVariantGetInformation((propvariantvalue?.value ?: 0L).toString(), (propvariantoffset?.value ?: 0L).toString(), (propvariantsize?.value ?: 0L).toString(), (propvariantpointer?.value ?: 0L).toString(), (remappedtype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListCopy(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propertiesListCopy((target?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(buffersizebytes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: COpaquePointer?, pkey: COpaquePointer?, pvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(index.toInt(), (psensorslist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAvailable) _wasm_windowssys_windows_win32_devices_sensors_serializationBufferAllocate(sizeinbytes.toInt(), (pbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferFree(buffer: COpaquePointer?) {
    if (_windowsWin32DevicesSensorsNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_sensors_serializationBufferFree((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
