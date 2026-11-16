package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val DC_BINNAMES: PrinterDeviceCapabilities = 12u.toUShort()

public val DC_BINS: PrinterDeviceCapabilities = 6u.toUShort()

public val DC_COLLATE: PrinterDeviceCapabilities = 22u.toUShort()

public val DC_COLORDEVICE: PrinterDeviceCapabilities = 32u.toUShort()

public val DC_COPIES: PrinterDeviceCapabilities = 18u.toUShort()

public val DC_DRIVER: PrinterDeviceCapabilities = 11u.toUShort()

public val DC_DUPLEX: PrinterDeviceCapabilities = 7u.toUShort()

public val DC_ENUMRESOLUTIONS: PrinterDeviceCapabilities = 13u.toUShort()

public val DC_EXTRA: PrinterDeviceCapabilities = 9u.toUShort()

public val DC_FIELDS: PrinterDeviceCapabilities = 1u.toUShort()

public val DC_FILEDEPENDENCIES: PrinterDeviceCapabilities = 14u.toUShort()

public val DC_MAXEXTENT: PrinterDeviceCapabilities = 5u.toUShort()

public val DC_MEDIAREADY: PrinterDeviceCapabilities = 29u.toUShort()

public val DC_MEDIATYPENAMES: PrinterDeviceCapabilities = 34u.toUShort()

public val DC_MEDIATYPES: PrinterDeviceCapabilities = 35u.toUShort()

public val DC_MINEXTENT: PrinterDeviceCapabilities = 4u.toUShort()

public val DC_NUP: PrinterDeviceCapabilities = 33u.toUShort()

public val DC_ORIENTATION: PrinterDeviceCapabilities = 17u.toUShort()

public val DC_PAPERNAMES: PrinterDeviceCapabilities = 16u.toUShort()

public val DC_PAPERS: PrinterDeviceCapabilities = 2u.toUShort()

public val DC_PAPERSIZE: PrinterDeviceCapabilities = 3u.toUShort()

public val DC_PERSONALITY: PrinterDeviceCapabilities = 25u.toUShort()

public val DC_PRINTERMEM: PrinterDeviceCapabilities = 28u.toUShort()

public val DC_PRINTRATE: PrinterDeviceCapabilities = 26u.toUShort()

public val DC_PRINTRATEPPM: PrinterDeviceCapabilities = 31u.toUShort()

public val DC_PRINTRATEUNIT: PrinterDeviceCapabilities = 27u.toUShort()

public val DC_SIZE: PrinterDeviceCapabilities = 8u.toUShort()

public val DC_STAPLE: PrinterDeviceCapabilities = 30u.toUShort()

public val DC_TRUETYPE: PrinterDeviceCapabilities = 15u.toUShort()

public val DC_VERSION: PrinterDeviceCapabilities = 10u.toUShort()

public val PSINJECT_BEGINDEFAULTS: PsinjectPoint = 12u.toUShort()

public val PSINJECT_BEGINPAGESETUP: PsinjectPoint = 101u.toUShort()

public val PSINJECT_BEGINPROLOG: PsinjectPoint = 14u.toUShort()

public val PSINJECT_BEGINSETUP: PsinjectPoint = 16u.toUShort()

public val PSINJECT_BEGINSTREAM: PsinjectPoint = 1u.toUShort()

public val PSINJECT_BOUNDINGBOX: PsinjectPoint = 9u.toUShort()

public val PSINJECT_COMMENTS: PsinjectPoint = 11u.toUShort()

public val PSINJECT_DOCNEEDEDRES: PsinjectPoint = 5u.toUShort()

public val PSINJECT_DOCSUPPLIEDRES: PsinjectPoint = 6u.toUShort()

public val PSINJECT_DOCUMENTPROCESSCOLORS: PsinjectPoint = 10u.toUShort()

public val PSINJECT_DOCUMENTPROCESSCOLORSATEND: PsinjectPoint = 21u.toUShort()

