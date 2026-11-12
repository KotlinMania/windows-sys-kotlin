package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun collectionsListAllocateBufferAndSerialize(sourcecollection: ConstPtr, ptargetbuffersizeinbytes: MutPtr, ptargetbuffer: MutPtr): Ntstatus

public expect fun collectionsListCopyAndMarshall(target: MutPtr, source: ConstPtr): Ntstatus

public expect fun collectionsListDeserializeFromBuffer(sourcebuffersizeinbytes: UInt, sourcebuffer: ConstPtr, targetcollection: MutPtr): Ntstatus

public expect fun collectionsListGetFillableCount(buffersizebytes: UInt): UInt

public expect fun collectionsListGetMarshalledSize(collection: ConstPtr): UInt

public expect fun collectionsListGetMarshalledSizeWithoutSerialization(collection: ConstPtr): UInt

public expect fun collectionsListGetSerializedSize(collection: ConstPtr): UInt

public expect fun collectionsListMarshall(target: MutPtr): Ntstatus

public expect fun collectionsListSerializeToBuffer(sourcecollection: ConstPtr, targetbuffersizeinbytes: UInt, targetbuffer: MutPtr): Ntstatus

public expect fun collectionsListSortSubscribedActivitiesByConfidence(thresholds: ConstPtr, pcollection: MutPtr): Ntstatus

public expect fun collectionsListUpdateMarshalledPointer(collection: MutPtr): Ntstatus

public expect fun evaluateActivityThresholds(newsample: ConstPtr, oldsample: ConstPtr, thresholds: ConstPtr): Boolean

public expect fun getPerformanceTime(timems: MutPtr): Ntstatus

public expect fun initPropVariantFromCLSIDArray(members: ConstPtr, size: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromFloat(fltval: Float, ppropvar: MutPtr): Hresult

public expect fun isCollectionListSame(lista: ConstPtr, listb: ConstPtr): Boolean

public expect fun isGUIDPresentInList(guidarray: ConstPtr, arraylength: UInt, guidelem: ConstPtr): Boolean

public expect fun isKeyPresentInCollectionList(plist: ConstPtr, pkey: ConstPtr): Boolean

public expect fun isKeyPresentInPropertyList(plist: ConstPtr, pkey: ConstPtr): Boolean

public expect fun isSensorSubscribed(subscriptionlist: ConstPtr, currenttype: Guid): Boolean

public expect fun propKeyFindKeyGetBool(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetDouble(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetFileTime(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetFloat(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetGuid(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetInt32(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetInt64(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetNthInt64(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetNthUlong(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetNthUshort(plist: ConstPtr, pkey: ConstPtr, occurrence: UInt, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetPropVariant(plist: ConstPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetUlong(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeyGetUshort(plist: ConstPtr, pkey: ConstPtr, pretvalue: MutPtr): Ntstatus

public expect fun propKeyFindKeySetPropVariant(plist: MutPtr, pkey: ConstPtr, typecheck: Boolean, pvalue: ConstPtr): Ntstatus

public expect fun propVariantGetInformation(propvariantvalue: ConstPtr, propvariantoffset: MutPtr, propvariantsize: MutPtr, propvariantpointer: MutPtr, remappedtype: MutPtr): Ntstatus

public expect fun propertiesListCopy(target: MutPtr, source: ConstPtr): Ntstatus

public expect fun propertiesListGetFillableCount(buffersizebytes: UInt): UInt

public expect fun sensorCollectionGetAt(index: UInt, psensorslist: ConstPtr, pkey: MutPtr, pvalue: MutPtr): Ntstatus

public expect fun serializationBufferAllocate(sizeinbytes: UInt, pbuffer: MutPtr): Ntstatus

public expect fun serializationBufferFree(buffer: ConstPtr)
