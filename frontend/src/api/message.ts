const myHeaders = new Headers();
myHeaders.append('Content-Type', 'application/json');

export async function sendCanvasImage(imageData: string) {
  const url = 'http://localhost:8080/uploadCanvasImage';
  try {
    const response = await fetch(url, {
      method: 'POST',
      body: JSON.stringify({ image: imageData }),
      headers: myHeaders,
    });
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const json = await response.json();
    console.log(json);
  } catch (error) {
    if (error instanceof Error) {
      console.error(error.message);
    } else {
      throw error;
    }
  }
}