public val PSINJECT_ENDDEFAULTS: PsinjectPoint = 13u.toUShort()

public val PSINJECT_ENDPAGECOMMENTS: PsinjectPoint = 107u.toUShort()

public val PSINJECT_ENDPAGESETUP: PsinjectPoint = 102u.toUShort()

public val PSINJECT_ENDPROLOG: PsinjectPoint = 15u.toUShort()

public val PSINJECT_ENDSETUP: PsinjectPoint = 17u.toUShort()

public val PSINJECT_ENDSTREAM: PsinjectPoint = 20u.toUShort()

public val PSINJECT_EOF: PsinjectPoint = 19u.toUShort()

public val PSINJECT_ORIENTATION: PsinjectPoint = 8u.toUShort()

public val PSINJECT_PAGEBBOX: PsinjectPoint = 106u.toUShort()

public val PSINJECT_PAGENUMBER: PsinjectPoint = 100u.toUShort()

public val PSINJECT_PAGEORDER: PsinjectPoint = 7u.toUShort()

public val PSINJECT_PAGES: PsinjectPoint = 4u.toUShort()

public val PSINJECT_PAGESATEND: PsinjectPoint = 3u.toUShort()

public val PSINJECT_PAGETRAILER: PsinjectPoint = 103u.toUShort()

public val PSINJECT_PLATECOLOR: PsinjectPoint = 104u.toUShort()

public val PSINJECT_PSADOBE: PsinjectPoint = 2u.toUShort()

public val PSINJECT_SHOWPAGE: PsinjectPoint = 105u.toUShort()

public val PSINJECT_TRAILER: PsinjectPoint = 18u.toUShort()

public val PSINJECT_VMRESTORE: PsinjectPoint = 201u.toUShort()

public val PSINJECT_VMSAVE: PsinjectPoint = 200u.toUShort()

public val PW_CLIENTONLY: PrintWindowFlags = 1u

public val XPS_COLOR_INTERPOLATION_SCRGBLINEAR: XpsColorInterpolation = 1

public val XPS_COLOR_INTERPOLATION_SRGBLINEAR: XpsColorInterpolation = 2

public val XPS_COLOR_TYPE_CONTEXT: XpsColorType = 3

public val XPS_COLOR_TYPE_SCRGB: XpsColorType = 2

public val XPS_COLOR_TYPE_SRGB: XpsColorType = 1

public val XPS_DASH_CAP_FLAT: XpsDashCap = 1

public val XPS_DASH_CAP_ROUND: XpsDashCap = 2

public val XPS_DASH_CAP_SQUARE: XpsDashCap = 3

public val XPS_DASH_CAP_TRIANGLE: XpsDashCap = 4

public val XPS_DOCUMENT_TYPE_OPENXPS: XpsDocumentType = 3

public val XPS_DOCUMENT_TYPE_UNSPECIFIED: XpsDocumentType = 1

public val XPS_DOCUMENT_TYPE_XPS: XpsDocumentType = 2

public val XPS_E_ABSOLUTE_REFERENCE: Hresult = 0x80520601u.toInt()

public val XPS_E_ALREADY_OWNED: Hresult = 0x80520503u.toInt()

public val XPS_E_BLEED_BOX_PAGE_DIMENSIONS_NOT_IN_SYNC: Hresult = 0x80520509u.toInt()

public val XPS_E_BOTH_PATHFIGURE_AND_ABBR_SYNTAX_PRESENT: Hresult = 0x80520507u.toInt()

public val XPS_E_BOTH_RESOURCE_AND_SOURCEATTR_PRESENT: Hresult = 0x80520508u.toInt()

public val XPS_E_CARET_OUTSIDE_STRING: Hresult = 0x80520305u.toInt()

public val XPS_E_CARET_OUT_OF_ORDER: Hresult = 0x80520306u.toInt()

public val XPS_E_COLOR_COMPONENT_OUT_OF_RANGE: Hresult = 0x80520506u.toInt()

