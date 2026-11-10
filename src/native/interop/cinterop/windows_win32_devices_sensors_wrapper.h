#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_sensors_collectionsListAllocateBufferAndSerialize(void* sourcecollection, void* ptargetbuffersizeinbytes, void* ptargetbuffer);
int32_t windowssys_windows_win32_devices_sensors_collectionsListCopyAndMarshall(void* target, void* source);
int32_t windowssys_windows_win32_devices_sensors_collectionsListDeserializeFromBuffer(uint32_t sourcebuffersizeinbytes, void* sourcebuffer, void* targetcollection);
uint32_t windowssys_windows_win32_devices_sensors_collectionsListGetFillableCount(uint32_t buffersizebytes);
uint32_t windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSize(void* collection);
uint32_t windowssys_windows_win32_devices_sensors_collectionsListGetMarshalledSizeWithoutSerialization(void* collection);
uint32_t windowssys_windows_win32_devices_sensors_collectionsListGetSerializedSize(void* collection);
int32_t windowssys_windows_win32_devices_sensors_collectionsListMarshall(void* target);
int32_t windowssys_windows_win32_devices_sensors_collectionsListSerializeToBuffer(void* sourcecollection, uint32_t targetbuffersizeinbytes, void* targetbuffer);
int32_t windowssys_windows_win32_devices_sensors_collectionsListSortSubscribedActivitiesByConfidence(void* thresholds, void* pcollection);
int32_t windowssys_windows_win32_devices_sensors_collectionsListUpdateMarshalledPointer(void* collection);
bool windowssys_windows_win32_devices_sensors_evaluateActivityThresholds(void* newsample, void* oldsample, void* thresholds);
int32_t windowssys_windows_win32_devices_sensors_getPerformanceTime(void* timems);
int32_t windowssys_windows_win32_devices_sensors_initPropVariantFromCLSIDArray(void* members, uint32_t size, void* ppropvar);
int32_t windowssys_windows_win32_devices_sensors_initPropVariantFromFloat(float fltval, void* ppropvar);
bool windowssys_windows_win32_devices_sensors_isCollectionListSame(void* lista, void* listb);
bool windowssys_windows_win32_devices_sensors_isGUIDPresentInList(void* guidarray, uint32_t arraylength, void* guidelem);
bool windowssys_windows_win32_devices_sensors_isKeyPresentInCollectionList(void* plist, void* pkey);
bool windowssys_windows_win32_devices_sensors_isKeyPresentInPropertyList(void* plist, void* pkey);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetBool(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetDouble(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFileTime(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetFloat(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetGuid(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt32(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetInt64(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthInt64(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUlong(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetNthUshort(void* plist, void* pkey, uint32_t occurrence, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUlong(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeyGetUshort(void* plist, void* pkey, void* pretvalue);
int32_t windowssys_windows_win32_devices_sensors_propKeyFindKeySetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue);
int32_t windowssys_windows_win32_devices_sensors_propVariantGetInformation(void* propvariantvalue, void* propvariantoffset, void* propvariantsize, void* propvariantpointer, void* remappedtype);
int32_t windowssys_windows_win32_devices_sensors_propertiesListCopy(void* target, void* source);
uint32_t windowssys_windows_win32_devices_sensors_propertiesListGetFillableCount(uint32_t buffersizebytes);
int32_t windowssys_windows_win32_devices_sensors_sensorCollectionGetAt(uint32_t arg_0_index, void* psensorslist, void* pkey, void* pvalue);
int32_t windowssys_windows_win32_devices_sensors_serializationBufferAllocate(uint32_t sizeinbytes, void* pbuffer);
void windowssys_windows_win32_devices_sensors_serializationBufferFree(void* buffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_SENSORS_WINDOWS_WIN32_DEVICES_SENSORS_WRAPPER_H */
