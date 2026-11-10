@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWin32DevicesSensorsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: COpaquePointer?, ptargetbuffersizeinbytes: COpaquePointer?, ptargetbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize((sourcecollection?.value ?: 0L).toString(), (ptargetbuffersizeinbytes?.value ?: 0L).toString(), (ptargetbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListCopyAndMarshall(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall((target?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: COpaquePointer?, targetcollection: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), (sourcebuffer?.value ?: 0L).toString(), (targetcollection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSize(collection: COpaquePointer?): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize((collection?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: COpaquePointer?): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization((collection?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListGetSerializedSize(collection: COpaquePointer?): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize((collection?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListMarshall(target: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListMarshall((target?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSerializeToBuffer(sourcecollection: COpaquePointer?, targetbuffersizeinbytes: UInt, targetbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer((sourcecollection?.value ?: 0L).toString(), targetbuffersizeinbytes.toInt(), (targetbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: COpaquePointer?, pcollection: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence((thresholds?.value ?: 0L).toString(), (pcollection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun collectionsListUpdateMarshalledPointer(collection: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer((collection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateActivityThresholds(newsample: COpaquePointer?, oldsample: COpaquePointer?, thresholds: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_evaluateActivityThresholds((newsample?.value ?: 0L).toString(), (oldsample?.value ?: 0L).toString(), (thresholds?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerformanceTime(timems: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_getPerformanceTime((timems?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSIDArray(members: COpaquePointer?, size: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray((members?.value ?: 0L).toString(), size.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(fltval.toDouble(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCollectionListSame(lista: COpaquePointer?, listb: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_isCollectionListSame((lista?.value ?: 0L).toString(), (listb?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIDPresentInList(guidarray: COpaquePointer?, arraylength: UInt, guidelem: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_isGUIDPresentInList((guidarray?.value ?: 0L).toString(), arraylength.toInt(), (guidelem?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInCollectionList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isKeyPresentInPropertyList(plist: COpaquePointer?, pkey: COpaquePointer?): Boolean =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSensorSubscribed(subscriptionlist: COpaquePointer?, currenttype: Guid): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetBool(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetDouble(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFileTime(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetFloat(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetGuid(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt32(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetInt64(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthInt64(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), occurrence.toInt(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUlong(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), occurrence.toInt(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetNthUshort(plist: COpaquePointer?, pkey: COpaquePointer?, occurrence: UInt, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), occurrence.toInt(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), typecheck, (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUlong(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeyGetUshort(plist: COpaquePointer?, pkey: COpaquePointer?, pretvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pretvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propKeyFindKeySetPropVariant(plist: COpaquePointer?, pkey: COpaquePointer?, typecheck: Boolean, pvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant((plist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), typecheck, (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInformation(propvariantvalue: COpaquePointer?, propvariantoffset: COpaquePointer?, propvariantsize: COpaquePointer?, propvariantpointer: COpaquePointer?, remappedtype: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propVariantGetInformation((propvariantvalue?.value ?: 0L).toString(), (propvariantoffset?.value ?: 0L).toString(), (propvariantsize?.value ?: 0L).toString(), (propvariantpointer?.value ?: 0L).toString(), (remappedtype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListCopy(target: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propertiesListCopy((target?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(buffersizebytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: COpaquePointer?, pkey: COpaquePointer?, pvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(index.toInt(), (psensorslist?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32DevicesSensorsNapiAddon != null) (_windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_serializationBufferAllocate(sizeinbytes.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun serializationBufferFree(buffer: COpaquePointer?) {
    if (_windowsWin32DevicesSensorsNapiAddon != null) {
        _windowsWin32DevicesSensorsNapiAddon.windowssys_windows_win32_devices_sensors_serializationBufferFree((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
