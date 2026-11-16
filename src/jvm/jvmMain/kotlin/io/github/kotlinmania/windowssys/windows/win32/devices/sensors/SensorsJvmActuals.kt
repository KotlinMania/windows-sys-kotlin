@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32DevicesSensorsJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32DevicesSensorsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection: Long, ptargetbuffersizeinbytes: Long, ptargetbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: Int, sourcebuffer: Long, targetcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection: Long, targetbuffersizeinbytes: Int, targetbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds: Long, pcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample: Long, oldsample: Long, thresholds: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members: Long, size: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval: Float, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista: Long, listb: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray: Long, arraylength: Int, guidelem: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist: Long, pkey: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist: Long, pkey: Long, occurrence: Int, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist: Long, pkey: Long, pretvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist: Long, pkey: Long, typecheck: Boolean, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue: Long, propvariantoffset: Long, propvariantsize: Long, propvariantpointer: Long, remappedtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index: Int, psensorslist: Long, pkey: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer: Long)
}

public actual fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr, ptargetbuffersizeinbytes: MutPtr, ptargetbuffer: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListAllocateBufferAndSerialize(sourcecollection.rawAddress, ptargetbuffersizeinbytes.rawAddress, ptargetbuffer.rawAddress)

public actual fun collectionsListCopyAndMarshall(target: MutPtr, source: ConstPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListCopyAndMarshall(target.rawAddress, source.rawAddress)

public actual fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr, targetcollection: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListDeserializeFromBuffer(sourcebuffersizeinbytes.toInt(), sourcebuffer.rawAddress, targetcollection.rawAddress)

public actual fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun collectionsListGetMarshalledSize(collection: ConstPtr): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSize(collection.rawAddress).toUInt()

public actual fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetMarshalledSizeWithoutSerialization(collection.rawAddress).toUInt()

public actual fun collectionsListGetSerializedSize(collection: ConstPtr): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListGetSerializedSize(collection.rawAddress).toUInt()

public actual fun collectionsListMarshall(target: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListMarshall(target.rawAddress)

public actual fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListSerializeToBuffer(sourcecollection.rawAddress, targetbuffersizeinbytes.toInt(), targetbuffer.rawAddress)

public actual fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr, pcollection: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListSortSubscribedActivitiesByConfidence(thresholds.rawAddress, pcollection.rawAddress)

public actual fun collectionsListUpdateMarshalledPointer(collection: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsCollectionsListUpdateMarshalledPointer(collection.rawAddress)

public actual fun evaluateActivityThresholds(newsample: ConstPtr, oldsample: ConstPtr, thresholds: ConstPtr): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsEvaluateActivityThresholds(newsample.rawAddress, oldsample.rawAddress, thresholds.rawAddress)

public actual fun getPerformanceTime(timems: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsGetPerformanceTime(timems.rawAddress)

public actual fun initPropVariantFromCLSIDArray(members: ConstPtr, size: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsInitPropVariantFromCLSIDArray(members.rawAddress, size.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr): Hresult =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsInitPropVariantFromFloat(fltval, ppropvar.rawAddress)

public actual fun isCollectionListSame(lista: ConstPtr, listb: ConstPtr): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsCollectionListSame(lista.rawAddress, listb.rawAddress)

public actual fun isGUIDPresentInList(guidarray: ConstPtr, arraylength: UInt, guidelem: ConstPtr): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsGUIDPresentInList(guidarray.rawAddress, arraylength.toInt(), guidelem.rawAddress)

public actual fun isKeyPresentInCollectionList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsKeyPresentInCollectionList(plist.rawAddress, pkey.rawAddress)

public actual fun isKeyPresentInPropertyList(plist: ConstPtr, pkey: ConstPtr): Boolean =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsIsKeyPresentInPropertyList(plist.rawAddress, pkey.rawAddress)

public actual fun isSensorSubscribed(subscriptionlist: ConstPtr, currenttype: Guid): Boolean =
    false

public actual fun propKeyFindKeyGetBool(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetBool(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetDouble(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetDouble(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetFileTime(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFileTime(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetFloat(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetFloat(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetGuid(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetGuid(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetInt32(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt32(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetInt64(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetInt64(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetNthInt64(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthInt64(plist.rawAddress, pkey.rawAddress, occurrence.toInt(), pretvalue.rawAddress)

public actual fun propKeyFindKeyGetNthUlong(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUlong(plist.rawAddress, pkey.rawAddress, occurrence.toInt(), pretvalue.rawAddress)

public actual fun propKeyFindKeyGetNthUshort(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetNthUshort(plist.rawAddress, pkey.rawAddress, occurrence.toInt(), pretvalue.rawAddress)

public actual fun propKeyFindKeyGetPropVariant(plist: ConstPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetPropVariant(plist.rawAddress, pkey.rawAddress, typecheck, pvalue.rawAddress)

public actual fun propKeyFindKeyGetUlong(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUlong(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeyGetUshort(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeyGetUshort(plist.rawAddress, pkey.rawAddress, pretvalue.rawAddress)

public actual fun propKeyFindKeySetPropVariant(plist: MutPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: ConstPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropKeyFindKeySetPropVariant(plist.rawAddress, pkey.rawAddress, typecheck, pvalue.rawAddress)

public actual fun propVariantGetInformation(propvariantvalue: ConstPtr, propvariantoffset: MutPtr, propvariantsize: MutPtr, propvariantpointer: MutPtr, remappedtype: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropVariantGetInformation(propvariantvalue.rawAddress, propvariantoffset.rawAddress, propvariantsize.rawAddress, propvariantpointer.rawAddress, remappedtype.rawAddress)

public actual fun propertiesListCopy(target: MutPtr, source: ConstPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropertiesListCopy(target.rawAddress, source.rawAddress)

public actual fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsPropertiesListGetFillableCount(buffersizebytes.toInt()).toUInt()

public actual fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr, pkey: MutPtr, pvalue: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsSensorCollectionGetAt(index.toInt(), psensorslist.rawAddress, pkey.rawAddress, pvalue.rawAddress)

public actual fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr): Ntstatus =
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsSerializationBufferAllocate(sizeinbytes.toInt(), pbuffer.rawAddress)

public actual fun serializationBufferFree(buffer: ConstPtr) {
    WindowsWin32DevicesSensorsJniBridge.windowssysWindowsWin32DevicesSensorsSerializationBufferFree(buffer.rawAddress)
}