public val XPS_E_DICTIONARY_ITEM_NAMED: Hresult = 0x80520401u.toInt()

public val XPS_E_DUPLICATE_NAMES: Hresult = 0x80520209u.toInt()

public val XPS_E_DUPLICATE_RESOURCE_KEYS: Hresult = 0x80520200u.toInt()

public val XPS_E_INDEX_OUT_OF_RANGE: Hresult = 0x80520500u.toInt()

public val XPS_E_INVALID_BLEED_BOX: Hresult = 0x80520004u.toInt()

public val XPS_E_INVALID_CONTENT_BOX: Hresult = 0x8052000Bu.toInt()

public val XPS_E_INVALID_CONTENT_TYPE: Hresult = 0x8052000Eu.toInt()

public val XPS_E_INVALID_FLOAT: Hresult = 0x80520007u.toInt()

public val XPS_E_INVALID_FONT_URI: Hresult = 0x8052000Au.toInt()

public val XPS_E_INVALID_LANGUAGE: Hresult = 0x80520000u.toInt()

public val XPS_E_INVALID_LOOKUP_TYPE: Hresult = 0x80520006u.toInt()

public val XPS_E_INVALID_MARKUP: Hresult = 0x8052000Cu.toInt()

public val XPS_E_INVALID_NAME: Hresult = 0x80520001u.toInt()

public val XPS_E_INVALID_NUMBER_OF_COLOR_CHANNELS: Hresult = 0x80520602u.toInt()

public val XPS_E_INVALID_NUMBER_OF_POINTS_IN_CURVE_SEGMENTS: Hresult = 0x80520600u.toInt()

public val XPS_E_INVALID_OBFUSCATED_FONT_URI: Hresult = 0x8052000Fu.toInt()

public val XPS_E_INVALID_PAGE_SIZE: Hresult = 0x80520003u.toInt()

public val XPS_E_INVALID_RESOURCE_KEY: Hresult = 0x80520002u.toInt()

public val XPS_E_INVALID_SIGNATUREBLOCK_MARKUP: Hresult = 0x8052038Bu.toInt()

public val XPS_E_INVALID_THUMBNAIL_IMAGE_TYPE: Hresult = 0x80520005u.toInt()

public val XPS_E_INVALID_XML_ENCODING: Hresult = 0x8052000Du.toInt()

public val XPS_E_MAPPING_OUTSIDE_INDICES: Hresult = 0x80520304u.toInt()

public val XPS_E_MAPPING_OUTSIDE_STRING: Hresult = 0x80520303u.toInt()

public val XPS_E_MAPPING_OUT_OF_ORDER: Hresult = 0x80520302u.toInt()

public val XPS_E_MARKUP_COMPATIBILITY_ELEMENTS: Hresult = 0x80520389u.toInt()

public val XPS_E_MISSING_COLORPROFILE: Hresult = 0x80520104u.toInt()

public val XPS_E_MISSING_DISCARDCONTROL: Hresult = 0x80520112u.toInt()

public val XPS_E_MISSING_DOCUMENT: Hresult = 0x80520109u.toInt()

public val XPS_E_MISSING_DOCUMENTSEQUENCE_RELATIONSHIP: Hresult = 0x80520108u.toInt()

public val XPS_E_MISSING_FONTURI: Hresult = 0x80520107u.toInt()

public val XPS_E_MISSING_GLYPHS: Hresult = 0x80520102u.toInt()

public val XPS_E_MISSING_IMAGE_IN_IMAGEBRUSH: Hresult = 0x8052010Eu.toInt()

public val XPS_E_MISSING_LOOKUP: Hresult = 0x80520101u.toInt()

public val XPS_E_MISSING_NAME: Hresult = 0x80520100u.toInt()

public val XPS_E_MISSING_PAGE_IN_DOCUMENT: Hresult = 0x8052010Cu.toInt()

public val XPS_E_MISSING_PAGE_IN_PAGEREFERENCE: Hresult = 0x8052010Du.toInt()

