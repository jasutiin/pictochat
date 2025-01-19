const myHeaders = new Headers();
myHeaders.append('Content-Type', 'application/json');

export async function decrementCount(roomLetter: string | string[]) {
  const url = 'http://localhost:8080/decrementCount';
  try {
    const response = await fetch(url, {
      method: 'POST',
      body: JSON.stringify({ chat: `room${roomLetter}` }),
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

export async function incrementCount(roomLetter: string | string[]) {
  const url = 'http://localhost:8080/incrementCount';
  try {
    const response = await fetch(url, {
      method: 'POST',
      body: JSON.stringify({ chat: `room${roomLetter}` }),
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

export async function getCount() {
  const url = 'http://localhost:8080/getCount';
  try {
    const response = await fetch(url);
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const json = await response.json();
    return json;
  } catch (error) {
    if (error instanceof Error) {
      console.error(error.message);
    } else {
      throw error;
    }
  }
}
