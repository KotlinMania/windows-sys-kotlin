package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val DMO_ENUMF_INCLUDE_KEYED: DmoEnumFlags = 1

public val DMO_E_INVALIDSTREAMINDEX: Hresult = 0x80040201u.toInt()

public val DMO_E_INVALIDTYPE: Hresult = 0x80040202u.toInt()

public val DMO_E_NOTACCEPTING: Hresult = 0x80040204u.toInt()

public val DMO_E_NO_MORE_ITEMS: Hresult = 0x80040206u.toInt()

public val DMO_E_TYPE_NOT_ACCEPTED: Hresult = 0x80040205u.toInt()

public val DMO_E_TYPE_NOT_SET: Hresult = 0x80040203u.toInt()

public val DMO_INPLACE_NORMAL: DmoInplaceProcessFlags = 0

public val DMO_INPLACE_ZERO: DmoInplaceProcessFlags = 1

public val DMO_INPUT_DATA_BUFFERF_DISCONTINUITY: DmoInputDataBufferFlags = 8

public val DMO_INPUT_DATA_BUFFERF_SYNCPOINT: DmoInputDataBufferFlags = 1

public val DMO_INPUT_DATA_BUFFERF_TIME: DmoInputDataBufferFlags = 2

public val DMO_INPUT_DATA_BUFFERF_TIMELENGTH: DmoInputDataBufferFlags = 4

public val DMO_INPUT_STATUSF_ACCEPT_DATA: DmoInputStatusFlags = 1

public val DMO_INPUT_STREAMF_FIXED_SAMPLE_SIZE: DmoInputStreamInfoFlags = 4

public val DMO_INPUT_STREAMF_HOLDS_BUFFERS: DmoInputStreamInfoFlags = 8

public val DMO_INPUT_STREAMF_SINGLE_SAMPLE_PER_BUFFER: DmoInputStreamInfoFlags = 2

public val DMO_INPUT_STREAMF_WHOLE_SAMPLES: DmoInputStreamInfoFlags = 1

public val DMO_OUTPUT_DATA_BUFFERF_DISCONTINUITY: DmoOutputDataBufferFlags = 8

public val DMO_OUTPUT_DATA_BUFFERF_INCOMPLETE: DmoOutputDataBufferFlags = 16777216

public val DMO_OUTPUT_DATA_BUFFERF_SYNCPOINT: DmoOutputDataBufferFlags = 1

public val DMO_OUTPUT_DATA_BUFFERF_TIME: DmoOutputDataBufferFlags = 2

public val DMO_OUTPUT_DATA_BUFFERF_TIMELENGTH: DmoOutputDataBufferFlags = 4

public val DMO_OUTPUT_STREAMF_DISCARDABLE: DmoOutputStreamInfoFlags = 8

public val DMO_OUTPUT_STREAMF_FIXED_SAMPLE_SIZE: DmoOutputStreamInfoFlags = 4

public val DMO_OUTPUT_STREAMF_OPTIONAL: DmoOutputStreamInfoFlags = 16

public val DMO_OUTPUT_STREAMF_SINGLE_SAMPLE_PER_BUFFER: DmoOutputStreamInfoFlags = 2

public val DMO_OUTPUT_STREAMF_WHOLE_SAMPLES: DmoOutputStreamInfoFlags = 1

public val DMO_PROCESS_OUTPUT_DISCARD_WHEN_NO_BUFFER: DmoProcessOutputFlags = 1

public val DMO_QUALITY_STATUS_ENABLED: DmoQualityStatusFlags = 1

public val DMO_REGISTERF_IS_KEYED: DmoRegisterFlags = 1

public val DMO_SET_TYPEF_CLEAR: DmoSetTypeFlags = 2

public val DMO_SET_TYPEF_TEST_ONLY: DmoSetTypeFlags = 1

public val DMO_VOSF_NEEDS_PREVIOUS_SAMPLE: DmoVideoOutputStreamFlags = 1

public val DMOCATEGORY_ACOUSTIC_ECHO_CANCEL: Guid = Guid.fromU128(U128(0xbf963d80c55911d0uL, 0x8a2b00a0c9255ac1uL))

public val DMOCATEGORY_AGC: Guid = Guid.fromU128(U128(0xe88c9ba0c55711d0uL, 0x8a2b00a0c9255ac1uL))

public val DMOCATEGORY_AUDIO_CAPTURE_EFFECT: Guid = Guid.fromU128(U128(0xf665aaba3e094920uL, 0xaa5f219811148f09uL))

public val DMOCATEGORY_AUDIO_DECODER: Guid = Guid.fromU128(U128(0x57f2db8be6bb4513uL, 0x9d43dcd2a6593125uL))

public val DMOCATEGORY_AUDIO_EFFECT: Guid = Guid.fromU128(U128(0xf3602b3f059248dfuL, 0xa4cd674721e7ebebuL))

public val DMOCATEGORY_AUDIO_ENCODER: Guid = Guid.fromU128(U128(0x33d9a76190c811d0uL, 0xbd4300a0c911ce86uL))

public val DMOCATEGORY_AUDIO_NOISE_SUPPRESS: Guid = Guid.fromU128(U128(0xe07f903f62fd4e60uL, 0x8cdddea7236665b5uL))

public val DMOCATEGORY_VIDEO_DECODER: Guid = Guid.fromU128(U128(0x4a69b44228be4991uL, 0x969cb500adf5d8a8uL))

public val DMOCATEGORY_VIDEO_EFFECT: Guid = Guid.fromU128(U128(0xd990ee14776c4723uL, 0xbe463da2f56f10b9uL))

public val DMOCATEGORY_VIDEO_ENCODER: Guid = Guid.fromU128(U128(0x33d9a76090c811d0uL, 0xbd4300a0c911ce86uL))