public val XPS_E_MISSING_PART_REFERENCE: Hresult = 0x80520110u.toInt()

public val XPS_E_MISSING_PART_STREAM: Hresult = 0x80520113u.toInt()

public val XPS_E_MISSING_REFERRED_DOCUMENT: Hresult = 0x8052010Au.toInt()

public val XPS_E_MISSING_REFERRED_PAGE: Hresult = 0x8052010Bu.toInt()

public val XPS_E_MISSING_RELATIONSHIP_TARGET: Hresult = 0x80520105u.toInt()

public val XPS_E_MISSING_RESOURCE_KEY: Hresult = 0x8052010Fu.toInt()

public val XPS_E_MISSING_RESOURCE_RELATIONSHIP: Hresult = 0x80520106u.toInt()

public val XPS_E_MISSING_RESTRICTED_FONT_RELATIONSHIP: Hresult = 0x80520111u.toInt()

public val XPS_E_MISSING_SEGMENT_DATA: Hresult = 0x80520103u.toInt()

public val XPS_E_MULTIPLE_DOCUMENTSEQUENCE_RELATIONSHIPS: Hresult = 0x80520202u.toInt()

public val XPS_E_MULTIPLE_PRINTTICKETS_ON_DOCUMENT: Hresult = 0x80520206u.toInt()

public val XPS_E_MULTIPLE_PRINTTICKETS_ON_DOCUMENTSEQUENCE: Hresult = 0x80520207u.toInt()

public val XPS_E_MULTIPLE_PRINTTICKETS_ON_PAGE: Hresult = 0x80520205u.toInt()

public val XPS_E_MULTIPLE_REFERENCES_TO_PART: Hresult = 0x80520208u.toInt()

public val XPS_E_MULTIPLE_RESOURCES: Hresult = 0x80520201u.toInt()

public val XPS_E_MULTIPLE_THUMBNAILS_ON_PACKAGE: Hresult = 0x80520204u.toInt()

public val XPS_E_MULTIPLE_THUMBNAILS_ON_PAGE: Hresult = 0x80520203u.toInt()

public val XPS_E_NEGATIVE_FLOAT: Hresult = 0x8052030Au.toInt()

public val XPS_E_NESTED_REMOTE_DICTIONARY: Hresult = 0x80520402u.toInt()

public val XPS_E_NOT_ENOUGH_GRADIENT_STOPS: Hresult = 0x8052050Bu.toInt()

public val XPS_E_NO_CUSTOM_OBJECTS: Hresult = 0x80520502u.toInt()

public val XPS_E_OBJECT_DETACHED: Hresult = 0x8052038Au.toInt()

public val XPS_E_ODD_BIDILEVEL: Hresult = 0x80520307u.toInt()

public val XPS_E_ONE_TO_ONE_MAPPING_EXPECTED: Hresult = 0x80520308u.toInt()

public val XPS_E_PACKAGE_ALREADY_OPENED: Hresult = 0x80520387u.toInt()

public val XPS_E_PACKAGE_NOT_OPENED: Hresult = 0x80520386u.toInt()

public val XPS_E_PACKAGE_WRITER_NOT_CLOSED: Hresult = 0x8052050Cu.toInt()

public val XPS_E_RELATIONSHIP_EXTERNAL: Hresult = 0x8052050Au.toInt()

public val XPS_E_RESOURCE_NOT_OWNED: Hresult = 0x80520504u.toInt()

public val XPS_E_RESTRICTED_FONT_NOT_OBFUSCATED: Hresult = 0x80520309u.toInt()

public val XPS_E_SIGNATUREID_DUP: Hresult = 0x80520388u.toInt()

public val XPS_E_SIGREQUESTID_DUP: Hresult = 0x80520385u.toInt()

public val XPS_E_STRING_TOO_LONG: Hresult = 0x80520300u.toInt()

public val XPS_E_TOO_MANY_INDICES: Hresult = 0x80520301u.toInt()

public val XPS_E_UNAVAILABLE_PACKAGE: Hresult = 0x80520114u.toInt()

public val XPS_E_UNEXPECTED_COLORPROFILE: Hresult = 0x80520505u.toInt()

public val XPS_E_UNEXPECTED_CONTENT_TYPE: Hresult = 0x80520008u.toInt()

public val XPS_E_UNEXPECTED_RELATIONSHIP_TYPE: Hresult = 0x80520010u.toInt()

public val XPS_E_UNEXPECTED_RESTRICTED_FONT_RELATIONSHIP: Hresult = 0x80520011u.toInt()

public val XPS_E_VISUAL_CIRCULAR_REF: Hresult = 0x80520501u.toInt()

public val XPS_E_XKEY_ATTR_PRESENT_OUTSIDE_RES_DICT: Hresult = 0x80520400u.toInt()

public val XPS_FILL_RULE_EVENODD: XpsFillRule = 1

public val XPS_FILL_RULE_NONZERO: XpsFillRule = 2

public val XPS_FONT_EMBEDDING_NORMAL: XpsFontEmbedding = 1

public val XPS_FONT_EMBEDDING_OBFUSCATED: XpsFontEmbedding = 2

public val XPS_FONT_EMBEDDING_RESTRICTED: XpsFontEmbedding = 3

public val XPS_FONT_EMBEDDING_RESTRICTED_UNOBFUSCATED: XpsFontEmbedding = 4

public val XPS_IMAGE_TYPE_JPEG: XpsImageType = 1

public val XPS_IMAGE_TYPE_JXR: XpsImageType = 5

public val XPS_IMAGE_TYPE_PNG: XpsImageType = 2

public val XPS_IMAGE_TYPE_TIFF: XpsImageType = 3

public val XPS_IMAGE_TYPE_WDP: XpsImageType = 4

public val XPS_INTERLEAVING_OFF: XpsInterleaving = 1

public val XPS_INTERLEAVING_ON: XpsInterleaving = 2

public val XPS_LINE_CAP_FLAT: XpsLineCap = 1

public val XPS_LINE_CAP_ROUND: XpsLineCap = 2

public val XPS_LINE_CAP_SQUARE: XpsLineCap = 3

public val XPS_LINE_CAP_TRIANGLE: XpsLineCap = 4

public val XPS_LINE_JOIN_BEVEL: XpsLineJoin = 2

public val XPS_LINE_JOIN_MITER: XpsLineJoin = 1

public val XPS_LINE_JOIN_ROUND: XpsLineJoin = 3

public val XPS_OBJECT_TYPE_CANVAS: XpsObjectType = 1

public val XPS_OBJECT_TYPE_GEOMETRY: XpsObjectType = 5

public val XPS_OBJECT_TYPE_GLYPHS: XpsObjectType = 2

public val XPS_OBJECT_TYPE_IMAGE_BRUSH: XpsObjectType = 7

public val XPS_OBJECT_TYPE_LINEAR_GRADIENT_BRUSH: XpsObjectType = 8

public val XPS_OBJECT_TYPE_MATRIX_TRANSFORM: XpsObjectType = 4

public val XPS_OBJECT_TYPE_PATH: XpsObjectType = 3

public val XPS_OBJECT_TYPE_RADIAL_GRADIENT_BRUSH: XpsObjectType = 9

public val XPS_OBJECT_TYPE_SOLID_COLOR_BRUSH: XpsObjectType = 6

public val XPS_OBJECT_TYPE_VISUAL_BRUSH: XpsObjectType = 10

public val XPS_SEGMENT_STROKE_PATTERN_ALL: XpsSegmentStrokePattern = 1

public val XPS_SEGMENT_STROKE_PATTERN_MIXED: XpsSegmentStrokePattern = 3

public val XPS_SEGMENT_STROKE_PATTERN_NONE: XpsSegmentStrokePattern = 2

public val XPS_SEGMENT_TYPE_ARC_LARGE_CLOCKWISE: XpsSegmentType = 1

public val XPS_SEGMENT_TYPE_ARC_LARGE_COUNTERCLOCKWISE: XpsSegmentType = 2

public val XPS_SEGMENT_TYPE_ARC_SMALL_CLOCKWISE: XpsSegmentType = 3

public val XPS_SEGMENT_TYPE_ARC_SMALL_COUNTERCLOCKWISE: XpsSegmentType = 4

public val XPS_SEGMENT_TYPE_BEZIER: XpsSegmentType = 5

public val XPS_SEGMENT_TYPE_LINE: XpsSegmentType = 6

public val XPS_SEGMENT_TYPE_QUADRATIC_BEZIER: XpsSegmentType = 7

public val XPS_SIGNATURE_STATUS_BROKEN: XpsSignatureStatus = 3

public val XPS_SIGNATURE_STATUS_INCOMPLETE: XpsSignatureStatus = 2

public val XPS_SIGNATURE_STATUS_INCOMPLIANT: XpsSignatureStatus = 1

public val XPS_SIGNATURE_STATUS_QUESTIONABLE: XpsSignatureStatus = 4

public val XPS_SIGNATURE_STATUS_VALID: XpsSignatureStatus = 5

public val XPS_SIGN_FLAGS_IGNORE_MARKUP_COMPATIBILITY: XpsSignFlags = 1

public val XPS_SIGN_FLAGS_NONE: XpsSignFlags = 0

public val XPS_SIGN_POLICY_ALL: XpsSignPolicy = 15

public val XPS_SIGN_POLICY_CORE_PROPERTIES: XpsSignPolicy = 1

public val XPS_SIGN_POLICY_DISCARD_CONTROL: XpsSignPolicy = 8

public val XPS_SIGN_POLICY_NONE: XpsSignPolicy = 0

public val XPS_SIGN_POLICY_PRINT_TICKET: XpsSignPolicy = 4

public val XPS_SIGN_POLICY_SIGNATURE_RELATIONSHIPS: XpsSignPolicy = 2

public val XPS_SPREAD_METHOD_PAD: XpsSpreadMethod = 1

public val XPS_SPREAD_METHOD_REFLECT: XpsSpreadMethod = 2

public val XPS_SPREAD_METHOD_REPEAT: XpsSpreadMethod = 3

public val XPS_STYLE_SIMULATION_BOLD: XpsStyleSimulation = 3

public val XPS_STYLE_SIMULATION_BOLDITALIC: XpsStyleSimulation = 4

public val XPS_STYLE_SIMULATION_ITALIC: XpsStyleSimulation = 2

public val XPS_STYLE_SIMULATION_NONE: XpsStyleSimulation = 1

public val XPS_THUMBNAIL_SIZE_LARGE: XpsThumbnailSize = 4

public val XPS_THUMBNAIL_SIZE_MEDIUM: XpsThumbnailSize = 3

public val XPS_THUMBNAIL_SIZE_SMALL: XpsThumbnailSize = 2

public val XPS_THUMBNAIL_SIZE_VERYSMALL: XpsThumbnailSize = 1

public val XPS_TILE_MODE_FLIPX: XpsTileMode = 3

public val XPS_TILE_MODE_FLIPXY: XpsTileMode = 5

public val XPS_TILE_MODE_FLIPY: XpsTileMode = 4

public val XPS_TILE_MODE_NONE: XpsTileMode = 1

public val XPS_TILE_MODE_TILE: XpsTileMode = 2

public val XPS_OM_OBJECT_FACTORY: Guid = Guid.fromU128(U128(0xe974d26d3d9b4d47uL, 0x88cc3872f2dc3585uL))

public val XPS_OM_THUMBNAIL_GENERATOR: Guid = Guid.fromU128(U128(0x7e4a23e2b9694761uL, 0xbe351a8ced58e323uL))

public val XPS_SIGNATURE_MANAGER: Guid = Guid.fromU128(U128(0xb0c43320231544a2uL, 0xb70a0943a140a8eeuL))
